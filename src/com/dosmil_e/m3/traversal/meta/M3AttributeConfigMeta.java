package com.dosmil_e.m3.traversal.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3AttributeConfigMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFattributeConfigs;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTraversalConfig;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelMetaAttribute;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelMetaFieldMgr;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("AttributeConfig"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);





		vm3RelInverseOFattributeConfigs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFattributeConfigs"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFattributeConfigs);
		vm3RelInverseOFattributeConfigs.setKind( theCtxt, "Many");
		vm3RelInverseOFattributeConfigs.setMinMult( theCtxt, "0");
		vm3RelInverseOFattributeConfigs.setMaxMult( theCtxt, "*");
		vm3RelInverseOFattributeConfigs.setIsDerived( theCtxt, false);
		vm3RelInverseOFattributeConfigs.setIsDummy( theCtxt, true);

		vm3RelTraversalConfig = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("traversalConfig"));
		vm3Type.addRelationships( theCtxt, vm3RelTraversalConfig);
		vm3RelTraversalConfig.setKind( theCtxt, "IsPartOf");
		vm3RelTraversalConfig.setMinMult( theCtxt, "1");
		vm3RelTraversalConfig.setMaxMult( theCtxt, "1");
		vm3RelTraversalConfig.setIsDerived( theCtxt, false);
		vm3RelTraversalConfig.setIsDummy( theCtxt, false);

		vm3RelMetaAttribute = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("metaAttribute"));
		vm3Type.addRelationships( theCtxt, vm3RelMetaAttribute);
		vm3RelMetaAttribute.setKind( theCtxt, "References");
		vm3RelMetaAttribute.setMinMult( theCtxt, "1");
		vm3RelMetaAttribute.setMaxMult( theCtxt, "1");
		vm3RelMetaAttribute.setIsDerived( theCtxt, false);
		vm3RelMetaAttribute.setIsDummy( theCtxt, false);

		vm3RelMetaFieldMgr = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("metaFieldMgr"));
		vm3Type.addRelationships( theCtxt, vm3RelMetaFieldMgr);
		vm3RelMetaFieldMgr.setKind( theCtxt, "References");
		vm3RelMetaFieldMgr.setMinMult( theCtxt, "1");
		vm3RelMetaFieldMgr.setMaxMult( theCtxt, "1");
		vm3RelMetaFieldMgr.setIsDerived( theCtxt, false);
		vm3RelMetaFieldMgr.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {




		vm3RelInverseOFattributeConfigs.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3RelAttributeConfigs);
		vm3RelInverseOFattributeConfigs.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3Type);

		vm3RelTraversalConfig.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3RelAttributeConfigs);
		vm3RelTraversalConfig.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3Type);

		vm3RelMetaAttribute.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3AttributeMeta.vm3RelInverseOFmetaAttribute);
		vm3RelMetaAttribute.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3AttributeMeta.vm3Type);

		vm3RelMetaFieldMgr.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3FieldMgrMeta.vm3RelInverseOFmetaFieldMgr);
		vm3RelMetaFieldMgr.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3FieldMgrMeta.vm3Type);


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

