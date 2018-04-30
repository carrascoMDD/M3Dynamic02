package com.dosmil_e.m3.core.pub;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ModulePub
   extends com.dosmil_e.m3.core.pub.M3ElementPub, 
  com.dosmil_e.m3.core.ifc.M3ModuleIfc  { 



/* Override START */

  public com.dosmil_e.m3.core.ifc.M3ModelIfc getModel( EAIMMCtxtIfc theCtxt);

  public String getFullyQualifiedName( EAIMMCtxtIfc theCtxt);

  public com.dosmil_e.m3.core.ifc.M3TypeIfc getM3TypeFullyQualifiedNamed(
    EAIMMCtxtIfc theCtxt, String theFullyQualifiedName, int theScanIndex, int theLength) throws EAIException;
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getM3TypeInPackagesNamed(
    EAIMMCtxtIfc theCtxt, String thePackageNames, int theScanIndex, int theLength, String theTypeName) throws EAIException;

  public String getFactoryPackageNames( EAIMMCtxtIfc theCtxt) throws EAIException;

  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getM3ModuleFullyQualifiedNamed(
    EAIMMCtxtIfc theCtxt, String theFullyQualifiedName, int theScanIndex, int theLength) throws EAIException;
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getM3ModuleInPackagesNamed(
    EAIMMCtxtIfc theCtxt, String thePackageNames, int theScanIndex, int theLength, String theModuleName) throws EAIException;

  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getAllTypes( EAIMMCtxtIfc theCtxt) throws EAIException;

  public void getAllTypesInto( EAIMMCtxtIfc theCtxt, java.util.Vector theTypesVector) throws EAIException;


/* Override END */

}
