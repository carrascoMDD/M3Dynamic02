package com.dosmil_e.m3.core.impl;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class M3ModelImpl
  extends com.dosmil_e.m3.core.base.M3ModelBase 
  implements com.dosmil_e.m3.core.pub.M3ModelPub {

  public M3ModelImpl() {
    super();
  }


  public M3ModelImpl( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3ModelImpl( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }



/****************************************************************************
 *  Implementation of derived relationships of M3Model
 ****************************************************************************/

 




/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300000007L;






/* Override START */




  public String getFullyQualifiedName( EAIMMCtxtIfc theCtxt) {
    return null;
  }





  public  com.dosmil_e.m3.core.ifc.M3TypeIfc getM3TypeFullyQualifiedNamed( EAIMMCtxtIfc theCtxt, String theFullyQualifiedName) {
    if( theCtxt == null)                { return null;}
    if( theFullyQualifiedName == null)  { return null;}

    int aFullyQualifiedLenght = theFullyQualifiedName.length();
    if( aFullyQualifiedLenght  < 1)  { return null;}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = null;
    int aScanIndex = 0;
    String aFullyQualifiedName = theFullyQualifiedName;

    try {
      String aPackageName = getPackageName( theCtxt);
      if( aPackageName != null) {
        int aPackageNameLenght = aPackageName.length();
        if( aPackageNameLenght > 0) {
          if( !theFullyQualifiedName.startsWith( aPackageName)) {
            aFullyQualifiedName = aPackageName + gPackageSeparator + aFullyQualifiedName;
            aFullyQualifiedLenght = aFullyQualifiedName.length();
          }
        }
      }

      aM3Type = getM3TypeFullyQualifiedNamed( theCtxt, aFullyQualifiedName, aScanIndex, aFullyQualifiedLenght);
    } catch( EAIException anEx) {}

    return aM3Type;
  }



  public  com.dosmil_e.m3.core.ifc.M3TypeIfc getM3TypeInPackagesNamed( EAIMMCtxtIfc theCtxt, String theTypeName, String thePackageNames) {
    if( theCtxt == null)                { return null;}
    if( theTypeName == null)  { return null;}

    int aTypeNameLenght = theTypeName.length();
    if( aTypeNameLenght  < 1)  { return null;}

    int aPackageNamesLenght = thePackageNames.length();

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = null;
    int aScanIndex = 0;

    String aPackageNames = thePackageNames;

    try {
      String aPackageName = getPackageName( theCtxt);
      int aPackageNameLenght = aPackageName.length();
      if( aPackageName != null && aPackageNameLenght > 0) {
        if( !thePackageNames.startsWith( aPackageName)) {
          aPackageNames = aPackageName + gPackageSeparator + aPackageNames;
          aPackageNamesLenght = aPackageNames.length();
        }
      }

      aM3Type = getM3TypeInPackagesNamed( theCtxt, aPackageNames, aScanIndex, aPackageNamesLenght, theTypeName);
    } catch( EAIException anEx) {}

    return aM3Type;
  }





  public  com.dosmil_e.m3.core.ifc.M3ModuleIfc getM3ModuleFullyQualifiedNamed( EAIMMCtxtIfc theCtxt, String theFullyQualifiedName) {
    if( theCtxt == null)                { return null;}
    if( theFullyQualifiedName == null)  { return null;}

    int aFullyQualifiedLenght = theFullyQualifiedName.length();
    if( aFullyQualifiedLenght  < 1)  { return null;}

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aM3Module = null;
    int aScanIndex = 0;
    String aFullyQualifiedName = theFullyQualifiedName;

    try {
      String aPackageName = getPackageName( theCtxt);
      if( aPackageName != null) {
        int aPackageNameLenght = aPackageName.length();
        if( aPackageNameLenght > 0) {
          if( !theFullyQualifiedName.startsWith( aPackageName)) {
            aFullyQualifiedName = aPackageName + gPackageSeparator + aFullyQualifiedName;
            aFullyQualifiedLenght = aFullyQualifiedName.length();
          }
        }
      }

      aM3Module = getM3ModuleFullyQualifiedNamed( theCtxt, aFullyQualifiedName, aScanIndex, aFullyQualifiedLenght);
    } catch( EAIException anEx) {}

    return aM3Module;
  }



  public  com.dosmil_e.m3.core.ifc.M3ModuleIfc getM3ModuleInPackagesNamed( EAIMMCtxtIfc theCtxt, String theModuleName, String thePackageNames) {
    if( theCtxt == null)                { return null;}
    if( theModuleName == null)  { return null;}

    int aModuleNameLenght = theModuleName.length();
    if( aModuleNameLenght  < 1)  { return null;}

    int aPackageNamesLenght = thePackageNames.length();

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aM3Module = null;
    int aScanIndex = 0;

    String aPackageNames = thePackageNames;

    try {
      String aPackageName = getPackageName( theCtxt);
      int aPackageNameLenght = aPackageName.length();
      if( aPackageName != null && aPackageNameLenght > 0) {
        if( !thePackageNames.startsWith( aPackageName)) {
          aPackageNames = aPackageName + gPackageSeparator + aPackageNames;
          aPackageNamesLenght = aPackageNames.length();
        }
      }

      aM3Module = getM3ModuleInPackagesNamed( theCtxt, aPackageNames, aScanIndex, aPackageNamesLenght, theModuleName);
    } catch( EAIException anEx) {}

    return aM3Module;
  }






/* Override END */


}
