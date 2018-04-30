package com.dosmil_e.m3.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3TypeBase
   extends com.dosmil_e.m3.core.impl.M3ElementImpl
    implements com.dosmil_e.m3.core.priv.M3TypePriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3Type metamodel element
 ****************************************************************************/
	protected boolean vaIsEnumeration;

	protected boolean vaIsPrimitive;

	protected boolean vaIsAbstract;




/****************************************************************************
 *  State storage for the Relationships of the M3Type metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] vrInverseOFmetaType = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] vrInverse1OFmetaType = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[0]; 

	protected com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] vrInverseOFreplicatedMetaType = new com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[0]; 

	protected com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] vrInverseOFprojectionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[0]; 

	protected com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] vrInverseOFexclusionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3ModulePriv vrModule; 

	protected com.dosmil_e.m3.core.priv.M3AttributePriv[] vrAttributes = new com.dosmil_e.m3.core.priv.M3AttributePriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3AttributePriv[] vrTypeOfValues = new com.dosmil_e.m3.core.priv.M3AttributePriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3TypePriv[] vrSuperTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3TypePriv[] vrSubTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3RelationshipPriv[] vrRelationships = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3RelationshipPriv[] vrRelatedWith = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3ModelPriv vrRootTypeOfModel; 






/****************************************************************************
 *  Constructors of the M3Type metamodel element
 ****************************************************************************/

  public M3TypeBase() {
    super();
  }


  public M3TypeBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3TypeBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3TypeIfc and M3TypePriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3Type
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE IsEnumeration
 ****************************************************************************/


    /* Public Read accessor for attribute IsEnumeration
     */
  public boolean getIsEnumeration( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    boolean aResult = true;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getIsEnumerationPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getIsEnumerationPR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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






    /* Transactional Public Write accessor for attribute IsEnumeration
     */
  public void setIsEnumeration( EAIMMCtxtIfc theCtxt, boolean theIsEnumeration) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setIsEnumerationPR( theCtxt,  theIsEnumeration);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setIsEnumerationPR( theCtxt, theIsEnumeration);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute IsEnumeration
 ****************************************************************************/


    /* Public Read accessor for attribute IsEnumeration
     */
  public boolean getIsEnumerationPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaIsEnumeration;
  }



    /* Public Write accessor for attribute IsEnumeration
     */
  public void setIsEnumerationPR( EAIMMCtxtIfc theCtxt, boolean theIsEnumeration) throws EAIException {

      // Get current value
    boolean aIsEnumeration = getIsEnumerationPR( theCtxt);
      // Check for new IsEnumeration same as current one
    if( toObject( aIsEnumeration) != null && toObject( aIsEnumeration).equals( toObject( theIsEnumeration))) { return;}

    vaIsEnumeration = theIsEnumeration;
    change( theCtxt, "IsEnumeration", toObject( aIsEnumeration), toObject( vaIsEnumeration), "vaIsEnumeration");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE IsPrimitive
 ****************************************************************************/


    /* Public Read accessor for attribute IsPrimitive
     */
  public boolean getIsPrimitive( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    boolean aResult = true;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getIsPrimitivePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getIsPrimitivePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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






    /* Transactional Public Write accessor for attribute IsPrimitive
     */
  public void setIsPrimitive( EAIMMCtxtIfc theCtxt, boolean theIsPrimitive) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setIsPrimitivePR( theCtxt,  theIsPrimitive);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setIsPrimitivePR( theCtxt, theIsPrimitive);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute IsPrimitive
 ****************************************************************************/


    /* Public Read accessor for attribute IsPrimitive
     */
  public boolean getIsPrimitivePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaIsPrimitive;
  }



    /* Public Write accessor for attribute IsPrimitive
     */
  public void setIsPrimitivePR( EAIMMCtxtIfc theCtxt, boolean theIsPrimitive) throws EAIException {

      // Get current value
    boolean aIsPrimitive = getIsPrimitivePR( theCtxt);
      // Check for new IsPrimitive same as current one
    if( toObject( aIsPrimitive) != null && toObject( aIsPrimitive).equals( toObject( theIsPrimitive))) { return;}

    vaIsPrimitive = theIsPrimitive;
    change( theCtxt, "IsPrimitive", toObject( aIsPrimitive), toObject( vaIsPrimitive), "vaIsPrimitive");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE IsAbstract
 ****************************************************************************/


    /* Public Read accessor for attribute IsAbstract
     */
  public boolean getIsAbstract( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    boolean aResult = true;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getIsAbstractPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getIsAbstractPR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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






    /* Transactional Public Write accessor for attribute IsAbstract
     */
  public void setIsAbstract( EAIMMCtxtIfc theCtxt, boolean theIsAbstract) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setIsAbstractPR( theCtxt,  theIsAbstract);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setIsAbstractPR( theCtxt, theIsAbstract);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute IsAbstract
 ****************************************************************************/


    /* Public Read accessor for attribute IsAbstract
     */
  public boolean getIsAbstractPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaIsAbstract;
  }



    /* Public Write accessor for attribute IsAbstract
     */
  public void setIsAbstractPR( EAIMMCtxtIfc theCtxt, boolean theIsAbstract) throws EAIException {

      // Get current value
    boolean aIsAbstract = getIsAbstractPR( theCtxt);
      // Check for new IsAbstract same as current one
    if( toObject( aIsAbstract) != null && toObject( aIsAbstract).equals( toObject( theIsAbstract))) { return;}

    vaIsAbstract = theIsAbstract;
    change( theCtxt, "IsAbstract", toObject( aIsAbstract), toObject( vaIsAbstract), "vaIsAbstract");
  }









/****************************************************************************
 *  Implementation of relationships of M3Type
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFmetaType
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFmetaType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFmetaTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFmetaTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public InverseOFmetaType number access
     */
  public int numInverseOFmetaType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFmetaTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFmetaTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public InverseOFmetaType read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getInverseOFmetaTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFmetaTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFmetaTypeAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public InverseOFmetaType finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findInverseOFmetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFmetaTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFmetaTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public InverseOFmetaType is related predicate
     */
  public boolean hasInverseOFmetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFmetaTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFmetaTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional InverseOFmetaType is related  predicate
     */
  public boolean hasInverseOFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public InverseOFmetaType index access
     */
  public int indexOfInverseOFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFmetaTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFmetaTypeBeforePR( theCtxt, theInverseOFmetaType, theRelativeInverseOFmetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFmetaTypeBeforePR( theCtxt, theInverseOFmetaType, theRelativeInverseOFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role InverseOFmetaType
     */
  public void removeInverseOFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFmetaType
     */
  public void moveInverseOFmetaTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFmetaTypeBeforePR( theCtxt, theInverseOFmetaType, theRelativeInverseOFmetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFmetaTypeBeforePR( theCtxt, theInverseOFmetaType, theRelativeInverseOFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFmetaType
     */
  public void moveInverseOFmetaTypeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFmetaTypeToLastPR( theCtxt, theInverseOFmetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFmetaTypeToLastPR( theCtxt, theInverseOFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship InverseOFmetaType
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFmetaTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFmetaType = getInverseOFmetaTypePrivileged( theCtxt);
    if( someInverseOFmetaType == null) { return null;}

    int aInverseOFmetaTypeLength = someInverseOFmetaType.length;
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] otherInverseOFmetaType = new com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[ aInverseOFmetaTypeLength];
    try { System.arraycopy( someInverseOFmetaType, 0, otherInverseOFmetaType, 0, aInverseOFmetaTypeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaType", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaType", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaType", null); return null;}


    return otherInverseOFmetaType;
  }



    /* Public InverseOFmetaType finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findInverseOFmetaTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFmetaType = getInverseOFmetaTypePrivileged( theCtxt);
    if( someInverseOFmetaType == null) { return null;}

      // Check for new InverseOFmetaType already in collection
    int aInverseOFmetaTypeLength = someInverseOFmetaType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaTypeLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aInverseOFmetaType = someInverseOFmetaType[ anIndex];
      if( aInverseOFmetaType.sameNameAs( theCtxt, theMMName)) { return aInverseOFmetaType;}
    }
    return null;
  }



    /* Public InverseOFmetaType finder predicate by name
     */
  public boolean hasInverseOFmetaTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFmetaTypeNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFmetaType read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getInverseOFmetaTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFmetaType = getInverseOFmetaTypePrivileged( theCtxt);
    if( someInverseOFmetaType == null) { return null;}

      // Get number of InverseOFmetaType
    int aInverseOFmetaTypeLength = someInverseOFmetaType.length;

      // Verify index within array length
    if( theIndex >= aInverseOFmetaTypeLength) { return null;}

      // Get indexed InverseOFmetaType
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aInverseOFmetaType = someInverseOFmetaType[ theIndex];

    return aInverseOFmetaType;
  }



    /* Public InverseOFmetaType is related predicate
     */
  public boolean hasInverseOFmetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException {
    return indexOfInverseOFmetaTypePR( theCtxt, theInverseOFmetaType) >= 0;
  }


    /* Public InverseOFmetaType index access
     */
  public int indexOfInverseOFmetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFmetaType == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFmetaType = getInverseOFmetaTypePrivileged( theCtxt);
    if( someInverseOFmetaType == null) { return -1;}

      // Check for new InverseOFmetaType already in collection
    int aInverseOFmetaTypeLength = someInverseOFmetaType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaTypeLength ; anIndex++) {
      if( someInverseOFmetaType[ anIndex].sameAs( theCtxt, theInverseOFmetaType)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFmetaType number access
     */
  public int numInverseOFmetaTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFmetaType = getInverseOFmetaTypePrivileged( theCtxt);
    if( someInverseOFmetaType == null) { return 0;}

      // Check for new InverseOFmetaType already in collection
    int aInverseOFmetaTypeLength = someInverseOFmetaType.length;
    return aInverseOFmetaTypeLength;
  }




    /* Public Write accessor for role InverseOFmetaType
     */
  public void addInverseOFmetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaType = getInverseOFmetaTypePrivileged( theCtxt);
    if( someInverseOFmetaType == null) { return;}

      // Check for new InverseOFmetaType already in collection
    int aInverseOFmetaTypeLength = someInverseOFmetaType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaTypeLength ; anIndex++) {
      if( theInverseOFmetaType.sameAs( theCtxt, someInverseOFmetaType[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewInverseOFmetaType = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFmetaType;

      // Link reverse ref to this object
    aNewInverseOFmetaType.unsetAndSetMetaTypePrivileged( theCtxt, this);

      // Grow collection and add new InverseOFmetaType element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaType = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaTypeLength + 1];
    try { System.arraycopy( someInverseOFmetaType, 0, otherInverseOFmetaType, 0, aInverseOFmetaTypeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaType", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaType", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaType", null); return;}
    otherInverseOFmetaType[ aInverseOFmetaTypeLength] = aNewInverseOFmetaType;

      // Set the new collection
    setInverseOFmetaTypePrivileged( theCtxt, otherInverseOFmetaType);
  }




    /* Public ordered Write accessor for role InverseOFmetaType
     */
  public void addInverseOFmetaTypeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFmetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaType == null) { return;}

      // If relative InverseOFmetaType is null, perform normal add operation
    if( theRelativeInverseOFmetaType == null) {
      addInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaType = getInverseOFmetaTypePrivileged( theCtxt);
    if( someInverseOFmetaType == null) { return;}


      // Get index of relative InverseOFmetaType
    int aRelativeIndex = indexOfInverseOFmetaTypePR( theCtxt, theRelativeInverseOFmetaType);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);
    }

      // Get length of InverseOFmetaType array
    int aInverseOFmetaTypeLength = someInverseOFmetaType.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFmetaTypeLength) {
      addInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);
    }

      // Check for new InverseOFmetaType already in collection
    if( hasInverseOFmetaTypePR( theCtxt, theInverseOFmetaType)) { return;}


    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewInverseOFmetaType = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFmetaType;

      // Link reverse ref to this object
    aNewInverseOFmetaType.unsetAndSetMetaTypePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFmetaType
      // Grow collection and add new InverseOFmetaType element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaType = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaTypeLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFmetaType, 0, otherInverseOFmetaType, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFmetaType, aRelativeIndex, otherInverseOFmetaType, aRelativeIndex + 1, aInverseOFmetaTypeLength - aRelativeIndex);
      otherInverseOFmetaType[ aRelativeIndex] = aNewInverseOFmetaType;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaTypeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaTypeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaTypeBefore", null); return;}

      // Set the new collection
    setInverseOFmetaTypePrivileged( theCtxt, otherInverseOFmetaType);
  }





    /* Public Write accessor for role InverseOFmetaType
     */
  public void removeInverseOFmetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaType = getInverseOFmetaTypePrivileged( theCtxt);
    if( someInverseOFmetaType == null) { return;}

      // Check for new InverseOFmetaType not in collection
    int aInverseOFmetaTypeLength = someInverseOFmetaType.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaTypeLength ; anIndex++) {
      if( theInverseOFmetaType.sameAs( theCtxt, someInverseOFmetaType[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewInverseOFmetaType = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFmetaType;

      // Unlink reverse ref from the new related object
    aNewInverseOFmetaType.unsetMetaTypePrivileged( theCtxt);

      // Shrink collection removing InverseOFmetaType element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaType = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaTypeLength - 1];
    try {
      System.arraycopy( someInverseOFmetaType, 0, otherInverseOFmetaType, 0, aFoundIndex);
      System.arraycopy( someInverseOFmetaType, aFoundIndex + 1, otherInverseOFmetaType, aFoundIndex, aInverseOFmetaTypeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaType", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaType", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaType", null); return;}

      // Set the new collection
    setInverseOFmetaTypePrivileged( theCtxt, otherInverseOFmetaType);
  }




    /* Public reorder accessor for role InverseOFmetaType
     */
  public void moveInverseOFmetaTypeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFmetaType) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFmetaType == null) { return;}

      // If relative InverseOFmetaType is null, perform move to last position
    if( theRelativeInverseOFmetaType == null) {
      moveInverseOFmetaTypeToLastPR( theCtxt, theInverseOFmetaType);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaType = getInverseOFmetaTypePrivileged( theCtxt);
    if( someInverseOFmetaType == null) { return;}

      // Get length of InverseOFmetaType array
    int aInverseOFmetaTypeLength = someInverseOFmetaType.length;

      // Get index of InverseOFmetaType to move
    int aToMoveIndex = indexOfInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);
      // If toMove InverseOFmetaType not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFmetaTypeLength) {
      moveInverseOFmetaTypeToLastPR( theCtxt, theInverseOFmetaType);
    }

      // Get index of relative InverseOFmetaType
    int aRelativeIndex = indexOfInverseOFmetaTypePR( theCtxt, theRelativeInverseOFmetaType);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFmetaTypeToLastPR( theCtxt, theInverseOFmetaType);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFmetaTypeLength) {
      moveInverseOFmetaTypeToLastPR( theCtxt, theInverseOFmetaType);
    }

      // ToMove and relative InverseOFmetaType are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aToMoveInverseOFmetaType = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFmetaType;

      // Allocate new array for new version of state of relationship InverseOFmetaType
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaType = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaTypeLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFmetaType, 0, otherInverseOFmetaType, 0, aToMoveIndex );
        System.arraycopy( someInverseOFmetaType, aToMoveIndex + 1, otherInverseOFmetaType, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFmetaType[ aRelativeIndex - 1] = aToMoveInverseOFmetaType;
        System.arraycopy( someInverseOFmetaType, aRelativeIndex, otherInverseOFmetaType, aRelativeIndex, aInverseOFmetaTypeLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFmetaType, 0, otherInverseOFmetaType, 0, aRelativeIndex );
        otherInverseOFmetaType[ aRelativeIndex ] = aToMoveInverseOFmetaType;
        System.arraycopy( someInverseOFmetaType, aRelativeIndex, otherInverseOFmetaType, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFmetaTypeLength - 1) {
          System.arraycopy( someInverseOFmetaType, aToMoveIndex + 1, otherInverseOFmetaType, aToMoveIndex + 1, aInverseOFmetaTypeLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaTypeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaTypeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaTypeBefore", null); return;}

      // Set the new collection
    setInverseOFmetaTypePrivileged( theCtxt, otherInverseOFmetaType);
  }





    /* Public move to last accessor for role InverseOFmetaType
     */
  public void moveInverseOFmetaTypeToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFmetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaType = getInverseOFmetaTypePrivileged( theCtxt);
    if( someInverseOFmetaType == null) { return;}

      // Get length of InverseOFmetaType array
    int aInverseOFmetaTypeLength = someInverseOFmetaType.length;

      // Get index of InverseOFmetaType to move
    int aToMoveIndex = indexOfInverseOFmetaTypePR( theCtxt, theInverseOFmetaType);

      // If toMove InverseOFmetaType not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFmetaTypeLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aToMoveInverseOFmetaType = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFmetaType;

      // Allocate new array for new version of state of relationship InverseOFmetaType
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaType = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaTypeLength];
    try {
      System.arraycopy( someInverseOFmetaType, 0, otherInverseOFmetaType, 0, aToMoveIndex );
      System.arraycopy( someInverseOFmetaType, aToMoveIndex + 1, otherInverseOFmetaType, aToMoveIndex, aInverseOFmetaTypeLength - aToMoveIndex - 1);
      otherInverseOFmetaType[ aInverseOFmetaTypeLength - 1] = aToMoveInverseOFmetaType;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaTypeToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaTypeToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaTypeToLast", null); return;}

      // Set the new collection
    setInverseOFmetaTypePrivileged( theCtxt, otherInverseOFmetaType);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFmetaType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFmetaType
     */
  public void addInverseOFmetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFmetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaType = getInverseOFmetaTypePrivileged( theCtxt);
    if( someInverseOFmetaType == null) { return;}

      // Check for new InverseOFmetaType already in collection
    int aInverseOFmetaTypeLength = someInverseOFmetaType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaTypeLength ; anIndex++) {
      if( theInverseOFmetaType.sameAs( theCtxt, someInverseOFmetaType[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFmetaType element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaType = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaTypeLength + 1];
    try {
      System.arraycopy( someInverseOFmetaType, 0, otherInverseOFmetaType, 0, aInverseOFmetaTypeLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaTypePrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaTypePrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaTypePrivileged", null); return;}

    otherInverseOFmetaType[ aInverseOFmetaTypeLength] = theInverseOFmetaType;

      // Set the new collection
    setInverseOFmetaTypePrivileged( theCtxt, otherInverseOFmetaType);
  }









    /* Privileged Write accessor for role InverseOFmetaType
     */
  public void removeInverseOFmetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFmetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFmetaType = getInverseOFmetaTypePrivileged( theCtxt);
    if( someInverseOFmetaType == null) { return;}

      // Check for new InverseOFmetaType not in collection
    int aInverseOFmetaTypeLength = someInverseOFmetaType.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaTypeLength ; anIndex++) {
      if( theInverseOFmetaType.sameAs( theCtxt, someInverseOFmetaType[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFmetaType element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaType = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaTypeLength - 1];
    try {
      System.arraycopy( someInverseOFmetaType, 0, otherInverseOFmetaType, 0, aFoundIndex);
      System.arraycopy( someInverseOFmetaType, aFoundIndex + 1, otherInverseOFmetaType, aFoundIndex, aInverseOFmetaTypeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaTypePrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaTypePrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaTypePrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFmetaTypePrivileged( theCtxt, otherInverseOFmetaType);
  }






    /* Privileged Read accessor for role InverseOFmetaType
     * Guaranteed to return object with same identity of the InverseOFmetaType
     */
  public com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] getInverseOFmetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFmetaType;
  }




    /* Set reference in role InverseOFmetaType
     * Used by relationship maintenance machinery
     */
  public void setInverseOFmetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] theInverseOFmetaTypeCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] aInverseOFmetaType = vrInverseOFmetaType;
    vrInverseOFmetaType = theInverseOFmetaTypeCollection;
      // Propagate change
    change( theCtxt, "InverseOFmetaType", aInverseOFmetaType, vrInverseOFmetaType, "vrInverseOFmetaType");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship Inverse1OFmetaType
 ****************************************************************************/


    /* Public Read accessor for role Inverse1OFmetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] getInverse1OFmetaType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverse1OFmetaTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverse1OFmetaTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public Inverse1OFmetaType number access
     */
  public int numInverse1OFmetaType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverse1OFmetaTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverse1OFmetaTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public Inverse1OFmetaType read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc getInverse1OFmetaTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverse1OFmetaTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverse1OFmetaTypeAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public Inverse1OFmetaType finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc findInverse1OFmetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverse1OFmetaTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverse1OFmetaTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public Inverse1OFmetaType is related predicate
     */
  public boolean hasInverse1OFmetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverse1OFmetaTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverse1OFmetaTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional Inverse1OFmetaType is related  predicate
     */
  public boolean hasInverse1OFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public Inverse1OFmetaType index access
     */
  public int indexOfInverse1OFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverse1OFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverse1OFmetaTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theRelativeInverse1OFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverse1OFmetaTypeBeforePR( theCtxt, theInverse1OFmetaType, theRelativeInverse1OFmetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverse1OFmetaTypeBeforePR( theCtxt, theInverse1OFmetaType, theRelativeInverse1OFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role Inverse1OFmetaType
     */
  public void removeInverse1OFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role Inverse1OFmetaType
     */
  public void moveInverse1OFmetaTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theRelativeInverse1OFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverse1OFmetaTypeBeforePR( theCtxt, theInverse1OFmetaType, theRelativeInverse1OFmetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverse1OFmetaTypeBeforePR( theCtxt, theInverse1OFmetaType, theRelativeInverse1OFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role Inverse1OFmetaType
     */
  public void moveInverse1OFmetaTypeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverse1OFmetaTypeToLastPR( theCtxt, theInverse1OFmetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverse1OFmetaTypeToLastPR( theCtxt, theInverse1OFmetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship Inverse1OFmetaType
 ****************************************************************************/


    /* Public Read accessor for role Inverse1OFmetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] getInverse1OFmetaTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] someInverse1OFmetaType = getInverse1OFmetaTypePrivileged( theCtxt);
    if( someInverse1OFmetaType == null) { return null;}

    int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] otherInverse1OFmetaType = new com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[ aInverse1OFmetaTypeLength];
    try { System.arraycopy( someInverse1OFmetaType, 0, otherInverse1OFmetaType, 0, aInverse1OFmetaTypeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverse1OFmetaType", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverse1OFmetaType", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverse1OFmetaType", null); return null;}


    return otherInverse1OFmetaType;
  }



    /* Public Inverse1OFmetaType finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc findInverse1OFmetaTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] someInverse1OFmetaType = getInverse1OFmetaTypePrivileged( theCtxt);
    if( someInverse1OFmetaType == null) { return null;}

      // Check for new Inverse1OFmetaType already in collection
    int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;
    for( int anIndex = 0 ; anIndex < aInverse1OFmetaTypeLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv aInverse1OFmetaType = someInverse1OFmetaType[ anIndex];
      if( aInverse1OFmetaType.sameNameAs( theCtxt, theMMName)) { return aInverse1OFmetaType;}
    }
    return null;
  }



    /* Public Inverse1OFmetaType finder predicate by name
     */
  public boolean hasInverse1OFmetaTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverse1OFmetaTypeNamedPR( theCtxt, theMMName) != null;
  }


    /* Public Inverse1OFmetaType read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc getInverse1OFmetaTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] someInverse1OFmetaType = getInverse1OFmetaTypePrivileged( theCtxt);
    if( someInverse1OFmetaType == null) { return null;}

      // Get number of Inverse1OFmetaType
    int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;

      // Verify index within array length
    if( theIndex >= aInverse1OFmetaTypeLength) { return null;}

      // Get indexed Inverse1OFmetaType
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc aInverse1OFmetaType = someInverse1OFmetaType[ theIndex];

    return aInverse1OFmetaType;
  }



    /* Public Inverse1OFmetaType is related predicate
     */
  public boolean hasInverse1OFmetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException {
    return indexOfInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType) >= 0;
  }


    /* Public Inverse1OFmetaType index access
     */
  public int indexOfInverse1OFmetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException {
      // Do not add null values to the collection
    if( theInverse1OFmetaType == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] someInverse1OFmetaType = getInverse1OFmetaTypePrivileged( theCtxt);
    if( someInverse1OFmetaType == null) { return -1;}

      // Check for new Inverse1OFmetaType already in collection
    int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;
    for( int anIndex = 0 ; anIndex < aInverse1OFmetaTypeLength ; anIndex++) {
      if( someInverse1OFmetaType[ anIndex].sameAs( theCtxt, theInverse1OFmetaType)) { return anIndex;}
    }
    return -1;
  }


    /* Public Inverse1OFmetaType number access
     */
  public int numInverse1OFmetaTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] someInverse1OFmetaType = getInverse1OFmetaTypePrivileged( theCtxt);
    if( someInverse1OFmetaType == null) { return 0;}

      // Check for new Inverse1OFmetaType already in collection
    int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;
    return aInverse1OFmetaTypeLength;
  }




    /* Public Write accessor for role Inverse1OFmetaType
     */
  public void addInverse1OFmetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverse1OFmetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverse1OFmetaType = getInverse1OFmetaTypePrivileged( theCtxt);
    if( someInverse1OFmetaType == null) { return;}

      // Check for new Inverse1OFmetaType already in collection
    int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;
    for( int anIndex = 0 ; anIndex < aInverse1OFmetaTypeLength ; anIndex++) {
      if( theInverse1OFmetaType.sameAs( theCtxt, someInverse1OFmetaType[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv aNewInverse1OFmetaType = (com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv) theInverse1OFmetaType;

      // Link reverse ref to this object
    aNewInverse1OFmetaType.unsetAndSetMetaTypePrivileged( theCtxt, this);

      // Grow collection and add new Inverse1OFmetaType element
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverse1OFmetaType = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverse1OFmetaTypeLength + 1];
    try { System.arraycopy( someInverse1OFmetaType, 0, otherInverse1OFmetaType, 0, aInverse1OFmetaTypeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverse1OFmetaType", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverse1OFmetaType", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverse1OFmetaType", null); return;}
    otherInverse1OFmetaType[ aInverse1OFmetaTypeLength] = aNewInverse1OFmetaType;

      // Set the new collection
    setInverse1OFmetaTypePrivileged( theCtxt, otherInverse1OFmetaType);
  }




    /* Public ordered Write accessor for role Inverse1OFmetaType
     */
  public void addInverse1OFmetaTypeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theRelativeInverse1OFmetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverse1OFmetaType == null) { return;}

      // If relative Inverse1OFmetaType is null, perform normal add operation
    if( theRelativeInverse1OFmetaType == null) {
      addInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverse1OFmetaType = getInverse1OFmetaTypePrivileged( theCtxt);
    if( someInverse1OFmetaType == null) { return;}


      // Get index of relative Inverse1OFmetaType
    int aRelativeIndex = indexOfInverse1OFmetaTypePR( theCtxt, theRelativeInverse1OFmetaType);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);
    }

      // Get length of Inverse1OFmetaType array
    int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverse1OFmetaTypeLength) {
      addInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);
    }

      // Check for new Inverse1OFmetaType already in collection
    if( hasInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType)) { return;}


    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv aNewInverse1OFmetaType = (com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv) theInverse1OFmetaType;

      // Link reverse ref to this object
    aNewInverse1OFmetaType.unsetAndSetMetaTypePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship Inverse1OFmetaType
      // Grow collection and add new Inverse1OFmetaType element
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverse1OFmetaType = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverse1OFmetaTypeLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverse1OFmetaType, 0, otherInverse1OFmetaType, 0, aRelativeIndex );
      }
      System.arraycopy( someInverse1OFmetaType, aRelativeIndex, otherInverse1OFmetaType, aRelativeIndex + 1, aInverse1OFmetaTypeLength - aRelativeIndex);
      otherInverse1OFmetaType[ aRelativeIndex] = aNewInverse1OFmetaType;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverse1OFmetaTypeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverse1OFmetaTypeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverse1OFmetaTypeBefore", null); return;}

      // Set the new collection
    setInverse1OFmetaTypePrivileged( theCtxt, otherInverse1OFmetaType);
  }





    /* Public Write accessor for role Inverse1OFmetaType
     */
  public void removeInverse1OFmetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverse1OFmetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverse1OFmetaType = getInverse1OFmetaTypePrivileged( theCtxt);
    if( someInverse1OFmetaType == null) { return;}

      // Check for new Inverse1OFmetaType not in collection
    int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverse1OFmetaTypeLength ; anIndex++) {
      if( theInverse1OFmetaType.sameAs( theCtxt, someInverse1OFmetaType[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv aNewInverse1OFmetaType = (com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv) theInverse1OFmetaType;

      // Unlink reverse ref from the new related object
    aNewInverse1OFmetaType.unsetMetaTypePrivileged( theCtxt);

      // Shrink collection removing Inverse1OFmetaType element
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverse1OFmetaType = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverse1OFmetaTypeLength - 1];
    try {
      System.arraycopy( someInverse1OFmetaType, 0, otherInverse1OFmetaType, 0, aFoundIndex);
      System.arraycopy( someInverse1OFmetaType, aFoundIndex + 1, otherInverse1OFmetaType, aFoundIndex, aInverse1OFmetaTypeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverse1OFmetaType", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverse1OFmetaType", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverse1OFmetaType", null); return;}

      // Set the new collection
    setInverse1OFmetaTypePrivileged( theCtxt, otherInverse1OFmetaType);
  }




    /* Public reorder accessor for role Inverse1OFmetaType
     */
  public void moveInverse1OFmetaTypeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theRelativeInverse1OFmetaType) throws EAIException {

      // Null value is nothing to move
    if( theInverse1OFmetaType == null) { return;}

      // If relative Inverse1OFmetaType is null, perform move to last position
    if( theRelativeInverse1OFmetaType == null) {
      moveInverse1OFmetaTypeToLastPR( theCtxt, theInverse1OFmetaType);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverse1OFmetaType = getInverse1OFmetaTypePrivileged( theCtxt);
    if( someInverse1OFmetaType == null) { return;}

      // Get length of Inverse1OFmetaType array
    int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;

      // Get index of Inverse1OFmetaType to move
    int aToMoveIndex = indexOfInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);
      // If toMove Inverse1OFmetaType not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverse1OFmetaTypeLength) {
      moveInverse1OFmetaTypeToLastPR( theCtxt, theInverse1OFmetaType);
    }

      // Get index of relative Inverse1OFmetaType
    int aRelativeIndex = indexOfInverse1OFmetaTypePR( theCtxt, theRelativeInverse1OFmetaType);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverse1OFmetaTypeToLastPR( theCtxt, theInverse1OFmetaType);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverse1OFmetaTypeLength) {
      moveInverse1OFmetaTypeToLastPR( theCtxt, theInverse1OFmetaType);
    }

      // ToMove and relative Inverse1OFmetaType are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv aToMoveInverse1OFmetaType = (com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv) theInverse1OFmetaType;

      // Allocate new array for new version of state of relationship Inverse1OFmetaType
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverse1OFmetaType = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverse1OFmetaTypeLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverse1OFmetaType, 0, otherInverse1OFmetaType, 0, aToMoveIndex );
        System.arraycopy( someInverse1OFmetaType, aToMoveIndex + 1, otherInverse1OFmetaType, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverse1OFmetaType[ aRelativeIndex - 1] = aToMoveInverse1OFmetaType;
        System.arraycopy( someInverse1OFmetaType, aRelativeIndex, otherInverse1OFmetaType, aRelativeIndex, aInverse1OFmetaTypeLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverse1OFmetaType, 0, otherInverse1OFmetaType, 0, aRelativeIndex );
        otherInverse1OFmetaType[ aRelativeIndex ] = aToMoveInverse1OFmetaType;
        System.arraycopy( someInverse1OFmetaType, aRelativeIndex, otherInverse1OFmetaType, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverse1OFmetaTypeLength - 1) {
          System.arraycopy( someInverse1OFmetaType, aToMoveIndex + 1, otherInverse1OFmetaType, aToMoveIndex + 1, aInverse1OFmetaTypeLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverse1OFmetaTypeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverse1OFmetaTypeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverse1OFmetaTypeBefore", null); return;}

      // Set the new collection
    setInverse1OFmetaTypePrivileged( theCtxt, otherInverse1OFmetaType);
  }





    /* Public move to last accessor for role Inverse1OFmetaType
     */
  public void moveInverse1OFmetaTypeToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException {

      // Null value is nothing to move
    if( theInverse1OFmetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverse1OFmetaType = getInverse1OFmetaTypePrivileged( theCtxt);
    if( someInverse1OFmetaType == null) { return;}

      // Get length of Inverse1OFmetaType array
    int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;

      // Get index of Inverse1OFmetaType to move
    int aToMoveIndex = indexOfInverse1OFmetaTypePR( theCtxt, theInverse1OFmetaType);

      // If toMove Inverse1OFmetaType not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverse1OFmetaTypeLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv aToMoveInverse1OFmetaType = (com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv) theInverse1OFmetaType;

      // Allocate new array for new version of state of relationship Inverse1OFmetaType
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverse1OFmetaType = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverse1OFmetaTypeLength];
    try {
      System.arraycopy( someInverse1OFmetaType, 0, otherInverse1OFmetaType, 0, aToMoveIndex );
      System.arraycopy( someInverse1OFmetaType, aToMoveIndex + 1, otherInverse1OFmetaType, aToMoveIndex, aInverse1OFmetaTypeLength - aToMoveIndex - 1);
      otherInverse1OFmetaType[ aInverse1OFmetaTypeLength - 1] = aToMoveInverse1OFmetaType;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverse1OFmetaTypeToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverse1OFmetaTypeToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverse1OFmetaTypeToLast", null); return;}

      // Set the new collection
    setInverse1OFmetaTypePrivileged( theCtxt, otherInverse1OFmetaType);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship Inverse1OFmetaType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role Inverse1OFmetaType
     */
  public void addInverse1OFmetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv theInverse1OFmetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverse1OFmetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverse1OFmetaType = getInverse1OFmetaTypePrivileged( theCtxt);
    if( someInverse1OFmetaType == null) { return;}

      // Check for new Inverse1OFmetaType already in collection
    int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;
    for( int anIndex = 0 ; anIndex < aInverse1OFmetaTypeLength ; anIndex++) {
      if( theInverse1OFmetaType.sameAs( theCtxt, someInverse1OFmetaType[ anIndex])) { return;}
    }

      // Grow collection and add new Inverse1OFmetaType element
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverse1OFmetaType = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverse1OFmetaTypeLength + 1];
    try {
      System.arraycopy( someInverse1OFmetaType, 0, otherInverse1OFmetaType, 0, aInverse1OFmetaTypeLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverse1OFmetaTypePrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverse1OFmetaTypePrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverse1OFmetaTypePrivileged", null); return;}

    otherInverse1OFmetaType[ aInverse1OFmetaTypeLength] = theInverse1OFmetaType;

      // Set the new collection
    setInverse1OFmetaTypePrivileged( theCtxt, otherInverse1OFmetaType);
  }









    /* Privileged Write accessor for role Inverse1OFmetaType
     */
  public void removeInverse1OFmetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv theInverse1OFmetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverse1OFmetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] someInverse1OFmetaType = getInverse1OFmetaTypePrivileged( theCtxt);
    if( someInverse1OFmetaType == null) { return;}

      // Check for new Inverse1OFmetaType not in collection
    int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverse1OFmetaTypeLength ; anIndex++) {
      if( theInverse1OFmetaType.sameAs( theCtxt, someInverse1OFmetaType[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing Inverse1OFmetaType element
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] otherInverse1OFmetaType = new com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[ aInverse1OFmetaTypeLength - 1];
    try {
      System.arraycopy( someInverse1OFmetaType, 0, otherInverse1OFmetaType, 0, aFoundIndex);
      System.arraycopy( someInverse1OFmetaType, aFoundIndex + 1, otherInverse1OFmetaType, aFoundIndex, aInverse1OFmetaTypeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverse1OFmetaTypePrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverse1OFmetaTypePrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverse1OFmetaTypePrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv.class}); return;}

      // Set the new collection
    setInverse1OFmetaTypePrivileged( theCtxt, otherInverse1OFmetaType);
  }






    /* Privileged Read accessor for role Inverse1OFmetaType
     * Guaranteed to return object with same identity of the Inverse1OFmetaType
     */
  public com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] getInverse1OFmetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverse1OFmetaType;
  }




    /* Set reference in role Inverse1OFmetaType
     * Used by relationship maintenance machinery
     */
  public void setInverse1OFmetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] theInverse1OFmetaTypeCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] aInverse1OFmetaType = vrInverse1OFmetaType;
    vrInverse1OFmetaType = theInverse1OFmetaTypeCollection;
      // Propagate change
    change( theCtxt, "Inverse1OFmetaType", aInverse1OFmetaType, vrInverse1OFmetaType, "vrInverse1OFmetaType");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFreplicatedMetaType
 ****************************************************************************/


    /* Public Read accessor for role InverseOFreplicatedMetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[] getInverseOFreplicatedMetaType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFreplicatedMetaTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFreplicatedMetaTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public InverseOFreplicatedMetaType number access
     */
  public int numInverseOFreplicatedMetaType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFreplicatedMetaTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFreplicatedMetaTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public InverseOFreplicatedMetaType read accessor by index
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc getInverseOFreplicatedMetaTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFreplicatedMetaTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFreplicatedMetaTypeAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public InverseOFreplicatedMetaType finder by name
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc findInverseOFreplicatedMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFreplicatedMetaTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFreplicatedMetaTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public InverseOFreplicatedMetaType is related predicate
     */
  public boolean hasInverseOFreplicatedMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFreplicatedMetaTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFreplicatedMetaTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional InverseOFreplicatedMetaType is related  predicate
     */
  public boolean hasInverseOFreplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public InverseOFreplicatedMetaType index access
     */
  public int indexOfInverseOFreplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFreplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFreplicatedMetaTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theRelativeInverseOFreplicatedMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFreplicatedMetaTypeBeforePR( theCtxt, theInverseOFreplicatedMetaType, theRelativeInverseOFreplicatedMetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFreplicatedMetaTypeBeforePR( theCtxt, theInverseOFreplicatedMetaType, theRelativeInverseOFreplicatedMetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role InverseOFreplicatedMetaType
     */
  public void removeInverseOFreplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFreplicatedMetaType
     */
  public void moveInverseOFreplicatedMetaTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theRelativeInverseOFreplicatedMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFreplicatedMetaTypeBeforePR( theCtxt, theInverseOFreplicatedMetaType, theRelativeInverseOFreplicatedMetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFreplicatedMetaTypeBeforePR( theCtxt, theInverseOFreplicatedMetaType, theRelativeInverseOFreplicatedMetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFreplicatedMetaType
     */
  public void moveInverseOFreplicatedMetaTypeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFreplicatedMetaTypeToLastPR( theCtxt, theInverseOFreplicatedMetaType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFreplicatedMetaTypeToLastPR( theCtxt, theInverseOFreplicatedMetaType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship InverseOFreplicatedMetaType
 ****************************************************************************/


    /* Public Read accessor for role InverseOFreplicatedMetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[] getInverseOFreplicatedMetaTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaTypePrivileged( theCtxt);
    if( someInverseOFreplicatedMetaType == null) { return null;}

    int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;
    com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[] otherInverseOFreplicatedMetaType = new com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[ aInverseOFreplicatedMetaTypeLength];
    try { System.arraycopy( someInverseOFreplicatedMetaType, 0, otherInverseOFreplicatedMetaType, 0, aInverseOFreplicatedMetaTypeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFreplicatedMetaType", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFreplicatedMetaType", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFreplicatedMetaType", null); return null;}


    return otherInverseOFreplicatedMetaType;
  }



    /* Public InverseOFreplicatedMetaType finder by name
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc findInverseOFreplicatedMetaTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaTypePrivileged( theCtxt);
    if( someInverseOFreplicatedMetaType == null) { return null;}

      // Check for new InverseOFreplicatedMetaType already in collection
    int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaTypeLength ; anIndex++) {
      com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv aInverseOFreplicatedMetaType = someInverseOFreplicatedMetaType[ anIndex];
      if( aInverseOFreplicatedMetaType.sameNameAs( theCtxt, theMMName)) { return aInverseOFreplicatedMetaType;}
    }
    return null;
  }



    /* Public InverseOFreplicatedMetaType finder predicate by name
     */
  public boolean hasInverseOFreplicatedMetaTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFreplicatedMetaTypeNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFreplicatedMetaType read accessor by index
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc getInverseOFreplicatedMetaTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaTypePrivileged( theCtxt);
    if( someInverseOFreplicatedMetaType == null) { return null;}

      // Get number of InverseOFreplicatedMetaType
    int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;

      // Verify index within array length
    if( theIndex >= aInverseOFreplicatedMetaTypeLength) { return null;}

      // Get indexed InverseOFreplicatedMetaType
    com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc aInverseOFreplicatedMetaType = someInverseOFreplicatedMetaType[ theIndex];

    return aInverseOFreplicatedMetaType;
  }



    /* Public InverseOFreplicatedMetaType is related predicate
     */
  public boolean hasInverseOFreplicatedMetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException {
    return indexOfInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType) >= 0;
  }


    /* Public InverseOFreplicatedMetaType index access
     */
  public int indexOfInverseOFreplicatedMetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFreplicatedMetaType == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaTypePrivileged( theCtxt);
    if( someInverseOFreplicatedMetaType == null) { return -1;}

      // Check for new InverseOFreplicatedMetaType already in collection
    int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaTypeLength ; anIndex++) {
      if( someInverseOFreplicatedMetaType[ anIndex].sameAs( theCtxt, theInverseOFreplicatedMetaType)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFreplicatedMetaType number access
     */
  public int numInverseOFreplicatedMetaTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaTypePrivileged( theCtxt);
    if( someInverseOFreplicatedMetaType == null) { return 0;}

      // Check for new InverseOFreplicatedMetaType already in collection
    int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;
    return aInverseOFreplicatedMetaTypeLength;
  }




    /* Public Write accessor for role InverseOFreplicatedMetaType
     */
  public void addInverseOFreplicatedMetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFreplicatedMetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaTypePrivileged( theCtxt);
    if( someInverseOFreplicatedMetaType == null) { return;}

      // Check for new InverseOFreplicatedMetaType already in collection
    int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaTypeLength ; anIndex++) {
      if( theInverseOFreplicatedMetaType.sameAs( theCtxt, someInverseOFreplicatedMetaType[ anIndex])) { return;}
    }

    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv aNewInverseOFreplicatedMetaType = (com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv) theInverseOFreplicatedMetaType;

      // Link reverse ref to this object
    aNewInverseOFreplicatedMetaType.unsetAndSetReplicatedMetaTypePrivileged( theCtxt, this);

      // Grow collection and add new InverseOFreplicatedMetaType element
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] otherInverseOFreplicatedMetaType = new com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[ aInverseOFreplicatedMetaTypeLength + 1];
    try { System.arraycopy( someInverseOFreplicatedMetaType, 0, otherInverseOFreplicatedMetaType, 0, aInverseOFreplicatedMetaTypeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaType", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaType", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaType", null); return;}
    otherInverseOFreplicatedMetaType[ aInverseOFreplicatedMetaTypeLength] = aNewInverseOFreplicatedMetaType;

      // Set the new collection
    setInverseOFreplicatedMetaTypePrivileged( theCtxt, otherInverseOFreplicatedMetaType);
  }




    /* Public ordered Write accessor for role InverseOFreplicatedMetaType
     */
  public void addInverseOFreplicatedMetaTypeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theRelativeInverseOFreplicatedMetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFreplicatedMetaType == null) { return;}

      // If relative InverseOFreplicatedMetaType is null, perform normal add operation
    if( theRelativeInverseOFreplicatedMetaType == null) {
      addInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);
    }

      // Get current value
    com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaTypePrivileged( theCtxt);
    if( someInverseOFreplicatedMetaType == null) { return;}


      // Get index of relative InverseOFreplicatedMetaType
    int aRelativeIndex = indexOfInverseOFreplicatedMetaTypePR( theCtxt, theRelativeInverseOFreplicatedMetaType);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);
    }

      // Get length of InverseOFreplicatedMetaType array
    int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFreplicatedMetaTypeLength) {
      addInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);
    }

      // Check for new InverseOFreplicatedMetaType already in collection
    if( hasInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType)) { return;}


    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv aNewInverseOFreplicatedMetaType = (com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv) theInverseOFreplicatedMetaType;

      // Link reverse ref to this object
    aNewInverseOFreplicatedMetaType.unsetAndSetReplicatedMetaTypePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFreplicatedMetaType
      // Grow collection and add new InverseOFreplicatedMetaType element
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] otherInverseOFreplicatedMetaType = new com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[ aInverseOFreplicatedMetaTypeLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFreplicatedMetaType, 0, otherInverseOFreplicatedMetaType, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFreplicatedMetaType, aRelativeIndex, otherInverseOFreplicatedMetaType, aRelativeIndex + 1, aInverseOFreplicatedMetaTypeLength - aRelativeIndex);
      otherInverseOFreplicatedMetaType[ aRelativeIndex] = aNewInverseOFreplicatedMetaType;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaTypeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaTypeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaTypeBefore", null); return;}

      // Set the new collection
    setInverseOFreplicatedMetaTypePrivileged( theCtxt, otherInverseOFreplicatedMetaType);
  }





    /* Public Write accessor for role InverseOFreplicatedMetaType
     */
  public void removeInverseOFreplicatedMetaTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFreplicatedMetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaTypePrivileged( theCtxt);
    if( someInverseOFreplicatedMetaType == null) { return;}

      // Check for new InverseOFreplicatedMetaType not in collection
    int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaTypeLength ; anIndex++) {
      if( theInverseOFreplicatedMetaType.sameAs( theCtxt, someInverseOFreplicatedMetaType[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv aNewInverseOFreplicatedMetaType = (com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv) theInverseOFreplicatedMetaType;

      // Unlink reverse ref from the new related object
    aNewInverseOFreplicatedMetaType.unsetReplicatedMetaTypePrivileged( theCtxt);

      // Shrink collection removing InverseOFreplicatedMetaType element
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] otherInverseOFreplicatedMetaType = new com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[ aInverseOFreplicatedMetaTypeLength - 1];
    try {
      System.arraycopy( someInverseOFreplicatedMetaType, 0, otherInverseOFreplicatedMetaType, 0, aFoundIndex);
      System.arraycopy( someInverseOFreplicatedMetaType, aFoundIndex + 1, otherInverseOFreplicatedMetaType, aFoundIndex, aInverseOFreplicatedMetaTypeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFreplicatedMetaType", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFreplicatedMetaType", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFreplicatedMetaType", null); return;}

      // Set the new collection
    setInverseOFreplicatedMetaTypePrivileged( theCtxt, otherInverseOFreplicatedMetaType);
  }




    /* Public reorder accessor for role InverseOFreplicatedMetaType
     */
  public void moveInverseOFreplicatedMetaTypeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theRelativeInverseOFreplicatedMetaType) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFreplicatedMetaType == null) { return;}

      // If relative InverseOFreplicatedMetaType is null, perform move to last position
    if( theRelativeInverseOFreplicatedMetaType == null) {
      moveInverseOFreplicatedMetaTypeToLastPR( theCtxt, theInverseOFreplicatedMetaType);
    }

      // Get current value
    com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaTypePrivileged( theCtxt);
    if( someInverseOFreplicatedMetaType == null) { return;}

      // Get length of InverseOFreplicatedMetaType array
    int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;

      // Get index of InverseOFreplicatedMetaType to move
    int aToMoveIndex = indexOfInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);
      // If toMove InverseOFreplicatedMetaType not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFreplicatedMetaTypeLength) {
      moveInverseOFreplicatedMetaTypeToLastPR( theCtxt, theInverseOFreplicatedMetaType);
    }

      // Get index of relative InverseOFreplicatedMetaType
    int aRelativeIndex = indexOfInverseOFreplicatedMetaTypePR( theCtxt, theRelativeInverseOFreplicatedMetaType);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFreplicatedMetaTypeToLastPR( theCtxt, theInverseOFreplicatedMetaType);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFreplicatedMetaTypeLength) {
      moveInverseOFreplicatedMetaTypeToLastPR( theCtxt, theInverseOFreplicatedMetaType);
    }

      // ToMove and relative InverseOFreplicatedMetaType are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv aToMoveInverseOFreplicatedMetaType = (com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv) theInverseOFreplicatedMetaType;

      // Allocate new array for new version of state of relationship InverseOFreplicatedMetaType
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] otherInverseOFreplicatedMetaType = new com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[ aInverseOFreplicatedMetaTypeLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFreplicatedMetaType, 0, otherInverseOFreplicatedMetaType, 0, aToMoveIndex );
        System.arraycopy( someInverseOFreplicatedMetaType, aToMoveIndex + 1, otherInverseOFreplicatedMetaType, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFreplicatedMetaType[ aRelativeIndex - 1] = aToMoveInverseOFreplicatedMetaType;
        System.arraycopy( someInverseOFreplicatedMetaType, aRelativeIndex, otherInverseOFreplicatedMetaType, aRelativeIndex, aInverseOFreplicatedMetaTypeLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFreplicatedMetaType, 0, otherInverseOFreplicatedMetaType, 0, aRelativeIndex );
        otherInverseOFreplicatedMetaType[ aRelativeIndex ] = aToMoveInverseOFreplicatedMetaType;
        System.arraycopy( someInverseOFreplicatedMetaType, aRelativeIndex, otherInverseOFreplicatedMetaType, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFreplicatedMetaTypeLength - 1) {
          System.arraycopy( someInverseOFreplicatedMetaType, aToMoveIndex + 1, otherInverseOFreplicatedMetaType, aToMoveIndex + 1, aInverseOFreplicatedMetaTypeLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFreplicatedMetaTypeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFreplicatedMetaTypeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFreplicatedMetaTypeBefore", null); return;}

      // Set the new collection
    setInverseOFreplicatedMetaTypePrivileged( theCtxt, otherInverseOFreplicatedMetaType);
  }





    /* Public move to last accessor for role InverseOFreplicatedMetaType
     */
  public void moveInverseOFreplicatedMetaTypeToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFreplicatedMetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaTypePrivileged( theCtxt);
    if( someInverseOFreplicatedMetaType == null) { return;}

      // Get length of InverseOFreplicatedMetaType array
    int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;

      // Get index of InverseOFreplicatedMetaType to move
    int aToMoveIndex = indexOfInverseOFreplicatedMetaTypePR( theCtxt, theInverseOFreplicatedMetaType);

      // If toMove InverseOFreplicatedMetaType not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFreplicatedMetaTypeLength - 1) { return;}

    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv aToMoveInverseOFreplicatedMetaType = (com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv) theInverseOFreplicatedMetaType;

      // Allocate new array for new version of state of relationship InverseOFreplicatedMetaType
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] otherInverseOFreplicatedMetaType = new com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[ aInverseOFreplicatedMetaTypeLength];
    try {
      System.arraycopy( someInverseOFreplicatedMetaType, 0, otherInverseOFreplicatedMetaType, 0, aToMoveIndex );
      System.arraycopy( someInverseOFreplicatedMetaType, aToMoveIndex + 1, otherInverseOFreplicatedMetaType, aToMoveIndex, aInverseOFreplicatedMetaTypeLength - aToMoveIndex - 1);
      otherInverseOFreplicatedMetaType[ aInverseOFreplicatedMetaTypeLength - 1] = aToMoveInverseOFreplicatedMetaType;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFreplicatedMetaTypeToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFreplicatedMetaTypeToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFreplicatedMetaTypeToLast", null); return;}

      // Set the new collection
    setInverseOFreplicatedMetaTypePrivileged( theCtxt, otherInverseOFreplicatedMetaType);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFreplicatedMetaType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFreplicatedMetaType
     */
  public void addInverseOFreplicatedMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv theInverseOFreplicatedMetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFreplicatedMetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaTypePrivileged( theCtxt);
    if( someInverseOFreplicatedMetaType == null) { return;}

      // Check for new InverseOFreplicatedMetaType already in collection
    int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaTypeLength ; anIndex++) {
      if( theInverseOFreplicatedMetaType.sameAs( theCtxt, someInverseOFreplicatedMetaType[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFreplicatedMetaType element
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] otherInverseOFreplicatedMetaType = new com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[ aInverseOFreplicatedMetaTypeLength + 1];
    try {
      System.arraycopy( someInverseOFreplicatedMetaType, 0, otherInverseOFreplicatedMetaType, 0, aInverseOFreplicatedMetaTypeLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaTypePrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaTypePrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFreplicatedMetaTypePrivileged", null); return;}

    otherInverseOFreplicatedMetaType[ aInverseOFreplicatedMetaTypeLength] = theInverseOFreplicatedMetaType;

      // Set the new collection
    setInverseOFreplicatedMetaTypePrivileged( theCtxt, otherInverseOFreplicatedMetaType);
  }









    /* Privileged Write accessor for role InverseOFreplicatedMetaType
     */
  public void removeInverseOFreplicatedMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv theInverseOFreplicatedMetaType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFreplicatedMetaType == null) { return;}

      // Get current value
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaTypePrivileged( theCtxt);
    if( someInverseOFreplicatedMetaType == null) { return;}

      // Check for new InverseOFreplicatedMetaType not in collection
    int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaTypeLength ; anIndex++) {
      if( theInverseOFreplicatedMetaType.sameAs( theCtxt, someInverseOFreplicatedMetaType[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFreplicatedMetaType element
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] otherInverseOFreplicatedMetaType = new com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[ aInverseOFreplicatedMetaTypeLength - 1];
    try {
      System.arraycopy( someInverseOFreplicatedMetaType, 0, otherInverseOFreplicatedMetaType, 0, aFoundIndex);
      System.arraycopy( someInverseOFreplicatedMetaType, aFoundIndex + 1, otherInverseOFreplicatedMetaType, aFoundIndex, aInverseOFreplicatedMetaTypeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFreplicatedMetaTypePrivileged", new Class[] { com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFreplicatedMetaTypePrivileged", new Class[] { com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFreplicatedMetaTypePrivileged", new Class[] { com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv.class}); return;}

      // Set the new collection
    setInverseOFreplicatedMetaTypePrivileged( theCtxt, otherInverseOFreplicatedMetaType);
  }






    /* Privileged Read accessor for role InverseOFreplicatedMetaType
     * Guaranteed to return object with same identity of the InverseOFreplicatedMetaType
     */
  public com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] getInverseOFreplicatedMetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFreplicatedMetaType;
  }




    /* Set reference in role InverseOFreplicatedMetaType
     * Used by relationship maintenance machinery
     */
  public void setInverseOFreplicatedMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] theInverseOFreplicatedMetaTypeCollection) throws EAIException {
    com.dosmil_e.m3.replication.priv.M3ReplicateNodeMgrPriv[] aInverseOFreplicatedMetaType = vrInverseOFreplicatedMetaType;
    vrInverseOFreplicatedMetaType = theInverseOFreplicatedMetaTypeCollection;
      // Propagate change
    change( theCtxt, "InverseOFreplicatedMetaType", aInverseOFreplicatedMetaType, vrInverseOFreplicatedMetaType, "vrInverseOFreplicatedMetaType");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFprojectionType
 ****************************************************************************/


    /* Public Read accessor for role InverseOFprojectionType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFprojectionType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFprojectionTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFprojectionTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public InverseOFprojectionType number access
     */
  public int numInverseOFprojectionType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFprojectionTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFprojectionTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public InverseOFprojectionType read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFprojectionTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFprojectionTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFprojectionTypeAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public InverseOFprojectionType finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFprojectionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFprojectionTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFprojectionTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public InverseOFprojectionType is related predicate
     */
  public boolean hasInverseOFprojectionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFprojectionTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFprojectionTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional InverseOFprojectionType is related  predicate
     */
  public boolean hasInverseOFprojectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public InverseOFprojectionType index access
     */
  public int indexOfInverseOFprojectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFprojectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFprojectionTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFprojectionTypeBeforePR( theCtxt, theInverseOFprojectionType, theRelativeInverseOFprojectionType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFprojectionTypeBeforePR( theCtxt, theInverseOFprojectionType, theRelativeInverseOFprojectionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role InverseOFprojectionType
     */
  public void removeInverseOFprojectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFprojectionType
     */
  public void moveInverseOFprojectionTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFprojectionTypeBeforePR( theCtxt, theInverseOFprojectionType, theRelativeInverseOFprojectionType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFprojectionTypeBeforePR( theCtxt, theInverseOFprojectionType, theRelativeInverseOFprojectionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFprojectionType
     */
  public void moveInverseOFprojectionTypeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFprojectionTypeToLastPR( theCtxt, theInverseOFprojectionType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFprojectionTypeToLastPR( theCtxt, theInverseOFprojectionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship InverseOFprojectionType
 ****************************************************************************/


    /* Public Read accessor for role InverseOFprojectionType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFprojectionTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectionType = getInverseOFprojectionTypePrivileged( theCtxt);
    if( someInverseOFprojectionType == null) { return null;}

    int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] otherInverseOFprojectionType = new com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[ aInverseOFprojectionTypeLength];
    try { System.arraycopy( someInverseOFprojectionType, 0, otherInverseOFprojectionType, 0, aInverseOFprojectionTypeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFprojectionType", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFprojectionType", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFprojectionType", null); return null;}


    return otherInverseOFprojectionType;
  }



    /* Public InverseOFprojectionType finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFprojectionTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectionType = getInverseOFprojectionTypePrivileged( theCtxt);
    if( someInverseOFprojectionType == null) { return null;}

      // Check for new InverseOFprojectionType already in collection
    int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectionTypeLength ; anIndex++) {
      com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aInverseOFprojectionType = someInverseOFprojectionType[ anIndex];
      if( aInverseOFprojectionType.sameNameAs( theCtxt, theMMName)) { return aInverseOFprojectionType;}
    }
    return null;
  }



    /* Public InverseOFprojectionType finder predicate by name
     */
  public boolean hasInverseOFprojectionTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFprojectionTypeNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFprojectionType read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFprojectionTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectionType = getInverseOFprojectionTypePrivileged( theCtxt);
    if( someInverseOFprojectionType == null) { return null;}

      // Get number of InverseOFprojectionType
    int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;

      // Verify index within array length
    if( theIndex >= aInverseOFprojectionTypeLength) { return null;}

      // Get indexed InverseOFprojectionType
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFprojectionType = someInverseOFprojectionType[ theIndex];

    return aInverseOFprojectionType;
  }



    /* Public InverseOFprojectionType is related predicate
     */
  public boolean hasInverseOFprojectionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException {
    return indexOfInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType) >= 0;
  }


    /* Public InverseOFprojectionType index access
     */
  public int indexOfInverseOFprojectionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFprojectionType == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectionType = getInverseOFprojectionTypePrivileged( theCtxt);
    if( someInverseOFprojectionType == null) { return -1;}

      // Check for new InverseOFprojectionType already in collection
    int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectionTypeLength ; anIndex++) {
      if( someInverseOFprojectionType[ anIndex].sameAs( theCtxt, theInverseOFprojectionType)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFprojectionType number access
     */
  public int numInverseOFprojectionTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectionType = getInverseOFprojectionTypePrivileged( theCtxt);
    if( someInverseOFprojectionType == null) { return 0;}

      // Check for new InverseOFprojectionType already in collection
    int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;
    return aInverseOFprojectionTypeLength;
  }




    /* Public Write accessor for role InverseOFprojectionType
     */
  public void addInverseOFprojectionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectionType == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionType = getInverseOFprojectionTypePrivileged( theCtxt);
    if( someInverseOFprojectionType == null) { return;}

      // Check for new InverseOFprojectionType already in collection
    int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectionTypeLength ; anIndex++) {
      if( theInverseOFprojectionType.sameAs( theCtxt, someInverseOFprojectionType[ anIndex])) { return;}
    }

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFprojectionType = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectionType;

      // Link reverse ref to this object
    aNewInverseOFprojectionType.unsetAndSetProjectionTypePrivileged( theCtxt, this);

      // Grow collection and add new InverseOFprojectionType element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionTypeLength + 1];
    try { System.arraycopy( someInverseOFprojectionType, 0, otherInverseOFprojectionType, 0, aInverseOFprojectionTypeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionType", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionType", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionType", null); return;}
    otherInverseOFprojectionType[ aInverseOFprojectionTypeLength] = aNewInverseOFprojectionType;

      // Set the new collection
    setInverseOFprojectionTypePrivileged( theCtxt, otherInverseOFprojectionType);
  }




    /* Public ordered Write accessor for role InverseOFprojectionType
     */
  public void addInverseOFprojectionTypeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectionType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectionType == null) { return;}

      // If relative InverseOFprojectionType is null, perform normal add operation
    if( theRelativeInverseOFprojectionType == null) {
      addInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionType = getInverseOFprojectionTypePrivileged( theCtxt);
    if( someInverseOFprojectionType == null) { return;}


      // Get index of relative InverseOFprojectionType
    int aRelativeIndex = indexOfInverseOFprojectionTypePR( theCtxt, theRelativeInverseOFprojectionType);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);
    }

      // Get length of InverseOFprojectionType array
    int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFprojectionTypeLength) {
      addInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);
    }

      // Check for new InverseOFprojectionType already in collection
    if( hasInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType)) { return;}


    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFprojectionType = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectionType;

      // Link reverse ref to this object
    aNewInverseOFprojectionType.unsetAndSetProjectionTypePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFprojectionType
      // Grow collection and add new InverseOFprojectionType element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionTypeLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFprojectionType, 0, otherInverseOFprojectionType, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFprojectionType, aRelativeIndex, otherInverseOFprojectionType, aRelativeIndex + 1, aInverseOFprojectionTypeLength - aRelativeIndex);
      otherInverseOFprojectionType[ aRelativeIndex] = aNewInverseOFprojectionType;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionTypeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionTypeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionTypeBefore", null); return;}

      // Set the new collection
    setInverseOFprojectionTypePrivileged( theCtxt, otherInverseOFprojectionType);
  }





    /* Public Write accessor for role InverseOFprojectionType
     */
  public void removeInverseOFprojectionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectionType == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionType = getInverseOFprojectionTypePrivileged( theCtxt);
    if( someInverseOFprojectionType == null) { return;}

      // Check for new InverseOFprojectionType not in collection
    int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectionTypeLength ; anIndex++) {
      if( theInverseOFprojectionType.sameAs( theCtxt, someInverseOFprojectionType[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFprojectionType = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectionType;

      // Unlink reverse ref from the new related object
    aNewInverseOFprojectionType.unsetProjectionTypePrivileged( theCtxt);

      // Shrink collection removing InverseOFprojectionType element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionTypeLength - 1];
    try {
      System.arraycopy( someInverseOFprojectionType, 0, otherInverseOFprojectionType, 0, aFoundIndex);
      System.arraycopy( someInverseOFprojectionType, aFoundIndex + 1, otherInverseOFprojectionType, aFoundIndex, aInverseOFprojectionTypeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectionType", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectionType", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectionType", null); return;}

      // Set the new collection
    setInverseOFprojectionTypePrivileged( theCtxt, otherInverseOFprojectionType);
  }




    /* Public reorder accessor for role InverseOFprojectionType
     */
  public void moveInverseOFprojectionTypeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectionType) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFprojectionType == null) { return;}

      // If relative InverseOFprojectionType is null, perform move to last position
    if( theRelativeInverseOFprojectionType == null) {
      moveInverseOFprojectionTypeToLastPR( theCtxt, theInverseOFprojectionType);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionType = getInverseOFprojectionTypePrivileged( theCtxt);
    if( someInverseOFprojectionType == null) { return;}

      // Get length of InverseOFprojectionType array
    int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;

      // Get index of InverseOFprojectionType to move
    int aToMoveIndex = indexOfInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);
      // If toMove InverseOFprojectionType not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFprojectionTypeLength) {
      moveInverseOFprojectionTypeToLastPR( theCtxt, theInverseOFprojectionType);
    }

      // Get index of relative InverseOFprojectionType
    int aRelativeIndex = indexOfInverseOFprojectionTypePR( theCtxt, theRelativeInverseOFprojectionType);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFprojectionTypeToLastPR( theCtxt, theInverseOFprojectionType);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFprojectionTypeLength) {
      moveInverseOFprojectionTypeToLastPR( theCtxt, theInverseOFprojectionType);
    }

      // ToMove and relative InverseOFprojectionType are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFprojectionType = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectionType;

      // Allocate new array for new version of state of relationship InverseOFprojectionType
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionTypeLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFprojectionType, 0, otherInverseOFprojectionType, 0, aToMoveIndex );
        System.arraycopy( someInverseOFprojectionType, aToMoveIndex + 1, otherInverseOFprojectionType, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFprojectionType[ aRelativeIndex - 1] = aToMoveInverseOFprojectionType;
        System.arraycopy( someInverseOFprojectionType, aRelativeIndex, otherInverseOFprojectionType, aRelativeIndex, aInverseOFprojectionTypeLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFprojectionType, 0, otherInverseOFprojectionType, 0, aRelativeIndex );
        otherInverseOFprojectionType[ aRelativeIndex ] = aToMoveInverseOFprojectionType;
        System.arraycopy( someInverseOFprojectionType, aRelativeIndex, otherInverseOFprojectionType, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFprojectionTypeLength - 1) {
          System.arraycopy( someInverseOFprojectionType, aToMoveIndex + 1, otherInverseOFprojectionType, aToMoveIndex + 1, aInverseOFprojectionTypeLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectionTypeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectionTypeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectionTypeBefore", null); return;}

      // Set the new collection
    setInverseOFprojectionTypePrivileged( theCtxt, otherInverseOFprojectionType);
  }





    /* Public move to last accessor for role InverseOFprojectionType
     */
  public void moveInverseOFprojectionTypeToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFprojectionType == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionType = getInverseOFprojectionTypePrivileged( theCtxt);
    if( someInverseOFprojectionType == null) { return;}

      // Get length of InverseOFprojectionType array
    int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;

      // Get index of InverseOFprojectionType to move
    int aToMoveIndex = indexOfInverseOFprojectionTypePR( theCtxt, theInverseOFprojectionType);

      // If toMove InverseOFprojectionType not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFprojectionTypeLength - 1) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFprojectionType = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFprojectionType;

      // Allocate new array for new version of state of relationship InverseOFprojectionType
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionTypeLength];
    try {
      System.arraycopy( someInverseOFprojectionType, 0, otherInverseOFprojectionType, 0, aToMoveIndex );
      System.arraycopy( someInverseOFprojectionType, aToMoveIndex + 1, otherInverseOFprojectionType, aToMoveIndex, aInverseOFprojectionTypeLength - aToMoveIndex - 1);
      otherInverseOFprojectionType[ aInverseOFprojectionTypeLength - 1] = aToMoveInverseOFprojectionType;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectionTypeToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectionTypeToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFprojectionTypeToLast", null); return;}

      // Set the new collection
    setInverseOFprojectionTypePrivileged( theCtxt, otherInverseOFprojectionType);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFprojectionType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFprojectionType
     */
  public void addInverseOFprojectionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFprojectionType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectionType == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionType = getInverseOFprojectionTypePrivileged( theCtxt);
    if( someInverseOFprojectionType == null) { return;}

      // Check for new InverseOFprojectionType already in collection
    int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectionTypeLength ; anIndex++) {
      if( theInverseOFprojectionType.sameAs( theCtxt, someInverseOFprojectionType[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFprojectionType element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionTypeLength + 1];
    try {
      System.arraycopy( someInverseOFprojectionType, 0, otherInverseOFprojectionType, 0, aInverseOFprojectionTypeLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionTypePrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionTypePrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFprojectionTypePrivileged", null); return;}

    otherInverseOFprojectionType[ aInverseOFprojectionTypeLength] = theInverseOFprojectionType;

      // Set the new collection
    setInverseOFprojectionTypePrivileged( theCtxt, otherInverseOFprojectionType);
  }









    /* Privileged Write accessor for role InverseOFprojectionType
     */
  public void removeInverseOFprojectionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFprojectionType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFprojectionType == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFprojectionType = getInverseOFprojectionTypePrivileged( theCtxt);
    if( someInverseOFprojectionType == null) { return;}

      // Check for new InverseOFprojectionType not in collection
    int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFprojectionTypeLength ; anIndex++) {
      if( theInverseOFprojectionType.sameAs( theCtxt, someInverseOFprojectionType[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFprojectionType element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFprojectionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFprojectionTypeLength - 1];
    try {
      System.arraycopy( someInverseOFprojectionType, 0, otherInverseOFprojectionType, 0, aFoundIndex);
      System.arraycopy( someInverseOFprojectionType, aFoundIndex + 1, otherInverseOFprojectionType, aFoundIndex, aInverseOFprojectionTypeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectionTypePrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectionTypePrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFprojectionTypePrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFprojectionTypePrivileged( theCtxt, otherInverseOFprojectionType);
  }






    /* Privileged Read accessor for role InverseOFprojectionType
     * Guaranteed to return object with same identity of the InverseOFprojectionType
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFprojectionTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFprojectionType;
  }




    /* Set reference in role InverseOFprojectionType
     * Used by relationship maintenance machinery
     */
  public void setInverseOFprojectionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFprojectionTypeCollection) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] aInverseOFprojectionType = vrInverseOFprojectionType;
    vrInverseOFprojectionType = theInverseOFprojectionTypeCollection;
      // Propagate change
    change( theCtxt, "InverseOFprojectionType", aInverseOFprojectionType, vrInverseOFprojectionType, "vrInverseOFprojectionType");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFexclusionType
 ****************************************************************************/


    /* Public Read accessor for role InverseOFexclusionType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFexclusionType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFexclusionTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFexclusionTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public InverseOFexclusionType number access
     */
  public int numInverseOFexclusionType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFexclusionTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFexclusionTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public InverseOFexclusionType read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFexclusionTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFexclusionTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFexclusionTypeAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public InverseOFexclusionType finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFexclusionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFexclusionTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFexclusionTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public InverseOFexclusionType is related predicate
     */
  public boolean hasInverseOFexclusionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFexclusionTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFexclusionTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional InverseOFexclusionType is related  predicate
     */
  public boolean hasInverseOFexclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public InverseOFexclusionType index access
     */
  public int indexOfInverseOFexclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFexclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFexclusionTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFexclusionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFexclusionTypeBeforePR( theCtxt, theInverseOFexclusionType, theRelativeInverseOFexclusionType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFexclusionTypeBeforePR( theCtxt, theInverseOFexclusionType, theRelativeInverseOFexclusionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role InverseOFexclusionType
     */
  public void removeInverseOFexclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFexclusionType
     */
  public void moveInverseOFexclusionTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFexclusionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFexclusionTypeBeforePR( theCtxt, theInverseOFexclusionType, theRelativeInverseOFexclusionType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFexclusionTypeBeforePR( theCtxt, theInverseOFexclusionType, theRelativeInverseOFexclusionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFexclusionType
     */
  public void moveInverseOFexclusionTypeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFexclusionTypeToLastPR( theCtxt, theInverseOFexclusionType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFexclusionTypeToLastPR( theCtxt, theInverseOFexclusionType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship InverseOFexclusionType
 ****************************************************************************/


    /* Public Read accessor for role InverseOFexclusionType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFexclusionTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFexclusionType = getInverseOFexclusionTypePrivileged( theCtxt);
    if( someInverseOFexclusionType == null) { return null;}

    int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] otherInverseOFexclusionType = new com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[ aInverseOFexclusionTypeLength];
    try { System.arraycopy( someInverseOFexclusionType, 0, otherInverseOFexclusionType, 0, aInverseOFexclusionTypeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFexclusionType", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFexclusionType", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFexclusionType", null); return null;}


    return otherInverseOFexclusionType;
  }



    /* Public InverseOFexclusionType finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFexclusionTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFexclusionType = getInverseOFexclusionTypePrivileged( theCtxt);
    if( someInverseOFexclusionType == null) { return null;}

      // Check for new InverseOFexclusionType already in collection
    int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFexclusionTypeLength ; anIndex++) {
      com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aInverseOFexclusionType = someInverseOFexclusionType[ anIndex];
      if( aInverseOFexclusionType.sameNameAs( theCtxt, theMMName)) { return aInverseOFexclusionType;}
    }
    return null;
  }



    /* Public InverseOFexclusionType finder predicate by name
     */
  public boolean hasInverseOFexclusionTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFexclusionTypeNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFexclusionType read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFexclusionTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFexclusionType = getInverseOFexclusionTypePrivileged( theCtxt);
    if( someInverseOFexclusionType == null) { return null;}

      // Get number of InverseOFexclusionType
    int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;

      // Verify index within array length
    if( theIndex >= aInverseOFexclusionTypeLength) { return null;}

      // Get indexed InverseOFexclusionType
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFexclusionType = someInverseOFexclusionType[ theIndex];

    return aInverseOFexclusionType;
  }



    /* Public InverseOFexclusionType is related predicate
     */
  public boolean hasInverseOFexclusionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException {
    return indexOfInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType) >= 0;
  }


    /* Public InverseOFexclusionType index access
     */
  public int indexOfInverseOFexclusionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFexclusionType == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFexclusionType = getInverseOFexclusionTypePrivileged( theCtxt);
    if( someInverseOFexclusionType == null) { return -1;}

      // Check for new InverseOFexclusionType already in collection
    int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFexclusionTypeLength ; anIndex++) {
      if( someInverseOFexclusionType[ anIndex].sameAs( theCtxt, theInverseOFexclusionType)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFexclusionType number access
     */
  public int numInverseOFexclusionTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFexclusionType = getInverseOFexclusionTypePrivileged( theCtxt);
    if( someInverseOFexclusionType == null) { return 0;}

      // Check for new InverseOFexclusionType already in collection
    int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;
    return aInverseOFexclusionTypeLength;
  }




    /* Public Write accessor for role InverseOFexclusionType
     */
  public void addInverseOFexclusionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFexclusionType == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexclusionType = getInverseOFexclusionTypePrivileged( theCtxt);
    if( someInverseOFexclusionType == null) { return;}

      // Check for new InverseOFexclusionType already in collection
    int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFexclusionTypeLength ; anIndex++) {
      if( theInverseOFexclusionType.sameAs( theCtxt, someInverseOFexclusionType[ anIndex])) { return;}
    }

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFexclusionType = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFexclusionType;

      // Link reverse ref to this object
    aNewInverseOFexclusionType.unsetAndSetExclusionTypePrivileged( theCtxt, this);

      // Grow collection and add new InverseOFexclusionType element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexclusionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexclusionTypeLength + 1];
    try { System.arraycopy( someInverseOFexclusionType, 0, otherInverseOFexclusionType, 0, aInverseOFexclusionTypeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexclusionType", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexclusionType", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexclusionType", null); return;}
    otherInverseOFexclusionType[ aInverseOFexclusionTypeLength] = aNewInverseOFexclusionType;

      // Set the new collection
    setInverseOFexclusionTypePrivileged( theCtxt, otherInverseOFexclusionType);
  }




    /* Public ordered Write accessor for role InverseOFexclusionType
     */
  public void addInverseOFexclusionTypeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFexclusionType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFexclusionType == null) { return;}

      // If relative InverseOFexclusionType is null, perform normal add operation
    if( theRelativeInverseOFexclusionType == null) {
      addInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexclusionType = getInverseOFexclusionTypePrivileged( theCtxt);
    if( someInverseOFexclusionType == null) { return;}


      // Get index of relative InverseOFexclusionType
    int aRelativeIndex = indexOfInverseOFexclusionTypePR( theCtxt, theRelativeInverseOFexclusionType);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);
    }

      // Get length of InverseOFexclusionType array
    int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFexclusionTypeLength) {
      addInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);
    }

      // Check for new InverseOFexclusionType already in collection
    if( hasInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType)) { return;}


    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFexclusionType = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFexclusionType;

      // Link reverse ref to this object
    aNewInverseOFexclusionType.unsetAndSetExclusionTypePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFexclusionType
      // Grow collection and add new InverseOFexclusionType element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexclusionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexclusionTypeLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFexclusionType, 0, otherInverseOFexclusionType, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFexclusionType, aRelativeIndex, otherInverseOFexclusionType, aRelativeIndex + 1, aInverseOFexclusionTypeLength - aRelativeIndex);
      otherInverseOFexclusionType[ aRelativeIndex] = aNewInverseOFexclusionType;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexclusionTypeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexclusionTypeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexclusionTypeBefore", null); return;}

      // Set the new collection
    setInverseOFexclusionTypePrivileged( theCtxt, otherInverseOFexclusionType);
  }





    /* Public Write accessor for role InverseOFexclusionType
     */
  public void removeInverseOFexclusionTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFexclusionType == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexclusionType = getInverseOFexclusionTypePrivileged( theCtxt);
    if( someInverseOFexclusionType == null) { return;}

      // Check for new InverseOFexclusionType not in collection
    int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFexclusionTypeLength ; anIndex++) {
      if( theInverseOFexclusionType.sameAs( theCtxt, someInverseOFexclusionType[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFexclusionType = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFexclusionType;

      // Unlink reverse ref from the new related object
    aNewInverseOFexclusionType.unsetExclusionTypePrivileged( theCtxt);

      // Shrink collection removing InverseOFexclusionType element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexclusionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexclusionTypeLength - 1];
    try {
      System.arraycopy( someInverseOFexclusionType, 0, otherInverseOFexclusionType, 0, aFoundIndex);
      System.arraycopy( someInverseOFexclusionType, aFoundIndex + 1, otherInverseOFexclusionType, aFoundIndex, aInverseOFexclusionTypeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFexclusionType", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFexclusionType", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFexclusionType", null); return;}

      // Set the new collection
    setInverseOFexclusionTypePrivileged( theCtxt, otherInverseOFexclusionType);
  }




    /* Public reorder accessor for role InverseOFexclusionType
     */
  public void moveInverseOFexclusionTypeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFexclusionType) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFexclusionType == null) { return;}

      // If relative InverseOFexclusionType is null, perform move to last position
    if( theRelativeInverseOFexclusionType == null) {
      moveInverseOFexclusionTypeToLastPR( theCtxt, theInverseOFexclusionType);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexclusionType = getInverseOFexclusionTypePrivileged( theCtxt);
    if( someInverseOFexclusionType == null) { return;}

      // Get length of InverseOFexclusionType array
    int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;

      // Get index of InverseOFexclusionType to move
    int aToMoveIndex = indexOfInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);
      // If toMove InverseOFexclusionType not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFexclusionTypeLength) {
      moveInverseOFexclusionTypeToLastPR( theCtxt, theInverseOFexclusionType);
    }

      // Get index of relative InverseOFexclusionType
    int aRelativeIndex = indexOfInverseOFexclusionTypePR( theCtxt, theRelativeInverseOFexclusionType);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFexclusionTypeToLastPR( theCtxt, theInverseOFexclusionType);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFexclusionTypeLength) {
      moveInverseOFexclusionTypeToLastPR( theCtxt, theInverseOFexclusionType);
    }

      // ToMove and relative InverseOFexclusionType are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFexclusionType = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFexclusionType;

      // Allocate new array for new version of state of relationship InverseOFexclusionType
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexclusionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexclusionTypeLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFexclusionType, 0, otherInverseOFexclusionType, 0, aToMoveIndex );
        System.arraycopy( someInverseOFexclusionType, aToMoveIndex + 1, otherInverseOFexclusionType, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFexclusionType[ aRelativeIndex - 1] = aToMoveInverseOFexclusionType;
        System.arraycopy( someInverseOFexclusionType, aRelativeIndex, otherInverseOFexclusionType, aRelativeIndex, aInverseOFexclusionTypeLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFexclusionType, 0, otherInverseOFexclusionType, 0, aRelativeIndex );
        otherInverseOFexclusionType[ aRelativeIndex ] = aToMoveInverseOFexclusionType;
        System.arraycopy( someInverseOFexclusionType, aRelativeIndex, otherInverseOFexclusionType, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFexclusionTypeLength - 1) {
          System.arraycopy( someInverseOFexclusionType, aToMoveIndex + 1, otherInverseOFexclusionType, aToMoveIndex + 1, aInverseOFexclusionTypeLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFexclusionTypeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFexclusionTypeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFexclusionTypeBefore", null); return;}

      // Set the new collection
    setInverseOFexclusionTypePrivileged( theCtxt, otherInverseOFexclusionType);
  }





    /* Public move to last accessor for role InverseOFexclusionType
     */
  public void moveInverseOFexclusionTypeToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFexclusionType == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexclusionType = getInverseOFexclusionTypePrivileged( theCtxt);
    if( someInverseOFexclusionType == null) { return;}

      // Get length of InverseOFexclusionType array
    int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;

      // Get index of InverseOFexclusionType to move
    int aToMoveIndex = indexOfInverseOFexclusionTypePR( theCtxt, theInverseOFexclusionType);

      // If toMove InverseOFexclusionType not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFexclusionTypeLength - 1) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFexclusionType = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFexclusionType;

      // Allocate new array for new version of state of relationship InverseOFexclusionType
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexclusionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexclusionTypeLength];
    try {
      System.arraycopy( someInverseOFexclusionType, 0, otherInverseOFexclusionType, 0, aToMoveIndex );
      System.arraycopy( someInverseOFexclusionType, aToMoveIndex + 1, otherInverseOFexclusionType, aToMoveIndex, aInverseOFexclusionTypeLength - aToMoveIndex - 1);
      otherInverseOFexclusionType[ aInverseOFexclusionTypeLength - 1] = aToMoveInverseOFexclusionType;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFexclusionTypeToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFexclusionTypeToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFexclusionTypeToLast", null); return;}

      // Set the new collection
    setInverseOFexclusionTypePrivileged( theCtxt, otherInverseOFexclusionType);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFexclusionType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFexclusionType
     */
  public void addInverseOFexclusionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFexclusionType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFexclusionType == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexclusionType = getInverseOFexclusionTypePrivileged( theCtxt);
    if( someInverseOFexclusionType == null) { return;}

      // Check for new InverseOFexclusionType already in collection
    int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;
    for( int anIndex = 0 ; anIndex < aInverseOFexclusionTypeLength ; anIndex++) {
      if( theInverseOFexclusionType.sameAs( theCtxt, someInverseOFexclusionType[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFexclusionType element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexclusionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexclusionTypeLength + 1];
    try {
      System.arraycopy( someInverseOFexclusionType, 0, otherInverseOFexclusionType, 0, aInverseOFexclusionTypeLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexclusionTypePrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexclusionTypePrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexclusionTypePrivileged", null); return;}

    otherInverseOFexclusionType[ aInverseOFexclusionTypeLength] = theInverseOFexclusionType;

      // Set the new collection
    setInverseOFexclusionTypePrivileged( theCtxt, otherInverseOFexclusionType);
  }









    /* Privileged Write accessor for role InverseOFexclusionType
     */
  public void removeInverseOFexclusionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFexclusionType) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFexclusionType == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFexclusionType = getInverseOFexclusionTypePrivileged( theCtxt);
    if( someInverseOFexclusionType == null) { return;}

      // Check for new InverseOFexclusionType not in collection
    int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFexclusionTypeLength ; anIndex++) {
      if( theInverseOFexclusionType.sameAs( theCtxt, someInverseOFexclusionType[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFexclusionType element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexclusionType = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexclusionTypeLength - 1];
    try {
      System.arraycopy( someInverseOFexclusionType, 0, otherInverseOFexclusionType, 0, aFoundIndex);
      System.arraycopy( someInverseOFexclusionType, aFoundIndex + 1, otherInverseOFexclusionType, aFoundIndex, aInverseOFexclusionTypeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFexclusionTypePrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFexclusionTypePrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFexclusionTypePrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFexclusionTypePrivileged( theCtxt, otherInverseOFexclusionType);
  }






    /* Privileged Read accessor for role InverseOFexclusionType
     * Guaranteed to return object with same identity of the InverseOFexclusionType
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFexclusionTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFexclusionType;
  }




    /* Set reference in role InverseOFexclusionType
     * Used by relationship maintenance machinery
     */
  public void setInverseOFexclusionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFexclusionTypeCollection) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] aInverseOFexclusionType = vrInverseOFexclusionType;
    vrInverseOFexclusionType = theInverseOFexclusionTypeCollection;
      // Propagate change
    change( theCtxt, "InverseOFexclusionType", aInverseOFexclusionType, vrInverseOFexclusionType, "vrInverseOFexclusionType");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship Module
 ****************************************************************************/


    /* Public Read accessor for role Module
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getModule( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getModulePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getModulePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public Module number access
     */
  public int numModule( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numModulePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numModulePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public Module read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getModuleAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getModuleAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getModuleAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public Module finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc findModuleNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findModuleNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findModuleNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public Module is related predicate
     */
  public boolean hasModuleNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasModuleNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasModuleNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional Module is related  predicate
     */
  public boolean hasModule( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theModule) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasModulePR( theCtxt, theModule);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasModulePR( theCtxt, theModule);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public Module index access
     */
  public int indexOfModule( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theModule) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfModulePR( theCtxt, theModule);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfModulePR( theCtxt, theModule);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public Write accessor for role Module
     */
  public void setModule( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theModule) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setModulePR( theCtxt, theModule);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setModulePR( theCtxt, theModule);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship Module
 ****************************************************************************/


    /* Public Read accessor for role Module
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getModulePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getModulePrivileged( theCtxt);
  }


    /* Public Module number access
     */
  public int numModulePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getModulePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public Module read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getModuleAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getModulePrivileged( theCtxt);
  }


    /* Public Module finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc findModuleNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = getModulePrivileged( theCtxt);
    if( aModule == null) { return null;}

    if( !aModule.sameNameAs( theCtxt, theMMName)) { return null;}

    return aModule;
  }


    /* Public Module finder predicate by name
     */
  public boolean hasModuleNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = getModulePrivileged( theCtxt);
    if( aModule == null) { return false;}

    return aModule.sameNameAs( theCtxt, theMMName);
  }



    /* Public Module is related predicate
     */
  public boolean hasModulePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theModule) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = getModulePrivileged( theCtxt);
    if( aModule == null) { return false;}

    return aModule.sameAs( theCtxt, theModule);
  }




    /* Public Module index access
     */
  public int indexOfModulePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theModule) throws EAIException {
    if( !hasModulePR( theCtxt, theModule)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role Module
     */
  public void setModulePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theModule) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3ModulePriv aModule = getModulePrivileged( theCtxt);
      // Check for new Module same as current one
    if( aModule != null && aModule.sameAs( theCtxt, theModule)) { return;}

    if( aModule != null) {
      aModule.removeTypesPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetModulePrivileged();
      */
    }

    if( theModule != null) {
      com.dosmil_e.m3.core.priv.M3ModulePriv aNewModule = (com.dosmil_e.m3.core.priv.M3ModulePriv) theModule;
      aNewModule.addTypesPrivileged( theCtxt, this);
      setModulePrivileged( theCtxt, aNewModule);
    }
    else {
      setModulePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship Module
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role Module
     * Guaranteed to return object with same identity of the Module
     */
  public com.dosmil_e.m3.core.priv.M3ModulePriv getModulePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrModule;
  }




    /* Remove current reference in role Module
     * Used by relationship maintenance machinery
     */
  public void unsetModulePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = vrModule;
    vrModule = null;
      // If there was change, propagate
    if( aModule != null) {
      change( theCtxt, "Module", aModule, vrModule, "vrModule");
    }
  }





    /* Set reference in role Module
     * Used by relationship maintenance machinery
     */
  public void setModulePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModulePriv theModule) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = vrModule;
    vrModule = theModule;
      // If there was change, propagate
    if( (aModule != null && !aModule.sameAs( theCtxt, theModule)) || (aModule == null && theModule != null)) {
      change( theCtxt, "Module", aModule, vrModule, "vrModule");
    }
  }





    /* Unset currently related Module and
     * Set reference in role Module
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetModulePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModulePriv theModule) throws EAIException {
    com.dosmil_e.m3.core.priv.M3ModulePriv aModule = vrModule;
    if( aModule != null) {
      aModule.removeTypesPrivileged( theCtxt, this);
    }
    vrModule = theModule;
      // If there was change, propagate
    if( (aModule != null && !aModule.sameAs( theCtxt, theModule)) || (aModule == null && theModule != null)) {
      change( theCtxt, "Module", aModule, vrModule, "vrModule");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship Attributes
 ****************************************************************************/


    /* Public Read accessor for role Attributes
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc[] getAttributes( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getAttributesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getAttributesPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public Attributes number access
     */
  public int numAttributes( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numAttributesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numAttributesPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public Attributes read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getAttributesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getAttributesAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getAttributesAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public Attributes finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findAttributesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findAttributesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findAttributesNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public Attributes is related predicate
     */
  public boolean hasAttributesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasAttributesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasAttributesNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional Attributes is related  predicate
     */
  public boolean hasAttributes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasAttributesPR( theCtxt, theAttributes);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasAttributesPR( theCtxt, theAttributes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public Attributes index access
     */
  public int indexOfAttributes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfAttributesPR( theCtxt, theAttributes);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfAttributesPR( theCtxt, theAttributes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addAttributes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addAttributesPR( theCtxt, theAttributes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addAttributesPR( theCtxt, theAttributes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addAttributesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes, com.dosmil_e.m3.core.ifc.M3AttributeIfc theRelativeAttributes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addAttributesBeforePR( theCtxt, theAttributes, theRelativeAttributes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addAttributesBeforePR( theCtxt, theAttributes, theRelativeAttributes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role Attributes
     */
  public void removeAttributes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeAttributesPR( theCtxt, theAttributes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeAttributesPR( theCtxt, theAttributes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role Attributes
     */
  public void moveAttributesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes, com.dosmil_e.m3.core.ifc.M3AttributeIfc theRelativeAttributes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveAttributesBeforePR( theCtxt, theAttributes, theRelativeAttributes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveAttributesBeforePR( theCtxt, theAttributes, theRelativeAttributes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role Attributes
     */
  public void moveAttributesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveAttributesToLastPR( theCtxt, theAttributes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveAttributesToLastPR( theCtxt, theAttributes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship Attributes
 ****************************************************************************/


    /* Public Read accessor for role Attributes
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc[] getAttributesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.priv.M3AttributePriv[] someAttributes = getAttributesPrivileged( theCtxt);
    if( someAttributes == null) { return null;}

    int aAttributesLength = someAttributes.length;
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] otherAttributes = new com.dosmil_e.m3.core.ifc.M3AttributeIfc[ aAttributesLength];
    try { System.arraycopy( someAttributes, 0, otherAttributes, 0, aAttributesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getAttributes", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getAttributes", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getAttributes", null); return null;}


    return otherAttributes;
  }



    /* Public Attributes finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findAttributesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv[] someAttributes = getAttributesPrivileged( theCtxt);
    if( someAttributes == null) { return null;}

      // Check for new Attributes already in collection
    int aAttributesLength = someAttributes.length;
    for( int anIndex = 0 ; anIndex < aAttributesLength ; anIndex++) {
      com.dosmil_e.m3.core.priv.M3AttributePriv aAttributes = someAttributes[ anIndex];
      if( aAttributes.sameNameAs( theCtxt, theMMName)) { return aAttributes;}
    }
    return null;
  }



    /* Public Attributes finder predicate by name
     */
  public boolean hasAttributesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findAttributesNamedPR( theCtxt, theMMName) != null;
  }


    /* Public Attributes read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getAttributesAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv[] someAttributes = getAttributesPrivileged( theCtxt);
    if( someAttributes == null) { return null;}

      // Get number of Attributes
    int aAttributesLength = someAttributes.length;

      // Verify index within array length
    if( theIndex >= aAttributesLength) { return null;}

      // Get indexed Attributes
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aAttributes = someAttributes[ theIndex];

    return aAttributes;
  }



    /* Public Attributes is related predicate
     */
  public boolean hasAttributesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException {
    return indexOfAttributesPR( theCtxt, theAttributes) >= 0;
  }


    /* Public Attributes index access
     */
  public int indexOfAttributesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException {
      // Do not add null values to the collection
    if( theAttributes == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv[] someAttributes = getAttributesPrivileged( theCtxt);
    if( someAttributes == null) { return -1;}

      // Check for new Attributes already in collection
    int aAttributesLength = someAttributes.length;
    for( int anIndex = 0 ; anIndex < aAttributesLength ; anIndex++) {
      if( someAttributes[ anIndex].sameAs( theCtxt, theAttributes)) { return anIndex;}
    }
    return -1;
  }


    /* Public Attributes number access
     */
  public int numAttributesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv[] someAttributes = getAttributesPrivileged( theCtxt);
    if( someAttributes == null) { return 0;}

      // Check for new Attributes already in collection
    int aAttributesLength = someAttributes.length;
    return aAttributesLength;
  }




    /* Public Write accessor for role Attributes
     */
  public void addAttributesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException {

      // Do not add null values to the collection
    if( theAttributes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someAttributes = getAttributesPrivileged( theCtxt);
    if( someAttributes == null) { return;}

      // Check for new Attributes already in collection
    int aAttributesLength = someAttributes.length;
    for( int anIndex = 0 ; anIndex < aAttributesLength ; anIndex++) {
      if( theAttributes.sameAs( theCtxt, someAttributes[ anIndex])) { return;}
    }

    com.dosmil_e.m3.core.priv.M3AttributePriv aNewAttributes = (com.dosmil_e.m3.core.priv.M3AttributePriv) theAttributes;

      // Link reverse ref to this object
    aNewAttributes.unsetAndSetTypePrivileged( theCtxt, this);

      // Grow collection and add new Attributes element
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherAttributes = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aAttributesLength + 1];
    try { System.arraycopy( someAttributes, 0, otherAttributes, 0, aAttributesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributes", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributes", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributes", null); return;}
    otherAttributes[ aAttributesLength] = aNewAttributes;

      // Set the new collection
    setAttributesPrivileged( theCtxt, otherAttributes);
  }




    /* Public ordered Write accessor for role Attributes
     */
  public void addAttributesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes, com.dosmil_e.m3.core.ifc.M3AttributeIfc theRelativeAttributes) throws EAIException {

      // Do not add null values to the collection
    if( theAttributes == null) { return;}

      // If relative Attributes is null, perform normal add operation
    if( theRelativeAttributes == null) {
      addAttributesPR( theCtxt, theAttributes);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someAttributes = getAttributesPrivileged( theCtxt);
    if( someAttributes == null) { return;}


      // Get index of relative Attributes
    int aRelativeIndex = indexOfAttributesPR( theCtxt, theRelativeAttributes);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addAttributesPR( theCtxt, theAttributes);
    }

      // Get length of Attributes array
    int aAttributesLength = someAttributes.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aAttributesLength) {
      addAttributesPR( theCtxt, theAttributes);
    }

      // Check for new Attributes already in collection
    if( hasAttributesPR( theCtxt, theAttributes)) { return;}


    com.dosmil_e.m3.core.priv.M3AttributePriv aNewAttributes = (com.dosmil_e.m3.core.priv.M3AttributePriv) theAttributes;

      // Link reverse ref to this object
    aNewAttributes.unsetAndSetTypePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship Attributes
      // Grow collection and add new Attributes element
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherAttributes = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aAttributesLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someAttributes, 0, otherAttributes, 0, aRelativeIndex );
      }
      System.arraycopy( someAttributes, aRelativeIndex, otherAttributes, aRelativeIndex + 1, aAttributesLength - aRelativeIndex);
      otherAttributes[ aRelativeIndex] = aNewAttributes;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributesBefore", null); return;}

      // Set the new collection
    setAttributesPrivileged( theCtxt, otherAttributes);
  }





    /* Public Write accessor for role Attributes
     */
  public void removeAttributesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException {

      // Do not add null values to the collection
    if( theAttributes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someAttributes = getAttributesPrivileged( theCtxt);
    if( someAttributes == null) { return;}

      // Check for new Attributes not in collection
    int aAttributesLength = someAttributes.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aAttributesLength ; anIndex++) {
      if( theAttributes.sameAs( theCtxt, someAttributes[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.core.priv.M3AttributePriv aNewAttributes = (com.dosmil_e.m3.core.priv.M3AttributePriv) theAttributes;

      // Unlink reverse ref from the new related object
    aNewAttributes.unsetTypePrivileged( theCtxt);

      // Shrink collection removing Attributes element
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherAttributes = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aAttributesLength - 1];
    try {
      System.arraycopy( someAttributes, 0, otherAttributes, 0, aFoundIndex);
      System.arraycopy( someAttributes, aFoundIndex + 1, otherAttributes, aFoundIndex, aAttributesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributes", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributes", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributes", null); return;}

      // Set the new collection
    setAttributesPrivileged( theCtxt, otherAttributes);
  }




    /* Public reorder accessor for role Attributes
     */
  public void moveAttributesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes, com.dosmil_e.m3.core.ifc.M3AttributeIfc theRelativeAttributes) throws EAIException {

      // Null value is nothing to move
    if( theAttributes == null) { return;}

      // If relative Attributes is null, perform move to last position
    if( theRelativeAttributes == null) {
      moveAttributesToLastPR( theCtxt, theAttributes);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someAttributes = getAttributesPrivileged( theCtxt);
    if( someAttributes == null) { return;}

      // Get length of Attributes array
    int aAttributesLength = someAttributes.length;

      // Get index of Attributes to move
    int aToMoveIndex = indexOfAttributesPR( theCtxt, theAttributes);
      // If toMove Attributes not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aAttributesLength) {
      moveAttributesToLastPR( theCtxt, theAttributes);
    }

      // Get index of relative Attributes
    int aRelativeIndex = indexOfAttributesPR( theCtxt, theRelativeAttributes);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveAttributesToLastPR( theCtxt, theAttributes);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aAttributesLength) {
      moveAttributesToLastPR( theCtxt, theAttributes);
    }

      // ToMove and relative Attributes are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.core.priv.M3AttributePriv aToMoveAttributes = (com.dosmil_e.m3.core.priv.M3AttributePriv) theAttributes;

      // Allocate new array for new version of state of relationship Attributes
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherAttributes = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aAttributesLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someAttributes, 0, otherAttributes, 0, aToMoveIndex );
        System.arraycopy( someAttributes, aToMoveIndex + 1, otherAttributes, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherAttributes[ aRelativeIndex - 1] = aToMoveAttributes;
        System.arraycopy( someAttributes, aRelativeIndex, otherAttributes, aRelativeIndex, aAttributesLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someAttributes, 0, otherAttributes, 0, aRelativeIndex );
        otherAttributes[ aRelativeIndex ] = aToMoveAttributes;
        System.arraycopy( someAttributes, aRelativeIndex, otherAttributes, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aAttributesLength - 1) {
          System.arraycopy( someAttributes, aToMoveIndex + 1, otherAttributes, aToMoveIndex + 1, aAttributesLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributesBefore", null); return;}

      // Set the new collection
    setAttributesPrivileged( theCtxt, otherAttributes);
  }





    /* Public move to last accessor for role Attributes
     */
  public void moveAttributesToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException {

      // Null value is nothing to move
    if( theAttributes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someAttributes = getAttributesPrivileged( theCtxt);
    if( someAttributes == null) { return;}

      // Get length of Attributes array
    int aAttributesLength = someAttributes.length;

      // Get index of Attributes to move
    int aToMoveIndex = indexOfAttributesPR( theCtxt, theAttributes);

      // If toMove Attributes not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aAttributesLength - 1) { return;}

    com.dosmil_e.m3.core.priv.M3AttributePriv aToMoveAttributes = (com.dosmil_e.m3.core.priv.M3AttributePriv) theAttributes;

      // Allocate new array for new version of state of relationship Attributes
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherAttributes = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aAttributesLength];
    try {
      System.arraycopy( someAttributes, 0, otherAttributes, 0, aToMoveIndex );
      System.arraycopy( someAttributes, aToMoveIndex + 1, otherAttributes, aToMoveIndex, aAttributesLength - aToMoveIndex - 1);
      otherAttributes[ aAttributesLength - 1] = aToMoveAttributes;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributesToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributesToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributesToLast", null); return;}

      // Set the new collection
    setAttributesPrivileged( theCtxt, otherAttributes);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship Attributes
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role Attributes
     */
  public void addAttributesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theAttributes) throws EAIException {

      // Do not add null values to the collection
    if( theAttributes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someAttributes = getAttributesPrivileged( theCtxt);
    if( someAttributes == null) { return;}

      // Check for new Attributes already in collection
    int aAttributesLength = someAttributes.length;
    for( int anIndex = 0 ; anIndex < aAttributesLength ; anIndex++) {
      if( theAttributes.sameAs( theCtxt, someAttributes[ anIndex])) { return;}
    }

      // Grow collection and add new Attributes element
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherAttributes = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aAttributesLength + 1];
    try {
      System.arraycopy( someAttributes, 0, otherAttributes, 0, aAttributesLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributesPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributesPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributesPrivileged", null); return;}

    otherAttributes[ aAttributesLength] = theAttributes;

      // Set the new collection
    setAttributesPrivileged( theCtxt, otherAttributes);
  }









    /* Privileged Write accessor for role Attributes
     */
  public void removeAttributesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theAttributes) throws EAIException {

      // Do not add null values to the collection
    if( theAttributes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv[] someAttributes = getAttributesPrivileged( theCtxt);
    if( someAttributes == null) { return;}

      // Check for new Attributes not in collection
    int aAttributesLength = someAttributes.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aAttributesLength ; anIndex++) {
      if( theAttributes.sameAs( theCtxt, someAttributes[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing Attributes element
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherAttributes = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aAttributesLength - 1];
    try {
      System.arraycopy( someAttributes, 0, otherAttributes, 0, aFoundIndex);
      System.arraycopy( someAttributes, aFoundIndex + 1, otherAttributes, aFoundIndex, aAttributesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3AttributePriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3AttributePriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3AttributePriv.class}); return;}

      // Set the new collection
    setAttributesPrivileged( theCtxt, otherAttributes);
  }






    /* Privileged Read accessor for role Attributes
     * Guaranteed to return object with same identity of the Attributes
     */
  public com.dosmil_e.m3.core.priv.M3AttributePriv[] getAttributesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrAttributes;
  }




    /* Set reference in role Attributes
     * Used by relationship maintenance machinery
     */
  public void setAttributesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv[] theAttributesCollection) throws EAIException {
    com.dosmil_e.m3.core.priv.M3AttributePriv[] aAttributes = vrAttributes;
    vrAttributes = theAttributesCollection;
      // Propagate change
    change( theCtxt, "Attributes", aAttributes, vrAttributes, "vrAttributes");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship TypeOfValues
 ****************************************************************************/


    /* Public Read accessor for role TypeOfValues
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc[] getTypeOfValues( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTypeOfValuesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTypeOfValuesPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public TypeOfValues number access
     */
  public int numTypeOfValues( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numTypeOfValuesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numTypeOfValuesPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public TypeOfValues read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getTypeOfValuesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTypeOfValuesAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTypeOfValuesAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public TypeOfValues finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findTypeOfValuesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findTypeOfValuesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findTypeOfValuesNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public TypeOfValues is related predicate
     */
  public boolean hasTypeOfValuesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTypeOfValuesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTypeOfValuesNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional TypeOfValues is related  predicate
     */
  public boolean hasTypeOfValues( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTypeOfValuesPR( theCtxt, theTypeOfValues);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTypeOfValuesPR( theCtxt, theTypeOfValues);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public TypeOfValues index access
     */
  public int indexOfTypeOfValues( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfTypeOfValuesPR( theCtxt, theTypeOfValues);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfTypeOfValuesPR( theCtxt, theTypeOfValues);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addTypeOfValues( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addTypeOfValuesPR( theCtxt, theTypeOfValues);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addTypeOfValuesPR( theCtxt, theTypeOfValues);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addTypeOfValuesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues, com.dosmil_e.m3.core.ifc.M3AttributeIfc theRelativeTypeOfValues) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addTypeOfValuesBeforePR( theCtxt, theTypeOfValues, theRelativeTypeOfValues);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addTypeOfValuesBeforePR( theCtxt, theTypeOfValues, theRelativeTypeOfValues);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role TypeOfValues
     */
  public void removeTypeOfValues( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeTypeOfValuesPR( theCtxt, theTypeOfValues);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeTypeOfValuesPR( theCtxt, theTypeOfValues);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role TypeOfValues
     */
  public void moveTypeOfValuesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues, com.dosmil_e.m3.core.ifc.M3AttributeIfc theRelativeTypeOfValues) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveTypeOfValuesBeforePR( theCtxt, theTypeOfValues, theRelativeTypeOfValues);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveTypeOfValuesBeforePR( theCtxt, theTypeOfValues, theRelativeTypeOfValues);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role TypeOfValues
     */
  public void moveTypeOfValuesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveTypeOfValuesToLastPR( theCtxt, theTypeOfValues);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveTypeOfValuesToLastPR( theCtxt, theTypeOfValues);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship TypeOfValues
 ****************************************************************************/


    /* Public Read accessor for role TypeOfValues
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc[] getTypeOfValuesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.priv.M3AttributePriv[] someTypeOfValues = getTypeOfValuesPrivileged( theCtxt);
    if( someTypeOfValues == null) { return null;}

    int aTypeOfValuesLength = someTypeOfValues.length;
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] otherTypeOfValues = new com.dosmil_e.m3.core.ifc.M3AttributeIfc[ aTypeOfValuesLength];
    try { System.arraycopy( someTypeOfValues, 0, otherTypeOfValues, 0, aTypeOfValuesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getTypeOfValues", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getTypeOfValues", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getTypeOfValues", null); return null;}


    return otherTypeOfValues;
  }



    /* Public TypeOfValues finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findTypeOfValuesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv[] someTypeOfValues = getTypeOfValuesPrivileged( theCtxt);
    if( someTypeOfValues == null) { return null;}

      // Check for new TypeOfValues already in collection
    int aTypeOfValuesLength = someTypeOfValues.length;
    for( int anIndex = 0 ; anIndex < aTypeOfValuesLength ; anIndex++) {
      com.dosmil_e.m3.core.priv.M3AttributePriv aTypeOfValues = someTypeOfValues[ anIndex];
      if( aTypeOfValues.sameNameAs( theCtxt, theMMName)) { return aTypeOfValues;}
    }
    return null;
  }



    /* Public TypeOfValues finder predicate by name
     */
  public boolean hasTypeOfValuesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findTypeOfValuesNamedPR( theCtxt, theMMName) != null;
  }


    /* Public TypeOfValues read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getTypeOfValuesAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv[] someTypeOfValues = getTypeOfValuesPrivileged( theCtxt);
    if( someTypeOfValues == null) { return null;}

      // Get number of TypeOfValues
    int aTypeOfValuesLength = someTypeOfValues.length;

      // Verify index within array length
    if( theIndex >= aTypeOfValuesLength) { return null;}

      // Get indexed TypeOfValues
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aTypeOfValues = someTypeOfValues[ theIndex];

    return aTypeOfValues;
  }



    /* Public TypeOfValues is related predicate
     */
  public boolean hasTypeOfValuesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException {
    return indexOfTypeOfValuesPR( theCtxt, theTypeOfValues) >= 0;
  }


    /* Public TypeOfValues index access
     */
  public int indexOfTypeOfValuesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException {
      // Do not add null values to the collection
    if( theTypeOfValues == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv[] someTypeOfValues = getTypeOfValuesPrivileged( theCtxt);
    if( someTypeOfValues == null) { return -1;}

      // Check for new TypeOfValues already in collection
    int aTypeOfValuesLength = someTypeOfValues.length;
    for( int anIndex = 0 ; anIndex < aTypeOfValuesLength ; anIndex++) {
      if( someTypeOfValues[ anIndex].sameAs( theCtxt, theTypeOfValues)) { return anIndex;}
    }
    return -1;
  }


    /* Public TypeOfValues number access
     */
  public int numTypeOfValuesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv[] someTypeOfValues = getTypeOfValuesPrivileged( theCtxt);
    if( someTypeOfValues == null) { return 0;}

      // Check for new TypeOfValues already in collection
    int aTypeOfValuesLength = someTypeOfValues.length;
    return aTypeOfValuesLength;
  }




    /* Public Write accessor for role TypeOfValues
     */
  public void addTypeOfValuesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException {

      // Do not add null values to the collection
    if( theTypeOfValues == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someTypeOfValues = getTypeOfValuesPrivileged( theCtxt);
    if( someTypeOfValues == null) { return;}

      // Check for new TypeOfValues already in collection
    int aTypeOfValuesLength = someTypeOfValues.length;
    for( int anIndex = 0 ; anIndex < aTypeOfValuesLength ; anIndex++) {
      if( theTypeOfValues.sameAs( theCtxt, someTypeOfValues[ anIndex])) { return;}
    }

    com.dosmil_e.m3.core.priv.M3AttributePriv aNewTypeOfValues = (com.dosmil_e.m3.core.priv.M3AttributePriv) theTypeOfValues;

      // Link reverse ref to this object
    aNewTypeOfValues.unsetAndSetValueTypePrivileged( theCtxt, this);

      // Grow collection and add new TypeOfValues element
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherTypeOfValues = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aTypeOfValuesLength + 1];
    try { System.arraycopy( someTypeOfValues, 0, otherTypeOfValues, 0, aTypeOfValuesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeOfValues", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeOfValues", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeOfValues", null); return;}
    otherTypeOfValues[ aTypeOfValuesLength] = aNewTypeOfValues;

      // Set the new collection
    setTypeOfValuesPrivileged( theCtxt, otherTypeOfValues);
  }




    /* Public ordered Write accessor for role TypeOfValues
     */
  public void addTypeOfValuesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues, com.dosmil_e.m3.core.ifc.M3AttributeIfc theRelativeTypeOfValues) throws EAIException {

      // Do not add null values to the collection
    if( theTypeOfValues == null) { return;}

      // If relative TypeOfValues is null, perform normal add operation
    if( theRelativeTypeOfValues == null) {
      addTypeOfValuesPR( theCtxt, theTypeOfValues);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someTypeOfValues = getTypeOfValuesPrivileged( theCtxt);
    if( someTypeOfValues == null) { return;}


      // Get index of relative TypeOfValues
    int aRelativeIndex = indexOfTypeOfValuesPR( theCtxt, theRelativeTypeOfValues);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addTypeOfValuesPR( theCtxt, theTypeOfValues);
    }

      // Get length of TypeOfValues array
    int aTypeOfValuesLength = someTypeOfValues.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aTypeOfValuesLength) {
      addTypeOfValuesPR( theCtxt, theTypeOfValues);
    }

      // Check for new TypeOfValues already in collection
    if( hasTypeOfValuesPR( theCtxt, theTypeOfValues)) { return;}


    com.dosmil_e.m3.core.priv.M3AttributePriv aNewTypeOfValues = (com.dosmil_e.m3.core.priv.M3AttributePriv) theTypeOfValues;

      // Link reverse ref to this object
    aNewTypeOfValues.unsetAndSetValueTypePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship TypeOfValues
      // Grow collection and add new TypeOfValues element
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherTypeOfValues = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aTypeOfValuesLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someTypeOfValues, 0, otherTypeOfValues, 0, aRelativeIndex );
      }
      System.arraycopy( someTypeOfValues, aRelativeIndex, otherTypeOfValues, aRelativeIndex + 1, aTypeOfValuesLength - aRelativeIndex);
      otherTypeOfValues[ aRelativeIndex] = aNewTypeOfValues;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeOfValuesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeOfValuesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeOfValuesBefore", null); return;}

      // Set the new collection
    setTypeOfValuesPrivileged( theCtxt, otherTypeOfValues);
  }





    /* Public Write accessor for role TypeOfValues
     */
  public void removeTypeOfValuesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException {

      // Do not add null values to the collection
    if( theTypeOfValues == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someTypeOfValues = getTypeOfValuesPrivileged( theCtxt);
    if( someTypeOfValues == null) { return;}

      // Check for new TypeOfValues not in collection
    int aTypeOfValuesLength = someTypeOfValues.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aTypeOfValuesLength ; anIndex++) {
      if( theTypeOfValues.sameAs( theCtxt, someTypeOfValues[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.core.priv.M3AttributePriv aNewTypeOfValues = (com.dosmil_e.m3.core.priv.M3AttributePriv) theTypeOfValues;

      // Unlink reverse ref from the new related object
    aNewTypeOfValues.unsetValueTypePrivileged( theCtxt);

      // Shrink collection removing TypeOfValues element
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherTypeOfValues = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aTypeOfValuesLength - 1];
    try {
      System.arraycopy( someTypeOfValues, 0, otherTypeOfValues, 0, aFoundIndex);
      System.arraycopy( someTypeOfValues, aFoundIndex + 1, otherTypeOfValues, aFoundIndex, aTypeOfValuesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypeOfValues", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypeOfValues", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypeOfValues", null); return;}

      // Set the new collection
    setTypeOfValuesPrivileged( theCtxt, otherTypeOfValues);
  }




    /* Public reorder accessor for role TypeOfValues
     */
  public void moveTypeOfValuesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues, com.dosmil_e.m3.core.ifc.M3AttributeIfc theRelativeTypeOfValues) throws EAIException {

      // Null value is nothing to move
    if( theTypeOfValues == null) { return;}

      // If relative TypeOfValues is null, perform move to last position
    if( theRelativeTypeOfValues == null) {
      moveTypeOfValuesToLastPR( theCtxt, theTypeOfValues);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someTypeOfValues = getTypeOfValuesPrivileged( theCtxt);
    if( someTypeOfValues == null) { return;}

      // Get length of TypeOfValues array
    int aTypeOfValuesLength = someTypeOfValues.length;

      // Get index of TypeOfValues to move
    int aToMoveIndex = indexOfTypeOfValuesPR( theCtxt, theTypeOfValues);
      // If toMove TypeOfValues not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aTypeOfValuesLength) {
      moveTypeOfValuesToLastPR( theCtxt, theTypeOfValues);
    }

      // Get index of relative TypeOfValues
    int aRelativeIndex = indexOfTypeOfValuesPR( theCtxt, theRelativeTypeOfValues);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveTypeOfValuesToLastPR( theCtxt, theTypeOfValues);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aTypeOfValuesLength) {
      moveTypeOfValuesToLastPR( theCtxt, theTypeOfValues);
    }

      // ToMove and relative TypeOfValues are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.core.priv.M3AttributePriv aToMoveTypeOfValues = (com.dosmil_e.m3.core.priv.M3AttributePriv) theTypeOfValues;

      // Allocate new array for new version of state of relationship TypeOfValues
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherTypeOfValues = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aTypeOfValuesLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someTypeOfValues, 0, otherTypeOfValues, 0, aToMoveIndex );
        System.arraycopy( someTypeOfValues, aToMoveIndex + 1, otherTypeOfValues, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherTypeOfValues[ aRelativeIndex - 1] = aToMoveTypeOfValues;
        System.arraycopy( someTypeOfValues, aRelativeIndex, otherTypeOfValues, aRelativeIndex, aTypeOfValuesLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someTypeOfValues, 0, otherTypeOfValues, 0, aRelativeIndex );
        otherTypeOfValues[ aRelativeIndex ] = aToMoveTypeOfValues;
        System.arraycopy( someTypeOfValues, aRelativeIndex, otherTypeOfValues, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aTypeOfValuesLength - 1) {
          System.arraycopy( someTypeOfValues, aToMoveIndex + 1, otherTypeOfValues, aToMoveIndex + 1, aTypeOfValuesLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypeOfValuesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypeOfValuesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypeOfValuesBefore", null); return;}

      // Set the new collection
    setTypeOfValuesPrivileged( theCtxt, otherTypeOfValues);
  }





    /* Public move to last accessor for role TypeOfValues
     */
  public void moveTypeOfValuesToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException {

      // Null value is nothing to move
    if( theTypeOfValues == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someTypeOfValues = getTypeOfValuesPrivileged( theCtxt);
    if( someTypeOfValues == null) { return;}

      // Get length of TypeOfValues array
    int aTypeOfValuesLength = someTypeOfValues.length;

      // Get index of TypeOfValues to move
    int aToMoveIndex = indexOfTypeOfValuesPR( theCtxt, theTypeOfValues);

      // If toMove TypeOfValues not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aTypeOfValuesLength - 1) { return;}

    com.dosmil_e.m3.core.priv.M3AttributePriv aToMoveTypeOfValues = (com.dosmil_e.m3.core.priv.M3AttributePriv) theTypeOfValues;

      // Allocate new array for new version of state of relationship TypeOfValues
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherTypeOfValues = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aTypeOfValuesLength];
    try {
      System.arraycopy( someTypeOfValues, 0, otherTypeOfValues, 0, aToMoveIndex );
      System.arraycopy( someTypeOfValues, aToMoveIndex + 1, otherTypeOfValues, aToMoveIndex, aTypeOfValuesLength - aToMoveIndex - 1);
      otherTypeOfValues[ aTypeOfValuesLength - 1] = aToMoveTypeOfValues;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypeOfValuesToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypeOfValuesToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypeOfValuesToLast", null); return;}

      // Set the new collection
    setTypeOfValuesPrivileged( theCtxt, otherTypeOfValues);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship TypeOfValues
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role TypeOfValues
     */
  public void addTypeOfValuesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theTypeOfValues) throws EAIException {

      // Do not add null values to the collection
    if( theTypeOfValues == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someTypeOfValues = getTypeOfValuesPrivileged( theCtxt);
    if( someTypeOfValues == null) { return;}

      // Check for new TypeOfValues already in collection
    int aTypeOfValuesLength = someTypeOfValues.length;
    for( int anIndex = 0 ; anIndex < aTypeOfValuesLength ; anIndex++) {
      if( theTypeOfValues.sameAs( theCtxt, someTypeOfValues[ anIndex])) { return;}
    }

      // Grow collection and add new TypeOfValues element
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherTypeOfValues = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aTypeOfValuesLength + 1];
    try {
      System.arraycopy( someTypeOfValues, 0, otherTypeOfValues, 0, aTypeOfValuesLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeOfValuesPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeOfValuesPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypeOfValuesPrivileged", null); return;}

    otherTypeOfValues[ aTypeOfValuesLength] = theTypeOfValues;

      // Set the new collection
    setTypeOfValuesPrivileged( theCtxt, otherTypeOfValues);
  }









    /* Privileged Write accessor for role TypeOfValues
     */
  public void removeTypeOfValuesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theTypeOfValues) throws EAIException {

      // Do not add null values to the collection
    if( theTypeOfValues == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv[] someTypeOfValues = getTypeOfValuesPrivileged( theCtxt);
    if( someTypeOfValues == null) { return;}

      // Check for new TypeOfValues not in collection
    int aTypeOfValuesLength = someTypeOfValues.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aTypeOfValuesLength ; anIndex++) {
      if( theTypeOfValues.sameAs( theCtxt, someTypeOfValues[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing TypeOfValues element
    com.dosmil_e.m3.core.priv.M3AttributePriv[] otherTypeOfValues = new com.dosmil_e.m3.core.priv.M3AttributePriv[ aTypeOfValuesLength - 1];
    try {
      System.arraycopy( someTypeOfValues, 0, otherTypeOfValues, 0, aFoundIndex);
      System.arraycopy( someTypeOfValues, aFoundIndex + 1, otherTypeOfValues, aFoundIndex, aTypeOfValuesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypeOfValuesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3AttributePriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypeOfValuesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3AttributePriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypeOfValuesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3AttributePriv.class}); return;}

      // Set the new collection
    setTypeOfValuesPrivileged( theCtxt, otherTypeOfValues);
  }






    /* Privileged Read accessor for role TypeOfValues
     * Guaranteed to return object with same identity of the TypeOfValues
     */
  public com.dosmil_e.m3.core.priv.M3AttributePriv[] getTypeOfValuesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrTypeOfValues;
  }




    /* Set reference in role TypeOfValues
     * Used by relationship maintenance machinery
     */
  public void setTypeOfValuesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv[] theTypeOfValuesCollection) throws EAIException {
    com.dosmil_e.m3.core.priv.M3AttributePriv[] aTypeOfValues = vrTypeOfValues;
    vrTypeOfValues = theTypeOfValuesCollection;
      // Propagate change
    change( theCtxt, "TypeOfValues", aTypeOfValues, vrTypeOfValues, "vrTypeOfValues");
  }




/****************************************************************************
 *  Implementation of public interface for MANY to MANY relationship SuperTypes
 ****************************************************************************/


    /* Public Read accessor for role SuperTypes
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getSuperTypes( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getSuperTypesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getSuperTypesPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public SuperTypes number access
     */
  public int numSuperTypes( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numSuperTypesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numSuperTypesPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public SuperTypes read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getSuperTypesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getSuperTypesAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getSuperTypesAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public SuperTypes finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findSuperTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findSuperTypesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findSuperTypesNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public SuperTypes is related predicate
     */
  public boolean hasSuperTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasSuperTypesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasSuperTypesNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional SuperTypes is related  predicate
     */
  public boolean hasSuperTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasSuperTypesPR( theCtxt, theSuperTypes);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasSuperTypesPR( theCtxt, theSuperTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public SuperTypes index access
     */
  public int indexOfSuperTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfSuperTypesPR( theCtxt, theSuperTypes);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfSuperTypesPR( theCtxt, theSuperTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addSuperTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addSuperTypesPR( theCtxt, theSuperTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addSuperTypesPR( theCtxt, theSuperTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addSuperTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeSuperTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addSuperTypesBeforePR( theCtxt, theSuperTypes, theRelativeSuperTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addSuperTypesBeforePR( theCtxt, theSuperTypes, theRelativeSuperTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role SuperTypes
     */
  public void removeSuperTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeSuperTypesPR( theCtxt, theSuperTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeSuperTypesPR( theCtxt, theSuperTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role SuperTypes
     */
  public void moveSuperTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeSuperTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveSuperTypesBeforePR( theCtxt, theSuperTypes, theRelativeSuperTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveSuperTypesBeforePR( theCtxt, theSuperTypes, theRelativeSuperTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role SuperTypes
     */
  public void moveSuperTypesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveSuperTypesToLastPR( theCtxt, theSuperTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveSuperTypesToLastPR( theCtxt, theSuperTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship SuperTypes
 ****************************************************************************/


    /* Public Read accessor for role SuperTypes
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getSuperTypesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv[] someSuperTypes = getSuperTypesPrivileged( theCtxt);
    if( someSuperTypes == null) { return null;}

    int aSuperTypesLength = someSuperTypes.length;
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] otherSuperTypes = new com.dosmil_e.m3.core.ifc.M3TypeIfc[ aSuperTypesLength];
    try { System.arraycopy( someSuperTypes, 0, otherSuperTypes, 0, aSuperTypesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getSuperTypes", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getSuperTypes", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getSuperTypes", null); return null;}


    return otherSuperTypes;
  }





    /* Public SuperTypes finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findSuperTypesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someSuperTypes = getSuperTypesPrivileged( theCtxt);
    if( someSuperTypes == null) { return null;}

      // Check for new SuperTypes already in collection
    int aSuperTypesLength = someSuperTypes.length;
    for( int anIndex = 0 ; anIndex < aSuperTypesLength ; anIndex++) {
      com.dosmil_e.m3.core.priv.M3TypePriv aSuperTypes = someSuperTypes[ anIndex];
      if( aSuperTypes.sameNameAs( theCtxt, theMMName)) { return aSuperTypes;}
    }
    return null;
  }



    /* Public SuperTypes finder predicate by name
     */
  public boolean hasSuperTypesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findSuperTypesNamedPR( theCtxt, theMMName) != null;
  }



    /* Public SuperTypes read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getSuperTypesAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someSuperTypes = getSuperTypesPrivileged( theCtxt);
    if( someSuperTypes == null) { return null;}

      // Get number of SuperTypes
    int aSuperTypesLength = someSuperTypes.length;

      // Verify index within array length
    if( theIndex >= aSuperTypesLength) { return null;}

      // Get indexed SuperTypes
    com.dosmil_e.m3.core.ifc.M3TypeIfc aSuperTypes = someSuperTypes[ theIndex];

    return aSuperTypes;
  }



    /* Public SuperTypes is related predicate
     */
  public boolean hasSuperTypesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException {
    return indexOfSuperTypesPR( theCtxt, theSuperTypes) >= 0;
  }


    /* Public SuperTypes index access
     */
  public int indexOfSuperTypesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException {
      // Do not add null values to the collection
    if( theSuperTypes == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someSuperTypes = getSuperTypesPrivileged( theCtxt);
    if( someSuperTypes == null) { return -1;}

      // Check for new SuperTypes already in collection
    int aSuperTypesLength = someSuperTypes.length;
    for( int anIndex = 0 ; anIndex < aSuperTypesLength ; anIndex++) {
      if( someSuperTypes[ anIndex].sameAs( theCtxt, theSuperTypes)) { return anIndex;}
    }
    return -1;
  }


    /* Public SuperTypes number access
     */
  public int numSuperTypesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someSuperTypes = getSuperTypesPrivileged( theCtxt);
    if( someSuperTypes == null) { return 0;}

      // Check for new SuperTypes already in collection
    int aSuperTypesLength = someSuperTypes.length;
    return aSuperTypesLength;
  }




    /* Public Write accessor for role SuperTypes
     */
  public void addSuperTypesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException {

      // Do not add null values to the collection
    if( theSuperTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSuperTypes = getSuperTypesPrivileged( theCtxt);
    if( someSuperTypes == null) { return;}

      // Check for new SuperTypes already in collection
    int aSuperTypesLength = someSuperTypes.length;
    for( int anIndex = 0 ; anIndex < aSuperTypesLength ; anIndex++) {
      if( theSuperTypes.sameAs( theCtxt, someSuperTypes[ anIndex])) { return;}
    }

    com.dosmil_e.m3.core.priv.M3TypePriv aNewSuperTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theSuperTypes;

      // Link reverse ref to this object
    aNewSuperTypes.addSubTypesPrivileged( theCtxt, this);

      // Grow collection and add new SuperTypes element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSuperTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSuperTypesLength + 1];
    try { System.arraycopy( someSuperTypes, 0, otherSuperTypes, 0, aSuperTypesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSuperTypes", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSuperTypes", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSuperTypes", null); return;}
    otherSuperTypes[ aSuperTypesLength] = aNewSuperTypes;

      // Set the new collection
    setSuperTypesPrivileged( theCtxt, otherSuperTypes);
  }


    /* Public ordered Write accessor for role SuperTypes
     */
  public void addSuperTypesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeSuperTypes) throws EAIException {

      // Do not add null values to the collection
    if( theSuperTypes == null) { return;}

      // If relative SuperTypes is null, perform normal add operation
    if( theRelativeSuperTypes == null) {
      addSuperTypesPR( theCtxt, theSuperTypes);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSuperTypes = getSuperTypesPrivileged( theCtxt);
    if( someSuperTypes == null) { return;}


      // Get index of relative SuperTypes
    int aRelativeIndex = indexOfSuperTypesPR( theCtxt, theRelativeSuperTypes);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addSuperTypesPR( theCtxt, theSuperTypes);
    }

      // Get length of SuperTypes array
    int aSuperTypesLength = someSuperTypes.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aSuperTypesLength) {
      addSuperTypesPR( theCtxt, theSuperTypes);
    }

      // Check for new SuperTypes already in collection
    if( hasSuperTypesPR( theCtxt, theSuperTypes)) { return;}


    com.dosmil_e.m3.core.priv.M3TypePriv aNewSuperTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theSuperTypes;

      // Link reverse ref to this object
    aNewSuperTypes.addSubTypesPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship SuperTypes
      // Grow collection and add new SuperTypes element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSuperTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSuperTypesLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someSuperTypes, 0, otherSuperTypes, 0, aRelativeIndex );
      }
      System.arraycopy( someSuperTypes, aRelativeIndex, otherSuperTypes, aRelativeIndex + 1, aSuperTypesLength - aRelativeIndex);
      otherSuperTypes[ aRelativeIndex] = aNewSuperTypes;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSuperTypesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSuperTypesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSuperTypesBefore", null); return;}

      // Set the new collection
    setSuperTypesPrivileged( theCtxt, otherSuperTypes);
  }



    /* Public Write accessor for role SuperTypes
     */
  public void removeSuperTypesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException {

      // Do not add null values to the collection
    if( theSuperTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSuperTypes = getSuperTypesPrivileged( theCtxt);
    if( someSuperTypes == null) { return;}

      // Check for new SuperTypes not in collection
    int aSuperTypesLength = someSuperTypes.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aSuperTypesLength ; anIndex++) {
      if( theSuperTypes.sameAs( theCtxt, someSuperTypes[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.core.priv.M3TypePriv aNewSuperTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theSuperTypes;

      // Unlink reverse ref from the new related object
    aNewSuperTypes.removeSubTypesPrivileged( theCtxt, this);

      // Shrink collection removing SuperTypes element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSuperTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSuperTypesLength - 1];
    try {
      System.arraycopy( someSuperTypes, 0, otherSuperTypes, 0, aFoundIndex);
      System.arraycopy( someSuperTypes, aFoundIndex + 1, otherSuperTypes, aFoundIndex, aSuperTypesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSuperTypes", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSuperTypes", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSuperTypes", null); return;}

      // Set the new collection
    setSuperTypesPrivileged( theCtxt, otherSuperTypes);
  }




    /* Public reorder accessor for role SuperTypes
     */
  public void moveSuperTypesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeSuperTypes) throws EAIException {

      // Null value is nothing to move
    if( theSuperTypes == null) { return;}

      // If relative SuperTypes is null, perform move to last position
    if( theRelativeSuperTypes == null) {
      moveSuperTypesToLastPR( theCtxt, theSuperTypes);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSuperTypes = getSuperTypesPrivileged( theCtxt);
    if( someSuperTypes == null) { return;}

      // Get length of SuperTypes array
    int aSuperTypesLength = someSuperTypes.length;

      // Get index of SuperTypes to move
    int aToMoveIndex = indexOfSuperTypesPR( theCtxt, theSuperTypes);
      // If toMove SuperTypes not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aSuperTypesLength) {
      moveSuperTypesToLastPR( theCtxt, theSuperTypes);
    }

      // Get index of relative SuperTypes
    int aRelativeIndex = indexOfSuperTypesPR( theCtxt, theRelativeSuperTypes);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveSuperTypesToLastPR( theCtxt, theSuperTypes);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aSuperTypesLength) {
      moveSuperTypesToLastPR( theCtxt, theSuperTypes);
    }

      // ToMove and relative SuperTypes are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.core.priv.M3TypePriv aToMoveSuperTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theSuperTypes;

      // Allocate new array for new version of state of relationship SuperTypes
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSuperTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSuperTypesLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someSuperTypes, 0, otherSuperTypes, 0, aToMoveIndex );
        System.arraycopy( someSuperTypes, aToMoveIndex + 1, otherSuperTypes, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherSuperTypes[ aRelativeIndex - 1] = aToMoveSuperTypes;
        System.arraycopy( someSuperTypes, aRelativeIndex, otherSuperTypes, aRelativeIndex, aSuperTypesLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someSuperTypes, 0, otherSuperTypes, 0, aRelativeIndex );
        otherSuperTypes[ aRelativeIndex ] = aToMoveSuperTypes;
        System.arraycopy( someSuperTypes, aRelativeIndex, otherSuperTypes, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aSuperTypesLength - 1) {
          System.arraycopy( someSuperTypes, aToMoveIndex + 1, otherSuperTypes, aToMoveIndex + 1, aSuperTypesLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSuperTypesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSuperTypesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSuperTypesBefore", null); return;}

      // Set the new collection
    setSuperTypesPrivileged( theCtxt, otherSuperTypes);
  }





    /* Public move to last accessor for role SuperTypes
     */
  public void moveSuperTypesToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException {

      // Null value is nothing to move
    if( theSuperTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSuperTypes = getSuperTypesPrivileged( theCtxt);
    if( someSuperTypes == null) { return;}

      // Get length of SuperTypes array
    int aSuperTypesLength = someSuperTypes.length;

      // Get index of SuperTypes to move
    int aToMoveIndex = indexOfSuperTypesPR( theCtxt, theSuperTypes);

      // If toMove SuperTypes not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aSuperTypesLength - 1) { return;}

    com.dosmil_e.m3.core.priv.M3TypePriv aToMoveSuperTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theSuperTypes;

      // Allocate new array for new version of state of relationship SuperTypes
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSuperTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSuperTypesLength];
    try {
      System.arraycopy( someSuperTypes, 0, otherSuperTypes, 0, aToMoveIndex );
      System.arraycopy( someSuperTypes, aToMoveIndex + 1, otherSuperTypes, aToMoveIndex, aSuperTypesLength - aToMoveIndex - 1);
      otherSuperTypes[ aSuperTypesLength - 1] = aToMoveSuperTypes;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSuperTypesToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSuperTypesToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSuperTypesToLast", null); return;}

      // Set the new collection
    setSuperTypesPrivileged( theCtxt, otherSuperTypes);
  }







/****************************************************************************
 *  Implementation of privileged interface for relationship SuperTypes
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role SuperTypes
     */
  public void addSuperTypesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theSuperTypes) throws EAIException {

      // Do not add null values to the collection
    if( theSuperTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSuperTypes = getSuperTypesPrivileged( theCtxt);
    if( someSuperTypes == null) { return;}

      // Check for new SuperTypes already in collection
    int aSuperTypesLength = someSuperTypes.length;
    for( int anIndex = 0 ; anIndex < aSuperTypesLength ; anIndex++) {
      if( theSuperTypes.sameAs( theCtxt, someSuperTypes[ anIndex])) { return;}
    }

      // Grow collection and add new SuperTypes element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSuperTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSuperTypesLength + 1];
    try {
      System.arraycopy( someSuperTypes, 0, otherSuperTypes, 0, aSuperTypesLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSuperTypesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3TypePriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSuperTypesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3TypePriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSuperTypesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3TypePriv.class}); return;}

    otherSuperTypes[ aSuperTypesLength] = theSuperTypes;

      // Set the new collection
    setSuperTypesPrivileged( theCtxt, otherSuperTypes);
  }









    /* Privileged Write accessor for role SuperTypes
     */
  public void removeSuperTypesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theSuperTypes) throws EAIException {

      // Do not add null values to the collection
    if( theSuperTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someSuperTypes = getSuperTypesPrivileged( theCtxt);
    if( someSuperTypes == null) { return;}

      // Check for new SuperTypes not in collection
    int aSuperTypesLength = someSuperTypes.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aSuperTypesLength ; anIndex++) {
      if( theSuperTypes.sameAs( theCtxt, someSuperTypes[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing SuperTypes element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSuperTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSuperTypesLength - 1];
    try {
      System.arraycopy( someSuperTypes, 0, otherSuperTypes, 0, aFoundIndex);
      System.arraycopy( someSuperTypes, aFoundIndex + 1, otherSuperTypes, aFoundIndex, aSuperTypesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSuperTypesPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSuperTypesPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSuperTypesPrivileged", null); return;}

      // Set the new collection
    setSuperTypesPrivileged( theCtxt, otherSuperTypes);
  }






    /* Privileged Read accessor for role SuperTypes
     * Guaranteed to return object with same identity of the SuperTypes
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv[] getSuperTypesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrSuperTypes;
  }




    /* Set reference in role SuperTypes
     * Used by relationship maintenance machinery
     */
  public void setSuperTypesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv[] theSuperTypesCollection) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv[] aSuperTypes = vrSuperTypes;
    vrSuperTypes = theSuperTypesCollection;
      // Propagate change
    change( theCtxt, "SuperTypes", aSuperTypes, vrSuperTypes, "vrSuperTypes");
  }




/****************************************************************************
 *  Implementation of public interface for MANY to MANY relationship SubTypes
 ****************************************************************************/


    /* Public Read accessor for role SubTypes
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getSubTypes( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getSubTypesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getSubTypesPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public SubTypes number access
     */
  public int numSubTypes( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numSubTypesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numSubTypesPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public SubTypes read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getSubTypesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getSubTypesAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getSubTypesAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public SubTypes finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findSubTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findSubTypesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findSubTypesNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public SubTypes is related predicate
     */
  public boolean hasSubTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasSubTypesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasSubTypesNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional SubTypes is related  predicate
     */
  public boolean hasSubTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasSubTypesPR( theCtxt, theSubTypes);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasSubTypesPR( theCtxt, theSubTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public SubTypes index access
     */
  public int indexOfSubTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfSubTypesPR( theCtxt, theSubTypes);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfSubTypesPR( theCtxt, theSubTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addSubTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addSubTypesPR( theCtxt, theSubTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addSubTypesPR( theCtxt, theSubTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addSubTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeSubTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addSubTypesBeforePR( theCtxt, theSubTypes, theRelativeSubTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addSubTypesBeforePR( theCtxt, theSubTypes, theRelativeSubTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role SubTypes
     */
  public void removeSubTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeSubTypesPR( theCtxt, theSubTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeSubTypesPR( theCtxt, theSubTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role SubTypes
     */
  public void moveSubTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeSubTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveSubTypesBeforePR( theCtxt, theSubTypes, theRelativeSubTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveSubTypesBeforePR( theCtxt, theSubTypes, theRelativeSubTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role SubTypes
     */
  public void moveSubTypesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveSubTypesToLastPR( theCtxt, theSubTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveSubTypesToLastPR( theCtxt, theSubTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship SubTypes
 ****************************************************************************/


    /* Public Read accessor for role SubTypes
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getSubTypesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv[] someSubTypes = getSubTypesPrivileged( theCtxt);
    if( someSubTypes == null) { return null;}

    int aSubTypesLength = someSubTypes.length;
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] otherSubTypes = new com.dosmil_e.m3.core.ifc.M3TypeIfc[ aSubTypesLength];
    try { System.arraycopy( someSubTypes, 0, otherSubTypes, 0, aSubTypesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getSubTypes", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getSubTypes", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getSubTypes", null); return null;}


    return otherSubTypes;
  }





    /* Public SubTypes finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findSubTypesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someSubTypes = getSubTypesPrivileged( theCtxt);
    if( someSubTypes == null) { return null;}

      // Check for new SubTypes already in collection
    int aSubTypesLength = someSubTypes.length;
    for( int anIndex = 0 ; anIndex < aSubTypesLength ; anIndex++) {
      com.dosmil_e.m3.core.priv.M3TypePriv aSubTypes = someSubTypes[ anIndex];
      if( aSubTypes.sameNameAs( theCtxt, theMMName)) { return aSubTypes;}
    }
    return null;
  }



    /* Public SubTypes finder predicate by name
     */
  public boolean hasSubTypesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findSubTypesNamedPR( theCtxt, theMMName) != null;
  }



    /* Public SubTypes read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getSubTypesAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someSubTypes = getSubTypesPrivileged( theCtxt);
    if( someSubTypes == null) { return null;}

      // Get number of SubTypes
    int aSubTypesLength = someSubTypes.length;

      // Verify index within array length
    if( theIndex >= aSubTypesLength) { return null;}

      // Get indexed SubTypes
    com.dosmil_e.m3.core.ifc.M3TypeIfc aSubTypes = someSubTypes[ theIndex];

    return aSubTypes;
  }



    /* Public SubTypes is related predicate
     */
  public boolean hasSubTypesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException {
    return indexOfSubTypesPR( theCtxt, theSubTypes) >= 0;
  }


    /* Public SubTypes index access
     */
  public int indexOfSubTypesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException {
      // Do not add null values to the collection
    if( theSubTypes == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someSubTypes = getSubTypesPrivileged( theCtxt);
    if( someSubTypes == null) { return -1;}

      // Check for new SubTypes already in collection
    int aSubTypesLength = someSubTypes.length;
    for( int anIndex = 0 ; anIndex < aSubTypesLength ; anIndex++) {
      if( someSubTypes[ anIndex].sameAs( theCtxt, theSubTypes)) { return anIndex;}
    }
    return -1;
  }


    /* Public SubTypes number access
     */
  public int numSubTypesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someSubTypes = getSubTypesPrivileged( theCtxt);
    if( someSubTypes == null) { return 0;}

      // Check for new SubTypes already in collection
    int aSubTypesLength = someSubTypes.length;
    return aSubTypesLength;
  }




    /* Public Write accessor for role SubTypes
     */
  public void addSubTypesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException {

      // Do not add null values to the collection
    if( theSubTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSubTypes = getSubTypesPrivileged( theCtxt);
    if( someSubTypes == null) { return;}

      // Check for new SubTypes already in collection
    int aSubTypesLength = someSubTypes.length;
    for( int anIndex = 0 ; anIndex < aSubTypesLength ; anIndex++) {
      if( theSubTypes.sameAs( theCtxt, someSubTypes[ anIndex])) { return;}
    }

    com.dosmil_e.m3.core.priv.M3TypePriv aNewSubTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theSubTypes;

      // Link reverse ref to this object
    aNewSubTypes.addSuperTypesPrivileged( theCtxt, this);

      // Grow collection and add new SubTypes element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSubTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSubTypesLength + 1];
    try { System.arraycopy( someSubTypes, 0, otherSubTypes, 0, aSubTypesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubTypes", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubTypes", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubTypes", null); return;}
    otherSubTypes[ aSubTypesLength] = aNewSubTypes;

      // Set the new collection
    setSubTypesPrivileged( theCtxt, otherSubTypes);
  }


    /* Public ordered Write accessor for role SubTypes
     */
  public void addSubTypesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeSubTypes) throws EAIException {

      // Do not add null values to the collection
    if( theSubTypes == null) { return;}

      // If relative SubTypes is null, perform normal add operation
    if( theRelativeSubTypes == null) {
      addSubTypesPR( theCtxt, theSubTypes);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSubTypes = getSubTypesPrivileged( theCtxt);
    if( someSubTypes == null) { return;}


      // Get index of relative SubTypes
    int aRelativeIndex = indexOfSubTypesPR( theCtxt, theRelativeSubTypes);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addSubTypesPR( theCtxt, theSubTypes);
    }

      // Get length of SubTypes array
    int aSubTypesLength = someSubTypes.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aSubTypesLength) {
      addSubTypesPR( theCtxt, theSubTypes);
    }

      // Check for new SubTypes already in collection
    if( hasSubTypesPR( theCtxt, theSubTypes)) { return;}


    com.dosmil_e.m3.core.priv.M3TypePriv aNewSubTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theSubTypes;

      // Link reverse ref to this object
    aNewSubTypes.addSuperTypesPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship SubTypes
      // Grow collection and add new SubTypes element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSubTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSubTypesLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someSubTypes, 0, otherSubTypes, 0, aRelativeIndex );
      }
      System.arraycopy( someSubTypes, aRelativeIndex, otherSubTypes, aRelativeIndex + 1, aSubTypesLength - aRelativeIndex);
      otherSubTypes[ aRelativeIndex] = aNewSubTypes;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubTypesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubTypesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubTypesBefore", null); return;}

      // Set the new collection
    setSubTypesPrivileged( theCtxt, otherSubTypes);
  }



    /* Public Write accessor for role SubTypes
     */
  public void removeSubTypesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException {

      // Do not add null values to the collection
    if( theSubTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSubTypes = getSubTypesPrivileged( theCtxt);
    if( someSubTypes == null) { return;}

      // Check for new SubTypes not in collection
    int aSubTypesLength = someSubTypes.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aSubTypesLength ; anIndex++) {
      if( theSubTypes.sameAs( theCtxt, someSubTypes[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.core.priv.M3TypePriv aNewSubTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theSubTypes;

      // Unlink reverse ref from the new related object
    aNewSubTypes.removeSuperTypesPrivileged( theCtxt, this);

      // Shrink collection removing SubTypes element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSubTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSubTypesLength - 1];
    try {
      System.arraycopy( someSubTypes, 0, otherSubTypes, 0, aFoundIndex);
      System.arraycopy( someSubTypes, aFoundIndex + 1, otherSubTypes, aFoundIndex, aSubTypesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSubTypes", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSubTypes", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSubTypes", null); return;}

      // Set the new collection
    setSubTypesPrivileged( theCtxt, otherSubTypes);
  }




    /* Public reorder accessor for role SubTypes
     */
  public void moveSubTypesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeSubTypes) throws EAIException {

      // Null value is nothing to move
    if( theSubTypes == null) { return;}

      // If relative SubTypes is null, perform move to last position
    if( theRelativeSubTypes == null) {
      moveSubTypesToLastPR( theCtxt, theSubTypes);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSubTypes = getSubTypesPrivileged( theCtxt);
    if( someSubTypes == null) { return;}

      // Get length of SubTypes array
    int aSubTypesLength = someSubTypes.length;

      // Get index of SubTypes to move
    int aToMoveIndex = indexOfSubTypesPR( theCtxt, theSubTypes);
      // If toMove SubTypes not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aSubTypesLength) {
      moveSubTypesToLastPR( theCtxt, theSubTypes);
    }

      // Get index of relative SubTypes
    int aRelativeIndex = indexOfSubTypesPR( theCtxt, theRelativeSubTypes);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveSubTypesToLastPR( theCtxt, theSubTypes);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aSubTypesLength) {
      moveSubTypesToLastPR( theCtxt, theSubTypes);
    }

      // ToMove and relative SubTypes are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.core.priv.M3TypePriv aToMoveSubTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theSubTypes;

      // Allocate new array for new version of state of relationship SubTypes
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSubTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSubTypesLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someSubTypes, 0, otherSubTypes, 0, aToMoveIndex );
        System.arraycopy( someSubTypes, aToMoveIndex + 1, otherSubTypes, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherSubTypes[ aRelativeIndex - 1] = aToMoveSubTypes;
        System.arraycopy( someSubTypes, aRelativeIndex, otherSubTypes, aRelativeIndex, aSubTypesLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someSubTypes, 0, otherSubTypes, 0, aRelativeIndex );
        otherSubTypes[ aRelativeIndex ] = aToMoveSubTypes;
        System.arraycopy( someSubTypes, aRelativeIndex, otherSubTypes, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aSubTypesLength - 1) {
          System.arraycopy( someSubTypes, aToMoveIndex + 1, otherSubTypes, aToMoveIndex + 1, aSubTypesLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSubTypesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSubTypesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSubTypesBefore", null); return;}

      // Set the new collection
    setSubTypesPrivileged( theCtxt, otherSubTypes);
  }





    /* Public move to last accessor for role SubTypes
     */
  public void moveSubTypesToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException {

      // Null value is nothing to move
    if( theSubTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSubTypes = getSubTypesPrivileged( theCtxt);
    if( someSubTypes == null) { return;}

      // Get length of SubTypes array
    int aSubTypesLength = someSubTypes.length;

      // Get index of SubTypes to move
    int aToMoveIndex = indexOfSubTypesPR( theCtxt, theSubTypes);

      // If toMove SubTypes not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aSubTypesLength - 1) { return;}

    com.dosmil_e.m3.core.priv.M3TypePriv aToMoveSubTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theSubTypes;

      // Allocate new array for new version of state of relationship SubTypes
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSubTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSubTypesLength];
    try {
      System.arraycopy( someSubTypes, 0, otherSubTypes, 0, aToMoveIndex );
      System.arraycopy( someSubTypes, aToMoveIndex + 1, otherSubTypes, aToMoveIndex, aSubTypesLength - aToMoveIndex - 1);
      otherSubTypes[ aSubTypesLength - 1] = aToMoveSubTypes;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSubTypesToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSubTypesToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSubTypesToLast", null); return;}

      // Set the new collection
    setSubTypesPrivileged( theCtxt, otherSubTypes);
  }







/****************************************************************************
 *  Implementation of privileged interface for relationship SubTypes
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role SubTypes
     */
  public void addSubTypesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theSubTypes) throws EAIException {

      // Do not add null values to the collection
    if( theSubTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSubTypes = getSubTypesPrivileged( theCtxt);
    if( someSubTypes == null) { return;}

      // Check for new SubTypes already in collection
    int aSubTypesLength = someSubTypes.length;
    for( int anIndex = 0 ; anIndex < aSubTypesLength ; anIndex++) {
      if( theSubTypes.sameAs( theCtxt, someSubTypes[ anIndex])) { return;}
    }

      // Grow collection and add new SubTypes element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSubTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSubTypesLength + 1];
    try {
      System.arraycopy( someSubTypes, 0, otherSubTypes, 0, aSubTypesLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubTypesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3TypePriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubTypesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3TypePriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubTypesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3TypePriv.class}); return;}

    otherSubTypes[ aSubTypesLength] = theSubTypes;

      // Set the new collection
    setSubTypesPrivileged( theCtxt, otherSubTypes);
  }









    /* Privileged Write accessor for role SubTypes
     */
  public void removeSubTypesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theSubTypes) throws EAIException {

      // Do not add null values to the collection
    if( theSubTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someSubTypes = getSubTypesPrivileged( theCtxt);
    if( someSubTypes == null) { return;}

      // Check for new SubTypes not in collection
    int aSubTypesLength = someSubTypes.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aSubTypesLength ; anIndex++) {
      if( theSubTypes.sameAs( theCtxt, someSubTypes[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing SubTypes element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherSubTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aSubTypesLength - 1];
    try {
      System.arraycopy( someSubTypes, 0, otherSubTypes, 0, aFoundIndex);
      System.arraycopy( someSubTypes, aFoundIndex + 1, otherSubTypes, aFoundIndex, aSubTypesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSubTypesPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSubTypesPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSubTypesPrivileged", null); return;}

      // Set the new collection
    setSubTypesPrivileged( theCtxt, otherSubTypes);
  }






    /* Privileged Read accessor for role SubTypes
     * Guaranteed to return object with same identity of the SubTypes
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv[] getSubTypesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrSubTypes;
  }




    /* Set reference in role SubTypes
     * Used by relationship maintenance machinery
     */
  public void setSubTypesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv[] theSubTypesCollection) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv[] aSubTypes = vrSubTypes;
    vrSubTypes = theSubTypesCollection;
      // Propagate change
    change( theCtxt, "SubTypes", aSubTypes, vrSubTypes, "vrSubTypes");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship Relationships
 ****************************************************************************/


    /* Public Read accessor for role Relationships
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] getRelationships( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRelationshipsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRelationshipsPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public Relationships number access
     */
  public int numRelationships( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numRelationshipsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numRelationshipsPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public Relationships read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getRelationshipsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRelationshipsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRelationshipsAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public Relationships finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findRelationshipsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findRelationshipsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findRelationshipsNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public Relationships is related predicate
     */
  public boolean hasRelationshipsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasRelationshipsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasRelationshipsNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional Relationships is related  predicate
     */
  public boolean hasRelationships( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasRelationshipsPR( theCtxt, theRelationships);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasRelationshipsPR( theCtxt, theRelationships);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public Relationships index access
     */
  public int indexOfRelationships( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfRelationshipsPR( theCtxt, theRelationships);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfRelationshipsPR( theCtxt, theRelationships);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addRelationships( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addRelationshipsPR( theCtxt, theRelationships);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addRelationshipsPR( theCtxt, theRelationships);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addRelationshipsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelativeRelationships) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addRelationshipsBeforePR( theCtxt, theRelationships, theRelativeRelationships);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addRelationshipsBeforePR( theCtxt, theRelationships, theRelativeRelationships);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role Relationships
     */
  public void removeRelationships( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeRelationshipsPR( theCtxt, theRelationships);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeRelationshipsPR( theCtxt, theRelationships);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role Relationships
     */
  public void moveRelationshipsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelativeRelationships) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveRelationshipsBeforePR( theCtxt, theRelationships, theRelativeRelationships);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveRelationshipsBeforePR( theCtxt, theRelationships, theRelativeRelationships);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role Relationships
     */
  public void moveRelationshipsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveRelationshipsToLastPR( theCtxt, theRelationships);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveRelationshipsToLastPR( theCtxt, theRelationships);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship Relationships
 ****************************************************************************/


    /* Public Read accessor for role Relationships
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] getRelationshipsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] someRelationships = getRelationshipsPrivileged( theCtxt);
    if( someRelationships == null) { return null;}

    int aRelationshipsLength = someRelationships.length;
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] otherRelationships = new com.dosmil_e.m3.core.ifc.M3RelationshipIfc[ aRelationshipsLength];
    try { System.arraycopy( someRelationships, 0, otherRelationships, 0, aRelationshipsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getRelationships", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getRelationships", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getRelationships", null); return null;}


    return otherRelationships;
  }



    /* Public Relationships finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findRelationshipsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] someRelationships = getRelationshipsPrivileged( theCtxt);
    if( someRelationships == null) { return null;}

      // Check for new Relationships already in collection
    int aRelationshipsLength = someRelationships.length;
    for( int anIndex = 0 ; anIndex < aRelationshipsLength ; anIndex++) {
      com.dosmil_e.m3.core.priv.M3RelationshipPriv aRelationships = someRelationships[ anIndex];
      if( aRelationships.sameNameAs( theCtxt, theMMName)) { return aRelationships;}
    }
    return null;
  }



    /* Public Relationships finder predicate by name
     */
  public boolean hasRelationshipsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findRelationshipsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public Relationships read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getRelationshipsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] someRelationships = getRelationshipsPrivileged( theCtxt);
    if( someRelationships == null) { return null;}

      // Get number of Relationships
    int aRelationshipsLength = someRelationships.length;

      // Verify index within array length
    if( theIndex >= aRelationshipsLength) { return null;}

      // Get indexed Relationships
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aRelationships = someRelationships[ theIndex];

    return aRelationships;
  }



    /* Public Relationships is related predicate
     */
  public boolean hasRelationshipsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException {
    return indexOfRelationshipsPR( theCtxt, theRelationships) >= 0;
  }


    /* Public Relationships index access
     */
  public int indexOfRelationshipsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException {
      // Do not add null values to the collection
    if( theRelationships == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] someRelationships = getRelationshipsPrivileged( theCtxt);
    if( someRelationships == null) { return -1;}

      // Check for new Relationships already in collection
    int aRelationshipsLength = someRelationships.length;
    for( int anIndex = 0 ; anIndex < aRelationshipsLength ; anIndex++) {
      if( someRelationships[ anIndex].sameAs( theCtxt, theRelationships)) { return anIndex;}
    }
    return -1;
  }


    /* Public Relationships number access
     */
  public int numRelationshipsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] someRelationships = getRelationshipsPrivileged( theCtxt);
    if( someRelationships == null) { return 0;}

      // Check for new Relationships already in collection
    int aRelationshipsLength = someRelationships.length;
    return aRelationshipsLength;
  }




    /* Public Write accessor for role Relationships
     */
  public void addRelationshipsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException {

      // Do not add null values to the collection
    if( theRelationships == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelationships = getRelationshipsPrivileged( theCtxt);
    if( someRelationships == null) { return;}

      // Check for new Relationships already in collection
    int aRelationshipsLength = someRelationships.length;
    for( int anIndex = 0 ; anIndex < aRelationshipsLength ; anIndex++) {
      if( theRelationships.sameAs( theCtxt, someRelationships[ anIndex])) { return;}
    }

    com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewRelationships = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theRelationships;

      // Link reverse ref to this object
    aNewRelationships.unsetAndSetTypePrivileged( theCtxt, this);

      // Grow collection and add new Relationships element
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelationships = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelationshipsLength + 1];
    try { System.arraycopy( someRelationships, 0, otherRelationships, 0, aRelationshipsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelationships", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelationships", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelationships", null); return;}
    otherRelationships[ aRelationshipsLength] = aNewRelationships;

      // Set the new collection
    setRelationshipsPrivileged( theCtxt, otherRelationships);
  }




    /* Public ordered Write accessor for role Relationships
     */
  public void addRelationshipsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelativeRelationships) throws EAIException {

      // Do not add null values to the collection
    if( theRelationships == null) { return;}

      // If relative Relationships is null, perform normal add operation
    if( theRelativeRelationships == null) {
      addRelationshipsPR( theCtxt, theRelationships);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelationships = getRelationshipsPrivileged( theCtxt);
    if( someRelationships == null) { return;}


      // Get index of relative Relationships
    int aRelativeIndex = indexOfRelationshipsPR( theCtxt, theRelativeRelationships);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addRelationshipsPR( theCtxt, theRelationships);
    }

      // Get length of Relationships array
    int aRelationshipsLength = someRelationships.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aRelationshipsLength) {
      addRelationshipsPR( theCtxt, theRelationships);
    }

      // Check for new Relationships already in collection
    if( hasRelationshipsPR( theCtxt, theRelationships)) { return;}


    com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewRelationships = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theRelationships;

      // Link reverse ref to this object
    aNewRelationships.unsetAndSetTypePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship Relationships
      // Grow collection and add new Relationships element
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelationships = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelationshipsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someRelationships, 0, otherRelationships, 0, aRelativeIndex );
      }
      System.arraycopy( someRelationships, aRelativeIndex, otherRelationships, aRelativeIndex + 1, aRelationshipsLength - aRelativeIndex);
      otherRelationships[ aRelativeIndex] = aNewRelationships;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelationshipsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelationshipsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelationshipsBefore", null); return;}

      // Set the new collection
    setRelationshipsPrivileged( theCtxt, otherRelationships);
  }





    /* Public Write accessor for role Relationships
     */
  public void removeRelationshipsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException {

      // Do not add null values to the collection
    if( theRelationships == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelationships = getRelationshipsPrivileged( theCtxt);
    if( someRelationships == null) { return;}

      // Check for new Relationships not in collection
    int aRelationshipsLength = someRelationships.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aRelationshipsLength ; anIndex++) {
      if( theRelationships.sameAs( theCtxt, someRelationships[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewRelationships = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theRelationships;

      // Unlink reverse ref from the new related object
    aNewRelationships.unsetTypePrivileged( theCtxt);

      // Shrink collection removing Relationships element
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelationships = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelationshipsLength - 1];
    try {
      System.arraycopy( someRelationships, 0, otherRelationships, 0, aFoundIndex);
      System.arraycopy( someRelationships, aFoundIndex + 1, otherRelationships, aFoundIndex, aRelationshipsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRelationships", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRelationships", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRelationships", null); return;}

      // Set the new collection
    setRelationshipsPrivileged( theCtxt, otherRelationships);
  }




    /* Public reorder accessor for role Relationships
     */
  public void moveRelationshipsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelativeRelationships) throws EAIException {

      // Null value is nothing to move
    if( theRelationships == null) { return;}

      // If relative Relationships is null, perform move to last position
    if( theRelativeRelationships == null) {
      moveRelationshipsToLastPR( theCtxt, theRelationships);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelationships = getRelationshipsPrivileged( theCtxt);
    if( someRelationships == null) { return;}

      // Get length of Relationships array
    int aRelationshipsLength = someRelationships.length;

      // Get index of Relationships to move
    int aToMoveIndex = indexOfRelationshipsPR( theCtxt, theRelationships);
      // If toMove Relationships not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aRelationshipsLength) {
      moveRelationshipsToLastPR( theCtxt, theRelationships);
    }

      // Get index of relative Relationships
    int aRelativeIndex = indexOfRelationshipsPR( theCtxt, theRelativeRelationships);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveRelationshipsToLastPR( theCtxt, theRelationships);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aRelationshipsLength) {
      moveRelationshipsToLastPR( theCtxt, theRelationships);
    }

      // ToMove and relative Relationships are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.core.priv.M3RelationshipPriv aToMoveRelationships = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theRelationships;

      // Allocate new array for new version of state of relationship Relationships
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelationships = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelationshipsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someRelationships, 0, otherRelationships, 0, aToMoveIndex );
        System.arraycopy( someRelationships, aToMoveIndex + 1, otherRelationships, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherRelationships[ aRelativeIndex - 1] = aToMoveRelationships;
        System.arraycopy( someRelationships, aRelativeIndex, otherRelationships, aRelativeIndex, aRelationshipsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someRelationships, 0, otherRelationships, 0, aRelativeIndex );
        otherRelationships[ aRelativeIndex ] = aToMoveRelationships;
        System.arraycopy( someRelationships, aRelativeIndex, otherRelationships, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aRelationshipsLength - 1) {
          System.arraycopy( someRelationships, aToMoveIndex + 1, otherRelationships, aToMoveIndex + 1, aRelationshipsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRelationshipsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRelationshipsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRelationshipsBefore", null); return;}

      // Set the new collection
    setRelationshipsPrivileged( theCtxt, otherRelationships);
  }





    /* Public move to last accessor for role Relationships
     */
  public void moveRelationshipsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException {

      // Null value is nothing to move
    if( theRelationships == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelationships = getRelationshipsPrivileged( theCtxt);
    if( someRelationships == null) { return;}

      // Get length of Relationships array
    int aRelationshipsLength = someRelationships.length;

      // Get index of Relationships to move
    int aToMoveIndex = indexOfRelationshipsPR( theCtxt, theRelationships);

      // If toMove Relationships not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aRelationshipsLength - 1) { return;}

    com.dosmil_e.m3.core.priv.M3RelationshipPriv aToMoveRelationships = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theRelationships;

      // Allocate new array for new version of state of relationship Relationships
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelationships = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelationshipsLength];
    try {
      System.arraycopy( someRelationships, 0, otherRelationships, 0, aToMoveIndex );
      System.arraycopy( someRelationships, aToMoveIndex + 1, otherRelationships, aToMoveIndex, aRelationshipsLength - aToMoveIndex - 1);
      otherRelationships[ aRelationshipsLength - 1] = aToMoveRelationships;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRelationshipsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRelationshipsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRelationshipsToLast", null); return;}

      // Set the new collection
    setRelationshipsPrivileged( theCtxt, otherRelationships);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship Relationships
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role Relationships
     */
  public void addRelationshipsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theRelationships) throws EAIException {

      // Do not add null values to the collection
    if( theRelationships == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelationships = getRelationshipsPrivileged( theCtxt);
    if( someRelationships == null) { return;}

      // Check for new Relationships already in collection
    int aRelationshipsLength = someRelationships.length;
    for( int anIndex = 0 ; anIndex < aRelationshipsLength ; anIndex++) {
      if( theRelationships.sameAs( theCtxt, someRelationships[ anIndex])) { return;}
    }

      // Grow collection and add new Relationships element
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelationships = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelationshipsLength + 1];
    try {
      System.arraycopy( someRelationships, 0, otherRelationships, 0, aRelationshipsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelationshipsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelationshipsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelationshipsPrivileged", null); return;}

    otherRelationships[ aRelationshipsLength] = theRelationships;

      // Set the new collection
    setRelationshipsPrivileged( theCtxt, otherRelationships);
  }









    /* Privileged Write accessor for role Relationships
     */
  public void removeRelationshipsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theRelationships) throws EAIException {

      // Do not add null values to the collection
    if( theRelationships == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] someRelationships = getRelationshipsPrivileged( theCtxt);
    if( someRelationships == null) { return;}

      // Check for new Relationships not in collection
    int aRelationshipsLength = someRelationships.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aRelationshipsLength ; anIndex++) {
      if( theRelationships.sameAs( theCtxt, someRelationships[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing Relationships element
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelationships = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelationshipsLength - 1];
    try {
      System.arraycopy( someRelationships, 0, otherRelationships, 0, aFoundIndex);
      System.arraycopy( someRelationships, aFoundIndex + 1, otherRelationships, aFoundIndex, aRelationshipsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRelationshipsPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3RelationshipPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRelationshipsPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3RelationshipPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRelationshipsPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3RelationshipPriv.class}); return;}

      // Set the new collection
    setRelationshipsPrivileged( theCtxt, otherRelationships);
  }






    /* Privileged Read accessor for role Relationships
     * Guaranteed to return object with same identity of the Relationships
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv[] getRelationshipsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrRelationships;
  }




    /* Set reference in role Relationships
     * Used by relationship maintenance machinery
     */
  public void setRelationshipsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv[] theRelationshipsCollection) throws EAIException {
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] aRelationships = vrRelationships;
    vrRelationships = theRelationshipsCollection;
      // Propagate change
    change( theCtxt, "Relationships", aRelationships, vrRelationships, "vrRelationships");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship RelatedWith
 ****************************************************************************/


    /* Public Read accessor for role RelatedWith
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] getRelatedWith( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRelatedWithPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRelatedWithPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public RelatedWith number access
     */
  public int numRelatedWith( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numRelatedWithPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numRelatedWithPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public RelatedWith read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getRelatedWithAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRelatedWithAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRelatedWithAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public RelatedWith finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findRelatedWithNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findRelatedWithNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findRelatedWithNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public RelatedWith is related predicate
     */
  public boolean hasRelatedWithNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasRelatedWithNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasRelatedWithNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional RelatedWith is related  predicate
     */
  public boolean hasRelatedWith( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasRelatedWithPR( theCtxt, theRelatedWith);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasRelatedWithPR( theCtxt, theRelatedWith);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public RelatedWith index access
     */
  public int indexOfRelatedWith( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfRelatedWithPR( theCtxt, theRelatedWith);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfRelatedWithPR( theCtxt, theRelatedWith);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addRelatedWith( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addRelatedWithPR( theCtxt, theRelatedWith);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addRelatedWithPR( theCtxt, theRelatedWith);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addRelatedWithBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelativeRelatedWith) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addRelatedWithBeforePR( theCtxt, theRelatedWith, theRelativeRelatedWith);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addRelatedWithBeforePR( theCtxt, theRelatedWith, theRelativeRelatedWith);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role RelatedWith
     */
  public void removeRelatedWith( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeRelatedWithPR( theCtxt, theRelatedWith);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeRelatedWithPR( theCtxt, theRelatedWith);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role RelatedWith
     */
  public void moveRelatedWithBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelativeRelatedWith) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveRelatedWithBeforePR( theCtxt, theRelatedWith, theRelativeRelatedWith);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveRelatedWithBeforePR( theCtxt, theRelatedWith, theRelativeRelatedWith);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role RelatedWith
     */
  public void moveRelatedWithToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveRelatedWithToLastPR( theCtxt, theRelatedWith);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveRelatedWithToLastPR( theCtxt, theRelatedWith);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship RelatedWith
 ****************************************************************************/


    /* Public Read accessor for role RelatedWith
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] getRelatedWithPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] someRelatedWith = getRelatedWithPrivileged( theCtxt);
    if( someRelatedWith == null) { return null;}

    int aRelatedWithLength = someRelatedWith.length;
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] otherRelatedWith = new com.dosmil_e.m3.core.ifc.M3RelationshipIfc[ aRelatedWithLength];
    try { System.arraycopy( someRelatedWith, 0, otherRelatedWith, 0, aRelatedWithLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getRelatedWith", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getRelatedWith", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getRelatedWith", null); return null;}


    return otherRelatedWith;
  }



    /* Public RelatedWith finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findRelatedWithNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] someRelatedWith = getRelatedWithPrivileged( theCtxt);
    if( someRelatedWith == null) { return null;}

      // Check for new RelatedWith already in collection
    int aRelatedWithLength = someRelatedWith.length;
    for( int anIndex = 0 ; anIndex < aRelatedWithLength ; anIndex++) {
      com.dosmil_e.m3.core.priv.M3RelationshipPriv aRelatedWith = someRelatedWith[ anIndex];
      if( aRelatedWith.sameNameAs( theCtxt, theMMName)) { return aRelatedWith;}
    }
    return null;
  }



    /* Public RelatedWith finder predicate by name
     */
  public boolean hasRelatedWithNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findRelatedWithNamedPR( theCtxt, theMMName) != null;
  }


    /* Public RelatedWith read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getRelatedWithAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] someRelatedWith = getRelatedWithPrivileged( theCtxt);
    if( someRelatedWith == null) { return null;}

      // Get number of RelatedWith
    int aRelatedWithLength = someRelatedWith.length;

      // Verify index within array length
    if( theIndex >= aRelatedWithLength) { return null;}

      // Get indexed RelatedWith
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aRelatedWith = someRelatedWith[ theIndex];

    return aRelatedWith;
  }



    /* Public RelatedWith is related predicate
     */
  public boolean hasRelatedWithPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException {
    return indexOfRelatedWithPR( theCtxt, theRelatedWith) >= 0;
  }


    /* Public RelatedWith index access
     */
  public int indexOfRelatedWithPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException {
      // Do not add null values to the collection
    if( theRelatedWith == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] someRelatedWith = getRelatedWithPrivileged( theCtxt);
    if( someRelatedWith == null) { return -1;}

      // Check for new RelatedWith already in collection
    int aRelatedWithLength = someRelatedWith.length;
    for( int anIndex = 0 ; anIndex < aRelatedWithLength ; anIndex++) {
      if( someRelatedWith[ anIndex].sameAs( theCtxt, theRelatedWith)) { return anIndex;}
    }
    return -1;
  }


    /* Public RelatedWith number access
     */
  public int numRelatedWithPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] someRelatedWith = getRelatedWithPrivileged( theCtxt);
    if( someRelatedWith == null) { return 0;}

      // Check for new RelatedWith already in collection
    int aRelatedWithLength = someRelatedWith.length;
    return aRelatedWithLength;
  }




    /* Public Write accessor for role RelatedWith
     */
  public void addRelatedWithPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException {

      // Do not add null values to the collection
    if( theRelatedWith == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelatedWith = getRelatedWithPrivileged( theCtxt);
    if( someRelatedWith == null) { return;}

      // Check for new RelatedWith already in collection
    int aRelatedWithLength = someRelatedWith.length;
    for( int anIndex = 0 ; anIndex < aRelatedWithLength ; anIndex++) {
      if( theRelatedWith.sameAs( theCtxt, someRelatedWith[ anIndex])) { return;}
    }

    com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewRelatedWith = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theRelatedWith;

      // Link reverse ref to this object
    aNewRelatedWith.unsetAndSetRelatedTypePrivileged( theCtxt, this);

      // Grow collection and add new RelatedWith element
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelatedWith = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelatedWithLength + 1];
    try { System.arraycopy( someRelatedWith, 0, otherRelatedWith, 0, aRelatedWithLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelatedWith", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelatedWith", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelatedWith", null); return;}
    otherRelatedWith[ aRelatedWithLength] = aNewRelatedWith;

      // Set the new collection
    setRelatedWithPrivileged( theCtxt, otherRelatedWith);
  }




    /* Public ordered Write accessor for role RelatedWith
     */
  public void addRelatedWithBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelativeRelatedWith) throws EAIException {

      // Do not add null values to the collection
    if( theRelatedWith == null) { return;}

      // If relative RelatedWith is null, perform normal add operation
    if( theRelativeRelatedWith == null) {
      addRelatedWithPR( theCtxt, theRelatedWith);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelatedWith = getRelatedWithPrivileged( theCtxt);
    if( someRelatedWith == null) { return;}


      // Get index of relative RelatedWith
    int aRelativeIndex = indexOfRelatedWithPR( theCtxt, theRelativeRelatedWith);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addRelatedWithPR( theCtxt, theRelatedWith);
    }

      // Get length of RelatedWith array
    int aRelatedWithLength = someRelatedWith.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aRelatedWithLength) {
      addRelatedWithPR( theCtxt, theRelatedWith);
    }

      // Check for new RelatedWith already in collection
    if( hasRelatedWithPR( theCtxt, theRelatedWith)) { return;}


    com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewRelatedWith = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theRelatedWith;

      // Link reverse ref to this object
    aNewRelatedWith.unsetAndSetRelatedTypePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship RelatedWith
      // Grow collection and add new RelatedWith element
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelatedWith = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelatedWithLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someRelatedWith, 0, otherRelatedWith, 0, aRelativeIndex );
      }
      System.arraycopy( someRelatedWith, aRelativeIndex, otherRelatedWith, aRelativeIndex + 1, aRelatedWithLength - aRelativeIndex);
      otherRelatedWith[ aRelativeIndex] = aNewRelatedWith;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelatedWithBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelatedWithBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelatedWithBefore", null); return;}

      // Set the new collection
    setRelatedWithPrivileged( theCtxt, otherRelatedWith);
  }





    /* Public Write accessor for role RelatedWith
     */
  public void removeRelatedWithPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException {

      // Do not add null values to the collection
    if( theRelatedWith == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelatedWith = getRelatedWithPrivileged( theCtxt);
    if( someRelatedWith == null) { return;}

      // Check for new RelatedWith not in collection
    int aRelatedWithLength = someRelatedWith.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aRelatedWithLength ; anIndex++) {
      if( theRelatedWith.sameAs( theCtxt, someRelatedWith[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.core.priv.M3RelationshipPriv aNewRelatedWith = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theRelatedWith;

      // Unlink reverse ref from the new related object
    aNewRelatedWith.unsetRelatedTypePrivileged( theCtxt);

      // Shrink collection removing RelatedWith element
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelatedWith = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelatedWithLength - 1];
    try {
      System.arraycopy( someRelatedWith, 0, otherRelatedWith, 0, aFoundIndex);
      System.arraycopy( someRelatedWith, aFoundIndex + 1, otherRelatedWith, aFoundIndex, aRelatedWithLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRelatedWith", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRelatedWith", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRelatedWith", null); return;}

      // Set the new collection
    setRelatedWithPrivileged( theCtxt, otherRelatedWith);
  }




    /* Public reorder accessor for role RelatedWith
     */
  public void moveRelatedWithBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelativeRelatedWith) throws EAIException {

      // Null value is nothing to move
    if( theRelatedWith == null) { return;}

      // If relative RelatedWith is null, perform move to last position
    if( theRelativeRelatedWith == null) {
      moveRelatedWithToLastPR( theCtxt, theRelatedWith);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelatedWith = getRelatedWithPrivileged( theCtxt);
    if( someRelatedWith == null) { return;}

      // Get length of RelatedWith array
    int aRelatedWithLength = someRelatedWith.length;

      // Get index of RelatedWith to move
    int aToMoveIndex = indexOfRelatedWithPR( theCtxt, theRelatedWith);
      // If toMove RelatedWith not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aRelatedWithLength) {
      moveRelatedWithToLastPR( theCtxt, theRelatedWith);
    }

      // Get index of relative RelatedWith
    int aRelativeIndex = indexOfRelatedWithPR( theCtxt, theRelativeRelatedWith);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveRelatedWithToLastPR( theCtxt, theRelatedWith);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aRelatedWithLength) {
      moveRelatedWithToLastPR( theCtxt, theRelatedWith);
    }

      // ToMove and relative RelatedWith are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.core.priv.M3RelationshipPriv aToMoveRelatedWith = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theRelatedWith;

      // Allocate new array for new version of state of relationship RelatedWith
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelatedWith = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelatedWithLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someRelatedWith, 0, otherRelatedWith, 0, aToMoveIndex );
        System.arraycopy( someRelatedWith, aToMoveIndex + 1, otherRelatedWith, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherRelatedWith[ aRelativeIndex - 1] = aToMoveRelatedWith;
        System.arraycopy( someRelatedWith, aRelativeIndex, otherRelatedWith, aRelativeIndex, aRelatedWithLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someRelatedWith, 0, otherRelatedWith, 0, aRelativeIndex );
        otherRelatedWith[ aRelativeIndex ] = aToMoveRelatedWith;
        System.arraycopy( someRelatedWith, aRelativeIndex, otherRelatedWith, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aRelatedWithLength - 1) {
          System.arraycopy( someRelatedWith, aToMoveIndex + 1, otherRelatedWith, aToMoveIndex + 1, aRelatedWithLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRelatedWithBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRelatedWithBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRelatedWithBefore", null); return;}

      // Set the new collection
    setRelatedWithPrivileged( theCtxt, otherRelatedWith);
  }





    /* Public move to last accessor for role RelatedWith
     */
  public void moveRelatedWithToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException {

      // Null value is nothing to move
    if( theRelatedWith == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelatedWith = getRelatedWithPrivileged( theCtxt);
    if( someRelatedWith == null) { return;}

      // Get length of RelatedWith array
    int aRelatedWithLength = someRelatedWith.length;

      // Get index of RelatedWith to move
    int aToMoveIndex = indexOfRelatedWithPR( theCtxt, theRelatedWith);

      // If toMove RelatedWith not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aRelatedWithLength - 1) { return;}

    com.dosmil_e.m3.core.priv.M3RelationshipPriv aToMoveRelatedWith = (com.dosmil_e.m3.core.priv.M3RelationshipPriv) theRelatedWith;

      // Allocate new array for new version of state of relationship RelatedWith
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelatedWith = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelatedWithLength];
    try {
      System.arraycopy( someRelatedWith, 0, otherRelatedWith, 0, aToMoveIndex );
      System.arraycopy( someRelatedWith, aToMoveIndex + 1, otherRelatedWith, aToMoveIndex, aRelatedWithLength - aToMoveIndex - 1);
      otherRelatedWith[ aRelatedWithLength - 1] = aToMoveRelatedWith;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRelatedWithToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRelatedWithToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRelatedWithToLast", null); return;}

      // Set the new collection
    setRelatedWithPrivileged( theCtxt, otherRelatedWith);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship RelatedWith
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role RelatedWith
     */
  public void addRelatedWithPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theRelatedWith) throws EAIException {

      // Do not add null values to the collection
    if( theRelatedWith == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelatedWith = getRelatedWithPrivileged( theCtxt);
    if( someRelatedWith == null) { return;}

      // Check for new RelatedWith already in collection
    int aRelatedWithLength = someRelatedWith.length;
    for( int anIndex = 0 ; anIndex < aRelatedWithLength ; anIndex++) {
      if( theRelatedWith.sameAs( theCtxt, someRelatedWith[ anIndex])) { return;}
    }

      // Grow collection and add new RelatedWith element
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelatedWith = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelatedWithLength + 1];
    try {
      System.arraycopy( someRelatedWith, 0, otherRelatedWith, 0, aRelatedWithLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelatedWithPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelatedWithPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRelatedWithPrivileged", null); return;}

    otherRelatedWith[ aRelatedWithLength] = theRelatedWith;

      // Set the new collection
    setRelatedWithPrivileged( theCtxt, otherRelatedWith);
  }









    /* Privileged Write accessor for role RelatedWith
     */
  public void removeRelatedWithPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theRelatedWith) throws EAIException {

      // Do not add null values to the collection
    if( theRelatedWith == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] someRelatedWith = getRelatedWithPrivileged( theCtxt);
    if( someRelatedWith == null) { return;}

      // Check for new RelatedWith not in collection
    int aRelatedWithLength = someRelatedWith.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aRelatedWithLength ; anIndex++) {
      if( theRelatedWith.sameAs( theCtxt, someRelatedWith[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing RelatedWith element
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] otherRelatedWith = new com.dosmil_e.m3.core.priv.M3RelationshipPriv[ aRelatedWithLength - 1];
    try {
      System.arraycopy( someRelatedWith, 0, otherRelatedWith, 0, aFoundIndex);
      System.arraycopy( someRelatedWith, aFoundIndex + 1, otherRelatedWith, aFoundIndex, aRelatedWithLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRelatedWithPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3RelationshipPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRelatedWithPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3RelationshipPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRelatedWithPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3RelationshipPriv.class}); return;}

      // Set the new collection
    setRelatedWithPrivileged( theCtxt, otherRelatedWith);
  }






    /* Privileged Read accessor for role RelatedWith
     * Guaranteed to return object with same identity of the RelatedWith
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv[] getRelatedWithPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrRelatedWith;
  }




    /* Set reference in role RelatedWith
     * Used by relationship maintenance machinery
     */
  public void setRelatedWithPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv[] theRelatedWithCollection) throws EAIException {
    com.dosmil_e.m3.core.priv.M3RelationshipPriv[] aRelatedWith = vrRelatedWith;
    vrRelatedWith = theRelatedWithCollection;
      // Propagate change
    change( theCtxt, "RelatedWith", aRelatedWith, vrRelatedWith, "vrRelatedWith");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to ONE relationship RootTypeOfModel
 ****************************************************************************/


    /* Public Read accessor for role RootTypeOfModel
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc getRootTypeOfModel( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModelIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRootTypeOfModelPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRootTypeOfModelPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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

    /* Public RootTypeOfModel number access
     */
  public int numRootTypeOfModel( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numRootTypeOfModelPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numRootTypeOfModelPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public RootTypeOfModel read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc getRootTypeOfModelAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModelIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRootTypeOfModelAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRootTypeOfModelAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public RootTypeOfModel finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc findRootTypeOfModelNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModelIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findRootTypeOfModelNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findRootTypeOfModelNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public RootTypeOfModel is related predicate
     */
  public boolean hasRootTypeOfModelNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasRootTypeOfModelNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasRootTypeOfModelNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Transactional RootTypeOfModel is related  predicate
     */
  public boolean hasRootTypeOfModel( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theRootTypeOfModel) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasRootTypeOfModelPR( theCtxt, theRootTypeOfModel);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasRootTypeOfModelPR( theCtxt, theRootTypeOfModel);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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


    /* Public RootTypeOfModel index access
     */
  public int indexOfRootTypeOfModel( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theRootTypeOfModel) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfRootTypeOfModelPR( theCtxt, theRootTypeOfModel);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfRootTypeOfModelPR( theCtxt, theRootTypeOfModel);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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




    /* Public Write accessor for role RootTypeOfModel
     */
  public void setRootTypeOfModel( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theRootTypeOfModel) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setRootTypeOfModelPR( theCtxt, theRootTypeOfModel);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setRootTypeOfModelPR( theCtxt, theRootTypeOfModel);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship RootTypeOfModel
 ****************************************************************************/


    /* Public Read accessor for role RootTypeOfModel
     * May do wild things with the identity of RootTypeOfModel
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc getRootTypeOfModelPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getRootTypeOfModelPrivileged( theCtxt);
  }


    /* Public RootTypeOfModel number access
     */
  public int numRootTypeOfModelPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getRootTypeOfModelPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public RootTypeOfModel read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc getRootTypeOfModelAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getRootTypeOfModelPrivileged( theCtxt);
  }


    /* Public RootTypeOfModel finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc findRootTypeOfModelNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3ModelIfc aRootTypeOfModel = getRootTypeOfModelPrivileged( theCtxt);
    if( aRootTypeOfModel == null) { return null;}

    if( !aRootTypeOfModel.sameNameAs( theCtxt, theMMName)) { return null;}

    return aRootTypeOfModel;
  }



    /* Public RootTypeOfModel is related predicate
     */
  public boolean hasRootTypeOfModelNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null) { return false;}
    com.dosmil_e.m3.core.ifc.M3ModelIfc aRootTypeOfModel = getRootTypeOfModelPrivileged( theCtxt);
    if( aRootTypeOfModel == null) { return false;}

    return aRootTypeOfModel.sameNameAs( theCtxt, theMMName);
  }



    /* Public RootTypeOfModel is related predicate
     */
  public boolean hasRootTypeOfModelPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theRootTypeOfModel) throws EAIException {
    if( theRootTypeOfModel == null) { return false;}
    com.dosmil_e.m3.core.ifc.M3ModelIfc aRootTypeOfModel = getRootTypeOfModelPrivileged( theCtxt);
    if( aRootTypeOfModel == null) { return false;}

    return aRootTypeOfModel.sameAs( theCtxt, theRootTypeOfModel);
  }


    /* Public RootTypeOfModel index access
     */
  public int indexOfRootTypeOfModelPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theRootTypeOfModel) throws EAIException {
    if( !hasRootTypeOfModelPR( theCtxt, theRootTypeOfModel)) { return -1;}

    return 0;
  }



    /* Public Write accessor for role RootTypeOfModel
     */
  public void setRootTypeOfModelPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theRootTypeOfModel) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3ModelPriv aRootTypeOfModel = getRootTypeOfModelPrivileged( theCtxt);
      // Check for new RootTypeOfModel same as current one
    if( aRootTypeOfModel != null && aRootTypeOfModel.sameAs( theCtxt, theRootTypeOfModel)) { return;}

    if( aRootTypeOfModel != null) {
      aRootTypeOfModel.unsetTreeRootTypePrivileged( theCtxt);
    }

    if( theRootTypeOfModel != null) {
      com.dosmil_e.m3.core.priv.M3ModelPriv aNewRootTypeOfModel = (com.dosmil_e.m3.core.priv.M3ModelPriv) theRootTypeOfModel;
      aNewRootTypeOfModel.unsetAndSetTreeRootTypePrivileged( theCtxt, this);
      setRootTypeOfModelPrivileged( theCtxt, aNewRootTypeOfModel);
    }
    else {
      setRootTypeOfModelPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship RootTypeOfModel
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role RootTypeOfModel
     * Guaranteed to return object with same identity of the RootTypeOfModel
     */
  public com.dosmil_e.m3.core.priv.M3ModelPriv getRootTypeOfModelPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrRootTypeOfModel;
  }




    /* Remove current reference in role RootTypeOfModel
     * Used by relationship maintenance machinery
     */
  public void unsetRootTypeOfModelPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModelIfc aRootTypeOfModel = vrRootTypeOfModel;
    vrRootTypeOfModel = null;
      // If there was change, propagate
    if( aRootTypeOfModel != null) {
      change( theCtxt, "RootTypeOfModel", aRootTypeOfModel, vrRootTypeOfModel, "vrRootTypeOfModel");
    }
  }





    /* Set reference in role RootTypeOfModel
     * Used by relationship maintenance machinery
     */
  public void setRootTypeOfModelPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModelPriv theRootTypeOfModel) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModelIfc aRootTypeOfModel = vrRootTypeOfModel;
    vrRootTypeOfModel = theRootTypeOfModel;
      // If there was change, propagate
    if( (aRootTypeOfModel != null && !aRootTypeOfModel.sameAs( theCtxt, theRootTypeOfModel)) || (aRootTypeOfModel == null && theRootTypeOfModel != null)) {
      change( theCtxt, "RootTypeOfModel", aRootTypeOfModel, vrRootTypeOfModel, "vrRootTypeOfModel");
    }
  }




    /* Unset currently related RootTypeOfModel and
     * Set reference in role RootTypeOfModel
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetRootTypeOfModelPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModelPriv theRootTypeOfModel) throws EAIException {
    com.dosmil_e.m3.core.priv.M3ModelPriv aRootTypeOfModel = vrRootTypeOfModel;
    if( aRootTypeOfModel != null) {
      aRootTypeOfModel.unsetTreeRootTypePrivileged( theCtxt);
    }
    vrRootTypeOfModel = theRootTypeOfModel;
      // If there was change, propagate
    if( (aRootTypeOfModel != null && !aRootTypeOfModel.sameAs( theCtxt, theRootTypeOfModel)) || (aRootTypeOfModel == null && theRootTypeOfModel != null)) {
      change( theCtxt, "RootTypeOfModel", aRootTypeOfModel, vrRootTypeOfModel, "vrRootTypeOfModel");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3Type
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 
      // When deleting : unreference attribute IsEnumeration
  setIsEnumeration( theCtxt, true);


      // When deleting : unreference attribute IsPrimitive
  setIsPrimitive( theCtxt, true);


      // When deleting : unreference attribute IsAbstract
  setIsAbstract( theCtxt, true);



 
      // When deleting : unlink related InverseOFmetaType
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaType = getInverseOFmetaType( theCtxt);
    if( someInverseOFmetaType != null) {
      int aInverseOFmetaTypeLength = someInverseOFmetaType.length;
      for( int anIndex = 0 ; anIndex < aInverseOFmetaTypeLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aInverseOFmetaType = someInverseOFmetaType[ anIndex];
        if( aInverseOFmetaType != null) {
          removeInverseOFmetaType( theCtxt, aInverseOFmetaType);
        }
      }
    }


      // When deleting : unlink related Inverse1OFmetaType
    com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] someInverse1OFmetaType = getInverse1OFmetaType( theCtxt);
    if( someInverse1OFmetaType != null) {
      int aInverse1OFmetaTypeLength = someInverse1OFmetaType.length;
      for( int anIndex = 0 ; anIndex < aInverse1OFmetaTypeLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc aInverse1OFmetaType = someInverse1OFmetaType[ anIndex];
        if( aInverse1OFmetaType != null) {
          removeInverse1OFmetaType( theCtxt, aInverse1OFmetaType);
        }
      }
    }


      // When deleting : unlink related InverseOFreplicatedMetaType
    com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[] someInverseOFreplicatedMetaType = getInverseOFreplicatedMetaType( theCtxt);
    if( someInverseOFreplicatedMetaType != null) {
      int aInverseOFreplicatedMetaTypeLength = someInverseOFreplicatedMetaType.length;
      for( int anIndex = 0 ; anIndex < aInverseOFreplicatedMetaTypeLength ; anIndex++) {
        com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc aInverseOFreplicatedMetaType = someInverseOFreplicatedMetaType[ anIndex];
        if( aInverseOFreplicatedMetaType != null) {
          removeInverseOFreplicatedMetaType( theCtxt, aInverseOFreplicatedMetaType);
        }
      }
    }


      // When deleting : unlink related InverseOFprojectionType
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionType = getInverseOFprojectionType( theCtxt);
    if( someInverseOFprojectionType != null) {
      int aInverseOFprojectionTypeLength = someInverseOFprojectionType.length;
      for( int anIndex = 0 ; anIndex < aInverseOFprojectionTypeLength ; anIndex++) {
        com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFprojectionType = someInverseOFprojectionType[ anIndex];
        if( aInverseOFprojectionType != null) {
          removeInverseOFprojectionType( theCtxt, aInverseOFprojectionType);
        }
      }
    }


      // When deleting : unlink related InverseOFexclusionType
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexclusionType = getInverseOFexclusionType( theCtxt);
    if( someInverseOFexclusionType != null) {
      int aInverseOFexclusionTypeLength = someInverseOFexclusionType.length;
      for( int anIndex = 0 ; anIndex < aInverseOFexclusionTypeLength ; anIndex++) {
        com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFexclusionType = someInverseOFexclusionType[ anIndex];
        if( aInverseOFexclusionType != null) {
          removeInverseOFexclusionType( theCtxt, aInverseOFexclusionType);
        }
      }
    }


    // When deleting unlink related Module
  setModule( theCtxt, null);


      // When deleting : delete related Attributes
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someAttributes = getAttributes( theCtxt);
    if( someAttributes != null) {
      int aAttributesLength = someAttributes.length;
      for( int anIndex = 0 ; anIndex < aAttributesLength ; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3AttributeIfc aAttributes = someAttributes[ anIndex];
        if( aAttributes != null) {
          com.dosmil_e.m3.core.impl.M3AttributeImpl aAttributesImpl = null;
          try { aAttributesImpl = (com.dosmil_e.m3.core.impl.M3AttributeImpl) aAttributes;} catch( ClassCastException anEx) {}
          if( aAttributesImpl != null) {
            aAttributesImpl.delete( theCtxt);
          }
        }
      }
    }
    

      // When deleting : unlink related TypeOfValues
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someTypeOfValues = getTypeOfValues( theCtxt);
    if( someTypeOfValues != null) {
      int aTypeOfValuesLength = someTypeOfValues.length;
      for( int anIndex = 0 ; anIndex < aTypeOfValuesLength ; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3AttributeIfc aTypeOfValues = someTypeOfValues[ anIndex];
        if( aTypeOfValues != null) {
          removeTypeOfValues( theCtxt, aTypeOfValues);
        }
      }
    }


      // When deleting : unlink related SuperTypes
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSuperTypes = getSuperTypes( theCtxt);
    if( someSuperTypes != null) {
      int aSuperTypesLength = someSuperTypes.length;
      for( int anIndex = 0 ; anIndex < aSuperTypesLength ; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3TypeIfc aSuperTypes = someSuperTypes[ anIndex];
        if( aSuperTypes != null) {
          removeSuperTypes( theCtxt, aSuperTypes);
        }
      }
    }
    

      // When deleting : unlink related SubTypes
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someSubTypes = getSubTypes( theCtxt);
    if( someSubTypes != null) {
      int aSubTypesLength = someSubTypes.length;
      for( int anIndex = 0 ; anIndex < aSubTypesLength ; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3TypeIfc aSubTypes = someSubTypes[ anIndex];
        if( aSubTypes != null) {
          removeSubTypes( theCtxt, aSubTypes);
        }
      }
    }
    

      // When deleting : delete related Relationships
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelationships = getRelationships( theCtxt);
    if( someRelationships != null) {
      int aRelationshipsLength = someRelationships.length;
      for( int anIndex = 0 ; anIndex < aRelationshipsLength ; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3RelationshipIfc aRelationships = someRelationships[ anIndex];
        if( aRelationships != null) {
          com.dosmil_e.m3.core.impl.M3RelationshipImpl aRelationshipsImpl = null;
          try { aRelationshipsImpl = (com.dosmil_e.m3.core.impl.M3RelationshipImpl) aRelationships;} catch( ClassCastException anEx) {}
          if( aRelationshipsImpl != null) {
            aRelationshipsImpl.delete( theCtxt);
          }
        }
      }
    }
    

      // When deleting : unlink related RelatedWith
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelatedWith = getRelatedWith( theCtxt);
    if( someRelatedWith != null) {
      int aRelatedWithLength = someRelatedWith.length;
      for( int anIndex = 0 ; anIndex < aRelatedWithLength ; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3RelationshipIfc aRelatedWith = someRelatedWith[ anIndex];
        if( aRelatedWith != null) {
          removeRelatedWith( theCtxt, aRelatedWith);
        }
      }
    }


    // When deleting unlink related RootTypeOfModel
  setRootTypeOfModel( theCtxt, null);



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
      vm3Type = com.dosmil_e.m3.core.meta.M3TypeMeta.getStaticM3Type( theCtxt);
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


