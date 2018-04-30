package com.dosmil_e.m3.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class M3ElementMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelParameters;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelComments;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Element"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);





		vm3RelParameters = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("parameters"));
		vm3Type.addRelationships( theCtxt, vm3RelParameters);
		vm3RelParameters.setKind( theCtxt, "Aggregates");
		vm3RelParameters.setMinMult( theCtxt, "0");
		vm3RelParameters.setMaxMult( theCtxt, "*");
		vm3RelParameters.setIsDerived( theCtxt, false);
		vm3RelParameters.setIsDummy( theCtxt, false);

		vm3RelComments = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("comments"));
		vm3Type.addRelationships( theCtxt, vm3RelComments);
		vm3RelComments.setKind( theCtxt, "Aggregates");
		vm3RelComments.setMinMult( theCtxt, "0");
		vm3RelComments.setMaxMult( theCtxt, "*");
		vm3RelComments.setIsDerived( theCtxt, false);
		vm3RelComments.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {




		vm3RelParameters.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3ParameterMeta.vm3RelElement);
		vm3RelParameters.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3ParameterMeta.vm3Type);

		vm3RelComments.setInverse( theCtxt, com.dosmil_e.m3.core.meta.M3CommentMeta.vm3RelElement);
		vm3RelComments.setRelatedType( theCtxt, com.dosmil_e.m3.core.meta.M3CommentMeta.vm3Type);


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

