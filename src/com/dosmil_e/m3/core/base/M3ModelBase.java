package com.dosmil_e.m3.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3ModelBase
   extends com.dosmil_e.m3.core.impl.M3ModuleImpl
    implements com.dosmil_e.m3.core.priv.M3ModelPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3Model metamodel element
 ****************************************************************************/
	protected java.lang.String vaTypePrefix;

	protected java.lang.String vaRelationshipVariablePrefix;

	protected java.lang.String vaAttributeVariablePrefix;

	protected java.lang.String vaEnumVariablePrefix;

	protected java.lang.String vaMetaVariablePrefix;

	protected java.lang.String vaMetaPackageName;

	protected java.lang.String vaFrameworkPackageName;

	protected java.lang.String vaFromSpecificationFileNamed;

	protected java.lang.String vaPackageName;

	protected java.lang.String vaTemplatesDirectoryName;

	protected java.lang.String vaProjectName;

	protected java.lang.String vaProjectDirectoryName;

	protected java.lang.String vaOutputDirectoryName;

	protected java.lang.String vaSerialVersionUIDPrefix;

	protected String[] vaSkipTypes;

	protected String[] vaSkipModules;

	protected java.lang.String vaDefaultSuperTypeFullBaseClassName;

	protected java.lang.String vaDefaultSuperTypeFullIfcClassName;

	protected java.lang.String vaDefaultSuperTypeFullPrivClassName;

	protected java.lang.String vaDefaultSuperTypeFullPubClassName;

	protected java.lang.String vaDefaultSuperTypeFullTrxClassName;




/****************************************************************************
 *  State storage for the Relationships of the M3Model metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.core.priv.M3TypePriv vrTreeRootType; 

	protected com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] vrTraversalConfigs = new com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[0]; 






/****************************************************************************
 *  Constructors of the M3Model metamodel element
 ****************************************************************************/

  public M3ModelBase() {
    super();
  }


  public M3ModelBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3ModelBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3ModelIfc and M3ModelPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3Model
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE TypePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute TypePrefix
     */
  public java.lang.String getTypePrefix( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTypePrefixPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTypePrefixPR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute TypePrefix
     */
  public void setTypePrefix( EAIMMCtxtIfc theCtxt, java.lang.String theTypePrefix) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setTypePrefixPR( theCtxt,  theTypePrefix);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setTypePrefixPR( theCtxt, theTypePrefix);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute TypePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute TypePrefix
     */
  public java.lang.String getTypePrefixPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaTypePrefix;
  }



    /* Public Write accessor for attribute TypePrefix
     */
  public void setTypePrefixPR( EAIMMCtxtIfc theCtxt, java.lang.String theTypePrefix) throws EAIException {

      // Get current value
    java.lang.String aTypePrefix = getTypePrefixPR( theCtxt);
      // Check for new TypePrefix same as current one
    if( toObject( aTypePrefix) != null && toObject( aTypePrefix).equals( toObject( theTypePrefix))) { return;}

    vaTypePrefix = theTypePrefix;
    change( theCtxt, "TypePrefix", toObject( aTypePrefix), toObject( vaTypePrefix), "vaTypePrefix");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE RelationshipVariablePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute RelationshipVariablePrefix
     */
  public java.lang.String getRelationshipVariablePrefix( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRelationshipVariablePrefixPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRelationshipVariablePrefixPR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute RelationshipVariablePrefix
     */
  public void setRelationshipVariablePrefix( EAIMMCtxtIfc theCtxt, java.lang.String theRelationshipVariablePrefix) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setRelationshipVariablePrefixPR( theCtxt,  theRelationshipVariablePrefix);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setRelationshipVariablePrefixPR( theCtxt, theRelationshipVariablePrefix);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute RelationshipVariablePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute RelationshipVariablePrefix
     */
  public java.lang.String getRelationshipVariablePrefixPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaRelationshipVariablePrefix;
  }



    /* Public Write accessor for attribute RelationshipVariablePrefix
     */
  public void setRelationshipVariablePrefixPR( EAIMMCtxtIfc theCtxt, java.lang.String theRelationshipVariablePrefix) throws EAIException {

      // Get current value
    java.lang.String aRelationshipVariablePrefix = getRelationshipVariablePrefixPR( theCtxt);
      // Check for new RelationshipVariablePrefix same as current one
    if( toObject( aRelationshipVariablePrefix) != null && toObject( aRelationshipVariablePrefix).equals( toObject( theRelationshipVariablePrefix))) { return;}

    vaRelationshipVariablePrefix = theRelationshipVariablePrefix;
    change( theCtxt, "RelationshipVariablePrefix", toObject( aRelationshipVariablePrefix), toObject( vaRelationshipVariablePrefix), "vaRelationshipVariablePrefix");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE AttributeVariablePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute AttributeVariablePrefix
     */
  public java.lang.String getAttributeVariablePrefix( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getAttributeVariablePrefixPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getAttributeVariablePrefixPR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute AttributeVariablePrefix
     */
  public void setAttributeVariablePrefix( EAIMMCtxtIfc theCtxt, java.lang.String theAttributeVariablePrefix) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setAttributeVariablePrefixPR( theCtxt,  theAttributeVariablePrefix);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setAttributeVariablePrefixPR( theCtxt, theAttributeVariablePrefix);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute AttributeVariablePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute AttributeVariablePrefix
     */
  public java.lang.String getAttributeVariablePrefixPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaAttributeVariablePrefix;
  }



    /* Public Write accessor for attribute AttributeVariablePrefix
     */
  public void setAttributeVariablePrefixPR( EAIMMCtxtIfc theCtxt, java.lang.String theAttributeVariablePrefix) throws EAIException {

      // Get current value
    java.lang.String aAttributeVariablePrefix = getAttributeVariablePrefixPR( theCtxt);
      // Check for new AttributeVariablePrefix same as current one
    if( toObject( aAttributeVariablePrefix) != null && toObject( aAttributeVariablePrefix).equals( toObject( theAttributeVariablePrefix))) { return;}

    vaAttributeVariablePrefix = theAttributeVariablePrefix;
    change( theCtxt, "AttributeVariablePrefix", toObject( aAttributeVariablePrefix), toObject( vaAttributeVariablePrefix), "vaAttributeVariablePrefix");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE EnumVariablePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute EnumVariablePrefix
     */
  public java.lang.String getEnumVariablePrefix( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getEnumVariablePrefixPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getEnumVariablePrefixPR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute EnumVariablePrefix
     */
  public void setEnumVariablePrefix( EAIMMCtxtIfc theCtxt, java.lang.String theEnumVariablePrefix) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setEnumVariablePrefixPR( theCtxt,  theEnumVariablePrefix);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setEnumVariablePrefixPR( theCtxt, theEnumVariablePrefix);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute EnumVariablePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute EnumVariablePrefix
     */
  public java.lang.String getEnumVariablePrefixPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaEnumVariablePrefix;
  }



    /* Public Write accessor for attribute EnumVariablePrefix
     */
  public void setEnumVariablePrefixPR( EAIMMCtxtIfc theCtxt, java.lang.String theEnumVariablePrefix) throws EAIException {

      // Get current value
    java.lang.String aEnumVariablePrefix = getEnumVariablePrefixPR( theCtxt);
      // Check for new EnumVariablePrefix same as current one
    if( toObject( aEnumVariablePrefix) != null && toObject( aEnumVariablePrefix).equals( toObject( theEnumVariablePrefix))) { return;}

    vaEnumVariablePrefix = theEnumVariablePrefix;
    change( theCtxt, "EnumVariablePrefix", toObject( aEnumVariablePrefix), toObject( vaEnumVariablePrefix), "vaEnumVariablePrefix");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE MetaVariablePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute MetaVariablePrefix
     */
  public java.lang.String getMetaVariablePrefix( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaVariablePrefixPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaVariablePrefixPR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute MetaVariablePrefix
     */
  public void setMetaVariablePrefix( EAIMMCtxtIfc theCtxt, java.lang.String theMetaVariablePrefix) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setMetaVariablePrefixPR( theCtxt,  theMetaVariablePrefix);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setMetaVariablePrefixPR( theCtxt, theMetaVariablePrefix);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute MetaVariablePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute MetaVariablePrefix
     */
  public java.lang.String getMetaVariablePrefixPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaMetaVariablePrefix;
  }



    /* Public Write accessor for attribute MetaVariablePrefix
     */
  public void setMetaVariablePrefixPR( EAIMMCtxtIfc theCtxt, java.lang.String theMetaVariablePrefix) throws EAIException {

      // Get current value
    java.lang.String aMetaVariablePrefix = getMetaVariablePrefixPR( theCtxt);
      // Check for new MetaVariablePrefix same as current one
    if( toObject( aMetaVariablePrefix) != null && toObject( aMetaVariablePrefix).equals( toObject( theMetaVariablePrefix))) { return;}

    vaMetaVariablePrefix = theMetaVariablePrefix;
    change( theCtxt, "MetaVariablePrefix", toObject( aMetaVariablePrefix), toObject( vaMetaVariablePrefix), "vaMetaVariablePrefix");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE MetaPackageName
 ****************************************************************************/


    /* Public Read accessor for attribute MetaPackageName
     */
  public java.lang.String getMetaPackageName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaPackageNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaPackageNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute MetaPackageName
     */
  public void setMetaPackageName( EAIMMCtxtIfc theCtxt, java.lang.String theMetaPackageName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setMetaPackageNamePR( theCtxt,  theMetaPackageName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setMetaPackageNamePR( theCtxt, theMetaPackageName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute MetaPackageName
 ****************************************************************************/


    /* Public Read accessor for attribute MetaPackageName
     */
  public java.lang.String getMetaPackageNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaMetaPackageName;
  }



    /* Public Write accessor for attribute MetaPackageName
     */
  public void setMetaPackageNamePR( EAIMMCtxtIfc theCtxt, java.lang.String theMetaPackageName) throws EAIException {

      // Get current value
    java.lang.String aMetaPackageName = getMetaPackageNamePR( theCtxt);
      // Check for new MetaPackageName same as current one
    if( toObject( aMetaPackageName) != null && toObject( aMetaPackageName).equals( toObject( theMetaPackageName))) { return;}

    vaMetaPackageName = theMetaPackageName;
    change( theCtxt, "MetaPackageName", toObject( aMetaPackageName), toObject( vaMetaPackageName), "vaMetaPackageName");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE FrameworkPackageName
 ****************************************************************************/


    /* Public Read accessor for attribute FrameworkPackageName
     */
  public java.lang.String getFrameworkPackageName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getFrameworkPackageNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getFrameworkPackageNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute FrameworkPackageName
     */
  public void setFrameworkPackageName( EAIMMCtxtIfc theCtxt, java.lang.String theFrameworkPackageName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setFrameworkPackageNamePR( theCtxt,  theFrameworkPackageName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setFrameworkPackageNamePR( theCtxt, theFrameworkPackageName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute FrameworkPackageName
 ****************************************************************************/


    /* Public Read accessor for attribute FrameworkPackageName
     */
  public java.lang.String getFrameworkPackageNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaFrameworkPackageName;
  }



    /* Public Write accessor for attribute FrameworkPackageName
     */
  public void setFrameworkPackageNamePR( EAIMMCtxtIfc theCtxt, java.lang.String theFrameworkPackageName) throws EAIException {

      // Get current value
    java.lang.String aFrameworkPackageName = getFrameworkPackageNamePR( theCtxt);
      // Check for new FrameworkPackageName same as current one
    if( toObject( aFrameworkPackageName) != null && toObject( aFrameworkPackageName).equals( toObject( theFrameworkPackageName))) { return;}

    vaFrameworkPackageName = theFrameworkPackageName;
    change( theCtxt, "FrameworkPackageName", toObject( aFrameworkPackageName), toObject( vaFrameworkPackageName), "vaFrameworkPackageName");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE FromSpecificationFileNamed
 ****************************************************************************/


    /* Public Read accessor for attribute FromSpecificationFileNamed
     */
  public java.lang.String getFromSpecificationFileNamed( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getFromSpecificationFileNamedPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getFromSpecificationFileNamedPR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute FromSpecificationFileNamed
     */
  public void setFromSpecificationFileNamed( EAIMMCtxtIfc theCtxt, java.lang.String theFromSpecificationFileNamed) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setFromSpecificationFileNamedPR( theCtxt,  theFromSpecificationFileNamed);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setFromSpecificationFileNamedPR( theCtxt, theFromSpecificationFileNamed);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute FromSpecificationFileNamed
 ****************************************************************************/


    /* Public Read accessor for attribute FromSpecificationFileNamed
     */
  public java.lang.String getFromSpecificationFileNamedPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaFromSpecificationFileNamed;
  }



    /* Public Write accessor for attribute FromSpecificationFileNamed
     */
  public void setFromSpecificationFileNamedPR( EAIMMCtxtIfc theCtxt, java.lang.String theFromSpecificationFileNamed) throws EAIException {

      // Get current value
    java.lang.String aFromSpecificationFileNamed = getFromSpecificationFileNamedPR( theCtxt);
      // Check for new FromSpecificationFileNamed same as current one
    if( toObject( aFromSpecificationFileNamed) != null && toObject( aFromSpecificationFileNamed).equals( toObject( theFromSpecificationFileNamed))) { return;}

    vaFromSpecificationFileNamed = theFromSpecificationFileNamed;
    change( theCtxt, "FromSpecificationFileNamed", toObject( aFromSpecificationFileNamed), toObject( vaFromSpecificationFileNamed), "vaFromSpecificationFileNamed");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE PackageName
 ****************************************************************************/


    /* Public Read accessor for attribute PackageName
     */
  public java.lang.String getPackageName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getPackageNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getPackageNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute PackageName
     */
  public void setPackageName( EAIMMCtxtIfc theCtxt, java.lang.String thePackageName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setPackageNamePR( theCtxt,  thePackageName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setPackageNamePR( theCtxt, thePackageName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute PackageName
 ****************************************************************************/


    /* Public Read accessor for attribute PackageName
     */
  public java.lang.String getPackageNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaPackageName;
  }



    /* Public Write accessor for attribute PackageName
     */
  public void setPackageNamePR( EAIMMCtxtIfc theCtxt, java.lang.String thePackageName) throws EAIException {

      // Get current value
    java.lang.String aPackageName = getPackageNamePR( theCtxt);
      // Check for new PackageName same as current one
    if( toObject( aPackageName) != null && toObject( aPackageName).equals( toObject( thePackageName))) { return;}

    vaPackageName = thePackageName;
    change( theCtxt, "PackageName", toObject( aPackageName), toObject( vaPackageName), "vaPackageName");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE TemplatesDirectoryName
 ****************************************************************************/


    /* Public Read accessor for attribute TemplatesDirectoryName
     */
  public java.lang.String getTemplatesDirectoryName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTemplatesDirectoryNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTemplatesDirectoryNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute TemplatesDirectoryName
     */
  public void setTemplatesDirectoryName( EAIMMCtxtIfc theCtxt, java.lang.String theTemplatesDirectoryName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setTemplatesDirectoryNamePR( theCtxt,  theTemplatesDirectoryName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setTemplatesDirectoryNamePR( theCtxt, theTemplatesDirectoryName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute TemplatesDirectoryName
 ****************************************************************************/


    /* Public Read accessor for attribute TemplatesDirectoryName
     */
  public java.lang.String getTemplatesDirectoryNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaTemplatesDirectoryName;
  }



    /* Public Write accessor for attribute TemplatesDirectoryName
     */
  public void setTemplatesDirectoryNamePR( EAIMMCtxtIfc theCtxt, java.lang.String theTemplatesDirectoryName) throws EAIException {

      // Get current value
    java.lang.String aTemplatesDirectoryName = getTemplatesDirectoryNamePR( theCtxt);
      // Check for new TemplatesDirectoryName same as current one
    if( toObject( aTemplatesDirectoryName) != null && toObject( aTemplatesDirectoryName).equals( toObject( theTemplatesDirectoryName))) { return;}

    vaTemplatesDirectoryName = theTemplatesDirectoryName;
    change( theCtxt, "TemplatesDirectoryName", toObject( aTemplatesDirectoryName), toObject( vaTemplatesDirectoryName), "vaTemplatesDirectoryName");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE ProjectName
 ****************************************************************************/


    /* Public Read accessor for attribute ProjectName
     */
  public java.lang.String getProjectName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getProjectNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getProjectNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute ProjectName
     */
  public void setProjectName( EAIMMCtxtIfc theCtxt, java.lang.String theProjectName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setProjectNamePR( theCtxt,  theProjectName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setProjectNamePR( theCtxt, theProjectName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute ProjectName
 ****************************************************************************/


    /* Public Read accessor for attribute ProjectName
     */
  public java.lang.String getProjectNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaProjectName;
  }



    /* Public Write accessor for attribute ProjectName
     */
  public void setProjectNamePR( EAIMMCtxtIfc theCtxt, java.lang.String theProjectName) throws EAIException {

      // Get current value
    java.lang.String aProjectName = getProjectNamePR( theCtxt);
      // Check for new ProjectName same as current one
    if( toObject( aProjectName) != null && toObject( aProjectName).equals( toObject( theProjectName))) { return;}

    vaProjectName = theProjectName;
    change( theCtxt, "ProjectName", toObject( aProjectName), toObject( vaProjectName), "vaProjectName");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE ProjectDirectoryName
 ****************************************************************************/


    /* Public Read accessor for attribute ProjectDirectoryName
     */
  public java.lang.String getProjectDirectoryName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getProjectDirectoryNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getProjectDirectoryNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute ProjectDirectoryName
     */
  public void setProjectDirectoryName( EAIMMCtxtIfc theCtxt, java.lang.String theProjectDirectoryName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setProjectDirectoryNamePR( theCtxt,  theProjectDirectoryName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setProjectDirectoryNamePR( theCtxt, theProjectDirectoryName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute ProjectDirectoryName
 ****************************************************************************/


    /* Public Read accessor for attribute ProjectDirectoryName
     */
  public java.lang.String getProjectDirectoryNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaProjectDirectoryName;
  }



    /* Public Write accessor for attribute ProjectDirectoryName
     */
  public void setProjectDirectoryNamePR( EAIMMCtxtIfc theCtxt, java.lang.String theProjectDirectoryName) throws EAIException {

      // Get current value
    java.lang.String aProjectDirectoryName = getProjectDirectoryNamePR( theCtxt);
      // Check for new ProjectDirectoryName same as current one
    if( toObject( aProjectDirectoryName) != null && toObject( aProjectDirectoryName).equals( toObject( theProjectDirectoryName))) { return;}

    vaProjectDirectoryName = theProjectDirectoryName;
    change( theCtxt, "ProjectDirectoryName", toObject( aProjectDirectoryName), toObject( vaProjectDirectoryName), "vaProjectDirectoryName");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE OutputDirectoryName
 ****************************************************************************/


    /* Public Read accessor for attribute OutputDirectoryName
     */
  public java.lang.String getOutputDirectoryName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getOutputDirectoryNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getOutputDirectoryNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute OutputDirectoryName
     */
  public void setOutputDirectoryName( EAIMMCtxtIfc theCtxt, java.lang.String theOutputDirectoryName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setOutputDirectoryNamePR( theCtxt,  theOutputDirectoryName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setOutputDirectoryNamePR( theCtxt, theOutputDirectoryName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute OutputDirectoryName
 ****************************************************************************/


    /* Public Read accessor for attribute OutputDirectoryName
     */
  public java.lang.String getOutputDirectoryNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaOutputDirectoryName;
  }



    /* Public Write accessor for attribute OutputDirectoryName
     */
  public void setOutputDirectoryNamePR( EAIMMCtxtIfc theCtxt, java.lang.String theOutputDirectoryName) throws EAIException {

      // Get current value
    java.lang.String aOutputDirectoryName = getOutputDirectoryNamePR( theCtxt);
      // Check for new OutputDirectoryName same as current one
    if( toObject( aOutputDirectoryName) != null && toObject( aOutputDirectoryName).equals( toObject( theOutputDirectoryName))) { return;}

    vaOutputDirectoryName = theOutputDirectoryName;
    change( theCtxt, "OutputDirectoryName", toObject( aOutputDirectoryName), toObject( vaOutputDirectoryName), "vaOutputDirectoryName");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE SerialVersionUIDPrefix
 ****************************************************************************/


    /* Public Read accessor for attribute SerialVersionUIDPrefix
     */
  public java.lang.String getSerialVersionUIDPrefix( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getSerialVersionUIDPrefixPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getSerialVersionUIDPrefixPR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute SerialVersionUIDPrefix
     */
  public void setSerialVersionUIDPrefix( EAIMMCtxtIfc theCtxt, java.lang.String theSerialVersionUIDPrefix) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setSerialVersionUIDPrefixPR( theCtxt,  theSerialVersionUIDPrefix);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setSerialVersionUIDPrefixPR( theCtxt, theSerialVersionUIDPrefix);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute SerialVersionUIDPrefix
 ****************************************************************************/


    /* Public Read accessor for attribute SerialVersionUIDPrefix
     */
  public java.lang.String getSerialVersionUIDPrefixPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaSerialVersionUIDPrefix;
  }



    /* Public Write accessor for attribute SerialVersionUIDPrefix
     */
  public void setSerialVersionUIDPrefixPR( EAIMMCtxtIfc theCtxt, java.lang.String theSerialVersionUIDPrefix) throws EAIException {

      // Get current value
    java.lang.String aSerialVersionUIDPrefix = getSerialVersionUIDPrefixPR( theCtxt);
      // Check for new SerialVersionUIDPrefix same as current one
    if( toObject( aSerialVersionUIDPrefix) != null && toObject( aSerialVersionUIDPrefix).equals( toObject( theSerialVersionUIDPrefix))) { return;}

    vaSerialVersionUIDPrefix = theSerialVersionUIDPrefix;
    change( theCtxt, "SerialVersionUIDPrefix", toObject( aSerialVersionUIDPrefix), toObject( vaSerialVersionUIDPrefix), "vaSerialVersionUIDPrefix");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE SkipTypes
 ****************************************************************************/


    /* Public Read accessor for attribute SkipTypes
     */
  public String[] getSkipTypes( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    String[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getSkipTypesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getSkipTypesPR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute SkipTypes
     */
  public void setSkipTypes( EAIMMCtxtIfc theCtxt, String[] theSkipTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setSkipTypesPR( theCtxt,  theSkipTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setSkipTypesPR( theCtxt, theSkipTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute SkipTypes
 ****************************************************************************/


    /* Public Read accessor for attribute SkipTypes
     */
  public String[] getSkipTypesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaSkipTypes;
  }



    /* Public Write accessor for attribute SkipTypes
     */
  public void setSkipTypesPR( EAIMMCtxtIfc theCtxt, String[] theSkipTypes) throws EAIException {

      // Get current value
    String[] aSkipTypes = getSkipTypesPR( theCtxt);
      // Check for new SkipTypes same as current one
    if( toObject( aSkipTypes) != null && toObject( aSkipTypes).equals( toObject( theSkipTypes))) { return;}

    vaSkipTypes = theSkipTypes;
    change( theCtxt, "SkipTypes", toObject( aSkipTypes), toObject( vaSkipTypes), "vaSkipTypes");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE SkipModules
 ****************************************************************************/


    /* Public Read accessor for attribute SkipModules
     */
  public String[] getSkipModules( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    String[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getSkipModulesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getSkipModulesPR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute SkipModules
     */
  public void setSkipModules( EAIMMCtxtIfc theCtxt, String[] theSkipModules) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setSkipModulesPR( theCtxt,  theSkipModules);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setSkipModulesPR( theCtxt, theSkipModules);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute SkipModules
 ****************************************************************************/


    /* Public Read accessor for attribute SkipModules
     */
  public String[] getSkipModulesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaSkipModules;
  }



    /* Public Write accessor for attribute SkipModules
     */
  public void setSkipModulesPR( EAIMMCtxtIfc theCtxt, String[] theSkipModules) throws EAIException {

      // Get current value
    String[] aSkipModules = getSkipModulesPR( theCtxt);
      // Check for new SkipModules same as current one
    if( toObject( aSkipModules) != null && toObject( aSkipModules).equals( toObject( theSkipModules))) { return;}

    vaSkipModules = theSkipModules;
    change( theCtxt, "SkipModules", toObject( aSkipModules), toObject( vaSkipModules), "vaSkipModules");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE DefaultSuperTypeFullBaseClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullBaseClassName
     */
  public java.lang.String getDefaultSuperTypeFullBaseClassName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getDefaultSuperTypeFullBaseClassNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getDefaultSuperTypeFullBaseClassNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute DefaultSuperTypeFullBaseClassName
     */
  public void setDefaultSuperTypeFullBaseClassName( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullBaseClassName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setDefaultSuperTypeFullBaseClassNamePR( theCtxt,  theDefaultSuperTypeFullBaseClassName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setDefaultSuperTypeFullBaseClassNamePR( theCtxt, theDefaultSuperTypeFullBaseClassName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute DefaultSuperTypeFullBaseClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullBaseClassName
     */
  public java.lang.String getDefaultSuperTypeFullBaseClassNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaDefaultSuperTypeFullBaseClassName;
  }



    /* Public Write accessor for attribute DefaultSuperTypeFullBaseClassName
     */
  public void setDefaultSuperTypeFullBaseClassNamePR( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullBaseClassName) throws EAIException {

      // Get current value
    java.lang.String aDefaultSuperTypeFullBaseClassName = getDefaultSuperTypeFullBaseClassNamePR( theCtxt);
      // Check for new DefaultSuperTypeFullBaseClassName same as current one
    if( toObject( aDefaultSuperTypeFullBaseClassName) != null && toObject( aDefaultSuperTypeFullBaseClassName).equals( toObject( theDefaultSuperTypeFullBaseClassName))) { return;}

    vaDefaultSuperTypeFullBaseClassName = theDefaultSuperTypeFullBaseClassName;
    change( theCtxt, "DefaultSuperTypeFullBaseClassName", toObject( aDefaultSuperTypeFullBaseClassName), toObject( vaDefaultSuperTypeFullBaseClassName), "vaDefaultSuperTypeFullBaseClassName");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE DefaultSuperTypeFullIfcClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullIfcClassName
     */
  public java.lang.String getDefaultSuperTypeFullIfcClassName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getDefaultSuperTypeFullIfcClassNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getDefaultSuperTypeFullIfcClassNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute DefaultSuperTypeFullIfcClassName
     */
  public void setDefaultSuperTypeFullIfcClassName( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullIfcClassName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setDefaultSuperTypeFullIfcClassNamePR( theCtxt,  theDefaultSuperTypeFullIfcClassName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setDefaultSuperTypeFullIfcClassNamePR( theCtxt, theDefaultSuperTypeFullIfcClassName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute DefaultSuperTypeFullIfcClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullIfcClassName
     */
  public java.lang.String getDefaultSuperTypeFullIfcClassNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaDefaultSuperTypeFullIfcClassName;
  }



    /* Public Write accessor for attribute DefaultSuperTypeFullIfcClassName
     */
  public void setDefaultSuperTypeFullIfcClassNamePR( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullIfcClassName) throws EAIException {

      // Get current value
    java.lang.String aDefaultSuperTypeFullIfcClassName = getDefaultSuperTypeFullIfcClassNamePR( theCtxt);
      // Check for new DefaultSuperTypeFullIfcClassName same as current one
    if( toObject( aDefaultSuperTypeFullIfcClassName) != null && toObject( aDefaultSuperTypeFullIfcClassName).equals( toObject( theDefaultSuperTypeFullIfcClassName))) { return;}

    vaDefaultSuperTypeFullIfcClassName = theDefaultSuperTypeFullIfcClassName;
    change( theCtxt, "DefaultSuperTypeFullIfcClassName", toObject( aDefaultSuperTypeFullIfcClassName), toObject( vaDefaultSuperTypeFullIfcClassName), "vaDefaultSuperTypeFullIfcClassName");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE DefaultSuperTypeFullPrivClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullPrivClassName
     */
  public java.lang.String getDefaultSuperTypeFullPrivClassName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getDefaultSuperTypeFullPrivClassNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getDefaultSuperTypeFullPrivClassNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute DefaultSuperTypeFullPrivClassName
     */
  public void setDefaultSuperTypeFullPrivClassName( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullPrivClassName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setDefaultSuperTypeFullPrivClassNamePR( theCtxt,  theDefaultSuperTypeFullPrivClassName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setDefaultSuperTypeFullPrivClassNamePR( theCtxt, theDefaultSuperTypeFullPrivClassName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute DefaultSuperTypeFullPrivClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullPrivClassName
     */
  public java.lang.String getDefaultSuperTypeFullPrivClassNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaDefaultSuperTypeFullPrivClassName;
  }



    /* Public Write accessor for attribute DefaultSuperTypeFullPrivClassName
     */
  public void setDefaultSuperTypeFullPrivClassNamePR( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullPrivClassName) throws EAIException {

      // Get current value
    java.lang.String aDefaultSuperTypeFullPrivClassName = getDefaultSuperTypeFullPrivClassNamePR( theCtxt);
      // Check for new DefaultSuperTypeFullPrivClassName same as current one
    if( toObject( aDefaultSuperTypeFullPrivClassName) != null && toObject( aDefaultSuperTypeFullPrivClassName).equals( toObject( theDefaultSuperTypeFullPrivClassName))) { return;}

    vaDefaultSuperTypeFullPrivClassName = theDefaultSuperTypeFullPrivClassName;
    change( theCtxt, "DefaultSuperTypeFullPrivClassName", toObject( aDefaultSuperTypeFullPrivClassName), toObject( vaDefaultSuperTypeFullPrivClassName), "vaDefaultSuperTypeFullPrivClassName");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE DefaultSuperTypeFullPubClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullPubClassName
     */
  public java.lang.String getDefaultSuperTypeFullPubClassName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getDefaultSuperTypeFullPubClassNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getDefaultSuperTypeFullPubClassNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute DefaultSuperTypeFullPubClassName
     */
  public void setDefaultSuperTypeFullPubClassName( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullPubClassName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setDefaultSuperTypeFullPubClassNamePR( theCtxt,  theDefaultSuperTypeFullPubClassName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setDefaultSuperTypeFullPubClassNamePR( theCtxt, theDefaultSuperTypeFullPubClassName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute DefaultSuperTypeFullPubClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullPubClassName
     */
  public java.lang.String getDefaultSuperTypeFullPubClassNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaDefaultSuperTypeFullPubClassName;
  }



    /* Public Write accessor for attribute DefaultSuperTypeFullPubClassName
     */
  public void setDefaultSuperTypeFullPubClassNamePR( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullPubClassName) throws EAIException {

      // Get current value
    java.lang.String aDefaultSuperTypeFullPubClassName = getDefaultSuperTypeFullPubClassNamePR( theCtxt);
      // Check for new DefaultSuperTypeFullPubClassName same as current one
    if( toObject( aDefaultSuperTypeFullPubClassName) != null && toObject( aDefaultSuperTypeFullPubClassName).equals( toObject( theDefaultSuperTypeFullPubClassName))) { return;}

    vaDefaultSuperTypeFullPubClassName = theDefaultSuperTypeFullPubClassName;
    change( theCtxt, "DefaultSuperTypeFullPubClassName", toObject( aDefaultSuperTypeFullPubClassName), toObject( vaDefaultSuperTypeFullPubClassName), "vaDefaultSuperTypeFullPubClassName");
  }





/****************************************************************************
 *  Implementation of public interface for ATRRIBUTE DefaultSuperTypeFullTrxClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullTrxClassName
     */
  public java.lang.String getDefaultSuperTypeFullTrxClassName( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    java.lang.String aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getDefaultSuperTypeFullTrxClassNamePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getDefaultSuperTypeFullTrxClassNamePR( theCtxt);;
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;

  }






    /* Transactional Public Write accessor for attribute DefaultSuperTypeFullTrxClassName
     */
  public void setDefaultSuperTypeFullTrxClassName( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullTrxClassName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setDefaultSuperTypeFullTrxClassNamePR( theCtxt,  theDefaultSuperTypeFullTrxClassName);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setDefaultSuperTypeFullTrxClassNamePR( theCtxt, theDefaultSuperTypeFullTrxClassName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for attribute DefaultSuperTypeFullTrxClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullTrxClassName
     */
  public java.lang.String getDefaultSuperTypeFullTrxClassNamePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vaDefaultSuperTypeFullTrxClassName;
  }



    /* Public Write accessor for attribute DefaultSuperTypeFullTrxClassName
     */
  public void setDefaultSuperTypeFullTrxClassNamePR( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullTrxClassName) throws EAIException {

      // Get current value
    java.lang.String aDefaultSuperTypeFullTrxClassName = getDefaultSuperTypeFullTrxClassNamePR( theCtxt);
      // Check for new DefaultSuperTypeFullTrxClassName same as current one
    if( toObject( aDefaultSuperTypeFullTrxClassName) != null && toObject( aDefaultSuperTypeFullTrxClassName).equals( toObject( theDefaultSuperTypeFullTrxClassName))) { return;}

    vaDefaultSuperTypeFullTrxClassName = theDefaultSuperTypeFullTrxClassName;
    change( theCtxt, "DefaultSuperTypeFullTrxClassName", toObject( aDefaultSuperTypeFullTrxClassName), toObject( vaDefaultSuperTypeFullTrxClassName), "vaDefaultSuperTypeFullTrxClassName");
  }









/****************************************************************************
 *  Implementation of relationships of M3Model
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to ONE relationship TreeRootType
 ****************************************************************************/


    /* Public Read accessor for role TreeRootType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTreeRootType( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTreeRootTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTreeRootTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }

    /* Public TreeRootType number access
     */
  public int numTreeRootType( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numTreeRootTypePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numTreeRootTypePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Public TreeRootType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTreeRootTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTreeRootTypeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTreeRootTypeAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public TreeRootType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findTreeRootTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findTreeRootTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findTreeRootTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public TreeRootType is related predicate
     */
  public boolean hasTreeRootTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTreeRootTypeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTreeRootTypeNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Transactional TreeRootType is related  predicate
     */
  public boolean hasTreeRootType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTreeRootType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTreeRootTypePR( theCtxt, theTreeRootType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTreeRootTypePR( theCtxt, theTreeRootType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public TreeRootType index access
     */
  public int indexOfTreeRootType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTreeRootType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfTreeRootTypePR( theCtxt, theTreeRootType);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfTreeRootTypePR( theCtxt, theTreeRootType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public Write accessor for role TreeRootType
     */
  public void setTreeRootType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTreeRootType) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setTreeRootTypePR( theCtxt, theTreeRootType);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setTreeRootTypePR( theCtxt, theTreeRootType);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship TreeRootType
 ****************************************************************************/


    /* Public Read accessor for role TreeRootType
     * May do wild things with the identity of TreeRootType
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTreeRootTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTreeRootTypePrivileged( theCtxt);
  }


    /* Public TreeRootType number access
     */
  public int numTreeRootTypePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTreeRootTypePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public TreeRootType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTreeRootTypeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getTreeRootTypePrivileged( theCtxt);
  }


    /* Public TreeRootType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findTreeRootTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3TypeIfc aTreeRootType = getTreeRootTypePrivileged( theCtxt);
    if( aTreeRootType == null) { return null;}

    if( !aTreeRootType.sameNameAs( theCtxt, theMMName)) { return null;}

    return aTreeRootType;
  }



    /* Public TreeRootType is related predicate
     */
  public boolean hasTreeRootTypeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null) { return false;}
    com.dosmil_e.m3.core.ifc.M3TypeIfc aTreeRootType = getTreeRootTypePrivileged( theCtxt);
    if( aTreeRootType == null) { return false;}

    return aTreeRootType.sameNameAs( theCtxt, theMMName);
  }



    /* Public TreeRootType is related predicate
     */
  public boolean hasTreeRootTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTreeRootType) throws EAIException {
    if( theTreeRootType == null) { return false;}
    com.dosmil_e.m3.core.ifc.M3TypeIfc aTreeRootType = getTreeRootTypePrivileged( theCtxt);
    if( aTreeRootType == null) { return false;}

    return aTreeRootType.sameAs( theCtxt, theTreeRootType);
  }


    /* Public TreeRootType index access
     */
  public int indexOfTreeRootTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTreeRootType) throws EAIException {
    if( !hasTreeRootTypePR( theCtxt, theTreeRootType)) { return -1;}

    return 0;
  }



    /* Public Write accessor for role TreeRootType
     */
  public void setTreeRootTypePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTreeRootType) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv aTreeRootType = getTreeRootTypePrivileged( theCtxt);
      // Check for new TreeRootType same as current one
    if( aTreeRootType != null && aTreeRootType.sameAs( theCtxt, theTreeRootType)) { return;}

    if( aTreeRootType != null) {
      aTreeRootType.unsetRootTypeOfModelPrivileged( theCtxt);
    }

    if( theTreeRootType != null) {
      com.dosmil_e.m3.core.priv.M3TypePriv aNewTreeRootType = (com.dosmil_e.m3.core.priv.M3TypePriv) theTreeRootType;
      aNewTreeRootType.unsetAndSetRootTypeOfModelPrivileged( theCtxt, this);
      setTreeRootTypePrivileged( theCtxt, aNewTreeRootType);
    }
    else {
      setTreeRootTypePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship TreeRootType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role TreeRootType
     * Guaranteed to return object with same identity of the TreeRootType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getTreeRootTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrTreeRootType;
  }




    /* Remove current reference in role TreeRootType
     * Used by relationship maintenance machinery
     */
  public void unsetTreeRootTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aTreeRootType = vrTreeRootType;
    vrTreeRootType = null;
      // If there was change, propagate
    if( aTreeRootType != null) {
      change( theCtxt, "TreeRootType", aTreeRootType, vrTreeRootType, "vrTreeRootType");
    }
  }





    /* Set reference in role TreeRootType
     * Used by relationship maintenance machinery
     */
  public void setTreeRootTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theTreeRootType) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aTreeRootType = vrTreeRootType;
    vrTreeRootType = theTreeRootType;
      // If there was change, propagate
    if( (aTreeRootType != null && !aTreeRootType.sameAs( theCtxt, theTreeRootType)) || (aTreeRootType == null && theTreeRootType != null)) {
      change( theCtxt, "TreeRootType", aTreeRootType, vrTreeRootType, "vrTreeRootType");
    }
  }




    /* Unset currently related TreeRootType and
     * Set reference in role TreeRootType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTreeRootTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theTreeRootType) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv aTreeRootType = vrTreeRootType;
    if( aTreeRootType != null) {
      aTreeRootType.unsetRootTypeOfModelPrivileged( theCtxt);
    }
    vrTreeRootType = theTreeRootType;
      // If there was change, propagate
    if( (aTreeRootType != null && !aTreeRootType.sameAs( theCtxt, theTreeRootType)) || (aTreeRootType == null && theTreeRootType != null)) {
      change( theCtxt, "TreeRootType", aTreeRootType, vrTreeRootType, "vrTreeRootType");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship TraversalConfigs
 ****************************************************************************/


    /* Public Read accessor for role TraversalConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] getTraversalConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTraversalConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTraversalConfigsPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }

    /* Public TraversalConfigs number access
     */
  public int numTraversalConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numTraversalConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numTraversalConfigsPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Public TraversalConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTraversalConfigsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTraversalConfigsAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public TraversalConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc findTraversalConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findTraversalConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findTraversalConfigsNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public TraversalConfigs is related predicate
     */
  public boolean hasTraversalConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTraversalConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTraversalConfigsNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Transactional TraversalConfigs is related  predicate
     */
  public boolean hasTraversalConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTraversalConfigsPR( theCtxt, theTraversalConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTraversalConfigsPR( theCtxt, theTraversalConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public TraversalConfigs index access
     */
  public int indexOfTraversalConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfTraversalConfigsPR( theCtxt, theTraversalConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfTraversalConfigsPR( theCtxt, theTraversalConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
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
  public void addTraversalConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addTraversalConfigsPR( theCtxt, theTraversalConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addTraversalConfigsPR( theCtxt, theTraversalConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
  public void addTraversalConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theRelativeTraversalConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addTraversalConfigsBeforePR( theCtxt, theTraversalConfigs, theRelativeTraversalConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addTraversalConfigsBeforePR( theCtxt, theTraversalConfigs, theRelativeTraversalConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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





    /* Transactional Public Write Remove accessor for role TraversalConfigs
     */
  public void removeTraversalConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeTraversalConfigsPR( theCtxt, theTraversalConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeTraversalConfigsPR( theCtxt, theTraversalConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role TraversalConfigs
     */
  public void moveTraversalConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theRelativeTraversalConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveTraversalConfigsBeforePR( theCtxt, theTraversalConfigs, theRelativeTraversalConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveTraversalConfigsBeforePR( theCtxt, theTraversalConfigs, theRelativeTraversalConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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



    /* Public reorder accessor for role TraversalConfigs
     */
  public void moveTraversalConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveTraversalConfigsToLastPR( theCtxt, theTraversalConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveTraversalConfigsToLastPR( theCtxt, theTraversalConfigs);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship TraversalConfigs
 ****************************************************************************/


    /* Public Read accessor for role TraversalConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] getTraversalConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] someTraversalConfigs = getTraversalConfigsPrivileged( theCtxt);
    if( someTraversalConfigs == null) { return null;}

    int aTraversalConfigsLength = someTraversalConfigs.length;
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] otherTraversalConfigs = new com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[ aTraversalConfigsLength];
    try { System.arraycopy( someTraversalConfigs, 0, otherTraversalConfigs, 0, aTraversalConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getTraversalConfigs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getTraversalConfigs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getTraversalConfigs", null); return null;}


    return otherTraversalConfigs;
  }



    /* Public TraversalConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc findTraversalConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] someTraversalConfigs = getTraversalConfigsPrivileged( theCtxt);
    if( someTraversalConfigs == null) { return null;}

      // Check for new TraversalConfigs already in collection
    int aTraversalConfigsLength = someTraversalConfigs.length;
    for( int anIndex = 0 ; anIndex < aTraversalConfigsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aTraversalConfigs = someTraversalConfigs[ anIndex];
      if( aTraversalConfigs.sameNameAs( theCtxt, theMMName)) { return aTraversalConfigs;}
    }
    return null;
  }



    /* Public TraversalConfigs finder predicate by name
     */
  public boolean hasTraversalConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findTraversalConfigsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public TraversalConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfigsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] someTraversalConfigs = getTraversalConfigsPrivileged( theCtxt);
    if( someTraversalConfigs == null) { return null;}

      // Get number of TraversalConfigs
    int aTraversalConfigsLength = someTraversalConfigs.length;

      // Verify index within array length
    if( theIndex >= aTraversalConfigsLength) { return null;}

      // Get indexed TraversalConfigs
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfigs = someTraversalConfigs[ theIndex];

    return aTraversalConfigs;
  }



    /* Public TraversalConfigs is related predicate
     */
  public boolean hasTraversalConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException {
    return indexOfTraversalConfigsPR( theCtxt, theTraversalConfigs) >= 0;
  }


    /* Public TraversalConfigs index access
     */
  public int indexOfTraversalConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException {
      // Do not add null values to the collection
    if( theTraversalConfigs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] someTraversalConfigs = getTraversalConfigsPrivileged( theCtxt);
    if( someTraversalConfigs == null) { return -1;}

      // Check for new TraversalConfigs already in collection
    int aTraversalConfigsLength = someTraversalConfigs.length;
    for( int anIndex = 0 ; anIndex < aTraversalConfigsLength ; anIndex++) {
      if( someTraversalConfigs[ anIndex].sameAs( theCtxt, theTraversalConfigs)) { return anIndex;}
    }
    return -1;
  }


    /* Public TraversalConfigs number access
     */
  public int numTraversalConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] someTraversalConfigs = getTraversalConfigsPrivileged( theCtxt);
    if( someTraversalConfigs == null) { return 0;}

      // Check for new TraversalConfigs already in collection
    int aTraversalConfigsLength = someTraversalConfigs.length;
    return aTraversalConfigsLength;
  }




    /* Public Write accessor for role TraversalConfigs
     */
  public void addTraversalConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theTraversalConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] someTraversalConfigs = getTraversalConfigsPrivileged( theCtxt);
    if( someTraversalConfigs == null) { return;}

      // Check for new TraversalConfigs already in collection
    int aTraversalConfigsLength = someTraversalConfigs.length;
    for( int anIndex = 0 ; anIndex < aTraversalConfigsLength ; anIndex++) {
      if( theTraversalConfigs.sameAs( theCtxt, someTraversalConfigs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aNewTraversalConfigs = (com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv) theTraversalConfigs;

      // Link reverse ref to this object
    aNewTraversalConfigs.unsetAndSetModelPrivileged( theCtxt, this);

      // Grow collection and add new TraversalConfigs element
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] otherTraversalConfigs = new com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[ aTraversalConfigsLength + 1];
    try { System.arraycopy( someTraversalConfigs, 0, otherTraversalConfigs, 0, aTraversalConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTraversalConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTraversalConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTraversalConfigs", null); return;}
    otherTraversalConfigs[ aTraversalConfigsLength] = aNewTraversalConfigs;

      // Set the new collection
    setTraversalConfigsPrivileged( theCtxt, otherTraversalConfigs);
  }




    /* Public ordered Write accessor for role TraversalConfigs
     */
  public void addTraversalConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theRelativeTraversalConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theTraversalConfigs == null) { return;}

      // If relative TraversalConfigs is null, perform normal add operation
    if( theRelativeTraversalConfigs == null) {
      addTraversalConfigsPR( theCtxt, theTraversalConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] someTraversalConfigs = getTraversalConfigsPrivileged( theCtxt);
    if( someTraversalConfigs == null) { return;}


      // Get index of relative TraversalConfigs
    int aRelativeIndex = indexOfTraversalConfigsPR( theCtxt, theRelativeTraversalConfigs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addTraversalConfigsPR( theCtxt, theTraversalConfigs);
    }

      // Get length of TraversalConfigs array
    int aTraversalConfigsLength = someTraversalConfigs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aTraversalConfigsLength) {
      addTraversalConfigsPR( theCtxt, theTraversalConfigs);
    }

      // Check for new TraversalConfigs already in collection
    if( hasTraversalConfigsPR( theCtxt, theTraversalConfigs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aNewTraversalConfigs = (com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv) theTraversalConfigs;

      // Link reverse ref to this object
    aNewTraversalConfigs.unsetAndSetModelPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship TraversalConfigs
      // Grow collection and add new TraversalConfigs element
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] otherTraversalConfigs = new com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[ aTraversalConfigsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someTraversalConfigs, 0, otherTraversalConfigs, 0, aRelativeIndex );
      }
      System.arraycopy( someTraversalConfigs, aRelativeIndex, otherTraversalConfigs, aRelativeIndex + 1, aTraversalConfigsLength - aRelativeIndex);
      otherTraversalConfigs[ aRelativeIndex] = aNewTraversalConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTraversalConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTraversalConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTraversalConfigsBefore", null); return;}

      // Set the new collection
    setTraversalConfigsPrivileged( theCtxt, otherTraversalConfigs);
  }





    /* Public Write accessor for role TraversalConfigs
     */
  public void removeTraversalConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theTraversalConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] someTraversalConfigs = getTraversalConfigsPrivileged( theCtxt);
    if( someTraversalConfigs == null) { return;}

      // Check for new TraversalConfigs not in collection
    int aTraversalConfigsLength = someTraversalConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aTraversalConfigsLength ; anIndex++) {
      if( theTraversalConfigs.sameAs( theCtxt, someTraversalConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aNewTraversalConfigs = (com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv) theTraversalConfigs;

      // Unlink reverse ref from the new related object
    aNewTraversalConfigs.unsetModelPrivileged( theCtxt);

      // Shrink collection removing TraversalConfigs element
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] otherTraversalConfigs = new com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[ aTraversalConfigsLength - 1];
    try {
      System.arraycopy( someTraversalConfigs, 0, otherTraversalConfigs, 0, aFoundIndex);
      System.arraycopy( someTraversalConfigs, aFoundIndex + 1, otherTraversalConfigs, aFoundIndex, aTraversalConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTraversalConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTraversalConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTraversalConfigs", null); return;}

      // Set the new collection
    setTraversalConfigsPrivileged( theCtxt, otherTraversalConfigs);
  }




    /* Public reorder accessor for role TraversalConfigs
     */
  public void moveTraversalConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theRelativeTraversalConfigs) throws EAIException {

      // Null value is nothing to move
    if( theTraversalConfigs == null) { return;}

      // If relative TraversalConfigs is null, perform move to last position
    if( theRelativeTraversalConfigs == null) {
      moveTraversalConfigsToLastPR( theCtxt, theTraversalConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] someTraversalConfigs = getTraversalConfigsPrivileged( theCtxt);
    if( someTraversalConfigs == null) { return;}

      // Get length of TraversalConfigs array
    int aTraversalConfigsLength = someTraversalConfigs.length;

      // Get index of TraversalConfigs to move
    int aToMoveIndex = indexOfTraversalConfigsPR( theCtxt, theTraversalConfigs);
      // If toMove TraversalConfigs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aTraversalConfigsLength) {
      moveTraversalConfigsToLastPR( theCtxt, theTraversalConfigs);
    }

      // Get index of relative TraversalConfigs
    int aRelativeIndex = indexOfTraversalConfigsPR( theCtxt, theRelativeTraversalConfigs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveTraversalConfigsToLastPR( theCtxt, theTraversalConfigs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aTraversalConfigsLength) {
      moveTraversalConfigsToLastPR( theCtxt, theTraversalConfigs);
    }

      // ToMove and relative TraversalConfigs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aToMoveTraversalConfigs = (com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv) theTraversalConfigs;

      // Allocate new array for new version of state of relationship TraversalConfigs
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] otherTraversalConfigs = new com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[ aTraversalConfigsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someTraversalConfigs, 0, otherTraversalConfigs, 0, aToMoveIndex );
        System.arraycopy( someTraversalConfigs, aToMoveIndex + 1, otherTraversalConfigs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherTraversalConfigs[ aRelativeIndex - 1] = aToMoveTraversalConfigs;
        System.arraycopy( someTraversalConfigs, aRelativeIndex, otherTraversalConfigs, aRelativeIndex, aTraversalConfigsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someTraversalConfigs, 0, otherTraversalConfigs, 0, aRelativeIndex );
        otherTraversalConfigs[ aRelativeIndex ] = aToMoveTraversalConfigs;
        System.arraycopy( someTraversalConfigs, aRelativeIndex, otherTraversalConfigs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aTraversalConfigsLength - 1) {
          System.arraycopy( someTraversalConfigs, aToMoveIndex + 1, otherTraversalConfigs, aToMoveIndex + 1, aTraversalConfigsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTraversalConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTraversalConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTraversalConfigsBefore", null); return;}

      // Set the new collection
    setTraversalConfigsPrivileged( theCtxt, otherTraversalConfigs);
  }





    /* Public move to last accessor for role TraversalConfigs
     */
  public void moveTraversalConfigsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException {

      // Null value is nothing to move
    if( theTraversalConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] someTraversalConfigs = getTraversalConfigsPrivileged( theCtxt);
    if( someTraversalConfigs == null) { return;}

      // Get length of TraversalConfigs array
    int aTraversalConfigsLength = someTraversalConfigs.length;

      // Get index of TraversalConfigs to move
    int aToMoveIndex = indexOfTraversalConfigsPR( theCtxt, theTraversalConfigs);

      // If toMove TraversalConfigs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aTraversalConfigsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aToMoveTraversalConfigs = (com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv) theTraversalConfigs;

      // Allocate new array for new version of state of relationship TraversalConfigs
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] otherTraversalConfigs = new com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[ aTraversalConfigsLength];
    try {
      System.arraycopy( someTraversalConfigs, 0, otherTraversalConfigs, 0, aToMoveIndex );
      System.arraycopy( someTraversalConfigs, aToMoveIndex + 1, otherTraversalConfigs, aToMoveIndex, aTraversalConfigsLength - aToMoveIndex - 1);
      otherTraversalConfigs[ aTraversalConfigsLength - 1] = aToMoveTraversalConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTraversalConfigsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTraversalConfigsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTraversalConfigsToLast", null); return;}

      // Set the new collection
    setTraversalConfigsPrivileged( theCtxt, otherTraversalConfigs);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship TraversalConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role TraversalConfigs
     */
  public void addTraversalConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theTraversalConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theTraversalConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] someTraversalConfigs = getTraversalConfigsPrivileged( theCtxt);
    if( someTraversalConfigs == null) { return;}

      // Check for new TraversalConfigs already in collection
    int aTraversalConfigsLength = someTraversalConfigs.length;
    for( int anIndex = 0 ; anIndex < aTraversalConfigsLength ; anIndex++) {
      if( theTraversalConfigs.sameAs( theCtxt, someTraversalConfigs[ anIndex])) { return;}
    }

      // Grow collection and add new TraversalConfigs element
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] otherTraversalConfigs = new com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[ aTraversalConfigsLength + 1];
    try {
      System.arraycopy( someTraversalConfigs, 0, otherTraversalConfigs, 0, aTraversalConfigsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTraversalConfigsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTraversalConfigsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTraversalConfigsPrivileged", null); return;}

    otherTraversalConfigs[ aTraversalConfigsLength] = theTraversalConfigs;

      // Set the new collection
    setTraversalConfigsPrivileged( theCtxt, otherTraversalConfigs);
  }









    /* Privileged Write accessor for role TraversalConfigs
     */
  public void removeTraversalConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theTraversalConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theTraversalConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] someTraversalConfigs = getTraversalConfigsPrivileged( theCtxt);
    if( someTraversalConfigs == null) { return;}

      // Check for new TraversalConfigs not in collection
    int aTraversalConfigsLength = someTraversalConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aTraversalConfigsLength ; anIndex++) {
      if( theTraversalConfigs.sameAs( theCtxt, someTraversalConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing TraversalConfigs element
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] otherTraversalConfigs = new com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[ aTraversalConfigsLength - 1];
    try {
      System.arraycopy( someTraversalConfigs, 0, otherTraversalConfigs, 0, aFoundIndex);
      System.arraycopy( someTraversalConfigs, aFoundIndex + 1, otherTraversalConfigs, aFoundIndex, aTraversalConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTraversalConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTraversalConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTraversalConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv.class}); return;}

      // Set the new collection
    setTraversalConfigsPrivileged( theCtxt, otherTraversalConfigs);
  }






    /* Privileged Read accessor for role TraversalConfigs
     * Guaranteed to return object with same identity of the TraversalConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] getTraversalConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrTraversalConfigs;
  }




    /* Set reference in role TraversalConfigs
     * Used by relationship maintenance machinery
     */
  public void setTraversalConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] theTraversalConfigsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] aTraversalConfigs = vrTraversalConfigs;
    vrTraversalConfigs = theTraversalConfigsCollection;
      // Propagate change
    change( theCtxt, "TraversalConfigs", aTraversalConfigs, vrTraversalConfigs, "vrTraversalConfigs");
  }








/****************************************************************************
 *  Implementation of  internal destructor of M3Model
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 
      // When deleting : unreference attribute TypePrefix
  setTypePrefix( theCtxt, null);


      // When deleting : unreference attribute RelationshipVariablePrefix
  setRelationshipVariablePrefix( theCtxt, null);


      // When deleting : unreference attribute AttributeVariablePrefix
  setAttributeVariablePrefix( theCtxt, null);


      // When deleting : unreference attribute EnumVariablePrefix
  setEnumVariablePrefix( theCtxt, null);


      // When deleting : unreference attribute MetaVariablePrefix
  setMetaVariablePrefix( theCtxt, null);


      // When deleting : unreference attribute MetaPackageName
  setMetaPackageName( theCtxt, null);


      // When deleting : unreference attribute FrameworkPackageName
  setFrameworkPackageName( theCtxt, null);


      // When deleting : unreference attribute FromSpecificationFileNamed
  setFromSpecificationFileNamed( theCtxt, null);


      // When deleting : unreference attribute PackageName
  setPackageName( theCtxt, null);


      // When deleting : unreference attribute TemplatesDirectoryName
  setTemplatesDirectoryName( theCtxt, null);


      // When deleting : unreference attribute ProjectName
  setProjectName( theCtxt, null);


      // When deleting : unreference attribute ProjectDirectoryName
  setProjectDirectoryName( theCtxt, null);


      // When deleting : unreference attribute OutputDirectoryName
  setOutputDirectoryName( theCtxt, null);


      // When deleting : unreference attribute SerialVersionUIDPrefix
  setSerialVersionUIDPrefix( theCtxt, null);


      // When deleting : unreference attribute SkipTypes
  setSkipTypes( theCtxt, null);


      // When deleting : unreference attribute SkipModules
  setSkipModules( theCtxt, null);


      // When deleting : unreference attribute DefaultSuperTypeFullBaseClassName
  setDefaultSuperTypeFullBaseClassName( theCtxt, null);


      // When deleting : unreference attribute DefaultSuperTypeFullIfcClassName
  setDefaultSuperTypeFullIfcClassName( theCtxt, null);


      // When deleting : unreference attribute DefaultSuperTypeFullPrivClassName
  setDefaultSuperTypeFullPrivClassName( theCtxt, null);


      // When deleting : unreference attribute DefaultSuperTypeFullPubClassName
  setDefaultSuperTypeFullPubClassName( theCtxt, null);


      // When deleting : unreference attribute DefaultSuperTypeFullTrxClassName
  setDefaultSuperTypeFullTrxClassName( theCtxt, null);



 
    // When deleting unlink related TreeRootType
  setTreeRootType( theCtxt, null);


      // When deleting : delete related TraversalConfigs
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] someTraversalConfigs = getTraversalConfigs( theCtxt);
    if( someTraversalConfigs != null) {
      int aTraversalConfigsLength = someTraversalConfigs.length;
      for( int anIndex = 0 ; anIndex < aTraversalConfigsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfigs = someTraversalConfigs[ anIndex];
        if( aTraversalConfigs != null) {
          com.dosmil_e.m3.traversal.impl.M3TraversalConfigImpl aTraversalConfigsImpl = null;
          try { aTraversalConfigsImpl = (com.dosmil_e.m3.traversal.impl.M3TraversalConfigImpl) aTraversalConfigs;} catch( ClassCastException anEx) {}
          if( aTraversalConfigsImpl != null) {
            aTraversalConfigsImpl.delete( theCtxt);
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
      vm3Type = com.dosmil_e.m3.core.meta.M3ModelMeta.getStaticM3Type( theCtxt);
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


