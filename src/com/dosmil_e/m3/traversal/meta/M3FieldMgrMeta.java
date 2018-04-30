package com.dosmil_e.m3.traversal.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3FieldMgrMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFmetaFieldMgr;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTraversalConfig;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("FieldMgr"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);





		vm3RelInverseOFmetaFieldMgr = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFmetaFieldMgr"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFmetaFieldMgr);
		vm3RelInverseOFmetaFieldMgr.setKind( theCtxt, "Many");
		vm3RelInverseOFmetaFieldMgr.setMinMult( theCtxt, "0");
		vm3RelInverseOFmetaFieldMgr.setMaxMult( theCtxt, "*");
		vm3RelInverseOFmetaFieldMgr.setIsDerived( theCtxt, false);
		vm3RelInverseOFmetaFieldMgr.setIsDummy( theCtxt, true);

		vm3RelTraversalConfig = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("traversalConfig"));
		vm3Type.addRelationships( theCtxt, vm3RelTraversalConfig);
		vm3RelTraversalConfig.setKind( theCtxt, "IsPartOf");
		vm3RelTraversalConfig.setMinMult( theCtxt, "1");
		vm3RelTraversalConfig.setMaxMult( theCtxt, "1");
		vm3RelTraversalConfig.setIsDerived( theCtxt, false);
		vm3RelTraversalConfig.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {




		vm3RelInverseOFmetaFieldMgr.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.vm3RelMetaFieldMgr);
		vm3RelInverseOFmetaFieldMgr.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.vm3Type);

		vm3RelTraversalConfig.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3RelFieldMgrs);
		vm3RelTraversalConfig.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3Type);


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

