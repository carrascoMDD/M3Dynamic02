package com.dosmil_e.m3.traversal.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3TraversalConfigMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/


/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelRootTypeNodeConfigs;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelBranchConfigs;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelNodeConfigs;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelAttributeConfigs;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelConfigOverrides;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelModel;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelFieldMgrs;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelBranchMgrs;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelNodeMgrs;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("TraversalConfig"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);





		vm3RelRootTypeNodeConfigs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("rootTypeNodeConfigs"));
		vm3Type.addRelationships( theCtxt, vm3RelRootTypeNodeConfigs);
		vm3RelRootTypeNodeConfigs.setKind( theCtxt, "Aggregates");
		vm3RelRootTypeNodeConfigs.setMinMult( theCtxt, "0");
		vm3RelRootTypeNodeConfigs.setMaxMult( theCtxt, "*");
		vm3RelRootTypeNodeConfigs.setIsDerived( theCtxt, false);
		vm3RelRootTypeNodeConfigs.setIsDummy( theCtxt, false);

		vm3RelBranchConfigs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("branchConfigs"));
		vm3Type.addRelationships( theCtxt, vm3RelBranchConfigs);
		vm3RelBranchConfigs.setKind( theCtxt, "Aggregates");
		vm3RelBranchConfigs.setMinMult( theCtxt, "0");
		vm3RelBranchConfigs.setMaxMult( theCtxt, "*");
		vm3RelBranchConfigs.setIsDerived( theCtxt, false);
		vm3RelBranchConfigs.setIsDummy( theCtxt, false);

		vm3RelNodeConfigs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("nodeConfigs"));
		vm3Type.addRelationships( theCtxt, vm3RelNodeConfigs);
		vm3RelNodeConfigs.setKind( theCtxt, "Aggregates");
		vm3RelNodeConfigs.setMinMult( theCtxt, "0");
		vm3RelNodeConfigs.setMaxMult( theCtxt, "*");
		vm3RelNodeConfigs.setIsDerived( theCtxt, false);
		vm3RelNodeConfigs.setIsDummy( theCtxt, false);

		vm3RelAttributeConfigs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("attributeConfigs"));
		vm3Type.addRelationships( theCtxt, vm3RelAttributeConfigs);
		vm3RelAttributeConfigs.setKind( theCtxt, "Aggregates");
		vm3RelAttributeConfigs.setMinMult( theCtxt, "0");
		vm3RelAttributeConfigs.setMaxMult( theCtxt, "*");
		vm3RelAttributeConfigs.setIsDerived( theCtxt, false);
		vm3RelAttributeConfigs.setIsDummy( theCtxt, false);

		vm3RelConfigOverrides = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("configOverrides"));
		vm3Type.addRelationships( theCtxt, vm3RelConfigOverrides);
		vm3RelConfigOverrides.setKind( theCtxt, "Many");
		vm3RelConfigOverrides.setMinMult( theCtxt, "0");
		vm3RelConfigOverrides.setMaxMult( theCtxt, "*");
		vm3RelConfigOverrides.setIsDerived( theCtxt, false);
		vm3RelConfigOverrides.setIsDummy( theCtxt, false);

		vm3RelModel = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("model"));
		vm3Type.addRelationships( theCtxt, vm3RelModel);
		vm3RelModel.setKind( theCtxt, "IsPartOf");
		vm3RelModel.setMinMult( theCtxt, "1");
		vm3RelModel.setMaxMult( theCtxt, "1");
		vm3RelModel.setIsDerived( theCtxt, false);
		vm3RelModel.setIsDummy( theCtxt, false);

		vm3RelFieldMgrs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("fieldMgrs"));
		vm3Type.addRelationships( theCtxt, vm3RelFieldMgrs);
		vm3RelFieldMgrs.setKind( theCtxt, "Aggregates");
		vm3RelFieldMgrs.setMinMult( theCtxt, "0");
		vm3RelFieldMgrs.setMaxMult( theCtxt, "*");
		vm3RelFieldMgrs.setIsDerived( theCtxt, false);
		vm3RelFieldMgrs.setIsDummy( theCtxt, false);

		vm3RelBranchMgrs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("branchMgrs"));
		vm3Type.addRelationships( theCtxt, vm3RelBranchMgrs);
		vm3RelBranchMgrs.setKind( theCtxt, "Aggregates");
		vm3RelBranchMgrs.setMinMult( theCtxt, "0");
		vm3RelBranchMgrs.setMaxMult( theCtxt, "*");
		vm3RelBranchMgrs.setIsDerived( theCtxt, false);
		vm3RelBranchMgrs.setIsDummy( theCtxt, false);

		vm3RelNodeMgrs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("nodeMgrs"));
		vm3Type.addRelationships( theCtxt, vm3RelNodeMgrs);
		vm3RelNodeMgrs.setKind( theCtxt, "Aggregates");
		vm3RelNodeMgrs.setMinMult( theCtxt, "0");
		vm3RelNodeMgrs.setMaxMult( theCtxt, "*");
		vm3RelNodeMgrs.setIsDerived( theCtxt, false);
		vm3RelNodeMgrs.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {




		vm3RelRootTypeNodeConfigs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3RootTypeNodeConfigMeta.vm3RelTraversalConfig);
		vm3RelRootTypeNodeConfigs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3RootTypeNodeConfigMeta.vm3Type);

		vm3RelBranchConfigs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.vm3RelTraversalConfig);
		vm3RelBranchConfigs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.vm3Type);

		vm3RelNodeConfigs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3RelTraversalConfig);
		vm3RelNodeConfigs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3Type);

		vm3RelAttributeConfigs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.vm3RelTraversalConfig);
		vm3RelAttributeConfigs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.vm3Type);

		vm3RelConfigOverrides.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3ConfigOverrideMeta.vm3RelOverrideWith);
		vm3RelConfigOverrides.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3ConfigOverrideMeta.vm3Type);

		vm3RelModel.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3ModelMeta.vm3RelTraversalConfigs);
		vm3RelModel.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3ModelMeta.vm3Type);

		vm3RelFieldMgrs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3FieldMgrMeta.vm3RelTraversalConfig);
		vm3RelFieldMgrs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3FieldMgrMeta.vm3Type);

		vm3RelBranchMgrs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3BranchMgrMeta.vm3RelTraversalConfig);
		vm3RelBranchMgrs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3BranchMgrMeta.vm3Type);

		vm3RelNodeMgrs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeMgrMeta.vm3RelTraversalConfig);
		vm3RelNodeMgrs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeMgrMeta.vm3Type);


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

