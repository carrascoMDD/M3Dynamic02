package com.dosmil_e.m3.traversal.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3FilterBase
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.m3.traversal.priv.M3FilterPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3Filter metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the M3Filter metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv vrRelatedTypeNodeConfig; 






/****************************************************************************
 *  Constructors of the M3Filter metamodel element
 ****************************************************************************/

  public M3FilterBase() {
    super();
  }


  public M3FilterBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3FilterBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3FilterIfc and M3FilterPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3Filter
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of M3Filter
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to ONE relationship RelatedTypeNodeConfig
 ****************************************************************************/


    /* Public Read accessor for role RelatedTypeNodeConfig
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc getRelatedTypeNodeConfig( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRelatedTypeNodeConfigPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRelatedTypeNodeConfigPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }

    /* Public RelatedTypeNodeConfig number access
     */
  public int numRelatedTypeNodeConfig( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numRelatedTypeNodeConfigPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numRelatedTypeNodeConfigPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Public RelatedTypeNodeConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc getRelatedTypeNodeConfigAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRelatedTypeNodeConfigAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRelatedTypeNodeConfigAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public RelatedTypeNodeConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc findRelatedTypeNodeConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findRelatedTypeNodeConfigNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findRelatedTypeNodeConfigNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public RelatedTypeNodeConfig is related predicate
     */
  public boolean hasRelatedTypeNodeConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasRelatedTypeNodeConfigNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasRelatedTypeNodeConfigNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Transactional RelatedTypeNodeConfig is related  predicate
     */
  public boolean hasRelatedTypeNodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelatedTypeNodeConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasRelatedTypeNodeConfigPR( theCtxt, theRelatedTypeNodeConfig);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasRelatedTypeNodeConfigPR( theCtxt, theRelatedTypeNodeConfig);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public RelatedTypeNodeConfig index access
     */
  public int indexOfRelatedTypeNodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelatedTypeNodeConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfRelatedTypeNodeConfigPR( theCtxt, theRelatedTypeNodeConfig);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfRelatedTypeNodeConfigPR( theCtxt, theRelatedTypeNodeConfig);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public Write accessor for role RelatedTypeNodeConfig
     */
  public void setRelatedTypeNodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelatedTypeNodeConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setRelatedTypeNodeConfigPR( theCtxt, theRelatedTypeNodeConfig);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setRelatedTypeNodeConfigPR( theCtxt, theRelatedTypeNodeConfig);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
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
 *  Implementation of internal operations for relationship RelatedTypeNodeConfig
 ****************************************************************************/


    /* Public Read accessor for role RelatedTypeNodeConfig
     * May do wild things with the identity of RelatedTypeNodeConfig
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc getRelatedTypeNodeConfigPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getRelatedTypeNodeConfigPrivileged( theCtxt);
  }


    /* Public RelatedTypeNodeConfig number access
     */
  public int numRelatedTypeNodeConfigPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getRelatedTypeNodeConfigPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public RelatedTypeNodeConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc getRelatedTypeNodeConfigAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getRelatedTypeNodeConfigPrivileged( theCtxt);
  }


    /* Public RelatedTypeNodeConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc findRelatedTypeNodeConfigNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aRelatedTypeNodeConfig = getRelatedTypeNodeConfigPrivileged( theCtxt);
    if( aRelatedTypeNodeConfig == null) { return null;}

    if( !aRelatedTypeNodeConfig.sameNameAs( theCtxt, theMMName)) { return null;}

    return aRelatedTypeNodeConfig;
  }



    /* Public RelatedTypeNodeConfig is related predicate
     */
  public boolean hasRelatedTypeNodeConfigNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null) { return false;}
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aRelatedTypeNodeConfig = getRelatedTypeNodeConfigPrivileged( theCtxt);
    if( aRelatedTypeNodeConfig == null) { return false;}

    return aRelatedTypeNodeConfig.sameNameAs( theCtxt, theMMName);
  }



    /* Public RelatedTypeNodeConfig is related predicate
     */
  public boolean hasRelatedTypeNodeConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelatedTypeNodeConfig) throws EAIException {
    if( theRelatedTypeNodeConfig == null) { return false;}
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aRelatedTypeNodeConfig = getRelatedTypeNodeConfigPrivileged( theCtxt);
    if( aRelatedTypeNodeConfig == null) { return false;}

    return aRelatedTypeNodeConfig.sameAs( theCtxt, theRelatedTypeNodeConfig);
  }


    /* Public RelatedTypeNodeConfig index access
     */
  public int indexOfRelatedTypeNodeConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelatedTypeNodeConfig) throws EAIException {
    if( !hasRelatedTypeNodeConfigPR( theCtxt, theRelatedTypeNodeConfig)) { return -1;}

    return 0;
  }



    /* Public Write accessor for role RelatedTypeNodeConfig
     */
  public void setRelatedTypeNodeConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelatedTypeNodeConfig) throws EAIException {

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv aRelatedTypeNodeConfig = getRelatedTypeNodeConfigPrivileged( theCtxt);
      // Check for new RelatedTypeNodeConfig same as current one
    if( aRelatedTypeNodeConfig != null && aRelatedTypeNodeConfig.sameAs( theCtxt, theRelatedTypeNodeConfig)) { return;}

    if( aRelatedTypeNodeConfig != null) {
      aRelatedTypeNodeConfig.unsetFilterPrivileged( theCtxt);
    }

    if( theRelatedTypeNodeConfig != null) {
      com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv aNewRelatedTypeNodeConfig = (com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv) theRelatedTypeNodeConfig;
      aNewRelatedTypeNodeConfig.unsetAndSetFilterPrivileged( theCtxt, this);
      setRelatedTypeNodeConfigPrivileged( theCtxt, aNewRelatedTypeNodeConfig);
    }
    else {
      setRelatedTypeNodeConfigPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship RelatedTypeNodeConfig
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role RelatedTypeNodeConfig
     * Guaranteed to return object with same identity of the RelatedTypeNodeConfig
     */
  public com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv getRelatedTypeNodeConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrRelatedTypeNodeConfig;
  }




    /* Remove current reference in role RelatedTypeNodeConfig
     * Used by relationship maintenance machinery
     */
  public void unsetRelatedTypeNodeConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aRelatedTypeNodeConfig = vrRelatedTypeNodeConfig;
    vrRelatedTypeNodeConfig = null;
      // If there was change, propagate
    if( aRelatedTypeNodeConfig != null) {
      change( theCtxt, "RelatedTypeNodeConfig", aRelatedTypeNodeConfig, vrRelatedTypeNodeConfig, "vrRelatedTypeNodeConfig");
    }
  }





    /* Set reference in role RelatedTypeNodeConfig
     * Used by relationship maintenance machinery
     */
  public void setRelatedTypeNodeConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv theRelatedTypeNodeConfig) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aRelatedTypeNodeConfig = vrRelatedTypeNodeConfig;
    vrRelatedTypeNodeConfig = theRelatedTypeNodeConfig;
      // If there was change, propagate
    if( (aRelatedTypeNodeConfig != null && !aRelatedTypeNodeConfig.sameAs( theCtxt, theRelatedTypeNodeConfig)) || (aRelatedTypeNodeConfig == null && theRelatedTypeNodeConfig != null)) {
      change( theCtxt, "RelatedTypeNodeConfig", aRelatedTypeNodeConfig, vrRelatedTypeNodeConfig, "vrRelatedTypeNodeConfig");
    }
  }




    /* Unset currently related RelatedTypeNodeConfig and
     * Set reference in role RelatedTypeNodeConfig
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetRelatedTypeNodeConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv theRelatedTypeNodeConfig) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv aRelatedTypeNodeConfig = vrRelatedTypeNodeConfig;
    if( aRelatedTypeNodeConfig != null) {
      aRelatedTypeNodeConfig.unsetFilterPrivileged( theCtxt);
    }
    vrRelatedTypeNodeConfig = theRelatedTypeNodeConfig;
      // If there was change, propagate
    if( (aRelatedTypeNodeConfig != null && !aRelatedTypeNodeConfig.sameAs( theCtxt, theRelatedTypeNodeConfig)) || (aRelatedTypeNodeConfig == null && theRelatedTypeNodeConfig != null)) {
      change( theCtxt, "RelatedTypeNodeConfig", aRelatedTypeNodeConfig, vrRelatedTypeNodeConfig, "vrRelatedTypeNodeConfig");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3Filter
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 

 
    // When deleting unlink related RelatedTypeNodeConfig
  setRelatedTypeNodeConfig( theCtxt, null);



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
      vm3Type = com.dosmil_e.m3.traversal.meta.M3FilterMeta.getStaticM3Type( theCtxt);
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


