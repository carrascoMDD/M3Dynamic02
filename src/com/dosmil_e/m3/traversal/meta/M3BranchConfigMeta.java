package com.dosmil_e.m3.traversal.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3BranchConfigMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/
		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrPhaseNumber;



/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFbranchConfigs;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelMetaRelationship;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTypeNodeConfigs;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTraversalConfig;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelMetaBranchMgr;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("BranchConfig"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);



		vm3AttrPhaseNumber = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("phaseNumber"));
		vm3Type.addAttributes( theCtxt, vm3AttrPhaseNumber);



		vm3RelInverseOFbranchConfigs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFbranchConfigs"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFbranchConfigs);
		vm3RelInverseOFbranchConfigs.setKind( theCtxt, "Many");
		vm3RelInverseOFbranchConfigs.setMinMult( theCtxt, "0");
		vm3RelInverseOFbranchConfigs.setMaxMult( theCtxt, "*");
		vm3RelInverseOFbranchConfigs.setIsDerived( theCtxt, false);
		vm3RelInverseOFbranchConfigs.setIsDummy( theCtxt, true);

		vm3RelMetaRelationship = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("metaRelationship"));
		vm3Type.addRelationships( theCtxt, vm3RelMetaRelationship);
		vm3RelMetaRelationship.setKind( theCtxt, "References");
		vm3RelMetaRelationship.setMinMult( theCtxt, "1");
		vm3RelMetaRelationship.setMaxMult( theCtxt, "1");
		vm3RelMetaRelationship.setIsDerived( theCtxt, false);
		vm3RelMetaRelationship.setIsDummy( theCtxt, false);

		vm3RelTypeNodeConfigs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("typeNodeConfigs"));
		vm3Type.addRelationships( theCtxt, vm3RelTypeNodeConfigs);
		vm3RelTypeNodeConfigs.setKind( theCtxt, "Aggregates");
		vm3RelTypeNodeConfigs.setMinMult( theCtxt, "0");
		vm3RelTypeNodeConfigs.setMaxMult( theCtxt, "*");
		vm3RelTypeNodeConfigs.setIsDerived( theCtxt, false);
		vm3RelTypeNodeConfigs.setIsDummy( theCtxt, false);

		vm3RelTraversalConfig = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("traversalConfig"));
		vm3Type.addRelationships( theCtxt, vm3RelTraversalConfig);
		vm3RelTraversalConfig.setKind( theCtxt, "IsPartOf");
		vm3RelTraversalConfig.setMinMult( theCtxt, "1");
		vm3RelTraversalConfig.setMaxMult( theCtxt, "1");
		vm3RelTraversalConfig.setIsDerived( theCtxt, false);
		vm3RelTraversalConfig.setIsDummy( theCtxt, false);

		vm3RelMetaBranchMgr = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("metaBranchMgr"));
		vm3Type.addRelationships( theCtxt, vm3RelMetaBranchMgr);
		vm3RelMetaBranchMgr.setKind( theCtxt, "References");
		vm3RelMetaBranchMgr.setMinMult( theCtxt, "1");
		vm3RelMetaBranchMgr.setMaxMult( theCtxt, "1");
		vm3RelMetaBranchMgr.setIsDerived( theCtxt, false);
		vm3RelMetaBranchMgr.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.m3.traversal.meta.M3ConfigOverrideMeta.vm3Type);




		vm3RelInverseOFbranchConfigs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3RelBranchConfigs);
		vm3RelInverseOFbranchConfigs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3Type);

		vm3RelMetaRelationship.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3RelInverseOFmetaRelationship);
		vm3RelMetaRelationship.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3Type);

		vm3RelTypeNodeConfigs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3RelatedTypeNodeConfigMeta.vm3RelBranchConfig);
		vm3RelTypeNodeConfigs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3RelatedTypeNodeConfigMeta.vm3Type);

		vm3RelTraversalConfig.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3RelBranchConfigs);
		vm3RelTraversalConfig.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3Type);

		vm3RelMetaBranchMgr.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3BranchMgrMeta.vm3RelInverseOFmetaBranchMgr);
		vm3RelMetaBranchMgr.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3BranchMgrMeta.vm3Type);


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

