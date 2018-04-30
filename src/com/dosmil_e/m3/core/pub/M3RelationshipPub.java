package com.dosmil_e.m3.core.pub;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3RelationshipPub
   extends com.dosmil_e.m3.core.pub.M3ElementPub, 
  com.dosmil_e.m3.core.ifc.M3RelationshipIfc  { 



/* Override START */

  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] getMMElements(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement)  throws EAIException;


  public java.lang.reflect.Method getGetMethod(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement);


  public String getUpperName( EAIMMCtxtIfc theCtxt);



  public boolean isM3Many( EAIMMCtxtIfc theCtxt)   throws EAIException;
  public boolean isAggregates( EAIMMCtxtIfc theCtxt)  throws EAIException;

  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] getRelatedElements(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement) throws EAIException;

  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc getRelatedElement(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement)  throws EAIException;

  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] getRelatedElementsPrivileged(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement) throws EAIException;

  public void addRelatedElement(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theAddedMMElement)  throws EAIException;


  public void addRelatedElementPrivileged(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theAddedMMElement)  throws EAIException;

  public void setRelatedElement(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theSetMMElement)  throws EAIException;

  public Class getIfcClass( EAIMMCtxtIfc theCtxt);
  public Class getPrivClass( EAIMMCtxtIfc theCtxt);
  public Class getFieldClass( EAIMMCtxtIfc theCtxt);

  public void unsetAndSetRelatedElementPrivileged(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theAddedMMElement)  throws EAIException;

  public void removeRelatedElementPrivileged(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theRemovedMMElement)  throws EAIException;

  public void moveRelatedElementBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theToMoveMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theRelativeToMMElement) throws EAIException;

  public void moveRelatedElementToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theToMoveMMElement) throws EAIException;

  public void addRelatedElementBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theAddedMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theRelativeToMMElement)  throws EAIException;

  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc findRelatedElementNamed(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    EAIMMNameIfc                                        theMMName) throws EAIException;

  public boolean hasRelatedElementNamed(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    EAIMMNameIfc                                        theMMName) throws EAIException;


    /* Public related element index finder by name
     */
  public int indexOfRelatedElementNamed(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    EAIMMNameIfc                                        theMMName) throws EAIException;

    /* Public related element index finder
     */
  public int indexOfRelatedElement(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theRelatedMMElement) throws EAIException;


    /* Public related element is related predicate
     */
  public boolean hasRelatedElement(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc  theRelatedMMElement) throws EAIException;

    /* Public Write accessor for role Packages
     */
  public void removeRelatedElement(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theRemovedMMElement)  throws EAIException;


    /* Unset currently related model element and
     * Used by relationship maintenance machinery
     */
  public void unsetRelatedElementPrivileged(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException;



    /* Public Related elements number access
     */
  public int numRelatedElements(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException;

    /* Public Related element read accessor by index
     */
  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc getRelatedElementAt(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement,
    int theIndex)  throws EAIException;


    /* Public remove all related elements
     */
  public void removeAllRelatedElements(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException;

    /* Public recusive through aggregations remove all related elements
     */
  public void recursiveDeleteAllRelatedElements(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException;





  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getAllRelatedTypes( EAIMMCtxtIfc theCtxt) throws EAIException;


/* Override END */



}

