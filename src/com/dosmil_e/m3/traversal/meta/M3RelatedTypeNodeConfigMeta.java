package com.dosmil_e.m3.traversal.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3RelatedTypeNodeConfigMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelBranchConfig;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelFilter;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("RelatedTypeNodeConfig"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);





		vm3RelBranchConfig = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("branchConfig"));
		vm3Type.addRelationships( theCtxt, vm3RelBranchConfig);
		vm3RelBranchConfig.setKind( theCtxt, "IsPartOf");
		vm3RelBranchConfig.setMinMult( theCtxt, "1");
		vm3RelBranchConfig.setMaxMult( theCtxt, "1");
		vm3RelBranchConfig.setIsDerived( theCtxt, false);
		vm3RelBranchConfig.setIsDummy( theCtxt, false);

		vm3RelFilter = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("filter"));
		vm3Type.addRelationships( theCtxt, vm3RelFilter);
		vm3RelFilter.setKind( theCtxt, "Aggregates");
		vm3RelFilter.setMinMult( theCtxt, "0");
		vm3RelFilter.setMaxMult( theCtxt, "1");
		vm3RelFilter.setIsDerived( theCtxt, false);
		vm3RelFilter.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.m3.traversal.meta.M3TypeNodeConfigMeta.vm3Type);




		vm3RelBranchConfig.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.vm3RelTypeNodeConfigs);
		vm3RelBranchConfig.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.vm3Type);

		vm3RelFilter.setInverse( theCtxt, com.dosmil_e.m3.traversal.meta.M3FilterMeta.vm3RelRelatedTypeNodeConfig);
		vm3RelFilter.setRelatedType( theCtxt, com.dosmil_e.m3.traversal.meta.M3FilterMeta.vm3Type);


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

