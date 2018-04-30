package com.dosmil_e.m3.replication.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3ReplicateNodeMgrBase
   extends com.dosmil_e.m3.traversal.impl.M3NodeMgrImpl
    implements com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3ReplicateNodeMgr metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the M3ReplicateNodeMgr metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.core.priv.M3TypePriv vrReplicatedMetaType; 






/****************************************************************************
 *  Constructors of the M3ReplicateNodeMgr metamodel element
 ****************************************************************************/

  public M3ReplicateNodeMgrBase() {
    super();
  }


  public M3ReplicateNodeMgrBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3ReplicateNodeMgrBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3ReplicateNodeMgrIfc and M3ReplicateNodeMgrPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3ReplicateNodeMgr
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of M3ReplicateNodeMgr
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship ReplicatedMetaType
 ****************************************************************************/


    /* Public Read accessor for role ReplicatedMetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getReplicatedMetaType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getReplicatedMetaTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getReplicatedMetaTypePR( theCtxt);
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

    /* Public ReplicatedMetaType number access
     */
  public int numReplicatedMetaType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numReplicatedMetaTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numReplicatedMetaTypePR( theCtxt);
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



    /* Public ReplicatedMetaType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getReplicatedMetaTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getReplicatedMetaTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getReplicatedMetaTypeAtPR( theCtxt, theIndex);
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


    /* Public ReplicatedMetaType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findReplicatedMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findReplicatedMetaTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findReplicatedMetaTypeNamedPR( theCtxt, theMMName);
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




    /* Public ReplicatedMetaType is related predicate
     */
  public boolean hasReplicatedMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasReplicatedMetaTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasReplicatedMetaTypeNamedPR( theCtxt, theMMName);
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



    /* Transactional ReplicatedMetaType is related  predicate
     */
  public boolean hasReplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theReplicatedMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasReplicatedMetaTypePR( theCtxt, theReplicatedMetaType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasReplicatedMetaTypePR( theCtxt, theReplicatedMetaType);
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


    /* Public ReplicatedMetaType index access
     */
  public int indexOfReplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theReplicatedMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfReplicatedMetaTypePR( theCtxt, theReplicatedMetaType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfReplicatedMetaTypePR( theCtxt, theReplicatedMetaType);
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




    /* Public Write accessor for role ReplicatedMetaType
     */
  public void setReplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theReplicatedMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setReplicatedMetaTypePR( theCtxt, theReplicatedMetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setReplicatedMetaTypePR( theCtxt, theReplicatedMetaType);
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
 *  Implementation of internal operations for relationship ReplicatedMetaType
 ****************************************************************************/


    /* Public Read accessor for role ReplicatedMetaType
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getReplicatedMetaTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getReplicatedMetaTypePrivileged( theCtxt);
  }


    /* Public ReplicatedMetaType number access
     */
  public int numReplicatedMetaTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getReplicatedMetaTypePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public ReplicatedMetaType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getReplicatedMetaTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getReplicatedMetaTypePrivileged( theCtxt);
  }


    /* Public ReplicatedMetaType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findReplicatedMetaTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3TypeIfc aReplicatedMetaType = getReplicatedMetaTypePrivileged( theCtxt);
    if( aReplicatedMetaType == null) { return null;}

    if( !aReplicatedMetaType.sameNameAs( theCtxt, theMMName)) { return null;}

    return aReplicatedMetaType;
  }


    /* Public ReplicatedMetaType finder predicate by name
     */
  public boolean hasReplicatedMetaTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aReplicatedMetaType = getReplicatedMetaTypePrivileged( theCtxt);
    if( aReplicatedMetaType == null) { return false;}

    return aReplicatedMetaType.sameNameAs( theCtxt, theMMName);
  }



    /* Public ReplicatedMetaType is related predicate
     */
  public boolean hasReplicatedMetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theReplicatedMetaType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aReplicatedMetaType = getReplicatedMetaTypePrivileged( theCtxt);
    if( aReplicatedMetaType == null) { return false;}

    return aReplicatedMetaType.sameAs( theCtxt, theReplicatedMetaType);
  }




    /* Public ReplicatedMetaType index access
     */
  public int indexOfReplicatedMetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theReplicatedMetaType) throws EAIException {
    if( !hasReplicatedMetaTypePR( theCtxt, theReplicatedMetaType)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role ReplicatedMetaType
     */
  public void setReplicatedMetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theReplicatedMetaType) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv aReplicatedMetaType = getReplicatedMetaTypePrivileged( theCtxt);
      // Check for new ReplicatedMetaType same as current one
    if( aReplicatedMetaType != null && aReplicatedMetaType.sameAs( theCtxt, theReplicatedMetaType)) { return;}

    if( aReplicatedMetaType != null) {
      aReplicatedMetaType.removeInverseOFreplicatedMetaTypePrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetReplicatedMetaTypePrivileged();
      */
    }

    if( theReplicatedMetaType != null) {
      com.dosmil_e.m3.core.priv.M3TypePriv aNewReplicatedMetaType = (com.dosmil_e.m3.core.priv.M3TypePriv) theReplicatedMetaType;
      aNewReplicatedMetaType.addInverseOFreplicatedMetaTypePrivileged( theCtxt, this);
      setReplicatedMetaTypePrivileged( theCtxt, aNewReplicatedMetaType);
    }
    else {
      setReplicatedMetaTypePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship ReplicatedMetaType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ReplicatedMetaType
     * Guaranteed to return object with same identity of the ReplicatedMetaType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getReplicatedMetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrReplicatedMetaType;
  }




    /* Remove current reference in role ReplicatedMetaType
     * Used by relationship maintenance machinery
     */
  public void unsetReplicatedMetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aReplicatedMetaType = vrReplicatedMetaType;
    vrReplicatedMetaType = null;
      // If there was change, propagate
    if( aReplicatedMetaType != null) {
      change( theCtxt, "ReplicatedMetaType", aReplicatedMetaType, vrReplicatedMetaType, "vrReplicatedMetaType");
    }
  }





    /* Set reference in role ReplicatedMetaType
     * Used by relationship maintenance machinery
     */
  public void setReplicatedMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theReplicatedMetaType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aReplicatedMetaType = vrReplicatedMetaType;
    vrReplicatedMetaType = theReplicatedMetaType;
      // If there was change, propagate
    if( (aReplicatedMetaType != null && !aReplicatedMetaType.sameAs( theCtxt, theReplicatedMetaType)) || (aReplicatedMetaType == null && theReplicatedMetaType != null)) {
      change( theCtxt, "ReplicatedMetaType", aReplicatedMetaType, vrReplicatedMetaType, "vrReplicatedMetaType");
    }
  }





    /* Unset currently related ReplicatedMetaType and
     * Set reference in role ReplicatedMetaType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetReplicatedMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theReplicatedMetaType) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv aReplicatedMetaType = vrReplicatedMetaType;
    if( aReplicatedMetaType != null) {
      aReplicatedMetaType.removeInverseOFreplicatedMetaTypePrivileged( theCtxt, this);
    }
    vrReplicatedMetaType = theReplicatedMetaType;
      // If there was change, propagate
    if( (aReplicatedMetaType != null && !aReplicatedMetaType.sameAs( theCtxt, theReplicatedMetaType)) || (aReplicatedMetaType == null && theReplicatedMetaType != null)) {
      change( theCtxt, "ReplicatedMetaType", aReplicatedMetaType, vrReplicatedMetaType, "vrReplicatedMetaType");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3ReplicateNodeMgr
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 

 
    // When deleting unlink related ReplicatedMetaType
  setReplicatedMetaType( theCtxt, null);



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
      vm3Type = com.dosmil_e.m3.replication.meta.M3ReplicateNodeMgrMeta.getStaticM3Type( theCtxt);
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


