package com.dosmil_e.m3.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3AttributeBase
   extends com.dosmil_e.m3.core.impl.M3StructuralFeatureImpl
    implements com.dosmil_e.m3.core.priv.M3AttributePriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3Attribute metamodel element
 ****************************************************************************/
	protected java.lang.String vaAttributeTypeName;




/****************************************************************************
 *  State storage for the Relationships of the M3Attribute metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] vrInverseOFmetaAttribute = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] vrInverseOFcopiedMetaAttribute = new com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[0]; 

	protected com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] vrInverseOFexcludedInRelationshipNamed = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3TypePriv vrType; 

	protected com.dosmil_e.m3.core.priv.M3TypePriv vrValueType; 






/****************************************************************************
 *  Constructors of the M3Attribute metamodel element
 ****************************************************************************/

  public M3AttributeBase() {
    super();
  }


  public M3AttributeBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3AttributeBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3AttributeIfc and M3AttributePriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3Attribute
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE AttributeTypeName
 ****************************************************************************/


    /* Public Read accessor for attribute AttributeTypeName
     */
  public java.lang.String getAttributeTypeName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getAttributeTypeNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getAttributeTypeNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute AttributeTypeName
     */
  public void setAttributeTypeName( EAIMMCtxtIfc theCtxt, java.lang.String theAttributeTypeName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setAttributeTypeNamePR( theCtxt,  theAttributeTypeName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setAttributeTypeNamePR( theCtxt, theAttributeTypeName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute AttributeTypeName
 ****************************************************************************/


    /* Public Read accessor for attribute AttributeTypeName
     */
  public java.lang.String getAttributeTypeNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaAttributeTypeName;
  }



    /* Public Write accessor for attribute AttributeTypeName
     */
  public void setAttributeTypeNamePR( EAIMMCtxtIfc theCtxt, java.lang.String theAttributeTypeName) throws EAIException {

      // Get current value
    java.lang.String aAttributeTypeName = getAttributeTypeNamePR( theCtxt);
      // Check for new AttributeTypeName same as current one
    if( toObject( aAttributeTypeName) != null && toObject( aAttributeTypeName).equals( toObject( theAttributeTypeName))) { return;}

    vaAttributeTypeName = theAttributeTypeName;
    change( theCtxt, "AttributeTypeName", toObject( aAttributeTypeName), toObject( vaAttributeTypeName), "vaAttributeTypeName");
  }









/****************************************************************************
 *  Implementation of relationships of M3Attribute
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFmetaAttribute
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaAttribute
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getInverseOFmetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFmetaAttributePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFmetaAttributePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }

    /* Public InverseOFmetaAttribute number access
     */
  public int numInverseOFmetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFmetaAttributePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFmetaAttributePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Public InverseOFmetaAttribute read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc getInverseOFmetaAttributeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFmetaAttributeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFmetaAttributeAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public InverseOFmetaAttribute finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc findInverseOFmetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFmetaAttributeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFmetaAttributeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public InverseOFmetaAttribute is related predicate
     */
  public boolean hasInverseOFmetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFmetaAttributeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFmetaAttributeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Transactional InverseOFmetaAttribute is related  predicate
     */
  public boolean hasInverseOFmetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public InverseOFmetaAttribute index access
     */
  public int indexOfInverseOFmetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
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
  public void addInverseOFmetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFmetaAttributeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeInverseOFmetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFmetaAttributeBeforePR( theCtxt, theInverseOFmetaAttribute, theRelativeInverseOFmetaAttribute);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFmetaAttributeBeforePR( theCtxt, theInverseOFmetaAttribute, theRelativeInverseOFmetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role InverseOFmetaAttribute
     */
  public void removeInverseOFmetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFmetaAttribute
     */
  public void moveInverseOFmetaAttributeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeInverseOFmetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFmetaAttributeBeforePR( theCtxt, theInverseOFmetaAttribute, theRelativeInverseOFmetaAttribute);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFmetaAttributeBeforePR( theCtxt, theInverseOFmetaAttribute, theRelativeInverseOFmetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFmetaAttribute
     */
  public void moveInverseOFmetaAttributeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFmetaAttributeToLastPR( theCtxt, theInverseOFmetaAttribute);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFmetaAttributeToLastPR( theCtxt, theInverseOFmetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship InverseOFmetaAttribute
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaAttribute
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getInverseOFmetaAttributePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someInverseOFmetaAttribute = getInverseOFmetaAttributePrivileged( theCtxt);
    if( someInverseOFmetaAttribute == null) { return null;}

    int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] otherInverseOFmetaAttribute = new com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[ aInverseOFmetaAttributeLength];
    try { System.arraycopy( someInverseOFmetaAttribute, 0, otherInverseOFmetaAttribute, 0, aInverseOFmetaAttributeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaAttribute", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaAttribute", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaAttribute", null); return null;}


    return otherInverseOFmetaAttribute;
  }



    /* Public InverseOFmetaAttribute finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc findInverseOFmetaAttributeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someInverseOFmetaAttribute = getInverseOFmetaAttributePrivileged( theCtxt);
    if( someInverseOFmetaAttribute == null) { return null;}

      // Check for new InverseOFmetaAttribute already in collection
    int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaAttributeLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aInverseOFmetaAttribute = someInverseOFmetaAttribute[ anIndex];
      if( aInverseOFmetaAttribute.sameNameAs( theCtxt, theMMName)) { return aInverseOFmetaAttribute;}
    }
    return null;
  }



    /* Public InverseOFmetaAttribute finder predicate by name
     */
  public boolean hasInverseOFmetaAttributeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFmetaAttributeNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFmetaAttribute read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc getInverseOFmetaAttributeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someInverseOFmetaAttribute = getInverseOFmetaAttributePrivileged( theCtxt);
    if( someInverseOFmetaAttribute == null) { return null;}

      // Get number of InverseOFmetaAttribute
    int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;

      // Verify index within array length
    if( theIndex >= aInverseOFmetaAttributeLength) { return null;}

      // Get indexed InverseOFmetaAttribute
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aInverseOFmetaAttribute = someInverseOFmetaAttribute[ theIndex];

    return aInverseOFmetaAttribute;
  }



    /* Public InverseOFmetaAttribute is related predicate
     */
  public boolean hasInverseOFmetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException {
    return indexOfInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute) >= 0;
  }


    /* Public InverseOFmetaAttribute index access
     */
  public int indexOfInverseOFmetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFmetaAttribute == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someInverseOFmetaAttribute = getInverseOFmetaAttributePrivileged( theCtxt);
    if( someInverseOFmetaAttribute == null) { return -1;}

      // Check for new InverseOFmetaAttribute already in collection
    int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaAttributeLength ; anIndex++) {
      if( someInverseOFmetaAttribute[ anIndex].sameAs( theCtxt, theInverseOFmetaAttribute)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFmetaAttribute number access
     */
  public int numInverseOFmetaAttributePR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someInverseOFmetaAttribute = getInverseOFmetaAttributePrivileged( theCtxt);
    if( someInverseOFmetaAttribute == null) { return 0;}

      // Check for new InverseOFmetaAttribute already in collection
    int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;
    return aInverseOFmetaAttributeLength;
  }




    /* Public Write accessor for role InverseOFmetaAttribute
     */
  public void addInverseOFmetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaAttribute == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaAttribute = getInverseOFmetaAttributePrivileged( theCtxt);
    if( someInverseOFmetaAttribute == null) { return;}

      // Check for new InverseOFmetaAttribute already in collection
    int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaAttributeLength ; anIndex++) {
      if( theInverseOFmetaAttribute.sameAs( theCtxt, someInverseOFmetaAttribute[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aNewInverseOFmetaAttribute = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theInverseOFmetaAttribute;

      // Link reverse ref to this object
    aNewInverseOFmetaAttribute.unsetAndSetMetaAttributePrivileged( theCtxt, this);

      // Grow collection and add new InverseOFmetaAttribute element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaAttribute = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaAttributeLength + 1];
    try { System.arraycopy( someInverseOFmetaAttribute, 0, otherInverseOFmetaAttribute, 0, aInverseOFmetaAttributeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaAttribute", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaAttribute", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaAttribute", null); return;}
    otherInverseOFmetaAttribute[ aInverseOFmetaAttributeLength] = aNewInverseOFmetaAttribute;

      // Set the new collection
    setInverseOFmetaAttributePrivileged( theCtxt, otherInverseOFmetaAttribute);
  }




    /* Public ordered Write accessor for role InverseOFmetaAttribute
     */
  public void addInverseOFmetaAttributeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeInverseOFmetaAttribute) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaAttribute == null) { return;}

      // If relative InverseOFmetaAttribute is null, perform normal add operation
    if( theRelativeInverseOFmetaAttribute == null) {
      addInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaAttribute = getInverseOFmetaAttributePrivileged( theCtxt);
    if( someInverseOFmetaAttribute == null) { return;}


      // Get index of relative InverseOFmetaAttribute
    int aRelativeIndex = indexOfInverseOFmetaAttributePR( theCtxt, theRelativeInverseOFmetaAttribute);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);
    }

      // Get length of InverseOFmetaAttribute array
    int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFmetaAttributeLength) {
      addInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);
    }

      // Check for new InverseOFmetaAttribute already in collection
    if( hasInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute)) { return;}


    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aNewInverseOFmetaAttribute = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theInverseOFmetaAttribute;

      // Link reverse ref to this object
    aNewInverseOFmetaAttribute.unsetAndSetMetaAttributePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFmetaAttribute
      // Grow collection and add new InverseOFmetaAttribute element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaAttribute = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaAttributeLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFmetaAttribute, 0, otherInverseOFmetaAttribute, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFmetaAttribute, aRelativeIndex, otherInverseOFmetaAttribute, aRelativeIndex + 1, aInverseOFmetaAttributeLength - aRelativeIndex);
      otherInverseOFmetaAttribute[ aRelativeIndex] = aNewInverseOFmetaAttribute;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaAttributeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaAttributeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaAttributeBefore", null); return;}

      // Set the new collection
    setInverseOFmetaAttributePrivileged( theCtxt, otherInverseOFmetaAttribute);
  }





    /* Public Write accessor for role InverseOFmetaAttribute
     */
  public void removeInverseOFmetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaAttribute == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaAttribute = getInverseOFmetaAttributePrivileged( theCtxt);
    if( someInverseOFmetaAttribute == null) { return;}

      // Check for new InverseOFmetaAttribute not in collection
    int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaAttributeLength ; anIndex++) {
      if( theInverseOFmetaAttribute.sameAs( theCtxt, someInverseOFmetaAttribute[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aNewInverseOFmetaAttribute = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theInverseOFmetaAttribute;

      // Unlink reverse ref from the new related object
    aNewInverseOFmetaAttribute.unsetMetaAttributePrivileged( theCtxt);

      // Shrink collection removing InverseOFmetaAttribute element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaAttribute = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaAttributeLength - 1];
    try {
      System.arraycopy( someInverseOFmetaAttribute, 0, otherInverseOFmetaAttribute, 0, aFoundIndex);
      System.arraycopy( someInverseOFmetaAttribute, aFoundIndex + 1, otherInverseOFmetaAttribute, aFoundIndex, aInverseOFmetaAttributeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaAttribute", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaAttribute", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaAttribute", null); return;}

      // Set the new collection
    setInverseOFmetaAttributePrivileged( theCtxt, otherInverseOFmetaAttribute);
  }




    /* Public reorder accessor for role InverseOFmetaAttribute
     */
  public void moveInverseOFmetaAttributeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeInverseOFmetaAttribute) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFmetaAttribute == null) { return;}

      // If relative InverseOFmetaAttribute is null, perform move to last position
    if( theRelativeInverseOFmetaAttribute == null) {
      moveInverseOFmetaAttributeToLastPR( theCtxt, theInverseOFmetaAttribute);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaAttribute = getInverseOFmetaAttributePrivileged( theCtxt);
    if( someInverseOFmetaAttribute == null) { return;}

      // Get length of InverseOFmetaAttribute array
    int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;

      // Get index of InverseOFmetaAttribute to move
    int aToMoveIndex = indexOfInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);
      // If toMove InverseOFmetaAttribute not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFmetaAttributeLength) {
      moveInverseOFmetaAttributeToLastPR( theCtxt, theInverseOFmetaAttribute);
    }

      // Get index of relative InverseOFmetaAttribute
    int aRelativeIndex = indexOfInverseOFmetaAttributePR( theCtxt, theRelativeInverseOFmetaAttribute);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFmetaAttributeToLastPR( theCtxt, theInverseOFmetaAttribute);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFmetaAttributeLength) {
      moveInverseOFmetaAttributeToLastPR( theCtxt, theInverseOFmetaAttribute);
    }

      // ToMove and relative InverseOFmetaAttribute are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aToMoveInverseOFmetaAttribute = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theInverseOFmetaAttribute;

      // Allocate new array for new version of state of relationship InverseOFmetaAttribute
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaAttribute = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaAttributeLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFmetaAttribute, 0, otherInverseOFmetaAttribute, 0, aToMoveIndex );
        System.arraycopy( someInverseOFmetaAttribute, aToMoveIndex + 1, otherInverseOFmetaAttribute, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFmetaAttribute[ aRelativeIndex - 1] = aToMoveInverseOFmetaAttribute;
        System.arraycopy( someInverseOFmetaAttribute, aRelativeIndex, otherInverseOFmetaAttribute, aRelativeIndex, aInverseOFmetaAttributeLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFmetaAttribute, 0, otherInverseOFmetaAttribute, 0, aRelativeIndex );
        otherInverseOFmetaAttribute[ aRelativeIndex ] = aToMoveInverseOFmetaAttribute;
        System.arraycopy( someInverseOFmetaAttribute, aRelativeIndex, otherInverseOFmetaAttribute, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFmetaAttributeLength - 1) {
          System.arraycopy( someInverseOFmetaAttribute, aToMoveIndex + 1, otherInverseOFmetaAttribute, aToMoveIndex + 1, aInverseOFmetaAttributeLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaAttributeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaAttributeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaAttributeBefore", null); return;}

      // Set the new collection
    setInverseOFmetaAttributePrivileged( theCtxt, otherInverseOFmetaAttribute);
  }





    /* Public move to last accessor for role InverseOFmetaAttribute
     */
  public void moveInverseOFmetaAttributeToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFmetaAttribute == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaAttribute = getInverseOFmetaAttributePrivileged( theCtxt);
    if( someInverseOFmetaAttribute == null) { return;}

      // Get length of InverseOFmetaAttribute array
    int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;

      // Get index of InverseOFmetaAttribute to move
    int aToMoveIndex = indexOfInverseOFmetaAttributePR( theCtxt, theInverseOFmetaAttribute);

      // If toMove InverseOFmetaAttribute not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFmetaAttributeLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aToMoveInverseOFmetaAttribute = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theInverseOFmetaAttribute;

      // Allocate new array for new version of state of relationship InverseOFmetaAttribute
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaAttribute = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaAttributeLength];
    try {
      System.arraycopy( someInverseOFmetaAttribute, 0, otherInverseOFmetaAttribute, 0, aToMoveIndex );
      System.arraycopy( someInverseOFmetaAttribute, aToMoveIndex + 1, otherInverseOFmetaAttribute, aToMoveIndex, aInverseOFmetaAttributeLength - aToMoveIndex - 1);
      otherInverseOFmetaAttribute[ aInverseOFmetaAttributeLength - 1] = aToMoveInverseOFmetaAttribute;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaAttributeToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaAttributeToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaAttributeToLast", null); return;}

      // Set the new collection
    setInverseOFmetaAttributePrivileged( theCtxt, otherInverseOFmetaAttribute);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFmetaAttribute
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFmetaAttribute
     */
  public void addInverseOFmetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv theInverseOFmetaAttribute) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaAttribute == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaAttribute = getInverseOFmetaAttributePrivileged( theCtxt);
    if( someInverseOFmetaAttribute == null) { return;}

      // Check for new InverseOFmetaAttribute already in collection
    int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaAttributeLength ; anIndex++) {
      if( theInverseOFmetaAttribute.sameAs( theCtxt, someInverseOFmetaAttribute[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFmetaAttribute element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaAttribute = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaAttributeLength + 1];
    try {
      System.arraycopy( someInverseOFmetaAttribute, 0, otherInverseOFmetaAttribute, 0, aInverseOFmetaAttributeLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaAttributePrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaAttributePrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaAttributePrivileged", null); return;}

    otherInverseOFmetaAttribute[ aInverseOFmetaAttributeLength] = theInverseOFmetaAttribute;

      // Set the new collection
    setInverseOFmetaAttributePrivileged( theCtxt, otherInverseOFmetaAttribute);
  }









    /* Privileged Write accessor for role InverseOFmetaAttribute
     */
  public void removeInverseOFmetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv theInverseOFmetaAttribute) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaAttribute == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someInverseOFmetaAttribute = getInverseOFmetaAttributePrivileged( theCtxt);
    if( someInverseOFmetaAttribute == null) { return;}

      // Check for new InverseOFmetaAttribute not in collection
    int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaAttributeLength ; anIndex++) {
      if( theInverseOFmetaAttribute.sameAs( theCtxt, someInverseOFmetaAttribute[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFmetaAttribute element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaAttribute = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaAttributeLength - 1];
    try {
      System.arraycopy( someInverseOFmetaAttribute, 0, otherInverseOFmetaAttribute, 0, aFoundIndex);
      System.arraycopy( someInverseOFmetaAttribute, aFoundIndex + 1, otherInverseOFmetaAttribute, aFoundIndex, aInverseOFmetaAttributeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaAttributePrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaAttributePrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaAttributePrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFmetaAttributePrivileged( theCtxt, otherInverseOFmetaAttribute);
  }






    /* Privileged Read accessor for role InverseOFmetaAttribute
     * Guaranteed to return object with same identity of the InverseOFmetaAttribute
     */
  public com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] getInverseOFmetaAttributePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFmetaAttribute;
  }




    /* Set reference in role InverseOFmetaAttribute
     * Used by relationship maintenance machinery
     */
  public void setInverseOFmetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] theInverseOFmetaAttributeCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] aInverseOFmetaAttribute = vrInverseOFmetaAttribute;
    vrInverseOFmetaAttribute = theInverseOFmetaAttributeCollection;
      // Propagate change
    change( theCtxt, "InverseOFmetaAttribute", aInverseOFmetaAttribute, vrInverseOFmetaAttribute, "vrInverseOFmetaAttribute");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFcopiedMetaAttribute
 ****************************************************************************/


    /* Public Read accessor for role InverseOFcopiedMetaAttribute
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] getInverseOFcopiedMetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFcopiedMetaAttributePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFcopiedMetaAttributePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }

    /* Public InverseOFcopiedMetaAttribute number access
     */
  public int numInverseOFcopiedMetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFcopiedMetaAttributePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFcopiedMetaAttributePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Public InverseOFcopiedMetaAttribute read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc getInverseOFcopiedMetaAttributeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFcopiedMetaAttributeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFcopiedMetaAttributeAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public InverseOFcopiedMetaAttribute finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc findInverseOFcopiedMetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFcopiedMetaAttributeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFcopiedMetaAttributeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public InverseOFcopiedMetaAttribute is related predicate
     */
  public boolean hasInverseOFcopiedMetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFcopiedMetaAttributeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFcopiedMetaAttributeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Transactional InverseOFcopiedMetaAttribute is related  predicate
     */
  public boolean hasInverseOFcopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public InverseOFcopiedMetaAttribute index access
     */
  public int indexOfInverseOFcopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
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
  public void addInverseOFcopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFcopiedMetaAttributeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theRelativeInverseOFcopiedMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFcopiedMetaAttributeBeforePR( theCtxt, theInverseOFcopiedMetaAttribute, theRelativeInverseOFcopiedMetaAttribute);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFcopiedMetaAttributeBeforePR( theCtxt, theInverseOFcopiedMetaAttribute, theRelativeInverseOFcopiedMetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role InverseOFcopiedMetaAttribute
     */
  public void removeInverseOFcopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFcopiedMetaAttribute
     */
  public void moveInverseOFcopiedMetaAttributeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theRelativeInverseOFcopiedMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFcopiedMetaAttributeBeforePR( theCtxt, theInverseOFcopiedMetaAttribute, theRelativeInverseOFcopiedMetaAttribute);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFcopiedMetaAttributeBeforePR( theCtxt, theInverseOFcopiedMetaAttribute, theRelativeInverseOFcopiedMetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFcopiedMetaAttribute
     */
  public void moveInverseOFcopiedMetaAttributeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFcopiedMetaAttributeToLastPR( theCtxt, theInverseOFcopiedMetaAttribute);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFcopiedMetaAttributeToLastPR( theCtxt, theInverseOFcopiedMetaAttribute);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship InverseOFcopiedMetaAttribute
 ****************************************************************************/


    /* Public Read accessor for role InverseOFcopiedMetaAttribute
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] getInverseOFcopiedMetaAttributePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttributePrivileged( theCtxt);
    if( someInverseOFcopiedMetaAttribute == null) { return null;}

    int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;
    com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] otherInverseOFcopiedMetaAttribute = new com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[ aInverseOFcopiedMetaAttributeLength];
    try { System.arraycopy( someInverseOFcopiedMetaAttribute, 0, otherInverseOFcopiedMetaAttribute, 0, aInverseOFcopiedMetaAttributeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFcopiedMetaAttribute", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFcopiedMetaAttribute", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFcopiedMetaAttribute", null); return null;}


    return otherInverseOFcopiedMetaAttribute;
  }



    /* Public InverseOFcopiedMetaAttribute finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc findInverseOFcopiedMetaAttributeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttributePrivileged( theCtxt);
    if( someInverseOFcopiedMetaAttribute == null) { return null;}

      // Check for new InverseOFcopiedMetaAttribute already in collection
    int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;
    for( int anIndex = 0 ; anIndex < aInverseOFcopiedMetaAttributeLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv aInverseOFcopiedMetaAttribute = someInverseOFcopiedMetaAttribute[ anIndex];
      if( aInverseOFcopiedMetaAttribute.sameNameAs( theCtxt, theMMName)) { return aInverseOFcopiedMetaAttribute;}
    }
    return null;
  }



    /* Public InverseOFcopiedMetaAttribute finder predicate by name
     */
  public boolean hasInverseOFcopiedMetaAttributeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFcopiedMetaAttributeNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFcopiedMetaAttribute read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc getInverseOFcopiedMetaAttributeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttributePrivileged( theCtxt);
    if( someInverseOFcopiedMetaAttribute == null) { return null;}

      // Get number of InverseOFcopiedMetaAttribute
    int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;

      // Verify index within array length
    if( theIndex >= aInverseOFcopiedMetaAttributeLength) { return null;}

      // Get indexed InverseOFcopiedMetaAttribute
    com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc aInverseOFcopiedMetaAttribute = someInverseOFcopiedMetaAttribute[ theIndex];

    return aInverseOFcopiedMetaAttribute;
  }



    /* Public InverseOFcopiedMetaAttribute is related predicate
     */
  public boolean hasInverseOFcopiedMetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException {
    return indexOfInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute) >= 0;
  }


    /* Public InverseOFcopiedMetaAttribute index access
     */
  public int indexOfInverseOFcopiedMetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFcopiedMetaAttribute == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttributePrivileged( theCtxt);
    if( someInverseOFcopiedMetaAttribute == null) { return -1;}

      // Check for new InverseOFcopiedMetaAttribute already in collection
    int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;
    for( int anIndex = 0 ; anIndex < aInverseOFcopiedMetaAttributeLength ; anIndex++) {
      if( someInverseOFcopiedMetaAttribute[ anIndex].sameAs( theCtxt, theInverseOFcopiedMetaAttribute)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFcopiedMetaAttribute number access
     */
  public int numInverseOFcopiedMetaAttributePR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttributePrivileged( theCtxt);
    if( someInverseOFcopiedMetaAttribute == null) { return 0;}

      // Check for new InverseOFcopiedMetaAttribute already in collection
    int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;
    return aInverseOFcopiedMetaAttributeLength;
  }




    /* Public Write accessor for role InverseOFcopiedMetaAttribute
     */
  public void addInverseOFcopiedMetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFcopiedMetaAttribute == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttributePrivileged( theCtxt);
    if( someInverseOFcopiedMetaAttribute == null) { return;}

      // Check for new InverseOFcopiedMetaAttribute already in collection
    int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;
    for( int anIndex = 0 ; anIndex < aInverseOFcopiedMetaAttributeLength ; anIndex++) {
      if( theInverseOFcopiedMetaAttribute.sameAs( theCtxt, someInverseOFcopiedMetaAttribute[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv aNewInverseOFcopiedMetaAttribute = (com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv) theInverseOFcopiedMetaAttribute;

      // Link reverse ref to this object
    aNewInverseOFcopiedMetaAttribute.unsetAndSetCopiedMetaAttributePrivileged( theCtxt, this);

      // Grow collection and add new InverseOFcopiedMetaAttribute element
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] otherInverseOFcopiedMetaAttribute = new com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[ aInverseOFcopiedMetaAttributeLength + 1];
    try { System.arraycopy( someInverseOFcopiedMetaAttribute, 0, otherInverseOFcopiedMetaAttribute, 0, aInverseOFcopiedMetaAttributeLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFcopiedMetaAttribute", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFcopiedMetaAttribute", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFcopiedMetaAttribute", null); return;}
    otherInverseOFcopiedMetaAttribute[ aInverseOFcopiedMetaAttributeLength] = aNewInverseOFcopiedMetaAttribute;

      // Set the new collection
    setInverseOFcopiedMetaAttributePrivileged( theCtxt, otherInverseOFcopiedMetaAttribute);
  }




    /* Public ordered Write accessor for role InverseOFcopiedMetaAttribute
     */
  public void addInverseOFcopiedMetaAttributeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theRelativeInverseOFcopiedMetaAttribute) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFcopiedMetaAttribute == null) { return;}

      // If relative InverseOFcopiedMetaAttribute is null, perform normal add operation
    if( theRelativeInverseOFcopiedMetaAttribute == null) {
      addInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttributePrivileged( theCtxt);
    if( someInverseOFcopiedMetaAttribute == null) { return;}


      // Get index of relative InverseOFcopiedMetaAttribute
    int aRelativeIndex = indexOfInverseOFcopiedMetaAttributePR( theCtxt, theRelativeInverseOFcopiedMetaAttribute);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);
    }

      // Get length of InverseOFcopiedMetaAttribute array
    int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFcopiedMetaAttributeLength) {
      addInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);
    }

      // Check for new InverseOFcopiedMetaAttribute already in collection
    if( hasInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute)) { return;}


    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv aNewInverseOFcopiedMetaAttribute = (com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv) theInverseOFcopiedMetaAttribute;

      // Link reverse ref to this object
    aNewInverseOFcopiedMetaAttribute.unsetAndSetCopiedMetaAttributePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFcopiedMetaAttribute
      // Grow collection and add new InverseOFcopiedMetaAttribute element
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] otherInverseOFcopiedMetaAttribute = new com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[ aInverseOFcopiedMetaAttributeLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFcopiedMetaAttribute, 0, otherInverseOFcopiedMetaAttribute, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFcopiedMetaAttribute, aRelativeIndex, otherInverseOFcopiedMetaAttribute, aRelativeIndex + 1, aInverseOFcopiedMetaAttributeLength - aRelativeIndex);
      otherInverseOFcopiedMetaAttribute[ aRelativeIndex] = aNewInverseOFcopiedMetaAttribute;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFcopiedMetaAttributeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFcopiedMetaAttributeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFcopiedMetaAttributeBefore", null); return;}

      // Set the new collection
    setInverseOFcopiedMetaAttributePrivileged( theCtxt, otherInverseOFcopiedMetaAttribute);
  }





    /* Public Write accessor for role InverseOFcopiedMetaAttribute
     */
  public void removeInverseOFcopiedMetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFcopiedMetaAttribute == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttributePrivileged( theCtxt);
    if( someInverseOFcopiedMetaAttribute == null) { return;}

      // Check for new InverseOFcopiedMetaAttribute not in collection
    int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFcopiedMetaAttributeLength ; anIndex++) {
      if( theInverseOFcopiedMetaAttribute.sameAs( theCtxt, someInverseOFcopiedMetaAttribute[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv aNewInverseOFcopiedMetaAttribute = (com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv) theInverseOFcopiedMetaAttribute;

      // Unlink reverse ref from the new related object
    aNewInverseOFcopiedMetaAttribute.unsetCopiedMetaAttributePrivileged( theCtxt);

      // Shrink collection removing InverseOFcopiedMetaAttribute element
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] otherInverseOFcopiedMetaAttribute = new com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[ aInverseOFcopiedMetaAttributeLength - 1];
    try {
      System.arraycopy( someInverseOFcopiedMetaAttribute, 0, otherInverseOFcopiedMetaAttribute, 0, aFoundIndex);
      System.arraycopy( someInverseOFcopiedMetaAttribute, aFoundIndex + 1, otherInverseOFcopiedMetaAttribute, aFoundIndex, aInverseOFcopiedMetaAttributeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFcopiedMetaAttribute", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFcopiedMetaAttribute", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFcopiedMetaAttribute", null); return;}

      // Set the new collection
    setInverseOFcopiedMetaAttributePrivileged( theCtxt, otherInverseOFcopiedMetaAttribute);
  }




    /* Public reorder accessor for role InverseOFcopiedMetaAttribute
     */
  public void moveInverseOFcopiedMetaAttributeBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theRelativeInverseOFcopiedMetaAttribute) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFcopiedMetaAttribute == null) { return;}

      // If relative InverseOFcopiedMetaAttribute is null, perform move to last position
    if( theRelativeInverseOFcopiedMetaAttribute == null) {
      moveInverseOFcopiedMetaAttributeToLastPR( theCtxt, theInverseOFcopiedMetaAttribute);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttributePrivileged( theCtxt);
    if( someInverseOFcopiedMetaAttribute == null) { return;}

      // Get length of InverseOFcopiedMetaAttribute array
    int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;

      // Get index of InverseOFcopiedMetaAttribute to move
    int aToMoveIndex = indexOfInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);
      // If toMove InverseOFcopiedMetaAttribute not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFcopiedMetaAttributeLength) {
      moveInverseOFcopiedMetaAttributeToLastPR( theCtxt, theInverseOFcopiedMetaAttribute);
    }

      // Get index of relative InverseOFcopiedMetaAttribute
    int aRelativeIndex = indexOfInverseOFcopiedMetaAttributePR( theCtxt, theRelativeInverseOFcopiedMetaAttribute);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFcopiedMetaAttributeToLastPR( theCtxt, theInverseOFcopiedMetaAttribute);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFcopiedMetaAttributeLength) {
      moveInverseOFcopiedMetaAttributeToLastPR( theCtxt, theInverseOFcopiedMetaAttribute);
    }

      // ToMove and relative InverseOFcopiedMetaAttribute are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv aToMoveInverseOFcopiedMetaAttribute = (com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv) theInverseOFcopiedMetaAttribute;

      // Allocate new array for new version of state of relationship InverseOFcopiedMetaAttribute
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] otherInverseOFcopiedMetaAttribute = new com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[ aInverseOFcopiedMetaAttributeLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFcopiedMetaAttribute, 0, otherInverseOFcopiedMetaAttribute, 0, aToMoveIndex );
        System.arraycopy( someInverseOFcopiedMetaAttribute, aToMoveIndex + 1, otherInverseOFcopiedMetaAttribute, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFcopiedMetaAttribute[ aRelativeIndex - 1] = aToMoveInverseOFcopiedMetaAttribute;
        System.arraycopy( someInverseOFcopiedMetaAttribute, aRelativeIndex, otherInverseOFcopiedMetaAttribute, aRelativeIndex, aInverseOFcopiedMetaAttributeLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFcopiedMetaAttribute, 0, otherInverseOFcopiedMetaAttribute, 0, aRelativeIndex );
        otherInverseOFcopiedMetaAttribute[ aRelativeIndex ] = aToMoveInverseOFcopiedMetaAttribute;
        System.arraycopy( someInverseOFcopiedMetaAttribute, aRelativeIndex, otherInverseOFcopiedMetaAttribute, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFcopiedMetaAttributeLength - 1) {
          System.arraycopy( someInverseOFcopiedMetaAttribute, aToMoveIndex + 1, otherInverseOFcopiedMetaAttribute, aToMoveIndex + 1, aInverseOFcopiedMetaAttributeLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFcopiedMetaAttributeBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFcopiedMetaAttributeBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFcopiedMetaAttributeBefore", null); return;}

      // Set the new collection
    setInverseOFcopiedMetaAttributePrivileged( theCtxt, otherInverseOFcopiedMetaAttribute);
  }





    /* Public move to last accessor for role InverseOFcopiedMetaAttribute
     */
  public void moveInverseOFcopiedMetaAttributeToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFcopiedMetaAttribute == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttributePrivileged( theCtxt);
    if( someInverseOFcopiedMetaAttribute == null) { return;}

      // Get length of InverseOFcopiedMetaAttribute array
    int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;

      // Get index of InverseOFcopiedMetaAttribute to move
    int aToMoveIndex = indexOfInverseOFcopiedMetaAttributePR( theCtxt, theInverseOFcopiedMetaAttribute);

      // If toMove InverseOFcopiedMetaAttribute not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFcopiedMetaAttributeLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv aToMoveInverseOFcopiedMetaAttribute = (com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv) theInverseOFcopiedMetaAttribute;

      // Allocate new array for new version of state of relationship InverseOFcopiedMetaAttribute
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] otherInverseOFcopiedMetaAttribute = new com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[ aInverseOFcopiedMetaAttributeLength];
    try {
      System.arraycopy( someInverseOFcopiedMetaAttribute, 0, otherInverseOFcopiedMetaAttribute, 0, aToMoveIndex );
      System.arraycopy( someInverseOFcopiedMetaAttribute, aToMoveIndex + 1, otherInverseOFcopiedMetaAttribute, aToMoveIndex, aInverseOFcopiedMetaAttributeLength - aToMoveIndex - 1);
      otherInverseOFcopiedMetaAttribute[ aInverseOFcopiedMetaAttributeLength - 1] = aToMoveInverseOFcopiedMetaAttribute;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFcopiedMetaAttributeToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFcopiedMetaAttributeToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFcopiedMetaAttributeToLast", null); return;}

      // Set the new collection
    setInverseOFcopiedMetaAttributePrivileged( theCtxt, otherInverseOFcopiedMetaAttribute);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFcopiedMetaAttribute
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFcopiedMetaAttribute
     */
  public void addInverseOFcopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv theInverseOFcopiedMetaAttribute) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFcopiedMetaAttribute == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttributePrivileged( theCtxt);
    if( someInverseOFcopiedMetaAttribute == null) { return;}

      // Check for new InverseOFcopiedMetaAttribute already in collection
    int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;
    for( int anIndex = 0 ; anIndex < aInverseOFcopiedMetaAttributeLength ; anIndex++) {
      if( theInverseOFcopiedMetaAttribute.sameAs( theCtxt, someInverseOFcopiedMetaAttribute[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFcopiedMetaAttribute element
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] otherInverseOFcopiedMetaAttribute = new com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[ aInverseOFcopiedMetaAttributeLength + 1];
    try {
      System.arraycopy( someInverseOFcopiedMetaAttribute, 0, otherInverseOFcopiedMetaAttribute, 0, aInverseOFcopiedMetaAttributeLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFcopiedMetaAttributePrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFcopiedMetaAttributePrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFcopiedMetaAttributePrivileged", null); return;}

    otherInverseOFcopiedMetaAttribute[ aInverseOFcopiedMetaAttributeLength] = theInverseOFcopiedMetaAttribute;

      // Set the new collection
    setInverseOFcopiedMetaAttributePrivileged( theCtxt, otherInverseOFcopiedMetaAttribute);
  }









    /* Privileged Write accessor for role InverseOFcopiedMetaAttribute
     */
  public void removeInverseOFcopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv theInverseOFcopiedMetaAttribute) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFcopiedMetaAttribute == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttributePrivileged( theCtxt);
    if( someInverseOFcopiedMetaAttribute == null) { return;}

      // Check for new InverseOFcopiedMetaAttribute not in collection
    int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFcopiedMetaAttributeLength ; anIndex++) {
      if( theInverseOFcopiedMetaAttribute.sameAs( theCtxt, someInverseOFcopiedMetaAttribute[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFcopiedMetaAttribute element
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] otherInverseOFcopiedMetaAttribute = new com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[ aInverseOFcopiedMetaAttributeLength - 1];
    try {
      System.arraycopy( someInverseOFcopiedMetaAttribute, 0, otherInverseOFcopiedMetaAttribute, 0, aFoundIndex);
      System.arraycopy( someInverseOFcopiedMetaAttribute, aFoundIndex + 1, otherInverseOFcopiedMetaAttribute, aFoundIndex, aInverseOFcopiedMetaAttributeLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFcopiedMetaAttributePrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFcopiedMetaAttributePrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFcopiedMetaAttributePrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv.class}); return;}

      // Set the new collection
    setInverseOFcopiedMetaAttributePrivileged( theCtxt, otherInverseOFcopiedMetaAttribute);
  }






    /* Privileged Read accessor for role InverseOFcopiedMetaAttribute
     * Guaranteed to return object with same identity of the InverseOFcopiedMetaAttribute
     */
  public com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] getInverseOFcopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFcopiedMetaAttribute;
  }




    /* Set reference in role InverseOFcopiedMetaAttribute
     * Used by relationship maintenance machinery
     */
  public void setInverseOFcopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] theInverseOFcopiedMetaAttributeCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] aInverseOFcopiedMetaAttribute = vrInverseOFcopiedMetaAttribute;
    vrInverseOFcopiedMetaAttribute = theInverseOFcopiedMetaAttributeCollection;
      // Propagate change
    change( theCtxt, "InverseOFcopiedMetaAttribute", aInverseOFcopiedMetaAttribute, vrInverseOFcopiedMetaAttribute, "vrInverseOFcopiedMetaAttribute");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFexcludedInRelationshipNamed
 ****************************************************************************/


    /* Public Read accessor for role InverseOFexcludedInRelationshipNamed
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFexcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFexcludedInRelationshipNamedPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFexcludedInRelationshipNamedPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }

    /* Public InverseOFexcludedInRelationshipNamed number access
     */
  public int numInverseOFexcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFexcludedInRelationshipNamedPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFexcludedInRelationshipNamedPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Public InverseOFexcludedInRelationshipNamed read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFexcludedInRelationshipNamedAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFexcludedInRelationshipNamedAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFexcludedInRelationshipNamedAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public InverseOFexcludedInRelationshipNamed finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFexcludedInRelationshipNamedNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFexcludedInRelationshipNamedNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFexcludedInRelationshipNamedNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public InverseOFexcludedInRelationshipNamed is related predicate
     */
  public boolean hasInverseOFexcludedInRelationshipNamedNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFexcludedInRelationshipNamedNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFexcludedInRelationshipNamedNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Transactional InverseOFexcludedInRelationshipNamed is related  predicate
     */
  public boolean hasInverseOFexcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public InverseOFexcludedInRelationshipNamed index access
     */
  public int indexOfInverseOFexcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
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
  public void addInverseOFexcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addInverseOFexcludedInRelationshipNamedBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFexcludedInRelationshipNamed) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFexcludedInRelationshipNamedBeforePR( theCtxt, theInverseOFexcludedInRelationshipNamed, theRelativeInverseOFexcludedInRelationshipNamed);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFexcludedInRelationshipNamedBeforePR( theCtxt, theInverseOFexcludedInRelationshipNamed, theRelativeInverseOFexcludedInRelationshipNamed);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void removeInverseOFexcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void moveInverseOFexcludedInRelationshipNamedBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFexcludedInRelationshipNamed) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFexcludedInRelationshipNamedBeforePR( theCtxt, theInverseOFexcludedInRelationshipNamed, theRelativeInverseOFexcludedInRelationshipNamed);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFexcludedInRelationshipNamedBeforePR( theCtxt, theInverseOFexcludedInRelationshipNamed, theRelativeInverseOFexcludedInRelationshipNamed);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void moveInverseOFexcludedInRelationshipNamedToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFexcludedInRelationshipNamedToLastPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFexcludedInRelationshipNamedToLastPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship InverseOFexcludedInRelationshipNamed
 ****************************************************************************/


    /* Public Read accessor for role InverseOFexcludedInRelationshipNamed
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFexcludedInRelationshipNamedPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamedPrivileged( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed == null) { return null;}

    int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] otherInverseOFexcludedInRelationshipNamed = new com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[ aInverseOFexcludedInRelationshipNamedLength];
    try { System.arraycopy( someInverseOFexcludedInRelationshipNamed, 0, otherInverseOFexcludedInRelationshipNamed, 0, aInverseOFexcludedInRelationshipNamedLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFexcludedInRelationshipNamed", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFexcludedInRelationshipNamed", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFexcludedInRelationshipNamed", null); return null;}


    return otherInverseOFexcludedInRelationshipNamed;
  }



    /* Public InverseOFexcludedInRelationshipNamed finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFexcludedInRelationshipNamedNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamedPrivileged( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed == null) { return null;}

      // Check for new InverseOFexcludedInRelationshipNamed already in collection
    int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;
    for( int anIndex = 0 ; anIndex < aInverseOFexcludedInRelationshipNamedLength ; anIndex++) {
      com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aInverseOFexcludedInRelationshipNamed = someInverseOFexcludedInRelationshipNamed[ anIndex];
      if( aInverseOFexcludedInRelationshipNamed.sameNameAs( theCtxt, theMMName)) { return aInverseOFexcludedInRelationshipNamed;}
    }
    return null;
  }



    /* Public InverseOFexcludedInRelationshipNamed finder predicate by name
     */
  public boolean hasInverseOFexcludedInRelationshipNamedNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFexcludedInRelationshipNamedNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFexcludedInRelationshipNamed read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFexcludedInRelationshipNamedAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamedPrivileged( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed == null) { return null;}

      // Get number of InverseOFexcludedInRelationshipNamed
    int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;

      // Verify index within array length
    if( theIndex >= aInverseOFexcludedInRelationshipNamedLength) { return null;}

      // Get indexed InverseOFexcludedInRelationshipNamed
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFexcludedInRelationshipNamed = someInverseOFexcludedInRelationshipNamed[ theIndex];

    return aInverseOFexcludedInRelationshipNamed;
  }



    /* Public InverseOFexcludedInRelationshipNamed is related predicate
     */
  public boolean hasInverseOFexcludedInRelationshipNamedPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException {
    return indexOfInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed) >= 0;
  }


    /* Public InverseOFexcludedInRelationshipNamed index access
     */
  public int indexOfInverseOFexcludedInRelationshipNamedPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFexcludedInRelationshipNamed == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamedPrivileged( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed == null) { return -1;}

      // Check for new InverseOFexcludedInRelationshipNamed already in collection
    int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;
    for( int anIndex = 0 ; anIndex < aInverseOFexcludedInRelationshipNamedLength ; anIndex++) {
      if( someInverseOFexcludedInRelationshipNamed[ anIndex].sameAs( theCtxt, theInverseOFexcludedInRelationshipNamed)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFexcludedInRelationshipNamed number access
     */
  public int numInverseOFexcludedInRelationshipNamedPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamedPrivileged( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed == null) { return 0;}

      // Check for new InverseOFexcludedInRelationshipNamed already in collection
    int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;
    return aInverseOFexcludedInRelationshipNamedLength;
  }




    /* Public Write accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void addInverseOFexcludedInRelationshipNamedPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFexcludedInRelationshipNamed == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamedPrivileged( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed == null) { return;}

      // Check for new InverseOFexcludedInRelationshipNamed already in collection
    int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;
    for( int anIndex = 0 ; anIndex < aInverseOFexcludedInRelationshipNamedLength ; anIndex++) {
      if( theInverseOFexcludedInRelationshipNamed.sameAs( theCtxt, someInverseOFexcludedInRelationshipNamed[ anIndex])) { return;}
    }

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFexcludedInRelationshipNamed = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFexcludedInRelationshipNamed;

      // Link reverse ref to this object
    aNewInverseOFexcludedInRelationshipNamed.unsetAndSetExcludedInRelationshipNamedPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFexcludedInRelationshipNamed element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexcludedInRelationshipNamed = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexcludedInRelationshipNamedLength + 1];
    try { System.arraycopy( someInverseOFexcludedInRelationshipNamed, 0, otherInverseOFexcludedInRelationshipNamed, 0, aInverseOFexcludedInRelationshipNamedLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexcludedInRelationshipNamed", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexcludedInRelationshipNamed", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexcludedInRelationshipNamed", null); return;}
    otherInverseOFexcludedInRelationshipNamed[ aInverseOFexcludedInRelationshipNamedLength] = aNewInverseOFexcludedInRelationshipNamed;

      // Set the new collection
    setInverseOFexcludedInRelationshipNamedPrivileged( theCtxt, otherInverseOFexcludedInRelationshipNamed);
  }




    /* Public ordered Write accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void addInverseOFexcludedInRelationshipNamedBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFexcludedInRelationshipNamed) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFexcludedInRelationshipNamed == null) { return;}

      // If relative InverseOFexcludedInRelationshipNamed is null, perform normal add operation
    if( theRelativeInverseOFexcludedInRelationshipNamed == null) {
      addInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamedPrivileged( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed == null) { return;}


      // Get index of relative InverseOFexcludedInRelationshipNamed
    int aRelativeIndex = indexOfInverseOFexcludedInRelationshipNamedPR( theCtxt, theRelativeInverseOFexcludedInRelationshipNamed);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
    }

      // Get length of InverseOFexcludedInRelationshipNamed array
    int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFexcludedInRelationshipNamedLength) {
      addInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
    }

      // Check for new InverseOFexcludedInRelationshipNamed already in collection
    if( hasInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed)) { return;}


    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFexcludedInRelationshipNamed = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFexcludedInRelationshipNamed;

      // Link reverse ref to this object
    aNewInverseOFexcludedInRelationshipNamed.unsetAndSetExcludedInRelationshipNamedPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFexcludedInRelationshipNamed
      // Grow collection and add new InverseOFexcludedInRelationshipNamed element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexcludedInRelationshipNamed = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexcludedInRelationshipNamedLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFexcludedInRelationshipNamed, 0, otherInverseOFexcludedInRelationshipNamed, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFexcludedInRelationshipNamed, aRelativeIndex, otherInverseOFexcludedInRelationshipNamed, aRelativeIndex + 1, aInverseOFexcludedInRelationshipNamedLength - aRelativeIndex);
      otherInverseOFexcludedInRelationshipNamed[ aRelativeIndex] = aNewInverseOFexcludedInRelationshipNamed;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexcludedInRelationshipNamedBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexcludedInRelationshipNamedBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexcludedInRelationshipNamedBefore", null); return;}

      // Set the new collection
    setInverseOFexcludedInRelationshipNamedPrivileged( theCtxt, otherInverseOFexcludedInRelationshipNamed);
  }





    /* Public Write accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void removeInverseOFexcludedInRelationshipNamedPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFexcludedInRelationshipNamed == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamedPrivileged( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed == null) { return;}

      // Check for new InverseOFexcludedInRelationshipNamed not in collection
    int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFexcludedInRelationshipNamedLength ; anIndex++) {
      if( theInverseOFexcludedInRelationshipNamed.sameAs( theCtxt, someInverseOFexcludedInRelationshipNamed[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aNewInverseOFexcludedInRelationshipNamed = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFexcludedInRelationshipNamed;

      // Unlink reverse ref from the new related object
    aNewInverseOFexcludedInRelationshipNamed.unsetExcludedInRelationshipNamedPrivileged( theCtxt);

      // Shrink collection removing InverseOFexcludedInRelationshipNamed element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexcludedInRelationshipNamed = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexcludedInRelationshipNamedLength - 1];
    try {
      System.arraycopy( someInverseOFexcludedInRelationshipNamed, 0, otherInverseOFexcludedInRelationshipNamed, 0, aFoundIndex);
      System.arraycopy( someInverseOFexcludedInRelationshipNamed, aFoundIndex + 1, otherInverseOFexcludedInRelationshipNamed, aFoundIndex, aInverseOFexcludedInRelationshipNamedLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFexcludedInRelationshipNamed", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFexcludedInRelationshipNamed", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFexcludedInRelationshipNamed", null); return;}

      // Set the new collection
    setInverseOFexcludedInRelationshipNamedPrivileged( theCtxt, otherInverseOFexcludedInRelationshipNamed);
  }




    /* Public reorder accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void moveInverseOFexcludedInRelationshipNamedBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFexcludedInRelationshipNamed) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFexcludedInRelationshipNamed == null) { return;}

      // If relative InverseOFexcludedInRelationshipNamed is null, perform move to last position
    if( theRelativeInverseOFexcludedInRelationshipNamed == null) {
      moveInverseOFexcludedInRelationshipNamedToLastPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
    }

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamedPrivileged( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed == null) { return;}

      // Get length of InverseOFexcludedInRelationshipNamed array
    int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;

      // Get index of InverseOFexcludedInRelationshipNamed to move
    int aToMoveIndex = indexOfInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
      // If toMove InverseOFexcludedInRelationshipNamed not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFexcludedInRelationshipNamedLength) {
      moveInverseOFexcludedInRelationshipNamedToLastPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
    }

      // Get index of relative InverseOFexcludedInRelationshipNamed
    int aRelativeIndex = indexOfInverseOFexcludedInRelationshipNamedPR( theCtxt, theRelativeInverseOFexcludedInRelationshipNamed);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFexcludedInRelationshipNamedToLastPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFexcludedInRelationshipNamedLength) {
      moveInverseOFexcludedInRelationshipNamedToLastPR( theCtxt, theInverseOFexcludedInRelationshipNamed);
    }

      // ToMove and relative InverseOFexcludedInRelationshipNamed are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFexcludedInRelationshipNamed = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFexcludedInRelationshipNamed;

      // Allocate new array for new version of state of relationship InverseOFexcludedInRelationshipNamed
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexcludedInRelationshipNamed = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexcludedInRelationshipNamedLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFexcludedInRelationshipNamed, 0, otherInverseOFexcludedInRelationshipNamed, 0, aToMoveIndex );
        System.arraycopy( someInverseOFexcludedInRelationshipNamed, aToMoveIndex + 1, otherInverseOFexcludedInRelationshipNamed, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFexcludedInRelationshipNamed[ aRelativeIndex - 1] = aToMoveInverseOFexcludedInRelationshipNamed;
        System.arraycopy( someInverseOFexcludedInRelationshipNamed, aRelativeIndex, otherInverseOFexcludedInRelationshipNamed, aRelativeIndex, aInverseOFexcludedInRelationshipNamedLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFexcludedInRelationshipNamed, 0, otherInverseOFexcludedInRelationshipNamed, 0, aRelativeIndex );
        otherInverseOFexcludedInRelationshipNamed[ aRelativeIndex ] = aToMoveInverseOFexcludedInRelationshipNamed;
        System.arraycopy( someInverseOFexcludedInRelationshipNamed, aRelativeIndex, otherInverseOFexcludedInRelationshipNamed, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFexcludedInRelationshipNamedLength - 1) {
          System.arraycopy( someInverseOFexcludedInRelationshipNamed, aToMoveIndex + 1, otherInverseOFexcludedInRelationshipNamed, aToMoveIndex + 1, aInverseOFexcludedInRelationshipNamedLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFexcludedInRelationshipNamedBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFexcludedInRelationshipNamedBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFexcludedInRelationshipNamedBefore", null); return;}

      // Set the new collection
    setInverseOFexcludedInRelationshipNamedPrivileged( theCtxt, otherInverseOFexcludedInRelationshipNamed);
  }





    /* Public move to last accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void moveInverseOFexcludedInRelationshipNamedToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFexcludedInRelationshipNamed == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamedPrivileged( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed == null) { return;}

      // Get length of InverseOFexcludedInRelationshipNamed array
    int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;

      // Get index of InverseOFexcludedInRelationshipNamed to move
    int aToMoveIndex = indexOfInverseOFexcludedInRelationshipNamedPR( theCtxt, theInverseOFexcludedInRelationshipNamed);

      // If toMove InverseOFexcludedInRelationshipNamed not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFexcludedInRelationshipNamedLength - 1) { return;}

    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv aToMoveInverseOFexcludedInRelationshipNamed = (com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv) theInverseOFexcludedInRelationshipNamed;

      // Allocate new array for new version of state of relationship InverseOFexcludedInRelationshipNamed
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexcludedInRelationshipNamed = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexcludedInRelationshipNamedLength];
    try {
      System.arraycopy( someInverseOFexcludedInRelationshipNamed, 0, otherInverseOFexcludedInRelationshipNamed, 0, aToMoveIndex );
      System.arraycopy( someInverseOFexcludedInRelationshipNamed, aToMoveIndex + 1, otherInverseOFexcludedInRelationshipNamed, aToMoveIndex, aInverseOFexcludedInRelationshipNamedLength - aToMoveIndex - 1);
      otherInverseOFexcludedInRelationshipNamed[ aInverseOFexcludedInRelationshipNamedLength - 1] = aToMoveInverseOFexcludedInRelationshipNamed;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFexcludedInRelationshipNamedToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFexcludedInRelationshipNamedToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFexcludedInRelationshipNamedToLast", null); return;}

      // Set the new collection
    setInverseOFexcludedInRelationshipNamedPrivileged( theCtxt, otherInverseOFexcludedInRelationshipNamed);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFexcludedInRelationshipNamed
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void addInverseOFexcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFexcludedInRelationshipNamed) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFexcludedInRelationshipNamed == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamedPrivileged( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed == null) { return;}

      // Check for new InverseOFexcludedInRelationshipNamed already in collection
    int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;
    for( int anIndex = 0 ; anIndex < aInverseOFexcludedInRelationshipNamedLength ; anIndex++) {
      if( theInverseOFexcludedInRelationshipNamed.sameAs( theCtxt, someInverseOFexcludedInRelationshipNamed[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFexcludedInRelationshipNamed element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexcludedInRelationshipNamed = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexcludedInRelationshipNamedLength + 1];
    try {
      System.arraycopy( someInverseOFexcludedInRelationshipNamed, 0, otherInverseOFexcludedInRelationshipNamed, 0, aInverseOFexcludedInRelationshipNamedLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexcludedInRelationshipNamedPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexcludedInRelationshipNamedPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFexcludedInRelationshipNamedPrivileged", null); return;}

    otherInverseOFexcludedInRelationshipNamed[ aInverseOFexcludedInRelationshipNamedLength] = theInverseOFexcludedInRelationshipNamed;

      // Set the new collection
    setInverseOFexcludedInRelationshipNamedPrivileged( theCtxt, otherInverseOFexcludedInRelationshipNamed);
  }









    /* Privileged Write accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void removeInverseOFexcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFexcludedInRelationshipNamed) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFexcludedInRelationshipNamed == null) { return;}

      // Get current value
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamedPrivileged( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed == null) { return;}

      // Check for new InverseOFexcludedInRelationshipNamed not in collection
    int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFexcludedInRelationshipNamedLength ; anIndex++) {
      if( theInverseOFexcludedInRelationshipNamed.sameAs( theCtxt, someInverseOFexcludedInRelationshipNamed[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFexcludedInRelationshipNamed element
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] otherInverseOFexcludedInRelationshipNamed = new com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[ aInverseOFexcludedInRelationshipNamedLength - 1];
    try {
      System.arraycopy( someInverseOFexcludedInRelationshipNamed, 0, otherInverseOFexcludedInRelationshipNamed, 0, aFoundIndex);
      System.arraycopy( someInverseOFexcludedInRelationshipNamed, aFoundIndex + 1, otherInverseOFexcludedInRelationshipNamed, aFoundIndex, aInverseOFexcludedInRelationshipNamedLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFexcludedInRelationshipNamedPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFexcludedInRelationshipNamedPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFexcludedInRelationshipNamedPrivileged", new Class[] { com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFexcludedInRelationshipNamedPrivileged( theCtxt, otherInverseOFexcludedInRelationshipNamed);
  }






    /* Privileged Read accessor for role InverseOFexcludedInRelationshipNamed
     * Guaranteed to return object with same identity of the InverseOFexcludedInRelationshipNamed
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFexcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFexcludedInRelationshipNamed;
  }




    /* Set reference in role InverseOFexcludedInRelationshipNamed
     * Used by relationship maintenance machinery
     */
  public void setInverseOFexcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFexcludedInRelationshipNamedCollection) throws EAIException {
    com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] aInverseOFexcludedInRelationshipNamed = vrInverseOFexcludedInRelationshipNamed;
    vrInverseOFexcludedInRelationshipNamed = theInverseOFexcludedInRelationshipNamedCollection;
      // Propagate change
    change( theCtxt, "InverseOFexcludedInRelationshipNamed", aInverseOFexcludedInRelationshipNamed, vrInverseOFexcludedInRelationshipNamed, "vrInverseOFexcludedInRelationshipNamed");
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
      aType.removeAttributesPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetTypePrivileged();
      */
    }

    if( theType != null) {
      com.dosmil_e.m3.core.priv.M3TypePriv aNewType = (com.dosmil_e.m3.core.priv.M3TypePriv) theType;
      aNewType.addAttributesPrivileged( theCtxt, this);
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
      aType.removeAttributesPrivileged( theCtxt, this);
    }
    vrType = theType;
      // If there was change, propagate
    if( (aType != null && !aType.sameAs( theCtxt, theType)) || (aType == null && theType != null)) {
      change( theCtxt, "Type", aType, vrType, "vrType");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship ValueType
 ****************************************************************************/


    /* Public Read accessor for role ValueType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getValueType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getValueTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getValueTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }

    /* Public ValueType number access
     */
  public int numValueType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numValueTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numValueTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Public ValueType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getValueTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getValueTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getValueTypeAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public ValueType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findValueTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findValueTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findValueTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public ValueType is related predicate
     */
  public boolean hasValueTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasValueTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasValueTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Transactional ValueType is related  predicate
     */
  public boolean hasValueType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theValueType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasValueTypePR( theCtxt, theValueType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasValueTypePR( theCtxt, theValueType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public ValueType index access
     */
  public int indexOfValueType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theValueType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfValueTypePR( theCtxt, theValueType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfValueTypePR( theCtxt, theValueType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public Write accessor for role ValueType
     */
  public void setValueType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theValueType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setValueTypePR( theCtxt, theValueType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setValueTypePR( theCtxt, theValueType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship ValueType
 ****************************************************************************/


    /* Public Read accessor for role ValueType
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getValueTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getValueTypePrivileged( theCtxt);
  }


    /* Public ValueType number access
     */
  public int numValueTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getValueTypePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public ValueType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getValueTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getValueTypePrivileged( theCtxt);
  }


    /* Public ValueType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findValueTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3TypeIfc aValueType = getValueTypePrivileged( theCtxt);
    if( aValueType == null) { return null;}

    if( !aValueType.sameNameAs( theCtxt, theMMName)) { return null;}

    return aValueType;
  }


    /* Public ValueType finder predicate by name
     */
  public boolean hasValueTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aValueType = getValueTypePrivileged( theCtxt);
    if( aValueType == null) { return false;}

    return aValueType.sameNameAs( theCtxt, theMMName);
  }



    /* Public ValueType is related predicate
     */
  public boolean hasValueTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theValueType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aValueType = getValueTypePrivileged( theCtxt);
    if( aValueType == null) { return false;}

    return aValueType.sameAs( theCtxt, theValueType);
  }




    /* Public ValueType index access
     */
  public int indexOfValueTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theValueType) throws EAIException {
    if( !hasValueTypePR( theCtxt, theValueType)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role ValueType
     */
  public void setValueTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theValueType) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv aValueType = getValueTypePrivileged( theCtxt);
      // Check for new ValueType same as current one
    if( aValueType != null && aValueType.sameAs( theCtxt, theValueType)) { return;}

    if( aValueType != null) {
      aValueType.removeTypeOfValuesPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetValueTypePrivileged();
      */
    }

    if( theValueType != null) {
      com.dosmil_e.m3.core.priv.M3TypePriv aNewValueType = (com.dosmil_e.m3.core.priv.M3TypePriv) theValueType;
      aNewValueType.addTypeOfValuesPrivileged( theCtxt, this);
      setValueTypePrivileged( theCtxt, aNewValueType);
    }
    else {
      setValueTypePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship ValueType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ValueType
     * Guaranteed to return object with same identity of the ValueType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getValueTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrValueType;
  }




    /* Remove current reference in role ValueType
     * Used by relationship maintenance machinery
     */
  public void unsetValueTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aValueType = vrValueType;
    vrValueType = null;
      // If there was change, propagate
    if( aValueType != null) {
      change( theCtxt, "ValueType", aValueType, vrValueType, "vrValueType");
    }
  }





    /* Set reference in role ValueType
     * Used by relationship maintenance machinery
     */
  public void setValueTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theValueType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aValueType = vrValueType;
    vrValueType = theValueType;
      // If there was change, propagate
    if( (aValueType != null && !aValueType.sameAs( theCtxt, theValueType)) || (aValueType == null && theValueType != null)) {
      change( theCtxt, "ValueType", aValueType, vrValueType, "vrValueType");
    }
  }





    /* Unset currently related ValueType and
     * Set reference in role ValueType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetValueTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theValueType) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv aValueType = vrValueType;
    if( aValueType != null) {
      aValueType.removeTypeOfValuesPrivileged( theCtxt, this);
    }
    vrValueType = theValueType;
      // If there was change, propagate
    if( (aValueType != null && !aValueType.sameAs( theCtxt, theValueType)) || (aValueType == null && theValueType != null)) {
      change( theCtxt, "ValueType", aValueType, vrValueType, "vrValueType");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3Attribute
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 
      // When deleting : unreference attribute AttributeTypeName
  setAttributeTypeName( theCtxt, null);



 
      // When deleting : unlink related InverseOFmetaAttribute
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaAttribute = getInverseOFmetaAttribute( theCtxt);
    if( someInverseOFmetaAttribute != null) {
      int aInverseOFmetaAttributeLength = someInverseOFmetaAttribute.length;
      for( int anIndex = 0 ; anIndex < aInverseOFmetaAttributeLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aInverseOFmetaAttribute = someInverseOFmetaAttribute[ anIndex];
        if( aInverseOFmetaAttribute != null) {
          removeInverseOFmetaAttribute( theCtxt, aInverseOFmetaAttribute);
        }
      }
    }


      // When deleting : unlink related InverseOFcopiedMetaAttribute
    com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] someInverseOFcopiedMetaAttribute = getInverseOFcopiedMetaAttribute( theCtxt);
    if( someInverseOFcopiedMetaAttribute != null) {
      int aInverseOFcopiedMetaAttributeLength = someInverseOFcopiedMetaAttribute.length;
      for( int anIndex = 0 ; anIndex < aInverseOFcopiedMetaAttributeLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc aInverseOFcopiedMetaAttribute = someInverseOFcopiedMetaAttribute[ anIndex];
        if( aInverseOFcopiedMetaAttribute != null) {
          removeInverseOFcopiedMetaAttribute( theCtxt, aInverseOFcopiedMetaAttribute);
        }
      }
    }


      // When deleting : unlink related InverseOFexcludedInRelationshipNamed
    com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFexcludedInRelationshipNamed = getInverseOFexcludedInRelationshipNamed( theCtxt);
    if( someInverseOFexcludedInRelationshipNamed != null) {
      int aInverseOFexcludedInRelationshipNamedLength = someInverseOFexcludedInRelationshipNamed.length;
      for( int anIndex = 0 ; anIndex < aInverseOFexcludedInRelationshipNamedLength ; anIndex++) {
        com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aInverseOFexcludedInRelationshipNamed = someInverseOFexcludedInRelationshipNamed[ anIndex];
        if( aInverseOFexcludedInRelationshipNamed != null) {
          removeInverseOFexcludedInRelationshipNamed( theCtxt, aInverseOFexcludedInRelationshipNamed);
        }
      }
    }


    // When deleting unlink related Type
  setType( theCtxt, null);


    // When deleting unlink related ValueType
  setValueType( theCtxt, null);



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
      vm3Type = com.dosmil_e.m3.core.meta.M3AttributeMeta.getStaticM3Type( theCtxt);
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


