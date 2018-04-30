package com.dosmil_e.m3.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3ModelMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/
		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrTypePrefix;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrRelationshipVariablePrefix;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrAttributeVariablePrefix;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrEnumVariablePrefix;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrMetaVariablePrefix;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrMetaPackageName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrFrameworkPackageName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrFromSpecificationFileNamed;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrPackageName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrTemplatesDirectoryName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrProjectName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrProjectDirectoryName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrOutputDirectoryName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrSerialVersionUIDPrefix;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrSkipTypes;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrSkipModules;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrDefaultSuperTypeFullBaseClassName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrDefaultSuperTypeFullIfcClassName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrDefaultSuperTypeFullPrivClassName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrDefaultSuperTypeFullPubClassName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrDefaultSuperTypeFullTrxClassName;



/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTreeRootType;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTraversalConfigs;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Model"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);



		vm3AttrTypePrefix = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("typePrefix"));
		vm3Type.addAttributes( theCtxt, vm3AttrTypePrefix);

		vm3AttrRelationshipVariablePrefix = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("relationshipVariablePrefix"));
		vm3Type.addAttributes( theCtxt, vm3AttrRelationshipVariablePrefix);

		vm3AttrAttributeVariablePrefix = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("attributeVariablePrefix"));
		vm3Type.addAttributes( theCtxt, vm3AttrAttributeVariablePrefix);

		vm3AttrEnumVariablePrefix = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("enumVariablePrefix"));
		vm3Type.addAttributes( theCtxt, vm3AttrEnumVariablePrefix);

		vm3AttrMetaVariablePrefix = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("metaVariablePrefix"));
		vm3Type.addAttributes( theCtxt, vm3AttrMetaVariablePrefix);

		vm3AttrMetaPackageName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("metaPackageName"));
		vm3Type.addAttributes( theCtxt, vm3AttrMetaPackageName);

		vm3AttrFrameworkPackageName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("frameworkPackageName"));
		vm3Type.addAttributes( theCtxt, vm3AttrFrameworkPackageName);

		vm3AttrFromSpecificationFileNamed = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("fromSpecificationFileNamed"));
		vm3Type.addAttributes( theCtxt, vm3AttrFromSpecificationFileNamed);

		vm3AttrPackageName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("packageName"));
		vm3Type.addAttributes( theCtxt, vm3AttrPackageName);

		vm3AttrTemplatesDirectoryName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("templatesDirectoryName"));
		vm3Type.addAttributes( theCtxt, vm3AttrTemplatesDirectoryName);

		vm3AttrProjectName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("projectName"));
		vm3Type.addAttributes( theCtxt, vm3AttrProjectName);

		vm3AttrProjectDirectoryName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("projectDirectoryName"));
		vm3Type.addAttributes( theCtxt, vm3AttrProjectDirectoryName);

		vm3AttrOutputDirectoryName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("outputDirectoryName"));
		vm3Type.addAttributes( theCtxt, vm3AttrOutputDirectoryName);

		vm3AttrSerialVersionUIDPrefix = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("serialVersionUIDPrefix"));
		vm3Type.addAttributes( theCtxt, vm3AttrSerialVersionUIDPrefix);

		vm3AttrSkipTypes = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("skipTypes"));
		vm3Type.addAttributes( theCtxt, vm3AttrSkipTypes);

		vm3AttrSkipModules = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("skipModules"));
		vm3Type.addAttributes( theCtxt, vm3AttrSkipModules);

		vm3AttrDefaultSuperTypeFullBaseClassName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("defaultSuperTypeFullBaseClassName"));
		vm3Type.addAttributes( theCtxt, vm3AttrDefaultSuperTypeFullBaseClassName);

		vm3AttrDefaultSuperTypeFullIfcClassName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("defaultSuperTypeFullIfcClassName"));
		vm3Type.addAttributes( theCtxt, vm3AttrDefaultSuperTypeFullIfcClassName);

		vm3AttrDefaultSuperTypeFullPrivClassName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("defaultSuperTypeFullPrivClassName"));
		vm3Type.addAttributes( theCtxt, vm3AttrDefaultSuperTypeFullPrivClassName);

		vm3AttrDefaultSuperTypeFullPubClassName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("defaultSuperTypeFullPubClassName"));
		vm3Type.addAttributes( theCtxt, vm3AttrDefaultSuperTypeFullPubClassName);

		vm3AttrDefaultSuperTypeFullTrxClassName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("defaultSuperTypeFullTrxClassName"));
		vm3Type.addAttributes( theCtxt, vm3AttrDefaultSuperTypeFullTrxClassName);



		vm3RelTreeRootType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("treeRootType"));
		vm3Type.addRelationships( theCtxt, vm3RelTreeRootType);
		vm3RelTreeRootType.setKind( theCtxt, "References");
		vm3RelTreeRootType.setMinMult( theCtxt, "0");
		vm3RelTreeRootType.setMaxMult( theCtxt, "1");
		vm3RelTreeRootType.setIsDerived( theCtxt, false);
		vm3RelTreeRootType.setIsDummy( theCtxt, false);

		vm3RelTraversalConfigs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("traversalConfigs"));
		vm3Type.addRelationships( theCtxt, vm3RelTraversalConfigs);
		vm3RelTraversalConfigs.setKind( theCtxt, "Aggregates");
		vm3RelTraversalConfigs.setMinMult( theCtxt, "0");
		vm3RelTraversalConfigs.setMaxMult( theCtxt, "*");
		vm3RelTraversalConfigs.setIsDerived( theCtxt, false);
		vm3RelTraversalConfigs.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.m3.core.meta.M3ModuleMeta.vm3Type);




		vm3RelTreeRootType.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelRootTypeOfModel);
		vm3RelTreeRootType.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);

		vm3RelTraversalConfigs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3RelModel);
		vm3RelTraversalConfigs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3Type);


  }




/****************************************************************************
 *  Access and initialization of metainformation the metamodel element
 *    for initialization, delegates on the model's metamodel root, that will
 *    invoke metainfo initializers (phase1, phase2) on all the metamodel elements
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc getStaticM3Type( EAIMMCtxtIfc theCtxt) {
    if( vm3Type != null) { return vm3Type;}
    com.dosmil_e.m3.meta.M3Dynamic02.initM3( theCtxt);
    return vm3Type;
  }




/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300000003L;


}

