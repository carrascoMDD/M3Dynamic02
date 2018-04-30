package com.dosmil_e.m3.traversal.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3CopyFieldMgrBase
   extends com.dosmil_e.m3.traversal.impl.M3FieldMgrImpl
    implements com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3CopyFieldMgr metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the M3CopyFieldMgr metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.core.priv.M3AttributePriv vrCopiedMetaAttribute; 






/****************************************************************************
 *  Constructors of the M3CopyFieldMgr metamodel element
 ****************************************************************************/

  public M3CopyFieldMgrBase() {
    super();
  }


  public M3CopyFieldMgrBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3CopyFieldMgrBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3CopyFieldMgrIfc and M3CopyFieldMgrPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3CopyFieldMgr
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of M3CopyFieldMgr
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship CopiedMetaAttribute
 ****************************************************************************/


    /* Public Read accessor for role CopiedMetaAttribute
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getCopiedMetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getCopiedMetaAttributePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getCopiedMetaAttributePR( theCtxt);
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

    return aResult;
  }

    /* Public CopiedMetaAttribute number access
     */
  public int numCopiedMetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numCopiedMetaAttributePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numCopiedMetaAttributePR( theCtxt);
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

    return aResult;
  }



    /* Public CopiedMetaAttribute read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getCopiedMetaAttributeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getCopiedMetaAttributeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getCopiedMetaAttributeAtPR( theCtxt, theIndex);
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

    return aResult;
  }


    /* Public CopiedMetaAttribute finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findCopiedMetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findCopiedMetaAttributeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findCopiedMetaAttributeNamedPR( theCtxt, theMMName);
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

    return aResult;
  }




    /* Public CopiedMetaAttribute is related predicate
     */
  public boolean hasCopiedMetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasCopiedMetaAttributeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasCopiedMetaAttributeNamedPR( theCtxt, theMMName);
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

    return aResult;
  }



    /* Transactional CopiedMetaAttribute is related  predicate
     */
  public boolean hasCopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theCopiedMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasCopiedMetaAttributePR( theCtxt, theCopiedMetaAttribute);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasCopiedMetaAttributePR( theCtxt, theCopiedMetaAttribute);
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

    return aResult;
  }


    /* Public CopiedMetaAttribute index access
     */
  public int indexOfCopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theCopiedMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfCopiedMetaAttributePR( theCtxt, theCopiedMetaAttribute);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfCopiedMetaAttributePR( theCtxt, theCopiedMetaAttribute);
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

    return aResult;
  }




    /* Public Write accessor for role CopiedMetaAttribute
     */
  public void setCopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theCopiedMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setCopiedMetaAttributePR( theCtxt, theCopiedMetaAttribute);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setCopiedMetaAttributePR( theCtxt, theCopiedMetaAttribute);
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




/****************************************************************************
 *  Implementation of internal operations for relationship CopiedMetaAttribute
 ****************************************************************************/


    /* Public Read accessor for role CopiedMetaAttribute
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getCopiedMetaAttributePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getCopiedMetaAttributePrivileged( theCtxt);
  }


    /* Public CopiedMetaAttribute number access
     */
  public int numCopiedMetaAttributePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getCopiedMetaAttributePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public CopiedMetaAttribute read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getCopiedMetaAttributeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getCopiedMetaAttributePrivileged( theCtxt);
  }


    /* Public CopiedMetaAttribute finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findCopiedMetaAttributeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aCopiedMetaAttribute = getCopiedMetaAttributePrivileged( theCtxt);
    if( aCopiedMetaAttribute == null) { return null;}

    if( !aCopiedMetaAttribute.sameNameAs( theCtxt, theMMName)) { return null;}

    return aCopiedMetaAttribute;
  }


    /* Public CopiedMetaAttribute finder predicate by name
     */
  public boolean hasCopiedMetaAttributeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aCopiedMetaAttribute = getCopiedMetaAttributePrivileged( theCtxt);
    if( aCopiedMetaAttribute == null) { return false;}

    return aCopiedMetaAttribute.sameNameAs( theCtxt, theMMName);
  }



    /* Public CopiedMetaAttribute is related predicate
     */
  public boolean hasCopiedMetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theCopiedMetaAttribute) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aCopiedMetaAttribute = getCopiedMetaAttributePrivileged( theCtxt);
    if( aCopiedMetaAttribute == null) { return false;}

    return aCopiedMetaAttribute.sameAs( theCtxt, theCopiedMetaAttribute);
  }




    /* Public CopiedMetaAttribute index access
     */
  public int indexOfCopiedMetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theCopiedMetaAttribute) throws EAIException {
    if( !hasCopiedMetaAttributePR( theCtxt, theCopiedMetaAttribute)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role CopiedMetaAttribute
     */
  public void setCopiedMetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theCopiedMetaAttribute) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv aCopiedMetaAttribute = getCopiedMetaAttributePrivileged( theCtxt);
      // Check for new CopiedMetaAttribute same as current one
    if( aCopiedMetaAttribute != null && aCopiedMetaAttribute.sameAs( theCtxt, theCopiedMetaAttribute)) { return;}

    if( aCopiedMetaAttribute != null) {
      aCopiedMetaAttribute.removeInverseOFcopiedMetaAttributePrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetCopiedMetaAttributePrivileged();
      */
    }

    if( theCopiedMetaAttribute != null) {
      com.dosmil_e.m3.core.priv.M3AttributePriv aNewCopiedMetaAttribute = (com.dosmil_e.m3.core.priv.M3AttributePriv) theCopiedMetaAttribute;
      aNewCopiedMetaAttribute.addInverseOFcopiedMetaAttributePrivileged( theCtxt, this);
      setCopiedMetaAttributePrivileged( theCtxt, aNewCopiedMetaAttribute);
    }
    else {
      setCopiedMetaAttributePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship CopiedMetaAttribute
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role CopiedMetaAttribute
     * Guaranteed to return object with same identity of the CopiedMetaAttribute
     */
  public com.dosmil_e.m3.core.priv.M3AttributePriv getCopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrCopiedMetaAttribute;
  }




    /* Remove current reference in role CopiedMetaAttribute
     * Used by relationship maintenance machinery
     */
  public void unsetCopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aCopiedMetaAttribute = vrCopiedMetaAttribute;
    vrCopiedMetaAttribute = null;
      // If there was change, propagate
    if( aCopiedMetaAttribute != null) {
      change( theCtxt, "CopiedMetaAttribute", aCopiedMetaAttribute, vrCopiedMetaAttribute, "vrCopiedMetaAttribute");
    }
  }





    /* Set reference in role CopiedMetaAttribute
     * Used by relationship maintenance machinery
     */
  public void setCopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theCopiedMetaAttribute) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aCopiedMetaAttribute = vrCopiedMetaAttribute;
    vrCopiedMetaAttribute = theCopiedMetaAttribute;
      // If there was change, propagate
    if( (aCopiedMetaAttribute != null && !aCopiedMetaAttribute.sameAs( theCtxt, theCopiedMetaAttribute)) || (aCopiedMetaAttribute == null && theCopiedMetaAttribute != null)) {
      change( theCtxt, "CopiedMetaAttribute", aCopiedMetaAttribute, vrCopiedMetaAttribute, "vrCopiedMetaAttribute");
    }
  }





    /* Unset currently related CopiedMetaAttribute and
     * Set reference in role CopiedMetaAttribute
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetCopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theCopiedMetaAttribute) throws EAIException {
    com.dosmil_e.m3.core.priv.M3AttributePriv aCopiedMetaAttribute = vrCopiedMetaAttribute;
    if( aCopiedMetaAttribute != null) {
      aCopiedMetaAttribute.removeInverseOFcopiedMetaAttributePrivileged( theCtxt, this);
    }
    vrCopiedMetaAttribute = theCopiedMetaAttribute;
      // If there was change, propagate
    if( (aCopiedMetaAttribute != null && !aCopiedMetaAttribute.sameAs( theCtxt, theCopiedMetaAttribute)) || (aCopiedMetaAttribute == null && theCopiedMetaAttribute != null)) {
      change( theCtxt, "CopiedMetaAttribute", aCopiedMetaAttribute, vrCopiedMetaAttribute, "vrCopiedMetaAttribute");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3CopyFieldMgr
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 

 
    // When deleting unlink related CopiedMetaAttribute
  setCopiedMetaAttribute( theCtxt, null);



  }





/****************************************************************************
 *  Support
 ****************************************************************************/




/****************************************************************************
 *  Access and initialization of metainformation the metamodel element
 *    for initialization, delegates on the model's metamodel root, that will
 *    invoke metainfo initializers (phase1, phase2) on all the metamodel elements
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc getStaticM3Type( EAIMMCtxtIfc theCtxt) {
    if( vm3Type == null) {
      vm3Type = com.dosmil_e.m3.traversal.meta.M3CopyFieldMgrMeta.getStaticM3Type( theCtxt);
    }
    return vm3Type;
  }


/****************************************************************************
 *  Access to metainformation for Type of the metamodel element
 ****************************************************************************/
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getM3Type( EAIMMCtxtIfc theCtxt) {
    return getStaticM3Type( theCtxt);
  }



/****************************************************************************
 *  Implementation of restoreValue method (such that it has access to protected fields)
 ****************************************************************************/
    // Restore a value on this metamodel element
  protected boolean restoreValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToRestore,
    String          theFieldName) {

    if( theCtxt == null)        { return true;}
    if( theFieldName == null)   { return true;}

    if( EAIFlatTransactionMgrIfc.sLogTransactionBoundaries) {

      String aSourceName = new String("null");
      String aSourceClassName = new String();
      EAIMMNameIfc aName = null;
      try { aName = getName();} catch( EAIException anEx) {}
      if( aName != null) {
        aSourceName = aName.getString();
      }
      aSourceClassName = getClass().getName();

      System.out.println("--- Restoring field : " + theFieldName + " in element named " + aSourceName + " class " + aSourceClassName);
    }

    if( theFieldName.equals( sExistencePropertyName)) { return true;}

    Field aField = getField( theFieldName);
    if( aField == null) { return false;}

    Class aFieldType = aField.getType();
    if( aFieldType == null) { return false;}

    if( !aFieldType.isPrimitive()) {
      try { aField.set( this, theValueToRestore);}
      catch( IllegalArgumentException anException) { return false;}
      catch( IllegalAccessException anException) { return false;}
    }
    else {
      String aFieldTypeName = aFieldType.getName();

      if( aFieldTypeName.equals( int.class.getName())) {
        Integer aValueObject = null;
        try { aValueObject = (Integer) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        int aValue = aValueObject.intValue();
        try { aField.setInt( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
      if( aFieldTypeName.equals( boolean.class.getName())) {
        Boolean aValueObject = null;
        try { aValueObject = (Boolean) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        boolean aValue = aValueObject.booleanValue();

        try { aField.setBoolean( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
      if( aFieldTypeName.equals( float.class.getName())) {
        Float aValueObject = null;
        try { aValueObject = (Float) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        float aValue = aValueObject.floatValue();

        try { aField.setFloat( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
      if( aFieldTypeName.equals( double.class.getName())) {
        Double aValueObject = null;
        try { aValueObject = (Double) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        double aValue = aValueObject.doubleValue();
        try { aField.setDouble( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
        return false;
      }}}}
    }

    return true;
  }

/****************************************************************************
 *  Implementations of getFieldValue method (such that it has access to protected fields)
 ****************************************************************************/

    // Get a value from a field of this  metamodel element
  public Object getFieldValue(
    EAIMMCtxtIfc    theCtxt,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return null;}
    if( theField == null)       { return null;}

    Object aValue = null;
    try { aValue = theField.get( this);}
    catch( IllegalArgumentException anException) { return null;}
    catch( IllegalAccessException anException) { return null;}
    catch( NullPointerException anException) { return null;}
    catch( ExceptionInInitializerError anException) { return null;}

    return aValue;
  }





/****************************************************************************
 *  Implementations of setFieldToXXX method (such that it has access to protected fields)
 ****************************************************************************/
    // Aux for log
  protected void logSetField(
    EAIMMCtxtIfc    theCtxt,
    String          theFieldKind,
    Field           theField) {

    if( !EAIFlatTransactionMgrIfc.sLogTransactionBoundaries) { return;}


    String aSourceName = new String("null");
    String aSourceClassName = new String();
    EAIMMNameIfc aName = null;
    try { aName = getName();} catch( EAIException anEx) {}
    if( aName != null) {
      aSourceName = aName.getString();
    }
    aSourceClassName = getClass().getName();

    System.out.println("--- SettingField " + theFieldKind + " field : " + theField.getName() + " in element named " + aSourceName + " class " + aSourceClassName);
  }


    // Restore a value on this metamodel element
  public boolean setFieldToNonPrimitiveValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)       { return true;}

    logSetField( theCtxt, "Non Primitive", theField);

    try { theField.set( this, theValueToSet);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}
    return true;
  }


  public boolean setFieldToPrimitiveIntValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)       { return true;}

    logSetField( theCtxt, "Primitive int", theField);

    Integer aValueObject = null;
    try { aValueObject = (Integer) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    int aValue = aValueObject.intValue();

    try { theField.setInt( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }






  public boolean setFieldToPrimitiveBoolValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)       { return true;}

    logSetField( theCtxt, "Primitive boolean", theField);

    Boolean aValueObject = null;
    try { aValueObject = (Boolean) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    boolean aValue = aValueObject.booleanValue();

    try { theField.setBoolean( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }









  public boolean setFieldToPrimitiveFloatValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField)  throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)   { return true;}


    logSetField( theCtxt, "Primitive float", theField);

    Float aValueObject = null;
    try { aValueObject = (Float) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    float aValue = aValueObject.floatValue();

    try { theField.setFloat( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }






  public boolean setFieldToPrimitiveDoubleValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField)  throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)   { return true;}


    logSetField( theCtxt, "Primitive double", theField);

    Double aValueObject = null;
    try { aValueObject = (Double) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    double aValue = aValueObject.doubleValue();

    try { theField.setDouble( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }



/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300000003L;


}


