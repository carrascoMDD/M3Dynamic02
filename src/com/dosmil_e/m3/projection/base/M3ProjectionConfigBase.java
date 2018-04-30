package com.dosmil_e.m3.projection.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3ProjectionConfigBase
   extends com.dosmil_e.m3.traversal.impl.M3TraversalConfigImpl
    implements com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3ProjectionConfig metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the M3ProjectionConfig metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.core.priv.M3RelationshipPriv vrTargetToTransfomations; 

	protected com.dosmil_e.m3.core.priv.M3RelationshipPriv vrProjectionToOriginals; 

	protected com.dosmil_e.m3.core.priv.M3RelationshipPriv vrProjectedToProjections; 

	protected com.dosmil_e.m3.core.priv.M3RelationshipPriv vrTransformationToSources; 

	protected com.dosmil_e.m3.core.priv.M3RelationshipPriv vrTransformationToSubTransformations; 

	protected com.dosmil_e.m3.core.priv.M3TypePriv vrProjectionType; 

	protected com.dosmil_e.m3.core.priv.M3TypePriv vrExclusionType; 

	protected com.dosmil_e.m3.core.priv.M3AttributePriv vrExcludedInRelationshipNamed; 






/****************************************************************************
 *  Constructors of the M3ProjectionConfig metamodel element
 ****************************************************************************/

  public M3ProjectionConfigBase() {
    super();
  }


  public M3ProjectionConfigBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3ProjectionConfigBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3ProjectionConfigIfc and M3ProjectionConfigPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3ProjectionConfig
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of M3ProjectionConfig
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship TargetToTransfomations
 ****************************************************************************/


    /* Public Read accessor for role TargetToTransfomations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTargetToTransfomations( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTargetToTransfomationsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTargetToTransfomationsPR( theCtxt);
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

    /* Public TargetToTransfomations number access
     */
  public int numTargetToTransfomations( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numTargetToTransfomationsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numTargetToTransfomationsPR( theCtxt);
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



    /* Public TargetToTransfomations read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTargetToTransfomationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTargetToTransfomationsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTargetToTransfomationsAtPR( theCtxt, theIndex);
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


    /* Public TargetToTransfomations finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findTargetToTransfomationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findTargetToTransfomationsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findTargetToTransfomationsNamedPR( theCtxt, theMMName);
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




    /* Public TargetToTransfomations is related predicate
     */
  public boolean hasTargetToTransfomationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTargetToTransfomationsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTargetToTransfomationsNamedPR( theCtxt, theMMName);
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



    /* Transactional TargetToTransfomations is related  predicate
     */
  public boolean hasTargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTargetToTransfomations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTargetToTransfomationsPR( theCtxt, theTargetToTransfomations);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTargetToTransfomationsPR( theCtxt, theTargetToTransfomations);
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


    /* Public TargetToTransfomations index access
     */
  public int indexOfTargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTargetToTransfomations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfTargetToTransfomationsPR( theCtxt, theTargetToTransfomations);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfTargetToTransfomationsPR( theCtxt, theTargetToTransfomations);
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




    /* Public Write accessor for role TargetToTransfomations
     */
  public void setTargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTargetToTransfomations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setTargetToTransfomationsPR( theCtxt, theTargetToTransfomations);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setTargetToTransfomationsPR( theCtxt, theTargetToTransfomations);
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
 *  Implementation of internal operations for relationship TargetToTransfomations
 ****************************************************************************/


    /* Public Read accessor for role TargetToTransfomations
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTargetToTransfomationsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTargetToTransfomationsPrivileged( theCtxt);
  }


    /* Public TargetToTransfomations number access
     */
  public int numTargetToTransfomationsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTargetToTransfomationsPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public TargetToTransfomations read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTargetToTransfomationsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getTargetToTransfomationsPrivileged( theCtxt);
  }


    /* Public TargetToTransfomations finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findTargetToTransfomationsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTargetToTransfomations = getTargetToTransfomationsPrivileged( theCtxt);
    if( aTargetToTransfomations == null) { return null;}

    if( !aTargetToTransfomations.sameNameAs( theCtxt, theMMName)) { return null;}

    return aTargetToTransfomations;
  }


    /* Public TargetToTransfomations finder predicate by name
     */
  public boolean hasTargetToTransfomationsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTargetToTransfomations = getTargetToTransfomationsPrivileged( theCtxt);
    if( aTargetToTransfomations == null) { return false;}

    return aTargetToTransfomations.sameNameAs( theCtxt, theMMName);
  }



    /* Public TargetToTransfomations is related predicate
     */
  public boolean hasTargetToTransfomationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTargetToTransfomations) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTargetToTransfomations = getTargetToTransfomationsPrivileged( theCtxt);
    if( aTargetToTransfomations == null) { return false;}

    return aTargetToTransfomations.sameAs( theCtxt, theTargetToTransfomations);
  }




    /* Public TargetToTransfomations index access
     */
  public int indexOfTargetToTransfomationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTargetToTransfomations) throws EAIException {
    if( !hasTargetToTransfomationsPR( theCtxt, theTargetToTransfomations)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role TargetToTransfomations
     */
  public void setTargetToTransfomationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTargetToTransfomations) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aTargetToTransfomations = getTargetToTransfomationsPrivileged( theCtxt);
      // Check for new TargetToTransfomations same as current one
    if( aTargetToTransfomations != null && aTargetToTransfomations.sameAs( theCtxt, theTargetToTransfomations)) { return;}

    if( aTargetToTransfomations != null) {
      aTargetToTransfomations.removeInverseOFtargetToTransfomationsPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetTargetToTransfomationsPrivileged();
      */
    }

    if( theTargetToTransfomations != null) {
      com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewTargetToTransfomations = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theTargetToTransfomations;
      aNewTargetToTransfomations.addInverseOFtargetToTransfomationsPrivileged( theCtxt, this);
      setTargetToTransfomationsPrivileged( theCtxt, aNewTargetToTransfomations);
    }
    else {
      setTargetToTransfomationsPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship TargetToTransfomations
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role TargetToTransfomations
     * Guaranteed to return object with same identity of the TargetToTransfomations
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getTargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrTargetToTransfomations;
  }




    /* Remove current reference in role TargetToTransfomations
     * Used by relationship maintenance machinery
     */
  public void unsetTargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTargetToTransfomations = vrTargetToTransfomations;
    vrTargetToTransfomations = null;
      // If there was change, propagate
    if( aTargetToTransfomations != null) {
      change( theCtxt, "TargetToTransfomations", aTargetToTransfomations, vrTargetToTransfomations, "vrTargetToTransfomations");
    }
  }





    /* Set reference in role TargetToTransfomations
     * Used by relationship maintenance machinery
     */
  public void setTargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theTargetToTransfomations) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTargetToTransfomations = vrTargetToTransfomations;
    vrTargetToTransfomations = theTargetToTransfomations;
      // If there was change, propagate
    if( (aTargetToTransfomations != null && !aTargetToTransfomations.sameAs( theCtxt, theTargetToTransfomations)) || (aTargetToTransfomations == null && theTargetToTransfomations != null)) {
      change( theCtxt, "TargetToTransfomations", aTargetToTransfomations, vrTargetToTransfomations, "vrTargetToTransfomations");
    }
  }





    /* Unset currently related TargetToTransfomations and
     * Set reference in role TargetToTransfomations
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theTargetToTransfomations) throws EAIException {
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aTargetToTransfomations = vrTargetToTransfomations;
    if( aTargetToTransfomations != null) {
      aTargetToTransfomations.removeInverseOFtargetToTransfomationsPrivileged( theCtxt, this);
    }
    vrTargetToTransfomations = theTargetToTransfomations;
      // If there was change, propagate
    if( (aTargetToTransfomations != null && !aTargetToTransfomations.sameAs( theCtxt, theTargetToTransfomations)) || (aTargetToTransfomations == null && theTargetToTransfomations != null)) {
      change( theCtxt, "TargetToTransfomations", aTargetToTransfomations, vrTargetToTransfomations, "vrTargetToTransfomations");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship ProjectionToOriginals
 ****************************************************************************/


    /* Public Read accessor for role ProjectionToOriginals
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getProjectionToOriginals( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getProjectionToOriginalsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getProjectionToOriginalsPR( theCtxt);
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

    /* Public ProjectionToOriginals number access
     */
  public int numProjectionToOriginals( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numProjectionToOriginalsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numProjectionToOriginalsPR( theCtxt);
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



    /* Public ProjectionToOriginals read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getProjectionToOriginalsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getProjectionToOriginalsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getProjectionToOriginalsAtPR( theCtxt, theIndex);
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


    /* Public ProjectionToOriginals finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findProjectionToOriginalsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findProjectionToOriginalsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findProjectionToOriginalsNamedPR( theCtxt, theMMName);
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




    /* Public ProjectionToOriginals is related predicate
     */
  public boolean hasProjectionToOriginalsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasProjectionToOriginalsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasProjectionToOriginalsNamedPR( theCtxt, theMMName);
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



    /* Transactional ProjectionToOriginals is related  predicate
     */
  public boolean hasProjectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectionToOriginals) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasProjectionToOriginalsPR( theCtxt, theProjectionToOriginals);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasProjectionToOriginalsPR( theCtxt, theProjectionToOriginals);
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


    /* Public ProjectionToOriginals index access
     */
  public int indexOfProjectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectionToOriginals) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfProjectionToOriginalsPR( theCtxt, theProjectionToOriginals);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfProjectionToOriginalsPR( theCtxt, theProjectionToOriginals);
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




    /* Public Write accessor for role ProjectionToOriginals
     */
  public void setProjectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectionToOriginals) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setProjectionToOriginalsPR( theCtxt, theProjectionToOriginals);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setProjectionToOriginalsPR( theCtxt, theProjectionToOriginals);
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
 *  Implementation of internal operations for relationship ProjectionToOriginals
 ****************************************************************************/


    /* Public Read accessor for role ProjectionToOriginals
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getProjectionToOriginalsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getProjectionToOriginalsPrivileged( theCtxt);
  }


    /* Public ProjectionToOriginals number access
     */
  public int numProjectionToOriginalsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getProjectionToOriginalsPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public ProjectionToOriginals read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getProjectionToOriginalsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getProjectionToOriginalsPrivileged( theCtxt);
  }


    /* Public ProjectionToOriginals finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findProjectionToOriginalsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aProjectionToOriginals = getProjectionToOriginalsPrivileged( theCtxt);
    if( aProjectionToOriginals == null) { return null;}

    if( !aProjectionToOriginals.sameNameAs( theCtxt, theMMName)) { return null;}

    return aProjectionToOriginals;
  }


    /* Public ProjectionToOriginals finder predicate by name
     */
  public boolean hasProjectionToOriginalsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aProjectionToOriginals = getProjectionToOriginalsPrivileged( theCtxt);
    if( aProjectionToOriginals == null) { return false;}

    return aProjectionToOriginals.sameNameAs( theCtxt, theMMName);
  }



    /* Public ProjectionToOriginals is related predicate
     */
  public boolean hasProjectionToOriginalsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectionToOriginals) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aProjectionToOriginals = getProjectionToOriginalsPrivileged( theCtxt);
    if( aProjectionToOriginals == null) { return false;}

    return aProjectionToOriginals.sameAs( theCtxt, theProjectionToOriginals);
  }




    /* Public ProjectionToOriginals index access
     */
  public int indexOfProjectionToOriginalsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectionToOriginals) throws EAIException {
    if( !hasProjectionToOriginalsPR( theCtxt, theProjectionToOriginals)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role ProjectionToOriginals
     */
  public void setProjectionToOriginalsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectionToOriginals) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aProjectionToOriginals = getProjectionToOriginalsPrivileged( theCtxt);
      // Check for new ProjectionToOriginals same as current one
    if( aProjectionToOriginals != null && aProjectionToOriginals.sameAs( theCtxt, theProjectionToOriginals)) { return;}

    if( aProjectionToOriginals != null) {
      aProjectionToOriginals.removeInverseOFprojectionToOriginalsPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetProjectionToOriginalsPrivileged();
      */
    }

    if( theProjectionToOriginals != null) {
      com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewProjectionToOriginals = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theProjectionToOriginals;
      aNewProjectionToOriginals.addInverseOFprojectionToOriginalsPrivileged( theCtxt, this);
      setProjectionToOriginalsPrivileged( theCtxt, aNewProjectionToOriginals);
    }
    else {
      setProjectionToOriginalsPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship ProjectionToOriginals
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ProjectionToOriginals
     * Guaranteed to return object with same identity of the ProjectionToOriginals
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getProjectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrProjectionToOriginals;
  }




    /* Remove current reference in role ProjectionToOriginals
     * Used by relationship maintenance machinery
     */
  public void unsetProjectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aProjectionToOriginals = vrProjectionToOriginals;
    vrProjectionToOriginals = null;
      // If there was change, propagate
    if( aProjectionToOriginals != null) {
      change( theCtxt, "ProjectionToOriginals", aProjectionToOriginals, vrProjectionToOriginals, "vrProjectionToOriginals");
    }
  }





    /* Set reference in role ProjectionToOriginals
     * Used by relationship maintenance machinery
     */
  public void setProjectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theProjectionToOriginals) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aProjectionToOriginals = vrProjectionToOriginals;
    vrProjectionToOriginals = theProjectionToOriginals;
      // If there was change, propagate
    if( (aProjectionToOriginals != null && !aProjectionToOriginals.sameAs( theCtxt, theProjectionToOriginals)) || (aProjectionToOriginals == null && theProjectionToOriginals != null)) {
      change( theCtxt, "ProjectionToOriginals", aProjectionToOriginals, vrProjectionToOriginals, "vrProjectionToOriginals");
    }
  }





    /* Unset currently related ProjectionToOriginals and
     * Set reference in role ProjectionToOriginals
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetProjectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theProjectionToOriginals) throws EAIException {
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aProjectionToOriginals = vrProjectionToOriginals;
    if( aProjectionToOriginals != null) {
      aProjectionToOriginals.removeInverseOFprojectionToOriginalsPrivileged( theCtxt, this);
    }
    vrProjectionToOriginals = theProjectionToOriginals;
      // If there was change, propagate
    if( (aProjectionToOriginals != null && !aProjectionToOriginals.sameAs( theCtxt, theProjectionToOriginals)) || (aProjectionToOriginals == null && theProjectionToOriginals != null)) {
      change( theCtxt, "ProjectionToOriginals", aProjectionToOriginals, vrProjectionToOriginals, "vrProjectionToOriginals");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship ProjectedToProjections
 ****************************************************************************/


    /* Public Read accessor for role ProjectedToProjections
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getProjectedToProjections( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getProjectedToProjectionsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getProjectedToProjectionsPR( theCtxt);
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

    /* Public ProjectedToProjections number access
     */
  public int numProjectedToProjections( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numProjectedToProjectionsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numProjectedToProjectionsPR( theCtxt);
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



    /* Public ProjectedToProjections read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getProjectedToProjectionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getProjectedToProjectionsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getProjectedToProjectionsAtPR( theCtxt, theIndex);
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


    /* Public ProjectedToProjections finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findProjectedToProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findProjectedToProjectionsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findProjectedToProjectionsNamedPR( theCtxt, theMMName);
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




    /* Public ProjectedToProjections is related predicate
     */
  public boolean hasProjectedToProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasProjectedToProjectionsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasProjectedToProjectionsNamedPR( theCtxt, theMMName);
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



    /* Transactional ProjectedToProjections is related  predicate
     */
  public boolean hasProjectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectedToProjections) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasProjectedToProjectionsPR( theCtxt, theProjectedToProjections);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasProjectedToProjectionsPR( theCtxt, theProjectedToProjections);
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


    /* Public ProjectedToProjections index access
     */
  public int indexOfProjectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectedToProjections) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfProjectedToProjectionsPR( theCtxt, theProjectedToProjections);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfProjectedToProjectionsPR( theCtxt, theProjectedToProjections);
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




    /* Public Write accessor for role ProjectedToProjections
     */
  public void setProjectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectedToProjections) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setProjectedToProjectionsPR( theCtxt, theProjectedToProjections);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setProjectedToProjectionsPR( theCtxt, theProjectedToProjections);
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
 *  Implementation of internal operations for relationship ProjectedToProjections
 ****************************************************************************/


    /* Public Read accessor for role ProjectedToProjections
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getProjectedToProjectionsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getProjectedToProjectionsPrivileged( theCtxt);
  }


    /* Public ProjectedToProjections number access
     */
  public int numProjectedToProjectionsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getProjectedToProjectionsPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public ProjectedToProjections read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getProjectedToProjectionsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getProjectedToProjectionsPrivileged( theCtxt);
  }


    /* Public ProjectedToProjections finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findProjectedToProjectionsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aProjectedToProjections = getProjectedToProjectionsPrivileged( theCtxt);
    if( aProjectedToProjections == null) { return null;}

    if( !aProjectedToProjections.sameNameAs( theCtxt, theMMName)) { return null;}

    return aProjectedToProjections;
  }


    /* Public ProjectedToProjections finder predicate by name
     */
  public boolean hasProjectedToProjectionsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aProjectedToProjections = getProjectedToProjectionsPrivileged( theCtxt);
    if( aProjectedToProjections == null) { return false;}

    return aProjectedToProjections.sameNameAs( theCtxt, theMMName);
  }



    /* Public ProjectedToProjections is related predicate
     */
  public boolean hasProjectedToProjectionsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectedToProjections) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aProjectedToProjections = getProjectedToProjectionsPrivileged( theCtxt);
    if( aProjectedToProjections == null) { return false;}

    return aProjectedToProjections.sameAs( theCtxt, theProjectedToProjections);
  }




    /* Public ProjectedToProjections index access
     */
  public int indexOfProjectedToProjectionsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectedToProjections) throws EAIException {
    if( !hasProjectedToProjectionsPR( theCtxt, theProjectedToProjections)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role ProjectedToProjections
     */
  public void setProjectedToProjectionsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectedToProjections) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aProjectedToProjections = getProjectedToProjectionsPrivileged( theCtxt);
      // Check for new ProjectedToProjections same as current one
    if( aProjectedToProjections != null && aProjectedToProjections.sameAs( theCtxt, theProjectedToProjections)) { return;}

    if( aProjectedToProjections != null) {
      aProjectedToProjections.removeInverseOFprojectedToProjectionsPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetProjectedToProjectionsPrivileged();
      */
    }

    if( theProjectedToProjections != null) {
      com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewProjectedToProjections = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theProjectedToProjections;
      aNewProjectedToProjections.addInverseOFprojectedToProjectionsPrivileged( theCtxt, this);
      setProjectedToProjectionsPrivileged( theCtxt, aNewProjectedToProjections);
    }
    else {
      setProjectedToProjectionsPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship ProjectedToProjections
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ProjectedToProjections
     * Guaranteed to return object with same identity of the ProjectedToProjections
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getProjectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrProjectedToProjections;
  }




    /* Remove current reference in role ProjectedToProjections
     * Used by relationship maintenance machinery
     */
  public void unsetProjectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aProjectedToProjections = vrProjectedToProjections;
    vrProjectedToProjections = null;
      // If there was change, propagate
    if( aProjectedToProjections != null) {
      change( theCtxt, "ProjectedToProjections", aProjectedToProjections, vrProjectedToProjections, "vrProjectedToProjections");
    }
  }





    /* Set reference in role ProjectedToProjections
     * Used by relationship maintenance machinery
     */
  public void setProjectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theProjectedToProjections) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aProjectedToProjections = vrProjectedToProjections;
    vrProjectedToProjections = theProjectedToProjections;
      // If there was change, propagate
    if( (aProjectedToProjections != null && !aProjectedToProjections.sameAs( theCtxt, theProjectedToProjections)) || (aProjectedToProjections == null && theProjectedToProjections != null)) {
      change( theCtxt, "ProjectedToProjections", aProjectedToProjections, vrProjectedToProjections, "vrProjectedToProjections");
    }
  }





    /* Unset currently related ProjectedToProjections and
     * Set reference in role ProjectedToProjections
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetProjectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theProjectedToProjections) throws EAIException {
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aProjectedToProjections = vrProjectedToProjections;
    if( aProjectedToProjections != null) {
      aProjectedToProjections.removeInverseOFprojectedToProjectionsPrivileged( theCtxt, this);
    }
    vrProjectedToProjections = theProjectedToProjections;
      // If there was change, propagate
    if( (aProjectedToProjections != null && !aProjectedToProjections.sameAs( theCtxt, theProjectedToProjections)) || (aProjectedToProjections == null && theProjectedToProjections != null)) {
      change( theCtxt, "ProjectedToProjections", aProjectedToProjections, vrProjectedToProjections, "vrProjectedToProjections");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship TransformationToSources
 ****************************************************************************/


    /* Public Read accessor for role TransformationToSources
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTransformationToSources( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTransformationToSourcesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTransformationToSourcesPR( theCtxt);
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

    /* Public TransformationToSources number access
     */
  public int numTransformationToSources( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numTransformationToSourcesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numTransformationToSourcesPR( theCtxt);
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



    /* Public TransformationToSources read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTransformationToSourcesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTransformationToSourcesAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTransformationToSourcesAtPR( theCtxt, theIndex);
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


    /* Public TransformationToSources finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findTransformationToSourcesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findTransformationToSourcesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findTransformationToSourcesNamedPR( theCtxt, theMMName);
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




    /* Public TransformationToSources is related predicate
     */
  public boolean hasTransformationToSourcesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTransformationToSourcesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTransformationToSourcesNamedPR( theCtxt, theMMName);
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



    /* Transactional TransformationToSources is related  predicate
     */
  public boolean hasTransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSources) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTransformationToSourcesPR( theCtxt, theTransformationToSources);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTransformationToSourcesPR( theCtxt, theTransformationToSources);
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


    /* Public TransformationToSources index access
     */
  public int indexOfTransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSources) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfTransformationToSourcesPR( theCtxt, theTransformationToSources);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfTransformationToSourcesPR( theCtxt, theTransformationToSources);
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




    /* Public Write accessor for role TransformationToSources
     */
  public void setTransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSources) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setTransformationToSourcesPR( theCtxt, theTransformationToSources);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setTransformationToSourcesPR( theCtxt, theTransformationToSources);
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
 *  Implementation of internal operations for relationship TransformationToSources
 ****************************************************************************/


    /* Public Read accessor for role TransformationToSources
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTransformationToSourcesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTransformationToSourcesPrivileged( theCtxt);
  }


    /* Public TransformationToSources number access
     */
  public int numTransformationToSourcesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTransformationToSourcesPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public TransformationToSources read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTransformationToSourcesAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getTransformationToSourcesPrivileged( theCtxt);
  }


    /* Public TransformationToSources finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findTransformationToSourcesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTransformationToSources = getTransformationToSourcesPrivileged( theCtxt);
    if( aTransformationToSources == null) { return null;}

    if( !aTransformationToSources.sameNameAs( theCtxt, theMMName)) { return null;}

    return aTransformationToSources;
  }


    /* Public TransformationToSources finder predicate by name
     */
  public boolean hasTransformationToSourcesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTransformationToSources = getTransformationToSourcesPrivileged( theCtxt);
    if( aTransformationToSources == null) { return false;}

    return aTransformationToSources.sameNameAs( theCtxt, theMMName);
  }



    /* Public TransformationToSources is related predicate
     */
  public boolean hasTransformationToSourcesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSources) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTransformationToSources = getTransformationToSourcesPrivileged( theCtxt);
    if( aTransformationToSources == null) { return false;}

    return aTransformationToSources.sameAs( theCtxt, theTransformationToSources);
  }




    /* Public TransformationToSources index access
     */
  public int indexOfTransformationToSourcesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSources) throws EAIException {
    if( !hasTransformationToSourcesPR( theCtxt, theTransformationToSources)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role TransformationToSources
     */
  public void setTransformationToSourcesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSources) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aTransformationToSources = getTransformationToSourcesPrivileged( theCtxt);
      // Check for new TransformationToSources same as current one
    if( aTransformationToSources != null && aTransformationToSources.sameAs( theCtxt, theTransformationToSources)) { return;}

    if( aTransformationToSources != null) {
      aTransformationToSources.removeInverseOFtransformationToSourcesPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetTransformationToSourcesPrivileged();
      */
    }

    if( theTransformationToSources != null) {
      com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewTransformationToSources = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theTransformationToSources;
      aNewTransformationToSources.addInverseOFtransformationToSourcesPrivileged( theCtxt, this);
      setTransformationToSourcesPrivileged( theCtxt, aNewTransformationToSources);
    }
    else {
      setTransformationToSourcesPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship TransformationToSources
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role TransformationToSources
     * Guaranteed to return object with same identity of the TransformationToSources
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getTransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrTransformationToSources;
  }




    /* Remove current reference in role TransformationToSources
     * Used by relationship maintenance machinery
     */
  public void unsetTransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTransformationToSources = vrTransformationToSources;
    vrTransformationToSources = null;
      // If there was change, propagate
    if( aTransformationToSources != null) {
      change( theCtxt, "TransformationToSources", aTransformationToSources, vrTransformationToSources, "vrTransformationToSources");
    }
  }





    /* Set reference in role TransformationToSources
     * Used by relationship maintenance machinery
     */
  public void setTransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theTransformationToSources) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTransformationToSources = vrTransformationToSources;
    vrTransformationToSources = theTransformationToSources;
      // If there was change, propagate
    if( (aTransformationToSources != null && !aTransformationToSources.sameAs( theCtxt, theTransformationToSources)) || (aTransformationToSources == null && theTransformationToSources != null)) {
      change( theCtxt, "TransformationToSources", aTransformationToSources, vrTransformationToSources, "vrTransformationToSources");
    }
  }





    /* Unset currently related TransformationToSources and
     * Set reference in role TransformationToSources
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theTransformationToSources) throws EAIException {
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aTransformationToSources = vrTransformationToSources;
    if( aTransformationToSources != null) {
      aTransformationToSources.removeInverseOFtransformationToSourcesPrivileged( theCtxt, this);
    }
    vrTransformationToSources = theTransformationToSources;
      // If there was change, propagate
    if( (aTransformationToSources != null && !aTransformationToSources.sameAs( theCtxt, theTransformationToSources)) || (aTransformationToSources == null && theTransformationToSources != null)) {
      change( theCtxt, "TransformationToSources", aTransformationToSources, vrTransformationToSources, "vrTransformationToSources");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship TransformationToSubTransformations
 ****************************************************************************/


    /* Public Read accessor for role TransformationToSubTransformations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTransformationToSubTransformations( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTransformationToSubTransformationsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTransformationToSubTransformationsPR( theCtxt);
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

    /* Public TransformationToSubTransformations number access
     */
  public int numTransformationToSubTransformations( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numTransformationToSubTransformationsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numTransformationToSubTransformationsPR( theCtxt);
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



    /* Public TransformationToSubTransformations read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTransformationToSubTransformationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTransformationToSubTransformationsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTransformationToSubTransformationsAtPR( theCtxt, theIndex);
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


    /* Public TransformationToSubTransformations finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findTransformationToSubTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findTransformationToSubTransformationsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findTransformationToSubTransformationsNamedPR( theCtxt, theMMName);
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




    /* Public TransformationToSubTransformations is related predicate
     */
  public boolean hasTransformationToSubTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTransformationToSubTransformationsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTransformationToSubTransformationsNamedPR( theCtxt, theMMName);
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



    /* Transactional TransformationToSubTransformations is related  predicate
     */
  public boolean hasTransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSubTransformations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTransformationToSubTransformationsPR( theCtxt, theTransformationToSubTransformations);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTransformationToSubTransformationsPR( theCtxt, theTransformationToSubTransformations);
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


    /* Public TransformationToSubTransformations index access
     */
  public int indexOfTransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSubTransformations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfTransformationToSubTransformationsPR( theCtxt, theTransformationToSubTransformations);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfTransformationToSubTransformationsPR( theCtxt, theTransformationToSubTransformations);
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




    /* Public Write accessor for role TransformationToSubTransformations
     */
  public void setTransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSubTransformations) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setTransformationToSubTransformationsPR( theCtxt, theTransformationToSubTransformations);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setTransformationToSubTransformationsPR( theCtxt, theTransformationToSubTransformations);
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
 *  Implementation of internal operations for relationship TransformationToSubTransformations
 ****************************************************************************/


    /* Public Read accessor for role TransformationToSubTransformations
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTransformationToSubTransformationsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTransformationToSubTransformationsPrivileged( theCtxt);
  }


    /* Public TransformationToSubTransformations number access
     */
  public int numTransformationToSubTransformationsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTransformationToSubTransformationsPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public TransformationToSubTransformations read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTransformationToSubTransformationsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getTransformationToSubTransformationsPrivileged( theCtxt);
  }


    /* Public TransformationToSubTransformations finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findTransformationToSubTransformationsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTransformationToSubTransformations = getTransformationToSubTransformationsPrivileged( theCtxt);
    if( aTransformationToSubTransformations == null) { return null;}

    if( !aTransformationToSubTransformations.sameNameAs( theCtxt, theMMName)) { return null;}

    return aTransformationToSubTransformations;
  }


    /* Public TransformationToSubTransformations finder predicate by name
     */
  public boolean hasTransformationToSubTransformationsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTransformationToSubTransformations = getTransformationToSubTransformationsPrivileged( theCtxt);
    if( aTransformationToSubTransformations == null) { return false;}

    return aTransformationToSubTransformations.sameNameAs( theCtxt, theMMName);
  }



    /* Public TransformationToSubTransformations is related predicate
     */
  public boolean hasTransformationToSubTransformationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSubTransformations) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTransformationToSubTransformations = getTransformationToSubTransformationsPrivileged( theCtxt);
    if( aTransformationToSubTransformations == null) { return false;}

    return aTransformationToSubTransformations.sameAs( theCtxt, theTransformationToSubTransformations);
  }




    /* Public TransformationToSubTransformations index access
     */
  public int indexOfTransformationToSubTransformationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSubTransformations) throws EAIException {
    if( !hasTransformationToSubTransformationsPR( theCtxt, theTransformationToSubTransformations)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role TransformationToSubTransformations
     */
  public void setTransformationToSubTransformationsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSubTransformations) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aTransformationToSubTransformations = getTransformationToSubTransformationsPrivileged( theCtxt);
      // Check for new TransformationToSubTransformations same as current one
    if( aTransformationToSubTransformations != null && aTransformationToSubTransformations.sameAs( theCtxt, theTransformationToSubTransformations)) { return;}

    if( aTransformationToSubTransformations != null) {
      aTransformationToSubTransformations.removeInverseOFtransformationToSubTransformationsPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetTransformationToSubTransformationsPrivileged();
      */
    }

    if( theTransformationToSubTransformations != null) {
      com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewTransformationToSubTransformations = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theTransformationToSubTransformations;
      aNewTransformationToSubTransformations.addInverseOFtransformationToSubTransformationsPrivileged( theCtxt, this);
      setTransformationToSubTransformationsPrivileged( theCtxt, aNewTransformationToSubTransformations);
    }
    else {
      setTransformationToSubTransformationsPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship TransformationToSubTransformations
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role TransformationToSubTransformations
     * Guaranteed to return object with same identity of the TransformationToSubTransformations
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getTransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrTransformationToSubTransformations;
  }




    /* Remove current reference in role TransformationToSubTransformations
     * Used by relationship maintenance machinery
     */
  public void unsetTransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTransformationToSubTransformations = vrTransformationToSubTransformations;
    vrTransformationToSubTransformations = null;
      // If there was change, propagate
    if( aTransformationToSubTransformations != null) {
      change( theCtxt, "TransformationToSubTransformations", aTransformationToSubTransformations, vrTransformationToSubTransformations, "vrTransformationToSubTransformations");
    }
  }





    /* Set reference in role TransformationToSubTransformations
     * Used by relationship maintenance machinery
     */
  public void setTransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theTransformationToSubTransformations) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aTransformationToSubTransformations = vrTransformationToSubTransformations;
    vrTransformationToSubTransformations = theTransformationToSubTransformations;
      // If there was change, propagate
    if( (aTransformationToSubTransformations != null && !aTransformationToSubTransformations.sameAs( theCtxt, theTransformationToSubTransformations)) || (aTransformationToSubTransformations == null && theTransformationToSubTransformations != null)) {
      change( theCtxt, "TransformationToSubTransformations", aTransformationToSubTransformations, vrTransformationToSubTransformations, "vrTransformationToSubTransformations");
    }
  }





    /* Unset currently related TransformationToSubTransformations and
     * Set reference in role TransformationToSubTransformations
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theTransformationToSubTransformations) throws EAIException {
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aTransformationToSubTransformations = vrTransformationToSubTransformations;
    if( aTransformationToSubTransformations != null) {
      aTransformationToSubTransformations.removeInverseOFtransformationToSubTransformationsPrivileged( theCtxt, this);
    }
    vrTransformationToSubTransformations = theTransformationToSubTransformations;
      // If there was change, propagate
    if( (aTransformationToSubTransformations != null && !aTransformationToSubTransformations.sameAs( theCtxt, theTransformationToSubTransformations)) || (aTransformationToSubTransformations == null && theTransformationToSubTransformations != null)) {
      change( theCtxt, "TransformationToSubTransformations", aTransformationToSubTransformations, vrTransformationToSubTransformations, "vrTransformationToSubTransformations");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship ProjectionType
 ****************************************************************************/


    /* Public Read accessor for role ProjectionType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getProjectionType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getProjectionTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getProjectionTypePR( theCtxt);
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

    /* Public ProjectionType number access
     */
  public int numProjectionType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numProjectionTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numProjectionTypePR( theCtxt);
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



    /* Public ProjectionType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getProjectionTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getProjectionTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getProjectionTypeAtPR( theCtxt, theIndex);
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


    /* Public ProjectionType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findProjectionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findProjectionTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findProjectionTypeNamedPR( theCtxt, theMMName);
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




    /* Public ProjectionType is related predicate
     */
  public boolean hasProjectionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasProjectionTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasProjectionTypeNamedPR( theCtxt, theMMName);
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



    /* Transactional ProjectionType is related  predicate
     */
  public boolean hasProjectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theProjectionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasProjectionTypePR( theCtxt, theProjectionType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasProjectionTypePR( theCtxt, theProjectionType);
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


    /* Public ProjectionType index access
     */
  public int indexOfProjectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theProjectionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfProjectionTypePR( theCtxt, theProjectionType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfProjectionTypePR( theCtxt, theProjectionType);
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




    /* Public Write accessor for role ProjectionType
     */
  public void setProjectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theProjectionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setProjectionTypePR( theCtxt, theProjectionType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setProjectionTypePR( theCtxt, theProjectionType);
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
 *  Implementation of internal operations for relationship ProjectionType
 ****************************************************************************/


    /* Public Read accessor for role ProjectionType
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getProjectionTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getProjectionTypePrivileged( theCtxt);
  }


    /* Public ProjectionType number access
     */
  public int numProjectionTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getProjectionTypePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public ProjectionType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getProjectionTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getProjectionTypePrivileged( theCtxt);
  }


    /* Public ProjectionType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findProjectionTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3TypeIfc aProjectionType = getProjectionTypePrivileged( theCtxt);
    if( aProjectionType == null) { return null;}

    if( !aProjectionType.sameNameAs( theCtxt, theMMName)) { return null;}

    return aProjectionType;
  }


    /* Public ProjectionType finder predicate by name
     */
  public boolean hasProjectionTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aProjectionType = getProjectionTypePrivileged( theCtxt);
    if( aProjectionType == null) { return false;}

    return aProjectionType.sameNameAs( theCtxt, theMMName);
  }



    /* Public ProjectionType is related predicate
     */
  public boolean hasProjectionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theProjectionType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aProjectionType = getProjectionTypePrivileged( theCtxt);
    if( aProjectionType == null) { return false;}

    return aProjectionType.sameAs( theCtxt, theProjectionType);
  }




    /* Public ProjectionType index access
     */
  public int indexOfProjectionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theProjectionType) throws EAIException {
    if( !hasProjectionTypePR( theCtxt, theProjectionType)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role ProjectionType
     */
  public void setProjectionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theProjectionType) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv aProjectionType = getProjectionTypePrivileged( theCtxt);
      // Check for new ProjectionType same as current one
    if( aProjectionType != null && aProjectionType.sameAs( theCtxt, theProjectionType)) { return;}

    if( aProjectionType != null) {
      aProjectionType.removeInverseOFprojectionTypePrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetProjectionTypePrivileged();
      */
    }

    if( theProjectionType != null) {
      com.dosmil_e.m3.core.priv.M3TypePriv aNewProjectionType = (com.dosmil_e.m3.core.priv.M3TypePriv) theProjectionType;
      aNewProjectionType.addInverseOFprojectionTypePrivileged( theCtxt, this);
      setProjectionTypePrivileged( theCtxt, aNewProjectionType);
    }
    else {
      setProjectionTypePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship ProjectionType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ProjectionType
     * Guaranteed to return object with same identity of the ProjectionType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getProjectionTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrProjectionType;
  }




    /* Remove current reference in role ProjectionType
     * Used by relationship maintenance machinery
     */
  public void unsetProjectionTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aProjectionType = vrProjectionType;
    vrProjectionType = null;
      // If there was change, propagate
    if( aProjectionType != null) {
      change( theCtxt, "ProjectionType", aProjectionType, vrProjectionType, "vrProjectionType");
    }
  }





    /* Set reference in role ProjectionType
     * Used by relationship maintenance machinery
     */
  public void setProjectionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theProjectionType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aProjectionType = vrProjectionType;
    vrProjectionType = theProjectionType;
      // If there was change, propagate
    if( (aProjectionType != null && !aProjectionType.sameAs( theCtxt, theProjectionType)) || (aProjectionType == null && theProjectionType != null)) {
      change( theCtxt, "ProjectionType", aProjectionType, vrProjectionType, "vrProjectionType");
    }
  }





    /* Unset currently related ProjectionType and
     * Set reference in role ProjectionType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetProjectionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theProjectionType) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv aProjectionType = vrProjectionType;
    if( aProjectionType != null) {
      aProjectionType.removeInverseOFprojectionTypePrivileged( theCtxt, this);
    }
    vrProjectionType = theProjectionType;
      // If there was change, propagate
    if( (aProjectionType != null && !aProjectionType.sameAs( theCtxt, theProjectionType)) || (aProjectionType == null && theProjectionType != null)) {
      change( theCtxt, "ProjectionType", aProjectionType, vrProjectionType, "vrProjectionType");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship ExclusionType
 ****************************************************************************/


    /* Public Read accessor for role ExclusionType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getExclusionType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getExclusionTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getExclusionTypePR( theCtxt);
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

    /* Public ExclusionType number access
     */
  public int numExclusionType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numExclusionTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numExclusionTypePR( theCtxt);
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



    /* Public ExclusionType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getExclusionTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getExclusionTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getExclusionTypeAtPR( theCtxt, theIndex);
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


    /* Public ExclusionType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findExclusionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findExclusionTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findExclusionTypeNamedPR( theCtxt, theMMName);
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




    /* Public ExclusionType is related predicate
     */
  public boolean hasExclusionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasExclusionTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasExclusionTypeNamedPR( theCtxt, theMMName);
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



    /* Transactional ExclusionType is related  predicate
     */
  public boolean hasExclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theExclusionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasExclusionTypePR( theCtxt, theExclusionType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasExclusionTypePR( theCtxt, theExclusionType);
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


    /* Public ExclusionType index access
     */
  public int indexOfExclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theExclusionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfExclusionTypePR( theCtxt, theExclusionType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfExclusionTypePR( theCtxt, theExclusionType);
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




    /* Public Write accessor for role ExclusionType
     */
  public void setExclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theExclusionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setExclusionTypePR( theCtxt, theExclusionType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setExclusionTypePR( theCtxt, theExclusionType);
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
 *  Implementation of internal operations for relationship ExclusionType
 ****************************************************************************/


    /* Public Read accessor for role ExclusionType
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getExclusionTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getExclusionTypePrivileged( theCtxt);
  }


    /* Public ExclusionType number access
     */
  public int numExclusionTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getExclusionTypePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public ExclusionType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getExclusionTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getExclusionTypePrivileged( theCtxt);
  }


    /* Public ExclusionType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findExclusionTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3TypeIfc aExclusionType = getExclusionTypePrivileged( theCtxt);
    if( aExclusionType == null) { return null;}

    if( !aExclusionType.sameNameAs( theCtxt, theMMName)) { return null;}

    return aExclusionType;
  }


    /* Public ExclusionType finder predicate by name
     */
  public boolean hasExclusionTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aExclusionType = getExclusionTypePrivileged( theCtxt);
    if( aExclusionType == null) { return false;}

    return aExclusionType.sameNameAs( theCtxt, theMMName);
  }



    /* Public ExclusionType is related predicate
     */
  public boolean hasExclusionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theExclusionType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aExclusionType = getExclusionTypePrivileged( theCtxt);
    if( aExclusionType == null) { return false;}

    return aExclusionType.sameAs( theCtxt, theExclusionType);
  }




    /* Public ExclusionType index access
     */
  public int indexOfExclusionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theExclusionType) throws EAIException {
    if( !hasExclusionTypePR( theCtxt, theExclusionType)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role ExclusionType
     */
  public void setExclusionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theExclusionType) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv aExclusionType = getExclusionTypePrivileged( theCtxt);
      // Check for new ExclusionType same as current one
    if( aExclusionType != null && aExclusionType.sameAs( theCtxt, theExclusionType)) { return;}

    if( aExclusionType != null) {
      aExclusionType.removeInverseOFexclusionTypePrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetExclusionTypePrivileged();
      */
    }

    if( theExclusionType != null) {
      com.dosmil_e.m3.core.priv.M3TypePriv aNewExclusionType = (com.dosmil_e.m3.core.priv.M3TypePriv) theExclusionType;
      aNewExclusionType.addInverseOFexclusionTypePrivileged( theCtxt, this);
      setExclusionTypePrivileged( theCtxt, aNewExclusionType);
    }
    else {
      setExclusionTypePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship ExclusionType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ExclusionType
     * Guaranteed to return object with same identity of the ExclusionType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getExclusionTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrExclusionType;
  }




    /* Remove current reference in role ExclusionType
     * Used by relationship maintenance machinery
     */
  public void unsetExclusionTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aExclusionType = vrExclusionType;
    vrExclusionType = null;
      // If there was change, propagate
    if( aExclusionType != null) {
      change( theCtxt, "ExclusionType", aExclusionType, vrExclusionType, "vrExclusionType");
    }
  }





    /* Set reference in role ExclusionType
     * Used by relationship maintenance machinery
     */
  public void setExclusionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theExclusionType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aExclusionType = vrExclusionType;
    vrExclusionType = theExclusionType;
      // If there was change, propagate
    if( (aExclusionType != null && !aExclusionType.sameAs( theCtxt, theExclusionType)) || (aExclusionType == null && theExclusionType != null)) {
      change( theCtxt, "ExclusionType", aExclusionType, vrExclusionType, "vrExclusionType");
    }
  }





    /* Unset currently related ExclusionType and
     * Set reference in role ExclusionType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetExclusionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theExclusionType) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv aExclusionType = vrExclusionType;
    if( aExclusionType != null) {
      aExclusionType.removeInverseOFexclusionTypePrivileged( theCtxt, this);
    }
    vrExclusionType = theExclusionType;
      // If there was change, propagate
    if( (aExclusionType != null && !aExclusionType.sameAs( theCtxt, theExclusionType)) || (aExclusionType == null && theExclusionType != null)) {
      change( theCtxt, "ExclusionType", aExclusionType, vrExclusionType, "vrExclusionType");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship ExcludedInRelationshipNamed
 ****************************************************************************/


    /* Public Read accessor for role ExcludedInRelationshipNamed
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getExcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getExcludedInRelationshipNamedPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getExcludedInRelationshipNamedPR( theCtxt);
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

    /* Public ExcludedInRelationshipNamed number access
     */
  public int numExcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numExcludedInRelationshipNamedPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numExcludedInRelationshipNamedPR( theCtxt);
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



    /* Public ExcludedInRelationshipNamed read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getExcludedInRelationshipNamedAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getExcludedInRelationshipNamedAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getExcludedInRelationshipNamedAtPR( theCtxt, theIndex);
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


    /* Public ExcludedInRelationshipNamed finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findExcludedInRelationshipNamedNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findExcludedInRelationshipNamedNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findExcludedInRelationshipNamedNamedPR( theCtxt, theMMName);
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




    /* Public ExcludedInRelationshipNamed is related predicate
     */
  public boolean hasExcludedInRelationshipNamedNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasExcludedInRelationshipNamedNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasExcludedInRelationshipNamedNamedPR( theCtxt, theMMName);
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



    /* Transactional ExcludedInRelationshipNamed is related  predicate
     */
  public boolean hasExcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theExcludedInRelationshipNamed) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasExcludedInRelationshipNamedPR( theCtxt, theExcludedInRelationshipNamed);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasExcludedInRelationshipNamedPR( theCtxt, theExcludedInRelationshipNamed);
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


    /* Public ExcludedInRelationshipNamed index access
     */
  public int indexOfExcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theExcludedInRelationshipNamed) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfExcludedInRelationshipNamedPR( theCtxt, theExcludedInRelationshipNamed);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfExcludedInRelationshipNamedPR( theCtxt, theExcludedInRelationshipNamed);
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




    /* Public Write accessor for role ExcludedInRelationshipNamed
     */
  public void setExcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theExcludedInRelationshipNamed) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setExcludedInRelationshipNamedPR( theCtxt, theExcludedInRelationshipNamed);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setExcludedInRelationshipNamedPR( theCtxt, theExcludedInRelationshipNamed);
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
 *  Implementation of internal operations for relationship ExcludedInRelationshipNamed
 ****************************************************************************/


    /* Public Read accessor for role ExcludedInRelationshipNamed
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getExcludedInRelationshipNamedPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getExcludedInRelationshipNamedPrivileged( theCtxt);
  }


    /* Public ExcludedInRelationshipNamed number access
     */
  public int numExcludedInRelationshipNamedPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getExcludedInRelationshipNamedPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public ExcludedInRelationshipNamed read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getExcludedInRelationshipNamedAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getExcludedInRelationshipNamedPrivileged( theCtxt);
  }


    /* Public ExcludedInRelationshipNamed finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findExcludedInRelationshipNamedNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aExcludedInRelationshipNamed = getExcludedInRelationshipNamedPrivileged( theCtxt);
    if( aExcludedInRelationshipNamed == null) { return null;}

    if( !aExcludedInRelationshipNamed.sameNameAs( theCtxt, theMMName)) { return null;}

    return aExcludedInRelationshipNamed;
  }


    /* Public ExcludedInRelationshipNamed finder predicate by name
     */
  public boolean hasExcludedInRelationshipNamedNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aExcludedInRelationshipNamed = getExcludedInRelationshipNamedPrivileged( theCtxt);
    if( aExcludedInRelationshipNamed == null) { return false;}

    return aExcludedInRelationshipNamed.sameNameAs( theCtxt, theMMName);
  }



    /* Public ExcludedInRelationshipNamed is related predicate
     */
  public boolean hasExcludedInRelationshipNamedPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theExcludedInRelationshipNamed) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aExcludedInRelationshipNamed = getExcludedInRelationshipNamedPrivileged( theCtxt);
    if( aExcludedInRelationshipNamed == null) { return false;}

    return aExcludedInRelationshipNamed.sameAs( theCtxt, theExcludedInRelationshipNamed);
  }




    /* Public ExcludedInRelationshipNamed index access
     */
  public int indexOfExcludedInRelationshipNamedPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theExcludedInRelationshipNamed) throws EAIException {
    if( !hasExcludedInRelationshipNamedPR( theCtxt, theExcludedInRelationshipNamed)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role ExcludedInRelationshipNamed
     */
  public void setExcludedInRelationshipNamedPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theExcludedInRelationshipNamed) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv aExcludedInRelationshipNamed = getExcludedInRelationshipNamedPrivileged( theCtxt);
      // Check for new ExcludedInRelationshipNamed same as current one
    if( aExcludedInRelationshipNamed != null && aExcludedInRelationshipNamed.sameAs( theCtxt, theExcludedInRelationshipNamed)) { return;}

    if( aExcludedInRelationshipNamed != null) {
      aExcludedInRelationshipNamed.removeInverseOFexcludedInRelationshipNamedPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetExcludedInRelationshipNamedPrivileged();
      */
    }

    if( theExcludedInRelationshipNamed != null) {
      com.dosmil_e.m3.core.priv.M3AttributePriv aNewExcludedInRelationshipNamed = (com.dosmil_e.m3.core.priv.M3AttributePriv) theExcludedInRelationshipNamed;
      aNewExcludedInRelationshipNamed.addInverseOFexcludedInRelationshipNamedPrivileged( theCtxt, this);
      setExcludedInRelationshipNamedPrivileged( theCtxt, aNewExcludedInRelationshipNamed);
    }
    else {
      setExcludedInRelationshipNamedPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship ExcludedInRelationshipNamed
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ExcludedInRelationshipNamed
     * Guaranteed to return object with same identity of the ExcludedInRelationshipNamed
     */
  public com.dosmil_e.m3.core.priv.M3AttributePriv getExcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrExcludedInRelationshipNamed;
  }




    /* Remove current reference in role ExcludedInRelationshipNamed
     * Used by relationship maintenance machinery
     */
  public void unsetExcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aExcludedInRelationshipNamed = vrExcludedInRelationshipNamed;
    vrExcludedInRelationshipNamed = null;
      // If there was change, propagate
    if( aExcludedInRelationshipNamed != null) {
      change( theCtxt, "ExcludedInRelationshipNamed", aExcludedInRelationshipNamed, vrExcludedInRelationshipNamed, "vrExcludedInRelationshipNamed");
    }
  }





    /* Set reference in role ExcludedInRelationshipNamed
     * Used by relationship maintenance machinery
     */
  public void setExcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theExcludedInRelationshipNamed) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aExcludedInRelationshipNamed = vrExcludedInRelationshipNamed;
    vrExcludedInRelationshipNamed = theExcludedInRelationshipNamed;
      // If there was change, propagate
    if( (aExcludedInRelationshipNamed != null && !aExcludedInRelationshipNamed.sameAs( theCtxt, theExcludedInRelationshipNamed)) || (aExcludedInRelationshipNamed == null && theExcludedInRelationshipNamed != null)) {
      change( theCtxt, "ExcludedInRelationshipNamed", aExcludedInRelationshipNamed, vrExcludedInRelationshipNamed, "vrExcludedInRelationshipNamed");
    }
  }





    /* Unset currently related ExcludedInRelationshipNamed and
     * Set reference in role ExcludedInRelationshipNamed
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetExcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theExcludedInRelationshipNamed) throws EAIException {
    com.dosmil_e.m3.core.priv.M3AttributePriv aExcludedInRelationshipNamed = vrExcludedInRelationshipNamed;
    if( aExcludedInRelationshipNamed != null) {
      aExcludedInRelationshipNamed.removeInverseOFexcludedInRelationshipNamedPrivileged( theCtxt, this);
    }
    vrExcludedInRelationshipNamed = theExcludedInRelationshipNamed;
      // If there was change, propagate
    if( (aExcludedInRelationshipNamed != null && !aExcludedInRelationshipNamed.sameAs( theCtxt, theExcludedInRelationshipNamed)) || (aExcludedInRelationshipNamed == null && theExcludedInRelationshipNamed != null)) {
      change( theCtxt, "ExcludedInRelationshipNamed", aExcludedInRelationshipNamed, vrExcludedInRelationshipNamed, "vrExcludedInRelationshipNamed");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3ProjectionConfig
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 

 
    // When deleting unlink related TargetToTransfomations
  setTargetToTransfomations( theCtxt, null);


    // When deleting unlink related ProjectionToOriginals
  setProjectionToOriginals( theCtxt, null);


    // When deleting unlink related ProjectedToProjections
  setProjectedToProjections( theCtxt, null);


    // When deleting unlink related TransformationToSources
  setTransformationToSources( theCtxt, null);


    // When deleting unlink related TransformationToSubTransformations
  setTransformationToSubTransformations( theCtxt, null);


    // When deleting unlink related ProjectionType
  setProjectionType( theCtxt, null);


    // When deleting unlink related ExclusionType
  setExclusionType( theCtxt, null);


    // When deleting unlink related ExcludedInRelationshipNamed
  setExcludedInRelationshipNamed( theCtxt, null);



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
      vm3Type = com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.getStaticM3Type( theCtxt);
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


