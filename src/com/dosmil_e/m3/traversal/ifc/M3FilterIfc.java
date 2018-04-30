package com.dosmil_e.m3.traversal.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3FilterIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3Filter
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3Filter
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to ONE relationship RelatedTypeNodeConfig
 ****************************************************************************/


    /* Public Read accessor for role RelatedTypeNodeConfig
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc getRelatedTypeNodeConfig( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public RelatedTypeNodeConfig number access
     */
  public int numRelatedTypeNodeConfig( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public RelatedTypeNodeConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc getRelatedTypeNodeConfigAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public RelatedTypeNodeConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc findRelatedTypeNodeConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public RelatedTypeNodeConfig is related predicate
     */
  public boolean hasRelatedTypeNodeConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional RelatedTypeNodeConfig is related  predicate
     */
  public boolean hasRelatedTypeNodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelatedTypeNodeConfig) throws EAIException;

    /* Public RelatedTypeNodeConfig index access
     */
  public int indexOfRelatedTypeNodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelatedTypeNodeConfig) throws EAIException;

    /* Public Write accessor for role RelatedTypeNodeConfig
     * Machinery in RelatedTypeNodeConfig drives the collection operations
     */
  public void setRelatedTypeNodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelatedTypeNodeConfig) throws EAIException;







}
