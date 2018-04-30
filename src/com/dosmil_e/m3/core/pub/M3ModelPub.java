package com.dosmil_e.m3.core.pub;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ModelPub
   extends com.dosmil_e.m3.core.pub.M3ModulePub, 
  com.dosmil_e.m3.core.ifc.M3ModelIfc  { 


/* Override START */


  public  com.dosmil_e.m3.core.ifc.M3TypeIfc    getM3TypeFullyQualifiedNamed(   EAIMMCtxtIfc theCtxt, String theFullyQualifiedName);
  public  com.dosmil_e.m3.core.ifc.M3TypeIfc    getM3TypeInPackagesNamed(       EAIMMCtxtIfc theCtxt, String theTypeName, String thePackageNames);

  public  com.dosmil_e.m3.core.ifc.M3ModuleIfc  getM3ModuleFullyQualifiedNamed( EAIMMCtxtIfc theCtxt, String theFullyQualifiedName);
  public  com.dosmil_e.m3.core.ifc.M3ModuleIfc  getM3ModuleInPackagesNamed(     EAIMMCtxtIfc theCtxt, String theModuleName, String thePackageNames);

/* Override END */


}
