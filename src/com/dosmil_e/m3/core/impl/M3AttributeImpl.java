package com.dosmil_e.m3.core.impl;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class M3AttributeImpl
  extends com.dosmil_e.m3.core.base.M3AttributeBase 
  implements com.dosmil_e.m3.core.pub.M3AttributePub {

  public M3AttributeImpl() {
    super();
  }


  public M3AttributeImpl( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3AttributeImpl( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }






/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300070007L;









/* Override START */

  protected transient java.util.Hashtable vGetMethods;


  public Object getValue(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement) {

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

    return aResultObject;
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
    return "va" + getUpperName( theCtxt);
  }





  public boolean isM3Many( EAIMMCtxtIfc theCtxt) {
    return false;
  }




  public Object getAttributeValue(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return null;}
    if( aTrxMgr.inTransaction()) {
      return getAttributeValuePR( theCtxt, theTargetMMElement);
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        Object aResult = getAttributeValuePR( theCtxt, theTargetMMElement);
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
    return  null;
  }



  private Object getAttributeValuePR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement)  throws EAIException {

    if( theCtxt == null)            { return null;}
    if( theMMElement == null)         { return null;}

    java.lang.reflect.Field aField = getField( theCtxt, theMMElement);
    if( aField == null) { return null;}

    Object aValueObject = null;
    try {
      aValueObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( aValueObject == null) { return null;}

    if( !isM3Many( theCtxt)) { return aValueObject;}

    Object[] someValues = null;
    try { someValues = (Object[]) aValueObject;} catch( ClassCastException anEx) {}
    if( someValues == null) { return null;}

    int aValuesLength = someValues.length;
    if( aValuesLength < 1) { return null;}

    Object aFirstValueObject =  someValues[ 0];
    return aFirstValueObject;
  }





  public Object[] getAttributeValues(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return null;}
    if( aTrxMgr.inTransaction()) {
      return getAttributeValuesPR( theCtxt, theTargetMMElement);
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        Object[] aResult = getAttributeValuesPR( theCtxt, theTargetMMElement);
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



  private Object[] getAttributeValuesPR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement)  throws EAIException {

    if( theCtxt == null)            { return null;}
    if( theMMElement == null)         { return null;}

    java.lang.reflect.Field aField = getField( theCtxt, theMMElement);
    if( aField == null) { return null;}

    Object aValueObject = null;
    try {
      aValueObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}

    if( aValueObject == null) { return null;}

    Object[] someValues = null;
    if( !isM3Many( theCtxt)) {
      someValues = new Object[] { aValueObject};
      return someValues;
    }

    try { someValues = (Object[]) aValueObject;} catch( ClassCastException anEx) {}
    return someValues;
  }





    /* Public Write accessor for related model element
     */
  public void setAttributeValue(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    Object theSetValue)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setAttributeValuePR( theCtxt, theTargetMMElement, theSetValue);
      return;
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setAttributeValuePR( theCtxt, theTargetMMElement, theSetValue);
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
  private void setAttributeValuePR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    Object theSetValue)  throws EAIException {

    if( theCtxt == null)                  { return;}
    if( theTargetMMElement == null)       { return;}

    if( isM3Many( theCtxt))              { return;}

    com.dosmil_e.modelbase.priv.EAIMMElementPriv aTargetMMElement = null;
    try { aTargetMMElement = (com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement; } catch( ClassCastException anEx) {}
    if( aTargetMMElement == null) { return;}

      // Get Field holder of current value
    java.lang.reflect.Field aField = getField( theCtxt, theTargetMMElement);
    if( aField == null) { return;}

      // Get current value
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc aAttributeValue = null;
    Object aAttributeValueObject = null;
    try {
      aAttributeValueObject = ((com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement).
        getFieldValue( theCtxt, aField);
    } catch( ClassCastException anEx) {}


    if( aAttributeValueObject == null && theSetValue == null) { return;}

    if( aAttributeValueObject != null && theSetValue != null) {
      boolean anAreSame = false;
      try { anAreSame = aAttributeValueObject.equals( theSetValue);} catch( Exception anEx) {}
      if( anAreSame) { return;}
    }

      // Write new value into holder field
    Class aFieldType = aField.getType();
    if( aFieldType == null) { return;}

    if( !aFieldType.isPrimitive()) {
      aTargetMMElement.setFieldToNonPrimitiveValue( theCtxt, theSetValue, aField);
      return;
    }
    else {
     try {
      String aFieldTypeName = aFieldType.getName();

      if( aFieldTypeName.equals( int.class.getName())) {
        if( theSetValue == null && ((Integer) aAttributeValueObject).intValue() == 0) { return;}

        aTargetMMElement.setFieldToPrimitiveIntValue( theCtxt, (theSetValue != null ? theSetValue : new Integer(0)), aField);
      }
      else {
      if( aFieldTypeName.equals( boolean.class.getName())) {
        if( theSetValue == null && ((Boolean) aAttributeValueObject).booleanValue() == false) { return;}
        aTargetMMElement.setFieldToPrimitiveBoolValue( theCtxt, (theSetValue != null ? theSetValue : new Boolean(false)), aField);
      }
      else {
      if( aFieldTypeName.equals( float.class.getName())) {
        if( theSetValue == null && ((Float) aAttributeValueObject).floatValue() == (float) 0.0) { return;}
        aTargetMMElement.setFieldToPrimitiveFloatValue( theCtxt, (theSetValue != null ? theSetValue : new Float((float)0.0)), aField);
      }
      else {
      if( aFieldTypeName.equals( double.class.getName())) {
        if( theSetValue == null && ((Double) aAttributeValueObject).doubleValue() ==  0.0) { return;}
        aTargetMMElement.setFieldToPrimitiveDoubleValue( theCtxt, (theSetValue != null ? theSetValue : new Double(0.0)), aField);
      }
      else {
        return;
      }}}}
     } catch( ClassCastException anEx) {}
    }

      // Generate and post the change event notification
    try { theCtxt.getFlatTrxMgr().change( aTargetMMElement, getUpperName( theCtxt), aAttributeValueObject, theSetValue, aField.getName());} catch( EAIException anEx) {}
  }




/* Override END */


}
