package com.dosmil_e.m3.projection.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3ProjectionConfigMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTargetToTransfomations;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelProjectionToOriginals;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelProjectedToProjections;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTransformationToSources;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTransformationToSubTransformations;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelProjectionType;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelExclusionType;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelExcludedInRelationshipNamed;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("ProjectionConfig"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);





		vm3RelTargetToTransfomations = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("targetToTransfomations"));
		vm3Type.addRelationships( theCtxt, vm3RelTargetToTransfomations);
		vm3RelTargetToTransfomations.setKind( theCtxt, "References");
		vm3RelTargetToTransfomations.setMinMult( theCtxt, "0");
		vm3RelTargetToTransfomations.setMaxMult( theCtxt, "1");
		vm3RelTargetToTransfomations.setIsDerived( theCtxt, false);
		vm3RelTargetToTransfomations.setIsDummy( theCtxt, false);

		vm3RelProjectionToOriginals = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("projectionToOriginals"));
		vm3Type.addRelationships( theCtxt, vm3RelProjectionToOriginals);
		vm3RelProjectionToOriginals.setKind( theCtxt, "References");
		vm3RelProjectionToOriginals.setMinMult( theCtxt, "0");
		vm3RelProjectionToOriginals.setMaxMult( theCtxt, "1");
		vm3RelProjectionToOriginals.setIsDerived( theCtxt, false);
		vm3RelProjectionToOriginals.setIsDummy( theCtxt, false);

		vm3RelProjectedToProjections = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("projectedToProjections"));
		vm3Type.addRelationships( theCtxt, vm3RelProjectedToProjections);
		vm3RelProjectedToProjections.setKind( theCtxt, "References");
		vm3RelProjectedToProjections.setMinMult( theCtxt, "0");
		vm3RelProjectedToProjections.setMaxMult( theCtxt, "1");
		vm3RelProjectedToProjections.setIsDerived( theCtxt, false);
		vm3RelProjectedToProjections.setIsDummy( theCtxt, false);

		vm3RelTransformationToSources = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("transformationToSources"));
		vm3Type.addRelationships( theCtxt, vm3RelTransformationToSources);
		vm3RelTransformationToSources.setKind( theCtxt, "References");
		vm3RelTransformationToSources.setMinMult( theCtxt, "0");
		vm3RelTransformationToSources.setMaxMult( theCtxt, "1");
		vm3RelTransformationToSources.setIsDerived( theCtxt, false);
		vm3RelTransformationToSources.setIsDummy( theCtxt, false);

		vm3RelTransformationToSubTransformations = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("transformationToSubTransformations"));
		vm3Type.addRelationships( theCtxt, vm3RelTransformationToSubTransformations);
		vm3RelTransformationToSubTransformations.setKind( theCtxt, "References");
		vm3RelTransformationToSubTransformations.setMinMult( theCtxt, "0");
		vm3RelTransformationToSubTransformations.setMaxMult( theCtxt, "1");
		vm3RelTransformationToSubTransformations.setIsDerived( theCtxt, false);
		vm3RelTransformationToSubTransformations.setIsDummy( theCtxt, false);

		vm3RelProjectionType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("projectionType"));
		vm3Type.addRelationships( theCtxt, vm3RelProjectionType);
		vm3RelProjectionType.setKind( theCtxt, "References");
		vm3RelProjectionType.setMinMult( theCtxt, "0");
		vm3RelProjectionType.setMaxMult( theCtxt, "1");
		vm3RelProjectionType.setIsDerived( theCtxt, false);
		vm3RelProjectionType.setIsDummy( theCtxt, false);

		vm3RelExclusionType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("exclusionType"));
		vm3Type.addRelationships( theCtxt, vm3RelExclusionType);
		vm3RelExclusionType.setKind( theCtxt, "References");
		vm3RelExclusionType.setMinMult( theCtxt, "0");
		vm3RelExclusionType.setMaxMult( theCtxt, "1");
		vm3RelExclusionType.setIsDerived( theCtxt, false);
		vm3RelExclusionType.setIsDummy( theCtxt, false);

		vm3RelExcludedInRelationshipNamed = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("excludedInRelationshipNamed"));
		vm3Type.addRelationships( theCtxt, vm3RelExcludedInRelationshipNamed);
		vm3RelExcludedInRelationshipNamed.setKind( theCtxt, "References");
		vm3RelExcludedInRelationshipNamed.setMinMult( theCtxt, "0");
		vm3RelExcludedInRelationshipNamed.setMaxMult( theCtxt, "1");
		vm3RelExcludedInRelationshipNamed.setIsDerived( theCtxt, false);
		vm3RelExcludedInRelationshipNamed.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3Type);




		vm3RelTargetToTransfomations.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3RelInverseOFtargetToTransfomations);
		vm3RelTargetToTransfomations.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3Type);

		vm3RelProjectionToOriginals.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3RelInverseOFprojectionToOriginals);
		vm3RelProjectionToOriginals.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3Type);

		vm3RelProjectedToProjections.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3RelInverseOFprojectedToProjections);
		vm3RelProjectedToProjections.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3Type);

		vm3RelTransformationToSources.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3RelInverseOFtransformationToSources);
		vm3RelTransformationToSources.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3Type);

		vm3RelTransformationToSubTransformations.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3RelInverseOFtransformationToSubTransformations);
		vm3RelTransformationToSubTransformations.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3Type);

		vm3RelProjectionType.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelInverseOFprojectionType);
		vm3RelProjectionType.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);

		vm3RelExclusionType.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelInverseOFexclusionType);
		vm3RelExclusionType.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);

		vm3RelExcludedInRelationshipNamed.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3AttributeMeta.vm3RelInverseOFexcludedInRelationshipNamed);
		vm3RelExcludedInRelationshipNamed.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3AttributeMeta.vm3Type);


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

