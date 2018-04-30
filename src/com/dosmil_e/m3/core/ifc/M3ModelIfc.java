package com.dosmil_e.m3.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ModelIfc
    extends     com.dosmil_e.m3.core.ifc.M3ModuleIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3Model
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute TypePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute TypePrefix
     */
  public java.lang.String getTypePrefix( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute TypePrefix
     */
  public void setTypePrefix( EAIMMCtxtIfc theCtxt, java.lang.String theTypePrefix) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute RelationshipVariablePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute RelationshipVariablePrefix
     */
  public java.lang.String getRelationshipVariablePrefix( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute RelationshipVariablePrefix
     */
  public void setRelationshipVariablePrefix( EAIMMCtxtIfc theCtxt, java.lang.String theRelationshipVariablePrefix) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute AttributeVariablePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute AttributeVariablePrefix
     */
  public java.lang.String getAttributeVariablePrefix( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute AttributeVariablePrefix
     */
  public void setAttributeVariablePrefix( EAIMMCtxtIfc theCtxt, java.lang.String theAttributeVariablePrefix) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute EnumVariablePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute EnumVariablePrefix
     */
  public java.lang.String getEnumVariablePrefix( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute EnumVariablePrefix
     */
  public void setEnumVariablePrefix( EAIMMCtxtIfc theCtxt, java.lang.String theEnumVariablePrefix) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute MetaVariablePrefix
 ****************************************************************************/


    /* Public Read accessor for attribute MetaVariablePrefix
     */
  public java.lang.String getMetaVariablePrefix( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute MetaVariablePrefix
     */
  public void setMetaVariablePrefix( EAIMMCtxtIfc theCtxt, java.lang.String theMetaVariablePrefix) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute MetaPackageName
 ****************************************************************************/


    /* Public Read accessor for attribute MetaPackageName
     */
  public java.lang.String getMetaPackageName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute MetaPackageName
     */
  public void setMetaPackageName( EAIMMCtxtIfc theCtxt, java.lang.String theMetaPackageName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute FrameworkPackageName
 ****************************************************************************/


    /* Public Read accessor for attribute FrameworkPackageName
     */
  public java.lang.String getFrameworkPackageName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute FrameworkPackageName
     */
  public void setFrameworkPackageName( EAIMMCtxtIfc theCtxt, java.lang.String theFrameworkPackageName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute FromSpecificationFileNamed
 ****************************************************************************/


    /* Public Read accessor for attribute FromSpecificationFileNamed
     */
  public java.lang.String getFromSpecificationFileNamed( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute FromSpecificationFileNamed
     */
  public void setFromSpecificationFileNamed( EAIMMCtxtIfc theCtxt, java.lang.String theFromSpecificationFileNamed) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute PackageName
 ****************************************************************************/


    /* Public Read accessor for attribute PackageName
     */
  public java.lang.String getPackageName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute PackageName
     */
  public void setPackageName( EAIMMCtxtIfc theCtxt, java.lang.String thePackageName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute TemplatesDirectoryName
 ****************************************************************************/


    /* Public Read accessor for attribute TemplatesDirectoryName
     */
  public java.lang.String getTemplatesDirectoryName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute TemplatesDirectoryName
     */
  public void setTemplatesDirectoryName( EAIMMCtxtIfc theCtxt, java.lang.String theTemplatesDirectoryName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute ProjectName
 ****************************************************************************/


    /* Public Read accessor for attribute ProjectName
     */
  public java.lang.String getProjectName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute ProjectName
     */
  public void setProjectName( EAIMMCtxtIfc theCtxt, java.lang.String theProjectName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute ProjectDirectoryName
 ****************************************************************************/


    /* Public Read accessor for attribute ProjectDirectoryName
     */
  public java.lang.String getProjectDirectoryName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute ProjectDirectoryName
     */
  public void setProjectDirectoryName( EAIMMCtxtIfc theCtxt, java.lang.String theProjectDirectoryName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute OutputDirectoryName
 ****************************************************************************/


    /* Public Read accessor for attribute OutputDirectoryName
     */
  public java.lang.String getOutputDirectoryName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute OutputDirectoryName
     */
  public void setOutputDirectoryName( EAIMMCtxtIfc theCtxt, java.lang.String theOutputDirectoryName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute SerialVersionUIDPrefix
 ****************************************************************************/


    /* Public Read accessor for attribute SerialVersionUIDPrefix
     */
  public java.lang.String getSerialVersionUIDPrefix( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute SerialVersionUIDPrefix
     */
  public void setSerialVersionUIDPrefix( EAIMMCtxtIfc theCtxt, java.lang.String theSerialVersionUIDPrefix) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute SkipTypes
 ****************************************************************************/


    /* Public Read accessor for attribute SkipTypes
     */
  public String[] getSkipTypes( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute SkipTypes
     */
  public void setSkipTypes( EAIMMCtxtIfc theCtxt, String[] theSkipTypes) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute SkipModules
 ****************************************************************************/


    /* Public Read accessor for attribute SkipModules
     */
  public String[] getSkipModules( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute SkipModules
     */
  public void setSkipModules( EAIMMCtxtIfc theCtxt, String[] theSkipModules) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute DefaultSuperTypeFullBaseClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullBaseClassName
     */
  public java.lang.String getDefaultSuperTypeFullBaseClassName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute DefaultSuperTypeFullBaseClassName
     */
  public void setDefaultSuperTypeFullBaseClassName( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullBaseClassName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute DefaultSuperTypeFullIfcClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullIfcClassName
     */
  public java.lang.String getDefaultSuperTypeFullIfcClassName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute DefaultSuperTypeFullIfcClassName
     */
  public void setDefaultSuperTypeFullIfcClassName( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullIfcClassName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute DefaultSuperTypeFullPrivClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullPrivClassName
     */
  public java.lang.String getDefaultSuperTypeFullPrivClassName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute DefaultSuperTypeFullPrivClassName
     */
  public void setDefaultSuperTypeFullPrivClassName( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullPrivClassName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute DefaultSuperTypeFullPubClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullPubClassName
     */
  public java.lang.String getDefaultSuperTypeFullPubClassName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute DefaultSuperTypeFullPubClassName
     */
  public void setDefaultSuperTypeFullPubClassName( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullPubClassName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute DefaultSuperTypeFullTrxClassName
 ****************************************************************************/


    /* Public Read accessor for attribute DefaultSuperTypeFullTrxClassName
     */
  public java.lang.String getDefaultSuperTypeFullTrxClassName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute DefaultSuperTypeFullTrxClassName
     */
  public void setDefaultSuperTypeFullTrxClassName( EAIMMCtxtIfc theCtxt, java.lang.String theDefaultSuperTypeFullTrxClassName) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of M3Model
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to ONE relationship TreeRootType
 ****************************************************************************/


    /* Public Read accessor for role TreeRootType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTreeRootType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public TreeRootType number access
     */
  public int numTreeRootType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public TreeRootType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTreeRootTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public TreeRootType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findTreeRootTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public TreeRootType is related predicate
     */
  public boolean hasTreeRootTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional TreeRootType is related  predicate
     */
  public boolean hasTreeRootType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTreeRootType) throws EAIException;

    /* Public TreeRootType index access
     */
  public int indexOfTreeRootType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTreeRootType) throws EAIException;

    /* Public Write accessor for role TreeRootType
     * Machinery in TreeRootType drives the collection operations
     */
  public void setTreeRootType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTreeRootType) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship TraversalConfigs
 ****************************************************************************/


    /* Public Read accessor for role TraversalConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] getTraversalConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public TraversalConfigs number access
     */
  public int numTraversalConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public TraversalConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public TraversalConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc findTraversalConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public TraversalConfigs is related predicate
     */
  public boolean hasTraversalConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional TraversalConfigs is related  predicate
     */
  public boolean hasTraversalConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException;

    /* Public TraversalConfigs index access
     */
  public int indexOfTraversalConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addTraversalConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addTraversalConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theRelativeTraversalConfigs) throws EAIException;

    /* Transactional Public Write Remove accessor for role TraversalConfigs
     */
  public void removeTraversalConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException;

    /* Public reorder accessor for role TraversalConfigs
     */
  public void moveTraversalConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theRelativeTraversalConfigs) throws EAIException;


    /* Public reorder accessor for role TraversalConfigs
     */
  public void moveTraversalConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfigs) throws EAIException;




}
