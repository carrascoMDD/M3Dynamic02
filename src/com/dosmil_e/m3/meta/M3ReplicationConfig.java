package com.dosmil_e.m3.meta;

// WholeReplicationConfig Dynamic

import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;
import com.dosmil_e.modelbase.support.EAIMMName;
import com.dosmil_e.modelbase.support.EAIMMNameIfc;
import com.dosmil_e.modelbase.support.EAIException;

import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.m3.traversal.ifc.*;
import com.dosmil_e.m3.replication.ifc.*;


import java.util.Hashtable;


public class M3ReplicationConfig extends com.dosmil_e.m3.traversal.impl.M3TraversalConfigImpl {


  /*******************************************************
   *  Static members holding Configs and Managers
   *******************************************************/

  /*******************************************************
   *  Root node configs declarations
   *******************************************************/
	public M3RootTypeNodeConfigIfc aRootTypeNodeConfigRTNC;
	public M3RootTypeNodeConfigIfc aNodeConfigRTNC;
	public M3RootTypeNodeConfigIfc aBranchConfigRTNC;
	public M3RootTypeNodeConfigIfc aRelatedTypeNodeConfigRTNC;
	public M3RootTypeNodeConfigIfc aTraversalConfigRTNC;
	public M3RootTypeNodeConfigIfc aAttributeConfigRTNC;
	public M3RootTypeNodeConfigIfc aNodeMgrRTNC;
	public M3RootTypeNodeConfigIfc aBranchMgrRTNC;
	public M3RootTypeNodeConfigIfc aFieldMgrRTNC;
	public M3RootTypeNodeConfigIfc aCopyFieldMgrRTNC;
	public M3RootTypeNodeConfigIfc aFilterRTNC;
	public M3RootTypeNodeConfigIfc aProjectionConfigRTNC;
	public M3RootTypeNodeConfigIfc aReplicateBranchMgrRTNC;
	public M3RootTypeNodeConfigIfc aReplicateNodeMgrRTNC;
	public M3RootTypeNodeConfigIfc aModelRTNC;
	public M3RootTypeNodeConfigIfc aModuleRTNC;
	public M3RootTypeNodeConfigIfc aTypeRTNC;
	public M3RootTypeNodeConfigIfc aRelationshipRTNC;
	public M3RootTypeNodeConfigIfc aStructuralFeatureRTNC;
	public M3RootTypeNodeConfigIfc aAttributeRTNC;
	public M3RootTypeNodeConfigIfc aParameterRTNC;
	public M3RootTypeNodeConfigIfc aCommentRTNC;
	public M3RootTypeNodeConfigIfc aElementRTNC;


  /*******************************************************
   *  Node configs declarations
   *******************************************************/
	public M3NodeConfigIfc aRootTypeNodeConfigNC, aRootTypeNodeConfigNCTerm;
	public M3NodeConfigIfc aNodeConfigNC, aNodeConfigNCTerm;
	public M3NodeConfigIfc aBranchConfigNC, aBranchConfigNCTerm;
	public M3NodeConfigIfc aRelatedTypeNodeConfigNC, aRelatedTypeNodeConfigNCTerm;
	public M3NodeConfigIfc aTraversalConfigNC, aTraversalConfigNCTerm;
	public M3NodeConfigIfc aAttributeConfigNC, aAttributeConfigNCTerm;
	public M3NodeConfigIfc aNodeMgrNC, aNodeMgrNCTerm;
	public M3NodeConfigIfc aBranchMgrNC, aBranchMgrNCTerm;
	public M3NodeConfigIfc aFieldMgrNC, aFieldMgrNCTerm;
	public M3NodeConfigIfc aCopyFieldMgrNC, aCopyFieldMgrNCTerm;
	public M3NodeConfigIfc aFilterNC, aFilterNCTerm;
	public M3NodeConfigIfc aProjectionConfigNC, aProjectionConfigNCTerm;
	public M3NodeConfigIfc aReplicateBranchMgrNC, aReplicateBranchMgrNCTerm;
	public M3NodeConfigIfc aReplicateNodeMgrNC, aReplicateNodeMgrNCTerm;
	public M3NodeConfigIfc aModelNC, aModelNCTerm;
	public M3NodeConfigIfc aModuleNC, aModuleNCTerm;
	public M3NodeConfigIfc aTypeNC, aTypeNCTerm;
	public M3NodeConfigIfc aRelationshipNC, aRelationshipNCTerm;
	public M3NodeConfigIfc aStructuralFeatureNC, aStructuralFeatureNCTerm;
	public M3NodeConfigIfc aAttributeNC, aAttributeNCTerm;
	public M3NodeConfigIfc aParameterNC, aParameterNCTerm;
	public M3NodeConfigIfc aCommentNC, aCommentNCTerm;
	public M3NodeConfigIfc aElementNC, aElementNCTerm;


  /*******************************************************
   *  Node mgrs declarations
   *******************************************************/
	public M3ReplicateNodeMgrIfc aRootTypeNodeConfigNMgr;
	public M3ReplicateNodeMgrIfc aNodeConfigNMgr;
	public M3ReplicateNodeMgrIfc aBranchConfigNMgr;
	public M3ReplicateNodeMgrIfc aRelatedTypeNodeConfigNMgr;
	public M3ReplicateNodeMgrIfc aTraversalConfigNMgr;
	public M3ReplicateNodeMgrIfc aAttributeConfigNMgr;
	public M3ReplicateNodeMgrIfc aNodeMgrNMgr;
	public M3ReplicateNodeMgrIfc aBranchMgrNMgr;
	public M3ReplicateNodeMgrIfc aFieldMgrNMgr;
	public M3ReplicateNodeMgrIfc aCopyFieldMgrNMgr;
	public M3ReplicateNodeMgrIfc aFilterNMgr;
	public M3ReplicateNodeMgrIfc aProjectionConfigNMgr;
	public M3ReplicateNodeMgrIfc aReplicateBranchMgrNMgr;
	public M3ReplicateNodeMgrIfc aReplicateNodeMgrNMgr;
	public M3ReplicateNodeMgrIfc aModelNMgr;
	public M3ReplicateNodeMgrIfc aModuleNMgr;
	public M3ReplicateNodeMgrIfc aTypeNMgr;
	public M3ReplicateNodeMgrIfc aRelationshipNMgr;
	public M3ReplicateNodeMgrIfc aStructuralFeatureNMgr;
	public M3ReplicateNodeMgrIfc aAttributeNMgr;
	public M3ReplicateNodeMgrIfc aParameterNMgr;
	public M3ReplicateNodeMgrIfc aCommentNMgr;
	public M3ReplicateNodeMgrIfc aElementNMgr;


  /*******************************************************
   *  Branch configs declarations
   *******************************************************/
	public M3BranchConfigIfc aNodeConfig_branchConfigsBC;
	public M3BranchConfigIfc aNodeConfig_attributeConfigsBC;
	public M3BranchConfigIfc aNodeConfig_metaTypeBC;
	public M3BranchConfigIfc aNodeConfig_metaNodeMgrBC;
	public M3BranchConfigIfc aNodeConfig_inverseOFnodeConfigBC;
	public M3BranchConfigIfc aBranchConfig_inverseOFbranchConfigsBC;
	public M3BranchConfigIfc aBranchConfig_metaRelationshipBC;
	public M3BranchConfigIfc aBranchConfig_typeNodeConfigsBC;
	public M3BranchConfigIfc aBranchConfig_metaBranchMgrBC;
	public M3BranchConfigIfc aTypeNodeConfig_metaTypeBC;
	public M3BranchConfigIfc aTypeNodeConfig_nodeConfigBC;
	public M3BranchConfigIfc aRelatedTypeNodeConfig_filterBC;
	public M3BranchConfigIfc aTraversalConfig_rootTypeNodeConfigsBC;
	public M3BranchConfigIfc aTraversalConfig_branchConfigsBC;
	public M3BranchConfigIfc aTraversalConfig_nodeConfigsBC;
	public M3BranchConfigIfc aTraversalConfig_attributeConfigsBC;
	public M3BranchConfigIfc aTraversalConfig_configOverridesBC;
	public M3BranchConfigIfc aTraversalConfig_fieldMgrsBC;
	public M3BranchConfigIfc aTraversalConfig_branchMgrsBC;
	public M3BranchConfigIfc aTraversalConfig_nodeMgrsBC;
	public M3BranchConfigIfc aAttributeConfig_inverseOFattributeConfigsBC;
	public M3BranchConfigIfc aAttributeConfig_metaAttributeBC;
	public M3BranchConfigIfc aAttributeConfig_metaFieldMgrBC;
	public M3BranchConfigIfc aConfigOverride_overrideWithBC;
	public M3BranchConfigIfc aNodeMgr_inverseOFmetaNodeMgrBC;
	public M3BranchConfigIfc aBranchMgr_inverseOFmetaBranchMgrBC;
	public M3BranchConfigIfc aFieldMgr_inverseOFmetaFieldMgrBC;
	public M3BranchConfigIfc aCopyFieldMgr_copiedMetaAttributeBC;
	public M3BranchConfigIfc aProjectionConfig_targetToTransfomationsBC;
	public M3BranchConfigIfc aProjectionConfig_projectionToOriginalsBC;
	public M3BranchConfigIfc aProjectionConfig_projectedToProjectionsBC;
	public M3BranchConfigIfc aProjectionConfig_transformationToSourcesBC;
	public M3BranchConfigIfc aProjectionConfig_transformationToSubTransformationsBC;
	public M3BranchConfigIfc aProjectionConfig_projectionTypeBC;
	public M3BranchConfigIfc aProjectionConfig_exclusionTypeBC;
	public M3BranchConfigIfc aProjectionConfig_excludedInRelationshipNamedBC;
	public M3BranchConfigIfc aReplicateBranchMgr_replicatedMetaRelationshipBC;
	public M3BranchConfigIfc aReplicateNodeMgr_replicatedMetaTypeBC;
	public M3BranchConfigIfc aModel_treeRootTypeBC;
	public M3BranchConfigIfc aModel_traversalConfigsBC;
	public M3BranchConfigIfc aModule_subModulesBC;
	public M3BranchConfigIfc aModule_typesBC;
	public M3BranchConfigIfc aType_inverseOFmetaTypeBC;
	public M3BranchConfigIfc aType_inverse1OFmetaTypeBC;
	public M3BranchConfigIfc aType_inverseOFreplicatedMetaTypeBC;
	public M3BranchConfigIfc aType_inverseOFprojectionTypeBC;
	public M3BranchConfigIfc aType_inverseOFexclusionTypeBC;
	public M3BranchConfigIfc aType_attributesBC;
	public M3BranchConfigIfc aType_typeOfValuesBC;
	public M3BranchConfigIfc aType_superTypesBC;
	public M3BranchConfigIfc aType_subTypesBC;
	public M3BranchConfigIfc aType_relationshipsBC;
	public M3BranchConfigIfc aType_relatedWithBC;
	public M3BranchConfigIfc aType_rootTypeOfModelBC;
	public M3BranchConfigIfc aRelationship_inverseOFmetaRelationshipBC;
	public M3BranchConfigIfc aRelationship_inverseOFreplicatedMetaRelationshipBC;
	public M3BranchConfigIfc aRelationship_inverseOFtargetToTransfomationsBC;
	public M3BranchConfigIfc aRelationship_inverseOFprojectionToOriginalsBC;
	public M3BranchConfigIfc aRelationship_inverseOFprojectedToProjectionsBC;
	public M3BranchConfigIfc aRelationship_inverseOFtransformationToSourcesBC;
	public M3BranchConfigIfc aRelationship_inverseOFtransformationToSubTransformationsBC;
	public M3BranchConfigIfc aRelationship_inverseBC;
	public M3BranchConfigIfc aRelationship_relatedTypeBC;
	public M3BranchConfigIfc aAttribute_inverseOFmetaAttributeBC;
	public M3BranchConfigIfc aAttribute_inverseOFcopiedMetaAttributeBC;
	public M3BranchConfigIfc aAttribute_inverseOFexcludedInRelationshipNamedBC;
	public M3BranchConfigIfc aAttribute_valueTypeBC;
	public M3BranchConfigIfc aElement_parametersBC;
	public M3BranchConfigIfc aElement_commentsBC;


  /*******************************************************
   *  Branch mgrs declarations
   *******************************************************/
	public M3ReplicateBranchMgrIfc aNodeConfig_branchConfigsBMgr;
	public M3ReplicateBranchMgrIfc aNodeConfig_attributeConfigsBMgr;
	public M3ReplicateBranchMgrIfc aNodeConfig_metaTypeBMgr;
	public M3ReplicateBranchMgrIfc aNodeConfig_metaNodeMgrBMgr;
	public M3ReplicateBranchMgrIfc aNodeConfig_inverseOFnodeConfigBMgr;
	public M3ReplicateBranchMgrIfc aBranchConfig_inverseOFbranchConfigsBMgr;
	public M3ReplicateBranchMgrIfc aBranchConfig_metaRelationshipBMgr;
	public M3ReplicateBranchMgrIfc aBranchConfig_typeNodeConfigsBMgr;
	public M3ReplicateBranchMgrIfc aBranchConfig_metaBranchMgrBMgr;
	public M3ReplicateBranchMgrIfc aTypeNodeConfig_metaTypeBMgr;
	public M3ReplicateBranchMgrIfc aTypeNodeConfig_nodeConfigBMgr;
	public M3ReplicateBranchMgrIfc aRelatedTypeNodeConfig_filterBMgr;
	public M3ReplicateBranchMgrIfc aTraversalConfig_rootTypeNodeConfigsBMgr;
	public M3ReplicateBranchMgrIfc aTraversalConfig_branchConfigsBMgr;
	public M3ReplicateBranchMgrIfc aTraversalConfig_nodeConfigsBMgr;
	public M3ReplicateBranchMgrIfc aTraversalConfig_attributeConfigsBMgr;
	public M3ReplicateBranchMgrIfc aTraversalConfig_configOverridesBMgr;
	public M3ReplicateBranchMgrIfc aTraversalConfig_fieldMgrsBMgr;
	public M3ReplicateBranchMgrIfc aTraversalConfig_branchMgrsBMgr;
	public M3ReplicateBranchMgrIfc aTraversalConfig_nodeMgrsBMgr;
	public M3ReplicateBranchMgrIfc aAttributeConfig_inverseOFattributeConfigsBMgr;
	public M3ReplicateBranchMgrIfc aAttributeConfig_metaAttributeBMgr;
	public M3ReplicateBranchMgrIfc aAttributeConfig_metaFieldMgrBMgr;
	public M3ReplicateBranchMgrIfc aConfigOverride_overrideWithBMgr;
	public M3ReplicateBranchMgrIfc aNodeMgr_inverseOFmetaNodeMgrBMgr;
	public M3ReplicateBranchMgrIfc aBranchMgr_inverseOFmetaBranchMgrBMgr;
	public M3ReplicateBranchMgrIfc aFieldMgr_inverseOFmetaFieldMgrBMgr;
	public M3ReplicateBranchMgrIfc aCopyFieldMgr_copiedMetaAttributeBMgr;
	public M3ReplicateBranchMgrIfc aProjectionConfig_targetToTransfomationsBMgr;
	public M3ReplicateBranchMgrIfc aProjectionConfig_projectionToOriginalsBMgr;
	public M3ReplicateBranchMgrIfc aProjectionConfig_projectedToProjectionsBMgr;
	public M3ReplicateBranchMgrIfc aProjectionConfig_transformationToSourcesBMgr;
	public M3ReplicateBranchMgrIfc aProjectionConfig_transformationToSubTransformationsBMgr;
	public M3ReplicateBranchMgrIfc aProjectionConfig_projectionTypeBMgr;
	public M3ReplicateBranchMgrIfc aProjectionConfig_exclusionTypeBMgr;
	public M3ReplicateBranchMgrIfc aProjectionConfig_excludedInRelationshipNamedBMgr;
	public M3ReplicateBranchMgrIfc aReplicateBranchMgr_replicatedMetaRelationshipBMgr;
	public M3ReplicateBranchMgrIfc aReplicateNodeMgr_replicatedMetaTypeBMgr;
	public M3ReplicateBranchMgrIfc aModel_treeRootTypeBMgr;
	public M3ReplicateBranchMgrIfc aModel_traversalConfigsBMgr;
	public M3ReplicateBranchMgrIfc aModule_subModulesBMgr;
	public M3ReplicateBranchMgrIfc aModule_typesBMgr;
	public M3ReplicateBranchMgrIfc aType_inverseOFmetaTypeBMgr;
	public M3ReplicateBranchMgrIfc aType_inverse1OFmetaTypeBMgr;
	public M3ReplicateBranchMgrIfc aType_inverseOFreplicatedMetaTypeBMgr;
	public M3ReplicateBranchMgrIfc aType_inverseOFprojectionTypeBMgr;
	public M3ReplicateBranchMgrIfc aType_inverseOFexclusionTypeBMgr;
	public M3ReplicateBranchMgrIfc aType_attributesBMgr;
	public M3ReplicateBranchMgrIfc aType_typeOfValuesBMgr;
	public M3ReplicateBranchMgrIfc aType_superTypesBMgr;
	public M3ReplicateBranchMgrIfc aType_subTypesBMgr;
	public M3ReplicateBranchMgrIfc aType_relationshipsBMgr;
	public M3ReplicateBranchMgrIfc aType_relatedWithBMgr;
	public M3ReplicateBranchMgrIfc aType_rootTypeOfModelBMgr;
	public M3ReplicateBranchMgrIfc aRelationship_inverseOFmetaRelationshipBMgr;
	public M3ReplicateBranchMgrIfc aRelationship_inverseOFreplicatedMetaRelationshipBMgr;
	public M3ReplicateBranchMgrIfc aRelationship_inverseOFtargetToTransfomationsBMgr;
	public M3ReplicateBranchMgrIfc aRelationship_inverseOFprojectionToOriginalsBMgr;
	public M3ReplicateBranchMgrIfc aRelationship_inverseOFprojectedToProjectionsBMgr;
	public M3ReplicateBranchMgrIfc aRelationship_inverseOFtransformationToSourcesBMgr;
	public M3ReplicateBranchMgrIfc aRelationship_inverseOFtransformationToSubTransformationsBMgr;
	public M3ReplicateBranchMgrIfc aRelationship_inverseBMgr;
	public M3ReplicateBranchMgrIfc aRelationship_relatedTypeBMgr;
	public M3ReplicateBranchMgrIfc aAttribute_inverseOFmetaAttributeBMgr;
	public M3ReplicateBranchMgrIfc aAttribute_inverseOFcopiedMetaAttributeBMgr;
	public M3ReplicateBranchMgrIfc aAttribute_inverseOFexcludedInRelationshipNamedBMgr;
	public M3ReplicateBranchMgrIfc aAttribute_valueTypeBMgr;
	public M3ReplicateBranchMgrIfc aElement_parametersBMgr;
	public M3ReplicateBranchMgrIfc aElement_commentsBMgr;


  /*******************************************************
   *  Related type node configs declarations
   *******************************************************/
	public M3RelatedTypeNodeConfigIfc aNodeConfig_branchConfigs_BranchConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aNodeConfig_attributeConfigs_AttributeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aNodeConfig_metaType_TypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aNodeConfig_metaNodeMgr_NodeMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aNodeConfig_metaNodeMgr_ReplicateNodeMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aNodeConfig_inverseOFnodeConfig_RootTypeNodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aNodeConfig_inverseOFnodeConfig_RelatedTypeNodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aBranchConfig_inverseOFbranchConfigs_NodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aBranchConfig_metaRelationship_RelationshipRelTNC;
	public M3RelatedTypeNodeConfigIfc aBranchConfig_typeNodeConfigs_RelatedTypeNodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aBranchConfig_metaBranchMgr_BranchMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aBranchConfig_metaBranchMgr_ReplicateBranchMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aTypeNodeConfig_metaType_TypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aTypeNodeConfig_nodeConfig_NodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aRelatedTypeNodeConfig_filter_FilterRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_rootTypeNodeConfigs_RootTypeNodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_branchConfigs_BranchConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_nodeConfigs_NodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_attributeConfigs_AttributeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_configOverrides_BranchConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_configOverrides_NodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_configOverrides_RootTypeNodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_configOverrides_RelatedTypeNodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_fieldMgrs_FieldMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_fieldMgrs_CopyFieldMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_branchMgrs_BranchMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_branchMgrs_ReplicateBranchMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_nodeMgrs_NodeMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aTraversalConfig_nodeMgrs_ReplicateNodeMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aAttributeConfig_inverseOFattributeConfigs_NodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aAttributeConfig_metaAttribute_AttributeRelTNC;
	public M3RelatedTypeNodeConfigIfc aAttributeConfig_metaFieldMgr_FieldMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aAttributeConfig_metaFieldMgr_CopyFieldMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aConfigOverride_overrideWith_TraversalConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aConfigOverride_overrideWith_ProjectionConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aNodeMgr_inverseOFmetaNodeMgr_NodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aBranchMgr_inverseOFmetaBranchMgr_BranchConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aFieldMgr_inverseOFmetaFieldMgr_AttributeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aCopyFieldMgr_copiedMetaAttribute_AttributeRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjectionConfig_targetToTransfomations_RelationshipRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjectionConfig_projectionToOriginals_RelationshipRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjectionConfig_projectedToProjections_RelationshipRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjectionConfig_transformationToSources_RelationshipRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjectionConfig_transformationToSubTransformations_RelationshipRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjectionConfig_projectionType_TypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjectionConfig_exclusionType_TypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjectionConfig_excludedInRelationshipNamed_AttributeRelTNC;
	public M3RelatedTypeNodeConfigIfc aReplicateBranchMgr_replicatedMetaRelationship_RelationshipRelTNC;
	public M3RelatedTypeNodeConfigIfc aReplicateNodeMgr_replicatedMetaType_TypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aModel_treeRootType_TypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aModel_traversalConfigs_TraversalConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aModel_traversalConfigs_ProjectionConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aModule_subModules_ModuleRelTNC;
	public M3RelatedTypeNodeConfigIfc aModule_subModules_ModelRelTNC;
	public M3RelatedTypeNodeConfigIfc aModule_types_TypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_inverseOFmetaType_NodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_inverse1OFmetaType_RootTypeNodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_inverse1OFmetaType_RelatedTypeNodeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_inverseOFreplicatedMetaType_ReplicateNodeMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_inverseOFprojectionType_ProjectionConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_inverseOFexclusionType_ProjectionConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_attributes_AttributeRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_typeOfValues_AttributeRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_superTypes_TypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_subTypes_TypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_relationships_RelationshipRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_relatedWith_RelationshipRelTNC;
	public M3RelatedTypeNodeConfigIfc aType_rootTypeOfModel_ModelRelTNC;
	public M3RelatedTypeNodeConfigIfc aRelationship_inverseOFmetaRelationship_BranchConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aRelationship_inverseOFreplicatedMetaRelationship_ReplicateBranchMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aRelationship_inverseOFtargetToTransfomations_ProjectionConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aRelationship_inverseOFprojectionToOriginals_ProjectionConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aRelationship_inverseOFprojectedToProjections_ProjectionConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aRelationship_inverseOFtransformationToSources_ProjectionConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aRelationship_inverseOFtransformationToSubTransformations_ProjectionConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aRelationship_inverse_RelationshipRelTNC;
	public M3RelatedTypeNodeConfigIfc aRelationship_relatedType_TypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aAttribute_inverseOFmetaAttribute_AttributeConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aAttribute_inverseOFcopiedMetaAttribute_CopyFieldMgrRelTNC;
	public M3RelatedTypeNodeConfigIfc aAttribute_inverseOFexcludedInRelationshipNamed_ProjectionConfigRelTNC;
	public M3RelatedTypeNodeConfigIfc aAttribute_valueType_TypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aElement_parameters_ParameterRelTNC;
	public M3RelatedTypeNodeConfigIfc aElement_comments_CommentRelTNC;


  /*******************************************************
   *  Attribute configs declarations
   *******************************************************/


  /*******************************************************
   *  Field mgrs declarations
   *******************************************************/



  /*******************************************************
   *  Static singleton config accessor
   *******************************************************/

  public static String gTraversalConfigName = new String("M3ReplicationConfig");


  public static com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getConfig( EAIMMCtxtIfc theCtxt,
    com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {

    if( theCtxt == null) { return null;}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aConfig = null;
    try { aConfig = theM3Model.findTraversalConfigsNamed( theCtxt, new EAIMMName( gTraversalConfigName));} catch( EAIException anEx) {}
    return aConfig;
  }



  /*******************************************************
   *  Constructor for M3ReplicationConfig
   *******************************************************/

  public M3ReplicationConfig(
    EAIMMCtxtIfc                        theCtxt,
    EAIMMNameIfc                        theName,
    com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {

    super( theCtxt, theName);
    initConfig( theCtxt, theM3Model);
  }






/****************************************************************************
 *  Initialization of traversal configuration
 ****************************************************************************/
  public void initConfig(  EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {
   try {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        theCtxt.getFlatTrxMgr().setMustPropagateChanges( false);
        initConfigInternal( theCtxt, theM3Model);
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




  protected void initConfigInternal( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {
    if( theCtxt == null) { return;}


    try {

  /*******************************************************
   *  Root node configs instantiations
   *******************************************************/
    initRootTypeNodeCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Node configs  instantiations
   *******************************************************/
    initNodeCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Node mgrs  instantiations
   *******************************************************/
    initNodeMgrsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Branch configs  instantiations
   *******************************************************/
    initBranchCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Branch mgrs  instantiations
   *******************************************************/
    initBranchMgrsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Related type node configs  instantiations
   *******************************************************/
    initRelatedTypeNodeCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Attribute configs  instantiations
   *******************************************************/
    initAttributeCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Field mgrs  instantiations
   *******************************************************/
    initFieldMgrsInstantiations( theCtxt, theM3Model);


  /*******************************************************
   *  Root node configs
$TraversalRootTypeNodeCfgsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Node configs
   *******************************************************/
    initNodeCfgsInitializations( theCtxt, theM3Model);

  /*******************************************************
   *  Node mgrs
$TraversalNodeMgrsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Branch configs
   *******************************************************/
    initBranchCfgsInitializations( theCtxt, theM3Model);

  /*******************************************************
   *  Branch mgrs
$TraversalBranchMgrsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Related type node configs
$TraversalRelatedTypeNodeCfgsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Attribute configs
$TraversalAttributeCfgsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Field mgrs
$TraversalFieldMgrsStaticInitializations$
    *******************************************************/


  /*******************************************************
   *  Init Replicated NodeMgrs and BranchMgrs with M3 replicated types and rels
    *******************************************************/

    postProcess( theCtxt, theM3Model);


    }
    catch( EAIException anEx) {}
  }



  /*******************************************************
   *  Init Replicated NodeMgrs and BranchMgrs with M3 replicated types and rels
    *******************************************************/
  protected void postProcess( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {

    if( theCtxt == null) { return;}


    try {

  /*******************************************************
   *  Init ReplicatedMetaType of NodeMgrs
    *******************************************************/

    M3NodeConfigIfc[] someNodeConfigs = getNodeConfigs(theCtxt);
    if( someNodeConfigs != null) {
      int aNumNodeConfigs = someNodeConfigs.length;
      for( int anIndex = 0; anIndex < aNumNodeConfigs; anIndex++) {
        M3NodeConfigIfc aNodeConfig = someNodeConfigs[ anIndex];
        if( aNodeConfig != null) {
          com.dosmil_e.m3.core.ifc.M3TypeIfc aType = aNodeConfig.getMetaType( theCtxt);
          if( aType != null) {
            M3NodeMgrIfc aNodeMgr = aNodeConfig.getMetaNodeMgr( theCtxt);
            if( aNodeMgr != null) {
              com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc aReplicateNodeMgr = null;
              try { aReplicateNodeMgr = (com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc) aNodeMgr;} catch( ClassCastException anEx) {}
              if( aReplicateNodeMgr != null) {
                aReplicateNodeMgr.setReplicatedMetaType( theCtxt, aType);
              }
            }
          }
        }
      }
    }


  /*******************************************************
   *  Init ReplicatedMetaRelationship of BranchMgrs
    *******************************************************/


    M3BranchConfigIfc[] someBranchConfigs = getBranchConfigs( theCtxt);
    if( someBranchConfigs != null) {
      int aNumBranchConfigs = someBranchConfigs.length;
      for( int anIndex = 0; anIndex < aNumBranchConfigs; anIndex++) {
        M3BranchConfigIfc aBranchConfig = someBranchConfigs[ anIndex];
        if( aBranchConfig != null) {
          com.dosmil_e.m3.core.ifc.M3RelationshipIfc aRelationship = aBranchConfig.getMetaRelationship( theCtxt);
          if( aRelationship != null) {
            M3BranchMgrIfc aBranchMgr = aBranchConfig.getMetaBranchMgr( theCtxt);
            if( aBranchMgr != null) {
              com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc aReplicateBranchMgr = null;
              try { aReplicateBranchMgr = (com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc) aBranchMgr;} catch( ClassCastException anEx) {}
              if( aReplicateBranchMgr != null) {
                aReplicateBranchMgr.setReplicatedMetaRelationship( theCtxt, aRelationship);
              }
            }
          }
        }
      }
    }

    } catch( EAIException anEx) {}
  }






  protected void initRootTypeNodeCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Root node configs instantiations
   *******************************************************/
		aRootTypeNodeConfigRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("RootTypeNodeConfigRTNC"));
		aRootTypeNodeConfigRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RootTypeNodeConfig", "traversal"));
		addRootTypeNodeConfigs( theCtxt, aRootTypeNodeConfigRTNC);

		aNodeConfigRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("NodeConfigRTNC"));
		aNodeConfigRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal"));
		addRootTypeNodeConfigs( theCtxt, aNodeConfigRTNC);

		aBranchConfigRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("BranchConfigRTNC"));
		aBranchConfigRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchConfig", "traversal"));
		addRootTypeNodeConfigs( theCtxt, aBranchConfigRTNC);

		aRelatedTypeNodeConfigRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("RelatedTypeNodeConfigRTNC"));
		aRelatedTypeNodeConfigRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelatedTypeNodeConfig", "traversal"));
		addRootTypeNodeConfigs( theCtxt, aRelatedTypeNodeConfigRTNC);

		aTraversalConfigRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("TraversalConfigRTNC"));
		aTraversalConfigRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal"));
		addRootTypeNodeConfigs( theCtxt, aTraversalConfigRTNC);

		aAttributeConfigRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("AttributeConfigRTNC"));
		aAttributeConfigRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeConfig", "traversal"));
		addRootTypeNodeConfigs( theCtxt, aAttributeConfigRTNC);

		aNodeMgrRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("NodeMgrRTNC"));
		aNodeMgrRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeMgr", "traversal"));
		addRootTypeNodeConfigs( theCtxt, aNodeMgrRTNC);

		aBranchMgrRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("BranchMgrRTNC"));
		aBranchMgrRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchMgr", "traversal"));
		addRootTypeNodeConfigs( theCtxt, aBranchMgrRTNC);

		aFieldMgrRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("FieldMgrRTNC"));
		aFieldMgrRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "FieldMgr", "traversal"));
		addRootTypeNodeConfigs( theCtxt, aFieldMgrRTNC);

		aCopyFieldMgrRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("CopyFieldMgrRTNC"));
		aCopyFieldMgrRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "CopyFieldMgr", "traversal"));
		addRootTypeNodeConfigs( theCtxt, aCopyFieldMgrRTNC);

		aFilterRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("FilterRTNC"));
		aFilterRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Filter", "traversal"));
		addRootTypeNodeConfigs( theCtxt, aFilterRTNC);

		aProjectionConfigRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ProjectionConfigRTNC"));
		aProjectionConfigRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		addRootTypeNodeConfigs( theCtxt, aProjectionConfigRTNC);

		aReplicateBranchMgrRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ReplicateBranchMgrRTNC"));
		aReplicateBranchMgrRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateBranchMgr", "replication"));
		addRootTypeNodeConfigs( theCtxt, aReplicateBranchMgrRTNC);

		aReplicateNodeMgrRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ReplicateNodeMgrRTNC"));
		aReplicateNodeMgrRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateNodeMgr", "replication"));
		addRootTypeNodeConfigs( theCtxt, aReplicateNodeMgrRTNC);

		aModelRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ModelRTNC"));
		aModelRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Model", "core"));
		addRootTypeNodeConfigs( theCtxt, aModelRTNC);

		aModuleRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ModuleRTNC"));
		aModuleRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Module", "core"));
		addRootTypeNodeConfigs( theCtxt, aModuleRTNC);

		aTypeRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("TypeRTNC"));
		aTypeRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		addRootTypeNodeConfigs( theCtxt, aTypeRTNC);

		aRelationshipRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("RelationshipRTNC"));
		aRelationshipRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		addRootTypeNodeConfigs( theCtxt, aRelationshipRTNC);

		aStructuralFeatureRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("StructuralFeatureRTNC"));
		aStructuralFeatureRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralFeature", "core"));
		addRootTypeNodeConfigs( theCtxt, aStructuralFeatureRTNC);

		aAttributeRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("AttributeRTNC"));
		aAttributeRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core"));
		addRootTypeNodeConfigs( theCtxt, aAttributeRTNC);

		aParameterRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ParameterRTNC"));
		aParameterRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Parameter", "core"));
		addRootTypeNodeConfigs( theCtxt, aParameterRTNC);

		aCommentRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("CommentRTNC"));
		aCommentRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Comment", "core"));
		addRootTypeNodeConfigs( theCtxt, aCommentRTNC);

		aElementRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ElementRTNC"));
		aElementRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Element", "core"));
		addRootTypeNodeConfigs( theCtxt, aElementRTNC);


  }


  protected void initNodeCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Node configs  instantiations
   *******************************************************/
		aRootTypeNodeConfigNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RootTypeNodeConfigNC"));
		aRootTypeNodeConfigNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RootTypeNodeConfig", "traversal"));
		addNodeConfigs( theCtxt, aRootTypeNodeConfigNC);
		aRootTypeNodeConfigRTNC.setNodeConfig( theCtxt, aRootTypeNodeConfigNC);

		aRootTypeNodeConfigNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RootTypeNodeConfigNCTerm"));
		aRootTypeNodeConfigNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RootTypeNodeConfig", "traversal"));
		addNodeConfigs( theCtxt, aRootTypeNodeConfigNCTerm);
		aRootTypeNodeConfigNCTerm.setIsTerminal( theCtxt, true);

		aNodeConfigNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("NodeConfigNC"));
		aNodeConfigNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal"));
		addNodeConfigs( theCtxt, aNodeConfigNC);
		aNodeConfigRTNC.setNodeConfig( theCtxt, aNodeConfigNC);

		aNodeConfigNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("NodeConfigNCTerm"));
		aNodeConfigNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal"));
		addNodeConfigs( theCtxt, aNodeConfigNCTerm);
		aNodeConfigNCTerm.setIsTerminal( theCtxt, true);

		aBranchConfigNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("BranchConfigNC"));
		aBranchConfigNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchConfig", "traversal"));
		addNodeConfigs( theCtxt, aBranchConfigNC);
		aBranchConfigRTNC.setNodeConfig( theCtxt, aBranchConfigNC);

		aBranchConfigNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("BranchConfigNCTerm"));
		aBranchConfigNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchConfig", "traversal"));
		addNodeConfigs( theCtxt, aBranchConfigNCTerm);
		aBranchConfigNCTerm.setIsTerminal( theCtxt, true);

		aRelatedTypeNodeConfigNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RelatedTypeNodeConfigNC"));
		aRelatedTypeNodeConfigNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelatedTypeNodeConfig", "traversal"));
		addNodeConfigs( theCtxt, aRelatedTypeNodeConfigNC);
		aRelatedTypeNodeConfigRTNC.setNodeConfig( theCtxt, aRelatedTypeNodeConfigNC);

		aRelatedTypeNodeConfigNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RelatedTypeNodeConfigNCTerm"));
		aRelatedTypeNodeConfigNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelatedTypeNodeConfig", "traversal"));
		addNodeConfigs( theCtxt, aRelatedTypeNodeConfigNCTerm);
		aRelatedTypeNodeConfigNCTerm.setIsTerminal( theCtxt, true);

		aTraversalConfigNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("TraversalConfigNC"));
		aTraversalConfigNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal"));
		addNodeConfigs( theCtxt, aTraversalConfigNC);
		aTraversalConfigRTNC.setNodeConfig( theCtxt, aTraversalConfigNC);

		aTraversalConfigNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("TraversalConfigNCTerm"));
		aTraversalConfigNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal"));
		addNodeConfigs( theCtxt, aTraversalConfigNCTerm);
		aTraversalConfigNCTerm.setIsTerminal( theCtxt, true);

		aAttributeConfigNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AttributeConfigNC"));
		aAttributeConfigNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeConfig", "traversal"));
		addNodeConfigs( theCtxt, aAttributeConfigNC);
		aAttributeConfigRTNC.setNodeConfig( theCtxt, aAttributeConfigNC);

		aAttributeConfigNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AttributeConfigNCTerm"));
		aAttributeConfigNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeConfig", "traversal"));
		addNodeConfigs( theCtxt, aAttributeConfigNCTerm);
		aAttributeConfigNCTerm.setIsTerminal( theCtxt, true);

		aNodeMgrNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("NodeMgrNC"));
		aNodeMgrNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeMgr", "traversal"));
		addNodeConfigs( theCtxt, aNodeMgrNC);
		aNodeMgrRTNC.setNodeConfig( theCtxt, aNodeMgrNC);

		aNodeMgrNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("NodeMgrNCTerm"));
		aNodeMgrNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeMgr", "traversal"));
		addNodeConfigs( theCtxt, aNodeMgrNCTerm);
		aNodeMgrNCTerm.setIsTerminal( theCtxt, true);

		aBranchMgrNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("BranchMgrNC"));
		aBranchMgrNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchMgr", "traversal"));
		addNodeConfigs( theCtxt, aBranchMgrNC);
		aBranchMgrRTNC.setNodeConfig( theCtxt, aBranchMgrNC);

		aBranchMgrNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("BranchMgrNCTerm"));
		aBranchMgrNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchMgr", "traversal"));
		addNodeConfigs( theCtxt, aBranchMgrNCTerm);
		aBranchMgrNCTerm.setIsTerminal( theCtxt, true);

		aFieldMgrNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("FieldMgrNC"));
		aFieldMgrNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "FieldMgr", "traversal"));
		addNodeConfigs( theCtxt, aFieldMgrNC);
		aFieldMgrRTNC.setNodeConfig( theCtxt, aFieldMgrNC);

		aFieldMgrNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("FieldMgrNCTerm"));
		aFieldMgrNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "FieldMgr", "traversal"));
		addNodeConfigs( theCtxt, aFieldMgrNCTerm);
		aFieldMgrNCTerm.setIsTerminal( theCtxt, true);

		aCopyFieldMgrNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CopyFieldMgrNC"));
		aCopyFieldMgrNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "CopyFieldMgr", "traversal"));
		addNodeConfigs( theCtxt, aCopyFieldMgrNC);
		aCopyFieldMgrRTNC.setNodeConfig( theCtxt, aCopyFieldMgrNC);

		aCopyFieldMgrNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CopyFieldMgrNCTerm"));
		aCopyFieldMgrNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "CopyFieldMgr", "traversal"));
		addNodeConfigs( theCtxt, aCopyFieldMgrNCTerm);
		aCopyFieldMgrNCTerm.setIsTerminal( theCtxt, true);

		aFilterNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("FilterNC"));
		aFilterNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Filter", "traversal"));
		addNodeConfigs( theCtxt, aFilterNC);
		aFilterRTNC.setNodeConfig( theCtxt, aFilterNC);

		aFilterNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("FilterNCTerm"));
		aFilterNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Filter", "traversal"));
		addNodeConfigs( theCtxt, aFilterNCTerm);
		aFilterNCTerm.setIsTerminal( theCtxt, true);

		aProjectionConfigNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ProjectionConfigNC"));
		aProjectionConfigNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		addNodeConfigs( theCtxt, aProjectionConfigNC);
		aProjectionConfigRTNC.setNodeConfig( theCtxt, aProjectionConfigNC);

		aProjectionConfigNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ProjectionConfigNCTerm"));
		aProjectionConfigNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		addNodeConfigs( theCtxt, aProjectionConfigNCTerm);
		aProjectionConfigNCTerm.setIsTerminal( theCtxt, true);

		aReplicateBranchMgrNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ReplicateBranchMgrNC"));
		aReplicateBranchMgrNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateBranchMgr", "replication"));
		addNodeConfigs( theCtxt, aReplicateBranchMgrNC);
		aReplicateBranchMgrRTNC.setNodeConfig( theCtxt, aReplicateBranchMgrNC);

		aReplicateBranchMgrNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ReplicateBranchMgrNCTerm"));
		aReplicateBranchMgrNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateBranchMgr", "replication"));
		addNodeConfigs( theCtxt, aReplicateBranchMgrNCTerm);
		aReplicateBranchMgrNCTerm.setIsTerminal( theCtxt, true);

		aReplicateNodeMgrNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ReplicateNodeMgrNC"));
		aReplicateNodeMgrNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateNodeMgr", "replication"));
		addNodeConfigs( theCtxt, aReplicateNodeMgrNC);
		aReplicateNodeMgrRTNC.setNodeConfig( theCtxt, aReplicateNodeMgrNC);

		aReplicateNodeMgrNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ReplicateNodeMgrNCTerm"));
		aReplicateNodeMgrNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateNodeMgr", "replication"));
		addNodeConfigs( theCtxt, aReplicateNodeMgrNCTerm);
		aReplicateNodeMgrNCTerm.setIsTerminal( theCtxt, true);

		aModelNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ModelNC"));
		aModelNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Model", "core"));
		addNodeConfigs( theCtxt, aModelNC);
		aModelRTNC.setNodeConfig( theCtxt, aModelNC);

		aModelNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ModelNCTerm"));
		aModelNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Model", "core"));
		addNodeConfigs( theCtxt, aModelNCTerm);
		aModelNCTerm.setIsTerminal( theCtxt, true);

		aModuleNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ModuleNC"));
		aModuleNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Module", "core"));
		addNodeConfigs( theCtxt, aModuleNC);
		aModuleRTNC.setNodeConfig( theCtxt, aModuleNC);

		aModuleNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ModuleNCTerm"));
		aModuleNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Module", "core"));
		addNodeConfigs( theCtxt, aModuleNCTerm);
		aModuleNCTerm.setIsTerminal( theCtxt, true);

		aTypeNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("TypeNC"));
		aTypeNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		addNodeConfigs( theCtxt, aTypeNC);
		aTypeRTNC.setNodeConfig( theCtxt, aTypeNC);

		aTypeNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("TypeNCTerm"));
		aTypeNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		addNodeConfigs( theCtxt, aTypeNCTerm);
		aTypeNCTerm.setIsTerminal( theCtxt, true);

		aRelationshipNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RelationshipNC"));
		aRelationshipNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		addNodeConfigs( theCtxt, aRelationshipNC);
		aRelationshipRTNC.setNodeConfig( theCtxt, aRelationshipNC);

		aRelationshipNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RelationshipNCTerm"));
		aRelationshipNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		addNodeConfigs( theCtxt, aRelationshipNCTerm);
		aRelationshipNCTerm.setIsTerminal( theCtxt, true);

		aStructuralFeatureNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StructuralFeatureNC"));
		aStructuralFeatureNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralFeature", "core"));
		addNodeConfigs( theCtxt, aStructuralFeatureNC);
		aStructuralFeatureRTNC.setNodeConfig( theCtxt, aStructuralFeatureNC);

		aStructuralFeatureNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StructuralFeatureNCTerm"));
		aStructuralFeatureNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralFeature", "core"));
		addNodeConfigs( theCtxt, aStructuralFeatureNCTerm);
		aStructuralFeatureNCTerm.setIsTerminal( theCtxt, true);

		aAttributeNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AttributeNC"));
		aAttributeNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core"));
		addNodeConfigs( theCtxt, aAttributeNC);
		aAttributeRTNC.setNodeConfig( theCtxt, aAttributeNC);

		aAttributeNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AttributeNCTerm"));
		aAttributeNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core"));
		addNodeConfigs( theCtxt, aAttributeNCTerm);
		aAttributeNCTerm.setIsTerminal( theCtxt, true);

		aParameterNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ParameterNC"));
		aParameterNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Parameter", "core"));
		addNodeConfigs( theCtxt, aParameterNC);
		aParameterRTNC.setNodeConfig( theCtxt, aParameterNC);

		aParameterNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ParameterNCTerm"));
		aParameterNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Parameter", "core"));
		addNodeConfigs( theCtxt, aParameterNCTerm);
		aParameterNCTerm.setIsTerminal( theCtxt, true);

		aCommentNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CommentNC"));
		aCommentNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Comment", "core"));
		addNodeConfigs( theCtxt, aCommentNC);
		aCommentRTNC.setNodeConfig( theCtxt, aCommentNC);

		aCommentNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CommentNCTerm"));
		aCommentNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Comment", "core"));
		addNodeConfigs( theCtxt, aCommentNCTerm);
		aCommentNCTerm.setIsTerminal( theCtxt, true);

		aElementNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ElementNC"));
		aElementNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Element", "core"));
		addNodeConfigs( theCtxt, aElementNC);
		aElementRTNC.setNodeConfig( theCtxt, aElementNC);

		aElementNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ElementNCTerm"));
		aElementNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Element", "core"));
		addNodeConfigs( theCtxt, aElementNCTerm);
		aElementNCTerm.setIsTerminal( theCtxt, true);


  }


  protected void initNodeMgrsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Node mgrs  instantiations
   *******************************************************/
		aRootTypeNodeConfigNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("RootTypeNodeConfigNMgr"));
		addNodeMgrs( theCtxt, aRootTypeNodeConfigNMgr);
		aRootTypeNodeConfigNC.setMetaNodeMgr( theCtxt, aRootTypeNodeConfigNMgr);

		aRootTypeNodeConfigNCTerm.setMetaNodeMgr( theCtxt, aRootTypeNodeConfigNMgr);

		aNodeConfigNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("NodeConfigNMgr"));
		addNodeMgrs( theCtxt, aNodeConfigNMgr);
		aNodeConfigNC.setMetaNodeMgr( theCtxt, aNodeConfigNMgr);

		aNodeConfigNCTerm.setMetaNodeMgr( theCtxt, aNodeConfigNMgr);

		aBranchConfigNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("BranchConfigNMgr"));
		addNodeMgrs( theCtxt, aBranchConfigNMgr);
		aBranchConfigNC.setMetaNodeMgr( theCtxt, aBranchConfigNMgr);

		aBranchConfigNCTerm.setMetaNodeMgr( theCtxt, aBranchConfigNMgr);

		aRelatedTypeNodeConfigNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("RelatedTypeNodeConfigNMgr"));
		addNodeMgrs( theCtxt, aRelatedTypeNodeConfigNMgr);
		aRelatedTypeNodeConfigNC.setMetaNodeMgr( theCtxt, aRelatedTypeNodeConfigNMgr);

		aRelatedTypeNodeConfigNCTerm.setMetaNodeMgr( theCtxt, aRelatedTypeNodeConfigNMgr);

		aTraversalConfigNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("TraversalConfigNMgr"));
		addNodeMgrs( theCtxt, aTraversalConfigNMgr);
		aTraversalConfigNC.setMetaNodeMgr( theCtxt, aTraversalConfigNMgr);

		aTraversalConfigNCTerm.setMetaNodeMgr( theCtxt, aTraversalConfigNMgr);

		aAttributeConfigNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("AttributeConfigNMgr"));
		addNodeMgrs( theCtxt, aAttributeConfigNMgr);
		aAttributeConfigNC.setMetaNodeMgr( theCtxt, aAttributeConfigNMgr);

		aAttributeConfigNCTerm.setMetaNodeMgr( theCtxt, aAttributeConfigNMgr);

		aNodeMgrNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("NodeMgrNMgr"));
		addNodeMgrs( theCtxt, aNodeMgrNMgr);
		aNodeMgrNC.setMetaNodeMgr( theCtxt, aNodeMgrNMgr);

		aNodeMgrNCTerm.setMetaNodeMgr( theCtxt, aNodeMgrNMgr);

		aBranchMgrNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("BranchMgrNMgr"));
		addNodeMgrs( theCtxt, aBranchMgrNMgr);
		aBranchMgrNC.setMetaNodeMgr( theCtxt, aBranchMgrNMgr);

		aBranchMgrNCTerm.setMetaNodeMgr( theCtxt, aBranchMgrNMgr);

		aFieldMgrNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("FieldMgrNMgr"));
		addNodeMgrs( theCtxt, aFieldMgrNMgr);
		aFieldMgrNC.setMetaNodeMgr( theCtxt, aFieldMgrNMgr);

		aFieldMgrNCTerm.setMetaNodeMgr( theCtxt, aFieldMgrNMgr);

		aCopyFieldMgrNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("CopyFieldMgrNMgr"));
		addNodeMgrs( theCtxt, aCopyFieldMgrNMgr);
		aCopyFieldMgrNC.setMetaNodeMgr( theCtxt, aCopyFieldMgrNMgr);

		aCopyFieldMgrNCTerm.setMetaNodeMgr( theCtxt, aCopyFieldMgrNMgr);

		aFilterNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("FilterNMgr"));
		addNodeMgrs( theCtxt, aFilterNMgr);
		aFilterNC.setMetaNodeMgr( theCtxt, aFilterNMgr);

		aFilterNCTerm.setMetaNodeMgr( theCtxt, aFilterNMgr);

		aProjectionConfigNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("ProjectionConfigNMgr"));
		addNodeMgrs( theCtxt, aProjectionConfigNMgr);
		aProjectionConfigNC.setMetaNodeMgr( theCtxt, aProjectionConfigNMgr);

		aProjectionConfigNCTerm.setMetaNodeMgr( theCtxt, aProjectionConfigNMgr);

		aReplicateBranchMgrNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("ReplicateBranchMgrNMgr"));
		addNodeMgrs( theCtxt, aReplicateBranchMgrNMgr);
		aReplicateBranchMgrNC.setMetaNodeMgr( theCtxt, aReplicateBranchMgrNMgr);

		aReplicateBranchMgrNCTerm.setMetaNodeMgr( theCtxt, aReplicateBranchMgrNMgr);

		aReplicateNodeMgrNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("ReplicateNodeMgrNMgr"));
		addNodeMgrs( theCtxt, aReplicateNodeMgrNMgr);
		aReplicateNodeMgrNC.setMetaNodeMgr( theCtxt, aReplicateNodeMgrNMgr);

		aReplicateNodeMgrNCTerm.setMetaNodeMgr( theCtxt, aReplicateNodeMgrNMgr);

		aModelNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("ModelNMgr"));
		addNodeMgrs( theCtxt, aModelNMgr);
		aModelNC.setMetaNodeMgr( theCtxt, aModelNMgr);

		aModelNCTerm.setMetaNodeMgr( theCtxt, aModelNMgr);

		aModuleNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("ModuleNMgr"));
		addNodeMgrs( theCtxt, aModuleNMgr);
		aModuleNC.setMetaNodeMgr( theCtxt, aModuleNMgr);

		aModuleNCTerm.setMetaNodeMgr( theCtxt, aModuleNMgr);

		aTypeNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("TypeNMgr"));
		addNodeMgrs( theCtxt, aTypeNMgr);
		aTypeNC.setMetaNodeMgr( theCtxt, aTypeNMgr);

		aTypeNCTerm.setMetaNodeMgr( theCtxt, aTypeNMgr);

		aRelationshipNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("RelationshipNMgr"));
		addNodeMgrs( theCtxt, aRelationshipNMgr);
		aRelationshipNC.setMetaNodeMgr( theCtxt, aRelationshipNMgr);

		aRelationshipNCTerm.setMetaNodeMgr( theCtxt, aRelationshipNMgr);

		aStructuralFeatureNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("StructuralFeatureNMgr"));
		addNodeMgrs( theCtxt, aStructuralFeatureNMgr);
		aStructuralFeatureNC.setMetaNodeMgr( theCtxt, aStructuralFeatureNMgr);

		aStructuralFeatureNCTerm.setMetaNodeMgr( theCtxt, aStructuralFeatureNMgr);

		aAttributeNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("AttributeNMgr"));
		addNodeMgrs( theCtxt, aAttributeNMgr);
		aAttributeNC.setMetaNodeMgr( theCtxt, aAttributeNMgr);

		aAttributeNCTerm.setMetaNodeMgr( theCtxt, aAttributeNMgr);

		aParameterNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("ParameterNMgr"));
		addNodeMgrs( theCtxt, aParameterNMgr);
		aParameterNC.setMetaNodeMgr( theCtxt, aParameterNMgr);

		aParameterNCTerm.setMetaNodeMgr( theCtxt, aParameterNMgr);

		aCommentNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("CommentNMgr"));
		addNodeMgrs( theCtxt, aCommentNMgr);
		aCommentNC.setMetaNodeMgr( theCtxt, aCommentNMgr);

		aCommentNCTerm.setMetaNodeMgr( theCtxt, aCommentNMgr);

		aElementNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("ElementNMgr"));
		addNodeMgrs( theCtxt, aElementNMgr);
		aElementNC.setMetaNodeMgr( theCtxt, aElementNMgr);

		aElementNCTerm.setMetaNodeMgr( theCtxt, aElementNMgr);


  }


  protected void initBranchCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Branch configs  instantiations
   *******************************************************/
		aNodeConfig_branchConfigsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("NodeConfig_branchConfigsBC"));
		aNodeConfig_branchConfigsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("branchConfigs")));
		aNodeConfig_branchConfigsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aNodeConfig_branchConfigsBC);

		aNodeConfig_attributeConfigsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("NodeConfig_attributeConfigsBC"));
		aNodeConfig_attributeConfigsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("attributeConfigs")));
		aNodeConfig_attributeConfigsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aNodeConfig_attributeConfigsBC);

		aNodeConfig_metaTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("NodeConfig_metaTypeBC"));
		aNodeConfig_metaTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("metaType")));
		aNodeConfig_metaTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aNodeConfig_metaTypeBC);

		aNodeConfig_metaNodeMgrBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("NodeConfig_metaNodeMgrBC"));
		aNodeConfig_metaNodeMgrBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("metaNodeMgr")));
		aNodeConfig_metaNodeMgrBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aNodeConfig_metaNodeMgrBC);

		aNodeConfig_inverseOFnodeConfigBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("NodeConfig_inverseOFnodeConfigBC"));
		aNodeConfig_inverseOFnodeConfigBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFnodeConfig")));
		aNodeConfig_inverseOFnodeConfigBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aNodeConfig_inverseOFnodeConfigBC);

		aBranchConfig_inverseOFbranchConfigsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("BranchConfig_inverseOFbranchConfigsBC"));
		aBranchConfig_inverseOFbranchConfigsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFbranchConfigs")));
		aBranchConfig_inverseOFbranchConfigsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aBranchConfig_inverseOFbranchConfigsBC);

		aBranchConfig_metaRelationshipBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("BranchConfig_metaRelationshipBC"));
		aBranchConfig_metaRelationshipBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("metaRelationship")));
		aBranchConfig_metaRelationshipBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aBranchConfig_metaRelationshipBC);

		aBranchConfig_typeNodeConfigsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("BranchConfig_typeNodeConfigsBC"));
		aBranchConfig_typeNodeConfigsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("typeNodeConfigs")));
		aBranchConfig_typeNodeConfigsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aBranchConfig_typeNodeConfigsBC);

		aBranchConfig_metaBranchMgrBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("BranchConfig_metaBranchMgrBC"));
		aBranchConfig_metaBranchMgrBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("metaBranchMgr")));
		aBranchConfig_metaBranchMgrBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aBranchConfig_metaBranchMgrBC);

		aTypeNodeConfig_metaTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("TypeNodeConfig_metaTypeBC"));
		aTypeNodeConfig_metaTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TypeNodeConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("metaType")));
		aTypeNodeConfig_metaTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aTypeNodeConfig_metaTypeBC);

		aTypeNodeConfig_nodeConfigBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("TypeNodeConfig_nodeConfigBC"));
		aTypeNodeConfig_nodeConfigBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TypeNodeConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("nodeConfig")));
		aTypeNodeConfig_nodeConfigBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aTypeNodeConfig_nodeConfigBC);

		aRelatedTypeNodeConfig_filterBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("RelatedTypeNodeConfig_filterBC"));
		aRelatedTypeNodeConfig_filterBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelatedTypeNodeConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("filter")));
		aRelatedTypeNodeConfig_filterBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aRelatedTypeNodeConfig_filterBC);

		aTraversalConfig_rootTypeNodeConfigsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("TraversalConfig_rootTypeNodeConfigsBC"));
		aTraversalConfig_rootTypeNodeConfigsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("rootTypeNodeConfigs")));
		aTraversalConfig_rootTypeNodeConfigsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aTraversalConfig_rootTypeNodeConfigsBC);

		aTraversalConfig_branchConfigsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("TraversalConfig_branchConfigsBC"));
		aTraversalConfig_branchConfigsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("branchConfigs")));
		aTraversalConfig_branchConfigsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aTraversalConfig_branchConfigsBC);

		aTraversalConfig_nodeConfigsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("TraversalConfig_nodeConfigsBC"));
		aTraversalConfig_nodeConfigsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("nodeConfigs")));
		aTraversalConfig_nodeConfigsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aTraversalConfig_nodeConfigsBC);

		aTraversalConfig_attributeConfigsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("TraversalConfig_attributeConfigsBC"));
		aTraversalConfig_attributeConfigsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("attributeConfigs")));
		aTraversalConfig_attributeConfigsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aTraversalConfig_attributeConfigsBC);

		aTraversalConfig_configOverridesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("TraversalConfig_configOverridesBC"));
		aTraversalConfig_configOverridesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("configOverrides")));
		aTraversalConfig_configOverridesBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aTraversalConfig_configOverridesBC);

		aTraversalConfig_fieldMgrsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("TraversalConfig_fieldMgrsBC"));
		aTraversalConfig_fieldMgrsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("fieldMgrs")));
		aTraversalConfig_fieldMgrsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aTraversalConfig_fieldMgrsBC);

		aTraversalConfig_branchMgrsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("TraversalConfig_branchMgrsBC"));
		aTraversalConfig_branchMgrsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("branchMgrs")));
		aTraversalConfig_branchMgrsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aTraversalConfig_branchMgrsBC);

		aTraversalConfig_nodeMgrsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("TraversalConfig_nodeMgrsBC"));
		aTraversalConfig_nodeMgrsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("nodeMgrs")));
		aTraversalConfig_nodeMgrsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aTraversalConfig_nodeMgrsBC);

		aAttributeConfig_inverseOFattributeConfigsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("AttributeConfig_inverseOFattributeConfigsBC"));
		aAttributeConfig_inverseOFattributeConfigsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFattributeConfigs")));
		aAttributeConfig_inverseOFattributeConfigsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAttributeConfig_inverseOFattributeConfigsBC);

		aAttributeConfig_metaAttributeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("AttributeConfig_metaAttributeBC"));
		aAttributeConfig_metaAttributeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("metaAttribute")));
		aAttributeConfig_metaAttributeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAttributeConfig_metaAttributeBC);

		aAttributeConfig_metaFieldMgrBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("AttributeConfig_metaFieldMgrBC"));
		aAttributeConfig_metaFieldMgrBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeConfig", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("metaFieldMgr")));
		aAttributeConfig_metaFieldMgrBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAttributeConfig_metaFieldMgrBC);

		aConfigOverride_overrideWithBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ConfigOverride_overrideWithBC"));
		aConfigOverride_overrideWithBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ConfigOverride", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("overrideWith")));
		aConfigOverride_overrideWithBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aConfigOverride_overrideWithBC);

		aNodeMgr_inverseOFmetaNodeMgrBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("NodeMgr_inverseOFmetaNodeMgrBC"));
		aNodeMgr_inverseOFmetaNodeMgrBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeMgr", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFmetaNodeMgr")));
		aNodeMgr_inverseOFmetaNodeMgrBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aNodeMgr_inverseOFmetaNodeMgrBC);

		aBranchMgr_inverseOFmetaBranchMgrBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("BranchMgr_inverseOFmetaBranchMgrBC"));
		aBranchMgr_inverseOFmetaBranchMgrBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchMgr", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFmetaBranchMgr")));
		aBranchMgr_inverseOFmetaBranchMgrBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aBranchMgr_inverseOFmetaBranchMgrBC);

		aFieldMgr_inverseOFmetaFieldMgrBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("FieldMgr_inverseOFmetaFieldMgrBC"));
		aFieldMgr_inverseOFmetaFieldMgrBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "FieldMgr", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFmetaFieldMgr")));
		aFieldMgr_inverseOFmetaFieldMgrBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aFieldMgr_inverseOFmetaFieldMgrBC);

		aCopyFieldMgr_copiedMetaAttributeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("CopyFieldMgr_copiedMetaAttributeBC"));
		aCopyFieldMgr_copiedMetaAttributeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "CopyFieldMgr", "traversal").findRelationshipsNamed( theCtxt, new EAIMMName("copiedMetaAttribute")));
		aCopyFieldMgr_copiedMetaAttributeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aCopyFieldMgr_copiedMetaAttributeBC);

		aProjectionConfig_targetToTransfomationsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ProjectionConfig_targetToTransfomationsBC"));
		aProjectionConfig_targetToTransfomationsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection").findRelationshipsNamed( theCtxt, new EAIMMName("targetToTransfomations")));
		aProjectionConfig_targetToTransfomationsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aProjectionConfig_targetToTransfomationsBC);

		aProjectionConfig_projectionToOriginalsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ProjectionConfig_projectionToOriginalsBC"));
		aProjectionConfig_projectionToOriginalsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection").findRelationshipsNamed( theCtxt, new EAIMMName("projectionToOriginals")));
		aProjectionConfig_projectionToOriginalsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aProjectionConfig_projectionToOriginalsBC);

		aProjectionConfig_projectedToProjectionsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ProjectionConfig_projectedToProjectionsBC"));
		aProjectionConfig_projectedToProjectionsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection").findRelationshipsNamed( theCtxt, new EAIMMName("projectedToProjections")));
		aProjectionConfig_projectedToProjectionsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aProjectionConfig_projectedToProjectionsBC);

		aProjectionConfig_transformationToSourcesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ProjectionConfig_transformationToSourcesBC"));
		aProjectionConfig_transformationToSourcesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection").findRelationshipsNamed( theCtxt, new EAIMMName("transformationToSources")));
		aProjectionConfig_transformationToSourcesBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aProjectionConfig_transformationToSourcesBC);

		aProjectionConfig_transformationToSubTransformationsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ProjectionConfig_transformationToSubTransformationsBC"));
		aProjectionConfig_transformationToSubTransformationsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection").findRelationshipsNamed( theCtxt, new EAIMMName("transformationToSubTransformations")));
		aProjectionConfig_transformationToSubTransformationsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aProjectionConfig_transformationToSubTransformationsBC);

		aProjectionConfig_projectionTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ProjectionConfig_projectionTypeBC"));
		aProjectionConfig_projectionTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection").findRelationshipsNamed( theCtxt, new EAIMMName("projectionType")));
		aProjectionConfig_projectionTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aProjectionConfig_projectionTypeBC);

		aProjectionConfig_exclusionTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ProjectionConfig_exclusionTypeBC"));
		aProjectionConfig_exclusionTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection").findRelationshipsNamed( theCtxt, new EAIMMName("exclusionType")));
		aProjectionConfig_exclusionTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aProjectionConfig_exclusionTypeBC);

		aProjectionConfig_excludedInRelationshipNamedBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ProjectionConfig_excludedInRelationshipNamedBC"));
		aProjectionConfig_excludedInRelationshipNamedBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection").findRelationshipsNamed( theCtxt, new EAIMMName("excludedInRelationshipNamed")));
		aProjectionConfig_excludedInRelationshipNamedBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aProjectionConfig_excludedInRelationshipNamedBC);

		aReplicateBranchMgr_replicatedMetaRelationshipBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ReplicateBranchMgr_replicatedMetaRelationshipBC"));
		aReplicateBranchMgr_replicatedMetaRelationshipBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateBranchMgr", "replication").findRelationshipsNamed( theCtxt, new EAIMMName("replicatedMetaRelationship")));
		aReplicateBranchMgr_replicatedMetaRelationshipBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aReplicateBranchMgr_replicatedMetaRelationshipBC);

		aReplicateNodeMgr_replicatedMetaTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ReplicateNodeMgr_replicatedMetaTypeBC"));
		aReplicateNodeMgr_replicatedMetaTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateNodeMgr", "replication").findRelationshipsNamed( theCtxt, new EAIMMName("replicatedMetaType")));
		aReplicateNodeMgr_replicatedMetaTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aReplicateNodeMgr_replicatedMetaTypeBC);

		aModel_treeRootTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Model_treeRootTypeBC"));
		aModel_treeRootTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Model", "core").findRelationshipsNamed( theCtxt, new EAIMMName("treeRootType")));
		aModel_treeRootTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aModel_treeRootTypeBC);

		aModel_traversalConfigsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Model_traversalConfigsBC"));
		aModel_traversalConfigsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Model", "core").findRelationshipsNamed( theCtxt, new EAIMMName("traversalConfigs")));
		aModel_traversalConfigsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aModel_traversalConfigsBC);

		aModule_subModulesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Module_subModulesBC"));
		aModule_subModulesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Module", "core").findRelationshipsNamed( theCtxt, new EAIMMName("subModules")));
		aModule_subModulesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aModule_subModulesBC);

		aModule_typesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Module_typesBC"));
		aModule_typesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Module", "core").findRelationshipsNamed( theCtxt, new EAIMMName("types")));
		aModule_typesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aModule_typesBC);

		aType_inverseOFmetaTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Type_inverseOFmetaTypeBC"));
		aType_inverseOFmetaTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFmetaType")));
		aType_inverseOFmetaTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aType_inverseOFmetaTypeBC);

		aType_inverse1OFmetaTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Type_inverse1OFmetaTypeBC"));
		aType_inverse1OFmetaTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverse1OFmetaType")));
		aType_inverse1OFmetaTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aType_inverse1OFmetaTypeBC);

		aType_inverseOFreplicatedMetaTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Type_inverseOFreplicatedMetaTypeBC"));
		aType_inverseOFreplicatedMetaTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFreplicatedMetaType")));
		aType_inverseOFreplicatedMetaTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aType_inverseOFreplicatedMetaTypeBC);

		aType_inverseOFprojectionTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Type_inverseOFprojectionTypeBC"));
		aType_inverseOFprojectionTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFprojectionType")));
		aType_inverseOFprojectionTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aType_inverseOFprojectionTypeBC);

		aType_inverseOFexclusionTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Type_inverseOFexclusionTypeBC"));
		aType_inverseOFexclusionTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFexclusionType")));
		aType_inverseOFexclusionTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aType_inverseOFexclusionTypeBC);

		aType_attributesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Type_attributesBC"));
		aType_attributesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core").findRelationshipsNamed( theCtxt, new EAIMMName("attributes")));
		aType_attributesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aType_attributesBC);

		aType_typeOfValuesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Type_typeOfValuesBC"));
		aType_typeOfValuesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core").findRelationshipsNamed( theCtxt, new EAIMMName("typeOfValues")));
		aType_typeOfValuesBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aType_typeOfValuesBC);

		aType_superTypesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Type_superTypesBC"));
		aType_superTypesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core").findRelationshipsNamed( theCtxt, new EAIMMName("superTypes")));
		aType_superTypesBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aType_superTypesBC);

		aType_subTypesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Type_subTypesBC"));
		aType_subTypesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core").findRelationshipsNamed( theCtxt, new EAIMMName("subTypes")));
		aType_subTypesBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aType_subTypesBC);

		aType_relationshipsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Type_relationshipsBC"));
		aType_relationshipsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core").findRelationshipsNamed( theCtxt, new EAIMMName("relationships")));
		aType_relationshipsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aType_relationshipsBC);

		aType_relatedWithBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Type_relatedWithBC"));
		aType_relatedWithBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core").findRelationshipsNamed( theCtxt, new EAIMMName("relatedWith")));
		aType_relatedWithBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aType_relatedWithBC);

		aType_rootTypeOfModelBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Type_rootTypeOfModelBC"));
		aType_rootTypeOfModelBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core").findRelationshipsNamed( theCtxt, new EAIMMName("rootTypeOfModel")));
		aType_rootTypeOfModelBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aType_rootTypeOfModelBC);

		aRelationship_inverseOFmetaRelationshipBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Relationship_inverseOFmetaRelationshipBC"));
		aRelationship_inverseOFmetaRelationshipBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFmetaRelationship")));
		aRelationship_inverseOFmetaRelationshipBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aRelationship_inverseOFmetaRelationshipBC);

		aRelationship_inverseOFreplicatedMetaRelationshipBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Relationship_inverseOFreplicatedMetaRelationshipBC"));
		aRelationship_inverseOFreplicatedMetaRelationshipBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFreplicatedMetaRelationship")));
		aRelationship_inverseOFreplicatedMetaRelationshipBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aRelationship_inverseOFreplicatedMetaRelationshipBC);

		aRelationship_inverseOFtargetToTransfomationsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Relationship_inverseOFtargetToTransfomationsBC"));
		aRelationship_inverseOFtargetToTransfomationsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFtargetToTransfomations")));
		aRelationship_inverseOFtargetToTransfomationsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aRelationship_inverseOFtargetToTransfomationsBC);

		aRelationship_inverseOFprojectionToOriginalsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Relationship_inverseOFprojectionToOriginalsBC"));
		aRelationship_inverseOFprojectionToOriginalsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFprojectionToOriginals")));
		aRelationship_inverseOFprojectionToOriginalsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aRelationship_inverseOFprojectionToOriginalsBC);

		aRelationship_inverseOFprojectedToProjectionsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Relationship_inverseOFprojectedToProjectionsBC"));
		aRelationship_inverseOFprojectedToProjectionsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFprojectedToProjections")));
		aRelationship_inverseOFprojectedToProjectionsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aRelationship_inverseOFprojectedToProjectionsBC);

		aRelationship_inverseOFtransformationToSourcesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Relationship_inverseOFtransformationToSourcesBC"));
		aRelationship_inverseOFtransformationToSourcesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFtransformationToSources")));
		aRelationship_inverseOFtransformationToSourcesBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aRelationship_inverseOFtransformationToSourcesBC);

		aRelationship_inverseOFtransformationToSubTransformationsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Relationship_inverseOFtransformationToSubTransformationsBC"));
		aRelationship_inverseOFtransformationToSubTransformationsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFtransformationToSubTransformations")));
		aRelationship_inverseOFtransformationToSubTransformationsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aRelationship_inverseOFtransformationToSubTransformationsBC);

		aRelationship_inverseBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Relationship_inverseBC"));
		aRelationship_inverseBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverse")));
		aRelationship_inverseBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aRelationship_inverseBC);

		aRelationship_relatedTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Relationship_relatedTypeBC"));
		aRelationship_relatedTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core").findRelationshipsNamed( theCtxt, new EAIMMName("relatedType")));
		aRelationship_relatedTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aRelationship_relatedTypeBC);

		aAttribute_inverseOFmetaAttributeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Attribute_inverseOFmetaAttributeBC"));
		aAttribute_inverseOFmetaAttributeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFmetaAttribute")));
		aAttribute_inverseOFmetaAttributeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAttribute_inverseOFmetaAttributeBC);

		aAttribute_inverseOFcopiedMetaAttributeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Attribute_inverseOFcopiedMetaAttributeBC"));
		aAttribute_inverseOFcopiedMetaAttributeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFcopiedMetaAttribute")));
		aAttribute_inverseOFcopiedMetaAttributeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAttribute_inverseOFcopiedMetaAttributeBC);

		aAttribute_inverseOFexcludedInRelationshipNamedBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Attribute_inverseOFexcludedInRelationshipNamedBC"));
		aAttribute_inverseOFexcludedInRelationshipNamedBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core").findRelationshipsNamed( theCtxt, new EAIMMName("inverseOFexcludedInRelationshipNamed")));
		aAttribute_inverseOFexcludedInRelationshipNamedBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAttribute_inverseOFexcludedInRelationshipNamedBC);

		aAttribute_valueTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Attribute_valueTypeBC"));
		aAttribute_valueTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core").findRelationshipsNamed( theCtxt, new EAIMMName("valueType")));
		aAttribute_valueTypeBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAttribute_valueTypeBC);

		aElement_parametersBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Element_parametersBC"));
		aElement_parametersBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Element", "core").findRelationshipsNamed( theCtxt, new EAIMMName("parameters")));
		aElement_parametersBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aElement_parametersBC);

		aElement_commentsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Element_commentsBC"));
		aElement_commentsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Element", "core").findRelationshipsNamed( theCtxt, new EAIMMName("comments")));
		aElement_commentsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aElement_commentsBC);


  }


  protected void initBranchMgrsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Branch mgrs  instantiations
   *******************************************************/
		aNodeConfig_branchConfigsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("NodeConfig_branchConfigsBMgr"));
		addBranchMgrs( theCtxt, aNodeConfig_branchConfigsBMgr);
		aNodeConfig_branchConfigsBC.setMetaBranchMgr( theCtxt, aNodeConfig_branchConfigsBMgr);

		aNodeConfig_attributeConfigsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("NodeConfig_attributeConfigsBMgr"));
		addBranchMgrs( theCtxt, aNodeConfig_attributeConfigsBMgr);
		aNodeConfig_attributeConfigsBC.setMetaBranchMgr( theCtxt, aNodeConfig_attributeConfigsBMgr);

		aNodeConfig_metaTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("NodeConfig_metaTypeBMgr"));
		addBranchMgrs( theCtxt, aNodeConfig_metaTypeBMgr);
		aNodeConfig_metaTypeBC.setMetaBranchMgr( theCtxt, aNodeConfig_metaTypeBMgr);

		aNodeConfig_metaNodeMgrBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("NodeConfig_metaNodeMgrBMgr"));
		addBranchMgrs( theCtxt, aNodeConfig_metaNodeMgrBMgr);
		aNodeConfig_metaNodeMgrBC.setMetaBranchMgr( theCtxt, aNodeConfig_metaNodeMgrBMgr);

		aNodeConfig_inverseOFnodeConfigBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("NodeConfig_inverseOFnodeConfigBMgr"));
		addBranchMgrs( theCtxt, aNodeConfig_inverseOFnodeConfigBMgr);
		aNodeConfig_inverseOFnodeConfigBC.setMetaBranchMgr( theCtxt, aNodeConfig_inverseOFnodeConfigBMgr);

		aBranchConfig_inverseOFbranchConfigsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("BranchConfig_inverseOFbranchConfigsBMgr"));
		addBranchMgrs( theCtxt, aBranchConfig_inverseOFbranchConfigsBMgr);
		aBranchConfig_inverseOFbranchConfigsBC.setMetaBranchMgr( theCtxt, aBranchConfig_inverseOFbranchConfigsBMgr);

		aBranchConfig_metaRelationshipBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("BranchConfig_metaRelationshipBMgr"));
		addBranchMgrs( theCtxt, aBranchConfig_metaRelationshipBMgr);
		aBranchConfig_metaRelationshipBC.setMetaBranchMgr( theCtxt, aBranchConfig_metaRelationshipBMgr);

		aBranchConfig_typeNodeConfigsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("BranchConfig_typeNodeConfigsBMgr"));
		addBranchMgrs( theCtxt, aBranchConfig_typeNodeConfigsBMgr);
		aBranchConfig_typeNodeConfigsBC.setMetaBranchMgr( theCtxt, aBranchConfig_typeNodeConfigsBMgr);

		aBranchConfig_metaBranchMgrBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("BranchConfig_metaBranchMgrBMgr"));
		addBranchMgrs( theCtxt, aBranchConfig_metaBranchMgrBMgr);
		aBranchConfig_metaBranchMgrBC.setMetaBranchMgr( theCtxt, aBranchConfig_metaBranchMgrBMgr);

		aTypeNodeConfig_metaTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("TypeNodeConfig_metaTypeBMgr"));
		addBranchMgrs( theCtxt, aTypeNodeConfig_metaTypeBMgr);
		aTypeNodeConfig_metaTypeBC.setMetaBranchMgr( theCtxt, aTypeNodeConfig_metaTypeBMgr);

		aTypeNodeConfig_nodeConfigBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("TypeNodeConfig_nodeConfigBMgr"));
		addBranchMgrs( theCtxt, aTypeNodeConfig_nodeConfigBMgr);
		aTypeNodeConfig_nodeConfigBC.setMetaBranchMgr( theCtxt, aTypeNodeConfig_nodeConfigBMgr);

		aRelatedTypeNodeConfig_filterBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("RelatedTypeNodeConfig_filterBMgr"));
		addBranchMgrs( theCtxt, aRelatedTypeNodeConfig_filterBMgr);
		aRelatedTypeNodeConfig_filterBC.setMetaBranchMgr( theCtxt, aRelatedTypeNodeConfig_filterBMgr);

		aTraversalConfig_rootTypeNodeConfigsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("TraversalConfig_rootTypeNodeConfigsBMgr"));
		addBranchMgrs( theCtxt, aTraversalConfig_rootTypeNodeConfigsBMgr);
		aTraversalConfig_rootTypeNodeConfigsBC.setMetaBranchMgr( theCtxt, aTraversalConfig_rootTypeNodeConfigsBMgr);

		aTraversalConfig_branchConfigsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("TraversalConfig_branchConfigsBMgr"));
		addBranchMgrs( theCtxt, aTraversalConfig_branchConfigsBMgr);
		aTraversalConfig_branchConfigsBC.setMetaBranchMgr( theCtxt, aTraversalConfig_branchConfigsBMgr);

		aTraversalConfig_nodeConfigsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("TraversalConfig_nodeConfigsBMgr"));
		addBranchMgrs( theCtxt, aTraversalConfig_nodeConfigsBMgr);
		aTraversalConfig_nodeConfigsBC.setMetaBranchMgr( theCtxt, aTraversalConfig_nodeConfigsBMgr);

		aTraversalConfig_attributeConfigsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("TraversalConfig_attributeConfigsBMgr"));
		addBranchMgrs( theCtxt, aTraversalConfig_attributeConfigsBMgr);
		aTraversalConfig_attributeConfigsBC.setMetaBranchMgr( theCtxt, aTraversalConfig_attributeConfigsBMgr);

		aTraversalConfig_configOverridesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("TraversalConfig_configOverridesBMgr"));
		addBranchMgrs( theCtxt, aTraversalConfig_configOverridesBMgr);
		aTraversalConfig_configOverridesBC.setMetaBranchMgr( theCtxt, aTraversalConfig_configOverridesBMgr);

		aTraversalConfig_fieldMgrsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("TraversalConfig_fieldMgrsBMgr"));
		addBranchMgrs( theCtxt, aTraversalConfig_fieldMgrsBMgr);
		aTraversalConfig_fieldMgrsBC.setMetaBranchMgr( theCtxt, aTraversalConfig_fieldMgrsBMgr);

		aTraversalConfig_branchMgrsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("TraversalConfig_branchMgrsBMgr"));
		addBranchMgrs( theCtxt, aTraversalConfig_branchMgrsBMgr);
		aTraversalConfig_branchMgrsBC.setMetaBranchMgr( theCtxt, aTraversalConfig_branchMgrsBMgr);

		aTraversalConfig_nodeMgrsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("TraversalConfig_nodeMgrsBMgr"));
		addBranchMgrs( theCtxt, aTraversalConfig_nodeMgrsBMgr);
		aTraversalConfig_nodeMgrsBC.setMetaBranchMgr( theCtxt, aTraversalConfig_nodeMgrsBMgr);

		aAttributeConfig_inverseOFattributeConfigsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("AttributeConfig_inverseOFattributeConfigsBMgr"));
		addBranchMgrs( theCtxt, aAttributeConfig_inverseOFattributeConfigsBMgr);
		aAttributeConfig_inverseOFattributeConfigsBC.setMetaBranchMgr( theCtxt, aAttributeConfig_inverseOFattributeConfigsBMgr);

		aAttributeConfig_metaAttributeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("AttributeConfig_metaAttributeBMgr"));
		addBranchMgrs( theCtxt, aAttributeConfig_metaAttributeBMgr);
		aAttributeConfig_metaAttributeBC.setMetaBranchMgr( theCtxt, aAttributeConfig_metaAttributeBMgr);

		aAttributeConfig_metaFieldMgrBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("AttributeConfig_metaFieldMgrBMgr"));
		addBranchMgrs( theCtxt, aAttributeConfig_metaFieldMgrBMgr);
		aAttributeConfig_metaFieldMgrBC.setMetaBranchMgr( theCtxt, aAttributeConfig_metaFieldMgrBMgr);

		aConfigOverride_overrideWithBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("ConfigOverride_overrideWithBMgr"));
		addBranchMgrs( theCtxt, aConfigOverride_overrideWithBMgr);
		aConfigOverride_overrideWithBC.setMetaBranchMgr( theCtxt, aConfigOverride_overrideWithBMgr);

		aNodeMgr_inverseOFmetaNodeMgrBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("NodeMgr_inverseOFmetaNodeMgrBMgr"));
		addBranchMgrs( theCtxt, aNodeMgr_inverseOFmetaNodeMgrBMgr);
		aNodeMgr_inverseOFmetaNodeMgrBC.setMetaBranchMgr( theCtxt, aNodeMgr_inverseOFmetaNodeMgrBMgr);

		aBranchMgr_inverseOFmetaBranchMgrBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("BranchMgr_inverseOFmetaBranchMgrBMgr"));
		addBranchMgrs( theCtxt, aBranchMgr_inverseOFmetaBranchMgrBMgr);
		aBranchMgr_inverseOFmetaBranchMgrBC.setMetaBranchMgr( theCtxt, aBranchMgr_inverseOFmetaBranchMgrBMgr);

		aFieldMgr_inverseOFmetaFieldMgrBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("FieldMgr_inverseOFmetaFieldMgrBMgr"));
		addBranchMgrs( theCtxt, aFieldMgr_inverseOFmetaFieldMgrBMgr);
		aFieldMgr_inverseOFmetaFieldMgrBC.setMetaBranchMgr( theCtxt, aFieldMgr_inverseOFmetaFieldMgrBMgr);

		aCopyFieldMgr_copiedMetaAttributeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("CopyFieldMgr_copiedMetaAttributeBMgr"));
		addBranchMgrs( theCtxt, aCopyFieldMgr_copiedMetaAttributeBMgr);
		aCopyFieldMgr_copiedMetaAttributeBC.setMetaBranchMgr( theCtxt, aCopyFieldMgr_copiedMetaAttributeBMgr);

		aProjectionConfig_targetToTransfomationsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("ProjectionConfig_targetToTransfomationsBMgr"));
		addBranchMgrs( theCtxt, aProjectionConfig_targetToTransfomationsBMgr);
		aProjectionConfig_targetToTransfomationsBC.setMetaBranchMgr( theCtxt, aProjectionConfig_targetToTransfomationsBMgr);

		aProjectionConfig_projectionToOriginalsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("ProjectionConfig_projectionToOriginalsBMgr"));
		addBranchMgrs( theCtxt, aProjectionConfig_projectionToOriginalsBMgr);
		aProjectionConfig_projectionToOriginalsBC.setMetaBranchMgr( theCtxt, aProjectionConfig_projectionToOriginalsBMgr);

		aProjectionConfig_projectedToProjectionsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("ProjectionConfig_projectedToProjectionsBMgr"));
		addBranchMgrs( theCtxt, aProjectionConfig_projectedToProjectionsBMgr);
		aProjectionConfig_projectedToProjectionsBC.setMetaBranchMgr( theCtxt, aProjectionConfig_projectedToProjectionsBMgr);

		aProjectionConfig_transformationToSourcesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("ProjectionConfig_transformationToSourcesBMgr"));
		addBranchMgrs( theCtxt, aProjectionConfig_transformationToSourcesBMgr);
		aProjectionConfig_transformationToSourcesBC.setMetaBranchMgr( theCtxt, aProjectionConfig_transformationToSourcesBMgr);

		aProjectionConfig_transformationToSubTransformationsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("ProjectionConfig_transformationToSubTransformationsBMgr"));
		addBranchMgrs( theCtxt, aProjectionConfig_transformationToSubTransformationsBMgr);
		aProjectionConfig_transformationToSubTransformationsBC.setMetaBranchMgr( theCtxt, aProjectionConfig_transformationToSubTransformationsBMgr);

		aProjectionConfig_projectionTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("ProjectionConfig_projectionTypeBMgr"));
		addBranchMgrs( theCtxt, aProjectionConfig_projectionTypeBMgr);
		aProjectionConfig_projectionTypeBC.setMetaBranchMgr( theCtxt, aProjectionConfig_projectionTypeBMgr);

		aProjectionConfig_exclusionTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("ProjectionConfig_exclusionTypeBMgr"));
		addBranchMgrs( theCtxt, aProjectionConfig_exclusionTypeBMgr);
		aProjectionConfig_exclusionTypeBC.setMetaBranchMgr( theCtxt, aProjectionConfig_exclusionTypeBMgr);

		aProjectionConfig_excludedInRelationshipNamedBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("ProjectionConfig_excludedInRelationshipNamedBMgr"));
		addBranchMgrs( theCtxt, aProjectionConfig_excludedInRelationshipNamedBMgr);
		aProjectionConfig_excludedInRelationshipNamedBC.setMetaBranchMgr( theCtxt, aProjectionConfig_excludedInRelationshipNamedBMgr);

		aReplicateBranchMgr_replicatedMetaRelationshipBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("ReplicateBranchMgr_replicatedMetaRelationshipBMgr"));
		addBranchMgrs( theCtxt, aReplicateBranchMgr_replicatedMetaRelationshipBMgr);
		aReplicateBranchMgr_replicatedMetaRelationshipBC.setMetaBranchMgr( theCtxt, aReplicateBranchMgr_replicatedMetaRelationshipBMgr);

		aReplicateNodeMgr_replicatedMetaTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("ReplicateNodeMgr_replicatedMetaTypeBMgr"));
		addBranchMgrs( theCtxt, aReplicateNodeMgr_replicatedMetaTypeBMgr);
		aReplicateNodeMgr_replicatedMetaTypeBC.setMetaBranchMgr( theCtxt, aReplicateNodeMgr_replicatedMetaTypeBMgr);

		aModel_treeRootTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Model_treeRootTypeBMgr"));
		addBranchMgrs( theCtxt, aModel_treeRootTypeBMgr);
		aModel_treeRootTypeBC.setMetaBranchMgr( theCtxt, aModel_treeRootTypeBMgr);

		aModel_traversalConfigsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Model_traversalConfigsBMgr"));
		addBranchMgrs( theCtxt, aModel_traversalConfigsBMgr);
		aModel_traversalConfigsBC.setMetaBranchMgr( theCtxt, aModel_traversalConfigsBMgr);

		aModule_subModulesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Module_subModulesBMgr"));
		addBranchMgrs( theCtxt, aModule_subModulesBMgr);
		aModule_subModulesBC.setMetaBranchMgr( theCtxt, aModule_subModulesBMgr);

		aModule_typesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Module_typesBMgr"));
		addBranchMgrs( theCtxt, aModule_typesBMgr);
		aModule_typesBC.setMetaBranchMgr( theCtxt, aModule_typesBMgr);

		aType_inverseOFmetaTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Type_inverseOFmetaTypeBMgr"));
		addBranchMgrs( theCtxt, aType_inverseOFmetaTypeBMgr);
		aType_inverseOFmetaTypeBC.setMetaBranchMgr( theCtxt, aType_inverseOFmetaTypeBMgr);

		aType_inverse1OFmetaTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Type_inverse1OFmetaTypeBMgr"));
		addBranchMgrs( theCtxt, aType_inverse1OFmetaTypeBMgr);
		aType_inverse1OFmetaTypeBC.setMetaBranchMgr( theCtxt, aType_inverse1OFmetaTypeBMgr);

		aType_inverseOFreplicatedMetaTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Type_inverseOFreplicatedMetaTypeBMgr"));
		addBranchMgrs( theCtxt, aType_inverseOFreplicatedMetaTypeBMgr);
		aType_inverseOFreplicatedMetaTypeBC.setMetaBranchMgr( theCtxt, aType_inverseOFreplicatedMetaTypeBMgr);

		aType_inverseOFprojectionTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Type_inverseOFprojectionTypeBMgr"));
		addBranchMgrs( theCtxt, aType_inverseOFprojectionTypeBMgr);
		aType_inverseOFprojectionTypeBC.setMetaBranchMgr( theCtxt, aType_inverseOFprojectionTypeBMgr);

		aType_inverseOFexclusionTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Type_inverseOFexclusionTypeBMgr"));
		addBranchMgrs( theCtxt, aType_inverseOFexclusionTypeBMgr);
		aType_inverseOFexclusionTypeBC.setMetaBranchMgr( theCtxt, aType_inverseOFexclusionTypeBMgr);

		aType_attributesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Type_attributesBMgr"));
		addBranchMgrs( theCtxt, aType_attributesBMgr);
		aType_attributesBC.setMetaBranchMgr( theCtxt, aType_attributesBMgr);

		aType_typeOfValuesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Type_typeOfValuesBMgr"));
		addBranchMgrs( theCtxt, aType_typeOfValuesBMgr);
		aType_typeOfValuesBC.setMetaBranchMgr( theCtxt, aType_typeOfValuesBMgr);

		aType_superTypesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Type_superTypesBMgr"));
		addBranchMgrs( theCtxt, aType_superTypesBMgr);
		aType_superTypesBC.setMetaBranchMgr( theCtxt, aType_superTypesBMgr);

		aType_subTypesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Type_subTypesBMgr"));
		addBranchMgrs( theCtxt, aType_subTypesBMgr);
		aType_subTypesBC.setMetaBranchMgr( theCtxt, aType_subTypesBMgr);

		aType_relationshipsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Type_relationshipsBMgr"));
		addBranchMgrs( theCtxt, aType_relationshipsBMgr);
		aType_relationshipsBC.setMetaBranchMgr( theCtxt, aType_relationshipsBMgr);

		aType_relatedWithBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Type_relatedWithBMgr"));
		addBranchMgrs( theCtxt, aType_relatedWithBMgr);
		aType_relatedWithBC.setMetaBranchMgr( theCtxt, aType_relatedWithBMgr);

		aType_rootTypeOfModelBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Type_rootTypeOfModelBMgr"));
		addBranchMgrs( theCtxt, aType_rootTypeOfModelBMgr);
		aType_rootTypeOfModelBC.setMetaBranchMgr( theCtxt, aType_rootTypeOfModelBMgr);

		aRelationship_inverseOFmetaRelationshipBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Relationship_inverseOFmetaRelationshipBMgr"));
		addBranchMgrs( theCtxt, aRelationship_inverseOFmetaRelationshipBMgr);
		aRelationship_inverseOFmetaRelationshipBC.setMetaBranchMgr( theCtxt, aRelationship_inverseOFmetaRelationshipBMgr);

		aRelationship_inverseOFreplicatedMetaRelationshipBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Relationship_inverseOFreplicatedMetaRelationshipBMgr"));
		addBranchMgrs( theCtxt, aRelationship_inverseOFreplicatedMetaRelationshipBMgr);
		aRelationship_inverseOFreplicatedMetaRelationshipBC.setMetaBranchMgr( theCtxt, aRelationship_inverseOFreplicatedMetaRelationshipBMgr);

		aRelationship_inverseOFtargetToTransfomationsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Relationship_inverseOFtargetToTransfomationsBMgr"));
		addBranchMgrs( theCtxt, aRelationship_inverseOFtargetToTransfomationsBMgr);
		aRelationship_inverseOFtargetToTransfomationsBC.setMetaBranchMgr( theCtxt, aRelationship_inverseOFtargetToTransfomationsBMgr);

		aRelationship_inverseOFprojectionToOriginalsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Relationship_inverseOFprojectionToOriginalsBMgr"));
		addBranchMgrs( theCtxt, aRelationship_inverseOFprojectionToOriginalsBMgr);
		aRelationship_inverseOFprojectionToOriginalsBC.setMetaBranchMgr( theCtxt, aRelationship_inverseOFprojectionToOriginalsBMgr);

		aRelationship_inverseOFprojectedToProjectionsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Relationship_inverseOFprojectedToProjectionsBMgr"));
		addBranchMgrs( theCtxt, aRelationship_inverseOFprojectedToProjectionsBMgr);
		aRelationship_inverseOFprojectedToProjectionsBC.setMetaBranchMgr( theCtxt, aRelationship_inverseOFprojectedToProjectionsBMgr);

		aRelationship_inverseOFtransformationToSourcesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Relationship_inverseOFtransformationToSourcesBMgr"));
		addBranchMgrs( theCtxt, aRelationship_inverseOFtransformationToSourcesBMgr);
		aRelationship_inverseOFtransformationToSourcesBC.setMetaBranchMgr( theCtxt, aRelationship_inverseOFtransformationToSourcesBMgr);

		aRelationship_inverseOFtransformationToSubTransformationsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Relationship_inverseOFtransformationToSubTransformationsBMgr"));
		addBranchMgrs( theCtxt, aRelationship_inverseOFtransformationToSubTransformationsBMgr);
		aRelationship_inverseOFtransformationToSubTransformationsBC.setMetaBranchMgr( theCtxt, aRelationship_inverseOFtransformationToSubTransformationsBMgr);

		aRelationship_inverseBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Relationship_inverseBMgr"));
		addBranchMgrs( theCtxt, aRelationship_inverseBMgr);
		aRelationship_inverseBC.setMetaBranchMgr( theCtxt, aRelationship_inverseBMgr);

		aRelationship_relatedTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Relationship_relatedTypeBMgr"));
		addBranchMgrs( theCtxt, aRelationship_relatedTypeBMgr);
		aRelationship_relatedTypeBC.setMetaBranchMgr( theCtxt, aRelationship_relatedTypeBMgr);

		aAttribute_inverseOFmetaAttributeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Attribute_inverseOFmetaAttributeBMgr"));
		addBranchMgrs( theCtxt, aAttribute_inverseOFmetaAttributeBMgr);
		aAttribute_inverseOFmetaAttributeBC.setMetaBranchMgr( theCtxt, aAttribute_inverseOFmetaAttributeBMgr);

		aAttribute_inverseOFcopiedMetaAttributeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Attribute_inverseOFcopiedMetaAttributeBMgr"));
		addBranchMgrs( theCtxt, aAttribute_inverseOFcopiedMetaAttributeBMgr);
		aAttribute_inverseOFcopiedMetaAttributeBC.setMetaBranchMgr( theCtxt, aAttribute_inverseOFcopiedMetaAttributeBMgr);

		aAttribute_inverseOFexcludedInRelationshipNamedBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Attribute_inverseOFexcludedInRelationshipNamedBMgr"));
		addBranchMgrs( theCtxt, aAttribute_inverseOFexcludedInRelationshipNamedBMgr);
		aAttribute_inverseOFexcludedInRelationshipNamedBC.setMetaBranchMgr( theCtxt, aAttribute_inverseOFexcludedInRelationshipNamedBMgr);

		aAttribute_valueTypeBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Attribute_valueTypeBMgr"));
		addBranchMgrs( theCtxt, aAttribute_valueTypeBMgr);
		aAttribute_valueTypeBC.setMetaBranchMgr( theCtxt, aAttribute_valueTypeBMgr);

		aElement_parametersBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Element_parametersBMgr"));
		addBranchMgrs( theCtxt, aElement_parametersBMgr);
		aElement_parametersBC.setMetaBranchMgr( theCtxt, aElement_parametersBMgr);

		aElement_commentsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Element_commentsBMgr"));
		addBranchMgrs( theCtxt, aElement_commentsBMgr);
		aElement_commentsBC.setMetaBranchMgr( theCtxt, aElement_commentsBMgr);


  }


  protected void initRelatedTypeNodeCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Related type node configs  instantiations
   *******************************************************/
		aNodeConfig_branchConfigs_BranchConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("NodeConfig_branchConfigs_BranchConfigRelTNC"));
		aNodeConfig_branchConfigs_BranchConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchConfig", "traversal"));
		aNodeConfig_branchConfigs_BranchConfigRelTNC.setNodeConfig( theCtxt, aBranchConfigNCTerm);

		aNodeConfig_attributeConfigs_AttributeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("NodeConfig_attributeConfigs_AttributeConfigRelTNC"));
		aNodeConfig_attributeConfigs_AttributeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeConfig", "traversal"));
		aNodeConfig_attributeConfigs_AttributeConfigRelTNC.setNodeConfig( theCtxt, aAttributeConfigNCTerm);

		aNodeConfig_metaType_TypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("NodeConfig_metaType_TypeRelTNC"));
		aNodeConfig_metaType_TypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		aNodeConfig_metaType_TypeRelTNC.setNodeConfig( theCtxt, aTypeNCTerm);

		aNodeConfig_metaNodeMgr_NodeMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("NodeConfig_metaNodeMgr_NodeMgrRelTNC"));
		aNodeConfig_metaNodeMgr_NodeMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeMgr", "traversal"));
		aNodeConfig_metaNodeMgr_NodeMgrRelTNC.setNodeConfig( theCtxt, aNodeMgrNCTerm);

		aNodeConfig_metaNodeMgr_ReplicateNodeMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("NodeConfig_metaNodeMgr_ReplicateNodeMgrRelTNC"));
		aNodeConfig_metaNodeMgr_ReplicateNodeMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateNodeMgr", "replication"));
		aNodeConfig_metaNodeMgr_ReplicateNodeMgrRelTNC.setNodeConfig( theCtxt, aReplicateNodeMgrNCTerm);

		aNodeConfig_inverseOFnodeConfig_RootTypeNodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("NodeConfig_inverseOFnodeConfig_RootTypeNodeConfigRelTNC"));
		aNodeConfig_inverseOFnodeConfig_RootTypeNodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RootTypeNodeConfig", "traversal"));
		aNodeConfig_inverseOFnodeConfig_RootTypeNodeConfigRelTNC.setNodeConfig( theCtxt, aRootTypeNodeConfigNCTerm);

		aNodeConfig_inverseOFnodeConfig_RelatedTypeNodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("NodeConfig_inverseOFnodeConfig_RelatedTypeNodeConfigRelTNC"));
		aNodeConfig_inverseOFnodeConfig_RelatedTypeNodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelatedTypeNodeConfig", "traversal"));
		aNodeConfig_inverseOFnodeConfig_RelatedTypeNodeConfigRelTNC.setNodeConfig( theCtxt, aRelatedTypeNodeConfigNCTerm);

		aBranchConfig_inverseOFbranchConfigs_NodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("BranchConfig_inverseOFbranchConfigs_NodeConfigRelTNC"));
		aBranchConfig_inverseOFbranchConfigs_NodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal"));
		aBranchConfig_inverseOFbranchConfigs_NodeConfigRelTNC.setNodeConfig( theCtxt, aNodeConfigNCTerm);

		aBranchConfig_metaRelationship_RelationshipRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("BranchConfig_metaRelationship_RelationshipRelTNC"));
		aBranchConfig_metaRelationship_RelationshipRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		aBranchConfig_metaRelationship_RelationshipRelTNC.setNodeConfig( theCtxt, aRelationshipNCTerm);

		aBranchConfig_typeNodeConfigs_RelatedTypeNodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("BranchConfig_typeNodeConfigs_RelatedTypeNodeConfigRelTNC"));
		aBranchConfig_typeNodeConfigs_RelatedTypeNodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelatedTypeNodeConfig", "traversal"));
		aBranchConfig_typeNodeConfigs_RelatedTypeNodeConfigRelTNC.setNodeConfig( theCtxt, aRelatedTypeNodeConfigNC);

		aBranchConfig_metaBranchMgr_BranchMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("BranchConfig_metaBranchMgr_BranchMgrRelTNC"));
		aBranchConfig_metaBranchMgr_BranchMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchMgr", "traversal"));
		aBranchConfig_metaBranchMgr_BranchMgrRelTNC.setNodeConfig( theCtxt, aBranchMgrNCTerm);

		aBranchConfig_metaBranchMgr_ReplicateBranchMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("BranchConfig_metaBranchMgr_ReplicateBranchMgrRelTNC"));
		aBranchConfig_metaBranchMgr_ReplicateBranchMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateBranchMgr", "replication"));
		aBranchConfig_metaBranchMgr_ReplicateBranchMgrRelTNC.setNodeConfig( theCtxt, aReplicateBranchMgrNCTerm);

		aTypeNodeConfig_metaType_TypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TypeNodeConfig_metaType_TypeRelTNC"));
		aTypeNodeConfig_metaType_TypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		aTypeNodeConfig_metaType_TypeRelTNC.setNodeConfig( theCtxt, aTypeNCTerm);

		aTypeNodeConfig_nodeConfig_NodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TypeNodeConfig_nodeConfig_NodeConfigRelTNC"));
		aTypeNodeConfig_nodeConfig_NodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal"));
		aTypeNodeConfig_nodeConfig_NodeConfigRelTNC.setNodeConfig( theCtxt, aNodeConfigNCTerm);

		aRelatedTypeNodeConfig_filter_FilterRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("RelatedTypeNodeConfig_filter_FilterRelTNC"));
		aRelatedTypeNodeConfig_filter_FilterRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Filter", "traversal"));
		aRelatedTypeNodeConfig_filter_FilterRelTNC.setNodeConfig( theCtxt, aFilterNC);

		aTraversalConfig_rootTypeNodeConfigs_RootTypeNodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_rootTypeNodeConfigs_RootTypeNodeConfigRelTNC"));
		aTraversalConfig_rootTypeNodeConfigs_RootTypeNodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RootTypeNodeConfig", "traversal"));
		aTraversalConfig_rootTypeNodeConfigs_RootTypeNodeConfigRelTNC.setNodeConfig( theCtxt, aRootTypeNodeConfigNC);

		aTraversalConfig_branchConfigs_BranchConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_branchConfigs_BranchConfigRelTNC"));
		aTraversalConfig_branchConfigs_BranchConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchConfig", "traversal"));
		aTraversalConfig_branchConfigs_BranchConfigRelTNC.setNodeConfig( theCtxt, aBranchConfigNC);

		aTraversalConfig_nodeConfigs_NodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_nodeConfigs_NodeConfigRelTNC"));
		aTraversalConfig_nodeConfigs_NodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal"));
		aTraversalConfig_nodeConfigs_NodeConfigRelTNC.setNodeConfig( theCtxt, aNodeConfigNC);

		aTraversalConfig_attributeConfigs_AttributeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_attributeConfigs_AttributeConfigRelTNC"));
		aTraversalConfig_attributeConfigs_AttributeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeConfig", "traversal"));
		aTraversalConfig_attributeConfigs_AttributeConfigRelTNC.setNodeConfig( theCtxt, aAttributeConfigNC);

		aTraversalConfig_configOverrides_BranchConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_configOverrides_BranchConfigRelTNC"));
		aTraversalConfig_configOverrides_BranchConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchConfig", "traversal"));
		aTraversalConfig_configOverrides_BranchConfigRelTNC.setNodeConfig( theCtxt, aBranchConfigNCTerm);

		aTraversalConfig_configOverrides_NodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_configOverrides_NodeConfigRelTNC"));
		aTraversalConfig_configOverrides_NodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal"));
		aTraversalConfig_configOverrides_NodeConfigRelTNC.setNodeConfig( theCtxt, aNodeConfigNCTerm);

		aTraversalConfig_configOverrides_RootTypeNodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_configOverrides_RootTypeNodeConfigRelTNC"));
		aTraversalConfig_configOverrides_RootTypeNodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RootTypeNodeConfig", "traversal"));
		aTraversalConfig_configOverrides_RootTypeNodeConfigRelTNC.setNodeConfig( theCtxt, aRootTypeNodeConfigNCTerm);

		aTraversalConfig_configOverrides_RelatedTypeNodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_configOverrides_RelatedTypeNodeConfigRelTNC"));
		aTraversalConfig_configOverrides_RelatedTypeNodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelatedTypeNodeConfig", "traversal"));
		aTraversalConfig_configOverrides_RelatedTypeNodeConfigRelTNC.setNodeConfig( theCtxt, aRelatedTypeNodeConfigNCTerm);

		aTraversalConfig_fieldMgrs_FieldMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_fieldMgrs_FieldMgrRelTNC"));
		aTraversalConfig_fieldMgrs_FieldMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "FieldMgr", "traversal"));
		aTraversalConfig_fieldMgrs_FieldMgrRelTNC.setNodeConfig( theCtxt, aFieldMgrNC);

		aTraversalConfig_fieldMgrs_CopyFieldMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_fieldMgrs_CopyFieldMgrRelTNC"));
		aTraversalConfig_fieldMgrs_CopyFieldMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "CopyFieldMgr", "traversal"));
		aTraversalConfig_fieldMgrs_CopyFieldMgrRelTNC.setNodeConfig( theCtxt, aCopyFieldMgrNC);

		aTraversalConfig_branchMgrs_BranchMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_branchMgrs_BranchMgrRelTNC"));
		aTraversalConfig_branchMgrs_BranchMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchMgr", "traversal"));
		aTraversalConfig_branchMgrs_BranchMgrRelTNC.setNodeConfig( theCtxt, aBranchMgrNC);

		aTraversalConfig_branchMgrs_ReplicateBranchMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_branchMgrs_ReplicateBranchMgrRelTNC"));
		aTraversalConfig_branchMgrs_ReplicateBranchMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateBranchMgr", "replication"));
		aTraversalConfig_branchMgrs_ReplicateBranchMgrRelTNC.setNodeConfig( theCtxt, aReplicateBranchMgrNC);

		aTraversalConfig_nodeMgrs_NodeMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_nodeMgrs_NodeMgrRelTNC"));
		aTraversalConfig_nodeMgrs_NodeMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeMgr", "traversal"));
		aTraversalConfig_nodeMgrs_NodeMgrRelTNC.setNodeConfig( theCtxt, aNodeMgrNC);

		aTraversalConfig_nodeMgrs_ReplicateNodeMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("TraversalConfig_nodeMgrs_ReplicateNodeMgrRelTNC"));
		aTraversalConfig_nodeMgrs_ReplicateNodeMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateNodeMgr", "replication"));
		aTraversalConfig_nodeMgrs_ReplicateNodeMgrRelTNC.setNodeConfig( theCtxt, aReplicateNodeMgrNC);

		aAttributeConfig_inverseOFattributeConfigs_NodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AttributeConfig_inverseOFattributeConfigs_NodeConfigRelTNC"));
		aAttributeConfig_inverseOFattributeConfigs_NodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal"));
		aAttributeConfig_inverseOFattributeConfigs_NodeConfigRelTNC.setNodeConfig( theCtxt, aNodeConfigNCTerm);

		aAttributeConfig_metaAttribute_AttributeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AttributeConfig_metaAttribute_AttributeRelTNC"));
		aAttributeConfig_metaAttribute_AttributeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core"));
		aAttributeConfig_metaAttribute_AttributeRelTNC.setNodeConfig( theCtxt, aAttributeNCTerm);

		aAttributeConfig_metaFieldMgr_FieldMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AttributeConfig_metaFieldMgr_FieldMgrRelTNC"));
		aAttributeConfig_metaFieldMgr_FieldMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "FieldMgr", "traversal"));
		aAttributeConfig_metaFieldMgr_FieldMgrRelTNC.setNodeConfig( theCtxt, aFieldMgrNCTerm);

		aAttributeConfig_metaFieldMgr_CopyFieldMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AttributeConfig_metaFieldMgr_CopyFieldMgrRelTNC"));
		aAttributeConfig_metaFieldMgr_CopyFieldMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "CopyFieldMgr", "traversal"));
		aAttributeConfig_metaFieldMgr_CopyFieldMgrRelTNC.setNodeConfig( theCtxt, aCopyFieldMgrNCTerm);

		aConfigOverride_overrideWith_TraversalConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ConfigOverride_overrideWith_TraversalConfigRelTNC"));
		aConfigOverride_overrideWith_TraversalConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal"));
		aConfigOverride_overrideWith_TraversalConfigRelTNC.setNodeConfig( theCtxt, aTraversalConfigNCTerm);

		aConfigOverride_overrideWith_ProjectionConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ConfigOverride_overrideWith_ProjectionConfigRelTNC"));
		aConfigOverride_overrideWith_ProjectionConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		aConfigOverride_overrideWith_ProjectionConfigRelTNC.setNodeConfig( theCtxt, aProjectionConfigNCTerm);

		aNodeMgr_inverseOFmetaNodeMgr_NodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("NodeMgr_inverseOFmetaNodeMgr_NodeConfigRelTNC"));
		aNodeMgr_inverseOFmetaNodeMgr_NodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal"));
		aNodeMgr_inverseOFmetaNodeMgr_NodeConfigRelTNC.setNodeConfig( theCtxt, aNodeConfigNCTerm);

		aBranchMgr_inverseOFmetaBranchMgr_BranchConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("BranchMgr_inverseOFmetaBranchMgr_BranchConfigRelTNC"));
		aBranchMgr_inverseOFmetaBranchMgr_BranchConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchConfig", "traversal"));
		aBranchMgr_inverseOFmetaBranchMgr_BranchConfigRelTNC.setNodeConfig( theCtxt, aBranchConfigNCTerm);

		aFieldMgr_inverseOFmetaFieldMgr_AttributeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("FieldMgr_inverseOFmetaFieldMgr_AttributeConfigRelTNC"));
		aFieldMgr_inverseOFmetaFieldMgr_AttributeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeConfig", "traversal"));
		aFieldMgr_inverseOFmetaFieldMgr_AttributeConfigRelTNC.setNodeConfig( theCtxt, aAttributeConfigNCTerm);

		aCopyFieldMgr_copiedMetaAttribute_AttributeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("CopyFieldMgr_copiedMetaAttribute_AttributeRelTNC"));
		aCopyFieldMgr_copiedMetaAttribute_AttributeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core"));
		aCopyFieldMgr_copiedMetaAttribute_AttributeRelTNC.setNodeConfig( theCtxt, aAttributeNCTerm);

		aProjectionConfig_targetToTransfomations_RelationshipRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ProjectionConfig_targetToTransfomations_RelationshipRelTNC"));
		aProjectionConfig_targetToTransfomations_RelationshipRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		aProjectionConfig_targetToTransfomations_RelationshipRelTNC.setNodeConfig( theCtxt, aRelationshipNCTerm);

		aProjectionConfig_projectionToOriginals_RelationshipRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ProjectionConfig_projectionToOriginals_RelationshipRelTNC"));
		aProjectionConfig_projectionToOriginals_RelationshipRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		aProjectionConfig_projectionToOriginals_RelationshipRelTNC.setNodeConfig( theCtxt, aRelationshipNCTerm);

		aProjectionConfig_projectedToProjections_RelationshipRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ProjectionConfig_projectedToProjections_RelationshipRelTNC"));
		aProjectionConfig_projectedToProjections_RelationshipRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		aProjectionConfig_projectedToProjections_RelationshipRelTNC.setNodeConfig( theCtxt, aRelationshipNCTerm);

		aProjectionConfig_transformationToSources_RelationshipRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ProjectionConfig_transformationToSources_RelationshipRelTNC"));
		aProjectionConfig_transformationToSources_RelationshipRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		aProjectionConfig_transformationToSources_RelationshipRelTNC.setNodeConfig( theCtxt, aRelationshipNCTerm);

		aProjectionConfig_transformationToSubTransformations_RelationshipRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ProjectionConfig_transformationToSubTransformations_RelationshipRelTNC"));
		aProjectionConfig_transformationToSubTransformations_RelationshipRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		aProjectionConfig_transformationToSubTransformations_RelationshipRelTNC.setNodeConfig( theCtxt, aRelationshipNCTerm);

		aProjectionConfig_projectionType_TypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ProjectionConfig_projectionType_TypeRelTNC"));
		aProjectionConfig_projectionType_TypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		aProjectionConfig_projectionType_TypeRelTNC.setNodeConfig( theCtxt, aTypeNCTerm);

		aProjectionConfig_exclusionType_TypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ProjectionConfig_exclusionType_TypeRelTNC"));
		aProjectionConfig_exclusionType_TypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		aProjectionConfig_exclusionType_TypeRelTNC.setNodeConfig( theCtxt, aTypeNCTerm);

		aProjectionConfig_excludedInRelationshipNamed_AttributeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ProjectionConfig_excludedInRelationshipNamed_AttributeRelTNC"));
		aProjectionConfig_excludedInRelationshipNamed_AttributeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core"));
		aProjectionConfig_excludedInRelationshipNamed_AttributeRelTNC.setNodeConfig( theCtxt, aAttributeNCTerm);

		aReplicateBranchMgr_replicatedMetaRelationship_RelationshipRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ReplicateBranchMgr_replicatedMetaRelationship_RelationshipRelTNC"));
		aReplicateBranchMgr_replicatedMetaRelationship_RelationshipRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		aReplicateBranchMgr_replicatedMetaRelationship_RelationshipRelTNC.setNodeConfig( theCtxt, aRelationshipNCTerm);

		aReplicateNodeMgr_replicatedMetaType_TypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ReplicateNodeMgr_replicatedMetaType_TypeRelTNC"));
		aReplicateNodeMgr_replicatedMetaType_TypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		aReplicateNodeMgr_replicatedMetaType_TypeRelTNC.setNodeConfig( theCtxt, aTypeNCTerm);

		aModel_treeRootType_TypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Model_treeRootType_TypeRelTNC"));
		aModel_treeRootType_TypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		aModel_treeRootType_TypeRelTNC.setNodeConfig( theCtxt, aTypeNCTerm);

		aModel_traversalConfigs_TraversalConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Model_traversalConfigs_TraversalConfigRelTNC"));
		aModel_traversalConfigs_TraversalConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "TraversalConfig", "traversal"));
		aModel_traversalConfigs_TraversalConfigRelTNC.setNodeConfig( theCtxt, aTraversalConfigNC);

		aModel_traversalConfigs_ProjectionConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Model_traversalConfigs_ProjectionConfigRelTNC"));
		aModel_traversalConfigs_ProjectionConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		aModel_traversalConfigs_ProjectionConfigRelTNC.setNodeConfig( theCtxt, aProjectionConfigNC);

		aModule_subModules_ModuleRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Module_subModules_ModuleRelTNC"));
		aModule_subModules_ModuleRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Module", "core"));
		aModule_subModules_ModuleRelTNC.setNodeConfig( theCtxt, aModuleNC);

		aModule_subModules_ModelRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Module_subModules_ModelRelTNC"));
		aModule_subModules_ModelRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Model", "core"));
		aModule_subModules_ModelRelTNC.setNodeConfig( theCtxt, aModelNC);

		aModule_types_TypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Module_types_TypeRelTNC"));
		aModule_types_TypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		aModule_types_TypeRelTNC.setNodeConfig( theCtxt, aTypeNC);

		aType_inverseOFmetaType_NodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_inverseOFmetaType_NodeConfigRelTNC"));
		aType_inverseOFmetaType_NodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "NodeConfig", "traversal"));
		aType_inverseOFmetaType_NodeConfigRelTNC.setNodeConfig( theCtxt, aNodeConfigNCTerm);

		aType_inverse1OFmetaType_RootTypeNodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_inverse1OFmetaType_RootTypeNodeConfigRelTNC"));
		aType_inverse1OFmetaType_RootTypeNodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RootTypeNodeConfig", "traversal"));
		aType_inverse1OFmetaType_RootTypeNodeConfigRelTNC.setNodeConfig( theCtxt, aRootTypeNodeConfigNCTerm);

		aType_inverse1OFmetaType_RelatedTypeNodeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_inverse1OFmetaType_RelatedTypeNodeConfigRelTNC"));
		aType_inverse1OFmetaType_RelatedTypeNodeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelatedTypeNodeConfig", "traversal"));
		aType_inverse1OFmetaType_RelatedTypeNodeConfigRelTNC.setNodeConfig( theCtxt, aRelatedTypeNodeConfigNCTerm);

		aType_inverseOFreplicatedMetaType_ReplicateNodeMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_inverseOFreplicatedMetaType_ReplicateNodeMgrRelTNC"));
		aType_inverseOFreplicatedMetaType_ReplicateNodeMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateNodeMgr", "replication"));
		aType_inverseOFreplicatedMetaType_ReplicateNodeMgrRelTNC.setNodeConfig( theCtxt, aReplicateNodeMgrNCTerm);

		aType_inverseOFprojectionType_ProjectionConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_inverseOFprojectionType_ProjectionConfigRelTNC"));
		aType_inverseOFprojectionType_ProjectionConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		aType_inverseOFprojectionType_ProjectionConfigRelTNC.setNodeConfig( theCtxt, aProjectionConfigNCTerm);

		aType_inverseOFexclusionType_ProjectionConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_inverseOFexclusionType_ProjectionConfigRelTNC"));
		aType_inverseOFexclusionType_ProjectionConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		aType_inverseOFexclusionType_ProjectionConfigRelTNC.setNodeConfig( theCtxt, aProjectionConfigNCTerm);

		aType_attributes_AttributeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_attributes_AttributeRelTNC"));
		aType_attributes_AttributeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core"));
		aType_attributes_AttributeRelTNC.setNodeConfig( theCtxt, aAttributeNC);

		aType_typeOfValues_AttributeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_typeOfValues_AttributeRelTNC"));
		aType_typeOfValues_AttributeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core"));
		aType_typeOfValues_AttributeRelTNC.setNodeConfig( theCtxt, aAttributeNCTerm);

		aType_superTypes_TypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_superTypes_TypeRelTNC"));
		aType_superTypes_TypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		aType_superTypes_TypeRelTNC.setNodeConfig( theCtxt, aTypeNCTerm);

		aType_subTypes_TypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_subTypes_TypeRelTNC"));
		aType_subTypes_TypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		aType_subTypes_TypeRelTNC.setNodeConfig( theCtxt, aTypeNCTerm);

		aType_relationships_RelationshipRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_relationships_RelationshipRelTNC"));
		aType_relationships_RelationshipRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		aType_relationships_RelationshipRelTNC.setNodeConfig( theCtxt, aRelationshipNC);

		aType_relatedWith_RelationshipRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_relatedWith_RelationshipRelTNC"));
		aType_relatedWith_RelationshipRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		aType_relatedWith_RelationshipRelTNC.setNodeConfig( theCtxt, aRelationshipNCTerm);

		aType_rootTypeOfModel_ModelRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Type_rootTypeOfModel_ModelRelTNC"));
		aType_rootTypeOfModel_ModelRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Model", "core"));
		aType_rootTypeOfModel_ModelRelTNC.setNodeConfig( theCtxt, aModelNCTerm);

		aRelationship_inverseOFmetaRelationship_BranchConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Relationship_inverseOFmetaRelationship_BranchConfigRelTNC"));
		aRelationship_inverseOFmetaRelationship_BranchConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BranchConfig", "traversal"));
		aRelationship_inverseOFmetaRelationship_BranchConfigRelTNC.setNodeConfig( theCtxt, aBranchConfigNCTerm);

		aRelationship_inverseOFreplicatedMetaRelationship_ReplicateBranchMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Relationship_inverseOFreplicatedMetaRelationship_ReplicateBranchMgrRelTNC"));
		aRelationship_inverseOFreplicatedMetaRelationship_ReplicateBranchMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReplicateBranchMgr", "replication"));
		aRelationship_inverseOFreplicatedMetaRelationship_ReplicateBranchMgrRelTNC.setNodeConfig( theCtxt, aReplicateBranchMgrNCTerm);

		aRelationship_inverseOFtargetToTransfomations_ProjectionConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Relationship_inverseOFtargetToTransfomations_ProjectionConfigRelTNC"));
		aRelationship_inverseOFtargetToTransfomations_ProjectionConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		aRelationship_inverseOFtargetToTransfomations_ProjectionConfigRelTNC.setNodeConfig( theCtxt, aProjectionConfigNCTerm);

		aRelationship_inverseOFprojectionToOriginals_ProjectionConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Relationship_inverseOFprojectionToOriginals_ProjectionConfigRelTNC"));
		aRelationship_inverseOFprojectionToOriginals_ProjectionConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		aRelationship_inverseOFprojectionToOriginals_ProjectionConfigRelTNC.setNodeConfig( theCtxt, aProjectionConfigNCTerm);

		aRelationship_inverseOFprojectedToProjections_ProjectionConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Relationship_inverseOFprojectedToProjections_ProjectionConfigRelTNC"));
		aRelationship_inverseOFprojectedToProjections_ProjectionConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		aRelationship_inverseOFprojectedToProjections_ProjectionConfigRelTNC.setNodeConfig( theCtxt, aProjectionConfigNCTerm);

		aRelationship_inverseOFtransformationToSources_ProjectionConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Relationship_inverseOFtransformationToSources_ProjectionConfigRelTNC"));
		aRelationship_inverseOFtransformationToSources_ProjectionConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		aRelationship_inverseOFtransformationToSources_ProjectionConfigRelTNC.setNodeConfig( theCtxt, aProjectionConfigNCTerm);

		aRelationship_inverseOFtransformationToSubTransformations_ProjectionConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Relationship_inverseOFtransformationToSubTransformations_ProjectionConfigRelTNC"));
		aRelationship_inverseOFtransformationToSubTransformations_ProjectionConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		aRelationship_inverseOFtransformationToSubTransformations_ProjectionConfigRelTNC.setNodeConfig( theCtxt, aProjectionConfigNCTerm);

		aRelationship_inverse_RelationshipRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Relationship_inverse_RelationshipRelTNC"));
		aRelationship_inverse_RelationshipRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relationship", "core"));
		aRelationship_inverse_RelationshipRelTNC.setNodeConfig( theCtxt, aRelationshipNCTerm);

		aRelationship_relatedType_TypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Relationship_relatedType_TypeRelTNC"));
		aRelationship_relatedType_TypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		aRelationship_relatedType_TypeRelTNC.setNodeConfig( theCtxt, aTypeNCTerm);

		aAttribute_inverseOFmetaAttribute_AttributeConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Attribute_inverseOFmetaAttribute_AttributeConfigRelTNC"));
		aAttribute_inverseOFmetaAttribute_AttributeConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeConfig", "traversal"));
		aAttribute_inverseOFmetaAttribute_AttributeConfigRelTNC.setNodeConfig( theCtxt, aAttributeConfigNCTerm);

		aAttribute_inverseOFcopiedMetaAttribute_CopyFieldMgrRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Attribute_inverseOFcopiedMetaAttribute_CopyFieldMgrRelTNC"));
		aAttribute_inverseOFcopiedMetaAttribute_CopyFieldMgrRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "CopyFieldMgr", "traversal"));
		aAttribute_inverseOFcopiedMetaAttribute_CopyFieldMgrRelTNC.setNodeConfig( theCtxt, aCopyFieldMgrNCTerm);

		aAttribute_inverseOFexcludedInRelationshipNamed_ProjectionConfigRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Attribute_inverseOFexcludedInRelationshipNamed_ProjectionConfigRelTNC"));
		aAttribute_inverseOFexcludedInRelationshipNamed_ProjectionConfigRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectionConfig", "projection"));
		aAttribute_inverseOFexcludedInRelationshipNamed_ProjectionConfigRelTNC.setNodeConfig( theCtxt, aProjectionConfigNCTerm);

		aAttribute_valueType_TypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Attribute_valueType_TypeRelTNC"));
		aAttribute_valueType_TypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Type", "core"));
		aAttribute_valueType_TypeRelTNC.setNodeConfig( theCtxt, aTypeNCTerm);

		aElement_parameters_ParameterRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Element_parameters_ParameterRelTNC"));
		aElement_parameters_ParameterRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Parameter", "core"));
		aElement_parameters_ParameterRelTNC.setNodeConfig( theCtxt, aParameterNC);

		aElement_comments_CommentRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Element_comments_CommentRelTNC"));
		aElement_comments_CommentRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Comment", "core"));
		aElement_comments_CommentRelTNC.setNodeConfig( theCtxt, aCommentNC);


  }


  protected void initAttributeCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Attribute configs  instantiations
   *******************************************************/

  }


  protected void initFieldMgrsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException  {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Field mgrs  instantiations
   *******************************************************/

  }


  protected void initNodeCfgsInitializations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Node configs
   *******************************************************/
		aRootTypeNodeConfigNC.addBranchConfigs( theCtxt, aTypeNodeConfig_metaTypeBC);
		aRootTypeNodeConfigNC.addBranchConfigs( theCtxt, aTypeNodeConfig_nodeConfigBC);
		aRootTypeNodeConfigNC.addBranchConfigs( theCtxt, aConfigOverride_overrideWithBC);

		aNodeConfigNC.addBranchConfigs( theCtxt, aNodeConfig_attributeConfigsBC);
		aNodeConfigNC.addBranchConfigs( theCtxt, aNodeConfig_branchConfigsBC);
//		aNodeConfigNC.addBranchConfigs( theCtxt, aNodeConfig_inverseOFnodeConfigBC);
		aNodeConfigNC.addBranchConfigs( theCtxt, aNodeConfig_metaNodeMgrBC);
		aNodeConfigNC.addBranchConfigs( theCtxt, aNodeConfig_metaTypeBC);
		aNodeConfigNC.addBranchConfigs( theCtxt, aConfigOverride_overrideWithBC);

//		aBranchConfigNC.addBranchConfigs( theCtxt, aBranchConfig_inverseOFbranchConfigsBC);
		aBranchConfigNC.addBranchConfigs( theCtxt, aBranchConfig_metaBranchMgrBC);
		aBranchConfigNC.addBranchConfigs( theCtxt, aBranchConfig_metaRelationshipBC);
		aBranchConfigNC.addBranchConfigs( theCtxt, aConfigOverride_overrideWithBC);
		aBranchConfigNC.addBranchConfigs( theCtxt, aBranchConfig_typeNodeConfigsBC);

		aRelatedTypeNodeConfigNC.addBranchConfigs( theCtxt, aRelatedTypeNodeConfig_filterBC);
		aRelatedTypeNodeConfigNC.addBranchConfigs( theCtxt, aTypeNodeConfig_metaTypeBC);
		aRelatedTypeNodeConfigNC.addBranchConfigs( theCtxt, aTypeNodeConfig_nodeConfigBC);
		aRelatedTypeNodeConfigNC.addBranchConfigs( theCtxt, aConfigOverride_overrideWithBC);

		aTraversalConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_attributeConfigsBC);
		aTraversalConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_branchConfigsBC);
		aTraversalConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_branchMgrsBC);
		aTraversalConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_configOverridesBC);
		aTraversalConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_fieldMgrsBC);
		aTraversalConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_nodeConfigsBC);
		aTraversalConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_nodeMgrsBC);
		aTraversalConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_rootTypeNodeConfigsBC);

//		aAttributeConfigNC.addBranchConfigs( theCtxt, aAttributeConfig_inverseOFattributeConfigsBC);
		aAttributeConfigNC.addBranchConfigs( theCtxt, aAttributeConfig_metaAttributeBC);
		aAttributeConfigNC.addBranchConfigs( theCtxt, aAttributeConfig_metaFieldMgrBC);

//		aNodeMgrNC.addBranchConfigs( theCtxt, aNodeMgr_inverseOFmetaNodeMgrBC);

//		aBranchMgrNC.addBranchConfigs( theCtxt, aBranchMgr_inverseOFmetaBranchMgrBC);

//		aFieldMgrNC.addBranchConfigs( theCtxt, aFieldMgr_inverseOFmetaFieldMgrBC);

		aCopyFieldMgrNC.addBranchConfigs( theCtxt, aCopyFieldMgr_copiedMetaAttributeBC);
//		aCopyFieldMgrNC.addBranchConfigs( theCtxt, aFieldMgr_inverseOFmetaFieldMgrBC);


		aProjectionConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_attributeConfigsBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_branchConfigsBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_branchMgrsBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_configOverridesBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aProjectionConfig_excludedInRelationshipNamedBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aProjectionConfig_exclusionTypeBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_fieldMgrsBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_nodeConfigsBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_nodeMgrsBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aProjectionConfig_projectedToProjectionsBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aProjectionConfig_projectionToOriginalsBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aProjectionConfig_projectionTypeBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aTraversalConfig_rootTypeNodeConfigsBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aProjectionConfig_targetToTransfomationsBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aProjectionConfig_transformationToSourcesBC);
		aProjectionConfigNC.addBranchConfigs( theCtxt, aProjectionConfig_transformationToSubTransformationsBC);

//		aReplicateBranchMgrNC.addBranchConfigs( theCtxt, aBranchMgr_inverseOFmetaBranchMgrBC);
		aReplicateBranchMgrNC.addBranchConfigs( theCtxt, aReplicateBranchMgr_replicatedMetaRelationshipBC);

//		aReplicateNodeMgrNC.addBranchConfigs( theCtxt, aNodeMgr_inverseOFmetaNodeMgrBC);
		aReplicateNodeMgrNC.addBranchConfigs( theCtxt, aReplicateNodeMgr_replicatedMetaTypeBC);

		aModelNC.addBranchConfigs( theCtxt, aElement_commentsBC);
		aModelNC.addBranchConfigs( theCtxt, aElement_parametersBC);
		aModelNC.addBranchConfigs( theCtxt, aModule_subModulesBC);
		aModelNC.addBranchConfigs( theCtxt, aModel_traversalConfigsBC);
		aModelNC.addBranchConfigs( theCtxt, aModel_treeRootTypeBC);
		aModelNC.addBranchConfigs( theCtxt, aModule_typesBC);

		aModuleNC.addBranchConfigs( theCtxt, aElement_commentsBC);
		aModuleNC.addBranchConfigs( theCtxt, aElement_parametersBC);
		aModuleNC.addBranchConfigs( theCtxt, aModule_subModulesBC);
		aModuleNC.addBranchConfigs( theCtxt, aModule_typesBC);

		aTypeNC.addBranchConfigs( theCtxt, aType_attributesBC);
		aTypeNC.addBranchConfigs( theCtxt, aElement_commentsBC);
//		aTypeNC.addBranchConfigs( theCtxt, aType_inverse1OFmetaTypeBC);
//		aTypeNC.addBranchConfigs( theCtxt, aType_inverseOFexclusionTypeBC);
//		aTypeNC.addBranchConfigs( theCtxt, aType_inverseOFmetaTypeBC);
//		aTypeNC.addBranchConfigs( theCtxt, aType_inverseOFprojectionTypeBC);
//		aTypeNC.addBranchConfigs( theCtxt, aType_inverseOFreplicatedMetaTypeBC);
		aTypeNC.addBranchConfigs( theCtxt, aElement_parametersBC);
		aTypeNC.addBranchConfigs( theCtxt, aType_relatedWithBC);
		aTypeNC.addBranchConfigs( theCtxt, aType_relationshipsBC);
		aTypeNC.addBranchConfigs( theCtxt, aType_rootTypeOfModelBC);
		aTypeNC.addBranchConfigs( theCtxt, aType_subTypesBC);
		aTypeNC.addBranchConfigs( theCtxt, aType_superTypesBC);
		aTypeNC.addBranchConfigs( theCtxt, aType_typeOfValuesBC);

		aRelationshipNC.addBranchConfigs( theCtxt, aElement_commentsBC);
		aRelationshipNC.addBranchConfigs( theCtxt, aRelationship_inverseBC);
//		aRelationshipNC.addBranchConfigs( theCtxt, aRelationship_inverseOFmetaRelationshipBC);
//		aRelationshipNC.addBranchConfigs( theCtxt, aRelationship_inverseOFprojectedToProjectionsBC);
//		aRelationshipNC.addBranchConfigs( theCtxt, aRelationship_inverseOFprojectionToOriginalsBC);
//		aRelationshipNC.addBranchConfigs( theCtxt, aRelationship_inverseOFreplicatedMetaRelationshipBC);
//		aRelationshipNC.addBranchConfigs( theCtxt, aRelationship_inverseOFtargetToTransfomationsBC);
//		aRelationshipNC.addBranchConfigs( theCtxt, aRelationship_inverseOFtransformationToSourcesBC);
//		aRelationshipNC.addBranchConfigs( theCtxt, aRelationship_inverseOFtransformationToSubTransformationsBC);
		aRelationshipNC.addBranchConfigs( theCtxt, aElement_parametersBC);
		aRelationshipNC.addBranchConfigs( theCtxt, aRelationship_relatedTypeBC);

		aStructuralFeatureNC.addBranchConfigs( theCtxt, aElement_commentsBC);
		aStructuralFeatureNC.addBranchConfigs( theCtxt, aElement_parametersBC);

		aAttributeNC.addBranchConfigs( theCtxt, aElement_commentsBC);
//		aAttributeNC.addBranchConfigs( theCtxt, aAttribute_inverseOFcopiedMetaAttributeBC);
//		aAttributeNC.addBranchConfigs( theCtxt, aAttribute_inverseOFexcludedInRelationshipNamedBC);
//		aAttributeNC.addBranchConfigs( theCtxt, aAttribute_inverseOFmetaAttributeBC);
		aAttributeNC.addBranchConfigs( theCtxt, aElement_parametersBC);
		aAttributeNC.addBranchConfigs( theCtxt, aAttribute_valueTypeBC);

		aParameterNC.addBranchConfigs( theCtxt, aElement_commentsBC);
		aParameterNC.addBranchConfigs( theCtxt, aElement_parametersBC);

		aCommentNC.addBranchConfigs( theCtxt, aElement_commentsBC);
		aCommentNC.addBranchConfigs( theCtxt, aElement_parametersBC);

		aElementNC.addBranchConfigs( theCtxt, aElement_commentsBC);
		aElementNC.addBranchConfigs( theCtxt, aElement_parametersBC);


  }


  protected void initBranchCfgsInitializations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model)  throws EAIException  {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Branch configs
   *******************************************************/
		aNodeConfig_branchConfigsBC.addTypeNodeConfigs( theCtxt, aNodeConfig_branchConfigs_BranchConfigRelTNC);

		aNodeConfig_attributeConfigsBC.addTypeNodeConfigs( theCtxt, aNodeConfig_attributeConfigs_AttributeConfigRelTNC);

		aNodeConfig_metaTypeBC.addTypeNodeConfigs( theCtxt, aNodeConfig_metaType_TypeRelTNC);

		aNodeConfig_metaNodeMgrBC.addTypeNodeConfigs( theCtxt, aNodeConfig_metaNodeMgr_NodeMgrRelTNC);
		aNodeConfig_metaNodeMgrBC.addTypeNodeConfigs( theCtxt, aNodeConfig_metaNodeMgr_ReplicateNodeMgrRelTNC);

		aNodeConfig_inverseOFnodeConfigBC.addTypeNodeConfigs( theCtxt, aNodeConfig_inverseOFnodeConfig_RootTypeNodeConfigRelTNC);
		aNodeConfig_inverseOFnodeConfigBC.addTypeNodeConfigs( theCtxt, aNodeConfig_inverseOFnodeConfig_RelatedTypeNodeConfigRelTNC);

		aBranchConfig_inverseOFbranchConfigsBC.addTypeNodeConfigs( theCtxt, aBranchConfig_inverseOFbranchConfigs_NodeConfigRelTNC);

		aBranchConfig_metaRelationshipBC.addTypeNodeConfigs( theCtxt, aBranchConfig_metaRelationship_RelationshipRelTNC);

		aBranchConfig_typeNodeConfigsBC.addTypeNodeConfigs( theCtxt, aBranchConfig_typeNodeConfigs_RelatedTypeNodeConfigRelTNC);

		aBranchConfig_metaBranchMgrBC.addTypeNodeConfigs( theCtxt, aBranchConfig_metaBranchMgr_BranchMgrRelTNC);
		aBranchConfig_metaBranchMgrBC.addTypeNodeConfigs( theCtxt, aBranchConfig_metaBranchMgr_ReplicateBranchMgrRelTNC);

		aTypeNodeConfig_metaTypeBC.addTypeNodeConfigs( theCtxt, aTypeNodeConfig_metaType_TypeRelTNC);

		aTypeNodeConfig_nodeConfigBC.addTypeNodeConfigs( theCtxt, aTypeNodeConfig_nodeConfig_NodeConfigRelTNC);

		aRelatedTypeNodeConfig_filterBC.addTypeNodeConfigs( theCtxt, aRelatedTypeNodeConfig_filter_FilterRelTNC);

		aTraversalConfig_rootTypeNodeConfigsBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_rootTypeNodeConfigs_RootTypeNodeConfigRelTNC);

		aTraversalConfig_branchConfigsBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_branchConfigs_BranchConfigRelTNC);

		aTraversalConfig_nodeConfigsBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_nodeConfigs_NodeConfigRelTNC);

		aTraversalConfig_attributeConfigsBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_attributeConfigs_AttributeConfigRelTNC);

		aTraversalConfig_configOverridesBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_configOverrides_BranchConfigRelTNC);
		aTraversalConfig_configOverridesBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_configOverrides_NodeConfigRelTNC);
		aTraversalConfig_configOverridesBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_configOverrides_RootTypeNodeConfigRelTNC);
		aTraversalConfig_configOverridesBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_configOverrides_RelatedTypeNodeConfigRelTNC);

		aTraversalConfig_fieldMgrsBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_fieldMgrs_FieldMgrRelTNC);
		aTraversalConfig_fieldMgrsBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_fieldMgrs_CopyFieldMgrRelTNC);

		aTraversalConfig_branchMgrsBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_branchMgrs_BranchMgrRelTNC);
		aTraversalConfig_branchMgrsBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_branchMgrs_ReplicateBranchMgrRelTNC);

		aTraversalConfig_nodeMgrsBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_nodeMgrs_NodeMgrRelTNC);
		aTraversalConfig_nodeMgrsBC.addTypeNodeConfigs( theCtxt, aTraversalConfig_nodeMgrs_ReplicateNodeMgrRelTNC);

		aAttributeConfig_inverseOFattributeConfigsBC.addTypeNodeConfigs( theCtxt, aAttributeConfig_inverseOFattributeConfigs_NodeConfigRelTNC);

		aAttributeConfig_metaAttributeBC.addTypeNodeConfigs( theCtxt, aAttributeConfig_metaAttribute_AttributeRelTNC);

		aAttributeConfig_metaFieldMgrBC.addTypeNodeConfigs( theCtxt, aAttributeConfig_metaFieldMgr_FieldMgrRelTNC);
		aAttributeConfig_metaFieldMgrBC.addTypeNodeConfigs( theCtxt, aAttributeConfig_metaFieldMgr_CopyFieldMgrRelTNC);

		aConfigOverride_overrideWithBC.addTypeNodeConfigs( theCtxt, aConfigOverride_overrideWith_TraversalConfigRelTNC);
		aConfigOverride_overrideWithBC.addTypeNodeConfigs( theCtxt, aConfigOverride_overrideWith_ProjectionConfigRelTNC);

		aNodeMgr_inverseOFmetaNodeMgrBC.addTypeNodeConfigs( theCtxt, aNodeMgr_inverseOFmetaNodeMgr_NodeConfigRelTNC);

		aBranchMgr_inverseOFmetaBranchMgrBC.addTypeNodeConfigs( theCtxt, aBranchMgr_inverseOFmetaBranchMgr_BranchConfigRelTNC);

		aFieldMgr_inverseOFmetaFieldMgrBC.addTypeNodeConfigs( theCtxt, aFieldMgr_inverseOFmetaFieldMgr_AttributeConfigRelTNC);

		aCopyFieldMgr_copiedMetaAttributeBC.addTypeNodeConfigs( theCtxt, aCopyFieldMgr_copiedMetaAttribute_AttributeRelTNC);

		aProjectionConfig_targetToTransfomationsBC.addTypeNodeConfigs( theCtxt, aProjectionConfig_targetToTransfomations_RelationshipRelTNC);

		aProjectionConfig_projectionToOriginalsBC.addTypeNodeConfigs( theCtxt, aProjectionConfig_projectionToOriginals_RelationshipRelTNC);

		aProjectionConfig_projectedToProjectionsBC.addTypeNodeConfigs( theCtxt, aProjectionConfig_projectedToProjections_RelationshipRelTNC);

		aProjectionConfig_transformationToSourcesBC.addTypeNodeConfigs( theCtxt, aProjectionConfig_transformationToSources_RelationshipRelTNC);

		aProjectionConfig_transformationToSubTransformationsBC.addTypeNodeConfigs( theCtxt, aProjectionConfig_transformationToSubTransformations_RelationshipRelTNC);

		aProjectionConfig_projectionTypeBC.addTypeNodeConfigs( theCtxt, aProjectionConfig_projectionType_TypeRelTNC);

		aProjectionConfig_exclusionTypeBC.addTypeNodeConfigs( theCtxt, aProjectionConfig_exclusionType_TypeRelTNC);

		aProjectionConfig_excludedInRelationshipNamedBC.addTypeNodeConfigs( theCtxt, aProjectionConfig_excludedInRelationshipNamed_AttributeRelTNC);

		aReplicateBranchMgr_replicatedMetaRelationshipBC.addTypeNodeConfigs( theCtxt, aReplicateBranchMgr_replicatedMetaRelationship_RelationshipRelTNC);

		aReplicateNodeMgr_replicatedMetaTypeBC.addTypeNodeConfigs( theCtxt, aReplicateNodeMgr_replicatedMetaType_TypeRelTNC);

		aModel_treeRootTypeBC.addTypeNodeConfigs( theCtxt, aModel_treeRootType_TypeRelTNC);

		aModel_traversalConfigsBC.addTypeNodeConfigs( theCtxt, aModel_traversalConfigs_TraversalConfigRelTNC);
		aModel_traversalConfigsBC.addTypeNodeConfigs( theCtxt, aModel_traversalConfigs_ProjectionConfigRelTNC);

		aModule_subModulesBC.addTypeNodeConfigs( theCtxt, aModule_subModules_ModuleRelTNC);
		aModule_subModulesBC.addTypeNodeConfigs( theCtxt, aModule_subModules_ModelRelTNC);

		aModule_typesBC.addTypeNodeConfigs( theCtxt, aModule_types_TypeRelTNC);

		aType_inverseOFmetaTypeBC.addTypeNodeConfigs( theCtxt, aType_inverseOFmetaType_NodeConfigRelTNC);

		aType_inverse1OFmetaTypeBC.addTypeNodeConfigs( theCtxt, aType_inverse1OFmetaType_RootTypeNodeConfigRelTNC);
		aType_inverse1OFmetaTypeBC.addTypeNodeConfigs( theCtxt, aType_inverse1OFmetaType_RelatedTypeNodeConfigRelTNC);

		aType_inverseOFreplicatedMetaTypeBC.addTypeNodeConfigs( theCtxt, aType_inverseOFreplicatedMetaType_ReplicateNodeMgrRelTNC);

		aType_inverseOFprojectionTypeBC.addTypeNodeConfigs( theCtxt, aType_inverseOFprojectionType_ProjectionConfigRelTNC);

		aType_inverseOFexclusionTypeBC.addTypeNodeConfigs( theCtxt, aType_inverseOFexclusionType_ProjectionConfigRelTNC);

		aType_attributesBC.addTypeNodeConfigs( theCtxt, aType_attributes_AttributeRelTNC);

		aType_typeOfValuesBC.addTypeNodeConfigs( theCtxt, aType_typeOfValues_AttributeRelTNC);

		aType_superTypesBC.addTypeNodeConfigs( theCtxt, aType_superTypes_TypeRelTNC);

		aType_subTypesBC.addTypeNodeConfigs( theCtxt, aType_subTypes_TypeRelTNC);

		aType_relationshipsBC.addTypeNodeConfigs( theCtxt, aType_relationships_RelationshipRelTNC);

		aType_relatedWithBC.addTypeNodeConfigs( theCtxt, aType_relatedWith_RelationshipRelTNC);

		aType_rootTypeOfModelBC.addTypeNodeConfigs( theCtxt, aType_rootTypeOfModel_ModelRelTNC);

		aRelationship_inverseOFmetaRelationshipBC.addTypeNodeConfigs( theCtxt, aRelationship_inverseOFmetaRelationship_BranchConfigRelTNC);

		aRelationship_inverseOFreplicatedMetaRelationshipBC.addTypeNodeConfigs( theCtxt, aRelationship_inverseOFreplicatedMetaRelationship_ReplicateBranchMgrRelTNC);

		aRelationship_inverseOFtargetToTransfomationsBC.addTypeNodeConfigs( theCtxt, aRelationship_inverseOFtargetToTransfomations_ProjectionConfigRelTNC);

		aRelationship_inverseOFprojectionToOriginalsBC.addTypeNodeConfigs( theCtxt, aRelationship_inverseOFprojectionToOriginals_ProjectionConfigRelTNC);

		aRelationship_inverseOFprojectedToProjectionsBC.addTypeNodeConfigs( theCtxt, aRelationship_inverseOFprojectedToProjections_ProjectionConfigRelTNC);

		aRelationship_inverseOFtransformationToSourcesBC.addTypeNodeConfigs( theCtxt, aRelationship_inverseOFtransformationToSources_ProjectionConfigRelTNC);

		aRelationship_inverseOFtransformationToSubTransformationsBC.addTypeNodeConfigs( theCtxt, aRelationship_inverseOFtransformationToSubTransformations_ProjectionConfigRelTNC);

		aRelationship_inverseBC.addTypeNodeConfigs( theCtxt, aRelationship_inverse_RelationshipRelTNC);

		aRelationship_relatedTypeBC.addTypeNodeConfigs( theCtxt, aRelationship_relatedType_TypeRelTNC);

		aAttribute_inverseOFmetaAttributeBC.addTypeNodeConfigs( theCtxt, aAttribute_inverseOFmetaAttribute_AttributeConfigRelTNC);

		aAttribute_inverseOFcopiedMetaAttributeBC.addTypeNodeConfigs( theCtxt, aAttribute_inverseOFcopiedMetaAttribute_CopyFieldMgrRelTNC);

		aAttribute_inverseOFexcludedInRelationshipNamedBC.addTypeNodeConfigs( theCtxt, aAttribute_inverseOFexcludedInRelationshipNamed_ProjectionConfigRelTNC);

		aAttribute_valueTypeBC.addTypeNodeConfigs( theCtxt, aAttribute_valueType_TypeRelTNC);

		aElement_parametersBC.addTypeNodeConfigs( theCtxt, aElement_parameters_ParameterRelTNC);

		aElement_commentsBC.addTypeNodeConfigs( theCtxt, aElement_comments_CommentRelTNC);


  }



}


