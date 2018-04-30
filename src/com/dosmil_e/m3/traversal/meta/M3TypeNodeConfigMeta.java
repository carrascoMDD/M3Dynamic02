package com.dosmil_e.m3.traversal.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3TypeNodeConfigMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelMetaType;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelNodeConfig;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("TypeNodeConfig"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, true);





		vm3RelMetaType = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("metaType"));
		vm3Type.addRelationships( theCtxt, vm3RelMetaType);
		vm3RelMetaType.setKind( theCtxt, "References");
		vm3RelMetaType.setMinMult( theCtxt, "1");
		vm3RelMetaType.setMaxMult( theCtxt, "1");
		vm3RelMetaType.setIsDerived( theCtxt, false);
		vm3RelMetaType.setIsDummy( theCtxt, false);

		vm3RelNodeConfig = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("nodeConfig"));
		vm3Type.addRelationships( theCtxt, vm3RelNodeConfig);
		vm3RelNodeConfig.setKind( theCtxt, "References");
		vm3RelNodeConfig.setMinMult( theCtxt, "1");
		vm3RelNodeConfig.setMaxMult( theCtxt, "1");
		vm3RelNodeConfig.setIsDerived( theCtxt, false);
		vm3RelNodeConfig.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.m3.traversal.meta.M3ConfigOverrideMeta.vm3Type);




		vm3RelMetaType.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelInverse1OFmetaType);
		vm3RelMetaType.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);

		vm3RelNodeConfig.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3RelInverseOFnodeConfig);
		vm3RelNodeConfig.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3Type);


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

