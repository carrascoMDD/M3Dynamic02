package com.dosmil_e.m3.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;


public class M3Dynamic02 {


/****************************************************************************
 *  Static metainformation for all the metamodel elements in the M3 model
 ****************************************************************************/
  protected static com.dosmil_e.m3.core.ifc.M3ModelIfc vm3Model;


/****************************************************************************
 *  Static metainformation for the root module in the M3 model
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3RootModule;

  
/****************************************************************************
 *  Static metainformation for all the modules in the M3 model
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleM3Dynamic02Core;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleCom;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleDosmil_e;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleM3;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleM3Dynamic02Projection;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleM3Dynamic02Replication;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleM3Dynamic02Traversal;





/****************************************************************************
 *  Access and initialization of metainformation for all the metamodel elements
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3ModelIfc getM3Model( EAIMMCtxtIfc theCtxt) {
    if( vm3Model != null) { return vm3Model;}
    initM3( theCtxt);
    return vm3Model;
  }



/****************************************************************************
 *  Initialization of metainformation for all the metamodel elements
 *    Invokes metainfo initializers (phase1, phase2) on all the metamodel elements
 ****************************************************************************/
  public static void initM3(  EAIMMCtxtIfc theCtxt) {
   try {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        theCtxt.getFlatTrxMgr().setMustPropagateChanges( false);
        initM3Internal( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
   } catch( EAIException anEx) {}
  }




  protected static void initM3Internal(  EAIMMCtxtIfc theCtxt) {
   try {
		 vm3Model = (com.dosmil_e.m3.core.ifc.M3ModelIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Model", "core",new EAIMMName("M3Dynamic02"));
		 vm3Model.setTypePrefix( theCtxt, "M3");
		 vm3Model.setRelationshipVariablePrefix( theCtxt, "vr");
		 vm3Model.setAttributeVariablePrefix( theCtxt, "va");
		 vm3Model.setEnumVariablePrefix( theCtxt, "");
		 vm3Model.setMetaVariablePrefix( theCtxt, "vm3");
		 vm3Model.setMetaPackageName( theCtxt, "com.dosmil_e.m3.core");
		 vm3Model.setFrameworkPackageName( theCtxt, "com.dosmil_e.modelbase");
		 vm3Model.setFromSpecificationFileNamed( theCtxt, "Q:\\BXS\\EAI\\Studio\\EAIModelBase01\\docs\\M302.cdl");
		 vm3Model.setPackageName( theCtxt, "com.dosmil_e.m3");
		 vm3Model.setTemplatesDirectoryName( theCtxt, "Q:\\BXS\\EAI\\Studio\\EAIModelBase01\\templates");
		 vm3Model.setProjectName( theCtxt, "M3Dynamic02Gen.jpr");
		 vm3Model.setProjectDirectoryName( theCtxt, "Q:\\BXS\\EAI\\Studio\\M3Dynamic02\\");
		 vm3Model.setOutputDirectoryName( theCtxt, "Q:\\BXS\\EAI\\Studio\\M3Dynamic02\\mySrc");
		 vm3Model.setSerialVersionUIDPrefix( theCtxt, "12341234563");
		 vm3Model.setSkipTypes( theCtxt,  new String[] { "MMElement" } );
		 vm3Model.setSkipModules( theCtxt,  new String[] {  } );
		 vm3Model.setDefaultSuperTypeFullBaseClassName( theCtxt, "com.dosmil_e.m3.withm3.base.MMElementWithM3Base");
		 vm3Model.setDefaultSuperTypeFullIfcClassName( theCtxt, "com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc");
		 vm3Model.setDefaultSuperTypeFullPrivClassName( theCtxt, "com.dosmil_e.m3.withm3.priv.MMElementWithM3Priv");
		 vm3Model.setDefaultSuperTypeFullPubClassName( theCtxt, "com.dosmil_e.m3.withm3.pub.MMElementWithM3Pub");
		 vm3Model.setDefaultSuperTypeFullTrxClassName( theCtxt, "com.dosmil_e.m3.withm3.trx.MMElementWithM3Trx");




		com.dosmil_e.m3.traversal.meta.M3RootTypeNodeConfigMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3TypeNodeConfigMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3RelatedTypeNodeConfigMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3ConfigOverrideMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3NodeMgrMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3BranchMgrMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3FieldMgrMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3CopyFieldMgrMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3FilterMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.m3.replication.meta.M3ReplicateBranchMgrMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.replication.meta.M3ReplicateNodeMgrMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.m3.core.meta.M3ModelMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.core.meta.M3ModuleMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.core.meta.M3TypeMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.core.meta.M3RelationshipMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.core.meta.M3StructuralFeatureMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.core.meta.M3AttributeMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.core.meta.M3ParameterMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.core.meta.M3CommentMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.m3.core.meta.M3ElementMeta.initM3TypePhase1( theCtxt);






		com.dosmil_e.m3.traversal.meta.M3RootTypeNodeConfigMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3TypeNodeConfigMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3RelatedTypeNodeConfigMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3ConfigOverrideMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3NodeMgrMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3BranchMgrMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3FieldMgrMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3CopyFieldMgrMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.traversal.meta.M3FilterMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.m3.replication.meta.M3ReplicateBranchMgrMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.replication.meta.M3ReplicateNodeMgrMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.m3.core.meta.M3ModelMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.core.meta.M3ModuleMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.core.meta.M3TypeMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.core.meta.M3RelationshipMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.core.meta.M3StructuralFeatureMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.core.meta.M3AttributeMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.core.meta.M3ParameterMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.core.meta.M3CommentMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.m3.core.meta.M3ElementMeta.initM3TypePhase2( theCtxt);







		vm3ModuleCom = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("com"));
		vm3RootModule = vm3ModuleCom;
		vm3Model.addSubModules( theCtxt, vm3ModuleCom);
		vm3ModuleDosmil_e = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("dosmil_e"));
		vm3ModuleCom.addSubModules( theCtxt, vm3ModuleDosmil_e);
		vm3ModuleM3 = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("m3"));
		vm3ModuleDosmil_e.addSubModules( theCtxt, vm3ModuleM3);


		vm3ModuleM3Dynamic02Traversal = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("traversal"));
		vm3ModuleM3.addSubModules( theCtxt, vm3ModuleM3Dynamic02Traversal);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3RootTypeNodeConfigMeta.vm3Type);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3Type);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.vm3Type);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3TypeNodeConfigMeta.vm3Type);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3RelatedTypeNodeConfigMeta.vm3Type);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3Type);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.vm3Type);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3ConfigOverrideMeta.vm3Type);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3NodeMgrMeta.vm3Type);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3BranchMgrMeta.vm3Type);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3FieldMgrMeta.vm3Type);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3CopyFieldMgrMeta.vm3Type);
		vm3ModuleM3Dynamic02Traversal.addTypes( theCtxt,com.dosmil_e.m3.traversal.meta.M3FilterMeta.vm3Type);


		vm3ModuleM3Dynamic02Projection = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("projection"));
		vm3ModuleM3.addSubModules( theCtxt, vm3ModuleM3Dynamic02Projection);
		vm3ModuleM3Dynamic02Projection.addTypes( theCtxt,com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.vm3Type);


		vm3ModuleM3Dynamic02Replication = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("replication"));
		vm3ModuleM3.addSubModules( theCtxt, vm3ModuleM3Dynamic02Replication);
		vm3ModuleM3Dynamic02Replication.addTypes( theCtxt,com.dosmil_e.m3.replication.meta.M3ReplicateBranchMgrMeta.vm3Type);
		vm3ModuleM3Dynamic02Replication.addTypes( theCtxt,com.dosmil_e.m3.replication.meta.M3ReplicateNodeMgrMeta.vm3Type);


		vm3ModuleM3Dynamic02Core = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("core"));
		vm3ModuleM3.addSubModules( theCtxt, vm3ModuleM3Dynamic02Core);
		vm3ModuleM3Dynamic02Core.addTypes( theCtxt,com.dosmil_e.m3.core.meta.M3ModelMeta.vm3Type);
		vm3ModuleM3Dynamic02Core.addTypes( theCtxt,com.dosmil_e.m3.core.meta.M3ModuleMeta.vm3Type);
		vm3ModuleM3Dynamic02Core.addTypes( theCtxt,com.dosmil_e.m3.core.meta.M3TypeMeta.vm3Type);
		vm3ModuleM3Dynamic02Core.addTypes( theCtxt,com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3Type);
		vm3ModuleM3Dynamic02Core.addTypes( theCtxt,com.dosmil_e.m3.core.meta.M3StructuralFeatureMeta.vm3Type);
		vm3ModuleM3Dynamic02Core.addTypes( theCtxt,com.dosmil_e.m3.core.meta.M3AttributeMeta.vm3Type);
		vm3ModuleM3Dynamic02Core.addTypes( theCtxt,com.dosmil_e.m3.core.meta.M3ParameterMeta.vm3Type);
		vm3ModuleM3Dynamic02Core.addTypes( theCtxt,com.dosmil_e.m3.core.meta.M3CommentMeta.vm3Type);
		vm3ModuleM3Dynamic02Core.addTypes( theCtxt,com.dosmil_e.m3.core.meta.M3ElementMeta.vm3Type);





		com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = 
			new com.dosmil_e.m3.meta.M3TraversalConfig( theCtxt, 
			new EAIMMName( com.dosmil_e.m3.meta.M3TraversalConfig.gTraversalConfigName), vm3Model);
		vm3Model.addTraversalConfigs( theCtxt, aTraversalConfig);

		com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aReplicationConfig = 
			new com.dosmil_e.m3.meta.M3ReplicationConfig( theCtxt, 
			new EAIMMName( com.dosmil_e.m3.meta.M3ReplicationConfig.gTraversalConfigName), vm3Model);
		vm3Model.addTraversalConfigs( theCtxt, aReplicationConfig);



   } catch( EAIException anEx) {}
  }



}
