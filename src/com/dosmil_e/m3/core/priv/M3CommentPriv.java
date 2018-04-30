package com.dosmil_e.m3.core.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3CommentPriv 
   extends com.dosmil_e.m3.core.priv.M3ElementPriv,  
  com.dosmil_e.m3.core.ifc.M3CommentIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3Comment
 ****************************************************************************/


/****************************************************************************
 *  Implementation of privileged interface for relationship Element
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role Element
     * Guaranteed to return object with same identity of the Element
     */
  public com.dosmil_e.m3.core.priv.M3ElementPriv getElementPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role Element
     * Used by relationship maintenance machinery
     */
  public void unsetElementPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role Element
     * Used by relationship maintenance machinery
     */
  public void setElementPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ElementPriv theElement) throws EAIException;
  


    /* Set reference in role Element,
     * unlinking back reference from currently related Element
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetElementPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ElementPriv theElement) throws EAIException;







}
