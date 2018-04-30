package com.dosmil_e.m3.withm3.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.EAIMMElementIfc;

import java.lang.reflect.Field;

public class MMElementWithM3Base
   extends com.dosmil_e.modelbase.base.EAIMMElementBase
    implements com.dosmil_e.m3.withm3.priv.MMElementWithM3Priv  {


/****************************************************************************
 *  Static metainformation for Type of the metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  Constructors of the metamodel element
 ****************************************************************************/

  public MMElementWithM3Base() {
    super();
  }


  public MMElementWithM3Base( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public MMElementWithM3Base( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }





/****************************************************************************
 *  Access and initialization of metainformation the EAIProject metamodel element
 *    for initialization, delegates on the model's metamodel root, that will
 *    invoke metainfo initializers (phase1, phase2) on all the metamodel elements
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc getStaticM3Type( EAIMMCtxtIfc theCtxt) {
    return null;
  }


/****************************************************************************
 *  Access to metainformation for Type of the metamodel element
 ****************************************************************************/
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getM3Type( EAIMMCtxtIfc theCtxt) {
    return getStaticM3Type( theCtxt);
  }


  public com.dosmil_e.m3.core.ifc.M3ModelIfc getM3Model( EAIMMCtxtIfc theCtxt) {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = getM3Type( theCtxt);
    if( aType == null) { return null;}

    return ((com.dosmil_e.m3.core.pub.M3TypePub) aType).getModel( theCtxt);
  }





  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc getTreeRoot( EAIMMCtxtIfc theCtxt) {
    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = getM3Type( theCtxt);
    if( aType == null) { return null;}

    com.dosmil_e.m3.core.pub.M3TypePub aTypePub = null;
    try { aTypePub = (com.dosmil_e.m3.core.pub.M3TypePub) aType;} catch( ClassCastException anException) {}
    if( aTypePub == null) { return null;}

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRoot = null;
    try { aRoot =   aTypePub.getTreeRootForElement(theCtxt, this);} catch( EAIException anEx) {}

    return  aRoot;
  }









/****************************************************************************
 *  Implementation of public interface for MANY relationship M3RelationshipOp
 ****************************************************************************/


    /* Public Read accessor for role M3RelationshipOp
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public EAIMMElementIfc[] getM3RelationshipManyOp(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship) throws EAIException {

    if( theCtxt == null) { return null;}
    if( theRelationship == null) { return null;}
    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) theRelationship).getRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return null;}
  }





    /* Public M3RelationshipOp number access
     */
  public int numM3RelationshipOp(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship) throws EAIException {

    if( theCtxt == null) { return 0;}
    if( theRelationship == null) { return 0;}
    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) theRelationship).numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public M3RelationshipOp read accessor by index
     */
  public EAIMMElementIfc getM3RelationshipOpAt(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    int                                         theIndex) throws EAIException {

    if( theCtxt == null) { return null;}
    if( theRelationship == null) { return null;}
    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) theRelationship).getRelatedElementAt( theCtxt, this, theIndex);
    } catch( ClassCastException anEx) { return null;}
  }




    /* Public M3RelationshipOp finder by name
     */
  public EAIMMElementIfc findM3RelationshipOpNamed(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMNameIfc                                theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    if( theRelationship == null) { return null;}
    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) theRelationship).findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public M3RelationshipOp finder predicate by name
     */
  public boolean hasM3RelationshipOpNamed(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMNameIfc                                theMMName) throws EAIException {

    if( theCtxt == null) { return false;}
    if( theRelationship == null) { return false;}
    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) theRelationship).hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public M3RelationshipOp is related predicate
     */
  public boolean hasM3RelationshipOp(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                             theRelated) throws EAIException {

    if( theCtxt == null) { return false;}
    if( theRelationship == null) { return false;}
    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) theRelationship).hasRelatedElement( theCtxt, this, theRelated);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public M3RelationshipOp index access
     */
  public int indexOfM3RelationshipOp(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                              theRelated) throws EAIException {

    if( theCtxt == null) { return -1;}
    if( theRelationship == null) { return -1;}
    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) theRelationship).indexOfRelatedElement( theCtxt, this, theRelated);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role M3RelationshipOp
     */
  public void addM3RelationshipOp(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                              theRelated) throws EAIException {

    if( theCtxt == null) { return;}
    if( theRelationship == null) { return;}
    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) theRelationship).addRelatedElement( theCtxt, this, theRelated);
    } catch( ClassCastException anEx) { return;}
  }


    /* Public ordered Write accessor for role M3RelationshipOp
     */
  public void addM3RelationshipOpBefore(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                              theRelated,
    EAIMMElementIfc                              theRelativeRelated) throws EAIException {

    if( theCtxt == null) { return;}
    if( theRelationship == null) { return;}
    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) theRelationship).
        addRelatedElementBefore( theCtxt, this, theRelated, theRelativeRelated);
    } catch( ClassCastException anEx) { return;}
  }



    /* Public reorder accessor for role M3RelationshipOp
     */
  public void moveM3RelationshipOpBefore(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                              theRelated,
    EAIMMElementIfc                              theRelativeRelated) throws EAIException {


    if( theCtxt == null) { return;}
    if( theRelationship == null) { return;}
    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) theRelationship).
        moveRelatedElementBefore( theCtxt, this, theRelated, theRelativeRelated);
    } catch( ClassCastException anEx) { return;}
  }



    /* Public move to last accessor for role M3RelationshipOp
     */
  public void moveM3RelationshipOpToLast(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                              theRelated) throws EAIException {

    if( theCtxt == null) { return;}
    if( theRelationship == null) { return;}
    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) theRelationship).moveRelatedElementToLast( theCtxt, this, theRelated);
    } catch( ClassCastException anEx) { return;}
  }





    /* Public Write accessor for role M3RelationshipOp
     */
  public void removeM3RelationshipOp(
    EAIMMCtxtIfc                                theCtxt,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theRelationship,
    EAIMMElementIfc                              theRelated) throws EAIException {


    if( theCtxt == null) { return;}
    if( theRelationship == null) { return;}
    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) theRelationship).removeRelatedElement( theCtxt, this, theRelated);
    } catch( ClassCastException anEx) { return;}

  }







}


