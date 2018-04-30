package com.dosmil_e.m3.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ElementIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3Element
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3Element
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship Parameters
 ****************************************************************************/


    /* Public Read accessor for role Parameters
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ParameterIfc[] getParameters( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public Parameters number access
     */
  public int numParameters( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Parameters read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ParameterIfc getParametersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Parameters finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ParameterIfc findParametersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public Parameters is related predicate
     */
  public boolean hasParametersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional Parameters is related  predicate
     */
  public boolean hasParameters( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException;

    /* Public Parameters index access
     */
  public int indexOfParameters( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addParameters( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addParametersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters, com.dosmil_e.m3.core.ifc.M3ParameterIfc theRelativeParameters) throws EAIException;

    /* Transactional Public Write Remove accessor for role Parameters
     */
  public void removeParameters( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException;

    /* Public reorder accessor for role Parameters
     */
  public void moveParametersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters, com.dosmil_e.m3.core.ifc.M3ParameterIfc theRelativeParameters) throws EAIException;


    /* Public reorder accessor for role Parameters
     */
  public void moveParametersToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ParameterIfc theParameters) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship Comments
 ****************************************************************************/


    /* Public Read accessor for role Comments
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3CommentIfc[] getComments( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public Comments number access
     */
  public int numComments( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Comments read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3CommentIfc getCommentsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Comments finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3CommentIfc findCommentsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public Comments is related predicate
     */
  public boolean hasCommentsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional Comments is related  predicate
     */
  public boolean hasComments( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException;

    /* Public Comments index access
     */
  public int indexOfComments( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addComments( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addCommentsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments, com.dosmil_e.m3.core.ifc.M3CommentIfc theRelativeComments) throws EAIException;

    /* Transactional Public Write Remove accessor for role Comments
     */
  public void removeComments( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException;

    /* Public reorder accessor for role Comments
     */
  public void moveCommentsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments, com.dosmil_e.m3.core.ifc.M3CommentIfc theRelativeComments) throws EAIException;


    /* Public reorder accessor for role Comments
     */
  public void moveCommentsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3CommentIfc theComments) throws EAIException;




}
