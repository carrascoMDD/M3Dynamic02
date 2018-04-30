package com.dosmil_e.m3.core.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ElementPriv 
   extends com.dosmil_e.m3.withm3.priv.MMElementWithM3Priv,  
  com.dosmil_e.m3.core.ifc.M3ElementIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3Element
 ****************************************************************************/



/****************************************************************************
 *  Implementation of privileged interface for relationship Parameters
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role Parameters
     */
  public void addParametersPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ParameterPriv theParameters) throws EAIException;







    /* Privileged Write accessor for role Parameters
     */
  public void removeParametersPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ParameterPriv theParameters) throws EAIException;






    /* Privileged Read accessor for role Parameters
     * Guaranteed to return object with same identity of the Parameters
     */
  public com.dosmil_e.m3.core.priv.M3ParameterPriv[] getParametersPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role Parameters
     * Used by relationship maintenance machinery
     */
  public void setParametersPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ParameterPriv[] theParametersCollection) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship Comments
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role Comments
     */
  public void addCommentsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3CommentPriv theComments) throws EAIException;







    /* Privileged Write accessor for role Comments
     */
  public void removeCommentsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3CommentPriv theComments) throws EAIException;






    /* Privileged Read accessor for role Comments
     * Guaranteed to return object with same identity of the Comments
     */
  public com.dosmil_e.m3.core.priv.M3CommentPriv[] getCommentsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role Comments
     * Used by relationship maintenance machinery
     */
  public void setCommentsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3CommentPriv[] theCommentsCollection) throws EAIException;






}
