package com.dosmil_e.m3.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3RelationshipMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/
		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrKind;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrIsDerived;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrIsDummy;



/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFmetaRelationship;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFreplicatedMetaRelationship;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFtargetToTransfomations;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFprojectionToOriginals;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFprojectedToProjections;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFtransformationToSources;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFtransformationToSubTransformations;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverse;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelType;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelRelatedType;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Relationship"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);



		vm3AttrKind = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("kind"));
		vm3Type.addAttributes( theCtxt, vm3AttrKind);

		vm3AttrIsDerived = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("isDerived"));
		vm3Type.addAttributes( theCtxt, vm3AttrIsDerived);

		vm3AttrIsDummy = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("isDummy"));
		vm3Type.addAttributes( theCtxt, vm3AttrIsDummy);



		vm3RelInverseOFmetaRelationship = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFmetaRelationship"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFmetaRelationship);
		vm3RelInverseOFmetaRelationship.setKind( theCtxt, "Many");
		vm3RelInverseOFmetaRelationship.setMinMult( theCtxt, "0");
		vm3RelInverseOFmetaRelationship.setMaxMult( theCtxt, "*");
		vm3RelInverseOFmetaRelationship.setIsDerived( theCtxt, false);
		vm3RelInverseOFmetaRelationship.setIsDummy( theCtxt, true);

		vm3RelInverseOFreplicatedMetaRelationship = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFreplicatedMetaRelationship"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFreplicatedMetaRelationship);
		vm3RelInverseOFreplicatedMetaRelationship.setKind( theCtxt, "Many");
		vm3RelInverseOFreplicatedMetaRelationship.setMinMult( theCtxt, "0");
		vm3RelInverseOFreplicatedMetaRelationship.setMaxMult( theCtxt, "*");
		vm3RelInverseOFreplicatedMetaRelationship.setIsDerived( theCtxt, false);
		vm3RelInverseOFreplicatedMetaRelationship.setIsDummy( theCtxt, true);

		vm3RelInverseOFtargetToTransfomations = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFtargetToTransfomations"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFtargetToTransfomations);
		vm3RelInverseOFtargetToTransfomations.setKind( theCtxt, "Many");
		vm3RelInverseOFtargetToTransfomations.setMinMult( theCtxt, "0");
		vm3RelInverseOFtargetToTransfomations.setMaxMult( theCtxt, "*");
		vm3RelInverseOFtargetToTransfomations.setIsDerived( theCtxt, false);
		vm3RelInverseOFtargetToTransfomations.setIsDummy( theCtxt, true);

		vm3RelInverseOFprojectionToOriginals = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFprojectionToOriginals"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFprojectionToOriginals);
		vm3RelInverseOFprojectionToOriginals.setKind( theCtxt, "Many");
		vm3RelInverseOFprojectionToOriginals.setMinMult( theCtxt, "0");
		vm3RelInverseOFprojectionToOriginals.setMaxMult( theCtxt, "*");
		vm3RelInverseOFprojectionToOriginals.setIsDerived( theCtxt, false);
		vm3RelInverseOFprojectionToOriginals.setIsDummy( theCtxt, true);

		vm3RelInverseOFprojectedToProjections = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFprojectedToProjections"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFprojectedToProjections);
		vm3RelInverseOFprojectedToProjections.setKind( theCtxt, "Many");
		vm3RelInverseOFprojectedToProjections.setMinMult( theCtxt, "0");
		vm3RelInverseOFprojectedToProjections.setMaxMult( theCtxt, "*");
		vm3RelInverseOFprojectedToProjections.setIsDerived( theCtxt, false);
		vm3RelInverseOFprojectedToProjections.setIsDummy( theCtxt, true);

		vm3RelInverseOFtransformationToSources = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFtransformationToSources"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFtransformationToSources);
		vm3RelInverseOFtransformationToSources.setKind( theCtxt, "Many");
		vm3RelInverseOFtransformationToSources.setMinMult( theCtxt, "0");
		vm3RelInverseOFtransformationToSources.setMaxMult( theCtxt, "*");
		vm3RelInverseOFtransformationToSources.setIsDerived( theCtxt, false);
		vm3RelInverseOFtransformationToSources.setIsDummy( theCtxt, true);

		vm3RelInverseOFtransformationToSubTransformations = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFtransformationToSubTransformations"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFtransformationToSubTransformations);
		vm3RelInverseOFtransformationToSubTransformations.setKind( theCtxt, "Many");
		vm3RelInverseOFtransformationToSubTransformations.setMinMult( theCtxt, "0");
		vm3RelInverseOFtransformationToSubTransformations.setMaxMult( theCtxt, "*");
		vm3RelInverseOFtransformationToSubTransformations.setIsDerived( theCtxt, false);
		vm3RelInverseOFtransformationToSubTransformations.setIsDummy( theCtxt, true);

		vm3RelInverse = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverse"));
		vm3Type.addRelationships( theCtxt, vm3RelInverse);
		vm3RelInverse.setKind( theCtxt, "References");
		vm3RelInverse.setMinMult( theCtxt, "1");
		vm3RelInverse.setMaxMult( theCtxt, "1");
		vm3RelInverse.setIsDerived( theCtxt, false);
		vm3RelInverse.setIsDummy( theCtxt, false);

		vm3RelType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("type"));
		vm3Type.addRelationships( theCtxt, vm3RelType);
		vm3RelType.setKind( theCtxt, "IsPartOf");
		vm3RelType.setMinMult( theCtxt, "1");
		vm3RelType.setMaxMult( theCtxt, "1");
		vm3RelType.setIsDerived( theCtxt, false);
		vm3RelType.setIsDummy( theCtxt, false);

		vm3RelRelatedType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("relatedType"));
		vm3Type.addRelationships( theCtxt, vm3RelRelatedType);
		vm3RelRelatedType.setKind( theCtxt, "References");
		vm3RelRelatedType.setMinMult( theCtxt, "1");
		vm3RelRelatedType.setMaxMult( theCtxt, "1");
		vm3RelRelatedType.setIsDerived( theCtxt, false);
		vm3RelRelatedType.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.m3.core.meta.M3StructuralFeatureMeta.vm3Type);




		vm3RelInverseOFmetaRelationship.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.vm3RelMetaRelationship);
		vm3RelInverseOFmetaRelationship.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.vm3Type);

		vm3RelInverseOFreplicatedMetaRelationship.setInverse( theCtxt, com.dosmil_e.m3.replication.meta.M3ReplicateBranchMgrMeta.vm3RelReplicatedMetaRelationship);
		vm3RelInverseOFreplicatedMetaRelationship.setRelatedType( theCtxt, com.dosmil_e.m3.replication.meta.M3ReplicateBranchMgrMeta.vm3Type);

		vm3RelInverseOFtargetToTransfomations.setInverse( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3RelTargetToTransfomations);
		vm3RelInverseOFtargetToTransfomations.setRelatedType( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3Type);

		vm3RelInverseOFprojectionToOriginals.setInverse( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3RelProjectionToOriginals);
		vm3RelInverseOFprojectionToOriginals.setRelatedType( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3Type);

		vm3RelInverseOFprojectedToProjections.setInverse( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3RelProjectedToProjections);
		vm3RelInverseOFprojectedToProjections.setRelatedType( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3Type);

		vm3RelInverseOFtransformationToSources.setInverse( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3RelTransformationToSources);
		vm3RelInverseOFtransformationToSources.setRelatedType( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3Type);

		vm3RelInverseOFtransformationToSubTransformations.setInverse( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3RelTransformationToSubTransformations);
		vm3RelInverseOFtransformationToSubTransformations.setRelatedType( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3Type);

		vm3RelInverse.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3RelInverse);
		vm3RelInverse.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3Type);

		vm3RelType.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelRelationships);
		vm3RelType.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);

		vm3RelRelatedType.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelRelatedWith);
		vm3RelRelatedType.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);


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

