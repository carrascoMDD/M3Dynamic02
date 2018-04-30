package com.dosmil_e.m3.core.impl;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;



public class M3TypeImpl
  extends com.dosmil_e.m3.core.base.M3TypeBase 
  implements com.dosmil_e.m3.core.pub.M3TypePub {

  public M3TypeImpl() {
    super();
  }


  public M3TypeImpl( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3TypeImpl( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }






/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300060007L;




/* Override START */


  public com.dosmil_e.m3.core.ifc.M3ModelIfc getModel( EAIMMCtxtIfc theCtxt) {
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = null;
    try { aModule = getModule( theCtxt); } catch( EAIException anEx) {}

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



  public com.dosmil_e.m3.core.ifc.M3AttributeIfc[] getAllAttributes( EAIMMCtxtIfc theCtxt) throws EAIException {

    java.util.Vector anAttributesVector = new java.util.Vector();


    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someM3SuperTypes = null;
    try { someM3SuperTypes = getSuperTypes( theCtxt);} catch( EAIException anEx) {}
    if( someM3SuperTypes != null) {

      int aNumSuperTypes = someM3SuperTypes.length;
      for( int anIndex = 0; anIndex < aNumSuperTypes; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3TypeIfc aM3SuperType = someM3SuperTypes[ anIndex];
        if( aM3SuperType != null) {
          com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someM3Attributes =
            ((com.dosmil_e.m3.core.pub.M3TypePub) aM3SuperType).getAllAttributes( theCtxt);
          if( someM3Attributes != null) {
            int aNumAttributes = someM3Attributes.length;
            for( int otherIndex = 0; otherIndex < aNumAttributes; otherIndex++) {
              com.dosmil_e.m3.core.ifc.M3AttributeIfc anAttribute = someM3Attributes[ otherIndex];
              if( anAttribute != null) {
                if( !anAttributesVector.contains( anAttribute)) {
                  anAttributesVector.addElement( anAttribute);
                }
              }
            }
          }
        }
      }
    }

    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someM3Attributes = getAttributes( theCtxt);
    if( someM3Attributes != null) {
      int aNumAttributes = someM3Attributes.length;
      for( int otherIndex = 0; otherIndex < aNumAttributes; otherIndex++) {
        com.dosmil_e.m3.core.ifc.M3AttributeIfc anAttribute = someM3Attributes[ otherIndex];
        if( anAttribute != null) {
          if( !anAttributesVector.contains( anAttribute)) {
            anAttributesVector.addElement( anAttribute);
          }
        }
      }
    }

    int aTotalAttributes = anAttributesVector.size();
    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] allM3Attributes = new com.dosmil_e.m3.core.ifc.M3AttributeIfc[ aTotalAttributes];
    try { anAttributesVector.toArray( allM3Attributes); }
    catch( ArrayStoreException        anException) {}

    return allM3Attributes;

  }




  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] getAllRelationships( EAIMMCtxtIfc theCtxt) throws EAIException {

    java.util.Vector anRelationshipsVector = new java.util.Vector();


    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someM3SuperTypes = null;
    try { someM3SuperTypes = getSuperTypes( theCtxt);} catch( EAIException anEx) {}
    if( someM3SuperTypes != null) {

      int aNumSuperTypes = someM3SuperTypes.length;
      for( int anIndex = 0; anIndex < aNumSuperTypes; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3TypeIfc aM3SuperType = someM3SuperTypes[ anIndex];
        if( aM3SuperType != null) {
          com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someM3Relationships =
            ((com.dosmil_e.m3.core.pub.M3TypePub) aM3SuperType).getAllRelationships( theCtxt);
          if( someM3Relationships != null) {
            int aNumRelationships = someM3Relationships.length;
            for( int otherIndex = 0; otherIndex < aNumRelationships; otherIndex++) {
              com.dosmil_e.m3.core.ifc.M3RelationshipIfc anRelationship = someM3Relationships[ otherIndex];
              if( anRelationship != null) {
                if( !anRelationshipsVector.contains( anRelationship)) {
                  anRelationshipsVector.addElement( anRelationship);
                }
              }
            }
          }
        }
      }
    }

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someM3Relationships = getRelationships( theCtxt);
    if( someM3Relationships != null) {
      int aNumRelationships = someM3Relationships.length;
      for( int otherIndex = 0; otherIndex < aNumRelationships; otherIndex++) {
        com.dosmil_e.m3.core.ifc.M3RelationshipIfc anRelationship = someM3Relationships[ otherIndex];
        if( anRelationship != null) {
          anRelationshipsVector.addElement( anRelationship);
        }
      }
    }

    int aTotalRelationships = anRelationshipsVector.size();
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] allM3Relationships =
      new com.dosmil_e.m3.core.ifc.M3RelationshipIfc[ aTotalRelationships];

    try { anRelationshipsVector.toArray( allM3Relationships); }
    catch( ArrayStoreException        anException) {}

    return allM3Relationships;

  }




  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] getAllAggregatedRelationships( EAIMMCtxtIfc theCtxt) throws EAIException {

    java.util.Vector anRelationshipsVector = new java.util.Vector();

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someM3Relationships = getAllRelationships( theCtxt);
    if( someM3Relationships != null) {
      int aNumRelationships = someM3Relationships.length;
      for( int otherIndex = 0; otherIndex < aNumRelationships; otherIndex++) {
        com.dosmil_e.m3.core.ifc.M3RelationshipIfc aRelationship = someM3Relationships[ otherIndex];
        if( aRelationship != null) {
          com.dosmil_e.m3.core.pub.M3RelationshipPub aRelationshipPub = null;
          try { aRelationshipPub = (com.dosmil_e.m3.core.pub.M3RelationshipPub) aRelationship; } catch( ClassCastException anEx) {}
          if( aRelationshipPub != null) {

            if( aRelationshipPub.isAggregates( theCtxt)) {
              if( !anRelationshipsVector.contains( aRelationship)) {
                anRelationshipsVector.addElement( aRelationship);
              }
            }
          }
        }
      }
    }

    int aTotalRelationships = anRelationshipsVector.size();
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] allM3Relationships =
      new com.dosmil_e.m3.core.ifc.M3RelationshipIfc[ aTotalRelationships];
    try { anRelationshipsVector.toArray( allM3Relationships); }
    catch( ArrayStoreException        anException) {}

    return allM3Relationships;

  }




/* Override END */







/* Override START */


  protected transient Class   vIfcClass;
  protected transient Class   vPrivClass;
  protected transient boolean vPrivClassSearched = false;


  public Class getIfcClass( EAIMMCtxtIfc theCtxt) {
    if( vIfcClass != null) { return vIfcClass;}

    String anIfcClassName = getFullyQualifiedIfcName( theCtxt);
    if( anIfcClassName == null) { return null;}

    try {
      vIfcClass = Class.forName( anIfcClassName);
    }
    catch( LinkageError anEx) {}
    catch( ClassNotFoundException  anEx) {}

    return vIfcClass;
  }


  


  public String getFullyQualifiedIfcName( EAIMMCtxtIfc theCtxt) {
    return getFullyQualifiedName( theCtxt, "ifc") + "Ifc";
  }


  public Class getPrivClass( EAIMMCtxtIfc theCtxt) {
    if( vPrivClass != null) { return vPrivClass;}
    if( vPrivClassSearched ) { return null;}

    vPrivClassSearched = true;

    String anPrivClassName = getFullyQualifiedPrivName( theCtxt);
    if( anPrivClassName == null) { return null;}

    try {
      vPrivClass = Class.forName( anPrivClassName);
    }
    catch( LinkageError anEx) {}
    catch( ClassNotFoundException  anEx) {}

    return vPrivClass;
  }





  public String getFullyQualifiedPrivName( EAIMMCtxtIfc theCtxt) {
    return getFullyQualifiedName( theCtxt, "priv") + "Priv";
  }


  public String getFullyQualifiedModuleName( EAIMMCtxtIfc theCtxt) {
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = null;
    try { aModule = getModule( theCtxt);} catch( EAIException anEx) {}
    if( aModule == null) { return null;}

    String aModuleFullyQualifiedName = ((com.dosmil_e.m3.core.pub.M3ModulePub) aModule).getFullyQualifiedName( theCtxt);
    return aModuleFullyQualifiedName;
  }



  public String getFullyQualifiedName( EAIMMCtxtIfc theCtxt, String theFolder) {
    if( theCtxt == null) { return null;}

    EAIMMNameIfc aName = null;
    try { aName = getName();} catch( EAIException anEx) {}
    if( aName == null) { return null;}
    String aNameString = aName.getString();
    if( aNameString == null) { return null;}

    com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = getModel( theCtxt);
    if( aModel == null) { return null;}

    String aTypePrefix = null;
    try { aTypePrefix = aModel.getTypePrefix( theCtxt);} catch( EAIException anEx) {}
    if( aTypePrefix == null) { return null;}

    String aSuperModuleFullyQualifiedName = getFullyQualifiedModuleName( theCtxt);
    if( aSuperModuleFullyQualifiedName == null) { return aNameString;}
    return aSuperModuleFullyQualifiedName + "." + theFolder + "." + aTypePrefix + aNameString;
  }


  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc getTreeRootForElement(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement)  throws EAIException {

    if( theMMElement == null) { return null;}

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRoot = getTreeRootAsM3Type( theCtxt, theMMElement);
    if( aRoot != null) { return aRoot;}

    return theMMElement;
  }



  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc getTreeRootAsM3Type(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement)  throws EAIException {

    String aThisName = getName().getString();

    if( theMMElement == null) { return null;}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someM3Rels = null;
    try { someM3Rels = getRelationships( theCtxt);} catch( EAIException anEx) {}
    if( someM3Rels == null) { return null;}

    int aNumRels = someM3Rels.length;
    for( int anIndex = 0; anIndex < aNumRels; anIndex++) {
      com.dosmil_e.m3.core.ifc.M3RelationshipIfc aM3Rel = someM3Rels[ anIndex];
      if( aM3Rel != null) {
        String aRelName = aM3Rel.getName().getString();

        com.dosmil_e.m3.core.pub.M3RelationshipPub aM3RelPub = null;
        try { aM3RelPub = (com.dosmil_e.m3.core.pub.M3RelationshipPub) aM3Rel; } catch( ClassCastException anEx) {}
        if( aM3RelPub != null) {
          String aM3RelKind = null;
          try { aM3RelKind = aM3Rel.getKind( theCtxt); } catch( EAIException anEx) {}
          if( aM3RelKind != null && aM3RelKind.equals( "IsPartOf")) {
            String aMaxMult  = null;
            try { aMaxMult = aM3Rel.getMaxMult( theCtxt); } catch( EAIException anEx) {}
            if(  aMaxMult != null && aMaxMult.equals( "1")) {
              com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someElements = aM3RelPub.getRelatedElements( theCtxt, theMMElement);
              if( someElements != null && someElements.length >0) {
                com.dosmil_e.modelbase.ifc.EAIMMElementIfc anElement = someElements[ 0];
                if( anElement != null ) {
                  return anElement.getTreeRoot( theCtxt);
                }
              }
            }
          }
        }
      }
    }

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRoot = null;

    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someM3SuperTypes = null;
    try { someM3SuperTypes = getSuperTypes( theCtxt);} catch( EAIException anEx) {}
    if( someM3SuperTypes == null) { return this;}

    int aNumSuperTypes = someM3SuperTypes.length;
    for( int anIndex = 0; anIndex < aNumSuperTypes; anIndex++) {
      com.dosmil_e.m3.core.ifc.M3TypeIfc aM3SuperType = someM3SuperTypes[ anIndex];
      if( aM3SuperType != null) {
        String aSuperName = aM3SuperType.getName().getString();
        com.dosmil_e.m3.core.pub.M3TypePub aSuperTypePub = null;
        try { aSuperTypePub = (com.dosmil_e.m3.core.pub.M3TypePub) aM3SuperType;} catch( ClassCastException anException) {}
        if( aSuperTypePub != null) {
          aRoot = aSuperTypePub.getTreeRootAsM3Type( theCtxt, theMMElement);
          if( aRoot != null) { return aRoot;}
        }
      }
    }
    return null;
  }



  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc createElement(
    EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) throws EAIException {

    if( theName == null)          { return null;}

    com.dosmil_e.m3.support.MMCtxtWithM3Ifc aCtxtWM3 = null;
    try { aCtxtWM3 = (com.dosmil_e.m3.support.MMCtxtWithM3Ifc) theCtxt;} catch( ClassCastException anEx) {}
    if( aCtxtWM3 == null)         { return null;}

    com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = getModel( theCtxt);

    String aFactoryPackageNames = new String("");

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aModule = getModule( theCtxt);
    if( aModule != null) {
      com.dosmil_e.m3.core.pub.M3ModulePub aModulePub = null;
      try { aModulePub = (com.dosmil_e.m3.core.pub.M3ModulePub) aModule;} catch( ClassCastException anEx) {}
      if( aModulePub != null) {
        aFactoryPackageNames = aModulePub.getFactoryPackageNames( theCtxt);
      }
    }

    EAIMMNameIfc aTypeName = getName();
    if( aTypeName == null)        { return null;}
    String aTypeNameString = aTypeName.getString();
    if( aTypeNameString == null)  { return null;}

		com.dosmil_e.modelbase.ifc.EAIMMElementIfc aNewElement = aCtxtWM3.getMMFactoryForModel( aModel).
      createMMElementOfType( theCtxt, aTypeNameString, aFactoryPackageNames, theName);

    return aNewElement;
  }





    /* Public delete operation
     */
  public void deleteElement(
    EAIMMCtxtIfc                                       theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      deleteElementPR( theCtxt, theTargetMMElement);
      return;
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        deleteElementPR( theCtxt, theTargetMMElement);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



  private void deleteElementPR(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException {

    if( theCtxt == null)                   { return;}

    if( theTargetMMElement == null)         { return;}

    com.dosmil_e.modelbase.priv.EAIMMElementPriv aTargetMMElement = null;
    try { aTargetMMElement = (com.dosmil_e.modelbase.priv.EAIMMElementPriv) theTargetMMElement; } catch( ClassCastException anEx) {}
    if( aTargetMMElement == null) { return;}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] someRelationships = getAllRelationships( theCtxt);
    if( someRelationships != null) {
      int aNumRelationships = someRelationships.length;
      for( int anIndex = 0; anIndex < aNumRelationships; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3RelationshipIfc aRelationship = someRelationships[ anIndex];
        if( aRelationship != null) {
          com.dosmil_e.m3.core.pub.M3RelationshipPub aRelationshipPub = null;
          try { aRelationshipPub = (com.dosmil_e.m3.core.pub.M3RelationshipPub) aRelationship; } catch( ClassCastException anEx) {}
          if( aRelationshipPub != null) {
            aRelationshipPub.recursiveDeleteAllRelatedElements( theCtxt, theTargetMMElement);
          }
        }
      }
    }

    com.dosmil_e.m3.core.ifc.M3AttributeIfc[] someAttributes = getAllAttributes( theCtxt);
    if( someAttributes != null) {
      int aNumAttributes = someAttributes.length;
      for( int anIndex = 0; anIndex < aNumAttributes; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3AttributeIfc aAttribute = someAttributes[ anIndex];
        if( aAttribute != null) {
          com.dosmil_e.m3.core.pub.M3AttributePub aAttributePub = null;
          try { aAttributePub = (com.dosmil_e.m3.core.pub.M3AttributePub) aAttribute; } catch( ClassCastException anEx) {}
          if( aAttributePub != null) {
            aAttributePub.setAttributeValue( theCtxt, theTargetMMElement, null);
          }
        }
      }
    }

      // Generate and post the change event notification
    try {
      theCtxt.getFlatTrxMgr().change( theTargetMMElement, sExistencePropertyName, toObject( true), toObject( false), sExistencePropertyName);

      setName( theCtxt, null);
    } catch( EAIException anEx) {}
  }





  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getAllSubTypes( EAIMMCtxtIfc theCtxt) throws EAIException {

    java.util.Vector aTypesVector = new java.util.Vector();

    getAllSubTypesInto( theCtxt, aTypesVector);

    int aTotalTypes = aTypesVector.size();
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] allM3Types = new com.dosmil_e.m3.core.ifc.M3TypeIfc[ aTotalTypes];

    try { aTypesVector.toArray( allM3Types); }
    catch( ArrayStoreException        anException) {}

    return allM3Types;
  }



  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getWithAllSubTypes( EAIMMCtxtIfc theCtxt) throws EAIException {

    java.util.Vector aTypesVector = new java.util.Vector();

    getWithAllSubTypesInto( theCtxt, aTypesVector);

    int aTotalTypes = aTypesVector.size();
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] allM3Types = new com.dosmil_e.m3.core.ifc.M3TypeIfc[ aTotalTypes];

    try { aTypesVector.toArray( allM3Types); }
    catch( ArrayStoreException        anException) {}

    return allM3Types;
  }



  public void getWithAllSubTypesInto( EAIMMCtxtIfc theCtxt, java.util.Vector theTypesVector) throws EAIException {

    if( theCtxt == null)        { return;}
    if( theTypesVector == null) { return;}

    if( !theTypesVector.contains( this)) {
      theTypesVector.addElement( this);
    }

    getAllSubTypesInto( theCtxt, theTypesVector);
  }


  public void getAllSubTypesInto( EAIMMCtxtIfc theCtxt, java.util.Vector theTypesVector) throws EAIException {

    if( theCtxt == null)        { return;}
    if( theTypesVector == null) { return;}

    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someM3Types = getSubTypes( theCtxt);
    if( someM3Types != null) {
      int aNumTypes = someM3Types.length;
      for( int otherIndex = 0; otherIndex < aNumTypes; otherIndex++) {
        com.dosmil_e.m3.core.ifc.M3TypeIfc aType = someM3Types[ otherIndex];
        if( aType != null) {
          com.dosmil_e.m3.core.pub.M3TypePub aTypePub = null;
          try { aTypePub = (com.dosmil_e.m3.core.pub.M3TypePub) aType; } catch( ClassCastException anEx) {}
          if( aTypePub != null) {
            aTypePub.getWithAllSubTypesInto( theCtxt, theTypesVector);
          }
        }
      }
    }
  }




/* Override END */




}
