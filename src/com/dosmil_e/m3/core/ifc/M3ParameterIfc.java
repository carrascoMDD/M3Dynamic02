package com.dosmil_e.m3.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ParameterIfc
    extends     com.dosmil_e.m3.core.ifc.M3ElementIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3Parameter
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute Value
 ****************************************************************************/


    /* Public Read accessor for attribute Value
     */
  public java.lang.String getValue( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute Value
     */
  public void setValue( EAIMMCtxtIfc theCtxt, java.lang.String theValue) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of M3Parameter
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship Element
 ****************************************************************************/


    /* Public Read accessor for role Element
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ElementIfc getElement( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public Element number access
     */
  public int numElement( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Element read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ElementIfc getElementAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Element finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ElementIfc findElementNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public Element is related predicate
     */
  public boolean hasElementNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional Element is related  predicate
     */
  public boolean hasElement( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ElementIfc theElement) throws EAIException;

    /* Public Element index access
     */
  public int indexOfElement( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ElementIfc theElement) throws EAIException;

    /* Public Write accessor for role Element
     * Machinery in Element drives the collection operations
     */
  public void setElement( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ElementIfc theElement) throws EAIException;







}
