package com.dosmil_e.m3.visit;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class M3TraversalConfigCache implements M3TraversalConfigCacheIfc   {




/****************************************************************************
 *  Constructors of the M3TraversalConfigCache
 ****************************************************************************/

  public M3TraversalConfigCache( com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theCachedTraversalConfig) {
    vCachedTraversalConfig = theCachedTraversalConfig;
  }


/****************************************************************************
 *  Implementation of public TraversalConfigCache interface
 ****************************************************************************/



  protected static final int sRelatedTypeNodeConfigsCacheInitialSize = 97;

  protected com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  vCachedTraversalConfig;
  protected java.util.Hashtable                                 vRootTypeNodeConfigsCache;
  protected java.util.Hashtable                                 vRelatedTypeNodeConfigsCache;


  public com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc getRootTypeNodeConfigFor(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theCtxt == null)                    { return null;}
    if( theSourceMMElement == null)         { return null;}

    if( vCachedTraversalConfig == null)     { return null;}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = theSourceMMElement.getM3Type( theCtxt);
    if( aType == null)                      { return null;}

      // Lazily initialize cache for lookup of RootTypeNodeConfigs by M3Type
    if( vRootTypeNodeConfigsCache == null) {

      com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] someRootTypeNodeCfgs =
         vCachedTraversalConfig.getRootTypeNodeConfigs( theCtxt);
      if( someRootTypeNodeCfgs == null) {
        vRootTypeNodeConfigsCache = new java.util.Hashtable( 3, (float) 0.5);
        return null;
      }

      int aNumRootTypeNodeCfgs = someRootTypeNodeCfgs.length;
      if( aNumRootTypeNodeCfgs < 1) {
        vRootTypeNodeConfigsCache = new java.util.Hashtable( 3, (float) 0.5);
        return null;
      }
      vRootTypeNodeConfigsCache = new java.util.Hashtable( 2 * aNumRootTypeNodeCfgs + 1, (float) 0.5);


      for( int anIndex = 0; anIndex < aNumRootTypeNodeCfgs; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aRootTypeNodeCfg = someRootTypeNodeCfgs[ anIndex];
        if( aRootTypeNodeCfg != null) {
          com.dosmil_e.m3.core.ifc.M3TypeIfc otherType = aRootTypeNodeCfg.getMetaType( theCtxt);
          if( otherType != null) {
            vRootTypeNodeConfigsCache.put( otherType, aRootTypeNodeCfg);
          }
        }
      }
    }


    if( vRootTypeNodeConfigsCache == null) { return null;}

      // Lookup of RootTyoeNodeConfigs by M3Type
    Object aRootTypeNodeConfigObject =  vRootTypeNodeConfigsCache.get( aType);
    if( aRootTypeNodeConfigObject == null) { return null;}
    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aRootTypeNodeConfig = null;
    try { aRootTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc) aRootTypeNodeConfigObject;} catch( ClassCastException anEx) {}
    return aRootTypeNodeConfig;
  }



  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc getRelatedTypeNodeConfigFor(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theRelatedMMElement) throws EAIException {

    if( theCtxt == null)              { return null;}
    if( theBranchCfg == null)         { return null;}
    if( theRelatedMMElement == null)  { return null;}

    if( vRelatedTypeNodeConfigsCache == null) {
      vRelatedTypeNodeConfigsCache = new java.util.Hashtable( sRelatedTypeNodeConfigsCacheInitialSize, (float) 0.5);
    }

    Object aBranchCfgCacheObject =  vRelatedTypeNodeConfigsCache.get( theBranchCfg);
    if( aBranchCfgCacheObject == theBranchCfg) { return null;}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = theRelatedMMElement.getM3Type( theCtxt);
    if( aType == null)                { return null;}


      // Lazily initialize cache for lookup of RelatedTypeNodeConfigs for specific BranchConfigs by M3Type
    java.util.Hashtable aBranchCfgCache = null;
    if( aBranchCfgCacheObject != null) {
      try {  aBranchCfgCache = (java.util.Hashtable) aBranchCfgCacheObject;} catch( ClassCastException anEx) {}
    }

    if( aBranchCfgCache == null) {

      com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] someRelatedTypeNodeCfgs =
        theBranchCfg.getTypeNodeConfigs( theCtxt);
      if( someRelatedTypeNodeCfgs == null) {
        vRelatedTypeNodeConfigsCache.put( theBranchCfg, theBranchCfg);
        return null;
      }

      int aNumRelatedTypeNodeCfgs = someRelatedTypeNodeCfgs.length;
      if( aNumRelatedTypeNodeCfgs < 1) {
        vRelatedTypeNodeConfigsCache.put( theBranchCfg, theBranchCfg);
        return null;
      }

      aBranchCfgCache = new java.util.Hashtable( 2 * aNumRelatedTypeNodeCfgs + 1, (float) 0.5);
      vRelatedTypeNodeConfigsCache.put( theBranchCfg, aBranchCfgCache);


      for( int anIndex = 0; anIndex < aNumRelatedTypeNodeCfgs; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aRelatedTypeNodeCfg = someRelatedTypeNodeCfgs[ anIndex];
        if( aRelatedTypeNodeCfg != null) {
          com.dosmil_e.m3.core.ifc.M3TypeIfc otherType = aRelatedTypeNodeCfg.getMetaType( theCtxt);
          if( otherType != null) {
            aBranchCfgCache.put( otherType, aRelatedTypeNodeCfg);
          }
        }
      }
    }


    if( aBranchCfgCache == null) { return null;}

    Object aRelatedTypeNodeConfigObject =  aBranchCfgCache.get( aType);
    if( aRelatedTypeNodeConfigObject == null) { return null;}

    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aRelatedTypeNodeConfig = null;
    try { aRelatedTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc) aRelatedTypeNodeConfigObject;} catch( ClassCastException anEx) {}
    return aRelatedTypeNodeConfig;
  }








}



