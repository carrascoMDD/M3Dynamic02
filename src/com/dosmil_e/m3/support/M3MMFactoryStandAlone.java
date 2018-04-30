package com.dosmil_e.m3.support;

import com.dosmil_e.modelbase.support.EAIMMFactory;
import com.dosmil_e.modelbase.support.EAIMMFactoryIfc;
import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;


public class M3MMFactoryStandAlone extends MMFactoryWithM3 {


  public M3MMFactoryStandAlone() {
    super();
  }

  public M3MMFactoryStandAlone( EAIMMFactoryIfc theOverridenFactory) {
    super( theOverridenFactory);
  }


  protected void initName() {
    vName = new String("M3");
  }


  public String getClassNamePrefixForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "M3";
  }



  public String getLastPackageNameForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "impl";
  }

  public String getStartPackageNameForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "com.dosmil_e.m3";
  }

  public String getClassNamePostfixForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "Impl";
  }


  public String getFullyQualifiedIfcPackageNameForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "com.dosmil_e.m3.ifc";
  }

  public String getIfcNamePostfixForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "Ifc";
  }


  public String getFileFilterTermination( EAIMMCtxtIfc theCtxt) {
    return ".m3";
  }

  public String getFileFilterDescription( EAIMMCtxtIfc theCtxt) {
    return "M3 Studio files (*" + getFileFilterTermination( theCtxt) + ")";
  }


  public String getRootTypeName( EAIMMCtxtIfc theCtxt) {
    return "Model";
  }

  public String getRootTypePackageNames( EAIMMCtxtIfc theCtxt) {
    return "core";
  }


}
