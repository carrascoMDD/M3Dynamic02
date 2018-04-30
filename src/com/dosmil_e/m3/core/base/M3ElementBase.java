package com.dosmil_e.m3.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3ElementBase
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.m3.core.priv.M3ElementPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3Element metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the M3Element metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.core.priv.M3ParameterPriv[] vrParameters = new com.dosmil_e.m3.core.priv.M3ParameterPriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3CommentPriv[] vrComments = new com.dosmil_e.m3.core.priv.M3CommentPriv[0]; 






/****************************************************************************
 *  Constructors of the M3Element metamodel element
 ****************************************************************************/

  public M3ElementBase() {
    super();
  }


  public M3ElementBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3ElementBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3ElementIfc and M3ElementPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3Element
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of M3Element
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship Parameters
 ****************************************************************************/


    /* Public Read accessor for role Parameters
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ParameterIfc[] getParameters( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ParameterIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getParametersPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getParametersPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public Parameters number access
     */
  public int numParameters( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numParametersPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numParametersPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public Parameters read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ParameterIfc getParametersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ParameterIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getParametersAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getParametersAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public Parameters finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ParameterIfc findParametersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ParameterIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findParametersNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findParametersNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public Parameters is related predicate
     */
  public boolean hasParametersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasParametersNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasParametersNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional Parameters is related  predicate
     */
  public boolean hasParameters( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasParametersPR( theCtxt, theParameters);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasParametersPR( theCtxt, theParameters);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public Parameters index access
     */
  public int indexOfParameters( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfParametersPR( theCtxt, theParameters);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfParametersPR( theCtxt, theParameters);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addParameters( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addParametersPR( theCtxt, theParameters);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addParametersPR( theCtxt, theParameters);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addParametersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters, com.dosmil_e.m3.core.ifc.M3ParameterIfc theRelativeParameters) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addParametersBeforePR( theCtxt, theParameters, theRelativeParameters);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addParametersBeforePR( theCtxt, theParameters, theRelativeParameters);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role Parameters
     */
  public void removeParameters( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeParametersPR( theCtxt, theParameters);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeParametersPR( theCtxt, theParameters);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role Parameters
     */
  public void moveParametersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters, com.dosmil_e.m3.core.ifc.M3ParameterIfc theRelativeParameters) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveParametersBeforePR( theCtxt, theParameters, theRelativeParameters);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveParametersBeforePR( theCtxt, theParameters, theRelativeParameters);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role Parameters
     */
  public void moveParametersToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveParametersToLastPR( theCtxt, theParameters);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveParametersToLastPR( theCtxt, theParameters);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship Parameters
 ****************************************************************************/


    /* Public Read accessor for role Parameters
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ParameterIfc[] getParametersPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] someParameters = getParametersPrivileged( theCtxt);
    if( someParameters == null) { return null;}

    int aParametersLength = someParameters.length;
    com.dosmil_e.m3.core.ifc.M3ParameterIfc[] otherParameters = new com.dosmil_e.m3.core.ifc.M3ParameterIfc[ aParametersLength];
    try { System.arraycopy( someParameters, 0, otherParameters, 0, aParametersLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getParameters", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getParameters", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getParameters", null); return null;}


    return otherParameters;
  }



    /* Public Parameters finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ParameterIfc findParametersNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] someParameters = getParametersPrivileged( theCtxt);
    if( someParameters == null) { return null;}

      // Check for new Parameters already in collection
    int aParametersLength = someParameters.length;
    for( int anIndex = 0 ; anIndex < aParametersLength ; anIndex++) {
      com.dosmil_e.m3.core.priv.M3ParameterPriv aParameters = someParameters[ anIndex];
      if( aParameters.sameNameAs( theCtxt, theMMName)) { return aParameters;}
    }
    return null;
  }



    /* Public Parameters finder predicate by name
     */
  public boolean hasParametersNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findParametersNamedPR( theCtxt, theMMName) != null;
  }


    /* Public Parameters read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ParameterIfc getParametersAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] someParameters = getParametersPrivileged( theCtxt);
    if( someParameters == null) { return null;}

      // Get number of Parameters
    int aParametersLength = someParameters.length;

      // Verify index within array length
    if( theIndex >= aParametersLength) { return null;}

      // Get indexed Parameters
    com.dosmil_e.m3.core.ifc.M3ParameterIfc aParameters = someParameters[ theIndex];

    return aParameters;
  }



    /* Public Parameters is related predicate
     */
  public boolean hasParametersPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException {
    return indexOfParametersPR( theCtxt, theParameters) >= 0;
  }


    /* Public Parameters index access
     */
  public int indexOfParametersPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException {
      // Do not add null values to the collection
    if( theParameters == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] someParameters = getParametersPrivileged( theCtxt);
    if( someParameters == null) { return -1;}

      // Check for new Parameters already in collection
    int aParametersLength = someParameters.length;
    for( int anIndex = 0 ; anIndex < aParametersLength ; anIndex++) {
      if( someParameters[ anIndex].sameAs( theCtxt, theParameters)) { return anIndex;}
    }
    return -1;
  }


    /* Public Parameters number access
     */
  public int numParametersPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] someParameters = getParametersPrivileged( theCtxt);
    if( someParameters == null) { return 0;}

      // Check for new Parameters already in collection
    int aParametersLength = someParameters.length;
    return aParametersLength;
  }




    /* Public Write accessor for role Parameters
     */
  public void addParametersPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException {

      // Do not add null values to the collection
    if( theParameters == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3ParameterIfc[] someParameters = getParametersPrivileged( theCtxt);
    if( someParameters == null) { return;}

      // Check for new Parameters already in collection
    int aParametersLength = someParameters.length;
    for( int anIndex = 0 ; anIndex < aParametersLength ; anIndex++) {
      if( theParameters.sameAs( theCtxt, someParameters[ anIndex])) { return;}
    }

    com.dosmil_e.m3.core.priv.M3ParameterPriv aNewParameters = (com.dosmil_e.m3.core.priv.M3ParameterPriv) theParameters;

      // Link reverse ref to this object
    aNewParameters.unsetAndSetElementPrivileged( theCtxt, this);

      // Grow collection and add new Parameters element
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] otherParameters = new com.dosmil_e.m3.core.priv.M3ParameterPriv[ aParametersLength + 1];
    try { System.arraycopy( someParameters, 0, otherParameters, 0, aParametersLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addParameters", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addParameters", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addParameters", null); return;}
    otherParameters[ aParametersLength] = aNewParameters;

      // Set the new collection
    setParametersPrivileged( theCtxt, otherParameters);
  }




    /* Public ordered Write accessor for role Parameters
     */
  public void addParametersBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters, com.dosmil_e.m3.core.ifc.M3ParameterIfc theRelativeParameters) throws EAIException {

      // Do not add null values to the collection
    if( theParameters == null) { return;}

      // If relative Parameters is null, perform normal add operation
    if( theRelativeParameters == null) {
      addParametersPR( theCtxt, theParameters);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3ParameterIfc[] someParameters = getParametersPrivileged( theCtxt);
    if( someParameters == null) { return;}


      // Get index of relative Parameters
    int aRelativeIndex = indexOfParametersPR( theCtxt, theRelativeParameters);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addParametersPR( theCtxt, theParameters);
    }

      // Get length of Parameters array
    int aParametersLength = someParameters.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aParametersLength) {
      addParametersPR( theCtxt, theParameters);
    }

      // Check for new Parameters already in collection
    if( hasParametersPR( theCtxt, theParameters)) { return;}


    com.dosmil_e.m3.core.priv.M3ParameterPriv aNewParameters = (com.dosmil_e.m3.core.priv.M3ParameterPriv) theParameters;

      // Link reverse ref to this object
    aNewParameters.unsetAndSetElementPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship Parameters
      // Grow collection and add new Parameters element
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] otherParameters = new com.dosmil_e.m3.core.priv.M3ParameterPriv[ aParametersLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someParameters, 0, otherParameters, 0, aRelativeIndex );
      }
      System.arraycopy( someParameters, aRelativeIndex, otherParameters, aRelativeIndex + 1, aParametersLength - aRelativeIndex);
      otherParameters[ aRelativeIndex] = aNewParameters;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addParametersBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addParametersBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addParametersBefore", null); return;}

      // Set the new collection
    setParametersPrivileged( theCtxt, otherParameters);
  }





    /* Public Write accessor for role Parameters
     */
  public void removeParametersPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException {

      // Do not add null values to the collection
    if( theParameters == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3ParameterIfc[] someParameters = getParametersPrivileged( theCtxt);
    if( someParameters == null) { return;}

      // Check for new Parameters not in collection
    int aParametersLength = someParameters.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aParametersLength ; anIndex++) {
      if( theParameters.sameAs( theCtxt, someParameters[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.core.priv.M3ParameterPriv aNewParameters = (com.dosmil_e.m3.core.priv.M3ParameterPriv) theParameters;

      // Unlink reverse ref from the new related object
    aNewParameters.unsetElementPrivileged( theCtxt);

      // Shrink collection removing Parameters element
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] otherParameters = new com.dosmil_e.m3.core.priv.M3ParameterPriv[ aParametersLength - 1];
    try {
      System.arraycopy( someParameters, 0, otherParameters, 0, aFoundIndex);
      System.arraycopy( someParameters, aFoundIndex + 1, otherParameters, aFoundIndex, aParametersLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeParameters", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeParameters", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeParameters", null); return;}

      // Set the new collection
    setParametersPrivileged( theCtxt, otherParameters);
  }




    /* Public reorder accessor for role Parameters
     */
  public void moveParametersBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters, com.dosmil_e.m3.core.ifc.M3ParameterIfc theRelativeParameters) throws EAIException {

      // Null value is nothing to move
    if( theParameters == null) { return;}

      // If relative Parameters is null, perform move to last position
    if( theRelativeParameters == null) {
      moveParametersToLastPR( theCtxt, theParameters);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3ParameterIfc[] someParameters = getParametersPrivileged( theCtxt);
    if( someParameters == null) { return;}

      // Get length of Parameters array
    int aParametersLength = someParameters.length;

      // Get index of Parameters to move
    int aToMoveIndex = indexOfParametersPR( theCtxt, theParameters);
      // If toMove Parameters not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aParametersLength) {
      moveParametersToLastPR( theCtxt, theParameters);
    }

      // Get index of relative Parameters
    int aRelativeIndex = indexOfParametersPR( theCtxt, theRelativeParameters);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveParametersToLastPR( theCtxt, theParameters);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aParametersLength) {
      moveParametersToLastPR( theCtxt, theParameters);
    }

      // ToMove and relative Parameters are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.core.priv.M3ParameterPriv aToMoveParameters = (com.dosmil_e.m3.core.priv.M3ParameterPriv) theParameters;

      // Allocate new array for new version of state of relationship Parameters
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] otherParameters = new com.dosmil_e.m3.core.priv.M3ParameterPriv[ aParametersLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someParameters, 0, otherParameters, 0, aToMoveIndex );
        System.arraycopy( someParameters, aToMoveIndex + 1, otherParameters, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherParameters[ aRelativeIndex - 1] = aToMoveParameters;
        System.arraycopy( someParameters, aRelativeIndex, otherParameters, aRelativeIndex, aParametersLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someParameters, 0, otherParameters, 0, aRelativeIndex );
        otherParameters[ aRelativeIndex ] = aToMoveParameters;
        System.arraycopy( someParameters, aRelativeIndex, otherParameters, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aParametersLength - 1) {
          System.arraycopy( someParameters, aToMoveIndex + 1, otherParameters, aToMoveIndex + 1, aParametersLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveParametersBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveParametersBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveParametersBefore", null); return;}

      // Set the new collection
    setParametersPrivileged( theCtxt, otherParameters);
  }





    /* Public move to last accessor for role Parameters
     */
  public void moveParametersToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException {

      // Null value is nothing to move
    if( theParameters == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3ParameterIfc[] someParameters = getParametersPrivileged( theCtxt);
    if( someParameters == null) { return;}

      // Get length of Parameters array
    int aParametersLength = someParameters.length;

      // Get index of Parameters to move
    int aToMoveIndex = indexOfParametersPR( theCtxt, theParameters);

      // If toMove Parameters not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aParametersLength - 1) { return;}

    com.dosmil_e.m3.core.priv.M3ParameterPriv aToMoveParameters = (com.dosmil_e.m3.core.priv.M3ParameterPriv) theParameters;

      // Allocate new array for new version of state of relationship Parameters
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] otherParameters = new com.dosmil_e.m3.core.priv.M3ParameterPriv[ aParametersLength];
    try {
      System.arraycopy( someParameters, 0, otherParameters, 0, aToMoveIndex );
      System.arraycopy( someParameters, aToMoveIndex + 1, otherParameters, aToMoveIndex, aParametersLength - aToMoveIndex - 1);
      otherParameters[ aParametersLength - 1] = aToMoveParameters;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveParametersToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveParametersToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveParametersToLast", null); return;}

      // Set the new collection
    setParametersPrivileged( theCtxt, otherParameters);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship Parameters
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role Parameters
     */
  public void addParametersPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ParameterPriv theParameters) throws EAIException {

      // Do not add null values to the collection
    if( theParameters == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3ParameterIfc[] someParameters = getParametersPrivileged( theCtxt);
    if( someParameters == null) { return;}

      // Check for new Parameters already in collection
    int aParametersLength = someParameters.length;
    for( int anIndex = 0 ; anIndex < aParametersLength ; anIndex++) {
      if( theParameters.sameAs( theCtxt, someParameters[ anIndex])) { return;}
    }

      // Grow collection and add new Parameters element
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] otherParameters = new com.dosmil_e.m3.core.priv.M3ParameterPriv[ aParametersLength + 1];
    try {
      System.arraycopy( someParameters, 0, otherParameters, 0, aParametersLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addParametersPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addParametersPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addParametersPrivileged", null); return;}

    otherParameters[ aParametersLength] = theParameters;

      // Set the new collection
    setParametersPrivileged( theCtxt, otherParameters);
  }









    /* Privileged Write accessor for role Parameters
     */
  public void removeParametersPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ParameterPriv theParameters) throws EAIException {

      // Do not add null values to the collection
    if( theParameters == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] someParameters = getParametersPrivileged( theCtxt);
    if( someParameters == null) { return;}

      // Check for new Parameters not in collection
    int aParametersLength = someParameters.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aParametersLength ; anIndex++) {
      if( theParameters.sameAs( theCtxt, someParameters[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing Parameters element
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] otherParameters = new com.dosmil_e.m3.core.priv.M3ParameterPriv[ aParametersLength - 1];
    try {
      System.arraycopy( someParameters, 0, otherParameters, 0, aFoundIndex);
      System.arraycopy( someParameters, aFoundIndex + 1, otherParameters, aFoundIndex, aParametersLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeParametersPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3ParameterPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeParametersPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3ParameterPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeParametersPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3ParameterPriv.class}); return;}

      // Set the new collection
    setParametersPrivileged( theCtxt, otherParameters);
  }






    /* Privileged Read accessor for role Parameters
     * Guaranteed to return object with same identity of the Parameters
     */
  public com.dosmil_e.m3.core.priv.M3ParameterPriv[] getParametersPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrParameters;
  }




    /* Set reference in role Parameters
     * Used by relationship maintenance machinery
     */
  public void setParametersPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ParameterPriv[] theParametersCollection) throws EAIException {
    com.dosmil_e.m3.core.priv.M3ParameterPriv[] aParameters = vrParameters;
    vrParameters = theParametersCollection;
      // Propagate change
    change( theCtxt, "Parameters", aParameters, vrParameters, "vrParameters");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship Comments
 ****************************************************************************/


    /* Public Read accessor for role Comments
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3CommentIfc[] getComments( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3CommentIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getCommentsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getCommentsPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public Comments number access
     */
  public int numComments( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numCommentsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numCommentsPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public Comments read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3CommentIfc getCommentsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3CommentIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getCommentsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getCommentsAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public Comments finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3CommentIfc findCommentsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3CommentIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findCommentsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findCommentsNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public Comments is related predicate
     */
  public boolean hasCommentsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasCommentsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasCommentsNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional Comments is related  predicate
     */
  public boolean hasComments( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasCommentsPR( theCtxt, theComments);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasCommentsPR( theCtxt, theComments);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public Comments index access
     */
  public int indexOfComments( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfCommentsPR( theCtxt, theComments);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfCommentsPR( theCtxt, theComments);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addComments( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addCommentsPR( theCtxt, theComments);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addCommentsPR( theCtxt, theComments);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addCommentsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments, com.dosmil_e.m3.core.ifc.M3CommentIfc theRelativeComments) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addCommentsBeforePR( theCtxt, theComments, theRelativeComments);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addCommentsBeforePR( theCtxt, theComments, theRelativeComments);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role Comments
     */
  public void removeComments( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeCommentsPR( theCtxt, theComments);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeCommentsPR( theCtxt, theComments);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role Comments
     */
  public void moveCommentsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments, com.dosmil_e.m3.core.ifc.M3CommentIfc theRelativeComments) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveCommentsBeforePR( theCtxt, theComments, theRelativeComments);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveCommentsBeforePR( theCtxt, theComments, theRelativeComments);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role Comments
     */
  public void moveCommentsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveCommentsToLastPR( theCtxt, theComments);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveCommentsToLastPR( theCtxt, theComments);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship Comments
 ****************************************************************************/


    /* Public Read accessor for role Comments
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3CommentIfc[] getCommentsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.priv.M3CommentPriv[] someComments = getCommentsPrivileged( theCtxt);
    if( someComments == null) { return null;}

    int aCommentsLength = someComments.length;
    com.dosmil_e.m3.core.ifc.M3CommentIfc[] otherComments = new com.dosmil_e.m3.core.ifc.M3CommentIfc[ aCommentsLength];
    try { System.arraycopy( someComments, 0, otherComments, 0, aCommentsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getComments", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getComments", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getComments", null); return null;}


    return otherComments;
  }



    /* Public Comments finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3CommentIfc findCommentsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3CommentPriv[] someComments = getCommentsPrivileged( theCtxt);
    if( someComments == null) { return null;}

      // Check for new Comments already in collection
    int aCommentsLength = someComments.length;
    for( int anIndex = 0 ; anIndex < aCommentsLength ; anIndex++) {
      com.dosmil_e.m3.core.priv.M3CommentPriv aComments = someComments[ anIndex];
      if( aComments.sameNameAs( theCtxt, theMMName)) { return aComments;}
    }
    return null;
  }



    /* Public Comments finder predicate by name
     */
  public boolean hasCommentsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findCommentsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public Comments read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3CommentIfc getCommentsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3CommentPriv[] someComments = getCommentsPrivileged( theCtxt);
    if( someComments == null) { return null;}

      // Get number of Comments
    int aCommentsLength = someComments.length;

      // Verify index within array length
    if( theIndex >= aCommentsLength) { return null;}

      // Get indexed Comments
    com.dosmil_e.m3.core.ifc.M3CommentIfc aComments = someComments[ theIndex];

    return aComments;
  }



    /* Public Comments is related predicate
     */
  public boolean hasCommentsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException {
    return indexOfCommentsPR( theCtxt, theComments) >= 0;
  }


    /* Public Comments index access
     */
  public int indexOfCommentsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException {
      // Do not add null values to the collection
    if( theComments == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3CommentPriv[] someComments = getCommentsPrivileged( theCtxt);
    if( someComments == null) { return -1;}

      // Check for new Comments already in collection
    int aCommentsLength = someComments.length;
    for( int anIndex = 0 ; anIndex < aCommentsLength ; anIndex++) {
      if( someComments[ anIndex].sameAs( theCtxt, theComments)) { return anIndex;}
    }
    return -1;
  }


    /* Public Comments number access
     */
  public int numCommentsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.core.priv.M3CommentPriv[] someComments = getCommentsPrivileged( theCtxt);
    if( someComments == null) { return 0;}

      // Check for new Comments already in collection
    int aCommentsLength = someComments.length;
    return aCommentsLength;
  }




    /* Public Write accessor for role Comments
     */
  public void addCommentsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException {

      // Do not add null values to the collection
    if( theComments == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3CommentIfc[] someComments = getCommentsPrivileged( theCtxt);
    if( someComments == null) { return;}

      // Check for new Comments already in collection
    int aCommentsLength = someComments.length;
    for( int anIndex = 0 ; anIndex < aCommentsLength ; anIndex++) {
      if( theComments.sameAs( theCtxt, someComments[ anIndex])) { return;}
    }

    com.dosmil_e.m3.core.priv.M3CommentPriv aNewComments = (com.dosmil_e.m3.core.priv.M3CommentPriv) theComments;

      // Link reverse ref to this object
    aNewComments.unsetAndSetElementPrivileged( theCtxt, this);

      // Grow collection and add new Comments element
    com.dosmil_e.m3.core.priv.M3CommentPriv[] otherComments = new com.dosmil_e.m3.core.priv.M3CommentPriv[ aCommentsLength + 1];
    try { System.arraycopy( someComments, 0, otherComments, 0, aCommentsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addComments", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addComments", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addComments", null); return;}
    otherComments[ aCommentsLength] = aNewComments;

      // Set the new collection
    setCommentsPrivileged( theCtxt, otherComments);
  }




    /* Public ordered Write accessor for role Comments
     */
  public void addCommentsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments, com.dosmil_e.m3.core.ifc.M3CommentIfc theRelativeComments) throws EAIException {

      // Do not add null values to the collection
    if( theComments == null) { return;}

      // If relative Comments is null, perform normal add operation
    if( theRelativeComments == null) {
      addCommentsPR( theCtxt, theComments);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3CommentIfc[] someComments = getCommentsPrivileged( theCtxt);
    if( someComments == null) { return;}


      // Get index of relative Comments
    int aRelativeIndex = indexOfCommentsPR( theCtxt, theRelativeComments);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addCommentsPR( theCtxt, theComments);
    }

      // Get length of Comments array
    int aCommentsLength = someComments.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aCommentsLength) {
      addCommentsPR( theCtxt, theComments);
    }

      // Check for new Comments already in collection
    if( hasCommentsPR( theCtxt, theComments)) { return;}


    com.dosmil_e.m3.core.priv.M3CommentPriv aNewComments = (com.dosmil_e.m3.core.priv.M3CommentPriv) theComments;

      // Link reverse ref to this object
    aNewComments.unsetAndSetElementPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship Comments
      // Grow collection and add new Comments element
    com.dosmil_e.m3.core.priv.M3CommentPriv[] otherComments = new com.dosmil_e.m3.core.priv.M3CommentPriv[ aCommentsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someComments, 0, otherComments, 0, aRelativeIndex );
      }
      System.arraycopy( someComments, aRelativeIndex, otherComments, aRelativeIndex + 1, aCommentsLength - aRelativeIndex);
      otherComments[ aRelativeIndex] = aNewComments;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addCommentsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addCommentsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addCommentsBefore", null); return;}

      // Set the new collection
    setCommentsPrivileged( theCtxt, otherComments);
  }





    /* Public Write accessor for role Comments
     */
  public void removeCommentsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException {

      // Do not add null values to the collection
    if( theComments == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3CommentIfc[] someComments = getCommentsPrivileged( theCtxt);
    if( someComments == null) { return;}

      // Check for new Comments not in collection
    int aCommentsLength = someComments.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aCommentsLength ; anIndex++) {
      if( theComments.sameAs( theCtxt, someComments[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.core.priv.M3CommentPriv aNewComments = (com.dosmil_e.m3.core.priv.M3CommentPriv) theComments;

      // Unlink reverse ref from the new related object
    aNewComments.unsetElementPrivileged( theCtxt);

      // Shrink collection removing Comments element
    com.dosmil_e.m3.core.priv.M3CommentPriv[] otherComments = new com.dosmil_e.m3.core.priv.M3CommentPriv[ aCommentsLength - 1];
    try {
      System.arraycopy( someComments, 0, otherComments, 0, aFoundIndex);
      System.arraycopy( someComments, aFoundIndex + 1, otherComments, aFoundIndex, aCommentsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeComments", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeComments", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeComments", null); return;}

      // Set the new collection
    setCommentsPrivileged( theCtxt, otherComments);
  }




    /* Public reorder accessor for role Comments
     */
  public void moveCommentsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments, com.dosmil_e.m3.core.ifc.M3CommentIfc theRelativeComments) throws EAIException {

      // Null value is nothing to move
    if( theComments == null) { return;}

      // If relative Comments is null, perform move to last position
    if( theRelativeComments == null) {
      moveCommentsToLastPR( theCtxt, theComments);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3CommentIfc[] someComments = getCommentsPrivileged( theCtxt);
    if( someComments == null) { return;}

      // Get length of Comments array
    int aCommentsLength = someComments.length;

      // Get index of Comments to move
    int aToMoveIndex = indexOfCommentsPR( theCtxt, theComments);
      // If toMove Comments not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aCommentsLength) {
      moveCommentsToLastPR( theCtxt, theComments);
    }

      // Get index of relative Comments
    int aRelativeIndex = indexOfCommentsPR( theCtxt, theRelativeComments);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveCommentsToLastPR( theCtxt, theComments);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aCommentsLength) {
      moveCommentsToLastPR( theCtxt, theComments);
    }

      // ToMove and relative Comments are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.core.priv.M3CommentPriv aToMoveComments = (com.dosmil_e.m3.core.priv.M3CommentPriv) theComments;

      // Allocate new array for new version of state of relationship Comments
    com.dosmil_e.m3.core.priv.M3CommentPriv[] otherComments = new com.dosmil_e.m3.core.priv.M3CommentPriv[ aCommentsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someComments, 0, otherComments, 0, aToMoveIndex );
        System.arraycopy( someComments, aToMoveIndex + 1, otherComments, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherComments[ aRelativeIndex - 1] = aToMoveComments;
        System.arraycopy( someComments, aRelativeIndex, otherComments, aRelativeIndex, aCommentsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someComments, 0, otherComments, 0, aRelativeIndex );
        otherComments[ aRelativeIndex ] = aToMoveComments;
        System.arraycopy( someComments, aRelativeIndex, otherComments, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aCommentsLength - 1) {
          System.arraycopy( someComments, aToMoveIndex + 1, otherComments, aToMoveIndex + 1, aCommentsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveCommentsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveCommentsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveCommentsBefore", null); return;}

      // Set the new collection
    setCommentsPrivileged( theCtxt, otherComments);
  }





    /* Public move to last accessor for role Comments
     */
  public void moveCommentsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException {

      // Null value is nothing to move
    if( theComments == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3CommentIfc[] someComments = getCommentsPrivileged( theCtxt);
    if( someComments == null) { return;}

      // Get length of Comments array
    int aCommentsLength = someComments.length;

      // Get index of Comments to move
    int aToMoveIndex = indexOfCommentsPR( theCtxt, theComments);

      // If toMove Comments not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aCommentsLength - 1) { return;}

    com.dosmil_e.m3.core.priv.M3CommentPriv aToMoveComments = (com.dosmil_e.m3.core.priv.M3CommentPriv) theComments;

      // Allocate new array for new version of state of relationship Comments
    com.dosmil_e.m3.core.priv.M3CommentPriv[] otherComments = new com.dosmil_e.m3.core.priv.M3CommentPriv[ aCommentsLength];
    try {
      System.arraycopy( someComments, 0, otherComments, 0, aToMoveIndex );
      System.arraycopy( someComments, aToMoveIndex + 1, otherComments, aToMoveIndex, aCommentsLength - aToMoveIndex - 1);
      otherComments[ aCommentsLength - 1] = aToMoveComments;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveCommentsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveCommentsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveCommentsToLast", null); return;}

      // Set the new collection
    setCommentsPrivileged( theCtxt, otherComments);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship Comments
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role Comments
     */
  public void addCommentsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3CommentPriv theComments) throws EAIException {

      // Do not add null values to the collection
    if( theComments == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3CommentIfc[] someComments = getCommentsPrivileged( theCtxt);
    if( someComments == null) { return;}

      // Check for new Comments already in collection
    int aCommentsLength = someComments.length;
    for( int anIndex = 0 ; anIndex < aCommentsLength ; anIndex++) {
      if( theComments.sameAs( theCtxt, someComments[ anIndex])) { return;}
    }

      // Grow collection and add new Comments element
    com.dosmil_e.m3.core.priv.M3CommentPriv[] otherComments = new com.dosmil_e.m3.core.priv.M3CommentPriv[ aCommentsLength + 1];
    try {
      System.arraycopy( someComments, 0, otherComments, 0, aCommentsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addCommentsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addCommentsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addCommentsPrivileged", null); return;}

    otherComments[ aCommentsLength] = theComments;

      // Set the new collection
    setCommentsPrivileged( theCtxt, otherComments);
  }









    /* Privileged Write accessor for role Comments
     */
  public void removeCommentsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3CommentPriv theComments) throws EAIException {

      // Do not add null values to the collection
    if( theComments == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3CommentPriv[] someComments = getCommentsPrivileged( theCtxt);
    if( someComments == null) { return;}

      // Check for new Comments not in collection
    int aCommentsLength = someComments.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aCommentsLength ; anIndex++) {
      if( theComments.sameAs( theCtxt, someComments[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing Comments element
    com.dosmil_e.m3.core.priv.M3CommentPriv[] otherComments = new com.dosmil_e.m3.core.priv.M3CommentPriv[ aCommentsLength - 1];
    try {
      System.arraycopy( someComments, 0, otherComments, 0, aFoundIndex);
      System.arraycopy( someComments, aFoundIndex + 1, otherComments, aFoundIndex, aCommentsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeCommentsPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3CommentPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeCommentsPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3CommentPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeCommentsPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3CommentPriv.class}); return;}

      // Set the new collection
    setCommentsPrivileged( theCtxt, otherComments);
  }






    /* Privileged Read accessor for role Comments
     * Guaranteed to return object with same identity of the Comments
     */
  public com.dosmil_e.m3.core.priv.M3CommentPriv[] getCommentsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrComments;
  }




    /* Set reference in role Comments
     * Used by relationship maintenance machinery
     */
  public void setCommentsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3CommentPriv[] theCommentsCollection) throws EAIException {
    com.dosmil_e.m3.core.priv.M3CommentPriv[] aComments = vrComments;
    vrComments = theCommentsCollection;
      // Propagate change
    change( theCtxt, "Comments", aComments, vrComments, "vrComments");
  }








/****************************************************************************
 *  Implementation of  internal destructor of M3Element
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 

 
      // When deleting : delete related Parameters
    com.dosmil_e.m3.core.ifc.M3ParameterIfc[] someParameters = getParameters( theCtxt);
    if( someParameters != null) {
      int aParametersLength = someParameters.length;
      for( int anIndex = 0 ; anIndex < aParametersLength ; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3ParameterIfc aParameters = someParameters[ anIndex];
        if( aParameters != null) {
          com.dosmil_e.m3.core.impl.M3ParameterImpl aParametersImpl = null;
          try { aParametersImpl = (com.dosmil_e.m3.core.impl.M3ParameterImpl) aParameters;} catch( ClassCastException anEx) {}
          if( aParametersImpl != null) {
            aParametersImpl.delete( theCtxt);
          }
        }
      }
    }
    

      // When deleting : delete related Comments
    com.dosmil_e.m3.core.ifc.M3CommentIfc[] someComments = getComments( theCtxt);
    if( someComments != null) {
      int aCommentsLength = someComments.length;
      for( int anIndex = 0 ; anIndex < aCommentsLength ; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3CommentIfc aComments = someComments[ anIndex];
        if( aComments != null) {
          com.dosmil_e.m3.core.impl.M3CommentImpl aCommentsImpl = null;
          try { aCommentsImpl = (com.dosmil_e.m3.core.impl.M3CommentImpl) aComments;} catch( ClassCastException anEx) {}
          if( aCommentsImpl != null) {
            aCommentsImpl.delete( theCtxt);
          }
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
      vm3Type = com.dosmil_e.m3.core.meta.M3ElementMeta.getStaticM3Type( theCtxt);
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


