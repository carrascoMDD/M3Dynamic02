package com.dosmil_e.m3.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3ModuleMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSuperModule;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSubModules;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTypes;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Module"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);





		vm3RelSuperModule = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("superModule"));
		vm3Type.addRelationships( theCtxt, vm3RelSuperModule);
		vm3RelSuperModule.setKind( theCtxt, "IsPartOf");
		vm3RelSuperModule.setMinMult( theCtxt, "0");
		vm3RelSuperModule.setMaxMult( theCtxt, "1");
		vm3RelSuperModule.setIsDerived( theCtxt, false);
		vm3RelSuperModule.setIsDummy( theCtxt, false);

		vm3RelSubModules = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("subModules"));
		vm3Type.addRelationships( theCtxt, vm3RelSubModules);
		vm3RelSubModules.setKind( theCtxt, "Aggregates");
		vm3RelSubModules.setMinMult( theCtxt, "0");
		vm3RelSubModules.setMaxMult( theCtxt, "*");
		vm3RelSubModules.setIsDerived( theCtxt, false);
		vm3RelSubModules.setIsDummy( theCtxt, false);

		vm3RelTypes = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("types"));
		vm3Type.addRelationships( theCtxt, vm3RelTypes);
		vm3RelTypes.setKind( theCtxt, "Aggregates");
		vm3RelTypes.setMinMult( theCtxt, "0");
		vm3RelTypes.setMaxMult( theCtxt, "*");
		vm3RelTypes.setIsDerived( theCtxt, false);
		vm3RelTypes.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.m3.core.meta.M3ElementMeta.vm3Type);




		vm3RelSuperModule.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3ModuleMeta.vm3RelSubModules);
		vm3RelSuperModule.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3ModuleMeta.vm3Type);

		vm3RelSubModules.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3ModuleMeta.vm3RelSuperModule);
		vm3RelSubModules.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3ModuleMeta.vm3Type);

		vm3RelTypes.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelModule);
		vm3RelTypes.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);


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

