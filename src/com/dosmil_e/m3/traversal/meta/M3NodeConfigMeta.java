package com.dosmil_e.m3.traversal.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3NodeConfigMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/
		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrIsTerminal;



/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelBranchConfigs;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTraversalConfig;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelAttributeConfigs;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelMetaType;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelMetaNodeMgr;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFnodeConfig;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("NodeConfig"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);



		vm3AttrIsTerminal = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("isTerminal"));
		vm3Type.addAttributes( theCtxt, vm3AttrIsTerminal);



		vm3RelBranchConfigs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("branchConfigs"));
		vm3Type.addRelationships( theCtxt, vm3RelBranchConfigs);
		vm3RelBranchConfigs.setKind( theCtxt, "Many");
		vm3RelBranchConfigs.setMinMult( theCtxt, "0");
		vm3RelBranchConfigs.setMaxMult( theCtxt, "*");
		vm3RelBranchConfigs.setIsDerived( theCtxt, false);
		vm3RelBranchConfigs.setIsDummy( theCtxt, false);

		vm3RelTraversalConfig = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("traversalConfig"));
		vm3Type.addRelationships( theCtxt, vm3RelTraversalConfig);
		vm3RelTraversalConfig.setKind( theCtxt, "IsPartOf");
		vm3RelTraversalConfig.setMinMult( theCtxt, "1");
		vm3RelTraversalConfig.setMaxMult( theCtxt, "1");
		vm3RelTraversalConfig.setIsDerived( theCtxt, false);
		vm3RelTraversalConfig.setIsDummy( theCtxt, false);

		vm3RelAttributeConfigs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("attributeConfigs"));
		vm3Type.addRelationships( theCtxt, vm3RelAttributeConfigs);
		vm3RelAttributeConfigs.setKind( theCtxt, "Many");
		vm3RelAttributeConfigs.setMinMult( theCtxt, "0");
		vm3RelAttributeConfigs.setMaxMult( theCtxt, "*");
		vm3RelAttributeConfigs.setIsDerived( theCtxt, false);
		vm3RelAttributeConfigs.setIsDummy( theCtxt, false);

		vm3RelMetaType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("metaType"));
		vm3Type.addRelationships( theCtxt, vm3RelMetaType);
		vm3RelMetaType.setKind( theCtxt, "References");
		vm3RelMetaType.setMinMult( theCtxt, "1");
		vm3RelMetaType.setMaxMult( theCtxt, "1");
		vm3RelMetaType.setIsDerived( theCtxt, false);
		vm3RelMetaType.setIsDummy( theCtxt, false);

		vm3RelMetaNodeMgr = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("metaNodeMgr"));
		vm3Type.addRelationships( theCtxt, vm3RelMetaNodeMgr);
		vm3RelMetaNodeMgr.setKind( theCtxt, "References");
		vm3RelMetaNodeMgr.setMinMult( theCtxt, "1");
		vm3RelMetaNodeMgr.setMaxMult( theCtxt, "1");
		vm3RelMetaNodeMgr.setIsDerived( theCtxt, false);
		vm3RelMetaNodeMgr.setIsDummy( theCtxt, false);

		vm3RelInverseOFnodeConfig = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFnodeConfig"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFnodeConfig);
		vm3RelInverseOFnodeConfig.setKind( theCtxt, "Many");
		vm3RelInverseOFnodeConfig.setMinMult( theCtxt, "0");
		vm3RelInverseOFnodeConfig.setMaxMult( theCtxt, "*");
		vm3RelInverseOFnodeConfig.setIsDerived( theCtxt, false);
		vm3RelInverseOFnodeConfig.setIsDummy( theCtxt, true);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.m3.traversal.meta.M3ConfigOverrideMeta.vm3Type);




		vm3RelBranchConfigs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.vm3RelInverseOFbranchConfigs);
		vm3RelBranchConfigs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.vm3Type);

		vm3RelTraversalConfig.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3RelNodeConfigs);
		vm3RelTraversalConfig.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3Type);

		vm3RelAttributeConfigs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.vm3RelInverseOFattributeConfigs);
		vm3RelAttributeConfigs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.vm3Type);

		vm3RelMetaType.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelInverseOFmetaType);
		vm3RelMetaType.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);

		vm3RelMetaNodeMgr.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeMgrMeta.vm3RelInverseOFmetaNodeMgr);
		vm3RelMetaNodeMgr.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeMgrMeta.vm3Type);

		vm3RelInverseOFnodeConfig.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3TypeNodeConfigMeta.vm3RelNodeConfig);
		vm3RelInverseOFnodeConfig.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3TypeNodeConfigMeta.vm3Type);


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

