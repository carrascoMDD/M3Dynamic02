package com.dosmil_e.m3.replication.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3ReplicateBranchMgrBase
   extends com.dosmil_e.m3.traversal.impl.M3BranchMgrImpl
    implements com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3ReplicateBranchMgr metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the M3ReplicateBranchMgr metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.core.priv.M3RelationshipPriv vrReplicatedMetaRelationship; 






/****************************************************************************
 *  Constructors of the M3ReplicateBranchMgr metamodel element
 ****************************************************************************/

  public M3ReplicateBranchMgrBase() {
    super();
  }


  public M3ReplicateBranchMgrBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3ReplicateBranchMgrBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3ReplicateBranchMgrIfc and M3ReplicateBranchMgrPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3ReplicateBranchMgr
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of M3ReplicateBranchMgr
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship ReplicatedMetaRelationship
 ****************************************************************************/


    /* Public Read accessor for role ReplicatedMetaRelationship
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getReplicatedMetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getReplicatedMetaRelationshipPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getReplicatedMetaRelationshipPR( theCtxt);
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

    /* Public ReplicatedMetaRelationship number access
     */
  public int numReplicatedMetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numReplicatedMetaRelationshipPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numReplicatedMetaRelationshipPR( theCtxt);
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



    /* Public ReplicatedMetaRelationship read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getReplicatedMetaRelationshipAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getReplicatedMetaRelationshipAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getReplicatedMetaRelationshipAtPR( theCtxt, theIndex);
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


    /* Public ReplicatedMetaRelationship finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findReplicatedMetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findReplicatedMetaRelationshipNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findReplicatedMetaRelationshipNamedPR( theCtxt, theMMName);
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




    /* Public ReplicatedMetaRelationship is related predicate
     */
  public boolean hasReplicatedMetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasReplicatedMetaRelationshipNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasReplicatedMetaRelationshipNamedPR( theCtxt, theMMName);
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



    /* Transactional ReplicatedMetaRelationship is related  predicate
     */
  public boolean hasReplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theReplicatedMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasReplicatedMetaRelationshipPR( theCtxt, theReplicatedMetaRelationship);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasReplicatedMetaRelationshipPR( theCtxt, theReplicatedMetaRelationship);
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


    /* Public ReplicatedMetaRelationship index access
     */
  public int indexOfReplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theReplicatedMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfReplicatedMetaRelationshipPR( theCtxt, theReplicatedMetaRelationship);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfReplicatedMetaRelationshipPR( theCtxt, theReplicatedMetaRelationship);
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




    /* Public Write accessor for role ReplicatedMetaRelationship
     */
  public void setReplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theReplicatedMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setReplicatedMetaRelationshipPR( theCtxt, theReplicatedMetaRelationship);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setReplicatedMetaRelationshipPR( theCtxt, theReplicatedMetaRelationship);
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
 *  Implementation of internal operations for relationship ReplicatedMetaRelationship
 ****************************************************************************/


    /* Public Read accessor for role ReplicatedMetaRelationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getReplicatedMetaRelationshipPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getReplicatedMetaRelationshipPrivileged( theCtxt);
  }


    /* Public ReplicatedMetaRelationship number access
     */
  public int numReplicatedMetaRelationshipPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getReplicatedMetaRelationshipPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public ReplicatedMetaRelationship read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getReplicatedMetaRelationshipAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getReplicatedMetaRelationshipPrivileged( theCtxt);
  }


    /* Public ReplicatedMetaRelationship finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findReplicatedMetaRelationshipNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aReplicatedMetaRelationship = getReplicatedMetaRelationshipPrivileged( theCtxt);
    if( aReplicatedMetaRelationship == null) { return null;}

    if( !aReplicatedMetaRelationship.sameNameAs( theCtxt, theMMName)) { return null;}

    return aReplicatedMetaRelationship;
  }


    /* Public ReplicatedMetaRelationship finder predicate by name
     */
  public boolean hasReplicatedMetaRelationshipNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aReplicatedMetaRelationship = getReplicatedMetaRelationshipPrivileged( theCtxt);
    if( aReplicatedMetaRelationship == null) { return false;}

    return aReplicatedMetaRelationship.sameNameAs( theCtxt, theMMName);
  }



    /* Public ReplicatedMetaRelationship is related predicate
     */
  public boolean hasReplicatedMetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theReplicatedMetaRelationship) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aReplicatedMetaRelationship = getReplicatedMetaRelationshipPrivileged( theCtxt);
    if( aReplicatedMetaRelationship == null) { return false;}

    return aReplicatedMetaRelationship.sameAs( theCtxt, theReplicatedMetaRelationship);
  }




    /* Public ReplicatedMetaRelationship index access
     */
  public int indexOfReplicatedMetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theReplicatedMetaRelationship) throws EAIException {
    if( !hasReplicatedMetaRelationshipPR( theCtxt, theReplicatedMetaRelationship)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role ReplicatedMetaRelationship
     */
  public void setReplicatedMetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theReplicatedMetaRelationship) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aReplicatedMetaRelationship = getReplicatedMetaRelationshipPrivileged( theCtxt);
      // Check for new ReplicatedMetaRelationship same as current one
    if( aReplicatedMetaRelationship != null && aReplicatedMetaRelationship.sameAs( theCtxt, theReplicatedMetaRelationship)) { return;}

    if( aReplicatedMetaRelationship != null) {
      aReplicatedMetaRelationship.removeInverseOFreplicatedMetaRelationshipPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetReplicatedMetaRelationshipPrivileged();
      */
    }

    if( theReplicatedMetaRelationship != null) {
      com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewReplicatedMetaRelationship = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theReplicatedMetaRelationship;
      aNewReplicatedMetaRelationship.addInverseOFreplicatedMetaRelationshipPrivileged( theCtxt, this);
      setReplicatedMetaRelationshipPrivileged( theCtxt, aNewReplicatedMetaRelationship);
    }
    else {
      setReplicatedMetaRelationshipPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship ReplicatedMetaRelationship
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ReplicatedMetaRelationship
     * Guaranteed to return object with same identity of the ReplicatedMetaRelationship
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getReplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrReplicatedMetaRelationship;
  }




    /* Remove current reference in role ReplicatedMetaRelationship
     * Used by relationship maintenance machinery
     */
  public void unsetReplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aReplicatedMetaRelationship = vrReplicatedMetaRelationship;
    vrReplicatedMetaRelationship = null;
      // If there was change, propagate
    if( aReplicatedMetaRelationship != null) {
      change( theCtxt, "ReplicatedMetaRelationship", aReplicatedMetaRelationship, vrReplicatedMetaRelationship, "vrReplicatedMetaRelationship");
    }
  }





    /* Set reference in role ReplicatedMetaRelationship
     * Used by relationship maintenance machinery
     */
  public void setReplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theReplicatedMetaRelationship) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aReplicatedMetaRelationship = vrReplicatedMetaRelationship;
    vrReplicatedMetaRelationship = theReplicatedMetaRelationship;
      // If there was change, propagate
    if( (aReplicatedMetaRelationship != null && !aReplicatedMetaRelationship.sameAs( theCtxt, theReplicatedMetaRelationship)) || (aReplicatedMetaRelationship == null && theReplicatedMetaRelationship != null)) {
      change( theCtxt, "ReplicatedMetaRelationship", aReplicatedMetaRelationship, vrReplicatedMetaRelationship, "vrReplicatedMetaRelationship");
    }
  }





    /* Unset currently related ReplicatedMetaRelationship and
     * Set reference in role ReplicatedMetaRelationship
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetReplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theReplicatedMetaRelationship) throws EAIException {
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aReplicatedMetaRelationship = vrReplicatedMetaRelationship;
    if( aReplicatedMetaRelationship != null) {
      aReplicatedMetaRelationship.removeInverseOFreplicatedMetaRelationshipPrivileged( theCtxt, this);
    }
    vrReplicatedMetaRelationship = theReplicatedMetaRelationship;
      // If there was change, propagate
    if( (aReplicatedMetaRelationship != null && !aReplicatedMetaRelationship.sameAs( theCtxt, theReplicatedMetaRelationship)) || (aReplicatedMetaRelationship == null && theReplicatedMetaRelationship != null)) {
      change( theCtxt, "ReplicatedMetaRelationship", aReplicatedMetaRelationship, vrReplicatedMetaRelationship, "vrReplicatedMetaRelationship");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3ReplicateBranchMgr
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 

 
    // When deleting unlink related ReplicatedMetaRelationship
  setReplicatedMetaRelationship( theCtxt, null);



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
      vm3Type = com.dosmil_e.m3.replication.meta.M3ReplicateBranchMgrMeta.getStaticM3Type( theCtxt);
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


