package com.dosmil_e.m3.core.impl;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class M3RelationshipImpl
  extends com.dosmil_e.m3.core.base.M3RelationshipBase 
  implements com.dosmil_e.m3.core.pub.M3RelationshipPub {

  public M3RelationshipImpl() {
    super();
  }


  public M3RelationshipImpl( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3RelationshipImpl( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }






/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300080007L;



/* Override START */

  protected transient java.util.Hashtable vGetMethods;

  public static final String sAggregatesRelationshipKind = new String( "Aggregates");




  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] getMMElements(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement)  throws EAIException {

    if( theCtxt == null)            { return null;}
    if( theMMElement == null)         { return null;}


    java.lang.reflect.Method aGetMethod = getGetMethod( theCtxt, theMMElement);
    if( aGetMethod == null)         { return null;}

    Object[] someMethodArguments = new Object[] { theCtxt};

    Object aResultObject = null;
    try {
      aResultObject = aGetMethod.invoke( theMMElement, someMethodArguments);
    }
    catch( IllegalAccessException       anEx){}
    catch( IllegalArgumentException     anEx){}
    catch( java.lang.reflect.InvocationTargetException    anEx){}
    catch( NullPointerException         anEx){}
    catch( ExceptionInInitializerError  anEx){}

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] aResult = null;
    if( isM3Many( theCtxt)) {
      try { aResult = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) aResultObject;} catch( ClassCastException anEx) {}
    }
    else {
      com.dosmil_e.modelbase.ifc.EAIMMElementIfc aResultElement = null;
      try { aResultElement = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc) aResultObject;} catch( ClassCastException anEx) {}
      if( aResultElement != null) {
        aResult = new com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] { aResultElement};
      }
    }

    return aResult;
  }


  public java.lang.reflect.Method getGetMethod(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement) {

    if( vGetMethods == null) {
      vGetMethods = new java.util.Hashtable( 3, (float) 0.5);
    }

    Class aClass = theMMElement.getClass();
    if( aClass == null) { return null;}

    java.lang.reflect.Method aMethod = null;
    Object aMethodObject = vGetMethods.get( aClass);
    if( aMethodObject != null) {

      try { aMethod = (java.lang.reflect.Method) aMethodObject;} catch( ClassCastException anEx) {}
      if( aMethod != null) { return aMethod;}
    }

    String anUpperName = getUpperName( theCtxt);
    if( anUpperName == null)  { return null;}

    String aMethodName = "get" + anUpperName + "TR";
    Class[] someMethodArgumentClasses = new Class[] { EAIMMCtxtIfc.class};

    try {
      aMethod = aClass.getMethod( aMethodName, someMethodArgumentClasses);
    }
    catch( NoSuchMethodException anEx) {}
    catch( SecurityException anEx) {}
    if( aMethod == null) { return null;}

    vGetMethods.put( aClass, aMethod);

    return aMethod;
  }


  public String getUpperName( EAIMMCtxtIfc theCtxt) {
    EAIMMNameIfc aName = null;
    try { aName = getName();} catch( EAIException anEx) {}
    if( aName == null)            { return null;}

    String aNameString = aName.getString();
    if( aNameString == null)      { return null;}
    if( aNameString.length() < 1)   { return null;}
    String anUpperName = aNameString.substring(0, 1).toUpperCase() +
      aNameString.substring(1, aNameString.length());

    return anUpperName;
  }




  public boolean isM3Many( EAIMMCtxtIfc theCtxt)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return false;}
    if( aTrxMgr.inTransaction()) {
      return isM3ManyPR( theCtxt);
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        boolean aResult = isM3ManyPR( theCtxt);
        anIsDone = true;
        return aResult;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
    return false;
  }



  private boolean isM3ManyPR( EAIMMCtxtIfc theCtxt) {
    if( theCtxt == null)            { return false;}

    String aMaxMult = null;
    try { aMaxMult =  getMaxMult( theCtxt);} catch( EAIException anEx) {};
    if( aMaxMult == null)           { return false;}
    if( aMaxMult.length() < 1)      { return false;}
    if( aMaxMult.equals("0") || aMaxMult.equals("1") || aMaxMult.equals("?")) { return false;}

    return true;
  }




  public boolean isAggregates( EAIMMCtxtIfc theCtxt)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return false;}
    if( aTrxMgr.inTransaction()) {
      return isAggregatesPR( theCtxt);
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        boolean aResult = isAggregatesPR( theCtxt);
        anIsDone = true;
        return aResult;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
    return false;
  }


  public boolean isAggregatesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    String aKind = getKind( theCtxt);
    return aKind != null && aKind.equals( sAggregatesRelationshipKind);
  }



  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] getRelatedElements(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return null;}
    if( aTrxMgr.inTransaction()) {
      return getRelatedElementsPR( theCtxt, theTargetMMElement);
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] aResult =
          getRelatedElementsPR( theCtxt, theTargetMMElement);
        anIsDone = true;
        return aResult;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
    return null;
  }



  private com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] getRelatedElementsPR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement)  throws EAIException {

    if( theCtxt == null)            { return null;}
    if( theMMElement == null)         { return null;}

    java.lang.reflect.Field aField = getField( theCtxt, theMMElement);
    if( aField == null) { return null;}

    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return null;}

    if( isM3Many( theCtxt)) {

      com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
      try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
      if( someRelatedElements == null) { return null;}

      int aRelatedElementsLength = someRelatedElements.length;

      com.dosmil_e.m3.core.ifc.M3RelationshipIfc anInverse = null;
      try { anInverse = getInverse( theCtxt);} catch( EAIException anEx) {}
      if( anInverse == null) { return null;}

      Class aRelatedTypeClass = null;
      try { aRelatedTypeClass = ((com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverse).getIfcClass( theCtxt);} catch( ClassCastException anEx) {}
      if( aRelatedTypeClass == null) { return null;}

      Object otherRelatedElementsObject =
        java.lang.reflect.Array.newInstance( aRelatedTypeClass, aRelatedElementsLength);

      com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] otherRelatedElements =  null;
      try { otherRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) otherRelatedElementsObject;} catch( ClassCastException anEx) {}

      if( aRelatedElementsLength > 0) {
        try { System.arraycopy( someRelatedElements, 0, otherRelatedElements, 0, aRelatedElementsLength); }
        catch( IndexOutOfBoundsException  anException) { return null;}
        catch( ArrayStoreException        anException) { return null;}
        catch( NullPointerException       anException) { return null;}
      }

      return otherRelatedElements;
    }

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRelatedElement = null;
    try { aRelatedElement = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc) someRelatedElementsObject;} catch( ClassCastException anEx) {}
    if( aRelatedElement == null) { return null;}

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] otherRelatedElements = new com.dosmil_e.modelbase.ifc.EAIMMElementIfc[ 1];
    otherRelatedElements[ 0] = aRelatedElement;
    return otherRelatedElements;
  }



  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc getRelatedElement(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return null;;}
    if( aTrxMgr.inTransaction()) {
      return getRelatedElementPR( theCtxt, theTargetMMElement);
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        com.dosmil_e.modelbase.ifc.EAIMMElementIfc aResult =
          getRelatedElementPR( theCtxt, theTargetMMElement);
        anIsDone = true;
        return aResult;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
    return null;
  }



  private com.dosmil_e.modelbase.ifc.EAIMMElementIfc getRelatedElementPR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement)  throws EAIException {

    if( theCtxt == null)            { return null;}
    if( theMMElement == null)         { return null;}

    java.lang.reflect.Field aField = getField( theCtxt, theMMElement);
    if( aField == null) { return null;}

    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return null;}

    if( isM3Many( theCtxt)) {

      com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
      try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
      if( someRelatedElements == null) { return null;}

      int aRelatedElementsLength = someRelatedElements.length;
      if( aRelatedElementsLength < 1) { return null;}

      com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRelatedElement =  someRelatedElements[ 0];
      return aRelatedElement;
    }

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRelatedElement = null;
    try { aRelatedElement = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc) someRelatedElementsObject;} catch( ClassCastException anEx) {}
    return aRelatedElement;
  }




  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] getRelatedElementsPrivileged(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement)  throws EAIException {

    if( theCtxt == null)            { return null;}
    if( theMMElement == null)         { return null;}

    java.lang.reflect.Field aField = getField( theCtxt, theMMElement);
    if( aField == null) { return null;}

    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return null;}

    if( isM3Many( theCtxt)) {
      com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
      try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
      return someRelatedElements;
    }

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRelatedElement = null;
    try { aRelatedElement = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc) someRelatedElementsObject;} catch( ClassCastException anEx) {}
    if( aRelatedElement == null) { return null;}

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] otherRelatedElements = new com.dosmil_e.modelbase.ifc.EAIMMElementIfc[ 1];
    otherRelatedElements[ 0] = aRelatedElement;
    return otherRelatedElements;
  }





  public Class getFieldClass( EAIMMCtxtIfc theCtxt) {
    Class aClass = getPrivClass( theCtxt);
    if( aClass != null) { return aClass;}

    aClass = getIfcClass( theCtxt);
    return aClass;
  }


  public Class getIfcClass( EAIMMCtxtIfc theCtxt) {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = null;
    try { aType = getType( theCtxt);} catch( EAIException anEx) {}
    if( aType == null) { return null;}

    return ((com.dosmil_e.m3.core.pub.M3TypePub) aType).getIfcClass( theCtxt);
  }

  public Class getPrivClass( EAIMMCtxtIfc theCtxt) {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = null;
    try { aType = getType( theCtxt);} catch( EAIException anEx) {}
    if( aType == null) { return null;}

    return ((com.dosmil_e.m3.core.pub.M3TypePub) aType).getPrivClass( theCtxt);
  }


  protected transient java.util.Hashtable vFields;

  public java.lang.reflect.Field getField(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement) throws EAIException {

    if( theCtxt == null)              { return null;}
    if( theMMElement == null)         { return null;}

    if( vFields == null) {
      vFields = new java.util.Hashtable( 3, (float) 0.5);
    }

    Class aClass = theMMElement.getClass();
    if( aClass == null) { return null;}


    Object aFieldObject = vFields.get( aClass);
    if( aFieldObject != null) {
      java.lang.reflect.Field aField = null;
      try { aField = (java.lang.reflect.Field) aFieldObject;} catch( ClassCastException anEx) {}
      if( aField != null) { return aField;}
    }

    String aFieldName = getFieldName( theCtxt);
    if( aFieldName == null) { return null;}

    Class aFieldOwnerClass = aClass;
    while( aFieldOwnerClass != null) {
      java.lang.reflect.Field[] someFields = null;
      try { someFields = aFieldOwnerClass.getDeclaredFields();} catch( SecurityException anException) {}
      if( someFields == null) { return null;}

      int aNumFields = someFields.length;
      for( int anIndex = 0; anIndex < aNumFields; anIndex++) {
        java.lang.reflect.Field otherField = someFields[ anIndex];
        if( otherField != null) {
          String otherFieldName = otherField.getName();
          if( aFieldName.equals( otherFieldName)) {
            vFields.put( aClass, otherField);
            return otherField;
          }
        }
      }
      if( aClass.equals( Object.class)) { return null;}
      aFieldOwnerClass = aFieldOwnerClass.getSuperclass();
    }

    return null;
  }



  public String getFieldName( EAIMMCtxtIfc theCtxt) {
    return "vr" + getUpperName( theCtxt);
  }


  public void addRelatedElement(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theAddedMMElement)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addRelatedElementPR( theCtxt, theTargetMMElement, theAddedMMElement);
      return;
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addRelatedElementPR( theCtxt, theTargetMMElement, theAddedMMElement);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



  private void addRelatedElementPR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theAddedMMElement)  throws EAIException {

    if( theCtxt == null)                  { return;}
    if( theTargetMMElement == null)       { return;}
    if( theAddedMMElement == null)        { return;}

    if( !isM3Many( theCtxt))              { return;}

    com.dosmil_e.modelbase.priv.EAIMMElementPriv aTargetMMElement = null;
    try { aTargetMMElement = (com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement; } catch( ClassCastException anEx) {}
    if( aTargetMMElement == null) { return;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return;}


      // Get current value
    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return;}

      // Current value as array of model elements
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
    try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
    if( someRelatedElements == null) { return;}

      // Check for added ModelElement already in collection
    int aRelatedElementsLength = someRelatedElements.length;
    for( int anIndex = 0 ; anIndex < aRelatedElementsLength ; anIndex++) {
      boolean anAreSame = false;
      try { anAreSame = theAddedMMElement.sameAs( theCtxt, someRelatedElements[ anIndex]);} catch( EAIException anEx) {}
      if( anAreSame) { return;}
    }


      // Get the inverse meta relationship
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc anInverseIfc = null;
    try { anInverseIfc = getInverse( theCtxt);} catch( EAIException anEx) {}
    if( anInverseIfc == null) { return;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub anInverse = null;
    try { anInverse = (com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverseIfc;} catch( ClassCastException anEx) {}
    if( anInverse == null) { return;}

      // Link reverse ref to this object
    anInverse.addRelatedElementPrivileged( theCtxt, theAddedMMElement, theTargetMMElement);

      // Related element field class for new array
    Class aRelatedTypeClass = null;
    try { aRelatedTypeClass = ((com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverse).getFieldClass( theCtxt);} catch( ClassCastException anEx) {}
    if( aRelatedTypeClass == null) { return;}

      // Grow collection and add new element
    Object otherRelatedElementsObject = java.lang.reflect.Array.newInstance( aRelatedTypeClass, aRelatedElementsLength + 1);
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] otherRelatedElements =  null;
    try { otherRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) otherRelatedElementsObject;} catch( ClassCastException anEx) {}

    try { System.arraycopy( someRelatedElements, 0, otherRelatedElements, 0, aRelatedElementsLength); }
    catch( IndexOutOfBoundsException  anException) { return;}
    catch( ArrayStoreException        anException) { return;}
    catch( NullPointerException       anException) { return;}
    otherRelatedElements[ aRelatedElementsLength] = theAddedMMElement;

      // Write new collection value into holder field
    aTargetMMElement.setFieldToNonPrimitiveValue( theCtxt, otherRelatedElements, aField);

      // Generate and post the change event notification
    try { theCtxt.getFlatTrxMgr().change( aTargetMMElement, getUpperName( theCtxt), someRelatedElements, otherRelatedElements, aField.getName());} catch( EAIException anEx) {}

  }




  public void addRelatedElementPrivileged(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theAddedMMElement)  throws EAIException {

    if( theCtxt == null)                  { return;}
    if( theTargetMMElement == null)       { return;}
    if( theAddedMMElement == null)        { return;}

    if( !isM3Many( theCtxt)) {
      unsetAndSetRelatedElementPrivileged( theCtxt, theTargetMMElement, theAddedMMElement);
      return;
    }

    com.dosmil_e.modelbase.priv.EAIMMElementPriv aTargetMMElement = null;
    try { aTargetMMElement = (com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement; } catch( ClassCastException anEx) {}
    if( aTargetMMElement == null) { return;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return;}


      // Get current value
    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return;}

      // Current value as array of model elements
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
    try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
    if( someRelatedElements == null) { return;}

      // Check for added ModelElement already in collection
    int aRelatedElementsLength = someRelatedElements.length;
    for( int anIndex = 0 ; anIndex < aRelatedElementsLength ; anIndex++) {
      boolean anAreSame = false;
      try { anAreSame = theAddedMMElement.sameAs( theCtxt, someRelatedElements[ anIndex]);} catch( EAIException anEx) {}
      if( anAreSame) { return;}
    }


      // Get the inverse meta relationship
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc anInverseIfc = null;
    try { anInverseIfc = getInverse( theCtxt);} catch( EAIException anEx) {}
    if( anInverseIfc == null) { return;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub anInverse = null;
    try { anInverse = (com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverseIfc;} catch( ClassCastException anEx) {}
    if( anInverse == null) { return;}

      // Related element field class for new array
    Class aRelatedTypeClass = null;
    try { aRelatedTypeClass = ((com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverse).getFieldClass( theCtxt);} catch( ClassCastException anEx) {}
    if( aRelatedTypeClass == null) { return;}

      // Grow collection and add new element
    Object otherRelatedElementsObject = java.lang.reflect.Array.newInstance( aRelatedTypeClass, aRelatedElementsLength + 1);
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] otherRelatedElements =  null;
    try { otherRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) otherRelatedElementsObject;} catch( ClassCastException anEx) {}

    try { System.arraycopy( someRelatedElements, 0, otherRelatedElements, 0, aRelatedElementsLength); }
    catch( IndexOutOfBoundsException  anException) { return;}
    catch( ArrayStoreException        anException) { return;}
    catch( NullPointerException       anException) { return;}
    otherRelatedElements[ aRelatedElementsLength] = theAddedMMElement;

      // Write new collection value into holder field
    aTargetMMElement.setFieldToNonPrimitiveValue( theCtxt, otherRelatedElements, aField);

      // Generate and post the change event notification
    try { theCtxt.getFlatTrxMgr().change( aTargetMMElement, getUpperName( theCtxt), someRelatedElements, otherRelatedElements, aField.getName());} catch( EAIException anEx) {}
  }






    /* Public Write accessor for related model element
     */
  public void setRelatedElement(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theSetMMElement)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setRelatedElementPR( theCtxt, theTargetMMElement, theSetMMElement);
      return;
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setRelatedElementPR( theCtxt, theTargetMMElement, theSetMMElement);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }




    /* Public Write accessor for related model element
     */
  private void setRelatedElementPR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theSetMMElement)  throws EAIException {

    if( theCtxt == null)                  { return;}
    if( theTargetMMElement == null)       { return;}

    if( isM3Many( theCtxt))              { return;}

    com.dosmil_e.modelbase.priv.EAIMMElementPriv aTargetMMElement = null;
    try { aTargetMMElement = (com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement; } catch( ClassCastException anEx) {}
    if( aTargetMMElement == null) { return;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return;}


          // Get the inverse meta relationship
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc anInverseIfc = null;
    try { anInverseIfc = getInverse( theCtxt);} catch( EAIException anEx) {}
    if( anInverseIfc == null) { return;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub anInverse = null;
    try { anInverse = (com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverseIfc;} catch( ClassCastException anEx) {}
    if( anInverse == null) { return;}


      // Get current value
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRelatedElement = null;
    Object aRelatedElementObject = null;
    try {
      aRelatedElementObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}


    if( aRelatedElementObject != null) {
      try { aRelatedElement = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc) aRelatedElementObject;} catch( ClassCastException anEx) {}
      if( aRelatedElement != null) {
        boolean anAreSame = false;
        try { anAreSame = aRelatedElement.sameAs(  theCtxt, theSetMMElement);} catch( EAIException anEx) {}
        if( anAreSame) { return;}

          // Unlink previously linked model element
        anInverse.removeRelatedElementPrivileged( theCtxt, aRelatedElement, aTargetMMElement);
      }
    }

    if( aRelatedElementObject == null && theSetMMElement == null) { return;}

    if( theSetMMElement != null) {
      anInverse.addRelatedElementPrivileged( theCtxt, theSetMMElement, aTargetMMElement);
    }
      // Write new value into holder field
    aTargetMMElement.setFieldToNonPrimitiveValue( theCtxt, theSetMMElement, aField);

      // Generate and post the change event notification
    try { theCtxt.getFlatTrxMgr().change( aTargetMMElement, getUpperName( theCtxt), aRelatedElement, theSetMMElement, aField.getName());} catch( EAIException anEx) {}
  }





    /* Unset currently related model element and
     * Set reference to new related model element
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetRelatedElementPrivileged(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theSetMMElement)  throws EAIException {

    if( theCtxt == null)                   { return;}

    if( isM3Many( theCtxt))  {
      addRelatedElementPrivileged( theCtxt, theTargetMMElement, theSetMMElement);
      return;
    }

    if( theSetMMElement == null)         { return;}
    if( theTargetMMElement == null)        { return;}


    com.dosmil_e.modelbase.priv.EAIMMElementPriv aTargetMMElement = null;
    try { aTargetMMElement = (com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement; } catch( ClassCastException anEx) {}
    if( aTargetMMElement == null) { return;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return;}


          // Get the inverse meta relationship
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc anInverseIfc = null;
    try { anInverseIfc = getInverse( theCtxt);} catch( EAIException anEx) {}
    if( anInverseIfc == null) { return;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub anInverse = null;
    try { anInverse = (com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverseIfc;} catch( ClassCastException anEx) {}
    if( anInverse == null) { return;}

      // Get current value
    Object aRelatedElementObject = null;
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRelatedElement = null;
    try {
      aRelatedElementObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( aRelatedElementObject != null) {
      try { aRelatedElement = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc) aRelatedElementObject;} catch( ClassCastException anEx) {}
      if( aRelatedElement != null) {
          // Unlink previously linked model element
        anInverse.removeRelatedElementPrivileged( theCtxt, aRelatedElement, aTargetMMElement);
      }
    }

      // Write new value into holder field
    aTargetMMElement.setFieldToNonPrimitiveValue( theCtxt, theSetMMElement, aField);

      // Generate and post the change event notification
    try { theCtxt.getFlatTrxMgr().change( aTargetMMElement, getUpperName( theCtxt), aRelatedElement, theSetMMElement, aField.getName());} catch( EAIException anEx) {}
  }





  public void removeRelatedElementPrivileged(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theRemovedMMElement)  throws EAIException {

    if( theCtxt == null)                   { return;}

    if( theTargetMMElement == null)         { return;}

    if( !isM3Many( theCtxt))   {
      unsetRelatedElementPrivileged( theCtxt, theTargetMMElement);
      return;
    }

    if( theRemovedMMElement == null)       { return;}


    com.dosmil_e.modelbase.priv.EAIMMElementPriv aTargetMMElement = null;
    try { aTargetMMElement = (com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement; } catch( ClassCastException anEx) {}
    if( aTargetMMElement == null) { return;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return;}


      // Get current value
    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return;}

      // Current value as array of model elements
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
    try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
    if( someRelatedElements == null) { return;}

      // Lookup location of element to delete
    int aRelatedElementsLength = someRelatedElements.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aRelatedElementsLength ; anIndex++) {
      boolean anAreSame = false;
      try { anAreSame = theRemovedMMElement.sameAs( theCtxt, someRelatedElements[ anIndex]);} catch( EAIException anEx) {}
      if( anAreSame) {
        aFoundIndex = anIndex;
        break;
      }
    }
    if( aFoundIndex < 0) { return;}



      // Get the inverse meta relationship
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc anInverseIfc = null;
    try { anInverseIfc = getInverse( theCtxt);} catch( EAIException anEx) {}
    if( anInverseIfc == null) { return;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub anInverse = null;
    try { anInverse = (com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverseIfc;} catch( ClassCastException anEx) {}
    if( anInverse == null) { return;}

      // Related element field class for new array
    Class aRelatedTypeClass = null;
    try { aRelatedTypeClass = ((com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverse).getFieldClass( theCtxt);} catch( ClassCastException anEx) {}
    if( aRelatedTypeClass == null) { return;}

      // Shrink collection removing PrimitiveTypes element
    Object otherRelatedElementsObject = java.lang.reflect.Array.newInstance( aRelatedTypeClass, aRelatedElementsLength - 1);
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] otherRelatedElements =  null;
    try { otherRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) otherRelatedElementsObject;} catch( ClassCastException anEx) {}

    if( aRelatedElementsLength > 1) {
      try {
        System.arraycopy( someRelatedElements, 0, otherRelatedElements, 0, aFoundIndex);
        System.arraycopy( someRelatedElements, aFoundIndex + 1, otherRelatedElements, aFoundIndex, aRelatedElementsLength - aFoundIndex - 1);
      }
      catch( IndexOutOfBoundsException  anException) { throw new RuntimeException("sht"); }
      catch( ArrayStoreException        anException) { throw new RuntimeException("sht"); }
      catch( NullPointerException       anException) { throw new RuntimeException("sht");  }
    }


      // Write new collection value into holder field
    aTargetMMElement.setFieldToNonPrimitiveValue( theCtxt, otherRelatedElements, aField);

      // Generate and post the change event notification
    try { theCtxt.getFlatTrxMgr().change( aTargetMMElement, getUpperName( theCtxt), someRelatedElements, otherRelatedElements, aField.getName());} catch( EAIException anEx) {}
  }




  public void moveRelatedElementBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theToMoveMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theRelativeToMMElement) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveRelatedElementBeforePR( theCtxt, theTargetMMElement, theToMoveMMElement, theRelativeToMMElement);
      return;
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveRelatedElementBeforePR( theCtxt, theTargetMMElement, theToMoveMMElement, theRelativeToMMElement);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }


  private void moveRelatedElementBeforePR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theToMoveMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theRelativeToMMElement) throws EAIException {

    if( theCtxt == null)                  { return;}

    if( theTargetMMElement == null)       { return;}
    if( theToMoveMMElement == null)       { return;}

    if( !isM3Many( theCtxt))              { return;}

    if( theRelativeToMMElement == null) {
      moveRelatedElementToLast( theCtxt, theTargetMMElement, theToMoveMMElement);
      return;
    }

    com.dosmil_e.modelbase.priv.EAIMMElementPriv aTargetMMElement = null;
    try { aTargetMMElement = (com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement; } catch( ClassCastException anEx) {}
    if( aTargetMMElement == null) { return;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return;}


      // Get current value
    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return;}

      // Current value as array of model elements
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
    try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
    if( someRelatedElements == null) { return;}


    int aRelatedElementsLength = someRelatedElements.length;
    if( aRelatedElementsLength < 2) { return;}

      // Look up position of element to move
    int aToMoveIndex = -1;
    for( int anIndex = 0 ; anIndex < aRelatedElementsLength ; anIndex++) {
      boolean anAreSame = false;
      try { anAreSame = theToMoveMMElement.sameAs( theCtxt, someRelatedElements[ anIndex]);} catch( EAIException anEx) {}
      if( anAreSame) {
        aToMoveIndex = anIndex;
        break;
      }
    }

    if( aToMoveIndex < 0) { return;}


     // Look up position of relative to element
    int aRelativeIndex = -1;
    for( int anIndex = 0 ; anIndex < aRelatedElementsLength ; anIndex++) {
      boolean anAreSame = false;
      try { anAreSame = theRelativeToMMElement.sameAs( theCtxt, someRelatedElements[ anIndex]);} catch( EAIException anEx) {}
      if( anAreSame) {
        aRelativeIndex = anIndex;
        break;
      }
    }

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveRelatedElementToLast( theCtxt, theTargetMMElement, theToMoveMMElement);
      return;
    }

      // ToMove and relative elements are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}


      // Get the inverse meta relationship
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc anInverseIfc = null;
    try { anInverseIfc = getInverse( theCtxt);} catch( EAIException anEx) {}
    if( anInverseIfc == null) { return;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub anInverse = null;
    try { anInverse = (com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverseIfc;} catch( ClassCastException anEx) {}
    if( anInverse == null) { return;}

      // Related element field class for new array
    Class aRelatedTypeClass = null;
    try { aRelatedTypeClass = ((com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverse).getFieldClass( theCtxt);} catch( ClassCastException anEx) {}
    if( aRelatedTypeClass == null) { return;}

      // Create new version of collection
    Object otherRelatedElementsObject = java.lang.reflect.Array.newInstance( aRelatedTypeClass, aRelatedElementsLength);
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] otherRelatedElements =  null;
    try { otherRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) otherRelatedElementsObject;} catch( ClassCastException anEx) {}

      // Copy reordered collection
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someRelatedElements, 0, otherRelatedElements, 0, aToMoveIndex );
        System.arraycopy( someRelatedElements, aToMoveIndex + 1, otherRelatedElements, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherRelatedElements[ aRelativeIndex - 1] = theToMoveMMElement;
        System.arraycopy( someRelatedElements, aRelativeIndex, otherRelatedElements, aRelativeIndex, aRelatedElementsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someRelatedElements, 0, otherRelatedElements, 0, aRelativeIndex );
        otherRelatedElements[ aRelativeIndex ] = theToMoveMMElement;
        System.arraycopy( someRelatedElements, aRelativeIndex, otherRelatedElements, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aRelatedElementsLength - 1) {
          System.arraycopy( someRelatedElements, aToMoveIndex + 1, otherRelatedElements, aToMoveIndex + 1, aRelatedElementsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { return;}
    catch( ArrayStoreException        anException) { return;}
    catch( NullPointerException       anException) { return;}

      // Write new collection value into holder field
    aTargetMMElement.setFieldToNonPrimitiveValue( theCtxt, otherRelatedElements, aField);

      // Generate and post the change event notification
    try { theCtxt.getFlatTrxMgr().change( aTargetMMElement, getUpperName( theCtxt), someRelatedElements, otherRelatedElements, aField.getName());} catch( EAIException anEx) {}
  }



  public void moveRelatedElementToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theToMoveMMElement) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveRelatedElementToLastPR( theCtxt, theTargetMMElement, theToMoveMMElement);
      return;
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveRelatedElementToLastPR( theCtxt, theTargetMMElement, theToMoveMMElement);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }


  private void moveRelatedElementToLastPR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theToMoveMMElement) throws EAIException {

    if( theCtxt == null)                  { return;}
    if( !isM3Many( theCtxt))              { return;}

    if( theTargetMMElement == null)       { return;}
    if( theToMoveMMElement == null)        { return;}

    com.dosmil_e.modelbase.priv.EAIMMElementPriv aTargetMMElement = null;
    try { aTargetMMElement = (com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement; } catch( ClassCastException anEx) {}
    if( aTargetMMElement == null) { return;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return;}


      // Get current value
    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return;}

      // Current value as array of model elements
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
    try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
    if( someRelatedElements == null) { return;}


    int aRelatedElementsLength = someRelatedElements.length;
    if( aRelatedElementsLength < 2) { return;}

      // Look up position of element to move
    int aToMoveIndex = -1;
    for( int anIndex = 0 ; anIndex < aRelatedElementsLength ; anIndex++) {
      boolean anAreSame = false;
      try { anAreSame = theToMoveMMElement.sameAs( theCtxt, someRelatedElements[ anIndex]);} catch( EAIException anEx) {}
      if( anAreSame) {
        aToMoveIndex = anIndex;
        break;
      }
    }

    if( aToMoveIndex < 0) { return;}

      // ToMove and relative elements are same : no move
    if( aToMoveIndex == (aRelatedElementsLength - 1)) { return;}


      // Get the inverse meta relationship
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc anInverseIfc = null;
    try { anInverseIfc = getInverse( theCtxt);} catch( EAIException anEx) {}
    if( anInverseIfc == null) { return;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub anInverse = null;
    try { anInverse = (com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverseIfc;} catch( ClassCastException anEx) {}
    if( anInverse == null) { return;}

      // Related element field class for new array
    Class aRelatedTypeClass = null;
    try { aRelatedTypeClass = ((com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverse).getFieldClass( theCtxt);} catch( ClassCastException anEx) {}
    if( aRelatedTypeClass == null) { return;}

      // Create new version of collection
    Object otherRelatedElementsObject = java.lang.reflect.Array.newInstance( aRelatedTypeClass, aRelatedElementsLength);

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] otherRelatedElements =  null;
    try { otherRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) otherRelatedElementsObject;} catch( ClassCastException anEx) {}

      // Copy reordered collection
    try {
      System.arraycopy( someRelatedElements, 0, otherRelatedElements, 0, aToMoveIndex );
      System.arraycopy( someRelatedElements, aToMoveIndex + 1, otherRelatedElements, aToMoveIndex, aRelatedElementsLength - aToMoveIndex - 1);
      otherRelatedElements[ aRelatedElementsLength - 1] = theToMoveMMElement;
    }
    catch( IndexOutOfBoundsException  anException) { return;}
    catch( ArrayStoreException        anException) { return;}
    catch( NullPointerException       anException) { return;}

      // Write new collection value into holder field
    aTargetMMElement.setFieldToNonPrimitiveValue( theCtxt, otherRelatedElements, aField);

      // Generate and post the change event notification
    try { theCtxt.getFlatTrxMgr().change( aTargetMMElement, getUpperName( theCtxt), someRelatedElements, otherRelatedElements, aField.getName());} catch( EAIException anEx) {}
  }




  public void addRelatedElementBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theAddedMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theRelativeToMMElement)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addRelatedElementBeforePR( theCtxt, theTargetMMElement, theAddedMMElement, theRelativeToMMElement);
      return;
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addRelatedElementBeforePR( theCtxt, theTargetMMElement, theAddedMMElement, theRelativeToMMElement);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }


  private void addRelatedElementBeforePR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theAddedMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theRelativeToMMElement)  throws EAIException {

    if( theCtxt == null)                  { return;}

    if( theTargetMMElement == null)       { return;}
    if( theAddedMMElement == null)        { return;}

    if( !isM3Many( theCtxt))              { return;}

    if( theRelativeToMMElement == null) {
      addRelatedElement( theCtxt, theTargetMMElement, theAddedMMElement);
      return;
    }


    com.dosmil_e.modelbase.priv.EAIMMElementPriv aTargetMMElement = null;
    try { aTargetMMElement = (com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement; } catch( ClassCastException anEx) {}
    if( aTargetMMElement == null) { return;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return;}


      // Get current value
    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return;}

      // Current value as array of model elements
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
    try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
    if( someRelatedElements == null) { return;}

      // Check for added ModelElement already in collection
    int aRelatedElementsLength = someRelatedElements.length;

    if( aRelatedElementsLength < 1) {
      addRelatedElement( theCtxt, theTargetMMElement, theAddedMMElement);
      return;
    }

      // Check for added ModelElement already in collection
    for( int anIndex = 0 ; anIndex < aRelatedElementsLength ; anIndex++) {
      boolean anAreSame = false;
      try { anAreSame = theAddedMMElement.sameAs( theCtxt, someRelatedElements[ anIndex]);} catch( EAIException anEx) {}
      if( anAreSame) {
        moveRelatedElementBefore( theCtxt, theTargetMMElement, theAddedMMElement, theRelativeToMMElement);
        return;
      }
    }


     // Look up position of relative to element
    int aRelativeIndex = -1;
    for( int anIndex = 0 ; anIndex < aRelatedElementsLength ; anIndex++) {
      boolean anAreSame = false;
      try { anAreSame = theRelativeToMMElement.sameAs( theCtxt, someRelatedElements[ anIndex]);} catch( EAIException anEx) {}
      if( anAreSame) {
        aRelativeIndex = anIndex;
        break;
      }
    }

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      addRelatedElement( theCtxt, theTargetMMElement, theAddedMMElement);
      return;
    }


      // Get the inverse meta relationship
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc anInverseIfc = null;
    try { anInverseIfc = getInverse( theCtxt);} catch( EAIException anEx) {}
    if( anInverseIfc == null) { return;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub anInverse = null;
    try { anInverse = (com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverseIfc;} catch( ClassCastException anEx) {}
    if( anInverse == null) { return;}

      // Link reverse ref to this object
    anInverse.addRelatedElementPrivileged( theCtxt, theAddedMMElement, theTargetMMElement);

      // Related element field class for new array
    Class aRelatedTypeClass = null;
    try { aRelatedTypeClass = ((com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverse).getFieldClass( theCtxt);} catch( ClassCastException anEx) {}
    if( aRelatedTypeClass == null) { return;}

      // Grow collection and add new element
    Object otherRelatedElementsObject = java.lang.reflect.Array.newInstance( aRelatedTypeClass, aRelatedElementsLength + 1);
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] otherRelatedElements =  null;
    try { otherRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) otherRelatedElementsObject;} catch( ClassCastException anEx) {}

    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someRelatedElements, 0, otherRelatedElements, 0, aRelativeIndex );
      }
      System.arraycopy( someRelatedElements, aRelativeIndex, otherRelatedElements, aRelativeIndex + 1, aRelatedElementsLength - aRelativeIndex);
      otherRelatedElements[ aRelativeIndex] = theAddedMMElement;
    }
    catch( IndexOutOfBoundsException  anException) { return;}
    catch( ArrayStoreException        anException) { return;}
    catch( NullPointerException       anException) { return;}

      // Write new collection value into holder field
    aTargetMMElement.setFieldToNonPrimitiveValue( theCtxt, otherRelatedElements, aField);

      // Generate and post the change event notification
    try { theCtxt.getFlatTrxMgr().change( aTargetMMElement, getUpperName( theCtxt), someRelatedElements, otherRelatedElements, aField.getName());} catch( EAIException anEx) {}

  }



    /* Public related element finder by name
     */
  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc findRelatedElementNamed(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    EAIMMNameIfc                                        theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return null;}
    if( aTrxMgr.inTransaction()) {
      return findRelatedElementNamedPR( theCtxt, theTargetMMElement, theMMName);
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        com.dosmil_e.modelbase.ifc.EAIMMElementIfc aResult =
          findRelatedElementNamedPR( theCtxt, theTargetMMElement, theMMName);
        anIsDone = true;
        return aResult;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
    return null;
  }



    /* Public related element finder by name
     */
  private com.dosmil_e.modelbase.ifc.EAIMMElementIfc findRelatedElementNamedPR(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    EAIMMNameIfc                                        theMMName) throws EAIException {

    if( theCtxt == null)                  { return null;}
    if( theTargetMMElement == null)       { return null;}
    if( theMMName == null)                { return null;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return null;}


      // Get current value
    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return null;}


    if( isM3Many( theCtxt))  {

        // Current value as array of model elements
      com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
      try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
      if( someRelatedElements == null) { return null;}

        // Get collection length
      int aRelatedElementsLength = someRelatedElements.length;
      if( aRelatedElementsLength < 1) { return null;}

        // Find ModelElement in collection with same name
      for( int anIndex = 0 ; anIndex < aRelatedElementsLength ; anIndex++) {
        com.dosmil_e.modelbase.ifc.EAIMMElementIfc anElement = someRelatedElements[ anIndex];
        if( anElement != null) {
          boolean anAreSame = false;
          try { anAreSame = anElement.sameNameAs( theCtxt, theMMName);} catch( EAIException anEx) {}
          if( anAreSame) {
            return anElement;
          }
        }
      }
    }
    else {
        // Current value as single object
      com.dosmil_e.modelbase.ifc.EAIMMElementIfc anElement = null;
      try { anElement = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc) someRelatedElementsObject;} catch( ClassCastException anEx) {}
      if( anElement != null) {
        boolean anAreSame = false;
        try { anAreSame = anElement.sameNameAs( theCtxt, theMMName);} catch( EAIException anEx) {}
        if( anAreSame) {
          return anElement;
        }
      }
    }
    return null;
  }


    /* Public related element finder predicate by name
     */
  public boolean hasRelatedElementNamed(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    EAIMMNameIfc                                        theMMName) throws EAIException {

    return findRelatedElementNamed( theCtxt, theTargetMMElement, theMMName) != null;
  }






    /* Public related element index finder by name
     */
  public int indexOfRelatedElementNamed(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    EAIMMNameIfc                                        theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return -1;}
    if( aTrxMgr.inTransaction()) {
      return indexOfRelatedElementNamedPR( theCtxt, theTargetMMElement, theMMName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        int aResult = indexOfRelatedElementNamedPR( theCtxt, theTargetMMElement, theMMName);
        anIsDone = true;
        return aResult;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
    return -1;
  }



    /* Public related element index finder by name
     */
  private int indexOfRelatedElementNamedPR(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    EAIMMNameIfc                                        theMMName) throws EAIException {

    if( theCtxt == null)                  { return -1;}
    if( theTargetMMElement == null)       { return -1;}
    if( theMMName == null)                { return -1;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return -1;}


      // Get current value
    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return -1;}


    if( isM3Many( theCtxt))  {

        // Current value as array of model elements
      com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
      try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
      if( someRelatedElements == null) { return -1;}

        // Get collection length
      int aRelatedElementsLength = someRelatedElements.length;
      if( aRelatedElementsLength < 1) { return -1;}

        // Find ModelElement in collection with same name
      for( int anIndex = 0 ; anIndex < aRelatedElementsLength ; anIndex++) {
        com.dosmil_e.modelbase.ifc.EAIMMElementIfc anElement = someRelatedElements[ anIndex];
        if( anElement != null) {
          boolean anAreSame = false;
          try { anAreSame = anElement.sameNameAs( theCtxt, theMMName);} catch( EAIException anEx) {}
          if( anAreSame) {
            return anIndex;
          }
        }
      }
    }
    else {
        // Current value as single object
      com.dosmil_e.modelbase.ifc.EAIMMElementIfc anElement = null;
      try { anElement = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc) someRelatedElementsObject;} catch( ClassCastException anEx) {}
      if( anElement != null) {
        boolean anAreSame = false;
        try { anAreSame = anElement.sameNameAs( theCtxt, theMMName);} catch( EAIException anEx) {}
        if( anAreSame) {
          return 0;
        }
      }
    }
    return -1;
  }



    /* Public Related element finder by name
     */
  public int indexOfRelatedElement(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theRelatedMMElement) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return  -1;}
    if( aTrxMgr.inTransaction()) {
      return indexOfRelatedElementPR( theCtxt, theTargetMMElement, theRelatedMMElement);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        int aResult = indexOfRelatedElementPR( theCtxt, theTargetMMElement, theRelatedMMElement);
        anIsDone = true;
        return aResult;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
    return -1;
  }



    /* Public Related elements finder by name
     */
  private int indexOfRelatedElementPR(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theRelatedMMElement) throws EAIException {

    if( theCtxt == null)                  { return -1;}
    if( theTargetMMElement == null)       { return -1;}
    if( theRelatedMMElement == null)      { return -1;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return -1;}


      // Get current value
    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return -1;}


    if( isM3Many( theCtxt))  {

        // Current value as array of model elements
      com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
      try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
      if( someRelatedElements == null) { return -1;}

        // Get collection length
      int aRelatedElementsLength = someRelatedElements.length;
      if( aRelatedElementsLength < 1) { return -1;}

        // Find ModelElement in collection with same name
      for( int anIndex = 0 ; anIndex < aRelatedElementsLength ; anIndex++) {
        com.dosmil_e.modelbase.ifc.EAIMMElementIfc anElement = someRelatedElements[ anIndex];
        if( anElement != null) {
          boolean anAreSame = false;
          try { anAreSame = anElement.sameAs( theCtxt, theRelatedMMElement);} catch( EAIException anEx) {}
          if( anAreSame) {
            return anIndex;
          }
        }
      }
    }
    else {
        // Current value as single object
      com.dosmil_e.modelbase.ifc.EAIMMElementIfc anElement = null;
      try { anElement = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc) someRelatedElementsObject;} catch( ClassCastException anEx) {}
      if( anElement != null) {
        boolean anAreSame = false;
        try { anAreSame = anElement.sameAs( theCtxt, theRelatedMMElement);} catch( EAIException anEx) {}
        if( anAreSame) {
          return 0;
        }
      }
    }
    return -1;
  }



    /* Public related element is related predicate
     */
  public boolean hasRelatedElement(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theRelatedMMElement) throws EAIException {

    return indexOfRelatedElement( theCtxt, theTargetMMElement, theRelatedMMElement) >= 0;
  }





    /* Public Write accessor for Related elements
     */
  public void removeRelatedElement(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theRelatedMMElement)  throws EAIException {


    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeRelatedElementPR( theCtxt, theTargetMMElement, theRelatedMMElement);
      return;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeRelatedElementPR( theCtxt, theTargetMMElement, theRelatedMMElement);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



    /* Public Write accessor for Related elements
     */
  private void removeRelatedElementPR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theRemovedMMElement)  throws EAIException {

    if( theCtxt == null)                   { return;}

    if( theTargetMMElement == null)        { return;}
    if( theRemovedMMElement == null)       { return;}

    if( !isM3Many( theCtxt))               { return;}

    com.dosmil_e.modelbase.priv.EAIMMElementPriv aTargetMMElement = null;
    try { aTargetMMElement = (com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement; } catch( ClassCastException anEx) {}
    if( aTargetMMElement == null) { return;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return;}


      // Get current value
    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return;}

      // Current value as array of model elements
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
    try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
    if( someRelatedElements == null) { return;}

      // Lookup location of element to delete
    int aRelatedElementsLength = someRelatedElements.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aRelatedElementsLength ; anIndex++) {
      boolean anAreSame = false;
      try { anAreSame = theRemovedMMElement.sameAs( theCtxt, someRelatedElements[ anIndex]);} catch( EAIException anEx) {}
      if( anAreSame) {
        aFoundIndex = anIndex;
        break;
      }
    }
    if( aFoundIndex < 0) { return;}



      // Get the inverse meta relationship
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc anInverseIfc = null;
    try { anInverseIfc = getInverse( theCtxt);} catch( EAIException anEx) {}
    if( anInverseIfc == null) { return;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub anInverse = null;
    try { anInverse = (com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverseIfc;} catch( ClassCastException anEx) {}
    if( anInverse == null) { return;}

     // Unlink reverse ref to this object
    anInverse.removeRelatedElementPrivileged( theCtxt, theRemovedMMElement, theTargetMMElement);

      // Related element field class for new array
    Class aRelatedTypeClass = null;
    try { aRelatedTypeClass = ((com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverse).getFieldClass( theCtxt);} catch( ClassCastException anEx) {}
    if( aRelatedTypeClass == null) { return;}

      // Shrink collection removing PrimitiveTypes element
    Object otherRelatedElementsObject = java.lang.reflect.Array.newInstance( aRelatedTypeClass, aRelatedElementsLength - 1);
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] otherRelatedElements =  null;
    try { otherRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) otherRelatedElementsObject;} catch( ClassCastException anEx) {}

    if( aRelatedElementsLength > 1) {
      try {
        System.arraycopy( someRelatedElements, 0, otherRelatedElements, 0, aFoundIndex);
        System.arraycopy( someRelatedElements, aFoundIndex + 1, otherRelatedElements, aFoundIndex, aRelatedElementsLength - aFoundIndex - 1);
      }
      catch( IndexOutOfBoundsException  anException) { throw new RuntimeException("sht"); }
      catch( ArrayStoreException        anException) { throw new RuntimeException("sht"); }
      catch( NullPointerException       anException) { throw new RuntimeException("sht");  }
    }


      // Write new collection value into holder field
    aTargetMMElement.setFieldToNonPrimitiveValue( theCtxt, otherRelatedElements, aField);

      // Generate and post the change event notification
    try { theCtxt.getFlatTrxMgr().change( aTargetMMElement, getUpperName( theCtxt), someRelatedElements, otherRelatedElements, aField.getName());} catch( EAIException anEx) {}
  }



    /* Unset currently related model element and
     * Used by relationship maintenance machinery
     */
  public void unsetRelatedElementPrivileged(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException {

    if( theCtxt == null)                   { return;}

    if( isM3Many( theCtxt))              { return;}

    if( theTargetMMElement == null)         { return;}


    com.dosmil_e.modelbase.priv.EAIMMElementPriv aTargetMMElement = null;
    try { aTargetMMElement = (com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement; } catch( ClassCastException anEx) {}
    if( aTargetMMElement == null) { return;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return;}


          // Get the inverse meta relationship
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc anInverseIfc = null;
    try { anInverseIfc = getInverse( theCtxt);} catch( EAIException anEx) {}
    if( anInverseIfc == null) { return;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub anInverse = null;
    try { anInverse = (com.dosmil_e.m3.core.pub.M3RelationshipPub) anInverseIfc;} catch( ClassCastException anEx) {}
    if( anInverse == null) { return;}

      // Get current value
    Object aRelatedElementObject = null;
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRelatedElement = null;
    try {
      aRelatedElementObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    try { aRelatedElement = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc) aRelatedElementObject;} catch( ClassCastException anEx) {}

      // Write new value into holder field
    aTargetMMElement.setFieldToNonPrimitiveValue( theCtxt, null, aField);

      // Generate and post the change event notification
    try { theCtxt.getFlatTrxMgr().change( aTargetMMElement, getUpperName( theCtxt), aRelatedElement, null, aField.getName());} catch( EAIException anEx) {}
  }




    /* Public Related elements number access
     */
  public int numRelatedElements(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return 0;}
    if( aTrxMgr.inTransaction()) {
      return numRelatedElementsPR( theCtxt, theTargetMMElement);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        int aResult = numRelatedElementsPR( theCtxt, theTargetMMElement);
        anIsDone = true;
        return aResult;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
    return 0;
  }

    /* Public Related elements number access
     */
  private int numRelatedElementsPR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException {

    if( theCtxt == null)                  { return 0;}
    if( theTargetMMElement == null)       { return 0;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return 0;}


      // Get current value
    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return 0;}


    if( isM3Many( theCtxt))  {

        // Current value as array of model elements
      com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
      try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
      if( someRelatedElements == null) { return 0;}

        // Get collection length
      int aRelatedElementsLength = someRelatedElements.length;
      return aRelatedElementsLength;
    }
    else {
        // Current value as single object
      com.dosmil_e.modelbase.ifc.EAIMMElementIfc anElement = null;
      try { anElement = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc) someRelatedElementsObject;} catch( ClassCastException anEx) {}
      if( anElement != null) {
        return 1;
      }
      else {
        return 0;
      }
    }
  }




  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc getRelatedElementAt(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    int theIndex)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return null;;}
    if( aTrxMgr.inTransaction()) {
      return getRelatedElementAtPR( theCtxt, theTargetMMElement, theIndex);
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        com.dosmil_e.modelbase.ifc.EAIMMElementIfc aResult =
          getRelatedElementAtPR( theCtxt, theTargetMMElement, theIndex);
        anIsDone = true;
        return aResult;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
    return null;
  }





    /* Public Related element read accessor by index
     */
  private com.dosmil_e.modelbase.ifc.EAIMMElementIfc getRelatedElementAtPR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement,
    int theIndex)  throws EAIException {

    if( theCtxt == null)            { return null;}
    if( theIndex < 0)               { return null;}
    if( theMMElement == null)       { return null;}

    java.lang.reflect.Field aField = getField( theCtxt, theMMElement);
    if( aField == null) { return null;}

    Object someRelatedElementsObject = null;
    try {
      someRelatedElementsObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( someRelatedElementsObject == null) { return null;}

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRelatedElement = null;

    if( isM3Many( theCtxt)) {

      com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = null;
      try { someRelatedElements = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]) someRelatedElementsObject;} catch( ClassCastException anEx) {}
      if( someRelatedElements == null) { return null;}

      int aRelatedElementsLength = someRelatedElements.length;

      if( theIndex >= aRelatedElementsLength) { return null;}

      aRelatedElement = someRelatedElements[ theIndex];
      return aRelatedElement;
    }

    if( theIndex > 0) { return null;}

    try { aRelatedElement = (com.dosmil_e.modelbase.ifc.EAIMMElementIfc) someRelatedElementsObject;} catch( ClassCastException anEx) {}
    return aRelatedElement;
  }






    /* Public remove all related elements
     */
  public void removeAllRelatedElements(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException {


    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeAllRelatedElementsPR( theCtxt, theTargetMMElement);
      return;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeAllRelatedElementsPR( theCtxt, theTargetMMElement);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



    /* Public Write accessor for Related element
     */
  private void removeAllRelatedElementsPR(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement)  throws EAIException {

    if( theCtxt == null)                   { return;}

    if( theTargetMMElement == null)        { return;}

    if( !isM3Many( theCtxt))               {
      setRelatedElementPR( theCtxt, theTargetMMElement, null);
      return;
    }

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = getRelatedElementsPR( theCtxt, theTargetMMElement);
    if( someRelatedElements != null) {
      int aNumRelatedElements = someRelatedElements.length;
      for( int anIndex = 0; anIndex < aNumRelatedElements; anIndex++) {
        com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRelatedElement = someRelatedElements[ anIndex];
        if( aRelatedElement != null) {
          removeRelatedElementPR( theCtxt, theTargetMMElement, aRelatedElement);
        }
      }
    }
  }




    /* Public recusive through aggregations remove all related elements
     */
  public void recursiveDeleteAllRelatedElements(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException {


    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      recursiveDeleteAllRelatedElementsPR( theCtxt, theTargetMMElement);
      return;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        recursiveDeleteAllRelatedElementsPR( theCtxt, theTargetMMElement);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



    /* Public Write accessor for Related element
     */
  private void recursiveDeleteAllRelatedElementsPR(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement)  throws EAIException {

    if( theCtxt == null)                   { return;}

    if( theTargetMMElement == null)        { return;}

    if( !isM3Many( theCtxt)) {

      if( isAggregates( theCtxt)) {
        com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRelatedElement =
          getRelatedElementPR( theCtxt, theTargetMMElement);
        if( aRelatedElement != null) {
          aRelatedElement.delete( theCtxt);
        }
      }
      else {
        setRelatedElementPR( theCtxt, theTargetMMElement, null);
      }
      return;
    }

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements = getRelatedElementsPR( theCtxt, theTargetMMElement);
    if( someRelatedElements != null) {
      int aNumRelatedElements = someRelatedElements.length;
      for( int anIndex = 0; anIndex < aNumRelatedElements; anIndex++) {
        com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRelatedElement = someRelatedElements[ anIndex];
        if( aRelatedElement != null) {
          if( isAggregates( theCtxt)) {
            aRelatedElement.delete( theCtxt);
          }
          else {
            removeRelatedElementPR( theCtxt, theTargetMMElement, aRelatedElement);
          }
        }
      }
    }
  }




  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getAllRelatedTypes( EAIMMCtxtIfc theCtxt) throws EAIException {

    java.util.Vector aTypesVector = new java.util.Vector();

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = null;
    try { aM3Type = getRelatedType( theCtxt);} catch( EAIException anEx) {}
    if( aM3Type == null) { return null;}

    com.dosmil_e.m3.core.pub.M3TypePub aTypePub = null;
    try { aTypePub = (com.dosmil_e.m3.core.pub.M3TypePub) aM3Type; } catch( ClassCastException anEx) {}
    if( aTypePub == null) { return null;}

    return aTypePub.getWithAllSubTypes( theCtxt);


  }







/* Override END */




}



