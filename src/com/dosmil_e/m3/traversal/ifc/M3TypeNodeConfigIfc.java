package com.dosmil_e.m3.traversal.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3TypeNodeConfigIfc
    extends     com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3TypeNodeConfig
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3TypeNodeConfig
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship MetaType
 ****************************************************************************/


    /* Public Read accessor for role MetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getMetaType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public MetaType number access
     */
  public int numMetaType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public MetaType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getMetaTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public MetaType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public MetaType is related predicate
     */
  public boolean hasMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional MetaType is related  predicate
     */
  public boolean hasMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theMetaType) throws EAIException;

    /* Public MetaType index access
     */
  public int indexOfMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theMetaType) throws EAIException;

    /* Public Write accessor for role MetaType
     * Machinery in MetaType drives the collection operations
     */
  public void setMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theMetaType) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship NodeConfig
 ****************************************************************************/


    /* Public Read accessor for role NodeConfig
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getNodeConfig( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public NodeConfig number access
     */
  public int numNodeConfig( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public NodeConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getNodeConfigAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public NodeConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findNodeConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public NodeConfig is related predicate
     */
  public boolean hasNodeConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional NodeConfig is related  predicate
     */
  public boolean hasNodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfig) throws EAIException;

    /* Public NodeConfig index access
     */
  public int indexOfNodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfig) throws EAIException;

    /* Public Write accessor for role NodeConfig
     * Machinery in NodeConfig drives the collection operations
     */
  public void setNodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfig) throws EAIException;







}
