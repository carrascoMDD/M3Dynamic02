package com.dosmil_e.m3.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3RelationshipBase
   extends com.dosmil_e.m3.core.impl.M3StructuralFeatureImpl
    implements com.dosmil_e.m3.core.priv.M3RelationshipPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3Relationship metamodel element
 ****************************************************************************/
	protected java.lang.String vaKind;

	protected boolean vaIsDerived;

	protected boolean vaIsDummy;




/****************************************************************************
 *  State storage for the Relationships of the M3Relationship metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] vrInverseOFmetaRelationship = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[0]; 

	protected com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] vrInverseOFreplicatedMetaRelationship = new com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[0]; 

	protected com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] vrInverseOFtargetToTransfomations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[0]; 

	protected com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] vrInverseOFprojectionToOriginals = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[0]; 

	protected com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] vrInverseOFprojectedToProjections = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[0]; 

	protected com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] vrInverseOFtransformationToSources = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[0]; 

	protected com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] vrInverseOFtransformationToSubTransformations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3RelationshipPriv vrInverse; 

	protected com.dosmil_e.m3.core.priv.M3TypePriv vrType; 

	protected com.dosmil_e.m3.core.priv.M3TypePriv vrRelatedType; 






/****************************************************************************
 *  Constructors of the M3Relationship metamodel element
 ****************************************************************************/

  public M3RelationshipBase() {
    super();
  }


  public M3RelationshipBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3RelationshipBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3RelationshipIfc and M3RelationshipPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3Relationship
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE Kind
 ****************************************************************************/


    /* Public Read accessor for attribute Kind
     */
  public java.lang.String getKind( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getKindPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getKindPR( theCtxt);;
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






    /* Transactional Public Write accessor for attribute Kind
     */
  public void setKind( EAIMMCtxtIfc theCtxt, java.lang.String theKind) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setKindPR( theCtxt,  theKind);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setKindPR( theCtxt, theKind);
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
 *  Implementation of internal operations for attribute Kind
 ****************************************************************************/


    /* Public Read accessor for attribute Kind
     */
  public java.lang.String getKindPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaKind;
  }



    /* Public Write accessor for attribute Kind
     */
  public void setKindPR( EAIMMCtxtIfc theCtxt, java.lang.String theKind) throws EAIException {

      // Get current value
    java.lang.String aKind = getKindPR( theCtxt);
      // Check for new Kind same as current one
    if( toObject( aKind) != null && toObject( aKind).equals( toObject( theKind))) { return;}

    vaKind = theKind;
    change( theCtxt, "Kind", toObject( aKind), toObject( vaKind), "vaKind");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE IsDerived
 ****************************************************************************/


    /* Public Read accessor for attribute IsDerived
     */
  public boolean getIsDerived( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    boolean aResult = true;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getIsDerivedPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getIsDerivedPR( theCtxt);;
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






    /* Transactional Public Write accessor for attribute IsDerived
     */
  public void setIsDerived( EAIMMCtxtIfc theCtxt, boolean theIsDerived) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setIsDerivedPR( theCtxt,  theIsDerived);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setIsDerivedPR( theCtxt, theIsDerived);
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
 *  Implementation of internal operations for attribute IsDerived
 ****************************************************************************/


    /* Public Read accessor for attribute IsDerived
     */
  public boolean getIsDerivedPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaIsDerived;
  }



    /* Public Write accessor for attribute IsDerived
     */
  public void setIsDerivedPR( EAIMMCtxtIfc theCtxt, boolean theIsDerived) throws EAIException {

      // Get current value
    boolean aIsDerived = getIsDerivedPR( theCtxt);
      // Check for new IsDerived same as current one
    if( toObject( aIsDerived) != null && toObject( aIsDerived).equals( toObject( theIsDerived))) { return;}

    vaIsDerived = theIsDerived;
    change( theCtxt, "IsDerived", toObject( aIsDerived), toObject( vaIsDerived), "vaIsDerived");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE IsDummy
 ****************************************************************************/


    /* Public Read accessor for attribute IsDummy
     */
  public boolean getIsDummy( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    boolean aResult = true;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getIsDummyPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getIsDummyPR( theCtxt);;
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






    /* Transactional Public Write accessor for attribute IsDummy
     */
  public void setIsDummy( EAIMMCtxtIfc theCtxt, boolean theIsDummy) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setIsDummyPR( theCtxt,  theIsDummy);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setIsDummyPR( theCtxt, theIsDummy);
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
 *  Implementation of internal operations for attribute IsDummy
 ****************************************************************************/


    /* Public Read accessor for attribute IsDummy
     */
  public boolean getIsDummyPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaIsDummy;
  }



    /* Public Write accessor for attribute IsDummy
     */
  public void setIsDummyPR( EAIMMCtxtIfc theCtxt, boolean theIsDummy) throws EAIException {

      // Get current value
    boolean aIsDummy = getIsDummyPR( theCtxt);
      // Check for new IsDummy same as current one
    if( toObject( aIsDummy) != null && toObject( aIsDummy).equals( toObject( theIsDummy))) { return;}

    vaIsDummy = theIsDummy;
    change( theCtxt, "IsDummy", toObject( aIsDummy), toObject( vaIsDummy), "vaIsDummy");
  }









/****************************************************************************
 *  Implementation of relationships of M3Relationship
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFmetaRelationship
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaRelationship
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getInverseOFmetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFmetaRelationshipPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFmetaRelationshipPR( theCtxt);
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

    /* Public InverseOFmetaRelationship number access
     */
  public int numInverseOFmetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFmetaRelationshipPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFmetaRelationshipPR( theCtxt);
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



    /* Public InverseOFmetaRelationship read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getInverseOFmetaRelationshipAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFmetaRelationshipAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFmetaRelationshipAtPR( theCtxt, theIndex);
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


    /* Public InverseOFmetaRelationship finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc findInverseOFmetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFmetaRelationshipNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFmetaRelationshipNamedPR( theCtxt, theMMName);
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




    /* Public InverseOFmetaRelationship is related predicate
     */
  public boolean hasInverseOFmetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFmetaRelationshipNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFmetaRelationshipNamedPR( theCtxt, theMMName);
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



    /* Transactional InverseOFmetaRelationship is related  predicate
     */
  public boolean hasInverseOFmetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);
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


    /* Public InverseOFmetaRelationship index access
     */
  public int indexOfInverseOFmetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);
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






    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);
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



    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaRelationshipBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeInverseOFmetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFmetaRelationshipBeforePR( theCtxt, theInverseOFmetaRelationship, theRelativeInverseOFmetaRelationship);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFmetaRelationshipBeforePR( theCtxt, theInverseOFmetaRelationship, theRelativeInverseOFmetaRelationship);
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





    /* Transactional Public Write Remove accessor for role InverseOFmetaRelationship
     */
  public void removeInverseOFmetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);
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



    /* Public reorder accessor for role InverseOFmetaRelationship
     */
  public void moveInverseOFmetaRelationshipBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeInverseOFmetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFmetaRelationshipBeforePR( theCtxt, theInverseOFmetaRelationship, theRelativeInverseOFmetaRelationship);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFmetaRelationshipBeforePR( theCtxt, theInverseOFmetaRelationship, theRelativeInverseOFmetaRelationship);
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



    /* Public reorder accessor for role InverseOFmetaRelationship
     */
  public void moveInverseOFmetaRelationshipToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFmetaRelationshipToLastPR( theCtxt, theInverseOFmetaRelationship);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFmetaRelationshipToLastPR( theCtxt, theInverseOFmetaRelationship);
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
 *  Implementation of internal operations for relationship InverseOFmetaRelationship
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaRelationship
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getInverseOFmetaRelationshipPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someInverseOFmetaRelationship = getInverseOFmetaRelationshipPrivileged( theCtxt);
    if( someInverseOFmetaRelationship == null) { return null;}

    int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] otherInverseOFmetaRelationship = new com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[ aInverseOFmetaRelationshipLength];
    try { System.arraycopy( someInverseOFmetaRelationship, 0, otherInverseOFmetaRelationship, 0, aInverseOFmetaRelationshipLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaRelationship", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaRelationship", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaRelationship", null); return null;}


    return otherInverseOFmetaRelationship;
  }



    /* Public InverseOFmetaRelationship finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc findInverseOFmetaRelationshipNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someInverseOFmetaRelationship = getInverseOFmetaRelationshipPrivileged( theCtxt);
    if( someInverseOFmetaRelationship == null) { return null;}

      // Check for new InverseOFmetaRelationship already in collection
    int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaRelationshipLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aInverseOFmetaRelationship = someInverseOFmetaRelationship[ anIndex];
      if( aInverseOFmetaRelationship.sameNameAs( theCtxt, theMMName)) { return aInverseOFmetaRelationship;}
    }
    return null;
  }



    /* Public InverseOFmetaRelationship finder predicate by name
     */
  public boolean hasInverseOFmetaRelationshipNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFmetaRelationshipNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFmetaRelationship read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getInverseOFmetaRelationshipAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someInverseOFmetaRelationship = getInverseOFmetaRelationshipPrivileged( theCtxt);
    if( someInverseOFmetaRelationship == null) { return null;}

      // Get number of InverseOFmetaRelationship
    int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;

      // Verify index within array length
    if( theIndex >= aInverseOFmetaRelationshipLength) { return null;}

      // Get indexed InverseOFmetaRelationship
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aInverseOFmetaRelationship = someInverseOFmetaRelationship[ theIndex];

    return aInverseOFmetaRelationship;
  }



    /* Public InverseOFmetaRelationship is related predicate
     */
  public boolean hasInverseOFmetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException {
    return indexOfInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship) >= 0;
  }


    /* Public InverseOFmetaRelationship index access
     */
  public int indexOfInverseOFmetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFmetaRelationship == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someInverseOFmetaRelationship = getInverseOFmetaRelationshipPrivileged( theCtxt);
    if( someInverseOFmetaRelationship == null) { return -1;}

      // Check for new InverseOFmetaRelationship already in collection
    int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaRelationshipLength ; anIndex++) {
      if( someInverseOFmetaRelationship[ anIndex].sameAs( theCtxt, theInverseOFmetaRelationship)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFmetaRelationship number access
     */
  public int numInverseOFmetaRelationshipPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someInverseOFmetaRelationship = getInverseOFmetaRelationshipPrivileged( theCtxt);
    if( someInverseOFmetaRelationship == null) { return 0;}

      // Check for new InverseOFmetaRelationship already in collection
    int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;
    return aInverseOFmetaRelationshipLength;
  }




    /* Public Write accessor for role InverseOFmetaRelationship
     */
  public void addInverseOFmetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaRelationship == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaRelationship = getInverseOFmetaRelationshipPrivileged( theCtxt);
    if( someInverseOFmetaRelationship == null) { return;}

      // Check for new InverseOFmetaRelationship already in collection
    int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaRelationshipLength ; anIndex++) {
      if( theInverseOFmetaRelationship.sameAs( theCtxt, someInverseOFmetaRelationship[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aNewInverseOFmetaRelationship = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theInverseOFmetaRelationship;

      // Link reverse ref to this object
    aNewInverseOFmetaRelationship.unsetAndSetMetaRelationshipPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFmetaRelationship element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaRelationship = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaRelationshipLength + 1];
    try { System.arraycopy( someInverseOFmetaRelationship, 0, otherInverseOFmetaRelationship, 0, aInverseOFmetaRelationshipLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaRelationship", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaRelationship", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaRelationship", null); return;}
    otherInverseOFmetaRelationship[ aInverseOFmetaRelationshipLength] = aNewInverseOFmetaRelationship;

      // Set the new collection
    setInverseOFmetaRelationshipPrivileged( theCtxt, otherInverseOFmetaRelationship);
  }




    /* Public ordered Write accessor for role InverseOFmetaRelationship
     */
  public void addInverseOFmetaRelationshipBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeInverseOFmetaRelationship) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaRelationship == null) { return;}

      // If relative InverseOFmetaRelationship is null, perform normal add operation
    if( theRelativeInverseOFmetaRelationship == null) {
      addInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaRelationship = getInverseOFmetaRelationshipPrivileged( theCtxt);
    if( someInverseOFmetaRelationship == null) { return;}


      // Get index of relative InverseOFmetaRelationship
    int aRelativeIndex = indexOfInverseOFmetaRelationshipPR( theCtxt, theRelativeInverseOFmetaRelationship);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);
    }

      // Get length of InverseOFmetaRelationship array
    int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFmetaRelationshipLength) {
      addInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);
    }

      // Check for new InverseOFmetaRelationship already in collection
    if( hasInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship)) { return;}


    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aNewInverseOFmetaRelationship = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theInverseOFmetaRelationship;

      // Link reverse ref to this object
    aNewInverseOFmetaRelationship.unsetAndSetMetaRelationshipPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFmetaRelationship
      // Grow collection and add new InverseOFmetaRelationship element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaRelationship = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaRelationshipLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFmetaRelationship, 0, otherInverseOFmetaRelationship, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFmetaRelationship, aRelativeIndex, otherInverseOFmetaRelationship, aRelativeIndex + 1, aInverseOFmetaRelationshipLength - aRelativeIndex);
      otherInverseOFmetaRelationship[ aRelativeIndex] = aNewInverseOFmetaRelationship;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaRelationshipBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaRelationshipBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaRelationshipBefore", null); return;}

      // Set the new collection
    setInverseOFmetaRelationshipPrivileged( theCtxt, otherInverseOFmetaRelationship);
  }





    /* Public Write accessor for role InverseOFmetaRelationship
     */
  public void removeInverseOFmetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaRelationship == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaRelationship = getInverseOFmetaRelationshipPrivileged( theCtxt);
    if( someInverseOFmetaRelationship == null) { return;}

      // Check for new InverseOFmetaRelationship not in collection
    int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaRelationshipLength ; anIndex++) {
      if( theInverseOFmetaRelationship.sameAs( theCtxt, someInverseOFmetaRelationship[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aNewInverseOFmetaRelationship = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theInverseOFmetaRelationship;

      // Unlink reverse ref from the new related object
    aNewInverseOFmetaRelationship.unsetMetaRelationshipPrivileged( theCtxt);

      // Shrink collection removing InverseOFmetaRelationship element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaRelationship = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaRelationshipLength - 1];
    try {
      System.arraycopy( someInverseOFmetaRelationship, 0, otherInverseOFmetaRelationship, 0, aFoundIndex);
      System.arraycopy( someInverseOFmetaRelationship, aFoundIndex + 1, otherInverseOFmetaRelationship, aFoundIndex, aInverseOFmetaRelationshipLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaRelationship", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaRelationship", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaRelationship", null); return;}

      // Set the new collection
    setInverseOFmetaRelationshipPrivileged( theCtxt, otherInverseOFmetaRelationship);
  }




    /* Public reorder accessor for role InverseOFmetaRelationship
     */
  public void moveInverseOFmetaRelationshipBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeInverseOFmetaRelationship) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFmetaRelationship == null) { return;}

      // If relative InverseOFmetaRelationship is null, perform move to last position
    if( theRelativeInverseOFmetaRelationship == null) {
      moveInverseOFmetaRelationshipToLastPR( theCtxt, theInverseOFmetaRelationship);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaRelationship = getInverseOFmetaRelationshipPrivileged( theCtxt);
    if( someInverseOFmetaRelationship == null) { return;}

      // Get length of InverseOFmetaRelationship array
    int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;

      // Get index of InverseOFmetaRelationship to move
    int aToMoveIndex = indexOfInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);
      // If toMove InverseOFmetaRelationship not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFmetaRelationshipLength) {
      moveInverseOFmetaRelationshipToLastPR( theCtxt, theInverseOFmetaRelationship);
    }

      // Get index of relative InverseOFmetaRelationship
    int aRelativeIndex = indexOfInverseOFmetaRelationshipPR( theCtxt, theRelativeInverseOFmetaRelationship);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFmetaRelationshipToLastPR( theCtxt, theInverseOFmetaRelationship);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFmetaRelationshipLength) {
      moveInverseOFmetaRelationshipToLastPR( theCtxt, theInverseOFmetaRelationship);
    }

      // ToMove and relative InverseOFmetaRelationship are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aToMoveInverseOFmetaRelationship = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theInverseOFmetaRelationship;

      // Allocate new array for new version of state of relationship InverseOFmetaRelationship
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaRelationship = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaRelationshipLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFmetaRelationship, 0, otherInverseOFmetaRelationship, 0, aToMoveIndex );
        System.arraycopy( someInverseOFmetaRelationship, aToMoveIndex + 1, otherInverseOFmetaRelationship, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFmetaRelationship[ aRelativeIndex - 1] = aToMoveInverseOFmetaRelationship;
        System.arraycopy( someInverseOFmetaRelationship, aRelativeIndex, otherInverseOFmetaRelationship, aRelativeIndex, aInverseOFmetaRelationshipLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFmetaRelationship, 0, otherInverseOFmetaRelationship, 0, aRelativeIndex );
        otherInverseOFmetaRelationship[ aRelativeIndex ] = aToMoveInverseOFmetaRelationship;
        System.arraycopy( someInverseOFmetaRelationship, aRelativeIndex, otherInverseOFmetaRelationship, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFmetaRelationshipLength - 1) {
          System.arraycopy( someInverseOFmetaRelationship, aToMoveIndex + 1, otherInverseOFmetaRelationship, aToMoveIndex + 1, aInverseOFmetaRelationshipLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaRelationshipBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaRelationshipBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaRelationshipBefore", null); return;}

      // Set the new collection
    setInverseOFmetaRelationshipPrivileged( theCtxt, otherInverseOFmetaRelationship);
  }





    /* Public move to last accessor for role InverseOFmetaRelationship
     */
  public void moveInverseOFmetaRelationshipToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFmetaRelationship == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaRelationship = getInverseOFmetaRelationshipPrivileged( theCtxt);
    if( someInverseOFmetaRelationship == null) { return;}

      // Get length of InverseOFmetaRelationship array
    int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;

      // Get index of InverseOFmetaRelationship to move
    int aToMoveIndex = indexOfInverseOFmetaRelationshipPR( theCtxt, theInverseOFmetaRelationship);

      // If toMove InverseOFmetaRelationship not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFmetaRelationshipLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aToMoveInverseOFmetaRelationship = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theInverseOFmetaRelationship;

      // Allocate new array for new version of state of relationship InverseOFmetaRelationship
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaRelationship = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaRelationshipLength];
    try {
      System.arraycopy( someInverseOFmetaRelationship, 0, otherInverseOFmetaRelationship, 0, aToMoveIndex );
      System.arraycopy( someInverseOFmetaRelationship, aToMoveIndex + 1, otherInverseOFmetaRelationship, aToMoveIndex, aInverseOFmetaRelationshipLength - aToMoveIndex - 1);
      otherInverseOFmetaRelationship[ aInverseOFmetaRelationshipLength - 1] = aToMoveInverseOFmetaRelationship;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaRelationshipToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaRelationshipToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaRelationshipToLast", null); return;}

      // Set the new collection
    setInverseOFmetaRelationshipPrivileged( theCtxt, otherInverseOFmetaRelationship);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFmetaRelationship
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFmetaRelationship
     */
  public void addInverseOFmetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theInverseOFmetaRelationship) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaRelationship == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaRelationship = getInverseOFmetaRelationshipPrivileged( theCtxt);
    if( someInverseOFmetaRelationship == null) { return;}

      // Check for new InverseOFmetaRelationship already in collection
    int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaRelationshipLength ; anIndex++) {
      if( theInverseOFmetaRelationship.sameAs( theCtxt, someInverseOFmetaRelationship[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFmetaRelationship element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaRelationship = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaRelationshipLength + 1];
    try {
      System.arraycopy( someInverseOFmetaRelationship, 0, otherInverseOFmetaRelationship, 0, aInverseOFmetaRelationshipLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaRelationshipPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaRelationshipPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaRelationshipPrivileged", null); return;}

    otherInverseOFmetaRelationship[ aInverseOFmetaRelationshipLength] = theInverseOFmetaRelationship;

      // Set the new collection
    setInverseOFmetaRelationshipPrivileged( theCtxt, otherInverseOFmetaRelationship);
  }









    /* Privileged Write accessor for role InverseOFmetaRelationship
     */
  public void removeInverseOFmetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theInverseOFmetaRelationship) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaRelationship == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someInverseOFmetaRelationship = getInverseOFmetaRelationshipPrivileged( theCtxt);
    if( someInverseOFmetaRelationship == null) { return;}

      // Check for new InverseOFmetaRelationship not in collection
    int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaRelationshipLength ; anIndex++) {
      if( theInverseOFmetaRelationship.sameAs( theCtxt, someInverseOFmetaRelationship[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFmetaRelationship element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaRelationship = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaRelationshipLength - 1];
    try {
      System.arraycopy( someInverseOFmetaRelationship, 0, otherInverseOFmetaRelationship, 0, aFoundIndex);
      System.arraycopy( someInverseOFmetaRelationship, aFoundIndex + 1, otherInverseOFmetaRelationship, aFoundIndex, aInverseOFmetaRelationshipLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaRelationshipPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaRelationshipPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaRelationshipPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFmetaRelationshipPrivileged( theCtxt, otherInverseOFmetaRelationship);
  }






    /* Privileged Read accessor for role InverseOFmetaRelationship
     * Guaranteed to return object with same identity of the InverseOFmetaRelationship
     */
  public com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] getInverseOFmetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFmetaRelationship;
  }




    /* Set reference in role InverseOFmetaRelationship
     * Used by relationship maintenance machinery
     */
  public void setInverseOFmetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] theInverseOFmetaRelationshipCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] aInverseOFmetaRelationship = vrInverseOFmetaRelationship;
    vrInverseOFmetaRelationship = theInverseOFmetaRelationshipCollection;
      // Propagate change
    change( theCtxt, "InverseOFmetaRelationship", aInverseOFmetaRelationship, vrInverseOFmetaRelationship, "vrInverseOFmetaRelationship");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFreplicatedMetaRelationship
 ****************************************************************************/


    /* Public Read accessor for role InverseOFreplicatedMetaRelationship
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] getInverseOFreplicatedMetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFreplicatedMetaRelationshipPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFreplicatedMetaRelationshipPR( theCtxt);
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

    /* Public InverseOFreplicatedMetaRelationship number access
     */
  public int numInverseOFreplicatedMetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFreplicatedMetaRelationshipPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFreplicatedMetaRelationshipPR( theCtxt);
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



    /* Public InverseOFreplicatedMetaRelationship read accessor by index
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc getInverseOFreplicatedMetaRelationshipAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFreplicatedMetaRelationshipAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFreplicatedMetaRelationshipAtPR( theCtxt, theIndex);
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


    /* Public InverseOFreplicatedMetaRelationship finder by name
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc findInverseOFreplicatedMetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFreplicatedMetaRelationshipNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFreplicatedMetaRelationshipNamedPR( theCtxt, theMMName);
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




    /* Public InverseOFreplicatedMetaRelationship is related predicate
     */
  public boolean hasInverseOFreplicatedMetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFreplicatedMetaRelationshipNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFreplicatedMetaRelationshipNamedPR( theCtxt, theMMName);
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



    /* Transactional InverseOFreplicatedMetaRelationship is related  predicate
     */
  public boolean hasInverseOFreplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);
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


    /* Public InverseOFreplicatedMetaRelationship index access
     */
  public int indexOfInverseOFreplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);
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






    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFreplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);
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



    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFreplicatedMetaRelationshipBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theRelativeInverseOFreplicatedMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFreplicatedMetaRelationshipBeforePR( theCtxt, theInverseOFreplicatedMetaRelationship, theRelativeInverseOFreplicatedMetaRelationship);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFreplicatedMetaRelationshipBeforePR( theCtxt, theInverseOFreplicatedMetaRelationship, theRelativeInverseOFreplicatedMetaRelationship);
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





    /* Transactional Public Write Remove accessor for role InverseOFreplicatedMetaRelationship
     */
  public void removeInverseOFreplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);
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



    /* Public reorder accessor for role InverseOFreplicatedMetaRelationship
     */
  public void moveInverseOFreplicatedMetaRelationshipBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theRelativeInverseOFreplicatedMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFreplicatedMetaRelationshipBeforePR( theCtxt, theInverseOFreplicatedMetaRelationship, theRelativeInverseOFreplicatedMetaRelationship);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFreplicatedMetaRelationshipBeforePR( theCtxt, theInverseOFreplicatedMetaRelationship, theRelativeInverseOFreplicatedMetaRelationship);
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



    /* Public reorder accessor for role InverseOFreplicatedMetaRelationship
     */
  public void moveInverseOFreplicatedMetaRelationshipToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFreplicatedMetaRelationshipToLastPR( theCtxt, theInverseOFreplicatedMetaRelationship);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFreplicatedMetaRelationshipToLastPR( theCtxt, theInverseOFreplicatedMetaRelationship);
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
 *  Implementation of internal operations for relationship InverseOFreplicatedMetaRelationship
 ****************************************************************************/


    /* Public Read accessor for role InverseOFreplicatedMetaRelationship
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] getInverseOFreplicatedMetaRelationshipPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationshipPrivileged( theCtxt);
    if( someInverseOFreplicatedMetaRelationship == null) { return null;}

    int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;
    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] otherInverseOFreplicatedMetaRelationship = new com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[ aInverseOFreplicatedMetaRelationshipLength];
    try { System.arraycopy( someInverseOFreplicatedMetaRelationship, 0, otherInverseOFreplicatedMetaRelationship, 0, aInverseOFreplicatedMetaRelationshipLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFreplicatedMetaRelationship", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFreplicatedMetaRelationship", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFreplicatedMetaRelationship", null); return null;}


    return otherInverseOFreplicatedMetaRelationship;
  }



    /* Public InverseOFreplicatedMetaRelationship finder by name
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc findInverseOFreplicatedMetaRelationshipNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationshipPrivileged( theCtxt);
    if( someInverseOFreplicatedMetaRelationship == null) { return null;}

      // Check for new InverseOFreplicatedMetaRelationship already in collection
    int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;
    for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaRelationshipLength ; anIndex++) {
      com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv aInverseOFreplicatedMetaRelationship = someInverseOFreplicatedMetaRelationship[ anIndex];
      if( aInverseOFreplicatedMetaRelationship.sameNameAs( theCtxt, theMMName)) { return aInverseOFreplicatedMetaRelationship;}
    }
    return null;
  }



    /* Public InverseOFreplicatedMetaRelationship finder predicate by name
     */
  public boolean hasInverseOFreplicatedMetaRelationshipNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFreplicatedMetaRelationshipNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFreplicatedMetaRelationship read accessor by index
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc getInverseOFreplicatedMetaRelationshipAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationshipPrivileged( theCtxt);
    if( someInverseOFreplicatedMetaRelationship == null) { return null;}

      // Get number of InverseOFreplicatedMetaRelationship
    int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;

      // Verify index within array length
    if( theIndex >= aInverseOFreplicatedMetaRelationshipLength) { return null;}

      // Get indexed InverseOFreplicatedMetaRelationship
    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc aInverseOFreplicatedMetaRelationship = someInverseOFreplicatedMetaRelationship[ theIndex];

    return aInverseOFreplicatedMetaRelationship;
  }



    /* Public InverseOFreplicatedMetaRelationship is related predicate
     */
  public boolean hasInverseOFreplicatedMetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException {
    return indexOfInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship) >= 0;
  }


    /* Public InverseOFreplicatedMetaRelationship index access
     */
  public int indexOfInverseOFreplicatedMetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFreplicatedMetaRelationship == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationshipPrivileged( theCtxt);
    if( someInverseOFreplicatedMetaRelationship == null) { return -1;}

      // Check for new InverseOFreplicatedMetaRelationship already in collection
    int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;
    for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaRelationshipLength ; anIndex++) {
      if( someInverseOFreplicatedMetaRelationship[ anIndex].sameAs( theCtxt, theInverseOFreplicatedMetaRelationship)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFreplicatedMetaRelationship number access
     */
  public int numInverseOFreplicatedMetaRelationshipPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationshipPrivileged( theCtxt);
    if( someInverseOFreplicatedMetaRelationship == null) { return 0;}

      // Check for new InverseOFreplicatedMetaRelationship already in collection
    int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;
    return aInverseOFreplicatedMetaRelationshipLength;
  }




    /* Public Write accessor for role InverseOFreplicatedMetaRelationship
     */
  public void addInverseOFreplicatedMetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFreplicatedMetaRelationship == null) { return;}

      // Get current value
    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationshipPrivileged( theCtxt);
    if( someInverseOFreplicatedMetaRelationship == null) { return;}

      // Check for new InverseOFreplicatedMetaRelationship already in collection
    int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;
    for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaRelationshipLength ; anIndex++) {
      if( theInverseOFreplicatedMetaRelationship.sameAs( theCtxt, someInverseOFreplicatedMetaRelationship[ anIndex])) { return;}
    }

    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv aNewInverseOFreplicatedMetaRelationship = (com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv) theInverseOFreplicatedMetaRelationship;

      // Link reverse ref to this object
    aNewInverseOFreplicatedMetaRelationship.unsetAndSetReplicatedMetaRelationshipPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFreplicatedMetaRelationship element
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] otherInverseOFreplicatedMetaRelationship = new com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[ aInverseOFreplicatedMetaRelationshipLength + 1];
    try { System.arraycopy( someInverseOFreplicatedMetaRelationship, 0, otherInverseOFreplicatedMetaRelationship, 0, aInverseOFreplicatedMetaRelationshipLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaRelationship", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaRelationship", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaRelationship", null); return;}
    otherInverseOFreplicatedMetaRelationship[ aInverseOFreplicatedMetaRelationshipLength] = aNewInverseOFreplicatedMetaRelationship;

      // Set the new collection
    setInverseOFreplicatedMetaRelationshipPrivileged( theCtxt, otherInverseOFreplicatedMetaRelationship);
  }




    /* Public ordered Write accessor for role InverseOFreplicatedMetaRelationship
     */
  public void addInverseOFreplicatedMetaRelationshipBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theRelativeInverseOFreplicatedMetaRelationship) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFreplicatedMetaRelationship == null) { return;}

      // If relative InverseOFreplicatedMetaRelationship is null, perform normal add operation
    if( theRelativeInverseOFreplicatedMetaRelationship == null) {
      addInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);
    }

      // Get current value
    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationshipPrivileged( theCtxt);
    if( someInverseOFreplicatedMetaRelationship == null) { return;}


      // Get index of relative InverseOFreplicatedMetaRelationship
    int aRelativeIndex = indexOfInverseOFreplicatedMetaRelationshipPR( theCtxt, theRelativeInverseOFreplicatedMetaRelationship);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);
    }

      // Get length of InverseOFreplicatedMetaRelationship array
    int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFreplicatedMetaRelationshipLength) {
      addInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);
    }

      // Check for new InverseOFreplicatedMetaRelationship already in collection
    if( hasInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship)) { return;}


    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv aNewInverseOFreplicatedMetaRelationship = (com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv) theInverseOFreplicatedMetaRelationship;

      // Link reverse ref to this object
    aNewInverseOFreplicatedMetaRelationship.unsetAndSetReplicatedMetaRelationshipPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFreplicatedMetaRelationship
      // Grow collection and add new InverseOFreplicatedMetaRelationship element
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] otherInverseOFreplicatedMetaRelationship = new com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[ aInverseOFreplicatedMetaRelationshipLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFreplicatedMetaRelationship, 0, otherInverseOFreplicatedMetaRelationship, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFreplicatedMetaRelationship, aRelativeIndex, otherInverseOFreplicatedMetaRelationship, aRelativeIndex + 1, aInverseOFreplicatedMetaRelationshipLength - aRelativeIndex);
      otherInverseOFreplicatedMetaRelationship[ aRelativeIndex] = aNewInverseOFreplicatedMetaRelationship;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaRelationshipBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaRelationshipBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaRelationshipBefore", null); return;}

      // Set the new collection
    setInverseOFreplicatedMetaRelationshipPrivileged( theCtxt, otherInverseOFreplicatedMetaRelationship);
  }





    /* Public Write accessor for role InverseOFreplicatedMetaRelationship
     */
  public void removeInverseOFreplicatedMetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFreplicatedMetaRelationship == null) { return;}

      // Get current value
    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationshipPrivileged( theCtxt);
    if( someInverseOFreplicatedMetaRelationship == null) { return;}

      // Check for new InverseOFreplicatedMetaRelationship not in collection
    int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaRelationshipLength ; anIndex++) {
      if( theInverseOFreplicatedMetaRelationship.sameAs( theCtxt, someInverseOFreplicatedMetaRelationship[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv aNewInverseOFreplicatedMetaRelationship = (com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv) theInverseOFreplicatedMetaRelationship;

      // Unlink reverse ref from the new related object
    aNewInverseOFreplicatedMetaRelationship.unsetReplicatedMetaRelationshipPrivileged( theCtxt);

      // Shrink collection removing InverseOFreplicatedMetaRelationship element
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] otherInverseOFreplicatedMetaRelationship = new com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[ aInverseOFreplicatedMetaRelationshipLength - 1];
    try {
      System.arraycopy( someInverseOFreplicatedMetaRelationship, 0, otherInverseOFreplicatedMetaRelationship, 0, aFoundIndex);
      System.arraycopy( someInverseOFreplicatedMetaRelationship, aFoundIndex + 1, otherInverseOFreplicatedMetaRelationship, aFoundIndex, aInverseOFreplicatedMetaRelationshipLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFreplicatedMetaRelationship", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFreplicatedMetaRelationship", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFreplicatedMetaRelationship", null); return;}

      // Set the new collection
    setInverseOFreplicatedMetaRelationshipPrivileged( theCtxt, otherInverseOFreplicatedMetaRelationship);
  }




    /* Public reorder accessor for role InverseOFreplicatedMetaRelationship
     */
  public void moveInverseOFreplicatedMetaRelationshipBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theRelativeInverseOFreplicatedMetaRelationship) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFreplicatedMetaRelationship == null) { return;}

      // If relative InverseOFreplicatedMetaRelationship is null, perform move to last position
    if( theRelativeInverseOFreplicatedMetaRelationship == null) {
      moveInverseOFreplicatedMetaRelationshipToLastPR( theCtxt, theInverseOFreplicatedMetaRelationship);
    }

      // Get current value
    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationshipPrivileged( theCtxt);
    if( someInverseOFreplicatedMetaRelationship == null) { return;}

      // Get length of InverseOFreplicatedMetaRelationship array
    int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;

      // Get index of InverseOFreplicatedMetaRelationship to move
    int aToMoveIndex = indexOfInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);
      // If toMove InverseOFreplicatedMetaRelationship not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFreplicatedMetaRelationshipLength) {
      moveInverseOFreplicatedMetaRelationshipToLastPR( theCtxt, theInverseOFreplicatedMetaRelationship);
    }

      // Get index of relative InverseOFreplicatedMetaRelationship
    int aRelativeIndex = indexOfInverseOFreplicatedMetaRelationshipPR( theCtxt, theRelativeInverseOFreplicatedMetaRelationship);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFreplicatedMetaRelationshipToLastPR( theCtxt, theInverseOFreplicatedMetaRelationship);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFreplicatedMetaRelationshipLength) {
      moveInverseOFreplicatedMetaRelationshipToLastPR( theCtxt, theInverseOFreplicatedMetaRelationship);
    }

      // ToMove and relative InverseOFreplicatedMetaRelationship are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv aToMoveInverseOFreplicatedMetaRelationship = (com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv) theInverseOFreplicatedMetaRelationship;

      // Allocate new array for new version of state of relationship InverseOFreplicatedMetaRelationship
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] otherInverseOFreplicatedMetaRelationship = new com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[ aInverseOFreplicatedMetaRelationshipLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFreplicatedMetaRelationship, 0, otherInverseOFreplicatedMetaRelationship, 0, aToMoveIndex );
        System.arraycopy( someInverseOFreplicatedMetaRelationship, aToMoveIndex + 1, otherInverseOFreplicatedMetaRelationship, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFreplicatedMetaRelationship[ aRelativeIndex - 1] = aToMoveInverseOFreplicatedMetaRelationship;
        System.arraycopy( someInverseOFreplicatedMetaRelationship, aRelativeIndex, otherInverseOFreplicatedMetaRelationship, aRelativeIndex, aInverseOFreplicatedMetaRelationshipLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFreplicatedMetaRelationship, 0, otherInverseOFreplicatedMetaRelationship, 0, aRelativeIndex );
        otherInverseOFreplicatedMetaRelationship[ aRelativeIndex ] = aToMoveInverseOFreplicatedMetaRelationship;
        System.arraycopy( someInverseOFreplicatedMetaRelationship, aRelativeIndex, otherInverseOFreplicatedMetaRelationship, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFreplicatedMetaRelationshipLength - 1) {
          System.arraycopy( someInverseOFreplicatedMetaRelationship, aToMoveIndex + 1, otherInverseOFreplicatedMetaRelationship, aToMoveIndex + 1, aInverseOFreplicatedMetaRelationshipLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFreplicatedMetaRelationshipBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFreplicatedMetaRelationshipBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFreplicatedMetaRelationshipBefore", null); return;}

      // Set the new collection
    setInverseOFreplicatedMetaRelationshipPrivileged( theCtxt, otherInverseOFreplicatedMetaRelationship);
  }





    /* Public move to last accessor for role InverseOFreplicatedMetaRelationship
     */
  public void moveInverseOFreplicatedMetaRelationshipToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFreplicatedMetaRelationship == null) { return;}

      // Get current value
    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationshipPrivileged( theCtxt);
    if( someInverseOFreplicatedMetaRelationship == null) { return;}

      // Get length of InverseOFreplicatedMetaRelationship array
    int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;

      // Get index of InverseOFreplicatedMetaRelationship to move
    int aToMoveIndex = indexOfInverseOFreplicatedMetaRelationshipPR( theCtxt, theInverseOFreplicatedMetaRelationship);

      // If toMove InverseOFreplicatedMetaRelationship not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFreplicatedMetaRelationshipLength - 1) { return;}

    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv aToMoveInverseOFreplicatedMetaRelationship = (com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv) theInverseOFreplicatedMetaRelationship;

      // Allocate new array for new version of state of relationship InverseOFreplicatedMetaRelationship
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] otherInverseOFreplicatedMetaRelationship = new com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[ aInverseOFreplicatedMetaRelationshipLength];
    try {
      System.arraycopy( someInverseOFreplicatedMetaRelationship, 0, otherInverseOFreplicatedMetaRelationship, 0, aToMoveIndex );
      System.arraycopy( someInverseOFreplicatedMetaRelationship, aToMoveIndex + 1, otherInverseOFreplicatedMetaRelationship, aToMoveIndex, aInverseOFreplicatedMetaRelationshipLength - aToMoveIndex - 1);
      otherInverseOFreplicatedMetaRelationship[ aInverseOFreplicatedMetaRelationshipLength - 1] = aToMoveInverseOFreplicatedMetaRelationship;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFreplicatedMetaRelationshipToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFreplicatedMetaRelationshipToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFreplicatedMetaRelationshipToLast", null); return;}

      // Set the new collection
    setInverseOFreplicatedMetaRelationshipPrivileged( theCtxt, otherInverseOFreplicatedMetaRelationship);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFreplicatedMetaRelationship
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFreplicatedMetaRelationship
     */
  public void addInverseOFreplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv theInverseOFreplicatedMetaRelationship) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFreplicatedMetaRelationship == null) { return;}

      // Get current value
    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationshipPrivileged( theCtxt);
    if( someInverseOFreplicatedMetaRelationship == null) { return;}

      // Check for new InverseOFreplicatedMetaRelationship already in collection
    int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;
    for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaRelationshipLength ; anIndex++) {
      if( theInverseOFreplicatedMetaRelationship.sameAs( theCtxt, someInverseOFreplicatedMetaRelationship[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFreplicatedMetaRelationship element
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] otherInverseOFreplicatedMetaRelationship = new com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[ aInverseOFreplicatedMetaRelationshipLength + 1];
    try {
      System.arraycopy( someInverseOFreplicatedMetaRelationship, 0, otherInverseOFreplicatedMetaRelationship, 0, aInverseOFreplicatedMetaRelationshipLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaRelationshipPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaRelationshipPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaRelationshipPrivileged", null); return;}

    otherInverseOFreplicatedMetaRelationship[ aInverseOFreplicatedMetaRelationshipLength] = theInverseOFreplicatedMetaRelationship;

      // Set the new collection
    setInverseOFreplicatedMetaRelationshipPrivileged( theCtxt, otherInverseOFreplicatedMetaRelationship);
  }









    /* Privileged Write accessor for role InverseOFreplicatedMetaRelationship
     */
  public void removeInverseOFreplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv theInverseOFreplicatedMetaRelationship) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFreplicatedMetaRelationship == null) { return;}

      // Get current value
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationshipPrivileged( theCtxt);
    if( someInverseOFreplicatedMetaRelationship == null) { return;}

      // Check for new InverseOFreplicatedMetaRelationship not in collection
    int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaRelationshipLength ; anIndex++) {
      if( theInverseOFreplicatedMetaRelationship.sameAs( theCtxt, someInverseOFreplicatedMetaRelationship[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFreplicatedMetaRelationship element
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] otherInverseOFreplicatedMetaRelationship = new com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[ aInverseOFreplicatedMetaRelationshipLength - 1];
    try {
      System.arraycopy( someInverseOFreplicatedMetaRelationship, 0, otherInverseOFreplicatedMetaRelationship, 0, aFoundIndex);
      System.arraycopy( someInverseOFreplicatedMetaRelationship, aFoundIndex + 1, otherInverseOFreplicatedMetaRelationship, aFoundIndex, aInverseOFreplicatedMetaRelationshipLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFreplicatedMetaRelationshipPrivileged", new Class[] { com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFreplicatedMetaRelationshipPrivileged", new Class[] { com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFreplicatedMetaRelationshipPrivileged", new Class[] { com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv.class}); return;}

      // Set the new collection
    setInverseOFreplicatedMetaRelationshipPrivileged( theCtxt, otherInverseOFreplicatedMetaRelationship);
  }






    /* Privileged Read accessor for role InverseOFreplicatedMetaRelationship
     * Guaranteed to return object with same identity of the InverseOFreplicatedMetaRelationship
     */
  public com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] getInverseOFreplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFreplicatedMetaRelationship;
  }




    /* Set reference in role InverseOFreplicatedMetaRelationship
     * Used by relationship maintenance machinery
     */
  public void setInverseOFreplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] theInverseOFreplicatedMetaRelationshipCollection) throws EAIException {
    com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] aInverseOFreplicatedMetaRelationship = vrInverseOFreplicatedMetaRelationship;
    vrInverseOFreplicatedMetaRelationship = theInverseOFreplicatedMetaRelationshipCollection;
      // Propagate change
    change( theCtxt, "InverseOFreplicatedMetaRelationship", aInverseOFreplicatedMetaRelationship, vrInverseOFreplicatedMetaRelationship, "vrInverseOFreplicatedMetaRelationship");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFtargetToTransfomations
 ****************************************************************************/


    /* Public Read accessor for role InverseOFtargetToTransfomations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFtargetToTransfomations( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFtargetToTransfomationsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFtargetToTransfomationsPR( theCtxt);
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

    /* Public InverseOFtargetToTransfomations number access
     */
  public int numInverseOFtargetToTransfomations( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFtargetToTransfomationsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFtargetToTransfomationsPR( theCtxt);
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



    /* Public InverseOFtargetToTransfomations read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFtargetToTransfomationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFtargetToTransfomationsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFtargetToTransfomationsAtPR( theCtxt, theIndex);
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


    /* Public InverseOFtargetToTransfomations finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFtargetToTransfomationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFtargetToTransfomationsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFtargetToTransfomationsNamedPR( theCtxt, theMMName);
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




    /* Public InverseOFtargetToTransfomations is related predicate
     */
  public boolean hasInverseOFtargetToTransfomationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFtargetToTransfomationsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFtargetToTransfomationsNamedPR( theCtxt, theMMName);
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



    /* Transactional InverseOFtargetToTransfomations is related  predicate
     */
  public boolean hasInverseOFtargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);
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


    /* Public InverseOFtargetToTransfomations index access
     */
  public int indexOfInverseOFtargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);
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






    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFtargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);
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



    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFtargetToTransfomationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtargetToTransfomations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFtargetToTransfomationsBeforePR( theCtxt, theInverseOFtargetToTransfomations, theRelativeInverseOFtargetToTransfomations);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFtargetToTransfomationsBeforePR( theCtxt, theInverseOFtargetToTransfomations, theRelativeInverseOFtargetToTransfomations);
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





    /* Transactional Public Write Remove accessor for role InverseOFtargetToTransfomations
     */
  public void removeInverseOFtargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);
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



    /* Public reorder accessor for role InverseOFtargetToTransfomations
     */
  public void moveInverseOFtargetToTransfomationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtargetToTransfomations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFtargetToTransfomationsBeforePR( theCtxt, theInverseOFtargetToTransfomations, theRelativeInverseOFtargetToTransfomations);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFtargetToTransfomationsBeforePR( theCtxt, theInverseOFtargetToTransfomations, theRelativeInverseOFtargetToTransfomations);
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



    /* Public reorder accessor for role InverseOFtargetToTransfomations
     */
  public void moveInverseOFtargetToTransfomationsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFtargetToTransfomationsToLastPR( theCtxt, theInverseOFtargetToTransfomations);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFtargetToTransfomationsToLastPR( theCtxt, theInverseOFtargetToTransfomations);
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
 *  Implementation of internal operations for relationship InverseOFtargetToTransfomations
 ****************************************************************************/


    /* Public Read accessor for role InverseOFtargetToTransfomations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFtargetToTransfomationsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomationsPrivileged( theCtxt);
    if( someInverseOFtargetToTransfomations == null) { return null;}

    int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] otherInverseOFtargetToTransfomations = new com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[ aInverseOFtargetToTransfomationsLength];
    try { System.arraycopy( someInverseOFtargetToTransfomations, 0, otherInverseOFtargetToTransfomations, 0, aInverseOFtargetToTransfomationsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFtargetToTransfomations", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFtargetToTransfomations", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFtargetToTransfomations", null); return null;}


    return otherInverseOFtargetToTransfomations;
  }



    /* Public InverseOFtargetToTransfomations finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFtargetToTransfomationsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomationsPrivileged( theCtxt);
    if( someInverseOFtargetToTransfomations == null) { return null;}

      // Check for new InverseOFtargetToTransfomations already in collection
    int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;
    for( int anIndex = 0 ; anIndex < aInverseOFtargetToTransfomationsLength ; anIndex++) {
      com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aInverseOFtargetToTransfomations = someInverseOFtargetToTransfomations[ anIndex];
      if( aInverseOFtargetToTransfomations.sameNameAs( theCtxt, theMMName)) { return aInverseOFtargetToTransfomations;}
    }
    return null;
  }



    /* Public InverseOFtargetToTransfomations finder predicate by name
     */
  public boolean hasInverseOFtargetToTransfomationsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFtargetToTransfomationsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFtargetToTransfomations read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFtargetToTransfomationsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomationsPrivileged( theCtxt);
    if( someInverseOFtargetToTransfomations == null) { return null;}

      // Get number of InverseOFtargetToTransfomations
    int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;

      // Verify index within array length
    if( theIndex >= aInverseOFtargetToTransfomationsLength) { return null;}

      // Get indexed InverseOFtargetToTransfomations
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFtargetToTransfomations = someInverseOFtargetToTransfomations[ theIndex];

    return aInverseOFtargetToTransfomations;
  }



    /* Public InverseOFtargetToTransfomations is related predicate
     */
  public boolean hasInverseOFtargetToTransfomationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException {
    return indexOfInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations) >= 0;
  }


    /* Public InverseOFtargetToTransfomations index access
     */
  public int indexOfInverseOFtargetToTransfomationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFtargetToTransfomations == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomationsPrivileged( theCtxt);
    if( someInverseOFtargetToTransfomations == null) { return -1;}

      // Check for new InverseOFtargetToTransfomations already in collection
    int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;
    for( int anIndex = 0 ; anIndex < aInverseOFtargetToTransfomationsLength ; anIndex++) {
      if( someInverseOFtargetToTransfomations[ anIndex].sameAs( theCtxt, theInverseOFtargetToTransfomations)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFtargetToTransfomations number access
     */
  public int numInverseOFtargetToTransfomationsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomationsPrivileged( theCtxt);
    if( someInverseOFtargetToTransfomations == null) { return 0;}

      // Check for new InverseOFtargetToTransfomations already in collection
    int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;
    return aInverseOFtargetToTransfomationsLength;
  }




    /* Public Write accessor for role InverseOFtargetToTransfomations
     */
  public void addInverseOFtargetToTransfomationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtargetToTransfomations == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomationsPrivileged( theCtxt);
    if( someInverseOFtargetToTransfomations == null) { return;}

      // Check for new InverseOFtargetToTransfomations already in collection
    int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;
    for( int anIndex = 0 ; anIndex < aInverseOFtargetToTransfomationsLength ; anIndex++) {
      if( theInverseOFtargetToTransfomations.sameAs( theCtxt, someInverseOFtargetToTransfomations[ anIndex])) { return;}
    }

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFtargetToTransfomations = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtargetToTransfomations;

      // Link reverse ref to this object
    aNewInverseOFtargetToTransfomations.unsetAndSetTargetToTransfomationsPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFtargetToTransfomations element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtargetToTransfomations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtargetToTransfomationsLength + 1];
    try { System.arraycopy( someInverseOFtargetToTransfomations, 0, otherInverseOFtargetToTransfomations, 0, aInverseOFtargetToTransfomationsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtargetToTransfomations", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtargetToTransfomations", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtargetToTransfomations", null); return;}
    otherInverseOFtargetToTransfomations[ aInverseOFtargetToTransfomationsLength] = aNewInverseOFtargetToTransfomations;

      // Set the new collection
    setInverseOFtargetToTransfomationsPrivileged( theCtxt, otherInverseOFtargetToTransfomations);
  }




    /* Public ordered Write accessor for role InverseOFtargetToTransfomations
     */
  public void addInverseOFtargetToTransfomationsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtargetToTransfomations) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtargetToTransfomations == null) { return;}

      // If relative InverseOFtargetToTransfomations is null, perform normal add operation
    if( theRelativeInverseOFtargetToTransfomations == null) {
      addInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomationsPrivileged( theCtxt);
    if( someInverseOFtargetToTransfomations == null) { return;}


      // Get index of relative InverseOFtargetToTransfomations
    int aRelativeIndex = indexOfInverseOFtargetToTransfomationsPR( theCtxt, theRelativeInverseOFtargetToTransfomations);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);
    }

      // Get length of InverseOFtargetToTransfomations array
    int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFtargetToTransfomationsLength) {
      addInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);
    }

      // Check for new InverseOFtargetToTransfomations already in collection
    if( hasInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations)) { return;}


    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFtargetToTransfomations = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtargetToTransfomations;

      // Link reverse ref to this object
    aNewInverseOFtargetToTransfomations.unsetAndSetTargetToTransfomationsPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFtargetToTransfomations
      // Grow collection and add new InverseOFtargetToTransfomations element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtargetToTransfomations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtargetToTransfomationsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFtargetToTransfomations, 0, otherInverseOFtargetToTransfomations, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFtargetToTransfomations, aRelativeIndex, otherInverseOFtargetToTransfomations, aRelativeIndex + 1, aInverseOFtargetToTransfomationsLength - aRelativeIndex);
      otherInverseOFtargetToTransfomations[ aRelativeIndex] = aNewInverseOFtargetToTransfomations;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtargetToTransfomationsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtargetToTransfomationsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtargetToTransfomationsBefore", null); return;}

      // Set the new collection
    setInverseOFtargetToTransfomationsPrivileged( theCtxt, otherInverseOFtargetToTransfomations);
  }





    /* Public Write accessor for role InverseOFtargetToTransfomations
     */
  public void removeInverseOFtargetToTransfomationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtargetToTransfomations == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomationsPrivileged( theCtxt);
    if( someInverseOFtargetToTransfomations == null) { return;}

      // Check for new InverseOFtargetToTransfomations not in collection
    int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFtargetToTransfomationsLength ; anIndex++) {
      if( theInverseOFtargetToTransfomations.sameAs( theCtxt, someInverseOFtargetToTransfomations[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFtargetToTransfomations = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtargetToTransfomations;

      // Unlink reverse ref from the new related object
    aNewInverseOFtargetToTransfomations.unsetTargetToTransfomationsPrivileged( theCtxt);

      // Shrink collection removing InverseOFtargetToTransfomations element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtargetToTransfomations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtargetToTransfomationsLength - 1];
    try {
      System.arraycopy( someInverseOFtargetToTransfomations, 0, otherInverseOFtargetToTransfomations, 0, aFoundIndex);
      System.arraycopy( someInverseOFtargetToTransfomations, aFoundIndex + 1, otherInverseOFtargetToTransfomations, aFoundIndex, aInverseOFtargetToTransfomationsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtargetToTransfomations", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtargetToTransfomations", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtargetToTransfomations", null); return;}

      // Set the new collection
    setInverseOFtargetToTransfomationsPrivileged( theCtxt, otherInverseOFtargetToTransfomations);
  }




    /* Public reorder accessor for role InverseOFtargetToTransfomations
     */
  public void moveInverseOFtargetToTransfomationsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtargetToTransfomations) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFtargetToTransfomations == null) { return;}

      // If relative InverseOFtargetToTransfomations is null, perform move to last position
    if( theRelativeInverseOFtargetToTransfomations == null) {
      moveInverseOFtargetToTransfomationsToLastPR( theCtxt, theInverseOFtargetToTransfomations);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomationsPrivileged( theCtxt);
    if( someInverseOFtargetToTransfomations == null) { return;}

      // Get length of InverseOFtargetToTransfomations array
    int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;

      // Get index of InverseOFtargetToTransfomations to move
    int aToMoveIndex = indexOfInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);
      // If toMove InverseOFtargetToTransfomations not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFtargetToTransfomationsLength) {
      moveInverseOFtargetToTransfomationsToLastPR( theCtxt, theInverseOFtargetToTransfomations);
    }

      // Get index of relative InverseOFtargetToTransfomations
    int aRelativeIndex = indexOfInverseOFtargetToTransfomationsPR( theCtxt, theRelativeInverseOFtargetToTransfomations);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFtargetToTransfomationsToLastPR( theCtxt, theInverseOFtargetToTransfomations);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFtargetToTransfomationsLength) {
      moveInverseOFtargetToTransfomationsToLastPR( theCtxt, theInverseOFtargetToTransfomations);
    }

      // ToMove and relative InverseOFtargetToTransfomations are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFtargetToTransfomations = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtargetToTransfomations;

      // Allocate new array for new version of state of relationship InverseOFtargetToTransfomations
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtargetToTransfomations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtargetToTransfomationsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFtargetToTransfomations, 0, otherInverseOFtargetToTransfomations, 0, aToMoveIndex );
        System.arraycopy( someInverseOFtargetToTransfomations, aToMoveIndex + 1, otherInverseOFtargetToTransfomations, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFtargetToTransfomations[ aRelativeIndex - 1] = aToMoveInverseOFtargetToTransfomations;
        System.arraycopy( someInverseOFtargetToTransfomations, aRelativeIndex, otherInverseOFtargetToTransfomations, aRelativeIndex, aInverseOFtargetToTransfomationsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFtargetToTransfomations, 0, otherInverseOFtargetToTransfomations, 0, aRelativeIndex );
        otherInverseOFtargetToTransfomations[ aRelativeIndex ] = aToMoveInverseOFtargetToTransfomations;
        System.arraycopy( someInverseOFtargetToTransfomations, aRelativeIndex, otherInverseOFtargetToTransfomations, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFtargetToTransfomationsLength - 1) {
          System.arraycopy( someInverseOFtargetToTransfomations, aToMoveIndex + 1, otherInverseOFtargetToTransfomations, aToMoveIndex + 1, aInverseOFtargetToTransfomationsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtargetToTransfomationsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtargetToTransfomationsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtargetToTransfomationsBefore", null); return;}

      // Set the new collection
    setInverseOFtargetToTransfomationsPrivileged( theCtxt, otherInverseOFtargetToTransfomations);
  }





    /* Public move to last accessor for role InverseOFtargetToTransfomations
     */
  public void moveInverseOFtargetToTransfomationsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFtargetToTransfomations == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomationsPrivileged( theCtxt);
    if( someInverseOFtargetToTransfomations == null) { return;}

      // Get length of InverseOFtargetToTransfomations array
    int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;

      // Get index of InverseOFtargetToTransfomations to move
    int aToMoveIndex = indexOfInverseOFtargetToTransfomationsPR( theCtxt, theInverseOFtargetToTransfomations);

      // If toMove InverseOFtargetToTransfomations not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFtargetToTransfomationsLength - 1) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFtargetToTransfomations = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtargetToTransfomations;

      // Allocate new array for new version of state of relationship InverseOFtargetToTransfomations
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtargetToTransfomations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtargetToTransfomationsLength];
    try {
      System.arraycopy( someInverseOFtargetToTransfomations, 0, otherInverseOFtargetToTransfomations, 0, aToMoveIndex );
      System.arraycopy( someInverseOFtargetToTransfomations, aToMoveIndex + 1, otherInverseOFtargetToTransfomations, aToMoveIndex, aInverseOFtargetToTransfomationsLength - aToMoveIndex - 1);
      otherInverseOFtargetToTransfomations[ aInverseOFtargetToTransfomationsLength - 1] = aToMoveInverseOFtargetToTransfomations;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtargetToTransfomationsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtargetToTransfomationsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtargetToTransfomationsToLast", null); return;}

      // Set the new collection
    setInverseOFtargetToTransfomationsPrivileged( theCtxt, otherInverseOFtargetToTransfomations);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFtargetToTransfomations
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFtargetToTransfomations
     */
  public void addInverseOFtargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFtargetToTransfomations) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtargetToTransfomations == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomationsPrivileged( theCtxt);
    if( someInverseOFtargetToTransfomations == null) { return;}

      // Check for new InverseOFtargetToTransfomations already in collection
    int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;
    for( int anIndex = 0 ; anIndex < aInverseOFtargetToTransfomationsLength ; anIndex++) {
      if( theInverseOFtargetToTransfomations.sameAs( theCtxt, someInverseOFtargetToTransfomations[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFtargetToTransfomations element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtargetToTransfomations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtargetToTransfomationsLength + 1];
    try {
      System.arraycopy( someInverseOFtargetToTransfomations, 0, otherInverseOFtargetToTransfomations, 0, aInverseOFtargetToTransfomationsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtargetToTransfomationsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtargetToTransfomationsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtargetToTransfomationsPrivileged", null); return;}

    otherInverseOFtargetToTransfomations[ aInverseOFtargetToTransfomationsLength] = theInverseOFtargetToTransfomations;

      // Set the new collection
    setInverseOFtargetToTransfomationsPrivileged( theCtxt, otherInverseOFtargetToTransfomations);
  }









    /* Privileged Write accessor for role InverseOFtargetToTransfomations
     */
  public void removeInverseOFtargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFtargetToTransfomations) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtargetToTransfomations == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomationsPrivileged( theCtxt);
    if( someInverseOFtargetToTransfomations == null) { return;}

      // Check for new InverseOFtargetToTransfomations not in collection
    int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFtargetToTransfomationsLength ; anIndex++) {
      if( theInverseOFtargetToTransfomations.sameAs( theCtxt, someInverseOFtargetToTransfomations[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFtargetToTransfomations element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtargetToTransfomations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtargetToTransfomationsLength - 1];
    try {
      System.arraycopy( someInverseOFtargetToTransfomations, 0, otherInverseOFtargetToTransfomations, 0, aFoundIndex);
      System.arraycopy( someInverseOFtargetToTransfomations, aFoundIndex + 1, otherInverseOFtargetToTransfomations, aFoundIndex, aInverseOFtargetToTransfomationsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtargetToTransfomationsPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtargetToTransfomationsPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtargetToTransfomationsPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFtargetToTransfomationsPrivileged( theCtxt, otherInverseOFtargetToTransfomations);
  }






    /* Privileged Read accessor for role InverseOFtargetToTransfomations
     * Guaranteed to return object with same identity of the InverseOFtargetToTransfomations
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFtargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFtargetToTransfomations;
  }




    /* Set reference in role InverseOFtargetToTransfomations
     * Used by relationship maintenance machinery
     */
  public void setInverseOFtargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFtargetToTransfomationsCollection) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] aInverseOFtargetToTransfomations = vrInverseOFtargetToTransfomations;
    vrInverseOFtargetToTransfomations = theInverseOFtargetToTransfomationsCollection;
      // Propagate change
    change( theCtxt, "InverseOFtargetToTransfomations", aInverseOFtargetToTransfomations, vrInverseOFtargetToTransfomations, "vrInverseOFtargetToTransfomations");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFprojectionToOriginals
 ****************************************************************************/


    /* Public Read accessor for role InverseOFprojectionToOriginals
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFprojectionToOriginals( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFprojectionToOriginalsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFprojectionToOriginalsPR( theCtxt);
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

    /* Public InverseOFprojectionToOriginals number access
     */
  public int numInverseOFprojectionToOriginals( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFprojectionToOriginalsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFprojectionToOriginalsPR( theCtxt);
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



    /* Public InverseOFprojectionToOriginals read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFprojectionToOriginalsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFprojectionToOriginalsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFprojectionToOriginalsAtPR( theCtxt, theIndex);
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


    /* Public InverseOFprojectionToOriginals finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFprojectionToOriginalsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFprojectionToOriginalsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFprojectionToOriginalsNamedPR( theCtxt, theMMName);
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




    /* Public InverseOFprojectionToOriginals is related predicate
     */
  public boolean hasInverseOFprojectionToOriginalsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFprojectionToOriginalsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFprojectionToOriginalsNamedPR( theCtxt, theMMName);
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



    /* Transactional InverseOFprojectionToOriginals is related  predicate
     */
  public boolean hasInverseOFprojectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);
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


    /* Public InverseOFprojectionToOriginals index access
     */
  public int indexOfInverseOFprojectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);
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






    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFprojectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);
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



    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFprojectionToOriginalsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectionToOriginals) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFprojectionToOriginalsBeforePR( theCtxt, theInverseOFprojectionToOriginals, theRelativeInverseOFprojectionToOriginals);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFprojectionToOriginalsBeforePR( theCtxt, theInverseOFprojectionToOriginals, theRelativeInverseOFprojectionToOriginals);
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





    /* Transactional Public Write Remove accessor for role InverseOFprojectionToOriginals
     */
  public void removeInverseOFprojectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);
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



    /* Public reorder accessor for role InverseOFprojectionToOriginals
     */
  public void moveInverseOFprojectionToOriginalsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectionToOriginals) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFprojectionToOriginalsBeforePR( theCtxt, theInverseOFprojectionToOriginals, theRelativeInverseOFprojectionToOriginals);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFprojectionToOriginalsBeforePR( theCtxt, theInverseOFprojectionToOriginals, theRelativeInverseOFprojectionToOriginals);
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



    /* Public reorder accessor for role InverseOFprojectionToOriginals
     */
  public void moveInverseOFprojectionToOriginalsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFprojectionToOriginalsToLastPR( theCtxt, theInverseOFprojectionToOriginals);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFprojectionToOriginalsToLastPR( theCtxt, theInverseOFprojectionToOriginals);
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
 *  Implementation of internal operations for relationship InverseOFprojectionToOriginals
 ****************************************************************************/


    /* Public Read accessor for role InverseOFprojectionToOriginals
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFprojectionToOriginalsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginalsPrivileged( theCtxt);
    if( someInverseOFprojectionToOriginals == null) { return null;}

    int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] otherInverseOFprojectionToOriginals = new com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[ aInverseOFprojectionToOriginalsLength];
    try { System.arraycopy( someInverseOFprojectionToOriginals, 0, otherInverseOFprojectionToOriginals, 0, aInverseOFprojectionToOriginalsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFprojectionToOriginals", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFprojectionToOriginals", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFprojectionToOriginals", null); return null;}


    return otherInverseOFprojectionToOriginals;
  }



    /* Public InverseOFprojectionToOriginals finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFprojectionToOriginalsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginalsPrivileged( theCtxt);
    if( someInverseOFprojectionToOriginals == null) { return null;}

      // Check for new InverseOFprojectionToOriginals already in collection
    int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectionToOriginalsLength ; anIndex++) {
      com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aInverseOFprojectionToOriginals = someInverseOFprojectionToOriginals[ anIndex];
      if( aInverseOFprojectionToOriginals.sameNameAs( theCtxt, theMMName)) { return aInverseOFprojectionToOriginals;}
    }
    return null;
  }



    /* Public InverseOFprojectionToOriginals finder predicate by name
     */
  public boolean hasInverseOFprojectionToOriginalsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFprojectionToOriginalsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFprojectionToOriginals read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFprojectionToOriginalsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginalsPrivileged( theCtxt);
    if( someInverseOFprojectionToOriginals == null) { return null;}

      // Get number of InverseOFprojectionToOriginals
    int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;

      // Verify index within array length
    if( theIndex >= aInverseOFprojectionToOriginalsLength) { return null;}

      // Get indexed InverseOFprojectionToOriginals
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFprojectionToOriginals = someInverseOFprojectionToOriginals[ theIndex];

    return aInverseOFprojectionToOriginals;
  }



    /* Public InverseOFprojectionToOriginals is related predicate
     */
  public boolean hasInverseOFprojectionToOriginalsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException {
    return indexOfInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals) >= 0;
  }


    /* Public InverseOFprojectionToOriginals index access
     */
  public int indexOfInverseOFprojectionToOriginalsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFprojectionToOriginals == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginalsPrivileged( theCtxt);
    if( someInverseOFprojectionToOriginals == null) { return -1;}

      // Check for new InverseOFprojectionToOriginals already in collection
    int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectionToOriginalsLength ; anIndex++) {
      if( someInverseOFprojectionToOriginals[ anIndex].sameAs( theCtxt, theInverseOFprojectionToOriginals)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFprojectionToOriginals number access
     */
  public int numInverseOFprojectionToOriginalsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginalsPrivileged( theCtxt);
    if( someInverseOFprojectionToOriginals == null) { return 0;}

      // Check for new InverseOFprojectionToOriginals already in collection
    int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;
    return aInverseOFprojectionToOriginalsLength;
  }




    /* Public Write accessor for role InverseOFprojectionToOriginals
     */
  public void addInverseOFprojectionToOriginalsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectionToOriginals == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginalsPrivileged( theCtxt);
    if( someInverseOFprojectionToOriginals == null) { return;}

      // Check for new InverseOFprojectionToOriginals already in collection
    int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectionToOriginalsLength ; anIndex++) {
      if( theInverseOFprojectionToOriginals.sameAs( theCtxt, someInverseOFprojectionToOriginals[ anIndex])) { return;}
    }

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFprojectionToOriginals = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectionToOriginals;

      // Link reverse ref to this object
    aNewInverseOFprojectionToOriginals.unsetAndSetProjectionToOriginalsPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFprojectionToOriginals element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionToOriginals = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionToOriginalsLength + 1];
    try { System.arraycopy( someInverseOFprojectionToOriginals, 0, otherInverseOFprojectionToOriginals, 0, aInverseOFprojectionToOriginalsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionToOriginals", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionToOriginals", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionToOriginals", null); return;}
    otherInverseOFprojectionToOriginals[ aInverseOFprojectionToOriginalsLength] = aNewInverseOFprojectionToOriginals;

      // Set the new collection
    setInverseOFprojectionToOriginalsPrivileged( theCtxt, otherInverseOFprojectionToOriginals);
  }




    /* Public ordered Write accessor for role InverseOFprojectionToOriginals
     */
  public void addInverseOFprojectionToOriginalsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectionToOriginals) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectionToOriginals == null) { return;}

      // If relative InverseOFprojectionToOriginals is null, perform normal add operation
    if( theRelativeInverseOFprojectionToOriginals == null) {
      addInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginalsPrivileged( theCtxt);
    if( someInverseOFprojectionToOriginals == null) { return;}


      // Get index of relative InverseOFprojectionToOriginals
    int aRelativeIndex = indexOfInverseOFprojectionToOriginalsPR( theCtxt, theRelativeInverseOFprojectionToOriginals);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);
    }

      // Get length of InverseOFprojectionToOriginals array
    int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFprojectionToOriginalsLength) {
      addInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);
    }

      // Check for new InverseOFprojectionToOriginals already in collection
    if( hasInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals)) { return;}


    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFprojectionToOriginals = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectionToOriginals;

      // Link reverse ref to this object
    aNewInverseOFprojectionToOriginals.unsetAndSetProjectionToOriginalsPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFprojectionToOriginals
      // Grow collection and add new InverseOFprojectionToOriginals element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionToOriginals = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionToOriginalsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFprojectionToOriginals, 0, otherInverseOFprojectionToOriginals, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFprojectionToOriginals, aRelativeIndex, otherInverseOFprojectionToOriginals, aRelativeIndex + 1, aInverseOFprojectionToOriginalsLength - aRelativeIndex);
      otherInverseOFprojectionToOriginals[ aRelativeIndex] = aNewInverseOFprojectionToOriginals;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionToOriginalsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionToOriginalsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionToOriginalsBefore", null); return;}

      // Set the new collection
    setInverseOFprojectionToOriginalsPrivileged( theCtxt, otherInverseOFprojectionToOriginals);
  }





    /* Public Write accessor for role InverseOFprojectionToOriginals
     */
  public void removeInverseOFprojectionToOriginalsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectionToOriginals == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginalsPrivileged( theCtxt);
    if( someInverseOFprojectionToOriginals == null) { return;}

      // Check for new InverseOFprojectionToOriginals not in collection
    int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectionToOriginalsLength ; anIndex++) {
      if( theInverseOFprojectionToOriginals.sameAs( theCtxt, someInverseOFprojectionToOriginals[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFprojectionToOriginals = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectionToOriginals;

      // Unlink reverse ref from the new related object
    aNewInverseOFprojectionToOriginals.unsetProjectionToOriginalsPrivileged( theCtxt);

      // Shrink collection removing InverseOFprojectionToOriginals element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionToOriginals = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionToOriginalsLength - 1];
    try {
      System.arraycopy( someInverseOFprojectionToOriginals, 0, otherInverseOFprojectionToOriginals, 0, aFoundIndex);
      System.arraycopy( someInverseOFprojectionToOriginals, aFoundIndex + 1, otherInverseOFprojectionToOriginals, aFoundIndex, aInverseOFprojectionToOriginalsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectionToOriginals", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectionToOriginals", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectionToOriginals", null); return;}

      // Set the new collection
    setInverseOFprojectionToOriginalsPrivileged( theCtxt, otherInverseOFprojectionToOriginals);
  }




    /* Public reorder accessor for role InverseOFprojectionToOriginals
     */
  public void moveInverseOFprojectionToOriginalsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectionToOriginals) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFprojectionToOriginals == null) { return;}

      // If relative InverseOFprojectionToOriginals is null, perform move to last position
    if( theRelativeInverseOFprojectionToOriginals == null) {
      moveInverseOFprojectionToOriginalsToLastPR( theCtxt, theInverseOFprojectionToOriginals);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginalsPrivileged( theCtxt);
    if( someInverseOFprojectionToOriginals == null) { return;}

      // Get length of InverseOFprojectionToOriginals array
    int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;

      // Get index of InverseOFprojectionToOriginals to move
    int aToMoveIndex = indexOfInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);
      // If toMove InverseOFprojectionToOriginals not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFprojectionToOriginalsLength) {
      moveInverseOFprojectionToOriginalsToLastPR( theCtxt, theInverseOFprojectionToOriginals);
    }

      // Get index of relative InverseOFprojectionToOriginals
    int aRelativeIndex = indexOfInverseOFprojectionToOriginalsPR( theCtxt, theRelativeInverseOFprojectionToOriginals);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFprojectionToOriginalsToLastPR( theCtxt, theInverseOFprojectionToOriginals);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFprojectionToOriginalsLength) {
      moveInverseOFprojectionToOriginalsToLastPR( theCtxt, theInverseOFprojectionToOriginals);
    }

      // ToMove and relative InverseOFprojectionToOriginals are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFprojectionToOriginals = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectionToOriginals;

      // Allocate new array for new version of state of relationship InverseOFprojectionToOriginals
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionToOriginals = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionToOriginalsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFprojectionToOriginals, 0, otherInverseOFprojectionToOriginals, 0, aToMoveIndex );
        System.arraycopy( someInverseOFprojectionToOriginals, aToMoveIndex + 1, otherInverseOFprojectionToOriginals, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFprojectionToOriginals[ aRelativeIndex - 1] = aToMoveInverseOFprojectionToOriginals;
        System.arraycopy( someInverseOFprojectionToOriginals, aRelativeIndex, otherInverseOFprojectionToOriginals, aRelativeIndex, aInverseOFprojectionToOriginalsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFprojectionToOriginals, 0, otherInverseOFprojectionToOriginals, 0, aRelativeIndex );
        otherInverseOFprojectionToOriginals[ aRelativeIndex ] = aToMoveInverseOFprojectionToOriginals;
        System.arraycopy( someInverseOFprojectionToOriginals, aRelativeIndex, otherInverseOFprojectionToOriginals, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFprojectionToOriginalsLength - 1) {
          System.arraycopy( someInverseOFprojectionToOriginals, aToMoveIndex + 1, otherInverseOFprojectionToOriginals, aToMoveIndex + 1, aInverseOFprojectionToOriginalsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectionToOriginalsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectionToOriginalsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectionToOriginalsBefore", null); return;}

      // Set the new collection
    setInverseOFprojectionToOriginalsPrivileged( theCtxt, otherInverseOFprojectionToOriginals);
  }





    /* Public move to last accessor for role InverseOFprojectionToOriginals
     */
  public void moveInverseOFprojectionToOriginalsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFprojectionToOriginals == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginalsPrivileged( theCtxt);
    if( someInverseOFprojectionToOriginals == null) { return;}

      // Get length of InverseOFprojectionToOriginals array
    int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;

      // Get index of InverseOFprojectionToOriginals to move
    int aToMoveIndex = indexOfInverseOFprojectionToOriginalsPR( theCtxt, theInverseOFprojectionToOriginals);

      // If toMove InverseOFprojectionToOriginals not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFprojectionToOriginalsLength - 1) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFprojectionToOriginals = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectionToOriginals;

      // Allocate new array for new version of state of relationship InverseOFprojectionToOriginals
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionToOriginals = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionToOriginalsLength];
    try {
      System.arraycopy( someInverseOFprojectionToOriginals, 0, otherInverseOFprojectionToOriginals, 0, aToMoveIndex );
      System.arraycopy( someInverseOFprojectionToOriginals, aToMoveIndex + 1, otherInverseOFprojectionToOriginals, aToMoveIndex, aInverseOFprojectionToOriginalsLength - aToMoveIndex - 1);
      otherInverseOFprojectionToOriginals[ aInverseOFprojectionToOriginalsLength - 1] = aToMoveInverseOFprojectionToOriginals;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectionToOriginalsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectionToOriginalsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectionToOriginalsToLast", null); return;}

      // Set the new collection
    setInverseOFprojectionToOriginalsPrivileged( theCtxt, otherInverseOFprojectionToOriginals);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFprojectionToOriginals
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFprojectionToOriginals
     */
  public void addInverseOFprojectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFprojectionToOriginals) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectionToOriginals == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginalsPrivileged( theCtxt);
    if( someInverseOFprojectionToOriginals == null) { return;}

      // Check for new InverseOFprojectionToOriginals already in collection
    int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectionToOriginalsLength ; anIndex++) {
      if( theInverseOFprojectionToOriginals.sameAs( theCtxt, someInverseOFprojectionToOriginals[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFprojectionToOriginals element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionToOriginals = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionToOriginalsLength + 1];
    try {
      System.arraycopy( someInverseOFprojectionToOriginals, 0, otherInverseOFprojectionToOriginals, 0, aInverseOFprojectionToOriginalsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionToOriginalsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionToOriginalsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionToOriginalsPrivileged", null); return;}

    otherInverseOFprojectionToOriginals[ aInverseOFprojectionToOriginalsLength] = theInverseOFprojectionToOriginals;

      // Set the new collection
    setInverseOFprojectionToOriginalsPrivileged( theCtxt, otherInverseOFprojectionToOriginals);
  }









    /* Privileged Write accessor for role InverseOFprojectionToOriginals
     */
  public void removeInverseOFprojectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFprojectionToOriginals) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectionToOriginals == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginalsPrivileged( theCtxt);
    if( someInverseOFprojectionToOriginals == null) { return;}

      // Check for new InverseOFprojectionToOriginals not in collection
    int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectionToOriginalsLength ; anIndex++) {
      if( theInverseOFprojectionToOriginals.sameAs( theCtxt, someInverseOFprojectionToOriginals[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFprojectionToOriginals element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionToOriginals = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionToOriginalsLength - 1];
    try {
      System.arraycopy( someInverseOFprojectionToOriginals, 0, otherInverseOFprojectionToOriginals, 0, aFoundIndex);
      System.arraycopy( someInverseOFprojectionToOriginals, aFoundIndex + 1, otherInverseOFprojectionToOriginals, aFoundIndex, aInverseOFprojectionToOriginalsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectionToOriginalsPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectionToOriginalsPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectionToOriginalsPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFprojectionToOriginalsPrivileged( theCtxt, otherInverseOFprojectionToOriginals);
  }






    /* Privileged Read accessor for role InverseOFprojectionToOriginals
     * Guaranteed to return object with same identity of the InverseOFprojectionToOriginals
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFprojectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFprojectionToOriginals;
  }




    /* Set reference in role InverseOFprojectionToOriginals
     * Used by relationship maintenance machinery
     */
  public void setInverseOFprojectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFprojectionToOriginalsCollection) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] aInverseOFprojectionToOriginals = vrInverseOFprojectionToOriginals;
    vrInverseOFprojectionToOriginals = theInverseOFprojectionToOriginalsCollection;
      // Propagate change
    change( theCtxt, "InverseOFprojectionToOriginals", aInverseOFprojectionToOriginals, vrInverseOFprojectionToOriginals, "vrInverseOFprojectionToOriginals");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFprojectedToProjections
 ****************************************************************************/


    /* Public Read accessor for role InverseOFprojectedToProjections
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFprojectedToProjections( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFprojectedToProjectionsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFprojectedToProjectionsPR( theCtxt);
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

    /* Public InverseOFprojectedToProjections number access
     */
  public int numInverseOFprojectedToProjections( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFprojectedToProjectionsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFprojectedToProjectionsPR( theCtxt);
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



    /* Public InverseOFprojectedToProjections read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFprojectedToProjectionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFprojectedToProjectionsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFprojectedToProjectionsAtPR( theCtxt, theIndex);
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


    /* Public InverseOFprojectedToProjections finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFprojectedToProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFprojectedToProjectionsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFprojectedToProjectionsNamedPR( theCtxt, theMMName);
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




    /* Public InverseOFprojectedToProjections is related predicate
     */
  public boolean hasInverseOFprojectedToProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFprojectedToProjectionsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFprojectedToProjectionsNamedPR( theCtxt, theMMName);
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



    /* Transactional InverseOFprojectedToProjections is related  predicate
     */
  public boolean hasInverseOFprojectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);
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


    /* Public InverseOFprojectedToProjections index access
     */
  public int indexOfInverseOFprojectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);
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






    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFprojectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);
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



    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFprojectedToProjectionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectedToProjections) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFprojectedToProjectionsBeforePR( theCtxt, theInverseOFprojectedToProjections, theRelativeInverseOFprojectedToProjections);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFprojectedToProjectionsBeforePR( theCtxt, theInverseOFprojectedToProjections, theRelativeInverseOFprojectedToProjections);
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





    /* Transactional Public Write Remove accessor for role InverseOFprojectedToProjections
     */
  public void removeInverseOFprojectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);
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



    /* Public reorder accessor for role InverseOFprojectedToProjections
     */
  public void moveInverseOFprojectedToProjectionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectedToProjections) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFprojectedToProjectionsBeforePR( theCtxt, theInverseOFprojectedToProjections, theRelativeInverseOFprojectedToProjections);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFprojectedToProjectionsBeforePR( theCtxt, theInverseOFprojectedToProjections, theRelativeInverseOFprojectedToProjections);
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



    /* Public reorder accessor for role InverseOFprojectedToProjections
     */
  public void moveInverseOFprojectedToProjectionsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFprojectedToProjectionsToLastPR( theCtxt, theInverseOFprojectedToProjections);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFprojectedToProjectionsToLastPR( theCtxt, theInverseOFprojectedToProjections);
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
 *  Implementation of internal operations for relationship InverseOFprojectedToProjections
 ****************************************************************************/


    /* Public Read accessor for role InverseOFprojectedToProjections
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFprojectedToProjectionsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjectionsPrivileged( theCtxt);
    if( someInverseOFprojectedToProjections == null) { return null;}

    int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] otherInverseOFprojectedToProjections = new com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[ aInverseOFprojectedToProjectionsLength];
    try { System.arraycopy( someInverseOFprojectedToProjections, 0, otherInverseOFprojectedToProjections, 0, aInverseOFprojectedToProjectionsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFprojectedToProjections", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFprojectedToProjections", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFprojectedToProjections", null); return null;}


    return otherInverseOFprojectedToProjections;
  }



    /* Public InverseOFprojectedToProjections finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFprojectedToProjectionsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjectionsPrivileged( theCtxt);
    if( someInverseOFprojectedToProjections == null) { return null;}

      // Check for new InverseOFprojectedToProjections already in collection
    int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectedToProjectionsLength ; anIndex++) {
      com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aInverseOFprojectedToProjections = someInverseOFprojectedToProjections[ anIndex];
      if( aInverseOFprojectedToProjections.sameNameAs( theCtxt, theMMName)) { return aInverseOFprojectedToProjections;}
    }
    return null;
  }



    /* Public InverseOFprojectedToProjections finder predicate by name
     */
  public boolean hasInverseOFprojectedToProjectionsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFprojectedToProjectionsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFprojectedToProjections read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFprojectedToProjectionsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjectionsPrivileged( theCtxt);
    if( someInverseOFprojectedToProjections == null) { return null;}

      // Get number of InverseOFprojectedToProjections
    int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;

      // Verify index within array length
    if( theIndex >= aInverseOFprojectedToProjectionsLength) { return null;}

      // Get indexed InverseOFprojectedToProjections
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFprojectedToProjections = someInverseOFprojectedToProjections[ theIndex];

    return aInverseOFprojectedToProjections;
  }



    /* Public InverseOFprojectedToProjections is related predicate
     */
  public boolean hasInverseOFprojectedToProjectionsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException {
    return indexOfInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections) >= 0;
  }


    /* Public InverseOFprojectedToProjections index access
     */
  public int indexOfInverseOFprojectedToProjectionsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFprojectedToProjections == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjectionsPrivileged( theCtxt);
    if( someInverseOFprojectedToProjections == null) { return -1;}

      // Check for new InverseOFprojectedToProjections already in collection
    int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectedToProjectionsLength ; anIndex++) {
      if( someInverseOFprojectedToProjections[ anIndex].sameAs( theCtxt, theInverseOFprojectedToProjections)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFprojectedToProjections number access
     */
  public int numInverseOFprojectedToProjectionsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjectionsPrivileged( theCtxt);
    if( someInverseOFprojectedToProjections == null) { return 0;}

      // Check for new InverseOFprojectedToProjections already in collection
    int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;
    return aInverseOFprojectedToProjectionsLength;
  }




    /* Public Write accessor for role InverseOFprojectedToProjections
     */
  public void addInverseOFprojectedToProjectionsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectedToProjections == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjectionsPrivileged( theCtxt);
    if( someInverseOFprojectedToProjections == null) { return;}

      // Check for new InverseOFprojectedToProjections already in collection
    int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectedToProjectionsLength ; anIndex++) {
      if( theInverseOFprojectedToProjections.sameAs( theCtxt, someInverseOFprojectedToProjections[ anIndex])) { return;}
    }

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFprojectedToProjections = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectedToProjections;

      // Link reverse ref to this object
    aNewInverseOFprojectedToProjections.unsetAndSetProjectedToProjectionsPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFprojectedToProjections element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectedToProjections = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectedToProjectionsLength + 1];
    try { System.arraycopy( someInverseOFprojectedToProjections, 0, otherInverseOFprojectedToProjections, 0, aInverseOFprojectedToProjectionsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectedToProjections", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectedToProjections", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectedToProjections", null); return;}
    otherInverseOFprojectedToProjections[ aInverseOFprojectedToProjectionsLength] = aNewInverseOFprojectedToProjections;

      // Set the new collection
    setInverseOFprojectedToProjectionsPrivileged( theCtxt, otherInverseOFprojectedToProjections);
  }




    /* Public ordered Write accessor for role InverseOFprojectedToProjections
     */
  public void addInverseOFprojectedToProjectionsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectedToProjections) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectedToProjections == null) { return;}

      // If relative InverseOFprojectedToProjections is null, perform normal add operation
    if( theRelativeInverseOFprojectedToProjections == null) {
      addInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjectionsPrivileged( theCtxt);
    if( someInverseOFprojectedToProjections == null) { return;}


      // Get index of relative InverseOFprojectedToProjections
    int aRelativeIndex = indexOfInverseOFprojectedToProjectionsPR( theCtxt, theRelativeInverseOFprojectedToProjections);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);
    }

      // Get length of InverseOFprojectedToProjections array
    int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFprojectedToProjectionsLength) {
      addInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);
    }

      // Check for new InverseOFprojectedToProjections already in collection
    if( hasInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections)) { return;}


    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFprojectedToProjections = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectedToProjections;

      // Link reverse ref to this object
    aNewInverseOFprojectedToProjections.unsetAndSetProjectedToProjectionsPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFprojectedToProjections
      // Grow collection and add new InverseOFprojectedToProjections element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectedToProjections = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectedToProjectionsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFprojectedToProjections, 0, otherInverseOFprojectedToProjections, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFprojectedToProjections, aRelativeIndex, otherInverseOFprojectedToProjections, aRelativeIndex + 1, aInverseOFprojectedToProjectionsLength - aRelativeIndex);
      otherInverseOFprojectedToProjections[ aRelativeIndex] = aNewInverseOFprojectedToProjections;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectedToProjectionsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectedToProjectionsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectedToProjectionsBefore", null); return;}

      // Set the new collection
    setInverseOFprojectedToProjectionsPrivileged( theCtxt, otherInverseOFprojectedToProjections);
  }





    /* Public Write accessor for role InverseOFprojectedToProjections
     */
  public void removeInverseOFprojectedToProjectionsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectedToProjections == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjectionsPrivileged( theCtxt);
    if( someInverseOFprojectedToProjections == null) { return;}

      // Check for new InverseOFprojectedToProjections not in collection
    int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectedToProjectionsLength ; anIndex++) {
      if( theInverseOFprojectedToProjections.sameAs( theCtxt, someInverseOFprojectedToProjections[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFprojectedToProjections = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectedToProjections;

      // Unlink reverse ref from the new related object
    aNewInverseOFprojectedToProjections.unsetProjectedToProjectionsPrivileged( theCtxt);

      // Shrink collection removing InverseOFprojectedToProjections element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectedToProjections = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectedToProjectionsLength - 1];
    try {
      System.arraycopy( someInverseOFprojectedToProjections, 0, otherInverseOFprojectedToProjections, 0, aFoundIndex);
      System.arraycopy( someInverseOFprojectedToProjections, aFoundIndex + 1, otherInverseOFprojectedToProjections, aFoundIndex, aInverseOFprojectedToProjectionsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectedToProjections", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectedToProjections", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectedToProjections", null); return;}

      // Set the new collection
    setInverseOFprojectedToProjectionsPrivileged( theCtxt, otherInverseOFprojectedToProjections);
  }




    /* Public reorder accessor for role InverseOFprojectedToProjections
     */
  public void moveInverseOFprojectedToProjectionsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectedToProjections) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFprojectedToProjections == null) { return;}

      // If relative InverseOFprojectedToProjections is null, perform move to last position
    if( theRelativeInverseOFprojectedToProjections == null) {
      moveInverseOFprojectedToProjectionsToLastPR( theCtxt, theInverseOFprojectedToProjections);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjectionsPrivileged( theCtxt);
    if( someInverseOFprojectedToProjections == null) { return;}

      // Get length of InverseOFprojectedToProjections array
    int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;

      // Get index of InverseOFprojectedToProjections to move
    int aToMoveIndex = indexOfInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);
      // If toMove InverseOFprojectedToProjections not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFprojectedToProjectionsLength) {
      moveInverseOFprojectedToProjectionsToLastPR( theCtxt, theInverseOFprojectedToProjections);
    }

      // Get index of relative InverseOFprojectedToProjections
    int aRelativeIndex = indexOfInverseOFprojectedToProjectionsPR( theCtxt, theRelativeInverseOFprojectedToProjections);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFprojectedToProjectionsToLastPR( theCtxt, theInverseOFprojectedToProjections);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFprojectedToProjectionsLength) {
      moveInverseOFprojectedToProjectionsToLastPR( theCtxt, theInverseOFprojectedToProjections);
    }

      // ToMove and relative InverseOFprojectedToProjections are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFprojectedToProjections = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectedToProjections;

      // Allocate new array for new version of state of relationship InverseOFprojectedToProjections
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectedToProjections = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectedToProjectionsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFprojectedToProjections, 0, otherInverseOFprojectedToProjections, 0, aToMoveIndex );
        System.arraycopy( someInverseOFprojectedToProjections, aToMoveIndex + 1, otherInverseOFprojectedToProjections, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFprojectedToProjections[ aRelativeIndex - 1] = aToMoveInverseOFprojectedToProjections;
        System.arraycopy( someInverseOFprojectedToProjections, aRelativeIndex, otherInverseOFprojectedToProjections, aRelativeIndex, aInverseOFprojectedToProjectionsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFprojectedToProjections, 0, otherInverseOFprojectedToProjections, 0, aRelativeIndex );
        otherInverseOFprojectedToProjections[ aRelativeIndex ] = aToMoveInverseOFprojectedToProjections;
        System.arraycopy( someInverseOFprojectedToProjections, aRelativeIndex, otherInverseOFprojectedToProjections, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFprojectedToProjectionsLength - 1) {
          System.arraycopy( someInverseOFprojectedToProjections, aToMoveIndex + 1, otherInverseOFprojectedToProjections, aToMoveIndex + 1, aInverseOFprojectedToProjectionsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectedToProjectionsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectedToProjectionsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectedToProjectionsBefore", null); return;}

      // Set the new collection
    setInverseOFprojectedToProjectionsPrivileged( theCtxt, otherInverseOFprojectedToProjections);
  }





    /* Public move to last accessor for role InverseOFprojectedToProjections
     */
  public void moveInverseOFprojectedToProjectionsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFprojectedToProjections == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjectionsPrivileged( theCtxt);
    if( someInverseOFprojectedToProjections == null) { return;}

      // Get length of InverseOFprojectedToProjections array
    int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;

      // Get index of InverseOFprojectedToProjections to move
    int aToMoveIndex = indexOfInverseOFprojectedToProjectionsPR( theCtxt, theInverseOFprojectedToProjections);

      // If toMove InverseOFprojectedToProjections not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFprojectedToProjectionsLength - 1) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFprojectedToProjections = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectedToProjections;

      // Allocate new array for new version of state of relationship InverseOFprojectedToProjections
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectedToProjections = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectedToProjectionsLength];
    try {
      System.arraycopy( someInverseOFprojectedToProjections, 0, otherInverseOFprojectedToProjections, 0, aToMoveIndex );
      System.arraycopy( someInverseOFprojectedToProjections, aToMoveIndex + 1, otherInverseOFprojectedToProjections, aToMoveIndex, aInverseOFprojectedToProjectionsLength - aToMoveIndex - 1);
      otherInverseOFprojectedToProjections[ aInverseOFprojectedToProjectionsLength - 1] = aToMoveInverseOFprojectedToProjections;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectedToProjectionsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectedToProjectionsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectedToProjectionsToLast", null); return;}

      // Set the new collection
    setInverseOFprojectedToProjectionsPrivileged( theCtxt, otherInverseOFprojectedToProjections);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFprojectedToProjections
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFprojectedToProjections
     */
  public void addInverseOFprojectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFprojectedToProjections) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectedToProjections == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjectionsPrivileged( theCtxt);
    if( someInverseOFprojectedToProjections == null) { return;}

      // Check for new InverseOFprojectedToProjections already in collection
    int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectedToProjectionsLength ; anIndex++) {
      if( theInverseOFprojectedToProjections.sameAs( theCtxt, someInverseOFprojectedToProjections[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFprojectedToProjections element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectedToProjections = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectedToProjectionsLength + 1];
    try {
      System.arraycopy( someInverseOFprojectedToProjections, 0, otherInverseOFprojectedToProjections, 0, aInverseOFprojectedToProjectionsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectedToProjectionsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectedToProjectionsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectedToProjectionsPrivileged", null); return;}

    otherInverseOFprojectedToProjections[ aInverseOFprojectedToProjectionsLength] = theInverseOFprojectedToProjections;

      // Set the new collection
    setInverseOFprojectedToProjectionsPrivileged( theCtxt, otherInverseOFprojectedToProjections);
  }









    /* Privileged Write accessor for role InverseOFprojectedToProjections
     */
  public void removeInverseOFprojectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFprojectedToProjections) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectedToProjections == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjectionsPrivileged( theCtxt);
    if( someInverseOFprojectedToProjections == null) { return;}

      // Check for new InverseOFprojectedToProjections not in collection
    int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectedToProjectionsLength ; anIndex++) {
      if( theInverseOFprojectedToProjections.sameAs( theCtxt, someInverseOFprojectedToProjections[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFprojectedToProjections element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectedToProjections = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectedToProjectionsLength - 1];
    try {
      System.arraycopy( someInverseOFprojectedToProjections, 0, otherInverseOFprojectedToProjections, 0, aFoundIndex);
      System.arraycopy( someInverseOFprojectedToProjections, aFoundIndex + 1, otherInverseOFprojectedToProjections, aFoundIndex, aInverseOFprojectedToProjectionsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectedToProjectionsPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectedToProjectionsPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectedToProjectionsPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFprojectedToProjectionsPrivileged( theCtxt, otherInverseOFprojectedToProjections);
  }






    /* Privileged Read accessor for role InverseOFprojectedToProjections
     * Guaranteed to return object with same identity of the InverseOFprojectedToProjections
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFprojectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFprojectedToProjections;
  }




    /* Set reference in role InverseOFprojectedToProjections
     * Used by relationship maintenance machinery
     */
  public void setInverseOFprojectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFprojectedToProjectionsCollection) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] aInverseOFprojectedToProjections = vrInverseOFprojectedToProjections;
    vrInverseOFprojectedToProjections = theInverseOFprojectedToProjectionsCollection;
      // Propagate change
    change( theCtxt, "InverseOFprojectedToProjections", aInverseOFprojectedToProjections, vrInverseOFprojectedToProjections, "vrInverseOFprojectedToProjections");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFtransformationToSources
 ****************************************************************************/


    /* Public Read accessor for role InverseOFtransformationToSources
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFtransformationToSources( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFtransformationToSourcesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFtransformationToSourcesPR( theCtxt);
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

    /* Public InverseOFtransformationToSources number access
     */
  public int numInverseOFtransformationToSources( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFtransformationToSourcesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFtransformationToSourcesPR( theCtxt);
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



    /* Public InverseOFtransformationToSources read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFtransformationToSourcesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFtransformationToSourcesAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFtransformationToSourcesAtPR( theCtxt, theIndex);
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


    /* Public InverseOFtransformationToSources finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFtransformationToSourcesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFtransformationToSourcesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFtransformationToSourcesNamedPR( theCtxt, theMMName);
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




    /* Public InverseOFtransformationToSources is related predicate
     */
  public boolean hasInverseOFtransformationToSourcesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFtransformationToSourcesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFtransformationToSourcesNamedPR( theCtxt, theMMName);
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



    /* Transactional InverseOFtransformationToSources is related  predicate
     */
  public boolean hasInverseOFtransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);
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


    /* Public InverseOFtransformationToSources index access
     */
  public int indexOfInverseOFtransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);
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






    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFtransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);
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



    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFtransformationToSourcesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtransformationToSources) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFtransformationToSourcesBeforePR( theCtxt, theInverseOFtransformationToSources, theRelativeInverseOFtransformationToSources);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFtransformationToSourcesBeforePR( theCtxt, theInverseOFtransformationToSources, theRelativeInverseOFtransformationToSources);
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





    /* Transactional Public Write Remove accessor for role InverseOFtransformationToSources
     */
  public void removeInverseOFtransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);
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



    /* Public reorder accessor for role InverseOFtransformationToSources
     */
  public void moveInverseOFtransformationToSourcesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtransformationToSources) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFtransformationToSourcesBeforePR( theCtxt, theInverseOFtransformationToSources, theRelativeInverseOFtransformationToSources);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFtransformationToSourcesBeforePR( theCtxt, theInverseOFtransformationToSources, theRelativeInverseOFtransformationToSources);
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



    /* Public reorder accessor for role InverseOFtransformationToSources
     */
  public void moveInverseOFtransformationToSourcesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFtransformationToSourcesToLastPR( theCtxt, theInverseOFtransformationToSources);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFtransformationToSourcesToLastPR( theCtxt, theInverseOFtransformationToSources);
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
 *  Implementation of internal operations for relationship InverseOFtransformationToSources
 ****************************************************************************/


    /* Public Read accessor for role InverseOFtransformationToSources
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFtransformationToSourcesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtransformationToSources = getInverseOFtransformationToSourcesPrivileged( theCtxt);
    if( someInverseOFtransformationToSources == null) { return null;}

    int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] otherInverseOFtransformationToSources = new com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[ aInverseOFtransformationToSourcesLength];
    try { System.arraycopy( someInverseOFtransformationToSources, 0, otherInverseOFtransformationToSources, 0, aInverseOFtransformationToSourcesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFtransformationToSources", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFtransformationToSources", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFtransformationToSources", null); return null;}


    return otherInverseOFtransformationToSources;
  }



    /* Public InverseOFtransformationToSources finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFtransformationToSourcesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtransformationToSources = getInverseOFtransformationToSourcesPrivileged( theCtxt);
    if( someInverseOFtransformationToSources == null) { return null;}

      // Check for new InverseOFtransformationToSources already in collection
    int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;
    for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSourcesLength ; anIndex++) {
      com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aInverseOFtransformationToSources = someInverseOFtransformationToSources[ anIndex];
      if( aInverseOFtransformationToSources.sameNameAs( theCtxt, theMMName)) { return aInverseOFtransformationToSources;}
    }
    return null;
  }



    /* Public InverseOFtransformationToSources finder predicate by name
     */
  public boolean hasInverseOFtransformationToSourcesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFtransformationToSourcesNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFtransformationToSources read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFtransformationToSourcesAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtransformationToSources = getInverseOFtransformationToSourcesPrivileged( theCtxt);
    if( someInverseOFtransformationToSources == null) { return null;}

      // Get number of InverseOFtransformationToSources
    int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;

      // Verify index within array length
    if( theIndex >= aInverseOFtransformationToSourcesLength) { return null;}

      // Get indexed InverseOFtransformationToSources
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFtransformationToSources = someInverseOFtransformationToSources[ theIndex];

    return aInverseOFtransformationToSources;
  }



    /* Public InverseOFtransformationToSources is related predicate
     */
  public boolean hasInverseOFtransformationToSourcesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException {
    return indexOfInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources) >= 0;
  }


    /* Public InverseOFtransformationToSources index access
     */
  public int indexOfInverseOFtransformationToSourcesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFtransformationToSources == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtransformationToSources = getInverseOFtransformationToSourcesPrivileged( theCtxt);
    if( someInverseOFtransformationToSources == null) { return -1;}

      // Check for new InverseOFtransformationToSources already in collection
    int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;
    for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSourcesLength ; anIndex++) {
      if( someInverseOFtransformationToSources[ anIndex].sameAs( theCtxt, theInverseOFtransformationToSources)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFtransformationToSources number access
     */
  public int numInverseOFtransformationToSourcesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtransformationToSources = getInverseOFtransformationToSourcesPrivileged( theCtxt);
    if( someInverseOFtransformationToSources == null) { return 0;}

      // Check for new InverseOFtransformationToSources already in collection
    int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;
    return aInverseOFtransformationToSourcesLength;
  }




    /* Public Write accessor for role InverseOFtransformationToSources
     */
  public void addInverseOFtransformationToSourcesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtransformationToSources == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSources = getInverseOFtransformationToSourcesPrivileged( theCtxt);
    if( someInverseOFtransformationToSources == null) { return;}

      // Check for new InverseOFtransformationToSources already in collection
    int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;
    for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSourcesLength ; anIndex++) {
      if( theInverseOFtransformationToSources.sameAs( theCtxt, someInverseOFtransformationToSources[ anIndex])) { return;}
    }

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFtransformationToSources = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtransformationToSources;

      // Link reverse ref to this object
    aNewInverseOFtransformationToSources.unsetAndSetTransformationToSourcesPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFtransformationToSources element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSources = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSourcesLength + 1];
    try { System.arraycopy( someInverseOFtransformationToSources, 0, otherInverseOFtransformationToSources, 0, aInverseOFtransformationToSourcesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSources", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSources", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSources", null); return;}
    otherInverseOFtransformationToSources[ aInverseOFtransformationToSourcesLength] = aNewInverseOFtransformationToSources;

      // Set the new collection
    setInverseOFtransformationToSourcesPrivileged( theCtxt, otherInverseOFtransformationToSources);
  }




    /* Public ordered Write accessor for role InverseOFtransformationToSources
     */
  public void addInverseOFtransformationToSourcesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtransformationToSources) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtransformationToSources == null) { return;}

      // If relative InverseOFtransformationToSources is null, perform normal add operation
    if( theRelativeInverseOFtransformationToSources == null) {
      addInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSources = getInverseOFtransformationToSourcesPrivileged( theCtxt);
    if( someInverseOFtransformationToSources == null) { return;}


      // Get index of relative InverseOFtransformationToSources
    int aRelativeIndex = indexOfInverseOFtransformationToSourcesPR( theCtxt, theRelativeInverseOFtransformationToSources);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);
    }

      // Get length of InverseOFtransformationToSources array
    int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFtransformationToSourcesLength) {
      addInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);
    }

      // Check for new InverseOFtransformationToSources already in collection
    if( hasInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources)) { return;}


    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFtransformationToSources = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtransformationToSources;

      // Link reverse ref to this object
    aNewInverseOFtransformationToSources.unsetAndSetTransformationToSourcesPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFtransformationToSources
      // Grow collection and add new InverseOFtransformationToSources element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSources = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSourcesLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFtransformationToSources, 0, otherInverseOFtransformationToSources, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFtransformationToSources, aRelativeIndex, otherInverseOFtransformationToSources, aRelativeIndex + 1, aInverseOFtransformationToSourcesLength - aRelativeIndex);
      otherInverseOFtransformationToSources[ aRelativeIndex] = aNewInverseOFtransformationToSources;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSourcesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSourcesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSourcesBefore", null); return;}

      // Set the new collection
    setInverseOFtransformationToSourcesPrivileged( theCtxt, otherInverseOFtransformationToSources);
  }





    /* Public Write accessor for role InverseOFtransformationToSources
     */
  public void removeInverseOFtransformationToSourcesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtransformationToSources == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSources = getInverseOFtransformationToSourcesPrivileged( theCtxt);
    if( someInverseOFtransformationToSources == null) { return;}

      // Check for new InverseOFtransformationToSources not in collection
    int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSourcesLength ; anIndex++) {
      if( theInverseOFtransformationToSources.sameAs( theCtxt, someInverseOFtransformationToSources[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFtransformationToSources = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtransformationToSources;

      // Unlink reverse ref from the new related object
    aNewInverseOFtransformationToSources.unsetTransformationToSourcesPrivileged( theCtxt);

      // Shrink collection removing InverseOFtransformationToSources element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSources = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSourcesLength - 1];
    try {
      System.arraycopy( someInverseOFtransformationToSources, 0, otherInverseOFtransformationToSources, 0, aFoundIndex);
      System.arraycopy( someInverseOFtransformationToSources, aFoundIndex + 1, otherInverseOFtransformationToSources, aFoundIndex, aInverseOFtransformationToSourcesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtransformationToSources", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtransformationToSources", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtransformationToSources", null); return;}

      // Set the new collection
    setInverseOFtransformationToSourcesPrivileged( theCtxt, otherInverseOFtransformationToSources);
  }




    /* Public reorder accessor for role InverseOFtransformationToSources
     */
  public void moveInverseOFtransformationToSourcesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtransformationToSources) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFtransformationToSources == null) { return;}

      // If relative InverseOFtransformationToSources is null, perform move to last position
    if( theRelativeInverseOFtransformationToSources == null) {
      moveInverseOFtransformationToSourcesToLastPR( theCtxt, theInverseOFtransformationToSources);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSources = getInverseOFtransformationToSourcesPrivileged( theCtxt);
    if( someInverseOFtransformationToSources == null) { return;}

      // Get length of InverseOFtransformationToSources array
    int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;

      // Get index of InverseOFtransformationToSources to move
    int aToMoveIndex = indexOfInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);
      // If toMove InverseOFtransformationToSources not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFtransformationToSourcesLength) {
      moveInverseOFtransformationToSourcesToLastPR( theCtxt, theInverseOFtransformationToSources);
    }

      // Get index of relative InverseOFtransformationToSources
    int aRelativeIndex = indexOfInverseOFtransformationToSourcesPR( theCtxt, theRelativeInverseOFtransformationToSources);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFtransformationToSourcesToLastPR( theCtxt, theInverseOFtransformationToSources);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFtransformationToSourcesLength) {
      moveInverseOFtransformationToSourcesToLastPR( theCtxt, theInverseOFtransformationToSources);
    }

      // ToMove and relative InverseOFtransformationToSources are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFtransformationToSources = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtransformationToSources;

      // Allocate new array for new version of state of relationship InverseOFtransformationToSources
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSources = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSourcesLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFtransformationToSources, 0, otherInverseOFtransformationToSources, 0, aToMoveIndex );
        System.arraycopy( someInverseOFtransformationToSources, aToMoveIndex + 1, otherInverseOFtransformationToSources, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFtransformationToSources[ aRelativeIndex - 1] = aToMoveInverseOFtransformationToSources;
        System.arraycopy( someInverseOFtransformationToSources, aRelativeIndex, otherInverseOFtransformationToSources, aRelativeIndex, aInverseOFtransformationToSourcesLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFtransformationToSources, 0, otherInverseOFtransformationToSources, 0, aRelativeIndex );
        otherInverseOFtransformationToSources[ aRelativeIndex ] = aToMoveInverseOFtransformationToSources;
        System.arraycopy( someInverseOFtransformationToSources, aRelativeIndex, otherInverseOFtransformationToSources, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFtransformationToSourcesLength - 1) {
          System.arraycopy( someInverseOFtransformationToSources, aToMoveIndex + 1, otherInverseOFtransformationToSources, aToMoveIndex + 1, aInverseOFtransformationToSourcesLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtransformationToSourcesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtransformationToSourcesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtransformationToSourcesBefore", null); return;}

      // Set the new collection
    setInverseOFtransformationToSourcesPrivileged( theCtxt, otherInverseOFtransformationToSources);
  }





    /* Public move to last accessor for role InverseOFtransformationToSources
     */
  public void moveInverseOFtransformationToSourcesToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFtransformationToSources == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSources = getInverseOFtransformationToSourcesPrivileged( theCtxt);
    if( someInverseOFtransformationToSources == null) { return;}

      // Get length of InverseOFtransformationToSources array
    int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;

      // Get index of InverseOFtransformationToSources to move
    int aToMoveIndex = indexOfInverseOFtransformationToSourcesPR( theCtxt, theInverseOFtransformationToSources);

      // If toMove InverseOFtransformationToSources not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFtransformationToSourcesLength - 1) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFtransformationToSources = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtransformationToSources;

      // Allocate new array for new version of state of relationship InverseOFtransformationToSources
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSources = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSourcesLength];
    try {
      System.arraycopy( someInverseOFtransformationToSources, 0, otherInverseOFtransformationToSources, 0, aToMoveIndex );
      System.arraycopy( someInverseOFtransformationToSources, aToMoveIndex + 1, otherInverseOFtransformationToSources, aToMoveIndex, aInverseOFtransformationToSourcesLength - aToMoveIndex - 1);
      otherInverseOFtransformationToSources[ aInverseOFtransformationToSourcesLength - 1] = aToMoveInverseOFtransformationToSources;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtransformationToSourcesToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtransformationToSourcesToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtransformationToSourcesToLast", null); return;}

      // Set the new collection
    setInverseOFtransformationToSourcesPrivileged( theCtxt, otherInverseOFtransformationToSources);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFtransformationToSources
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFtransformationToSources
     */
  public void addInverseOFtransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFtransformationToSources) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtransformationToSources == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSources = getInverseOFtransformationToSourcesPrivileged( theCtxt);
    if( someInverseOFtransformationToSources == null) { return;}

      // Check for new InverseOFtransformationToSources already in collection
    int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;
    for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSourcesLength ; anIndex++) {
      if( theInverseOFtransformationToSources.sameAs( theCtxt, someInverseOFtransformationToSources[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFtransformationToSources element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSources = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSourcesLength + 1];
    try {
      System.arraycopy( someInverseOFtransformationToSources, 0, otherInverseOFtransformationToSources, 0, aInverseOFtransformationToSourcesLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSourcesPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSourcesPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSourcesPrivileged", null); return;}

    otherInverseOFtransformationToSources[ aInverseOFtransformationToSourcesLength] = theInverseOFtransformationToSources;

      // Set the new collection
    setInverseOFtransformationToSourcesPrivileged( theCtxt, otherInverseOFtransformationToSources);
  }









    /* Privileged Write accessor for role InverseOFtransformationToSources
     */
  public void removeInverseOFtransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFtransformationToSources) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtransformationToSources == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtransformationToSources = getInverseOFtransformationToSourcesPrivileged( theCtxt);
    if( someInverseOFtransformationToSources == null) { return;}

      // Check for new InverseOFtransformationToSources not in collection
    int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSourcesLength ; anIndex++) {
      if( theInverseOFtransformationToSources.sameAs( theCtxt, someInverseOFtransformationToSources[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFtransformationToSources element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSources = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSourcesLength - 1];
    try {
      System.arraycopy( someInverseOFtransformationToSources, 0, otherInverseOFtransformationToSources, 0, aFoundIndex);
      System.arraycopy( someInverseOFtransformationToSources, aFoundIndex + 1, otherInverseOFtransformationToSources, aFoundIndex, aInverseOFtransformationToSourcesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtransformationToSourcesPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtransformationToSourcesPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtransformationToSourcesPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFtransformationToSourcesPrivileged( theCtxt, otherInverseOFtransformationToSources);
  }






    /* Privileged Read accessor for role InverseOFtransformationToSources
     * Guaranteed to return object with same identity of the InverseOFtransformationToSources
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFtransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFtransformationToSources;
  }




    /* Set reference in role InverseOFtransformationToSources
     * Used by relationship maintenance machinery
     */
  public void setInverseOFtransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFtransformationToSourcesCollection) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] aInverseOFtransformationToSources = vrInverseOFtransformationToSources;
    vrInverseOFtransformationToSources = theInverseOFtransformationToSourcesCollection;
      // Propagate change
    change( theCtxt, "InverseOFtransformationToSources", aInverseOFtransformationToSources, vrInverseOFtransformationToSources, "vrInverseOFtransformationToSources");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFtransformationToSubTransformations
 ****************************************************************************/


    /* Public Read accessor for role InverseOFtransformationToSubTransformations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFtransformationToSubTransformations( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFtransformationToSubTransformationsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFtransformationToSubTransformationsPR( theCtxt);
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

    /* Public InverseOFtransformationToSubTransformations number access
     */
  public int numInverseOFtransformationToSubTransformations( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFtransformationToSubTransformationsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFtransformationToSubTransformationsPR( theCtxt);
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



    /* Public InverseOFtransformationToSubTransformations read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFtransformationToSubTransformationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFtransformationToSubTransformationsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFtransformationToSubTransformationsAtPR( theCtxt, theIndex);
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


    /* Public InverseOFtransformationToSubTransformations finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFtransformationToSubTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFtransformationToSubTransformationsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFtransformationToSubTransformationsNamedPR( theCtxt, theMMName);
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




    /* Public InverseOFtransformationToSubTransformations is related predicate
     */
  public boolean hasInverseOFtransformationToSubTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFtransformationToSubTransformationsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFtransformationToSubTransformationsNamedPR( theCtxt, theMMName);
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



    /* Transactional InverseOFtransformationToSubTransformations is related  predicate
     */
  public boolean hasInverseOFtransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);
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


    /* Public InverseOFtransformationToSubTransformations index access
     */
  public int indexOfInverseOFtransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);
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






    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFtransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);
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



    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFtransformationToSubTransformationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtransformationToSubTransformations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFtransformationToSubTransformationsBeforePR( theCtxt, theInverseOFtransformationToSubTransformations, theRelativeInverseOFtransformationToSubTransformations);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFtransformationToSubTransformationsBeforePR( theCtxt, theInverseOFtransformationToSubTransformations, theRelativeInverseOFtransformationToSubTransformations);
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





    /* Transactional Public Write Remove accessor for role InverseOFtransformationToSubTransformations
     */
  public void removeInverseOFtransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);
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



    /* Public reorder accessor for role InverseOFtransformationToSubTransformations
     */
  public void moveInverseOFtransformationToSubTransformationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtransformationToSubTransformations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFtransformationToSubTransformationsBeforePR( theCtxt, theInverseOFtransformationToSubTransformations, theRelativeInverseOFtransformationToSubTransformations);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFtransformationToSubTransformationsBeforePR( theCtxt, theInverseOFtransformationToSubTransformations, theRelativeInverseOFtransformationToSubTransformations);
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



    /* Public reorder accessor for role InverseOFtransformationToSubTransformations
     */
  public void moveInverseOFtransformationToSubTransformationsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFtransformationToSubTransformationsToLastPR( theCtxt, theInverseOFtransformationToSubTransformations);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFtransformationToSubTransformationsToLastPR( theCtxt, theInverseOFtransformationToSubTransformations);
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
 *  Implementation of internal operations for relationship InverseOFtransformationToSubTransformations
 ****************************************************************************/


    /* Public Read accessor for role InverseOFtransformationToSubTransformations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFtransformationToSubTransformationsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformationsPrivileged( theCtxt);
    if( someInverseOFtransformationToSubTransformations == null) { return null;}

    int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] otherInverseOFtransformationToSubTransformations = new com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[ aInverseOFtransformationToSubTransformationsLength];
    try { System.arraycopy( someInverseOFtransformationToSubTransformations, 0, otherInverseOFtransformationToSubTransformations, 0, aInverseOFtransformationToSubTransformationsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFtransformationToSubTransformations", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFtransformationToSubTransformations", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFtransformationToSubTransformations", null); return null;}


    return otherInverseOFtransformationToSubTransformations;
  }



    /* Public InverseOFtransformationToSubTransformations finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFtransformationToSubTransformationsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformationsPrivileged( theCtxt);
    if( someInverseOFtransformationToSubTransformations == null) { return null;}

      // Check for new InverseOFtransformationToSubTransformations already in collection
    int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;
    for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSubTransformationsLength ; anIndex++) {
      com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aInverseOFtransformationToSubTransformations = someInverseOFtransformationToSubTransformations[ anIndex];
      if( aInverseOFtransformationToSubTransformations.sameNameAs( theCtxt, theMMName)) { return aInverseOFtransformationToSubTransformations;}
    }
    return null;
  }



    /* Public InverseOFtransformationToSubTransformations finder predicate by name
     */
  public boolean hasInverseOFtransformationToSubTransformationsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFtransformationToSubTransformationsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFtransformationToSubTransformations read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFtransformationToSubTransformationsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformationsPrivileged( theCtxt);
    if( someInverseOFtransformationToSubTransformations == null) { return null;}

      // Get number of InverseOFtransformationToSubTransformations
    int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;

      // Verify index within array length
    if( theIndex >= aInverseOFtransformationToSubTransformationsLength) { return null;}

      // Get indexed InverseOFtransformationToSubTransformations
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFtransformationToSubTransformations = someInverseOFtransformationToSubTransformations[ theIndex];

    return aInverseOFtransformationToSubTransformations;
  }



    /* Public InverseOFtransformationToSubTransformations is related predicate
     */
  public boolean hasInverseOFtransformationToSubTransformationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException {
    return indexOfInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations) >= 0;
  }


    /* Public InverseOFtransformationToSubTransformations index access
     */
  public int indexOfInverseOFtransformationToSubTransformationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFtransformationToSubTransformations == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformationsPrivileged( theCtxt);
    if( someInverseOFtransformationToSubTransformations == null) { return -1;}

      // Check for new InverseOFtransformationToSubTransformations already in collection
    int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;
    for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSubTransformationsLength ; anIndex++) {
      if( someInverseOFtransformationToSubTransformations[ anIndex].sameAs( theCtxt, theInverseOFtransformationToSubTransformations)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFtransformationToSubTransformations number access
     */
  public int numInverseOFtransformationToSubTransformationsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformationsPrivileged( theCtxt);
    if( someInverseOFtransformationToSubTransformations == null) { return 0;}

      // Check for new InverseOFtransformationToSubTransformations already in collection
    int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;
    return aInverseOFtransformationToSubTransformationsLength;
  }




    /* Public Write accessor for role InverseOFtransformationToSubTransformations
     */
  public void addInverseOFtransformationToSubTransformationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtransformationToSubTransformations == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformationsPrivileged( theCtxt);
    if( someInverseOFtransformationToSubTransformations == null) { return;}

      // Check for new InverseOFtransformationToSubTransformations already in collection
    int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;
    for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSubTransformationsLength ; anIndex++) {
      if( theInverseOFtransformationToSubTransformations.sameAs( theCtxt, someInverseOFtransformationToSubTransformations[ anIndex])) { return;}
    }

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFtransformationToSubTransformations = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtransformationToSubTransformations;

      // Link reverse ref to this object
    aNewInverseOFtransformationToSubTransformations.unsetAndSetTransformationToSubTransformationsPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFtransformationToSubTransformations element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSubTransformations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSubTransformationsLength + 1];
    try { System.arraycopy( someInverseOFtransformationToSubTransformations, 0, otherInverseOFtransformationToSubTransformations, 0, aInverseOFtransformationToSubTransformationsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSubTransformations", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSubTransformations", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSubTransformations", null); return;}
    otherInverseOFtransformationToSubTransformations[ aInverseOFtransformationToSubTransformationsLength] = aNewInverseOFtransformationToSubTransformations;

      // Set the new collection
    setInverseOFtransformationToSubTransformationsPrivileged( theCtxt, otherInverseOFtransformationToSubTransformations);
  }




    /* Public ordered Write accessor for role InverseOFtransformationToSubTransformations
     */
  public void addInverseOFtransformationToSubTransformationsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtransformationToSubTransformations) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtransformationToSubTransformations == null) { return;}

      // If relative InverseOFtransformationToSubTransformations is null, perform normal add operation
    if( theRelativeInverseOFtransformationToSubTransformations == null) {
      addInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformationsPrivileged( theCtxt);
    if( someInverseOFtransformationToSubTransformations == null) { return;}


      // Get index of relative InverseOFtransformationToSubTransformations
    int aRelativeIndex = indexOfInverseOFtransformationToSubTransformationsPR( theCtxt, theRelativeInverseOFtransformationToSubTransformations);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);
    }

      // Get length of InverseOFtransformationToSubTransformations array
    int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFtransformationToSubTransformationsLength) {
      addInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);
    }

      // Check for new InverseOFtransformationToSubTransformations already in collection
    if( hasInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations)) { return;}


    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFtransformationToSubTransformations = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtransformationToSubTransformations;

      // Link reverse ref to this object
    aNewInverseOFtransformationToSubTransformations.unsetAndSetTransformationToSubTransformationsPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFtransformationToSubTransformations
      // Grow collection and add new InverseOFtransformationToSubTransformations element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSubTransformations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSubTransformationsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFtransformationToSubTransformations, 0, otherInverseOFtransformationToSubTransformations, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFtransformationToSubTransformations, aRelativeIndex, otherInverseOFtransformationToSubTransformations, aRelativeIndex + 1, aInverseOFtransformationToSubTransformationsLength - aRelativeIndex);
      otherInverseOFtransformationToSubTransformations[ aRelativeIndex] = aNewInverseOFtransformationToSubTransformations;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSubTransformationsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSubTransformationsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSubTransformationsBefore", null); return;}

      // Set the new collection
    setInverseOFtransformationToSubTransformationsPrivileged( theCtxt, otherInverseOFtransformationToSubTransformations);
  }





    /* Public Write accessor for role InverseOFtransformationToSubTransformations
     */
  public void removeInverseOFtransformationToSubTransformationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtransformationToSubTransformations == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformationsPrivileged( theCtxt);
    if( someInverseOFtransformationToSubTransformations == null) { return;}

      // Check for new InverseOFtransformationToSubTransformations not in collection
    int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSubTransformationsLength ; anIndex++) {
      if( theInverseOFtransformationToSubTransformations.sameAs( theCtxt, someInverseOFtransformationToSubTransformations[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFtransformationToSubTransformations = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtransformationToSubTransformations;

      // Unlink reverse ref from the new related object
    aNewInverseOFtransformationToSubTransformations.unsetTransformationToSubTransformationsPrivileged( theCtxt);

      // Shrink collection removing InverseOFtransformationToSubTransformations element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSubTransformations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSubTransformationsLength - 1];
    try {
      System.arraycopy( someInverseOFtransformationToSubTransformations, 0, otherInverseOFtransformationToSubTransformations, 0, aFoundIndex);
      System.arraycopy( someInverseOFtransformationToSubTransformations, aFoundIndex + 1, otherInverseOFtransformationToSubTransformations, aFoundIndex, aInverseOFtransformationToSubTransformationsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtransformationToSubTransformations", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtransformationToSubTransformations", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtransformationToSubTransformations", null); return;}

      // Set the new collection
    setInverseOFtransformationToSubTransformationsPrivileged( theCtxt, otherInverseOFtransformationToSubTransformations);
  }




    /* Public reorder accessor for role InverseOFtransformationToSubTransformations
     */
  public void moveInverseOFtransformationToSubTransformationsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtransformationToSubTransformations) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFtransformationToSubTransformations == null) { return;}

      // If relative InverseOFtransformationToSubTransformations is null, perform move to last position
    if( theRelativeInverseOFtransformationToSubTransformations == null) {
      moveInverseOFtransformationToSubTransformationsToLastPR( theCtxt, theInverseOFtransformationToSubTransformations);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformationsPrivileged( theCtxt);
    if( someInverseOFtransformationToSubTransformations == null) { return;}

      // Get length of InverseOFtransformationToSubTransformations array
    int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;

      // Get index of InverseOFtransformationToSubTransformations to move
    int aToMoveIndex = indexOfInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);
      // If toMove InverseOFtransformationToSubTransformations not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFtransformationToSubTransformationsLength) {
      moveInverseOFtransformationToSubTransformationsToLastPR( theCtxt, theInverseOFtransformationToSubTransformations);
    }

      // Get index of relative InverseOFtransformationToSubTransformations
    int aRelativeIndex = indexOfInverseOFtransformationToSubTransformationsPR( theCtxt, theRelativeInverseOFtransformationToSubTransformations);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFtransformationToSubTransformationsToLastPR( theCtxt, theInverseOFtransformationToSubTransformations);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFtransformationToSubTransformationsLength) {
      moveInverseOFtransformationToSubTransformationsToLastPR( theCtxt, theInverseOFtransformationToSubTransformations);
    }

      // ToMove and relative InverseOFtransformationToSubTransformations are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFtransformationToSubTransformations = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtransformationToSubTransformations;

      // Allocate new array for new version of state of relationship InverseOFtransformationToSubTransformations
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSubTransformations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSubTransformationsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFtransformationToSubTransformations, 0, otherInverseOFtransformationToSubTransformations, 0, aToMoveIndex );
        System.arraycopy( someInverseOFtransformationToSubTransformations, aToMoveIndex + 1, otherInverseOFtransformationToSubTransformations, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFtransformationToSubTransformations[ aRelativeIndex - 1] = aToMoveInverseOFtransformationToSubTransformations;
        System.arraycopy( someInverseOFtransformationToSubTransformations, aRelativeIndex, otherInverseOFtransformationToSubTransformations, aRelativeIndex, aInverseOFtransformationToSubTransformationsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFtransformationToSubTransformations, 0, otherInverseOFtransformationToSubTransformations, 0, aRelativeIndex );
        otherInverseOFtransformationToSubTransformations[ aRelativeIndex ] = aToMoveInverseOFtransformationToSubTransformations;
        System.arraycopy( someInverseOFtransformationToSubTransformations, aRelativeIndex, otherInverseOFtransformationToSubTransformations, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFtransformationToSubTransformationsLength - 1) {
          System.arraycopy( someInverseOFtransformationToSubTransformations, aToMoveIndex + 1, otherInverseOFtransformationToSubTransformations, aToMoveIndex + 1, aInverseOFtransformationToSubTransformationsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtransformationToSubTransformationsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtransformationToSubTransformationsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtransformationToSubTransformationsBefore", null); return;}

      // Set the new collection
    setInverseOFtransformationToSubTransformationsPrivileged( theCtxt, otherInverseOFtransformationToSubTransformations);
  }





    /* Public move to last accessor for role InverseOFtransformationToSubTransformations
     */
  public void moveInverseOFtransformationToSubTransformationsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFtransformationToSubTransformations == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformationsPrivileged( theCtxt);
    if( someInverseOFtransformationToSubTransformations == null) { return;}

      // Get length of InverseOFtransformationToSubTransformations array
    int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;

      // Get index of InverseOFtransformationToSubTransformations to move
    int aToMoveIndex = indexOfInverseOFtransformationToSubTransformationsPR( theCtxt, theInverseOFtransformationToSubTransformations);

      // If toMove InverseOFtransformationToSubTransformations not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFtransformationToSubTransformationsLength - 1) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFtransformationToSubTransformations = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFtransformationToSubTransformations;

      // Allocate new array for new version of state of relationship InverseOFtransformationToSubTransformations
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSubTransformations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSubTransformationsLength];
    try {
      System.arraycopy( someInverseOFtransformationToSubTransformations, 0, otherInverseOFtransformationToSubTransformations, 0, aToMoveIndex );
      System.arraycopy( someInverseOFtransformationToSubTransformations, aToMoveIndex + 1, otherInverseOFtransformationToSubTransformations, aToMoveIndex, aInverseOFtransformationToSubTransformationsLength - aToMoveIndex - 1);
      otherInverseOFtransformationToSubTransformations[ aInverseOFtransformationToSubTransformationsLength - 1] = aToMoveInverseOFtransformationToSubTransformations;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtransformationToSubTransformationsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtransformationToSubTransformationsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFtransformationToSubTransformationsToLast", null); return;}

      // Set the new collection
    setInverseOFtransformationToSubTransformationsPrivileged( theCtxt, otherInverseOFtransformationToSubTransformations);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFtransformationToSubTransformations
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFtransformationToSubTransformations
     */
  public void addInverseOFtransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFtransformationToSubTransformations) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtransformationToSubTransformations == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformationsPrivileged( theCtxt);
    if( someInverseOFtransformationToSubTransformations == null) { return;}

      // Check for new InverseOFtransformationToSubTransformations already in collection
    int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;
    for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSubTransformationsLength ; anIndex++) {
      if( theInverseOFtransformationToSubTransformations.sameAs( theCtxt, someInverseOFtransformationToSubTransformations[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFtransformationToSubTransformations element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSubTransformations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSubTransformationsLength + 1];
    try {
      System.arraycopy( someInverseOFtransformationToSubTransformations, 0, otherInverseOFtransformationToSubTransformations, 0, aInverseOFtransformationToSubTransformationsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSubTransformationsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSubTransformationsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFtransformationToSubTransformationsPrivileged", null); return;}

    otherInverseOFtransformationToSubTransformations[ aInverseOFtransformationToSubTransformationsLength] = theInverseOFtransformationToSubTransformations;

      // Set the new collection
    setInverseOFtransformationToSubTransformationsPrivileged( theCtxt, otherInverseOFtransformationToSubTransformations);
  }









    /* Privileged Write accessor for role InverseOFtransformationToSubTransformations
     */
  public void removeInverseOFtransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFtransformationToSubTransformations) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFtransformationToSubTransformations == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformationsPrivileged( theCtxt);
    if( someInverseOFtransformationToSubTransformations == null) { return;}

      // Check for new InverseOFtransformationToSubTransformations not in collection
    int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSubTransformationsLength ; anIndex++) {
      if( theInverseOFtransformationToSubTransformations.sameAs( theCtxt, someInverseOFtransformationToSubTransformations[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFtransformationToSubTransformations element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFtransformationToSubTransformations = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFtransformationToSubTransformationsLength - 1];
    try {
      System.arraycopy( someInverseOFtransformationToSubTransformations, 0, otherInverseOFtransformationToSubTransformations, 0, aFoundIndex);
      System.arraycopy( someInverseOFtransformationToSubTransformations, aFoundIndex + 1, otherInverseOFtransformationToSubTransformations, aFoundIndex, aInverseOFtransformationToSubTransformationsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtransformationToSubTransformationsPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtransformationToSubTransformationsPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFtransformationToSubTransformationsPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFtransformationToSubTransformationsPrivileged( theCtxt, otherInverseOFtransformationToSubTransformations);
  }






    /* Privileged Read accessor for role InverseOFtransformationToSubTransformations
     * Guaranteed to return object with same identity of the InverseOFtransformationToSubTransformations
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFtransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFtransformationToSubTransformations;
  }




    /* Set reference in role InverseOFtransformationToSubTransformations
     * Used by relationship maintenance machinery
     */
  public void setInverseOFtransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFtransformationToSubTransformationsCollection) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] aInverseOFtransformationToSubTransformations = vrInverseOFtransformationToSubTransformations;
    vrInverseOFtransformationToSubTransformations = theInverseOFtransformationToSubTransformationsCollection;
      // Propagate change
    change( theCtxt, "InverseOFtransformationToSubTransformations", aInverseOFtransformationToSubTransformations, vrInverseOFtransformationToSubTransformations, "vrInverseOFtransformationToSubTransformations");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to ONE relationship Inverse
 ****************************************************************************/


    /* Public Read accessor for role Inverse
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getInverse( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInversePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInversePR( theCtxt);
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

    /* Public Inverse number access
     */
  public int numInverse( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInversePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInversePR( theCtxt);
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



    /* Public Inverse read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getInverseAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseAtPR( theCtxt, theIndex);
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


    /* Public Inverse finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findInverseNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseNamedPR( theCtxt, theMMName);
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




    /* Public Inverse is related predicate
     */
  public boolean hasInverseNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseNamedPR( theCtxt, theMMName);
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



    /* Transactional Inverse is related  predicate
     */
  public boolean hasInverse( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theInverse) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInversePR( theCtxt, theInverse);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInversePR( theCtxt, theInverse);
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


    /* Public Inverse index access
     */
  public int indexOfInverse( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theInverse) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInversePR( theCtxt, theInverse);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInversePR( theCtxt, theInverse);
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




    /* Public Write accessor for role Inverse
     */
  public void setInverse( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theInverse) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setInversePR( theCtxt, theInverse);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setInversePR( theCtxt, theInverse);
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
 *  Implementation of internal operations for relationship Inverse
 ****************************************************************************/


    /* Public Read accessor for role Inverse
     * May do wild things with the identity of Inverse
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getInversePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getInversePrivileged( theCtxt);
  }


    /* Public Inverse number access
     */
  public int numInversePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getInversePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public Inverse read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getInverseAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getInversePrivileged( theCtxt);
  }


    /* Public Inverse finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findInverseNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aInverse = getInversePrivileged( theCtxt);
    if( aInverse == null) { return null;}

    if( !aInverse.sameNameAs( theCtxt, theMMName)) { return null;}

    return aInverse;
  }



    /* Public Inverse is related predicate
     */
  public boolean hasInverseNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null) { return false;}
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aInverse = getInversePrivileged( theCtxt);
    if( aInverse == null) { return false;}

    return aInverse.sameNameAs( theCtxt, theMMName);
  }



    /* Public Inverse is related predicate
     */
  public boolean hasInversePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theInverse) throws EAIException {
    if( theInverse == null) { return false;}
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aInverse = getInversePrivileged( theCtxt);
    if( aInverse == null) { return false;}

    return aInverse.sameAs( theCtxt, theInverse);
  }


    /* Public Inverse index access
     */
  public int indexOfInversePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theInverse) throws EAIException {
    if( !hasInversePR( theCtxt, theInverse)) { return -1;}

    return 0;
  }



    /* Public Write accessor for role Inverse
     */
  public void setInversePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theInverse) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aInverse = getInversePrivileged( theCtxt);
      // Check for new Inverse same as current one
    if( aInverse != null && aInverse.sameAs( theCtxt, theInverse)) { return;}

    if( aInverse != null) {
      aInverse.unsetInversePrivileged( theCtxt);
    }

    if( theInverse != null) {
      com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewInverse = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theInverse;
      aNewInverse.unsetAndSetInversePrivileged( theCtxt, this);
      setInversePrivileged( theCtxt, aNewInverse);
    }
    else {
      setInversePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship Inverse
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role Inverse
     * Guaranteed to return object with same identity of the Inverse
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getInversePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverse;
  }




    /* Remove current reference in role Inverse
     * Used by relationship maintenance machinery
     */
  public void unsetInversePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aInverse = vrInverse;
    vrInverse = null;
      // If there was change, propagate
    if( aInverse != null) {
      change( theCtxt, "Inverse", aInverse, vrInverse, "vrInverse");
    }
  }





    /* Set reference in role Inverse
     * Used by relationship maintenance machinery
     */
  public void setInversePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theInverse) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aInverse = vrInverse;
    vrInverse = theInverse;
      // If there was change, propagate
    if( (aInverse != null && !aInverse.sameAs( theCtxt, theInverse)) || (aInverse == null && theInverse != null)) {
      change( theCtxt, "Inverse", aInverse, vrInverse, "vrInverse");
    }
  }




    /* Unset currently related Inverse and
     * Set reference in role Inverse
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetInversePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theInverse) throws EAIException {
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aInverse = vrInverse;
    if( aInverse != null) {
      aInverse.unsetInversePrivileged( theCtxt);
    }
    vrInverse = theInverse;
      // If there was change, propagate
    if( (aInverse != null && !aInverse.sameAs( theCtxt, theInverse)) || (aInverse == null && theInverse != null)) {
      change( theCtxt, "Inverse", aInverse, vrInverse, "vrInverse");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship Type
 ****************************************************************************/


    /* Public Read accessor for role Type
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTypePR( theCtxt);
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

    /* Public Type number access
     */
  public int numType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numTypePR( theCtxt);
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



    /* Public Type read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTypeAtPR( theCtxt, theIndex);
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


    /* Public Type finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findTypeNamedPR( theCtxt, theMMName);
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




    /* Public Type is related predicate
     */
  public boolean hasTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTypeNamedPR( theCtxt, theMMName);
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



    /* Transactional Type is related  predicate
     */
  public boolean hasType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTypePR( theCtxt, theType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTypePR( theCtxt, theType);
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


    /* Public Type index access
     */
  public int indexOfType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfTypePR( theCtxt, theType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfTypePR( theCtxt, theType);
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




    /* Public Write accessor for role Type
     */
  public void setType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setTypePR( theCtxt, theType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setTypePR( theCtxt, theType);
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
 *  Implementation of internal operations for relationship Type
 ****************************************************************************/


    /* Public Read accessor for role Type
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTypePrivileged( theCtxt);
  }


    /* Public Type number access
     */
  public int numTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTypePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public Type read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getTypePrivileged( theCtxt);
  }


    /* Public Type finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = getTypePrivileged( theCtxt);
    if( aType == null) { return null;}

    if( !aType.sameNameAs( theCtxt, theMMName)) { return null;}

    return aType;
  }


    /* Public Type finder predicate by name
     */
  public boolean hasTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = getTypePrivileged( theCtxt);
    if( aType == null) { return false;}

    return aType.sameNameAs( theCtxt, theMMName);
  }



    /* Public Type is related predicate
     */
  public boolean hasTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = getTypePrivileged( theCtxt);
    if( aType == null) { return false;}

    return aType.sameAs( theCtxt, theType);
  }




    /* Public Type index access
     */
  public int indexOfTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theType) throws EAIException {
    if( !hasTypePR( theCtxt, theType)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role Type
     */
  public void setTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theType) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv aType = getTypePrivileged( theCtxt);
      // Check for new Type same as current one
    if( aType != null && aType.sameAs( theCtxt, theType)) { return;}

    if( aType != null) {
      aType.removeRelationshipsPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetTypePrivileged();
      */
    }

    if( theType != null) {
      com.dosmil_e.m3.core.priv.M3TypePriv aNewType = (com.dosmil_e.m3.core.priv.M3TypePriv) theType;
      aNewType.addRelationshipsPrivileged( theCtxt, this);
      setTypePrivileged( theCtxt, aNewType);
    }
    else {
      setTypePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship Type
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role Type
     * Guaranteed to return object with same identity of the Type
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrType;
  }




    /* Remove current reference in role Type
     * Used by relationship maintenance machinery
     */
  public void unsetTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = vrType;
    vrType = null;
      // If there was change, propagate
    if( aType != null) {
      change( theCtxt, "Type", aType, vrType, "vrType");
    }
  }





    /* Set reference in role Type
     * Used by relationship maintenance machinery
     */
  public void setTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = vrType;
    vrType = theType;
      // If there was change, propagate
    if( (aType != null && !aType.sameAs( theCtxt, theType)) || (aType == null && theType != null)) {
      change( theCtxt, "Type", aType, vrType, "vrType");
    }
  }





    /* Unset currently related Type and
     * Set reference in role Type
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theType) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv aType = vrType;
    if( aType != null) {
      aType.removeRelationshipsPrivileged( theCtxt, this);
    }
    vrType = theType;
      // If there was change, propagate
    if( (aType != null && !aType.sameAs( theCtxt, theType)) || (aType == null && theType != null)) {
      change( theCtxt, "Type", aType, vrType, "vrType");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship RelatedType
 ****************************************************************************/


    /* Public Read accessor for role RelatedType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getRelatedType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRelatedTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRelatedTypePR( theCtxt);
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

    /* Public RelatedType number access
     */
  public int numRelatedType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numRelatedTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numRelatedTypePR( theCtxt);
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



    /* Public RelatedType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getRelatedTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRelatedTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRelatedTypeAtPR( theCtxt, theIndex);
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


    /* Public RelatedType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findRelatedTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findRelatedTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findRelatedTypeNamedPR( theCtxt, theMMName);
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




    /* Public RelatedType is related predicate
     */
  public boolean hasRelatedTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasRelatedTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasRelatedTypeNamedPR( theCtxt, theMMName);
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



    /* Transactional RelatedType is related  predicate
     */
  public boolean hasRelatedType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelatedType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasRelatedTypePR( theCtxt, theRelatedType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasRelatedTypePR( theCtxt, theRelatedType);
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


    /* Public RelatedType index access
     */
  public int indexOfRelatedType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelatedType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfRelatedTypePR( theCtxt, theRelatedType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfRelatedTypePR( theCtxt, theRelatedType);
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




    /* Public Write accessor for role RelatedType
     */
  public void setRelatedType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelatedType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setRelatedTypePR( theCtxt, theRelatedType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setRelatedTypePR( theCtxt, theRelatedType);
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
 *  Implementation of internal operations for relationship RelatedType
 ****************************************************************************/


    /* Public Read accessor for role RelatedType
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getRelatedTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getRelatedTypePrivileged( theCtxt);
  }


    /* Public RelatedType number access
     */
  public int numRelatedTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getRelatedTypePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public RelatedType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getRelatedTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getRelatedTypePrivileged( theCtxt);
  }


    /* Public RelatedType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findRelatedTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3TypeIfc aRelatedType = getRelatedTypePrivileged( theCtxt);
    if( aRelatedType == null) { return null;}

    if( !aRelatedType.sameNameAs( theCtxt, theMMName)) { return null;}

    return aRelatedType;
  }


    /* Public RelatedType finder predicate by name
     */
  public boolean hasRelatedTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aRelatedType = getRelatedTypePrivileged( theCtxt);
    if( aRelatedType == null) { return false;}

    return aRelatedType.sameNameAs( theCtxt, theMMName);
  }



    /* Public RelatedType is related predicate
     */
  public boolean hasRelatedTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelatedType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aRelatedType = getRelatedTypePrivileged( theCtxt);
    if( aRelatedType == null) { return false;}

    return aRelatedType.sameAs( theCtxt, theRelatedType);
  }




    /* Public RelatedType index access
     */
  public int indexOfRelatedTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelatedType) throws EAIException {
    if( !hasRelatedTypePR( theCtxt, theRelatedType)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role RelatedType
     */
  public void setRelatedTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelatedType) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv aRelatedType = getRelatedTypePrivileged( theCtxt);
      // Check for new RelatedType same as current one
    if( aRelatedType != null && aRelatedType.sameAs( theCtxt, theRelatedType)) { return;}

    if( aRelatedType != null) {
      aRelatedType.removeRelatedWithPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetRelatedTypePrivileged();
      */
    }

    if( theRelatedType != null) {
      com.dosmil_e.m3.core.priv.M3TypePriv aNewRelatedType = (com.dosmil_e.m3.core.priv.M3TypePriv) theRelatedType;
      aNewRelatedType.addRelatedWithPrivileged( theCtxt, this);
      setRelatedTypePrivileged( theCtxt, aNewRelatedType);
    }
    else {
      setRelatedTypePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship RelatedType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role RelatedType
     * Guaranteed to return object with same identity of the RelatedType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getRelatedTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrRelatedType;
  }




    /* Remove current reference in role RelatedType
     * Used by relationship maintenance machinery
     */
  public void unsetRelatedTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aRelatedType = vrRelatedType;
    vrRelatedType = null;
      // If there was change, propagate
    if( aRelatedType != null) {
      change( theCtxt, "RelatedType", aRelatedType, vrRelatedType, "vrRelatedType");
    }
  }





    /* Set reference in role RelatedType
     * Used by relationship maintenance machinery
     */
  public void setRelatedTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theRelatedType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aRelatedType = vrRelatedType;
    vrRelatedType = theRelatedType;
      // If there was change, propagate
    if( (aRelatedType != null && !aRelatedType.sameAs( theCtxt, theRelatedType)) || (aRelatedType == null && theRelatedType != null)) {
      change( theCtxt, "RelatedType", aRelatedType, vrRelatedType, "vrRelatedType");
    }
  }





    /* Unset currently related RelatedType and
     * Set reference in role RelatedType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetRelatedTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theRelatedType) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv aRelatedType = vrRelatedType;
    if( aRelatedType != null) {
      aRelatedType.removeRelatedWithPrivileged( theCtxt, this);
    }
    vrRelatedType = theRelatedType;
      // If there was change, propagate
    if( (aRelatedType != null && !aRelatedType.sameAs( theCtxt, theRelatedType)) || (aRelatedType == null && theRelatedType != null)) {
      change( theCtxt, "RelatedType", aRelatedType, vrRelatedType, "vrRelatedType");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3Relationship
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 
      // When deleting : unreference attribute Kind
  setKind( theCtxt, null);


      // When deleting : unreference attribute IsDerived
  setIsDerived( theCtxt, true);


      // When deleting : unreference attribute IsDummy
  setIsDummy( theCtxt, true);



 
      // When deleting : unlink related InverseOFmetaRelationship
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaRelationship = getInverseOFmetaRelationship( theCtxt);
    if( someInverseOFmetaRelationship != null) {
      int aInverseOFmetaRelationshipLength = someInverseOFmetaRelationship.length;
      for( int anIndex = 0 ; anIndex < aInverseOFmetaRelationshipLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aInverseOFmetaRelationship = someInverseOFmetaRelationship[ anIndex];
        if( aInverseOFmetaRelationship != null) {
          removeInverseOFmetaRelationship( theCtxt, aInverseOFmetaRelationship);
        }
      }
    }


      // When deleting : unlink related InverseOFreplicatedMetaRelationship
    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] someInverseOFreplicatedMetaRelationship = getInverseOFreplicatedMetaRelationship( theCtxt);
    if( someInverseOFreplicatedMetaRelationship != null) {
      int aInverseOFreplicatedMetaRelationshipLength = someInverseOFreplicatedMetaRelationship.length;
      for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaRelationshipLength ; anIndex++) {
        com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc aInverseOFreplicatedMetaRelationship = someInverseOFreplicatedMetaRelationship[ anIndex];
        if( aInverseOFreplicatedMetaRelationship != null) {
          removeInverseOFreplicatedMetaRelationship( theCtxt, aInverseOFreplicatedMetaRelationship);
        }
      }
    }


      // When deleting : unlink related InverseOFtargetToTransfomations
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtargetToTransfomations = getInverseOFtargetToTransfomations( theCtxt);
    if( someInverseOFtargetToTransfomations != null) {
      int aInverseOFtargetToTransfomationsLength = someInverseOFtargetToTransfomations.length;
      for( int anIndex = 0 ; anIndex < aInverseOFtargetToTransfomationsLength ; anIndex++) {
        com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFtargetToTransfomations = someInverseOFtargetToTransfomations[ anIndex];
        if( aInverseOFtargetToTransfomations != null) {
          removeInverseOFtargetToTransfomations( theCtxt, aInverseOFtargetToTransfomations);
        }
      }
    }


      // When deleting : unlink related InverseOFprojectionToOriginals
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionToOriginals = getInverseOFprojectionToOriginals( theCtxt);
    if( someInverseOFprojectionToOriginals != null) {
      int aInverseOFprojectionToOriginalsLength = someInverseOFprojectionToOriginals.length;
      for( int anIndex = 0 ; anIndex < aInverseOFprojectionToOriginalsLength ; anIndex++) {
        com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFprojectionToOriginals = someInverseOFprojectionToOriginals[ anIndex];
        if( aInverseOFprojectionToOriginals != null) {
          removeInverseOFprojectionToOriginals( theCtxt, aInverseOFprojectionToOriginals);
        }
      }
    }


      // When deleting : unlink related InverseOFprojectedToProjections
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectedToProjections = getInverseOFprojectedToProjections( theCtxt);
    if( someInverseOFprojectedToProjections != null) {
      int aInverseOFprojectedToProjectionsLength = someInverseOFprojectedToProjections.length;
      for( int anIndex = 0 ; anIndex < aInverseOFprojectedToProjectionsLength ; anIndex++) {
        com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFprojectedToProjections = someInverseOFprojectedToProjections[ anIndex];
        if( aInverseOFprojectedToProjections != null) {
          removeInverseOFprojectedToProjections( theCtxt, aInverseOFprojectedToProjections);
        }
      }
    }


      // When deleting : unlink related InverseOFtransformationToSources
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSources = getInverseOFtransformationToSources( theCtxt);
    if( someInverseOFtransformationToSources != null) {
      int aInverseOFtransformationToSourcesLength = someInverseOFtransformationToSources.length;
      for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSourcesLength ; anIndex++) {
        com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFtransformationToSources = someInverseOFtransformationToSources[ anIndex];
        if( aInverseOFtransformationToSources != null) {
          removeInverseOFtransformationToSources( theCtxt, aInverseOFtransformationToSources);
        }
      }
    }


      // When deleting : unlink related InverseOFtransformationToSubTransformations
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSubTransformations = getInverseOFtransformationToSubTransformations( theCtxt);
    if( someInverseOFtransformationToSubTransformations != null) {
      int aInverseOFtransformationToSubTransformationsLength = someInverseOFtransformationToSubTransformations.length;
      for( int anIndex = 0 ; anIndex < aInverseOFtransformationToSubTransformationsLength ; anIndex++) {
        com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFtransformationToSubTransformations = someInverseOFtransformationToSubTransformations[ anIndex];
        if( aInverseOFtransformationToSubTransformations != null) {
          removeInverseOFtransformationToSubTransformations( theCtxt, aInverseOFtransformationToSubTransformations);
        }
      }
    }


    // When deleting unlink related Inverse
  setInverse( theCtxt, null);


    // When deleting unlink related Type
  setType( theCtxt, null);


    // When deleting unlink related RelatedType
  setRelatedType( theCtxt, null);



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
      vm3Type = com.dosmil_e.m3.core.meta.M3RelationshipMeta.getStaticM3Type( theCtxt);
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


