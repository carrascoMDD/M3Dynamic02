package com.dosmil_e.m3.core.impl;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class M3ModuleImpl
  extends com.dosmil_e.m3.core.base.M3ModuleBase 
  implements com.dosmil_e.m3.core.pub.M3ModulePub {

  public M3ModuleImpl() {
    super();
  }


  public M3ModuleImpl( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3ModuleImpl( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }






/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300020007L;




/* Override START */


  public com.dosmil_e.m3.core.ifc.M3ModelIfc getModel( EAIMMCtxtIfc theCtxt) {
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = this;

    while( aModule != null) {
      com.dosmil_e.m3.core.ifc.M3ModuleIfc aSuperModule = null;
      try { aSuperModule = aModule.getSuperModule( theCtxt); } catch( EAIException anEx) {}
      if( aSuperModule == null) {
        com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = null;
        try { aModel = (com.dosmil_e.m3.core.ifc.M3ModelIfc) aModule;} catch( ClassCastException anEx) {}
        return aModel;
      }
      else {
        aModule = aSuperModule;
      }
    }
    return null;
  }



  public String getFullyQualifiedName( EAIMMCtxtIfc theCtxt) {
    if( theCtxt == null) { return null;}

    EAIMMNameIfc aName = null;
    try { aName = getName();} catch( EAIException anEx) {}
    if( aName == null) { return null;}
    String aNameString = aName.getString();
    if( aNameString == null) { return null;}

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aSuperModule = null;
    try { aSuperModule = getSuperModule( theCtxt);} catch( EAIException anEx) {}
    if( aSuperModule == null) { return aNameString;}

    String aSuperModuleFullyQualifiedName = ((com.dosmil_e.m3.core.pub.M3ModulePub) aSuperModule). getFullyQualifiedName( theCtxt);
    if( aSuperModuleFullyQualifiedName == null) { return aNameString;}
    return aSuperModuleFullyQualifiedName + "." + aNameString;
  }



  public static final String gPackageSeparator = new String(".");

  public com.dosmil_e.m3.core.ifc.M3TypeIfc getM3TypeFullyQualifiedNamed(
    EAIMMCtxtIfc theCtxt, String theFullyQualifiedName, int theScanIndex, int theLength) throws EAIException {

    if( theCtxt == null)                 { return null;}
    if( theFullyQualifiedName == null )  { return null;}

    if( theScanIndex >= theLength)       { return null;}

    int aDotPosition = theFullyQualifiedName.indexOf( gPackageSeparator, theScanIndex);
    if( aDotPosition < 0) {
      String aNameString = theFullyQualifiedName.substring( theScanIndex);
      return findTypesNamed( theCtxt, new EAIMMName( aNameString));
    }

    String aNameString = theFullyQualifiedName.substring( theScanIndex, aDotPosition);
    int aNewScanIndex = aDotPosition + 1;

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = findSubModulesNamed( theCtxt, new EAIMMName( aNameString));
    if( aModule == null)                 { return null;}

    com.dosmil_e.m3.core.pub.M3ModulePub aModulePub = null;
    try { aModulePub = (com.dosmil_e.m3.core.pub.M3ModulePub) aModule;} catch( ClassCastException anEx) {}
    if( aModulePub == null)              { return null;}

    return aModulePub.getM3TypeFullyQualifiedNamed( theCtxt, theFullyQualifiedName, aNewScanIndex, theLength);
  }





  public com.dosmil_e.m3.core.ifc.M3TypeIfc getM3TypeInPackagesNamed(
    EAIMMCtxtIfc theCtxt, String thePackageNames, int theScanIndex, int theLength, String theTypeName) throws EAIException {

    if( theCtxt == null)                 { return null;}
    if( theTypeName == null )  { return null;}

    String aThisName = getName().getString();
    
    if( theScanIndex >= theLength) {
      return findTypesNamed( theCtxt, new EAIMMName( theTypeName));
    }

    String aNameString = null;
    int aNewScanIndex = theScanIndex;
    int aDotPosition = thePackageNames.indexOf( gPackageSeparator, theScanIndex);
    if( aDotPosition < 0) {
      aNameString = thePackageNames.substring( theScanIndex);
      aNewScanIndex = theLength;
    }
    else {
      aNameString = thePackageNames.substring( theScanIndex, aDotPosition);
      aNewScanIndex = aDotPosition + 1;
    }

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = findSubModulesNamed( theCtxt, new EAIMMName( aNameString));
    if( aModule == null)                 { return null;}

    com.dosmil_e.m3.core.pub.M3ModulePub aModulePub = null;
    try { aModulePub = (com.dosmil_e.m3.core.pub.M3ModulePub) aModule;} catch( ClassCastException anEx) {}
    if( aModulePub == null)              { return null;}

    return aModulePub.getM3TypeInPackagesNamed( theCtxt, thePackageNames, aNewScanIndex, theLength, theTypeName);
  }



  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getM3ModuleFullyQualifiedNamed(
    EAIMMCtxtIfc theCtxt, String theFullyQualifiedName, int theScanIndex, int theLength) throws EAIException {

    if( theCtxt == null)                 { return null;}
    if( theFullyQualifiedName == null )  { return null;}

    if( theScanIndex >= theLength)       { return null;}

    int aDotPosition = theFullyQualifiedName.indexOf( gPackageSeparator, theScanIndex);
    if( aDotPosition < 0) {
      String aNameString = theFullyQualifiedName.substring( theScanIndex);
      return findSubModulesNamed( theCtxt, new EAIMMName( aNameString));
    }

    String aNameString = theFullyQualifiedName.substring( theScanIndex, aDotPosition);
    int aNewScanIndex = aDotPosition + 1;

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = findSubModulesNamed( theCtxt, new EAIMMName( aNameString));
    if( aModule == null)                 { return null;}

    com.dosmil_e.m3.core.pub.M3ModulePub aModulePub = null;
    try { aModulePub = (com.dosmil_e.m3.core.pub.M3ModulePub) aModule;} catch( ClassCastException anEx) {}
    if( aModulePub == null)              { return null;}

    return aModulePub.getM3ModuleFullyQualifiedNamed( theCtxt, theFullyQualifiedName, aNewScanIndex, theLength);
  }



  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getM3ModuleInPackagesNamed(
    EAIMMCtxtIfc theCtxt, String thePackageNames, int theScanIndex, int theLength, String theModuleName) throws EAIException {

    if( theCtxt == null)                 { return null;}
    if( theModuleName == null )  { return null;}

    String aThisName = getName().getString();
    
    if( theScanIndex >= theLength) {
      return findSubModulesNamed( theCtxt, new EAIMMName( theModuleName));
    }

    String aNameString = null;
    int aNewScanIndex = theScanIndex;
    int aDotPosition = thePackageNames.indexOf( gPackageSeparator, theScanIndex);
    if( aDotPosition < 0) {
      aNameString = thePackageNames.substring( theScanIndex);
      aNewScanIndex = theLength;
    }
    else {
      aNameString = thePackageNames.substring( theScanIndex, aDotPosition);
      aNewScanIndex = aDotPosition + 1;
    }

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = findSubModulesNamed( theCtxt, new EAIMMName( aNameString));
    if( aModule == null)                 { return null;}

    com.dosmil_e.m3.core.pub.M3ModulePub aModulePub = null;
    try { aModulePub = (com.dosmil_e.m3.core.pub.M3ModulePub) aModule;} catch( ClassCastException anEx) {}
    if( aModulePub == null)              { return null;}

    return aModulePub.getM3ModuleInPackagesNamed( theCtxt, thePackageNames, aNewScanIndex, theLength, theModuleName);
  }




  protected transient boolean vFactoryPackageNamesWasDerived = false;
  protected transient String  vFactoryPackageNames;

  public String getFactoryPackageNames( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( vFactoryPackageNamesWasDerived) { return vFactoryPackageNames;}

    vFactoryPackageNames = new String("");
    vFactoryPackageNamesWasDerived = true;

    String aFullName = getFullyQualifiedName( theCtxt);
    if( aFullName == null) { return vFactoryPackageNames;}

    vFactoryPackageNames = aFullName;

    com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = getModel( theCtxt);
    if( aModel == null) { return vFactoryPackageNames;}

    String aPackageName = aModel.getPackageName( theCtxt);
    if( aPackageName == null) { return vFactoryPackageNames;}

    if( !aFullName.startsWith( aPackageName)) { return vFactoryPackageNames;}

    vFactoryPackageNames = aFullName.substring( aPackageName.length() + 1);

    return vFactoryPackageNames;
  }





  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getAllTypes( EAIMMCtxtIfc theCtxt) throws EAIException {

    java.util.Vector aTypesVector = new java.util.Vector();

    getAllTypesInto( theCtxt, aTypesVector);

    int aTotalTypes = aTypesVector.size();
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] allM3Types = new com.dosmil_e.m3.core.ifc.M3TypeIfc[ aTotalTypes];

    try { aTypesVector.toArray( allM3Types); }
    catch( ArrayStoreException        anException) {}

    return allM3Types;
  }




  public void getAllTypesInto( EAIMMCtxtIfc theCtxt, java.util.Vector theTypesVector) throws EAIException {

    if( theCtxt == null)        { return;}
    if( theTypesVector == null) { return;}

    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someM3Types = getTypes( theCtxt);
    if( someM3Types != null) {
      int aNumTypes = someM3Types.length;
      for( int otherIndex = 0; otherIndex < aNumTypes; otherIndex++) {
        com.dosmil_e.m3.core.ifc.M3TypeIfc aType = someM3Types[ otherIndex];
        if( aType != null) {
          theTypesVector.addElement( aType);
        }
      }
    }

    com.dosmil_e.m3.core.ifc.M3ModuleIfc[] someM3SubModules = null;
    try { someM3SubModules = getSubModules( theCtxt);} catch( EAIException anEx) {}
    if( someM3SubModules != null) {
      int aNumSubModules = someM3SubModules.length;
      for( int anIndex = 0; anIndex < aNumSubModules; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3ModuleIfc aM3SubModule = someM3SubModules[ anIndex];
        if( aM3SubModule != null) {
          ((com.dosmil_e.m3.core.pub.M3ModulePub) aM3SubModule).getAllTypesInto( theCtxt, theTypesVector);
        }
      }
    }
  }




/* Override END */


}
