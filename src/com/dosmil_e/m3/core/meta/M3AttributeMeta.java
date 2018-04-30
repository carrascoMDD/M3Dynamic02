package com.dosmil_e.m3.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3AttributeMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/
		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrAttributeTypeName;



/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFmetaAttribute;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFcopiedMetaAttribute;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFexcludedInRelationshipNamed;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelType;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelValueType;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Attribute"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);



		vm3AttrAttributeTypeName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("attributeTypeName"));
		vm3Type.addAttributes( theCtxt, vm3AttrAttributeTypeName);



		vm3RelInverseOFmetaAttribute = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFmetaAttribute"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFmetaAttribute);
		vm3RelInverseOFmetaAttribute.setKind( theCtxt, "Many");
		vm3RelInverseOFmetaAttribute.setMinMult( theCtxt, "0");
		vm3RelInverseOFmetaAttribute.setMaxMult( theCtxt, "*");
		vm3RelInverseOFmetaAttribute.setIsDerived( theCtxt, false);
		vm3RelInverseOFmetaAttribute.setIsDummy( theCtxt, true);

		vm3RelInverseOFcopiedMetaAttribute = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFcopiedMetaAttribute"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFcopiedMetaAttribute);
		vm3RelInverseOFcopiedMetaAttribute.setKind( theCtxt, "Many");
		vm3RelInverseOFcopiedMetaAttribute.setMinMult( theCtxt, "0");
		vm3RelInverseOFcopiedMetaAttribute.setMaxMult( theCtxt, "*");
		vm3RelInverseOFcopiedMetaAttribute.setIsDerived( theCtxt, false);
		vm3RelInverseOFcopiedMetaAttribute.setIsDummy( theCtxt, true);

		vm3RelInverseOFexcludedInRelationshipNamed = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFexcludedInRelationshipNamed"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFexcludedInRelationshipNamed);
		vm3RelInverseOFexcludedInRelationshipNamed.setKind( theCtxt, "Many");
		vm3RelInverseOFexcludedInRelationshipNamed.setMinMult( theCtxt, "0");
		vm3RelInverseOFexcludedInRelationshipNamed.setMaxMult( theCtxt, "*");
		vm3RelInverseOFexcludedInRelationshipNamed.setIsDerived( theCtxt, false);
		vm3RelInverseOFexcludedInRelationshipNamed.setIsDummy( theCtxt, true);

		vm3RelType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("type"));
		vm3Type.addRelationships( theCtxt, vm3RelType);
		vm3RelType.setKind( theCtxt, "IsPartOf");
		vm3RelType.setMinMult( theCtxt, "1");
		vm3RelType.setMaxMult( theCtxt, "1");
		vm3RelType.setIsDerived( theCtxt, false);
		vm3RelType.setIsDummy( theCtxt, false);

		vm3RelValueType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("valueType"));
		vm3Type.addRelationships( theCtxt, vm3RelValueType);
		vm3RelValueType.setKind( theCtxt, "References");
		vm3RelValueType.setMinMult( theCtxt, "1");
		vm3RelValueType.setMaxMult( theCtxt, "1");
		vm3RelValueType.setIsDerived( theCtxt, false);
		vm3RelValueType.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.m3.core.meta.M3StructuralFeatureMeta.vm3Type);




		vm3RelInverseOFmetaAttribute.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.vm3RelMetaAttribute);
		vm3RelInverseOFmetaAttribute.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.vm3Type);

		vm3RelInverseOFcopiedMetaAttribute.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3CopyFieldMgrMeta.vm3RelCopiedMetaAttribute);
		vm3RelInverseOFcopiedMetaAttribute.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3CopyFieldMgrMeta.vm3Type);

		vm3RelInverseOFexcludedInRelationshipNamed.setInverse( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3RelExcludedInRelationshipNamed);
		vm3RelInverseOFexcludedInRelationshipNamed.setRelatedType( theCtxt, com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3Type);

		vm3RelType.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelAttributes);
		vm3RelType.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);

		vm3RelValueType.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelTypeOfValues);
		vm3RelValueType.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);


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

