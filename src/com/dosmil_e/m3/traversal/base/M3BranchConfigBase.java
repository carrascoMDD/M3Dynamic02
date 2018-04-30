package com.dosmil_e.m3.traversal.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3BranchConfigBase
   extends com.dosmil_e.m3.traversal.impl.M3ConfigOverrideImpl
    implements com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3BranchConfig metamodel element
 ****************************************************************************/
	protected int vaPhaseNumber;




/****************************************************************************
 *  State storage for the Relationships of the M3BranchConfig metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] vrInverseOFbranchConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3RelationshipPriv vrMetaRelationship; 

	protected com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] vrTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv vrTraversalConfig; 

	protected com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv vrMetaBranchMgr; 






/****************************************************************************
 *  Constructors of the M3BranchConfig metamodel element
 ****************************************************************************/

  public M3BranchConfigBase() {
    super();
  }


  public M3BranchConfigBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3BranchConfigBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3BranchConfigIfc and M3BranchConfigPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3BranchConfig
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE PhaseNumber
 ****************************************************************************/


    /* Public Read accessor for attribute PhaseNumber
     */
  public int getPhaseNumber( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getPhaseNumberPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getPhaseNumberPR( theCtxt);;
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






    /* Transactional Public Write accessor for attribute PhaseNumber
     */
  public void setPhaseNumber( EAIMMCtxtIfc theCtxt, int thePhaseNumber) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setPhaseNumberPR( theCtxt,  thePhaseNumber);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setPhaseNumberPR( theCtxt, thePhaseNumber);
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
 *  Implementation of internal operations for attribute PhaseNumber
 ****************************************************************************/


    /* Public Read accessor for attribute PhaseNumber
     */
  public int getPhaseNumberPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaPhaseNumber;
  }



    /* Public Write accessor for attribute PhaseNumber
     */
  public void setPhaseNumberPR( EAIMMCtxtIfc theCtxt, int thePhaseNumber) throws EAIException {

      // Get current value
    int aPhaseNumber = getPhaseNumberPR( theCtxt);
      // Check for new PhaseNumber same as current one
    if( toObject( aPhaseNumber) != null && toObject( aPhaseNumber).equals( toObject( thePhaseNumber))) { return;}

    vaPhaseNumber = thePhaseNumber;
    change( theCtxt, "PhaseNumber", toObject( aPhaseNumber), toObject( vaPhaseNumber), "vaPhaseNumber");
  }









/****************************************************************************
 *  Implementation of relationships of M3BranchConfig
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for MANY to MANY relationship InverseOFbranchConfigs
 ****************************************************************************/


    /* Public Read accessor for role InverseOFbranchConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFbranchConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFbranchConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFbranchConfigsPR( theCtxt);
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

    /* Public InverseOFbranchConfigs number access
     */
  public int numInverseOFbranchConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFbranchConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFbranchConfigsPR( theCtxt);
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



    /* Public InverseOFbranchConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getInverseOFbranchConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFbranchConfigsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFbranchConfigsAtPR( theCtxt, theIndex);
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


    /* Public InverseOFbranchConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findInverseOFbranchConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFbranchConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFbranchConfigsNamedPR( theCtxt, theMMName);
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




    /* Public InverseOFbranchConfigs is related predicate
     */
  public boolean hasInverseOFbranchConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFbranchConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFbranchConfigsNamedPR( theCtxt, theMMName);
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



    /* Transactional InverseOFbranchConfigs is related  predicate
     */
  public boolean hasInverseOFbranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);
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


    /* Public InverseOFbranchConfigs index access
     */
  public int indexOfInverseOFbranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);
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
  public void addInverseOFbranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);
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
  public void addInverseOFbranchConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFbranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFbranchConfigsBeforePR( theCtxt, theInverseOFbranchConfigs, theRelativeInverseOFbranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFbranchConfigsBeforePR( theCtxt, theInverseOFbranchConfigs, theRelativeInverseOFbranchConfigs);
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





    /* Transactional Public Write Remove accessor for role InverseOFbranchConfigs
     */
  public void removeInverseOFbranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);
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



    /* Public reorder accessor for role InverseOFbranchConfigs
     */
  public void moveInverseOFbranchConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFbranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFbranchConfigsBeforePR( theCtxt, theInverseOFbranchConfigs, theRelativeInverseOFbranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFbranchConfigsBeforePR( theCtxt, theInverseOFbranchConfigs, theRelativeInverseOFbranchConfigs);
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



    /* Public reorder accessor for role InverseOFbranchConfigs
     */
  public void moveInverseOFbranchConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFbranchConfigsToLastPR( theCtxt, theInverseOFbranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFbranchConfigsToLastPR( theCtxt, theInverseOFbranchConfigs);
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
 *  Implementation of internal operations for relationship InverseOFbranchConfigs
 ****************************************************************************/


    /* Public Read accessor for role InverseOFbranchConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFbranchConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFbranchConfigs = getInverseOFbranchConfigsPrivileged( theCtxt);
    if( someInverseOFbranchConfigs == null) { return null;}

    int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] otherInverseOFbranchConfigs = new com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[ aInverseOFbranchConfigsLength];
    try { System.arraycopy( someInverseOFbranchConfigs, 0, otherInverseOFbranchConfigs, 0, aInverseOFbranchConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFbranchConfigs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFbranchConfigs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFbranchConfigs", null); return null;}


    return otherInverseOFbranchConfigs;
  }





    /* Public InverseOFbranchConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findInverseOFbranchConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFbranchConfigs = getInverseOFbranchConfigsPrivileged( theCtxt);
    if( someInverseOFbranchConfigs == null) { return null;}

      // Check for new InverseOFbranchConfigs already in collection
    int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;
    for( int anIndex = 0 ; anIndex < aInverseOFbranchConfigsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aInverseOFbranchConfigs = someInverseOFbranchConfigs[ anIndex];
      if( aInverseOFbranchConfigs.sameNameAs( theCtxt, theMMName)) { return aInverseOFbranchConfigs;}
    }
    return null;
  }



    /* Public InverseOFbranchConfigs finder predicate by name
     */
  public boolean hasInverseOFbranchConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFbranchConfigsNamedPR( theCtxt, theMMName) != null;
  }



    /* Public InverseOFbranchConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getInverseOFbranchConfigsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFbranchConfigs = getInverseOFbranchConfigsPrivileged( theCtxt);
    if( someInverseOFbranchConfigs == null) { return null;}

      // Get number of InverseOFbranchConfigs
    int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;

      // Verify index within array length
    if( theIndex >= aInverseOFbranchConfigsLength) { return null;}

      // Get indexed InverseOFbranchConfigs
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aInverseOFbranchConfigs = someInverseOFbranchConfigs[ theIndex];

    return aInverseOFbranchConfigs;
  }



    /* Public InverseOFbranchConfigs is related predicate
     */
  public boolean hasInverseOFbranchConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException {
    return indexOfInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs) >= 0;
  }


    /* Public InverseOFbranchConfigs index access
     */
  public int indexOfInverseOFbranchConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFbranchConfigs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFbranchConfigs = getInverseOFbranchConfigsPrivileged( theCtxt);
    if( someInverseOFbranchConfigs == null) { return -1;}

      // Check for new InverseOFbranchConfigs already in collection
    int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;
    for( int anIndex = 0 ; anIndex < aInverseOFbranchConfigsLength ; anIndex++) {
      if( someInverseOFbranchConfigs[ anIndex].sameAs( theCtxt, theInverseOFbranchConfigs)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFbranchConfigs number access
     */
  public int numInverseOFbranchConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFbranchConfigs = getInverseOFbranchConfigsPrivileged( theCtxt);
    if( someInverseOFbranchConfigs == null) { return 0;}

      // Check for new InverseOFbranchConfigs already in collection
    int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;
    return aInverseOFbranchConfigsLength;
  }




    /* Public Write accessor for role InverseOFbranchConfigs
     */
  public void addInverseOFbranchConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFbranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFbranchConfigs = getInverseOFbranchConfigsPrivileged( theCtxt);
    if( someInverseOFbranchConfigs == null) { return;}

      // Check for new InverseOFbranchConfigs already in collection
    int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;
    for( int anIndex = 0 ; anIndex < aInverseOFbranchConfigsLength ; anIndex++) {
      if( theInverseOFbranchConfigs.sameAs( theCtxt, someInverseOFbranchConfigs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewInverseOFbranchConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFbranchConfigs;

      // Link reverse ref to this object
    aNewInverseOFbranchConfigs.addBranchConfigsPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFbranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFbranchConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFbranchConfigsLength + 1];
    try { System.arraycopy( someInverseOFbranchConfigs, 0, otherInverseOFbranchConfigs, 0, aInverseOFbranchConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFbranchConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFbranchConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFbranchConfigs", null); return;}
    otherInverseOFbranchConfigs[ aInverseOFbranchConfigsLength] = aNewInverseOFbranchConfigs;

      // Set the new collection
    setInverseOFbranchConfigsPrivileged( theCtxt, otherInverseOFbranchConfigs);
  }


    /* Public ordered Write accessor for role InverseOFbranchConfigs
     */
  public void addInverseOFbranchConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFbranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFbranchConfigs == null) { return;}

      // If relative InverseOFbranchConfigs is null, perform normal add operation
    if( theRelativeInverseOFbranchConfigs == null) {
      addInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFbranchConfigs = getInverseOFbranchConfigsPrivileged( theCtxt);
    if( someInverseOFbranchConfigs == null) { return;}


      // Get index of relative InverseOFbranchConfigs
    int aRelativeIndex = indexOfInverseOFbranchConfigsPR( theCtxt, theRelativeInverseOFbranchConfigs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);
    }

      // Get length of InverseOFbranchConfigs array
    int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFbranchConfigsLength) {
      addInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);
    }

      // Check for new InverseOFbranchConfigs already in collection
    if( hasInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewInverseOFbranchConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFbranchConfigs;

      // Link reverse ref to this object
    aNewInverseOFbranchConfigs.addBranchConfigsPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFbranchConfigs
      // Grow collection and add new InverseOFbranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFbranchConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFbranchConfigsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFbranchConfigs, 0, otherInverseOFbranchConfigs, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFbranchConfigs, aRelativeIndex, otherInverseOFbranchConfigs, aRelativeIndex + 1, aInverseOFbranchConfigsLength - aRelativeIndex);
      otherInverseOFbranchConfigs[ aRelativeIndex] = aNewInverseOFbranchConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFbranchConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFbranchConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFbranchConfigsBefore", null); return;}

      // Set the new collection
    setInverseOFbranchConfigsPrivileged( theCtxt, otherInverseOFbranchConfigs);
  }



    /* Public Write accessor for role InverseOFbranchConfigs
     */
  public void removeInverseOFbranchConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFbranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFbranchConfigs = getInverseOFbranchConfigsPrivileged( theCtxt);
    if( someInverseOFbranchConfigs == null) { return;}

      // Check for new InverseOFbranchConfigs not in collection
    int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFbranchConfigsLength ; anIndex++) {
      if( theInverseOFbranchConfigs.sameAs( theCtxt, someInverseOFbranchConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewInverseOFbranchConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFbranchConfigs;

      // Unlink reverse ref from the new related object
    aNewInverseOFbranchConfigs.removeBranchConfigsPrivileged( theCtxt, this);

      // Shrink collection removing InverseOFbranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFbranchConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFbranchConfigsLength - 1];
    try {
      System.arraycopy( someInverseOFbranchConfigs, 0, otherInverseOFbranchConfigs, 0, aFoundIndex);
      System.arraycopy( someInverseOFbranchConfigs, aFoundIndex + 1, otherInverseOFbranchConfigs, aFoundIndex, aInverseOFbranchConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFbranchConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFbranchConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFbranchConfigs", null); return;}

      // Set the new collection
    setInverseOFbranchConfigsPrivileged( theCtxt, otherInverseOFbranchConfigs);
  }




    /* Public reorder accessor for role InverseOFbranchConfigs
     */
  public void moveInverseOFbranchConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFbranchConfigs) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFbranchConfigs == null) { return;}

      // If relative InverseOFbranchConfigs is null, perform move to last position
    if( theRelativeInverseOFbranchConfigs == null) {
      moveInverseOFbranchConfigsToLastPR( theCtxt, theInverseOFbranchConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFbranchConfigs = getInverseOFbranchConfigsPrivileged( theCtxt);
    if( someInverseOFbranchConfigs == null) { return;}

      // Get length of InverseOFbranchConfigs array
    int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;

      // Get index of InverseOFbranchConfigs to move
    int aToMoveIndex = indexOfInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);
      // If toMove InverseOFbranchConfigs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFbranchConfigsLength) {
      moveInverseOFbranchConfigsToLastPR( theCtxt, theInverseOFbranchConfigs);
    }

      // Get index of relative InverseOFbranchConfigs
    int aRelativeIndex = indexOfInverseOFbranchConfigsPR( theCtxt, theRelativeInverseOFbranchConfigs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFbranchConfigsToLastPR( theCtxt, theInverseOFbranchConfigs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFbranchConfigsLength) {
      moveInverseOFbranchConfigsToLastPR( theCtxt, theInverseOFbranchConfigs);
    }

      // ToMove and relative InverseOFbranchConfigs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aToMoveInverseOFbranchConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFbranchConfigs;

      // Allocate new array for new version of state of relationship InverseOFbranchConfigs
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFbranchConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFbranchConfigsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFbranchConfigs, 0, otherInverseOFbranchConfigs, 0, aToMoveIndex );
        System.arraycopy( someInverseOFbranchConfigs, aToMoveIndex + 1, otherInverseOFbranchConfigs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFbranchConfigs[ aRelativeIndex - 1] = aToMoveInverseOFbranchConfigs;
        System.arraycopy( someInverseOFbranchConfigs, aRelativeIndex, otherInverseOFbranchConfigs, aRelativeIndex, aInverseOFbranchConfigsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFbranchConfigs, 0, otherInverseOFbranchConfigs, 0, aRelativeIndex );
        otherInverseOFbranchConfigs[ aRelativeIndex ] = aToMoveInverseOFbranchConfigs;
        System.arraycopy( someInverseOFbranchConfigs, aRelativeIndex, otherInverseOFbranchConfigs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFbranchConfigsLength - 1) {
          System.arraycopy( someInverseOFbranchConfigs, aToMoveIndex + 1, otherInverseOFbranchConfigs, aToMoveIndex + 1, aInverseOFbranchConfigsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFbranchConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFbranchConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFbranchConfigsBefore", null); return;}

      // Set the new collection
    setInverseOFbranchConfigsPrivileged( theCtxt, otherInverseOFbranchConfigs);
  }





    /* Public move to last accessor for role InverseOFbranchConfigs
     */
  public void moveInverseOFbranchConfigsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFbranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFbranchConfigs = getInverseOFbranchConfigsPrivileged( theCtxt);
    if( someInverseOFbranchConfigs == null) { return;}

      // Get length of InverseOFbranchConfigs array
    int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;

      // Get index of InverseOFbranchConfigs to move
    int aToMoveIndex = indexOfInverseOFbranchConfigsPR( theCtxt, theInverseOFbranchConfigs);

      // If toMove InverseOFbranchConfigs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFbranchConfigsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aToMoveInverseOFbranchConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFbranchConfigs;

      // Allocate new array for new version of state of relationship InverseOFbranchConfigs
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFbranchConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFbranchConfigsLength];
    try {
      System.arraycopy( someInverseOFbranchConfigs, 0, otherInverseOFbranchConfigs, 0, aToMoveIndex );
      System.arraycopy( someInverseOFbranchConfigs, aToMoveIndex + 1, otherInverseOFbranchConfigs, aToMoveIndex, aInverseOFbranchConfigsLength - aToMoveIndex - 1);
      otherInverseOFbranchConfigs[ aInverseOFbranchConfigsLength - 1] = aToMoveInverseOFbranchConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFbranchConfigsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFbranchConfigsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFbranchConfigsToLast", null); return;}

      // Set the new collection
    setInverseOFbranchConfigsPrivileged( theCtxt, otherInverseOFbranchConfigs);
  }







/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFbranchConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFbranchConfigs
     */
  public void addInverseOFbranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFbranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFbranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFbranchConfigs = getInverseOFbranchConfigsPrivileged( theCtxt);
    if( someInverseOFbranchConfigs == null) { return;}

      // Check for new InverseOFbranchConfigs already in collection
    int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;
    for( int anIndex = 0 ; anIndex < aInverseOFbranchConfigsLength ; anIndex++) {
      if( theInverseOFbranchConfigs.sameAs( theCtxt, someInverseOFbranchConfigs[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFbranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFbranchConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFbranchConfigsLength + 1];
    try {
      System.arraycopy( someInverseOFbranchConfigs, 0, otherInverseOFbranchConfigs, 0, aInverseOFbranchConfigsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFbranchConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFbranchConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFbranchConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}

    otherInverseOFbranchConfigs[ aInverseOFbranchConfigsLength] = theInverseOFbranchConfigs;

      // Set the new collection
    setInverseOFbranchConfigsPrivileged( theCtxt, otherInverseOFbranchConfigs);
  }









    /* Privileged Write accessor for role InverseOFbranchConfigs
     */
  public void removeInverseOFbranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFbranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFbranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFbranchConfigs = getInverseOFbranchConfigsPrivileged( theCtxt);
    if( someInverseOFbranchConfigs == null) { return;}

      // Check for new InverseOFbranchConfigs not in collection
    int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFbranchConfigsLength ; anIndex++) {
      if( theInverseOFbranchConfigs.sameAs( theCtxt, someInverseOFbranchConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFbranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFbranchConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFbranchConfigsLength - 1];
    try {
      System.arraycopy( someInverseOFbranchConfigs, 0, otherInverseOFbranchConfigs, 0, aFoundIndex);
      System.arraycopy( someInverseOFbranchConfigs, aFoundIndex + 1, otherInverseOFbranchConfigs, aFoundIndex, aInverseOFbranchConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFbranchConfigsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFbranchConfigsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFbranchConfigsPrivileged", null); return;}

      // Set the new collection
    setInverseOFbranchConfigsPrivileged( theCtxt, otherInverseOFbranchConfigs);
  }






    /* Privileged Read accessor for role InverseOFbranchConfigs
     * Guaranteed to return object with same identity of the InverseOFbranchConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] getInverseOFbranchConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFbranchConfigs;
  }




    /* Set reference in role InverseOFbranchConfigs
     * Used by relationship maintenance machinery
     */
  public void setInverseOFbranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] theInverseOFbranchConfigsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] aInverseOFbranchConfigs = vrInverseOFbranchConfigs;
    vrInverseOFbranchConfigs = theInverseOFbranchConfigsCollection;
      // Propagate change
    change( theCtxt, "InverseOFbranchConfigs", aInverseOFbranchConfigs, vrInverseOFbranchConfigs, "vrInverseOFbranchConfigs");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship MetaRelationship
 ****************************************************************************/


    /* Public Read accessor for role MetaRelationship
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getMetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaRelationshipPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaRelationshipPR( theCtxt);
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

    /* Public MetaRelationship number access
     */
  public int numMetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numMetaRelationshipPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numMetaRelationshipPR( theCtxt);
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



    /* Public MetaRelationship read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getMetaRelationshipAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaRelationshipAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaRelationshipAtPR( theCtxt, theIndex);
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


    /* Public MetaRelationship finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findMetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findMetaRelationshipNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findMetaRelationshipNamedPR( theCtxt, theMMName);
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




    /* Public MetaRelationship is related predicate
     */
  public boolean hasMetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasMetaRelationshipNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasMetaRelationshipNamedPR( theCtxt, theMMName);
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



    /* Transactional MetaRelationship is related  predicate
     */
  public boolean hasMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasMetaRelationshipPR( theCtxt, theMetaRelationship);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasMetaRelationshipPR( theCtxt, theMetaRelationship);
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


    /* Public MetaRelationship index access
     */
  public int indexOfMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfMetaRelationshipPR( theCtxt, theMetaRelationship);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfMetaRelationshipPR( theCtxt, theMetaRelationship);
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




    /* Public Write accessor for role MetaRelationship
     */
  public void setMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theMetaRelationship) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setMetaRelationshipPR( theCtxt, theMetaRelationship);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setMetaRelationshipPR( theCtxt, theMetaRelationship);
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
 *  Implementation of internal operations for relationship MetaRelationship
 ****************************************************************************/


    /* Public Read accessor for role MetaRelationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getMetaRelationshipPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getMetaRelationshipPrivileged( theCtxt);
  }


    /* Public MetaRelationship number access
     */
  public int numMetaRelationshipPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getMetaRelationshipPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public MetaRelationship read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getMetaRelationshipAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getMetaRelationshipPrivileged( theCtxt);
  }


    /* Public MetaRelationship finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findMetaRelationshipNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aMetaRelationship = getMetaRelationshipPrivileged( theCtxt);
    if( aMetaRelationship == null) { return null;}

    if( !aMetaRelationship.sameNameAs( theCtxt, theMMName)) { return null;}

    return aMetaRelationship;
  }


    /* Public MetaRelationship finder predicate by name
     */
  public boolean hasMetaRelationshipNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aMetaRelationship = getMetaRelationshipPrivileged( theCtxt);
    if( aMetaRelationship == null) { return false;}

    return aMetaRelationship.sameNameAs( theCtxt, theMMName);
  }



    /* Public MetaRelationship is related predicate
     */
  public boolean hasMetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theMetaRelationship) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aMetaRelationship = getMetaRelationshipPrivileged( theCtxt);
    if( aMetaRelationship == null) { return false;}

    return aMetaRelationship.sameAs( theCtxt, theMetaRelationship);
  }




    /* Public MetaRelationship index access
     */
  public int indexOfMetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theMetaRelationship) throws EAIException {
    if( !hasMetaRelationshipPR( theCtxt, theMetaRelationship)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role MetaRelationship
     */
  public void setMetaRelationshipPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theMetaRelationship) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aMetaRelationship = getMetaRelationshipPrivileged( theCtxt);
      // Check for new MetaRelationship same as current one
    if( aMetaRelationship != null && aMetaRelationship.sameAs( theCtxt, theMetaRelationship)) { return;}

    if( aMetaRelationship != null) {
      aMetaRelationship.removeInverseOFmetaRelationshipPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetMetaRelationshipPrivileged();
      */
    }

    if( theMetaRelationship != null) {
      com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewMetaRelationship = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theMetaRelationship;
      aNewMetaRelationship.addInverseOFmetaRelationshipPrivileged( theCtxt, this);
      setMetaRelationshipPrivileged( theCtxt, aNewMetaRelationship);
    }
    else {
      setMetaRelationshipPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship MetaRelationship
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaRelationship
     * Guaranteed to return object with same identity of the MetaRelationship
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrMetaRelationship;
  }




    /* Remove current reference in role MetaRelationship
     * Used by relationship maintenance machinery
     */
  public void unsetMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aMetaRelationship = vrMetaRelationship;
    vrMetaRelationship = null;
      // If there was change, propagate
    if( aMetaRelationship != null) {
      change( theCtxt, "MetaRelationship", aMetaRelationship, vrMetaRelationship, "vrMetaRelationship");
    }
  }





    /* Set reference in role MetaRelationship
     * Used by relationship maintenance machinery
     */
  public void setMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theMetaRelationship) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aMetaRelationship = vrMetaRelationship;
    vrMetaRelationship = theMetaRelationship;
      // If there was change, propagate
    if( (aMetaRelationship != null && !aMetaRelationship.sameAs( theCtxt, theMetaRelationship)) || (aMetaRelationship == null && theMetaRelationship != null)) {
      change( theCtxt, "MetaRelationship", aMetaRelationship, vrMetaRelationship, "vrMetaRelationship");
    }
  }





    /* Unset currently related MetaRelationship and
     * Set reference in role MetaRelationship
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theMetaRelationship) throws EAIException {
    com.dosmil_e.m3.core.priv.M3RelationshipPriv aMetaRelationship = vrMetaRelationship;
    if( aMetaRelationship != null) {
      aMetaRelationship.removeInverseOFmetaRelationshipPrivileged( theCtxt, this);
    }
    vrMetaRelationship = theMetaRelationship;
      // If there was change, propagate
    if( (aMetaRelationship != null && !aMetaRelationship.sameAs( theCtxt, theMetaRelationship)) || (aMetaRelationship == null && theMetaRelationship != null)) {
      change( theCtxt, "MetaRelationship", aMetaRelationship, vrMetaRelationship, "vrMetaRelationship");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship TypeNodeConfigs
 ****************************************************************************/


    /* Public Read accessor for role TypeNodeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] getTypeNodeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTypeNodeConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTypeNodeConfigsPR( theCtxt);
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

    /* Public TypeNodeConfigs number access
     */
  public int numTypeNodeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numTypeNodeConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numTypeNodeConfigsPR( theCtxt);
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



    /* Public TypeNodeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc getTypeNodeConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTypeNodeConfigsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTypeNodeConfigsAtPR( theCtxt, theIndex);
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


    /* Public TypeNodeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc findTypeNodeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findTypeNodeConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findTypeNodeConfigsNamedPR( theCtxt, theMMName);
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




    /* Public TypeNodeConfigs is related predicate
     */
  public boolean hasTypeNodeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTypeNodeConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTypeNodeConfigsNamedPR( theCtxt, theMMName);
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



    /* Transactional TypeNodeConfigs is related  predicate
     */
  public boolean hasTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);
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


    /* Public TypeNodeConfigs index access
     */
  public int indexOfTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);
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
  public void addTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);
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
  public void addTypeNodeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelativeTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addTypeNodeConfigsBeforePR( theCtxt, theTypeNodeConfigs, theRelativeTypeNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addTypeNodeConfigsBeforePR( theCtxt, theTypeNodeConfigs, theRelativeTypeNodeConfigs);
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





    /* Transactional Public Write Remove accessor for role TypeNodeConfigs
     */
  public void removeTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);
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



    /* Public reorder accessor for role TypeNodeConfigs
     */
  public void moveTypeNodeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelativeTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveTypeNodeConfigsBeforePR( theCtxt, theTypeNodeConfigs, theRelativeTypeNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveTypeNodeConfigsBeforePR( theCtxt, theTypeNodeConfigs, theRelativeTypeNodeConfigs);
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



    /* Public reorder accessor for role TypeNodeConfigs
     */
  public void moveTypeNodeConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveTypeNodeConfigsToLastPR( theCtxt, theTypeNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveTypeNodeConfigsToLastPR( theCtxt, theTypeNodeConfigs);
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
 *  Implementation of internal operations for relationship TypeNodeConfigs
 ****************************************************************************/


    /* Public Read accessor for role TypeNodeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] getTypeNodeConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] someTypeNodeConfigs = getTypeNodeConfigsPrivileged( theCtxt);
    if( someTypeNodeConfigs == null) { return null;}

    int aTypeNodeConfigsLength = someTypeNodeConfigs.length;
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] otherTypeNodeConfigs = new com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[ aTypeNodeConfigsLength];
    try { System.arraycopy( someTypeNodeConfigs, 0, otherTypeNodeConfigs, 0, aTypeNodeConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getTypeNodeConfigs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getTypeNodeConfigs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getTypeNodeConfigs", null); return null;}


    return otherTypeNodeConfigs;
  }



    /* Public TypeNodeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc findTypeNodeConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] someTypeNodeConfigs = getTypeNodeConfigsPrivileged( theCtxt);
    if( someTypeNodeConfigs == null) { return null;}

      // Check for new TypeNodeConfigs already in collection
    int aTypeNodeConfigsLength = someTypeNodeConfigs.length;
    for( int anIndex = 0 ; anIndex < aTypeNodeConfigsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv aTypeNodeConfigs = someTypeNodeConfigs[ anIndex];
      if( aTypeNodeConfigs.sameNameAs( theCtxt, theMMName)) { return aTypeNodeConfigs;}
    }
    return null;
  }



    /* Public TypeNodeConfigs finder predicate by name
     */
  public boolean hasTypeNodeConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findTypeNodeConfigsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public TypeNodeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc getTypeNodeConfigsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] someTypeNodeConfigs = getTypeNodeConfigsPrivileged( theCtxt);
    if( someTypeNodeConfigs == null) { return null;}

      // Get number of TypeNodeConfigs
    int aTypeNodeConfigsLength = someTypeNodeConfigs.length;

      // Verify index within array length
    if( theIndex >= aTypeNodeConfigsLength) { return null;}

      // Get indexed TypeNodeConfigs
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aTypeNodeConfigs = someTypeNodeConfigs[ theIndex];

    return aTypeNodeConfigs;
  }



    /* Public TypeNodeConfigs is related predicate
     */
  public boolean hasTypeNodeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException {
    return indexOfTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs) >= 0;
  }


    /* Public TypeNodeConfigs index access
     */
  public int indexOfTypeNodeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException {
      // Do not add null values to the collection
    if( theTypeNodeConfigs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] someTypeNodeConfigs = getTypeNodeConfigsPrivileged( theCtxt);
    if( someTypeNodeConfigs == null) { return -1;}

      // Check for new TypeNodeConfigs already in collection
    int aTypeNodeConfigsLength = someTypeNodeConfigs.length;
    for( int anIndex = 0 ; anIndex < aTypeNodeConfigsLength ; anIndex++) {
      if( someTypeNodeConfigs[ anIndex].sameAs( theCtxt, theTypeNodeConfigs)) { return anIndex;}
    }
    return -1;
  }


    /* Public TypeNodeConfigs number access
     */
  public int numTypeNodeConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] someTypeNodeConfigs = getTypeNodeConfigsPrivileged( theCtxt);
    if( someTypeNodeConfigs == null) { return 0;}

      // Check for new TypeNodeConfigs already in collection
    int aTypeNodeConfigsLength = someTypeNodeConfigs.length;
    return aTypeNodeConfigsLength;
  }




    /* Public Write accessor for role TypeNodeConfigs
     */
  public void addTypeNodeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theTypeNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] someTypeNodeConfigs = getTypeNodeConfigsPrivileged( theCtxt);
    if( someTypeNodeConfigs == null) { return;}

      // Check for new TypeNodeConfigs already in collection
    int aTypeNodeConfigsLength = someTypeNodeConfigs.length;
    for( int anIndex = 0 ; anIndex < aTypeNodeConfigsLength ; anIndex++) {
      if( theTypeNodeConfigs.sameAs( theCtxt, someTypeNodeConfigs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv aNewTypeNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv) theTypeNodeConfigs;

      // Link reverse ref to this object
    aNewTypeNodeConfigs.unsetAndSetBranchConfigPrivileged( theCtxt, this);

      // Grow collection and add new TypeNodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] otherTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[ aTypeNodeConfigsLength + 1];
    try { System.arraycopy( someTypeNodeConfigs, 0, otherTypeNodeConfigs, 0, aTypeNodeConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeNodeConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeNodeConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeNodeConfigs", null); return;}
    otherTypeNodeConfigs[ aTypeNodeConfigsLength] = aNewTypeNodeConfigs;

      // Set the new collection
    setTypeNodeConfigsPrivileged( theCtxt, otherTypeNodeConfigs);
  }




    /* Public ordered Write accessor for role TypeNodeConfigs
     */
  public void addTypeNodeConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelativeTypeNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theTypeNodeConfigs == null) { return;}

      // If relative TypeNodeConfigs is null, perform normal add operation
    if( theRelativeTypeNodeConfigs == null) {
      addTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] someTypeNodeConfigs = getTypeNodeConfigsPrivileged( theCtxt);
    if( someTypeNodeConfigs == null) { return;}


      // Get index of relative TypeNodeConfigs
    int aRelativeIndex = indexOfTypeNodeConfigsPR( theCtxt, theRelativeTypeNodeConfigs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);
    }

      // Get length of TypeNodeConfigs array
    int aTypeNodeConfigsLength = someTypeNodeConfigs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aTypeNodeConfigsLength) {
      addTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);
    }

      // Check for new TypeNodeConfigs already in collection
    if( hasTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv aNewTypeNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv) theTypeNodeConfigs;

      // Link reverse ref to this object
    aNewTypeNodeConfigs.unsetAndSetBranchConfigPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship TypeNodeConfigs
      // Grow collection and add new TypeNodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] otherTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[ aTypeNodeConfigsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someTypeNodeConfigs, 0, otherTypeNodeConfigs, 0, aRelativeIndex );
      }
      System.arraycopy( someTypeNodeConfigs, aRelativeIndex, otherTypeNodeConfigs, aRelativeIndex + 1, aTypeNodeConfigsLength - aRelativeIndex);
      otherTypeNodeConfigs[ aRelativeIndex] = aNewTypeNodeConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeNodeConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeNodeConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeNodeConfigsBefore", null); return;}

      // Set the new collection
    setTypeNodeConfigsPrivileged( theCtxt, otherTypeNodeConfigs);
  }





    /* Public Write accessor for role TypeNodeConfigs
     */
  public void removeTypeNodeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theTypeNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] someTypeNodeConfigs = getTypeNodeConfigsPrivileged( theCtxt);
    if( someTypeNodeConfigs == null) { return;}

      // Check for new TypeNodeConfigs not in collection
    int aTypeNodeConfigsLength = someTypeNodeConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aTypeNodeConfigsLength ; anIndex++) {
      if( theTypeNodeConfigs.sameAs( theCtxt, someTypeNodeConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv aNewTypeNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv) theTypeNodeConfigs;

      // Unlink reverse ref from the new related object
    aNewTypeNodeConfigs.unsetBranchConfigPrivileged( theCtxt);

      // Shrink collection removing TypeNodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] otherTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[ aTypeNodeConfigsLength - 1];
    try {
      System.arraycopy( someTypeNodeConfigs, 0, otherTypeNodeConfigs, 0, aFoundIndex);
      System.arraycopy( someTypeNodeConfigs, aFoundIndex + 1, otherTypeNodeConfigs, aFoundIndex, aTypeNodeConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypeNodeConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypeNodeConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypeNodeConfigs", null); return;}

      // Set the new collection
    setTypeNodeConfigsPrivileged( theCtxt, otherTypeNodeConfigs);
  }




    /* Public reorder accessor for role TypeNodeConfigs
     */
  public void moveTypeNodeConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelativeTypeNodeConfigs) throws EAIException {

      // Null value is nothing to move
    if( theTypeNodeConfigs == null) { return;}

      // If relative TypeNodeConfigs is null, perform move to last position
    if( theRelativeTypeNodeConfigs == null) {
      moveTypeNodeConfigsToLastPR( theCtxt, theTypeNodeConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] someTypeNodeConfigs = getTypeNodeConfigsPrivileged( theCtxt);
    if( someTypeNodeConfigs == null) { return;}

      // Get length of TypeNodeConfigs array
    int aTypeNodeConfigsLength = someTypeNodeConfigs.length;

      // Get index of TypeNodeConfigs to move
    int aToMoveIndex = indexOfTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);
      // If toMove TypeNodeConfigs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aTypeNodeConfigsLength) {
      moveTypeNodeConfigsToLastPR( theCtxt, theTypeNodeConfigs);
    }

      // Get index of relative TypeNodeConfigs
    int aRelativeIndex = indexOfTypeNodeConfigsPR( theCtxt, theRelativeTypeNodeConfigs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveTypeNodeConfigsToLastPR( theCtxt, theTypeNodeConfigs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aTypeNodeConfigsLength) {
      moveTypeNodeConfigsToLastPR( theCtxt, theTypeNodeConfigs);
    }

      // ToMove and relative TypeNodeConfigs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv aToMoveTypeNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv) theTypeNodeConfigs;

      // Allocate new array for new version of state of relationship TypeNodeConfigs
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] otherTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[ aTypeNodeConfigsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someTypeNodeConfigs, 0, otherTypeNodeConfigs, 0, aToMoveIndex );
        System.arraycopy( someTypeNodeConfigs, aToMoveIndex + 1, otherTypeNodeConfigs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherTypeNodeConfigs[ aRelativeIndex - 1] = aToMoveTypeNodeConfigs;
        System.arraycopy( someTypeNodeConfigs, aRelativeIndex, otherTypeNodeConfigs, aRelativeIndex, aTypeNodeConfigsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someTypeNodeConfigs, 0, otherTypeNodeConfigs, 0, aRelativeIndex );
        otherTypeNodeConfigs[ aRelativeIndex ] = aToMoveTypeNodeConfigs;
        System.arraycopy( someTypeNodeConfigs, aRelativeIndex, otherTypeNodeConfigs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aTypeNodeConfigsLength - 1) {
          System.arraycopy( someTypeNodeConfigs, aToMoveIndex + 1, otherTypeNodeConfigs, aToMoveIndex + 1, aTypeNodeConfigsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypeNodeConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypeNodeConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypeNodeConfigsBefore", null); return;}

      // Set the new collection
    setTypeNodeConfigsPrivileged( theCtxt, otherTypeNodeConfigs);
  }





    /* Public move to last accessor for role TypeNodeConfigs
     */
  public void moveTypeNodeConfigsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException {

      // Null value is nothing to move
    if( theTypeNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] someTypeNodeConfigs = getTypeNodeConfigsPrivileged( theCtxt);
    if( someTypeNodeConfigs == null) { return;}

      // Get length of TypeNodeConfigs array
    int aTypeNodeConfigsLength = someTypeNodeConfigs.length;

      // Get index of TypeNodeConfigs to move
    int aToMoveIndex = indexOfTypeNodeConfigsPR( theCtxt, theTypeNodeConfigs);

      // If toMove TypeNodeConfigs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aTypeNodeConfigsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv aToMoveTypeNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv) theTypeNodeConfigs;

      // Allocate new array for new version of state of relationship TypeNodeConfigs
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] otherTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[ aTypeNodeConfigsLength];
    try {
      System.arraycopy( someTypeNodeConfigs, 0, otherTypeNodeConfigs, 0, aToMoveIndex );
      System.arraycopy( someTypeNodeConfigs, aToMoveIndex + 1, otherTypeNodeConfigs, aToMoveIndex, aTypeNodeConfigsLength - aToMoveIndex - 1);
      otherTypeNodeConfigs[ aTypeNodeConfigsLength - 1] = aToMoveTypeNodeConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypeNodeConfigsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypeNodeConfigsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypeNodeConfigsToLast", null); return;}

      // Set the new collection
    setTypeNodeConfigsPrivileged( theCtxt, otherTypeNodeConfigs);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship TypeNodeConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role TypeNodeConfigs
     */
  public void addTypeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv theTypeNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theTypeNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] someTypeNodeConfigs = getTypeNodeConfigsPrivileged( theCtxt);
    if( someTypeNodeConfigs == null) { return;}

      // Check for new TypeNodeConfigs already in collection
    int aTypeNodeConfigsLength = someTypeNodeConfigs.length;
    for( int anIndex = 0 ; anIndex < aTypeNodeConfigsLength ; anIndex++) {
      if( theTypeNodeConfigs.sameAs( theCtxt, someTypeNodeConfigs[ anIndex])) { return;}
    }

      // Grow collection and add new TypeNodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] otherTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[ aTypeNodeConfigsLength + 1];
    try {
      System.arraycopy( someTypeNodeConfigs, 0, otherTypeNodeConfigs, 0, aTypeNodeConfigsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeNodeConfigsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeNodeConfigsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeNodeConfigsPrivileged", null); return;}

    otherTypeNodeConfigs[ aTypeNodeConfigsLength] = theTypeNodeConfigs;

      // Set the new collection
    setTypeNodeConfigsPrivileged( theCtxt, otherTypeNodeConfigs);
  }









    /* Privileged Write accessor for role TypeNodeConfigs
     */
  public void removeTypeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv theTypeNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theTypeNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] someTypeNodeConfigs = getTypeNodeConfigsPrivileged( theCtxt);
    if( someTypeNodeConfigs == null) { return;}

      // Check for new TypeNodeConfigs not in collection
    int aTypeNodeConfigsLength = someTypeNodeConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aTypeNodeConfigsLength ; anIndex++) {
      if( theTypeNodeConfigs.sameAs( theCtxt, someTypeNodeConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing TypeNodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] otherTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[ aTypeNodeConfigsLength - 1];
    try {
      System.arraycopy( someTypeNodeConfigs, 0, otherTypeNodeConfigs, 0, aFoundIndex);
      System.arraycopy( someTypeNodeConfigs, aFoundIndex + 1, otherTypeNodeConfigs, aFoundIndex, aTypeNodeConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypeNodeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypeNodeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypeNodeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv.class}); return;}

      // Set the new collection
    setTypeNodeConfigsPrivileged( theCtxt, otherTypeNodeConfigs);
  }






    /* Privileged Read accessor for role TypeNodeConfigs
     * Guaranteed to return object with same identity of the TypeNodeConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] getTypeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrTypeNodeConfigs;
  }




    /* Set reference in role TypeNodeConfigs
     * Used by relationship maintenance machinery
     */
  public void setTypeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] theTypeNodeConfigsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] aTypeNodeConfigs = vrTypeNodeConfigs;
    vrTypeNodeConfigs = theTypeNodeConfigsCollection;
      // Propagate change
    change( theCtxt, "TypeNodeConfigs", aTypeNodeConfigs, vrTypeNodeConfigs, "vrTypeNodeConfigs");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship TraversalConfig
 ****************************************************************************/


    /* Public Read accessor for role TraversalConfig
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfig( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTraversalConfigPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTraversalConfigPR( theCtxt);
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

    /* Public TraversalConfig number access
     */
  public int numTraversalConfig( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numTraversalConfigPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numTraversalConfigPR( theCtxt);
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



    /* Public TraversalConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfigAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTraversalConfigAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTraversalConfigAtPR( theCtxt, theIndex);
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


    /* Public TraversalConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc findTraversalConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findTraversalConfigNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findTraversalConfigNamedPR( theCtxt, theMMName);
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




    /* Public TraversalConfig is related predicate
     */
  public boolean hasTraversalConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTraversalConfigNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTraversalConfigNamedPR( theCtxt, theMMName);
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



    /* Transactional TraversalConfig is related  predicate
     */
  public boolean hasTraversalConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTraversalConfigPR( theCtxt, theTraversalConfig);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTraversalConfigPR( theCtxt, theTraversalConfig);
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


    /* Public TraversalConfig index access
     */
  public int indexOfTraversalConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfTraversalConfigPR( theCtxt, theTraversalConfig);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfTraversalConfigPR( theCtxt, theTraversalConfig);
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




    /* Public Write accessor for role TraversalConfig
     */
  public void setTraversalConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setTraversalConfigPR( theCtxt, theTraversalConfig);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setTraversalConfigPR( theCtxt, theTraversalConfig);
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
 *  Implementation of internal operations for relationship TraversalConfig
 ****************************************************************************/


    /* Public Read accessor for role TraversalConfig
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfigPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTraversalConfigPrivileged( theCtxt);
  }


    /* Public TraversalConfig number access
     */
  public int numTraversalConfigPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTraversalConfigPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public TraversalConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfigAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getTraversalConfigPrivileged( theCtxt);
  }


    /* Public TraversalConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc findTraversalConfigNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = getTraversalConfigPrivileged( theCtxt);
    if( aTraversalConfig == null) { return null;}

    if( !aTraversalConfig.sameNameAs( theCtxt, theMMName)) { return null;}

    return aTraversalConfig;
  }


    /* Public TraversalConfig finder predicate by name
     */
  public boolean hasTraversalConfigNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = getTraversalConfigPrivileged( theCtxt);
    if( aTraversalConfig == null) { return false;}

    return aTraversalConfig.sameNameAs( theCtxt, theMMName);
  }



    /* Public TraversalConfig is related predicate
     */
  public boolean hasTraversalConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = getTraversalConfigPrivileged( theCtxt);
    if( aTraversalConfig == null) { return false;}

    return aTraversalConfig.sameAs( theCtxt, theTraversalConfig);
  }




    /* Public TraversalConfig index access
     */
  public int indexOfTraversalConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException {
    if( !hasTraversalConfigPR( theCtxt, theTraversalConfig)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role TraversalConfig
     */
  public void setTraversalConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException {

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aTraversalConfig = getTraversalConfigPrivileged( theCtxt);
      // Check for new TraversalConfig same as current one
    if( aTraversalConfig != null && aTraversalConfig.sameAs( theCtxt, theTraversalConfig)) { return;}

    if( aTraversalConfig != null) {
      aTraversalConfig.removeBranchConfigsPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetTraversalConfigPrivileged();
      */
    }

    if( theTraversalConfig != null) {
      com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aNewTraversalConfig = (com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv) theTraversalConfig;
      aNewTraversalConfig.addBranchConfigsPrivileged( theCtxt, this);
      setTraversalConfigPrivileged( theCtxt, aNewTraversalConfig);
    }
    else {
      setTraversalConfigPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship TraversalConfig
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role TraversalConfig
     * Guaranteed to return object with same identity of the TraversalConfig
     */
  public com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv getTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrTraversalConfig;
  }




    /* Remove current reference in role TraversalConfig
     * Used by relationship maintenance machinery
     */
  public void unsetTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = vrTraversalConfig;
    vrTraversalConfig = null;
      // If there was change, propagate
    if( aTraversalConfig != null) {
      change( theCtxt, "TraversalConfig", aTraversalConfig, vrTraversalConfig, "vrTraversalConfig");
    }
  }





    /* Set reference in role TraversalConfig
     * Used by relationship maintenance machinery
     */
  public void setTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theTraversalConfig) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = vrTraversalConfig;
    vrTraversalConfig = theTraversalConfig;
      // If there was change, propagate
    if( (aTraversalConfig != null && !aTraversalConfig.sameAs( theCtxt, theTraversalConfig)) || (aTraversalConfig == null && theTraversalConfig != null)) {
      change( theCtxt, "TraversalConfig", aTraversalConfig, vrTraversalConfig, "vrTraversalConfig");
    }
  }





    /* Unset currently related TraversalConfig and
     * Set reference in role TraversalConfig
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theTraversalConfig) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aTraversalConfig = vrTraversalConfig;
    if( aTraversalConfig != null) {
      aTraversalConfig.removeBranchConfigsPrivileged( theCtxt, this);
    }
    vrTraversalConfig = theTraversalConfig;
      // If there was change, propagate
    if( (aTraversalConfig != null && !aTraversalConfig.sameAs( theCtxt, theTraversalConfig)) || (aTraversalConfig == null && theTraversalConfig != null)) {
      change( theCtxt, "TraversalConfig", aTraversalConfig, vrTraversalConfig, "vrTraversalConfig");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship MetaBranchMgr
 ****************************************************************************/


    /* Public Read accessor for role MetaBranchMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc getMetaBranchMgr( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaBranchMgrPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaBranchMgrPR( theCtxt);
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

    /* Public MetaBranchMgr number access
     */
  public int numMetaBranchMgr( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numMetaBranchMgrPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numMetaBranchMgrPR( theCtxt);
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



    /* Public MetaBranchMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc getMetaBranchMgrAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaBranchMgrAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaBranchMgrAtPR( theCtxt, theIndex);
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


    /* Public MetaBranchMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc findMetaBranchMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findMetaBranchMgrNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findMetaBranchMgrNamedPR( theCtxt, theMMName);
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




    /* Public MetaBranchMgr is related predicate
     */
  public boolean hasMetaBranchMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasMetaBranchMgrNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasMetaBranchMgrNamedPR( theCtxt, theMMName);
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



    /* Transactional MetaBranchMgr is related  predicate
     */
  public boolean hasMetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theMetaBranchMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasMetaBranchMgrPR( theCtxt, theMetaBranchMgr);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasMetaBranchMgrPR( theCtxt, theMetaBranchMgr);
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


    /* Public MetaBranchMgr index access
     */
  public int indexOfMetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theMetaBranchMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfMetaBranchMgrPR( theCtxt, theMetaBranchMgr);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfMetaBranchMgrPR( theCtxt, theMetaBranchMgr);
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




    /* Public Write accessor for role MetaBranchMgr
     */
  public void setMetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theMetaBranchMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setMetaBranchMgrPR( theCtxt, theMetaBranchMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setMetaBranchMgrPR( theCtxt, theMetaBranchMgr);
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
 *  Implementation of internal operations for relationship MetaBranchMgr
 ****************************************************************************/


    /* Public Read accessor for role MetaBranchMgr
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc getMetaBranchMgrPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getMetaBranchMgrPrivileged( theCtxt);
  }


    /* Public MetaBranchMgr number access
     */
  public int numMetaBranchMgrPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getMetaBranchMgrPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public MetaBranchMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc getMetaBranchMgrAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getMetaBranchMgrPrivileged( theCtxt);
  }


    /* Public MetaBranchMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc findMetaBranchMgrNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aMetaBranchMgr = getMetaBranchMgrPrivileged( theCtxt);
    if( aMetaBranchMgr == null) { return null;}

    if( !aMetaBranchMgr.sameNameAs( theCtxt, theMMName)) { return null;}

    return aMetaBranchMgr;
  }


    /* Public MetaBranchMgr finder predicate by name
     */
  public boolean hasMetaBranchMgrNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aMetaBranchMgr = getMetaBranchMgrPrivileged( theCtxt);
    if( aMetaBranchMgr == null) { return false;}

    return aMetaBranchMgr.sameNameAs( theCtxt, theMMName);
  }



    /* Public MetaBranchMgr is related predicate
     */
  public boolean hasMetaBranchMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theMetaBranchMgr) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aMetaBranchMgr = getMetaBranchMgrPrivileged( theCtxt);
    if( aMetaBranchMgr == null) { return false;}

    return aMetaBranchMgr.sameAs( theCtxt, theMetaBranchMgr);
  }




    /* Public MetaBranchMgr index access
     */
  public int indexOfMetaBranchMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theMetaBranchMgr) throws EAIException {
    if( !hasMetaBranchMgrPR( theCtxt, theMetaBranchMgr)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role MetaBranchMgr
     */
  public void setMetaBranchMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theMetaBranchMgr) throws EAIException {

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv aMetaBranchMgr = getMetaBranchMgrPrivileged( theCtxt);
      // Check for new MetaBranchMgr same as current one
    if( aMetaBranchMgr != null && aMetaBranchMgr.sameAs( theCtxt, theMetaBranchMgr)) { return;}

    if( aMetaBranchMgr != null) {
      aMetaBranchMgr.removeInverseOFmetaBranchMgrPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetMetaBranchMgrPrivileged();
      */
    }

    if( theMetaBranchMgr != null) {
      com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv aNewMetaBranchMgr = (com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv) theMetaBranchMgr;
      aNewMetaBranchMgr.addInverseOFmetaBranchMgrPrivileged( theCtxt, this);
      setMetaBranchMgrPrivileged( theCtxt, aNewMetaBranchMgr);
    }
    else {
      setMetaBranchMgrPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship MetaBranchMgr
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaBranchMgr
     * Guaranteed to return object with same identity of the MetaBranchMgr
     */
  public com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv getMetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrMetaBranchMgr;
  }




    /* Remove current reference in role MetaBranchMgr
     * Used by relationship maintenance machinery
     */
  public void unsetMetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aMetaBranchMgr = vrMetaBranchMgr;
    vrMetaBranchMgr = null;
      // If there was change, propagate
    if( aMetaBranchMgr != null) {
      change( theCtxt, "MetaBranchMgr", aMetaBranchMgr, vrMetaBranchMgr, "vrMetaBranchMgr");
    }
  }





    /* Set reference in role MetaBranchMgr
     * Used by relationship maintenance machinery
     */
  public void setMetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv theMetaBranchMgr) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aMetaBranchMgr = vrMetaBranchMgr;
    vrMetaBranchMgr = theMetaBranchMgr;
      // If there was change, propagate
    if( (aMetaBranchMgr != null && !aMetaBranchMgr.sameAs( theCtxt, theMetaBranchMgr)) || (aMetaBranchMgr == null && theMetaBranchMgr != null)) {
      change( theCtxt, "MetaBranchMgr", aMetaBranchMgr, vrMetaBranchMgr, "vrMetaBranchMgr");
    }
  }





    /* Unset currently related MetaBranchMgr and
     * Set reference in role MetaBranchMgr
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv theMetaBranchMgr) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv aMetaBranchMgr = vrMetaBranchMgr;
    if( aMetaBranchMgr != null) {
      aMetaBranchMgr.removeInverseOFmetaBranchMgrPrivileged( theCtxt, this);
    }
    vrMetaBranchMgr = theMetaBranchMgr;
      // If there was change, propagate
    if( (aMetaBranchMgr != null && !aMetaBranchMgr.sameAs( theCtxt, theMetaBranchMgr)) || (aMetaBranchMgr == null && theMetaBranchMgr != null)) {
      change( theCtxt, "MetaBranchMgr", aMetaBranchMgr, vrMetaBranchMgr, "vrMetaBranchMgr");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3BranchConfig
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 
      // When deleting : unreference attribute PhaseNumber
  setPhaseNumber( theCtxt, 0);



 
      // When deleting : unlink related InverseOFbranchConfigs
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFbranchConfigs = getInverseOFbranchConfigs( theCtxt);
    if( someInverseOFbranchConfigs != null) {
      int aInverseOFbranchConfigsLength = someInverseOFbranchConfigs.length;
      for( int anIndex = 0 ; anIndex < aInverseOFbranchConfigsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aInverseOFbranchConfigs = someInverseOFbranchConfigs[ anIndex];
        if( aInverseOFbranchConfigs != null) {
          removeInverseOFbranchConfigs( theCtxt, aInverseOFbranchConfigs);
        }
      }
    }
    

    // When deleting unlink related MetaRelationship
  setMetaRelationship( theCtxt, null);


      // When deleting : delete related TypeNodeConfigs
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] someTypeNodeConfigs = getTypeNodeConfigs( theCtxt);
    if( someTypeNodeConfigs != null) {
      int aTypeNodeConfigsLength = someTypeNodeConfigs.length;
      for( int anIndex = 0 ; anIndex < aTypeNodeConfigsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aTypeNodeConfigs = someTypeNodeConfigs[ anIndex];
        if( aTypeNodeConfigs != null) {
          com.dosmil_e.m3.traversal.impl.M3RelatedTypeNodeConfigImpl aTypeNodeConfigsImpl = null;
          try { aTypeNodeConfigsImpl = (com.dosmil_e.m3.traversal.impl.M3RelatedTypeNodeConfigImpl) aTypeNodeConfigs;} catch( ClassCastException anEx) {}
          if( aTypeNodeConfigsImpl != null) {
            aTypeNodeConfigsImpl.delete( theCtxt);
          }
        }
      }
    }
    

    // When deleting unlink related TraversalConfig
  setTraversalConfig( theCtxt, null);


    // When deleting unlink related MetaBranchMgr
  setMetaBranchMgr( theCtxt, null);



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
      vm3Type = com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.getStaticM3Type( theCtxt);
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


