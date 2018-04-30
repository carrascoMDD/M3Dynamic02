package com.dosmil_e.m3.traversal.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3NodeConfigBase
   extends com.dosmil_e.m3.traversal.impl.M3ConfigOverrideImpl
    implements com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3NodeConfig metamodel element
 ****************************************************************************/
	protected boolean vaIsTerminal;




/****************************************************************************
 *  State storage for the Relationships of the M3NodeConfig metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] vrBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv vrTraversalConfig; 

	protected com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] vrAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3TypePriv vrMetaType; 

	protected com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv vrMetaNodeMgr; 

	protected com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] vrInverseOFnodeConfig = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[0]; 






/****************************************************************************
 *  Constructors of the M3NodeConfig metamodel element
 ****************************************************************************/

  public M3NodeConfigBase() {
    super();
  }


  public M3NodeConfigBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3NodeConfigBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3NodeConfigIfc and M3NodeConfigPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3NodeConfig
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE IsTerminal
 ****************************************************************************/


    /* Public Read accessor for attribute IsTerminal
     */
  public boolean getIsTerminal( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    boolean aResult = true;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getIsTerminalPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getIsTerminalPR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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






    /* Transactional Public Write accessor for attribute IsTerminal
     */
  public void setIsTerminal( EAIMMCtxtIfc theCtxt, boolean theIsTerminal) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setIsTerminalPR( theCtxt,  theIsTerminal);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setIsTerminalPR( theCtxt, theIsTerminal);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute IsTerminal
 ****************************************************************************/


    /* Public Read accessor for attribute IsTerminal
     */
  public boolean getIsTerminalPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaIsTerminal;
  }



    /* Public Write accessor for attribute IsTerminal
     */
  public void setIsTerminalPR( EAIMMCtxtIfc theCtxt, boolean theIsTerminal) throws EAIException {

      // Get current value
    boolean aIsTerminal = getIsTerminalPR( theCtxt);
      // Check for new IsTerminal same as current one
    if( toObject( aIsTerminal) != null && toObject( aIsTerminal).equals( toObject( theIsTerminal))) { return;}

    vaIsTerminal = theIsTerminal;
    change( theCtxt, "IsTerminal", toObject( aIsTerminal), toObject( vaIsTerminal), "vaIsTerminal");
  }









/****************************************************************************
 *  Implementation of relationships of M3NodeConfig
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for MANY to MANY relationship BranchConfigs
 ****************************************************************************/


    /* Public Read accessor for role BranchConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getBranchConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getBranchConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getBranchConfigsPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public BranchConfigs number access
     */
  public int numBranchConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numBranchConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numBranchConfigsPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public BranchConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getBranchConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getBranchConfigsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getBranchConfigsAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public BranchConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc findBranchConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findBranchConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findBranchConfigsNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public BranchConfigs is related predicate
     */
  public boolean hasBranchConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasBranchConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasBranchConfigsNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional BranchConfigs is related  predicate
     */
  public boolean hasBranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasBranchConfigsPR( theCtxt, theBranchConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasBranchConfigsPR( theCtxt, theBranchConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public BranchConfigs index access
     */
  public int indexOfBranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfBranchConfigsPR( theCtxt, theBranchConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfBranchConfigsPR( theCtxt, theBranchConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addBranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addBranchConfigsPR( theCtxt, theBranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addBranchConfigsPR( theCtxt, theBranchConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addBranchConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addBranchConfigsBeforePR( theCtxt, theBranchConfigs, theRelativeBranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addBranchConfigsBeforePR( theCtxt, theBranchConfigs, theRelativeBranchConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role BranchConfigs
     */
  public void removeBranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeBranchConfigsPR( theCtxt, theBranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeBranchConfigsPR( theCtxt, theBranchConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role BranchConfigs
     */
  public void moveBranchConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveBranchConfigsBeforePR( theCtxt, theBranchConfigs, theRelativeBranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveBranchConfigsBeforePR( theCtxt, theBranchConfigs, theRelativeBranchConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role BranchConfigs
     */
  public void moveBranchConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveBranchConfigsToLastPR( theCtxt, theBranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveBranchConfigsToLastPR( theCtxt, theBranchConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship BranchConfigs
 ****************************************************************************/


    /* Public Read accessor for role BranchConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getBranchConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return null;}

    int aBranchConfigsLength = someBranchConfigs.length;
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] otherBranchConfigs = new com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[ aBranchConfigsLength];
    try { System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aBranchConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getBranchConfigs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getBranchConfigs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getBranchConfigs", null); return null;}


    return otherBranchConfigs;
  }





    /* Public BranchConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc findBranchConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return null;}

      // Check for new BranchConfigs already in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aBranchConfigs = someBranchConfigs[ anIndex];
      if( aBranchConfigs.sameNameAs( theCtxt, theMMName)) { return aBranchConfigs;}
    }
    return null;
  }



    /* Public BranchConfigs finder predicate by name
     */
  public boolean hasBranchConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findBranchConfigsNamedPR( theCtxt, theMMName) != null;
  }



    /* Public BranchConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getBranchConfigsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return null;}

      // Get number of BranchConfigs
    int aBranchConfigsLength = someBranchConfigs.length;

      // Verify index within array length
    if( theIndex >= aBranchConfigsLength) { return null;}

      // Get indexed BranchConfigs
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aBranchConfigs = someBranchConfigs[ theIndex];

    return aBranchConfigs;
  }



    /* Public BranchConfigs is related predicate
     */
  public boolean hasBranchConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
    return indexOfBranchConfigsPR( theCtxt, theBranchConfigs) >= 0;
  }


    /* Public BranchConfigs index access
     */
  public int indexOfBranchConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
      // Do not add null values to the collection
    if( theBranchConfigs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return -1;}

      // Check for new BranchConfigs already in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
      if( someBranchConfigs[ anIndex].sameAs( theCtxt, theBranchConfigs)) { return anIndex;}
    }
    return -1;
  }


    /* Public BranchConfigs number access
     */
  public int numBranchConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return 0;}

      // Check for new BranchConfigs already in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    return aBranchConfigsLength;
  }




    /* Public Write accessor for role BranchConfigs
     */
  public void addBranchConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}

      // Check for new BranchConfigs already in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
      if( theBranchConfigs.sameAs( theCtxt, someBranchConfigs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aNewBranchConfigs = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theBranchConfigs;

      // Link reverse ref to this object
    aNewBranchConfigs.addInverseOFbranchConfigsPrivileged( theCtxt, this);

      // Grow collection and add new BranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength + 1];
    try { System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aBranchConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigs", null); return;}
    otherBranchConfigs[ aBranchConfigsLength] = aNewBranchConfigs;

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }


    /* Public ordered Write accessor for role BranchConfigs
     */
  public void addBranchConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeBranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchConfigs == null) { return;}

      // If relative BranchConfigs is null, perform normal add operation
    if( theRelativeBranchConfigs == null) {
      addBranchConfigsPR( theCtxt, theBranchConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}


      // Get index of relative BranchConfigs
    int aRelativeIndex = indexOfBranchConfigsPR( theCtxt, theRelativeBranchConfigs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addBranchConfigsPR( theCtxt, theBranchConfigs);
    }

      // Get length of BranchConfigs array
    int aBranchConfigsLength = someBranchConfigs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aBranchConfigsLength) {
      addBranchConfigsPR( theCtxt, theBranchConfigs);
    }

      // Check for new BranchConfigs already in collection
    if( hasBranchConfigsPR( theCtxt, theBranchConfigs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aNewBranchConfigs = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theBranchConfigs;

      // Link reverse ref to this object
    aNewBranchConfigs.addInverseOFbranchConfigsPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship BranchConfigs
      // Grow collection and add new BranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aRelativeIndex );
      }
      System.arraycopy( someBranchConfigs, aRelativeIndex, otherBranchConfigs, aRelativeIndex + 1, aBranchConfigsLength - aRelativeIndex);
      otherBranchConfigs[ aRelativeIndex] = aNewBranchConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigsBefore", null); return;}

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }



    /* Public Write accessor for role BranchConfigs
     */
  public void removeBranchConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}

      // Check for new BranchConfigs not in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
      if( theBranchConfigs.sameAs( theCtxt, someBranchConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aNewBranchConfigs = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theBranchConfigs;

      // Unlink reverse ref from the new related object
    aNewBranchConfigs.removeInverseOFbranchConfigsPrivileged( theCtxt, this);

      // Shrink collection removing BranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength - 1];
    try {
      System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aFoundIndex);
      System.arraycopy( someBranchConfigs, aFoundIndex + 1, otherBranchConfigs, aFoundIndex, aBranchConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchConfigs", null); return;}

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }




    /* Public reorder accessor for role BranchConfigs
     */
  public void moveBranchConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeBranchConfigs) throws EAIException {

      // Null value is nothing to move
    if( theBranchConfigs == null) { return;}

      // If relative BranchConfigs is null, perform move to last position
    if( theRelativeBranchConfigs == null) {
      moveBranchConfigsToLastPR( theCtxt, theBranchConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}

      // Get length of BranchConfigs array
    int aBranchConfigsLength = someBranchConfigs.length;

      // Get index of BranchConfigs to move
    int aToMoveIndex = indexOfBranchConfigsPR( theCtxt, theBranchConfigs);
      // If toMove BranchConfigs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aBranchConfigsLength) {
      moveBranchConfigsToLastPR( theCtxt, theBranchConfigs);
    }

      // Get index of relative BranchConfigs
    int aRelativeIndex = indexOfBranchConfigsPR( theCtxt, theRelativeBranchConfigs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveBranchConfigsToLastPR( theCtxt, theBranchConfigs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aBranchConfigsLength) {
      moveBranchConfigsToLastPR( theCtxt, theBranchConfigs);
    }

      // ToMove and relative BranchConfigs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aToMoveBranchConfigs = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theBranchConfigs;

      // Allocate new array for new version of state of relationship BranchConfigs
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aToMoveIndex );
        System.arraycopy( someBranchConfigs, aToMoveIndex + 1, otherBranchConfigs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherBranchConfigs[ aRelativeIndex - 1] = aToMoveBranchConfigs;
        System.arraycopy( someBranchConfigs, aRelativeIndex, otherBranchConfigs, aRelativeIndex, aBranchConfigsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aRelativeIndex );
        otherBranchConfigs[ aRelativeIndex ] = aToMoveBranchConfigs;
        System.arraycopy( someBranchConfigs, aRelativeIndex, otherBranchConfigs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aBranchConfigsLength - 1) {
          System.arraycopy( someBranchConfigs, aToMoveIndex + 1, otherBranchConfigs, aToMoveIndex + 1, aBranchConfigsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchConfigsBefore", null); return;}

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }





    /* Public move to last accessor for role BranchConfigs
     */
  public void moveBranchConfigsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {

      // Null value is nothing to move
    if( theBranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}

      // Get length of BranchConfigs array
    int aBranchConfigsLength = someBranchConfigs.length;

      // Get index of BranchConfigs to move
    int aToMoveIndex = indexOfBranchConfigsPR( theCtxt, theBranchConfigs);

      // If toMove BranchConfigs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aBranchConfigsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aToMoveBranchConfigs = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theBranchConfigs;

      // Allocate new array for new version of state of relationship BranchConfigs
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength];
    try {
      System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aToMoveIndex );
      System.arraycopy( someBranchConfigs, aToMoveIndex + 1, otherBranchConfigs, aToMoveIndex, aBranchConfigsLength - aToMoveIndex - 1);
      otherBranchConfigs[ aBranchConfigsLength - 1] = aToMoveBranchConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchConfigsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchConfigsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchConfigsToLast", null); return;}

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }







/****************************************************************************
 *  Implementation of privileged interface for relationship BranchConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role BranchConfigs
     */
  public void addBranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theBranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}

      // Check for new BranchConfigs already in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
      if( theBranchConfigs.sameAs( theCtxt, someBranchConfigs[ anIndex])) { return;}
    }

      // Grow collection and add new BranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength + 1];
    try {
      System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aBranchConfigsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv.class}); return;}

    otherBranchConfigs[ aBranchConfigsLength] = theBranchConfigs;

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }









    /* Privileged Write accessor for role BranchConfigs
     */
  public void removeBranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theBranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}

      // Check for new BranchConfigs not in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
      if( theBranchConfigs.sameAs( theCtxt, someBranchConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing BranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength - 1];
    try {
      System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aFoundIndex);
      System.arraycopy( someBranchConfigs, aFoundIndex + 1, otherBranchConfigs, aFoundIndex, aBranchConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchConfigsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchConfigsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchConfigsPrivileged", null); return;}

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }






    /* Privileged Read accessor for role BranchConfigs
     * Guaranteed to return object with same identity of the BranchConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] getBranchConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrBranchConfigs;
  }




    /* Set reference in role BranchConfigs
     * Used by relationship maintenance machinery
     */
  public void setBranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] theBranchConfigsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] aBranchConfigs = vrBranchConfigs;
    vrBranchConfigs = theBranchConfigsCollection;
      // Propagate change
    change( theCtxt, "BranchConfigs", aBranchConfigs, vrBranchConfigs, "vrBranchConfigs");
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
      aTraversalConfig.removeNodeConfigsPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetTraversalConfigPrivileged();
      */
    }

    if( theTraversalConfig != null) {
      com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aNewTraversalConfig = (com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv) theTraversalConfig;
      aNewTraversalConfig.addNodeConfigsPrivileged( theCtxt, this);
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
      aTraversalConfig.removeNodeConfigsPrivileged( theCtxt, this);
    }
    vrTraversalConfig = theTraversalConfig;
      // If there was change, propagate
    if( (aTraversalConfig != null && !aTraversalConfig.sameAs( theCtxt, theTraversalConfig)) || (aTraversalConfig == null && theTraversalConfig != null)) {
      change( theCtxt, "TraversalConfig", aTraversalConfig, vrTraversalConfig, "vrTraversalConfig");
    }
  }











/****************************************************************************
 *  Implementation of public interface for MANY to MANY relationship AttributeConfigs
 ****************************************************************************/


    /* Public Read accessor for role AttributeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getAttributeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getAttributeConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getAttributeConfigsPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public AttributeConfigs number access
     */
  public int numAttributeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numAttributeConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numAttributeConfigsPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public AttributeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc getAttributeConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getAttributeConfigsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getAttributeConfigsAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public AttributeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc findAttributeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findAttributeConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findAttributeConfigsNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public AttributeConfigs is related predicate
     */
  public boolean hasAttributeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasAttributeConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasAttributeConfigsNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional AttributeConfigs is related  predicate
     */
  public boolean hasAttributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasAttributeConfigsPR( theCtxt, theAttributeConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasAttributeConfigsPR( theCtxt, theAttributeConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public AttributeConfigs index access
     */
  public int indexOfAttributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfAttributeConfigsPR( theCtxt, theAttributeConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfAttributeConfigsPR( theCtxt, theAttributeConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addAttributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addAttributeConfigsPR( theCtxt, theAttributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addAttributeConfigsPR( theCtxt, theAttributeConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addAttributeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addAttributeConfigsBeforePR( theCtxt, theAttributeConfigs, theRelativeAttributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addAttributeConfigsBeforePR( theCtxt, theAttributeConfigs, theRelativeAttributeConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role AttributeConfigs
     */
  public void removeAttributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeAttributeConfigsPR( theCtxt, theAttributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeAttributeConfigsPR( theCtxt, theAttributeConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role AttributeConfigs
     */
  public void moveAttributeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveAttributeConfigsBeforePR( theCtxt, theAttributeConfigs, theRelativeAttributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveAttributeConfigsBeforePR( theCtxt, theAttributeConfigs, theRelativeAttributeConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role AttributeConfigs
     */
  public void moveAttributeConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveAttributeConfigsToLastPR( theCtxt, theAttributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveAttributeConfigsToLastPR( theCtxt, theAttributeConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship AttributeConfigs
 ****************************************************************************/


    /* Public Read accessor for role AttributeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getAttributeConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return null;}

    int aAttributeConfigsLength = someAttributeConfigs.length;
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[ aAttributeConfigsLength];
    try { System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aAttributeConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getAttributeConfigs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getAttributeConfigs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getAttributeConfigs", null); return null;}


    return otherAttributeConfigs;
  }





    /* Public AttributeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc findAttributeConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return null;}

      // Check for new AttributeConfigs already in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aAttributeConfigs = someAttributeConfigs[ anIndex];
      if( aAttributeConfigs.sameNameAs( theCtxt, theMMName)) { return aAttributeConfigs;}
    }
    return null;
  }



    /* Public AttributeConfigs finder predicate by name
     */
  public boolean hasAttributeConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findAttributeConfigsNamedPR( theCtxt, theMMName) != null;
  }



    /* Public AttributeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc getAttributeConfigsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return null;}

      // Get number of AttributeConfigs
    int aAttributeConfigsLength = someAttributeConfigs.length;

      // Verify index within array length
    if( theIndex >= aAttributeConfigsLength) { return null;}

      // Get indexed AttributeConfigs
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aAttributeConfigs = someAttributeConfigs[ theIndex];

    return aAttributeConfigs;
  }



    /* Public AttributeConfigs is related predicate
     */
  public boolean hasAttributeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
    return indexOfAttributeConfigsPR( theCtxt, theAttributeConfigs) >= 0;
  }


    /* Public AttributeConfigs index access
     */
  public int indexOfAttributeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
      // Do not add null values to the collection
    if( theAttributeConfigs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return -1;}

      // Check for new AttributeConfigs already in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
      if( someAttributeConfigs[ anIndex].sameAs( theCtxt, theAttributeConfigs)) { return anIndex;}
    }
    return -1;
  }


    /* Public AttributeConfigs number access
     */
  public int numAttributeConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return 0;}

      // Check for new AttributeConfigs already in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    return aAttributeConfigsLength;
  }




    /* Public Write accessor for role AttributeConfigs
     */
  public void addAttributeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theAttributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}

      // Check for new AttributeConfigs already in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
      if( theAttributeConfigs.sameAs( theCtxt, someAttributeConfigs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aNewAttributeConfigs = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theAttributeConfigs;

      // Link reverse ref to this object
    aNewAttributeConfigs.addInverseOFattributeConfigsPrivileged( theCtxt, this);

      // Grow collection and add new AttributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength + 1];
    try { System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aAttributeConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigs", null); return;}
    otherAttributeConfigs[ aAttributeConfigsLength] = aNewAttributeConfigs;

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }


    /* Public ordered Write accessor for role AttributeConfigs
     */
  public void addAttributeConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeAttributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theAttributeConfigs == null) { return;}

      // If relative AttributeConfigs is null, perform normal add operation
    if( theRelativeAttributeConfigs == null) {
      addAttributeConfigsPR( theCtxt, theAttributeConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}


      // Get index of relative AttributeConfigs
    int aRelativeIndex = indexOfAttributeConfigsPR( theCtxt, theRelativeAttributeConfigs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addAttributeConfigsPR( theCtxt, theAttributeConfigs);
    }

      // Get length of AttributeConfigs array
    int aAttributeConfigsLength = someAttributeConfigs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aAttributeConfigsLength) {
      addAttributeConfigsPR( theCtxt, theAttributeConfigs);
    }

      // Check for new AttributeConfigs already in collection
    if( hasAttributeConfigsPR( theCtxt, theAttributeConfigs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aNewAttributeConfigs = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theAttributeConfigs;

      // Link reverse ref to this object
    aNewAttributeConfigs.addInverseOFattributeConfigsPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship AttributeConfigs
      // Grow collection and add new AttributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aRelativeIndex );
      }
      System.arraycopy( someAttributeConfigs, aRelativeIndex, otherAttributeConfigs, aRelativeIndex + 1, aAttributeConfigsLength - aRelativeIndex);
      otherAttributeConfigs[ aRelativeIndex] = aNewAttributeConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigsBefore", null); return;}

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }



    /* Public Write accessor for role AttributeConfigs
     */
  public void removeAttributeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theAttributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}

      // Check for new AttributeConfigs not in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
      if( theAttributeConfigs.sameAs( theCtxt, someAttributeConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aNewAttributeConfigs = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theAttributeConfigs;

      // Unlink reverse ref from the new related object
    aNewAttributeConfigs.removeInverseOFattributeConfigsPrivileged( theCtxt, this);

      // Shrink collection removing AttributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength - 1];
    try {
      System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aFoundIndex);
      System.arraycopy( someAttributeConfigs, aFoundIndex + 1, otherAttributeConfigs, aFoundIndex, aAttributeConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributeConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributeConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributeConfigs", null); return;}

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }




    /* Public reorder accessor for role AttributeConfigs
     */
  public void moveAttributeConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeAttributeConfigs) throws EAIException {

      // Null value is nothing to move
    if( theAttributeConfigs == null) { return;}

      // If relative AttributeConfigs is null, perform move to last position
    if( theRelativeAttributeConfigs == null) {
      moveAttributeConfigsToLastPR( theCtxt, theAttributeConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}

      // Get length of AttributeConfigs array
    int aAttributeConfigsLength = someAttributeConfigs.length;

      // Get index of AttributeConfigs to move
    int aToMoveIndex = indexOfAttributeConfigsPR( theCtxt, theAttributeConfigs);
      // If toMove AttributeConfigs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aAttributeConfigsLength) {
      moveAttributeConfigsToLastPR( theCtxt, theAttributeConfigs);
    }

      // Get index of relative AttributeConfigs
    int aRelativeIndex = indexOfAttributeConfigsPR( theCtxt, theRelativeAttributeConfigs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveAttributeConfigsToLastPR( theCtxt, theAttributeConfigs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aAttributeConfigsLength) {
      moveAttributeConfigsToLastPR( theCtxt, theAttributeConfigs);
    }

      // ToMove and relative AttributeConfigs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aToMoveAttributeConfigs = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theAttributeConfigs;

      // Allocate new array for new version of state of relationship AttributeConfigs
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aToMoveIndex );
        System.arraycopy( someAttributeConfigs, aToMoveIndex + 1, otherAttributeConfigs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherAttributeConfigs[ aRelativeIndex - 1] = aToMoveAttributeConfigs;
        System.arraycopy( someAttributeConfigs, aRelativeIndex, otherAttributeConfigs, aRelativeIndex, aAttributeConfigsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aRelativeIndex );
        otherAttributeConfigs[ aRelativeIndex ] = aToMoveAttributeConfigs;
        System.arraycopy( someAttributeConfigs, aRelativeIndex, otherAttributeConfigs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aAttributeConfigsLength - 1) {
          System.arraycopy( someAttributeConfigs, aToMoveIndex + 1, otherAttributeConfigs, aToMoveIndex + 1, aAttributeConfigsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributeConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributeConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributeConfigsBefore", null); return;}

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }





    /* Public move to last accessor for role AttributeConfigs
     */
  public void moveAttributeConfigsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {

      // Null value is nothing to move
    if( theAttributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}

      // Get length of AttributeConfigs array
    int aAttributeConfigsLength = someAttributeConfigs.length;

      // Get index of AttributeConfigs to move
    int aToMoveIndex = indexOfAttributeConfigsPR( theCtxt, theAttributeConfigs);

      // If toMove AttributeConfigs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aAttributeConfigsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aToMoveAttributeConfigs = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theAttributeConfigs;

      // Allocate new array for new version of state of relationship AttributeConfigs
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength];
    try {
      System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aToMoveIndex );
      System.arraycopy( someAttributeConfigs, aToMoveIndex + 1, otherAttributeConfigs, aToMoveIndex, aAttributeConfigsLength - aToMoveIndex - 1);
      otherAttributeConfigs[ aAttributeConfigsLength - 1] = aToMoveAttributeConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributeConfigsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributeConfigsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributeConfigsToLast", null); return;}

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }







/****************************************************************************
 *  Implementation of privileged interface for relationship AttributeConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role AttributeConfigs
     */
  public void addAttributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv theAttributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theAttributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}

      // Check for new AttributeConfigs already in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
      if( theAttributeConfigs.sameAs( theCtxt, someAttributeConfigs[ anIndex])) { return;}
    }

      // Grow collection and add new AttributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength + 1];
    try {
      System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aAttributeConfigsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv.class}); return;}

    otherAttributeConfigs[ aAttributeConfigsLength] = theAttributeConfigs;

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }









    /* Privileged Write accessor for role AttributeConfigs
     */
  public void removeAttributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv theAttributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theAttributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}

      // Check for new AttributeConfigs not in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
      if( theAttributeConfigs.sameAs( theCtxt, someAttributeConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing AttributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength - 1];
    try {
      System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aFoundIndex);
      System.arraycopy( someAttributeConfigs, aFoundIndex + 1, otherAttributeConfigs, aFoundIndex, aAttributeConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributeConfigsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributeConfigsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributeConfigsPrivileged", null); return;}

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }






    /* Privileged Read accessor for role AttributeConfigs
     * Guaranteed to return object with same identity of the AttributeConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] getAttributeConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrAttributeConfigs;
  }




    /* Set reference in role AttributeConfigs
     * Used by relationship maintenance machinery
     */
  public void setAttributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] theAttributeConfigsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] aAttributeConfigs = vrAttributeConfigs;
    vrAttributeConfigs = theAttributeConfigsCollection;
      // Propagate change
    change( theCtxt, "AttributeConfigs", aAttributeConfigs, vrAttributeConfigs, "vrAttributeConfigs");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship MetaType
 ****************************************************************************/


    /* Public Read accessor for role MetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getMetaType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public MetaType number access
     */
  public int numMetaType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numMetaTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numMetaTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public MetaType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getMetaTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaTypeAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public MetaType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findMetaTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findMetaTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public MetaType is related predicate
     */
  public boolean hasMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasMetaTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasMetaTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional MetaType is related  predicate
     */
  public boolean hasMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasMetaTypePR( theCtxt, theMetaType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasMetaTypePR( theCtxt, theMetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public MetaType index access
     */
  public int indexOfMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfMetaTypePR( theCtxt, theMetaType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfMetaTypePR( theCtxt, theMetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public Write accessor for role MetaType
     */
  public void setMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setMetaTypePR( theCtxt, theMetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setMetaTypePR( theCtxt, theMetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship MetaType
 ****************************************************************************/


    /* Public Read accessor for role MetaType
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getMetaTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getMetaTypePrivileged( theCtxt);
  }


    /* Public MetaType number access
     */
  public int numMetaTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getMetaTypePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public MetaType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getMetaTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getMetaTypePrivileged( theCtxt);
  }


    /* Public MetaType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findMetaTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3TypeIfc aMetaType = getMetaTypePrivileged( theCtxt);
    if( aMetaType == null) { return null;}

    if( !aMetaType.sameNameAs( theCtxt, theMMName)) { return null;}

    return aMetaType;
  }


    /* Public MetaType finder predicate by name
     */
  public boolean hasMetaTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aMetaType = getMetaTypePrivileged( theCtxt);
    if( aMetaType == null) { return false;}

    return aMetaType.sameNameAs( theCtxt, theMMName);
  }



    /* Public MetaType is related predicate
     */
  public boolean hasMetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theMetaType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aMetaType = getMetaTypePrivileged( theCtxt);
    if( aMetaType == null) { return false;}

    return aMetaType.sameAs( theCtxt, theMetaType);
  }




    /* Public MetaType index access
     */
  public int indexOfMetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theMetaType) throws EAIException {
    if( !hasMetaTypePR( theCtxt, theMetaType)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role MetaType
     */
  public void setMetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theMetaType) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv aMetaType = getMetaTypePrivileged( theCtxt);
      // Check for new MetaType same as current one
    if( aMetaType != null && aMetaType.sameAs( theCtxt, theMetaType)) { return;}

    if( aMetaType != null) {
      aMetaType.removeInverseOFmetaTypePrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetMetaTypePrivileged();
      */
    }

    if( theMetaType != null) {
      com.dosmil_e.m3.core.priv.M3TypePriv aNewMetaType = (com.dosmil_e.m3.core.priv.M3TypePriv) theMetaType;
      aNewMetaType.addInverseOFmetaTypePrivileged( theCtxt, this);
      setMetaTypePrivileged( theCtxt, aNewMetaType);
    }
    else {
      setMetaTypePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship MetaType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaType
     * Guaranteed to return object with same identity of the MetaType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getMetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrMetaType;
  }




    /* Remove current reference in role MetaType
     * Used by relationship maintenance machinery
     */
  public void unsetMetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aMetaType = vrMetaType;
    vrMetaType = null;
      // If there was change, propagate
    if( aMetaType != null) {
      change( theCtxt, "MetaType", aMetaType, vrMetaType, "vrMetaType");
    }
  }





    /* Set reference in role MetaType
     * Used by relationship maintenance machinery
     */
  public void setMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theMetaType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aMetaType = vrMetaType;
    vrMetaType = theMetaType;
      // If there was change, propagate
    if( (aMetaType != null && !aMetaType.sameAs( theCtxt, theMetaType)) || (aMetaType == null && theMetaType != null)) {
      change( theCtxt, "MetaType", aMetaType, vrMetaType, "vrMetaType");
    }
  }





    /* Unset currently related MetaType and
     * Set reference in role MetaType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theMetaType) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv aMetaType = vrMetaType;
    if( aMetaType != null) {
      aMetaType.removeInverseOFmetaTypePrivileged( theCtxt, this);
    }
    vrMetaType = theMetaType;
      // If there was change, propagate
    if( (aMetaType != null && !aMetaType.sameAs( theCtxt, theMetaType)) || (aMetaType == null && theMetaType != null)) {
      change( theCtxt, "MetaType", aMetaType, vrMetaType, "vrMetaType");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship MetaNodeMgr
 ****************************************************************************/


    /* Public Read accessor for role MetaNodeMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc getMetaNodeMgr( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaNodeMgrPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaNodeMgrPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public MetaNodeMgr number access
     */
  public int numMetaNodeMgr( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numMetaNodeMgrPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numMetaNodeMgrPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public MetaNodeMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc getMetaNodeMgrAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaNodeMgrAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaNodeMgrAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public MetaNodeMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc findMetaNodeMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findMetaNodeMgrNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findMetaNodeMgrNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public MetaNodeMgr is related predicate
     */
  public boolean hasMetaNodeMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasMetaNodeMgrNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasMetaNodeMgrNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional MetaNodeMgr is related  predicate
     */
  public boolean hasMetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theMetaNodeMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasMetaNodeMgrPR( theCtxt, theMetaNodeMgr);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasMetaNodeMgrPR( theCtxt, theMetaNodeMgr);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public MetaNodeMgr index access
     */
  public int indexOfMetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theMetaNodeMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfMetaNodeMgrPR( theCtxt, theMetaNodeMgr);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfMetaNodeMgrPR( theCtxt, theMetaNodeMgr);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public Write accessor for role MetaNodeMgr
     */
  public void setMetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theMetaNodeMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setMetaNodeMgrPR( theCtxt, theMetaNodeMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setMetaNodeMgrPR( theCtxt, theMetaNodeMgr);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship MetaNodeMgr
 ****************************************************************************/


    /* Public Read accessor for role MetaNodeMgr
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc getMetaNodeMgrPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getMetaNodeMgrPrivileged( theCtxt);
  }


    /* Public MetaNodeMgr number access
     */
  public int numMetaNodeMgrPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getMetaNodeMgrPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public MetaNodeMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc getMetaNodeMgrAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getMetaNodeMgrPrivileged( theCtxt);
  }


    /* Public MetaNodeMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc findMetaNodeMgrNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aMetaNodeMgr = getMetaNodeMgrPrivileged( theCtxt);
    if( aMetaNodeMgr == null) { return null;}

    if( !aMetaNodeMgr.sameNameAs( theCtxt, theMMName)) { return null;}

    return aMetaNodeMgr;
  }


    /* Public MetaNodeMgr finder predicate by name
     */
  public boolean hasMetaNodeMgrNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aMetaNodeMgr = getMetaNodeMgrPrivileged( theCtxt);
    if( aMetaNodeMgr == null) { return false;}

    return aMetaNodeMgr.sameNameAs( theCtxt, theMMName);
  }



    /* Public MetaNodeMgr is related predicate
     */
  public boolean hasMetaNodeMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theMetaNodeMgr) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aMetaNodeMgr = getMetaNodeMgrPrivileged( theCtxt);
    if( aMetaNodeMgr == null) { return false;}

    return aMetaNodeMgr.sameAs( theCtxt, theMetaNodeMgr);
  }




    /* Public MetaNodeMgr index access
     */
  public int indexOfMetaNodeMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theMetaNodeMgr) throws EAIException {
    if( !hasMetaNodeMgrPR( theCtxt, theMetaNodeMgr)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role MetaNodeMgr
     */
  public void setMetaNodeMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theMetaNodeMgr) throws EAIException {

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv aMetaNodeMgr = getMetaNodeMgrPrivileged( theCtxt);
      // Check for new MetaNodeMgr same as current one
    if( aMetaNodeMgr != null && aMetaNodeMgr.sameAs( theCtxt, theMetaNodeMgr)) { return;}

    if( aMetaNodeMgr != null) {
      aMetaNodeMgr.removeInverseOFmetaNodeMgrPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetMetaNodeMgrPrivileged();
      */
    }

    if( theMetaNodeMgr != null) {
      com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv aNewMetaNodeMgr = (com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv) theMetaNodeMgr;
      aNewMetaNodeMgr.addInverseOFmetaNodeMgrPrivileged( theCtxt, this);
      setMetaNodeMgrPrivileged( theCtxt, aNewMetaNodeMgr);
    }
    else {
      setMetaNodeMgrPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship MetaNodeMgr
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaNodeMgr
     * Guaranteed to return object with same identity of the MetaNodeMgr
     */
  public com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv getMetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrMetaNodeMgr;
  }




    /* Remove current reference in role MetaNodeMgr
     * Used by relationship maintenance machinery
     */
  public void unsetMetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aMetaNodeMgr = vrMetaNodeMgr;
    vrMetaNodeMgr = null;
      // If there was change, propagate
    if( aMetaNodeMgr != null) {
      change( theCtxt, "MetaNodeMgr", aMetaNodeMgr, vrMetaNodeMgr, "vrMetaNodeMgr");
    }
  }





    /* Set reference in role MetaNodeMgr
     * Used by relationship maintenance machinery
     */
  public void setMetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv theMetaNodeMgr) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aMetaNodeMgr = vrMetaNodeMgr;
    vrMetaNodeMgr = theMetaNodeMgr;
      // If there was change, propagate
    if( (aMetaNodeMgr != null && !aMetaNodeMgr.sameAs( theCtxt, theMetaNodeMgr)) || (aMetaNodeMgr == null && theMetaNodeMgr != null)) {
      change( theCtxt, "MetaNodeMgr", aMetaNodeMgr, vrMetaNodeMgr, "vrMetaNodeMgr");
    }
  }





    /* Unset currently related MetaNodeMgr and
     * Set reference in role MetaNodeMgr
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv theMetaNodeMgr) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv aMetaNodeMgr = vrMetaNodeMgr;
    if( aMetaNodeMgr != null) {
      aMetaNodeMgr.removeInverseOFmetaNodeMgrPrivileged( theCtxt, this);
    }
    vrMetaNodeMgr = theMetaNodeMgr;
      // If there was change, propagate
    if( (aMetaNodeMgr != null && !aMetaNodeMgr.sameAs( theCtxt, theMetaNodeMgr)) || (aMetaNodeMgr == null && theMetaNodeMgr != null)) {
      change( theCtxt, "MetaNodeMgr", aMetaNodeMgr, vrMetaNodeMgr, "vrMetaNodeMgr");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFnodeConfig
 ****************************************************************************/


    /* Public Read accessor for role InverseOFnodeConfig
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] getInverseOFnodeConfig( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFnodeConfigPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFnodeConfigPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public InverseOFnodeConfig number access
     */
  public int numInverseOFnodeConfig( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFnodeConfigPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFnodeConfigPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public InverseOFnodeConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc getInverseOFnodeConfigAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFnodeConfigAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFnodeConfigAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public InverseOFnodeConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc findInverseOFnodeConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFnodeConfigNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFnodeConfigNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public InverseOFnodeConfig is related predicate
     */
  public boolean hasInverseOFnodeConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFnodeConfigNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFnodeConfigNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional InverseOFnodeConfig is related  predicate
     */
  public boolean hasInverseOFnodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public InverseOFnodeConfig index access
     */
  public int indexOfInverseOFnodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFnodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFnodeConfigBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theRelativeInverseOFnodeConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFnodeConfigBeforePR( theCtxt, theInverseOFnodeConfig, theRelativeInverseOFnodeConfig);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFnodeConfigBeforePR( theCtxt, theInverseOFnodeConfig, theRelativeInverseOFnodeConfig);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role InverseOFnodeConfig
     */
  public void removeInverseOFnodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFnodeConfig
     */
  public void moveInverseOFnodeConfigBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theRelativeInverseOFnodeConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFnodeConfigBeforePR( theCtxt, theInverseOFnodeConfig, theRelativeInverseOFnodeConfig);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFnodeConfigBeforePR( theCtxt, theInverseOFnodeConfig, theRelativeInverseOFnodeConfig);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFnodeConfig
     */
  public void moveInverseOFnodeConfigToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFnodeConfigToLastPR( theCtxt, theInverseOFnodeConfig);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFnodeConfigToLastPR( theCtxt, theInverseOFnodeConfig);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship InverseOFnodeConfig
 ****************************************************************************/


    /* Public Read accessor for role InverseOFnodeConfig
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] getInverseOFnodeConfigPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] someInverseOFnodeConfig = getInverseOFnodeConfigPrivileged( theCtxt);
    if( someInverseOFnodeConfig == null) { return null;}

    int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] otherInverseOFnodeConfig = new com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[ aInverseOFnodeConfigLength];
    try { System.arraycopy( someInverseOFnodeConfig, 0, otherInverseOFnodeConfig, 0, aInverseOFnodeConfigLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFnodeConfig", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFnodeConfig", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFnodeConfig", null); return null;}


    return otherInverseOFnodeConfig;
  }



    /* Public InverseOFnodeConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc findInverseOFnodeConfigNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] someInverseOFnodeConfig = getInverseOFnodeConfigPrivileged( theCtxt);
    if( someInverseOFnodeConfig == null) { return null;}

      // Check for new InverseOFnodeConfig already in collection
    int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;
    for( int anIndex = 0 ; anIndex < aInverseOFnodeConfigLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv aInverseOFnodeConfig = someInverseOFnodeConfig[ anIndex];
      if( aInverseOFnodeConfig.sameNameAs( theCtxt, theMMName)) { return aInverseOFnodeConfig;}
    }
    return null;
  }



    /* Public InverseOFnodeConfig finder predicate by name
     */
  public boolean hasInverseOFnodeConfigNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFnodeConfigNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFnodeConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc getInverseOFnodeConfigAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] someInverseOFnodeConfig = getInverseOFnodeConfigPrivileged( theCtxt);
    if( someInverseOFnodeConfig == null) { return null;}

      // Get number of InverseOFnodeConfig
    int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;

      // Verify index within array length
    if( theIndex >= aInverseOFnodeConfigLength) { return null;}

      // Get indexed InverseOFnodeConfig
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc aInverseOFnodeConfig = someInverseOFnodeConfig[ theIndex];

    return aInverseOFnodeConfig;
  }



    /* Public InverseOFnodeConfig is related predicate
     */
  public boolean hasInverseOFnodeConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException {
    return indexOfInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig) >= 0;
  }


    /* Public InverseOFnodeConfig index access
     */
  public int indexOfInverseOFnodeConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFnodeConfig == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] someInverseOFnodeConfig = getInverseOFnodeConfigPrivileged( theCtxt);
    if( someInverseOFnodeConfig == null) { return -1;}

      // Check for new InverseOFnodeConfig already in collection
    int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;
    for( int anIndex = 0 ; anIndex < aInverseOFnodeConfigLength ; anIndex++) {
      if( someInverseOFnodeConfig[ anIndex].sameAs( theCtxt, theInverseOFnodeConfig)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFnodeConfig number access
     */
  public int numInverseOFnodeConfigPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] someInverseOFnodeConfig = getInverseOFnodeConfigPrivileged( theCtxt);
    if( someInverseOFnodeConfig == null) { return 0;}

      // Check for new InverseOFnodeConfig already in collection
    int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;
    return aInverseOFnodeConfigLength;
  }




    /* Public Write accessor for role InverseOFnodeConfig
     */
  public void addInverseOFnodeConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFnodeConfig == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverseOFnodeConfig = getInverseOFnodeConfigPrivileged( theCtxt);
    if( someInverseOFnodeConfig == null) { return;}

      // Check for new InverseOFnodeConfig already in collection
    int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;
    for( int anIndex = 0 ; anIndex < aInverseOFnodeConfigLength ; anIndex++) {
      if( theInverseOFnodeConfig.sameAs( theCtxt, someInverseOFnodeConfig[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv aNewInverseOFnodeConfig = (com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv) theInverseOFnodeConfig;

      // Link reverse ref to this object
    aNewInverseOFnodeConfig.unsetAndSetNodeConfigPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFnodeConfig element
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverseOFnodeConfig = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverseOFnodeConfigLength + 1];
    try { System.arraycopy( someInverseOFnodeConfig, 0, otherInverseOFnodeConfig, 0, aInverseOFnodeConfigLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFnodeConfig", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFnodeConfig", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFnodeConfig", null); return;}
    otherInverseOFnodeConfig[ aInverseOFnodeConfigLength] = aNewInverseOFnodeConfig;

      // Set the new collection
    setInverseOFnodeConfigPrivileged( theCtxt, otherInverseOFnodeConfig);
  }




    /* Public ordered Write accessor for role InverseOFnodeConfig
     */
  public void addInverseOFnodeConfigBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theRelativeInverseOFnodeConfig) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFnodeConfig == null) { return;}

      // If relative InverseOFnodeConfig is null, perform normal add operation
    if( theRelativeInverseOFnodeConfig == null) {
      addInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverseOFnodeConfig = getInverseOFnodeConfigPrivileged( theCtxt);
    if( someInverseOFnodeConfig == null) { return;}


      // Get index of relative InverseOFnodeConfig
    int aRelativeIndex = indexOfInverseOFnodeConfigPR( theCtxt, theRelativeInverseOFnodeConfig);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);
    }

      // Get length of InverseOFnodeConfig array
    int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFnodeConfigLength) {
      addInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);
    }

      // Check for new InverseOFnodeConfig already in collection
    if( hasInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig)) { return;}


    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv aNewInverseOFnodeConfig = (com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv) theInverseOFnodeConfig;

      // Link reverse ref to this object
    aNewInverseOFnodeConfig.unsetAndSetNodeConfigPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFnodeConfig
      // Grow collection and add new InverseOFnodeConfig element
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverseOFnodeConfig = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverseOFnodeConfigLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFnodeConfig, 0, otherInverseOFnodeConfig, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFnodeConfig, aRelativeIndex, otherInverseOFnodeConfig, aRelativeIndex + 1, aInverseOFnodeConfigLength - aRelativeIndex);
      otherInverseOFnodeConfig[ aRelativeIndex] = aNewInverseOFnodeConfig;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFnodeConfigBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFnodeConfigBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFnodeConfigBefore", null); return;}

      // Set the new collection
    setInverseOFnodeConfigPrivileged( theCtxt, otherInverseOFnodeConfig);
  }





    /* Public Write accessor for role InverseOFnodeConfig
     */
  public void removeInverseOFnodeConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFnodeConfig == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverseOFnodeConfig = getInverseOFnodeConfigPrivileged( theCtxt);
    if( someInverseOFnodeConfig == null) { return;}

      // Check for new InverseOFnodeConfig not in collection
    int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFnodeConfigLength ; anIndex++) {
      if( theInverseOFnodeConfig.sameAs( theCtxt, someInverseOFnodeConfig[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv aNewInverseOFnodeConfig = (com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv) theInverseOFnodeConfig;

      // Unlink reverse ref from the new related object
    aNewInverseOFnodeConfig.unsetNodeConfigPrivileged( theCtxt);

      // Shrink collection removing InverseOFnodeConfig element
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverseOFnodeConfig = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverseOFnodeConfigLength - 1];
    try {
      System.arraycopy( someInverseOFnodeConfig, 0, otherInverseOFnodeConfig, 0, aFoundIndex);
      System.arraycopy( someInverseOFnodeConfig, aFoundIndex + 1, otherInverseOFnodeConfig, aFoundIndex, aInverseOFnodeConfigLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFnodeConfig", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFnodeConfig", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFnodeConfig", null); return;}

      // Set the new collection
    setInverseOFnodeConfigPrivileged( theCtxt, otherInverseOFnodeConfig);
  }




    /* Public reorder accessor for role InverseOFnodeConfig
     */
  public void moveInverseOFnodeConfigBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theRelativeInverseOFnodeConfig) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFnodeConfig == null) { return;}

      // If relative InverseOFnodeConfig is null, perform move to last position
    if( theRelativeInverseOFnodeConfig == null) {
      moveInverseOFnodeConfigToLastPR( theCtxt, theInverseOFnodeConfig);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverseOFnodeConfig = getInverseOFnodeConfigPrivileged( theCtxt);
    if( someInverseOFnodeConfig == null) { return;}

      // Get length of InverseOFnodeConfig array
    int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;

      // Get index of InverseOFnodeConfig to move
    int aToMoveIndex = indexOfInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);
      // If toMove InverseOFnodeConfig not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFnodeConfigLength) {
      moveInverseOFnodeConfigToLastPR( theCtxt, theInverseOFnodeConfig);
    }

      // Get index of relative InverseOFnodeConfig
    int aRelativeIndex = indexOfInverseOFnodeConfigPR( theCtxt, theRelativeInverseOFnodeConfig);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFnodeConfigToLastPR( theCtxt, theInverseOFnodeConfig);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFnodeConfigLength) {
      moveInverseOFnodeConfigToLastPR( theCtxt, theInverseOFnodeConfig);
    }

      // ToMove and relative InverseOFnodeConfig are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv aToMoveInverseOFnodeConfig = (com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv) theInverseOFnodeConfig;

      // Allocate new array for new version of state of relationship InverseOFnodeConfig
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverseOFnodeConfig = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverseOFnodeConfigLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFnodeConfig, 0, otherInverseOFnodeConfig, 0, aToMoveIndex );
        System.arraycopy( someInverseOFnodeConfig, aToMoveIndex + 1, otherInverseOFnodeConfig, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFnodeConfig[ aRelativeIndex - 1] = aToMoveInverseOFnodeConfig;
        System.arraycopy( someInverseOFnodeConfig, aRelativeIndex, otherInverseOFnodeConfig, aRelativeIndex, aInverseOFnodeConfigLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFnodeConfig, 0, otherInverseOFnodeConfig, 0, aRelativeIndex );
        otherInverseOFnodeConfig[ aRelativeIndex ] = aToMoveInverseOFnodeConfig;
        System.arraycopy( someInverseOFnodeConfig, aRelativeIndex, otherInverseOFnodeConfig, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFnodeConfigLength - 1) {
          System.arraycopy( someInverseOFnodeConfig, aToMoveIndex + 1, otherInverseOFnodeConfig, aToMoveIndex + 1, aInverseOFnodeConfigLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFnodeConfigBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFnodeConfigBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFnodeConfigBefore", null); return;}

      // Set the new collection
    setInverseOFnodeConfigPrivileged( theCtxt, otherInverseOFnodeConfig);
  }





    /* Public move to last accessor for role InverseOFnodeConfig
     */
  public void moveInverseOFnodeConfigToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFnodeConfig == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverseOFnodeConfig = getInverseOFnodeConfigPrivileged( theCtxt);
    if( someInverseOFnodeConfig == null) { return;}

      // Get length of InverseOFnodeConfig array
    int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;

      // Get index of InverseOFnodeConfig to move
    int aToMoveIndex = indexOfInverseOFnodeConfigPR( theCtxt, theInverseOFnodeConfig);

      // If toMove InverseOFnodeConfig not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFnodeConfigLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv aToMoveInverseOFnodeConfig = (com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv) theInverseOFnodeConfig;

      // Allocate new array for new version of state of relationship InverseOFnodeConfig
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverseOFnodeConfig = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverseOFnodeConfigLength];
    try {
      System.arraycopy( someInverseOFnodeConfig, 0, otherInverseOFnodeConfig, 0, aToMoveIndex );
      System.arraycopy( someInverseOFnodeConfig, aToMoveIndex + 1, otherInverseOFnodeConfig, aToMoveIndex, aInverseOFnodeConfigLength - aToMoveIndex - 1);
      otherInverseOFnodeConfig[ aInverseOFnodeConfigLength - 1] = aToMoveInverseOFnodeConfig;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFnodeConfigToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFnodeConfigToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFnodeConfigToLast", null); return;}

      // Set the new collection
    setInverseOFnodeConfigPrivileged( theCtxt, otherInverseOFnodeConfig);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFnodeConfig
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFnodeConfig
     */
  public void addInverseOFnodeConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv theInverseOFnodeConfig) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFnodeConfig == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverseOFnodeConfig = getInverseOFnodeConfigPrivileged( theCtxt);
    if( someInverseOFnodeConfig == null) { return;}

      // Check for new InverseOFnodeConfig already in collection
    int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;
    for( int anIndex = 0 ; anIndex < aInverseOFnodeConfigLength ; anIndex++) {
      if( theInverseOFnodeConfig.sameAs( theCtxt, someInverseOFnodeConfig[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFnodeConfig element
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverseOFnodeConfig = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverseOFnodeConfigLength + 1];
    try {
      System.arraycopy( someInverseOFnodeConfig, 0, otherInverseOFnodeConfig, 0, aInverseOFnodeConfigLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFnodeConfigPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFnodeConfigPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFnodeConfigPrivileged", null); return;}

    otherInverseOFnodeConfig[ aInverseOFnodeConfigLength] = theInverseOFnodeConfig;

      // Set the new collection
    setInverseOFnodeConfigPrivileged( theCtxt, otherInverseOFnodeConfig);
  }









    /* Privileged Write accessor for role InverseOFnodeConfig
     */
  public void removeInverseOFnodeConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv theInverseOFnodeConfig) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFnodeConfig == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] someInverseOFnodeConfig = getInverseOFnodeConfigPrivileged( theCtxt);
    if( someInverseOFnodeConfig == null) { return;}

      // Check for new InverseOFnodeConfig not in collection
    int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFnodeConfigLength ; anIndex++) {
      if( theInverseOFnodeConfig.sameAs( theCtxt, someInverseOFnodeConfig[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFnodeConfig element
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverseOFnodeConfig = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverseOFnodeConfigLength - 1];
    try {
      System.arraycopy( someInverseOFnodeConfig, 0, otherInverseOFnodeConfig, 0, aFoundIndex);
      System.arraycopy( someInverseOFnodeConfig, aFoundIndex + 1, otherInverseOFnodeConfig, aFoundIndex, aInverseOFnodeConfigLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFnodeConfigPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFnodeConfigPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFnodeConfigPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFnodeConfigPrivileged( theCtxt, otherInverseOFnodeConfig);
  }






    /* Privileged Read accessor for role InverseOFnodeConfig
     * Guaranteed to return object with same identity of the InverseOFnodeConfig
     */
  public com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] getInverseOFnodeConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFnodeConfig;
  }




    /* Set reference in role InverseOFnodeConfig
     * Used by relationship maintenance machinery
     */
  public void setInverseOFnodeConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] theInverseOFnodeConfigCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] aInverseOFnodeConfig = vrInverseOFnodeConfig;
    vrInverseOFnodeConfig = theInverseOFnodeConfigCollection;
      // Propagate change
    change( theCtxt, "InverseOFnodeConfig", aInverseOFnodeConfig, vrInverseOFnodeConfig, "vrInverseOFnodeConfig");
  }








/****************************************************************************
 *  Implementation of  internal destructor of M3NodeConfig
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 
      // When deleting : unreference attribute IsTerminal
  setIsTerminal( theCtxt, true);



 
      // When deleting : unlink related BranchConfigs
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigs( theCtxt);
    if( someBranchConfigs != null) {
      int aBranchConfigsLength = someBranchConfigs.length;
      for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aBranchConfigs = someBranchConfigs[ anIndex];
        if( aBranchConfigs != null) {
          removeBranchConfigs( theCtxt, aBranchConfigs);
        }
      }
    }
    

    // When deleting unlink related TraversalConfig
  setTraversalConfig( theCtxt, null);


      // When deleting : unlink related AttributeConfigs
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigs( theCtxt);
    if( someAttributeConfigs != null) {
      int aAttributeConfigsLength = someAttributeConfigs.length;
      for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aAttributeConfigs = someAttributeConfigs[ anIndex];
        if( aAttributeConfigs != null) {
          removeAttributeConfigs( theCtxt, aAttributeConfigs);
        }
      }
    }
    

    // When deleting unlink related MetaType
  setMetaType( theCtxt, null);


    // When deleting unlink related MetaNodeMgr
  setMetaNodeMgr( theCtxt, null);


      // When deleting : unlink related InverseOFnodeConfig
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverseOFnodeConfig = getInverseOFnodeConfig( theCtxt);
    if( someInverseOFnodeConfig != null) {
      int aInverseOFnodeConfigLength = someInverseOFnodeConfig.length;
      for( int anIndex = 0 ; anIndex < aInverseOFnodeConfigLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc aInverseOFnodeConfig = someInverseOFnodeConfig[ anIndex];
        if( aInverseOFnodeConfig != null) {
          removeInverseOFnodeConfig( theCtxt, aInverseOFnodeConfig);
        }
      }
    }



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
      vm3Type = com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.getStaticM3Type( theCtxt);
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


