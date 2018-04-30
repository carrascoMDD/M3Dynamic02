package com.dosmil_e.m3.withm3.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;


import com.dosmil_e.modelbase.ifc.EAIMMElementIfc;


public interface MMElementWithM3Ifc
    extends com.dosmil_e.modelbase.ifc.EAIMMElementIfc  {


  public com.dosmil_e.m3.core.ifc.M3ModelIfc getM3Model( EAIMMCtxtIfc theCtxt);
  public com.dosmil_e.m3.core.ifc.M3TypeIfc  getM3Type(  EAIMMCtxtIfc theCtxt);






/****************************************************************************
 *  Implementation of public interface for MANY relationship
 ****************************************************************************/


    /* Public Read accessor for role M3RelationshipOp
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public EAIMMElementIfc[] getM3RelationshipManyOp(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship) throws EAIException;

    /* Public M3RelationshipOp number access
     */
  public int numM3RelationshipOp(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship) throws EAIException;

    /* Public M3RelationshipOp read accessor by index
     */
  public EAIMMElementIfc getM3RelationshipOpAt(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    int                                         theIndex) throws EAIException;

    /* Public M3RelationshipOp finder by name
     */
  public EAIMMElementIfc findM3RelationshipOpNamed(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMNameIfc                                theMMName) throws EAIException;
    /* Public M3RelationshipOp finder predicate by name
     */
  public boolean hasM3RelationshipOpNamed(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMNameIfc                                theMMName) throws EAIException;
    /* Public M3RelationshipOp is related predicate
     */
  public boolean hasM3RelationshipOp(
    EAIMMCtxtIfc                                theCtxt,

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                             theRelated) throws EAIException;

    /* Public M3RelationshipOp index access
     */
  public int indexOfM3RelationshipOp(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                              theRelated) throws EAIException;

    /* Public Write accessor for role M3RelationshipOp
     */
  public void addM3RelationshipOp(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                              theRelated) throws EAIException;

    /* Public ordered Write accessor for role M3RelationshipOp
     */
  public void addM3RelationshipOpBefore(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                              theRelated,
    EAIMMElementIfc                              theRelativeRelated) throws EAIException;

    /* Public reorder accessor for role M3RelationshipOp
     */
  public void moveM3RelationshipOpBefore(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                              theRelated,
    EAIMMElementIfc                              theRelativeRelated) throws EAIException;

    /* Public move to last accessor for role M3RelationshipOp
     */
  public void moveM3RelationshipOpToLast(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                              theRelated) throws EAIException ;

    /* Public Write accessor for role M3RelationshipOp
     */
  public void removeM3RelationshipOp(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                              theRelated) throws EAIException;

}
