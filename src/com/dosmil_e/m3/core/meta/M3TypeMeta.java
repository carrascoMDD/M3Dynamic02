package com.dosmil_e.m3.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3TypeMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/
		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrIsEnumeration;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrIsPrimitive;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrIsAbstract;



/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFmetaType;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverse1OFmetaType;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFreplicatedMetaType;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFprojectionType;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFexclusionType;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelModule;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelAttributes;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTypeOfValues;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSuperTypes;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSubTypes;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelRelationships;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelRelatedWith;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelRootTypeOfModel;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Type"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);



		vm3AttrIsEnumeration = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("isEnumeration"));
		vm3Type.addAttributes( theCtxt, vm3AttrIsEnumeration);

		vm3AttrIsPrimitive = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("isPrimitive"));
		vm3Type.addAttributes( theCtxt, vm3AttrIsPrimitive);

		vm3AttrIsAbstract = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("isAbstract"));
		vm3Type.addAttributes( theCtxt, vm3AttrIsAbstract);



		vm3RelInverseOFmetaType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFmetaType"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFmetaType);
		vm3RelInverseOFmetaType.setKind( theCtxt, "Many");
		vm3RelInverseOFmetaType.setMinMult( theCtxt, "0");
		vm3RelInverseOFmetaType.setMaxMult( theCtxt, "*");
		vm3RelInverseOFmetaType.setIsDerived( theCtxt, false);
		vm3RelInverseOFmetaType.setIsDummy( theCtxt, true);

		vm3RelInverse1OFmetaType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverse1OFmetaType"));
		vm3Type.addRelationships( theCtxt, vm3RelInverse1OFmetaType);
		vm3RelInverse1OFmetaType.setKind( theCtxt, "Many");
		vm3RelInverse1OFmetaType.setMinMult( theCtxt, "0");
		vm3RelInverse1OFmetaType.setMaxMult( theCtxt, "*");
		vm3RelInverse1OFmetaType.setIsDerived( theCtxt, false);
		vm3RelInverse1OFmetaType.setIsDummy( theCtxt, true);

		vm3RelInverseOFreplicatedMetaType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFreplicatedMetaType"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFreplicatedMetaType);
		vm3RelInverseOFreplicatedMetaType.setKind( theCtxt, "Many");
		vm3RelInverseOFreplicatedMetaType.setMinMult( theCtxt, "0");
		vm3RelInverseOFreplicatedMetaType.setMaxMult( theCtxt, "*");
		vm3RelInverseOFreplicatedMetaType.setIsDerived( theCtxt, false);
		vm3RelInverseOFreplicatedMetaType.setIsDummy( theCtxt, true);

		vm3RelInverseOFprojectionType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFprojectionType"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFprojectionType);
		vm3RelInverseOFprojectionType.setKind( theCtxt, "Many");
		vm3RelInverseOFprojectionType.setMinMult( theCtxt, "0");
		vm3RelInverseOFprojectionType.setMaxMult( theCtxt, "*");
		vm3RelInverseOFprojectionType.setIsDerived( theCtxt, false);
		vm3RelInverseOFprojectionType.setIsDummy( theCtxt, true);

		vm3RelInverseOFexclusionType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFexclusionType"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFexclusionType);
		vm3RelInverseOFexclusionType.setKind( theCtxt, "Many");
		vm3RelInverseOFexclusionType.setMinMult( theCtxt, "0");
		vm3RelInverseOFexclusionType.setMaxMult( theCtxt, "*");
		vm3RelInverseOFexclusionType.setIsDerived( theCtxt, false);
		vm3RelInverseOFexclusionType.setIsDummy( theCtxt, true);

		vm3RelModule = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("module"));
		vm3Type.addRelationships( theCtxt, vm3RelModule);
		vm3RelModule.setKind( theCtxt, "IsPartOf");
		vm3RelModule.setMinMult( theCtxt, "1");
		vm3RelModule.setMaxMult( theCtxt, "1");
		vm3RelModule.setIsDerived( theCtxt, false);
		vm3RelModule.setIsDummy( theCtxt, false);

		vm3RelAttributes = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("attributes"));
		vm3Type.addRelationships( theCtxt, vm3RelAttributes);
		vm3RelAttributes.setKind( theCtxt, "Aggregates");
		vm3RelAttributes.setMinMult( theCtxt, "0");
		vm3RelAttributes.setMaxMult( theCtxt, "*");
		vm3RelAttributes.setIsDerived( theCtxt, false);
		vm3RelAttributes.setIsDummy( theCtxt, false);

		vm3RelTypeOfValues = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("typeOfValues"));
		vm3Type.addRelationships( theCtxt, vm3RelTypeOfValues);
		vm3RelTypeOfValues.setKind( theCtxt, "Many");
		vm3RelTypeOfValues.setMinMult( theCtxt, "0");
		vm3RelTypeOfValues.setMaxMult( theCtxt, "*");
		vm3RelTypeOfValues.setIsDerived( theCtxt, false);
		vm3RelTypeOfValues.setIsDummy( theCtxt, false);

		vm3RelSuperTypes = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("superTypes"));
		vm3Type.addRelationships( theCtxt, vm3RelSuperTypes);
		vm3RelSuperTypes.setKind( theCtxt, "Many");
		vm3RelSuperTypes.setMinMult( theCtxt, "0");
		vm3RelSuperTypes.setMaxMult( theCtxt, "*");
		vm3RelSuperTypes.setIsDerived( theCtxt, false);
		vm3RelSuperTypes.setIsDummy( theCtxt, false);

		vm3RelSubTypes = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("subTypes"));
		vm3Type.addRelationships( theCtxt, vm3RelSubTypes);
		vm3RelSubTypes.setKind( theCtxt, "Many");
		vm3RelSubTypes.setMinMult( theCtxt, "0");
		vm3RelSubTypes.setMaxMult( theCtxt, "*");
		vm3RelSubTypes.setIsDerived( theCtxt, false);
		vm3RelSubTypes.setIsDummy( theCtxt, false);

		vm3RelRelationships = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("relationships"));
		vm3Type.addRelationships( theCtxt, vm3RelRelationships);
		vm3RelRelationships.setKind( theCtxt, "Aggregates");
		vm3RelRelationships.setMinMult( theCtxt, "0");
		vm3RelRelationships.setMaxMult( theCtxt, "*");
		vm3RelRelationships.setIsDerived( theCtxt, false);
		vm3RelRelationships.setIsDummy( theCtxt, false);

		vm3RelRelatedWith = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("relatedWith"));
		vm3Type.addRelationships( theCtxt, vm3RelRelatedWith);
		vm3RelRelatedWith.setKind( theCtxt, "Many");
		vm3RelRelatedWith.setMinMult( theCtxt, "0");
		vm3RelRelatedWith.setMaxMult( theCtxt, "*");
		vm3RelRelatedWith.setIsDerived( theCtxt, false);
		vm3RelRelatedWith.setIsDummy( theCtxt, false);

		vm3RelRootTypeOfModel = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("rootTypeOfModel"));
		vm3Type.addRelationships( theCtxt, vm3RelRootTypeOfModel);
		vm3RelRootTypeOfModel.setKind( theCtxt, "References");
		vm3RelRootTypeOfModel.setMinMult( theCtxt, "0");
		vm3RelRootTypeOfModel.setMaxMult( theCtxt, "1");
		vm3RelRootTypeOfModel.setIsDerived( theCtxt, false);
		vm3RelRootTypeOfModel.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.m3.core.meta.M3ElementMeta.vm3Type);




		vm3RelInverseOFmetaType.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3RelMetaType);
		vm3RelInverseOFmetaType.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3Type);

		vm3RelInverse1OFmetaType.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3TypeNodeConfigMeta.vm3RelMetaType);
		vm3RelInverse1OFmetaType.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3TypeNodeConfigMeta.vm3Type);

		vm3RelInverseOFreplicatedMetaType.setInverse( theCtxt, com.dosmil_e.m3.replication.meta.M3ReplicateNodeMgrMeta.vm3RelReplicatedMetaType);
		vm3RelInverseOFreplicatedMetaType.setRelatedType( theCtxt, com.dosmil_e.m3.replication.meta.M3ReplicateNodeMgrMeta.vm3Type);

		vm3RelInverseOFprojectionType.setInverse( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3RelProjectionType);
		vm3RelInverseOFprojectionType.setRelatedType( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3Type);

		vm3RelInverseOFexclusionType.setInverse( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3RelExclusionType);
		vm3RelInverseOFexclusionType.setRelatedType( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3Type);

		vm3RelModule.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3ModuleMeta.vm3RelTypes);
		vm3RelModule.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3ModuleMeta.vm3Type);

		vm3RelAttributes.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3AttributeMeta.vm3RelType);
		vm3RelAttributes.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3AttributeMeta.vm3Type);

		vm3RelTypeOfValues.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3AttributeMeta.vm3RelValueType);
		vm3RelTypeOfValues.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3AttributeMeta.vm3Type);

		vm3RelSuperTypes.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelSubTypes);
		vm3RelSuperTypes.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);

		vm3RelSubTypes.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelSuperTypes);
		vm3RelSubTypes.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);

		vm3RelRelationships.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3RelType);
		vm3RelRelationships.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3Type);

		vm3RelRelatedWith.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3RelRelatedType);
		vm3RelRelatedWith.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3Type);

		vm3RelRootTypeOfModel.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3ModelMeta.vm3RelTreeRootType);
		vm3RelRootTypeOfModel.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3ModelMeta.vm3Type);


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

