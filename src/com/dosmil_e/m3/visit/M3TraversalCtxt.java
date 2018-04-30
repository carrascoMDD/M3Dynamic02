package com.dosmil_e.m3.visit;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;


import java.util.Vector;
import java.util.Hashtable;

public class M3TraversalCtxt implements M3TraversalCtxtIfc   {


  protected int         vLevels       = 0;

  protected int         vPhaseCounter = 0;

  protected Vector      vTraversalsSchedule;

  protected Hashtable   vCommonDicts;

  /****************************************************************************
 *  Constructors of the Visitor
 ****************************************************************************/

  public M3TraversalCtxt() {
  }


  public M3TraversalCtxt( EAIMMCtxtIfc theCtxt) {
  }


  public int getLevels() {
    return vLevels;
  }


  public int getPhaseCounter() { return vPhaseCounter;}



  public int incrementPhaseCounter( EAIMMCtxtIfc theCtxt) throws EAIException {
    vPhaseCounter ++;

    triggerBranchTraversalsForPhase( theCtxt, vPhaseCounter);
    return vPhaseCounter;
  }


  public int push() {
    vLevels++;
    return vLevels;
  }


  public int pop() {
    vLevels--;
    return vLevels;
  }




  public void scheduleBranchTraversalForPhase(
    EAIMMCtxtIfc                                        theCtxt,
    M3TraversalVisitorIfc                               theTraversalVisitor,
    int                                                 thePhaseNumber,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theCtxt == null)              { return;}
    if( theTraversalVisitor == null)  { return;}
    if( thePhaseNumber < 1)           { return;}
    if( theTraversalCtxt == null)     { return;}
    if( theTraversalCfg == null)      { return;}
    if( theBranchCfg == null)         { return;}
    if( theSourceMMElement == null)   { return;}

    M3ScheduledBranchTraversal aScheduledBranchTraversal = new M3ScheduledBranchTraversal(
      theCtxt, theTraversalVisitor, thePhaseNumber, theTraversalCtxt, theTraversalCfg, theBranchCfg, theSourceMMElement);

    scheduleBranchTraversalForPhase( theCtxt, thePhaseNumber, aScheduledBranchTraversal);
  }


  protected void scheduleBranchTraversalForPhase(
    EAIMMCtxtIfc               theCtxt,
    int                        thePhaseNumber,
    M3ScheduledBranchTraversal theScheduledBranchTraversal) throws EAIException {

    Vector aTraversalsScheduleForPhase = getTraversalsScheduleForPhase( theCtxt, thePhaseNumber);
    if( aTraversalsScheduleForPhase == null) { return;}

    aTraversalsScheduleForPhase.addElement( theScheduledBranchTraversal);
  }


  protected Vector getTraversalsScheduleForPhase(
    EAIMMCtxtIfc               theCtxt,
    int                        thePhaseNumber) throws EAIException {

    Vector aTraversalsSchedule = getTraversalsSchedule();
    if( aTraversalsSchedule == null) { return null;}

    int aSize = aTraversalsSchedule.size();
    if( aSize < thePhaseNumber) {
      int aToAdd = thePhaseNumber - aSize + 1;
      for( int anIndex = 0; anIndex < aToAdd; anIndex++) {
        aTraversalsSchedule.addElement( new Vector());
      }
    }

    Object aTraversalsScheduleForPhaseObject = aTraversalsSchedule.elementAt( thePhaseNumber);
    if( aTraversalsScheduleForPhaseObject == null) { return null;}

    Vector aTraversalsScheduleForPhase = null;
    try { aTraversalsScheduleForPhase = (Vector) aTraversalsScheduleForPhaseObject;} catch( ClassCastException anEx) {}

    return aTraversalsScheduleForPhase;
  }




  protected Vector getTraversalsSchedule() {
    if( vTraversalsSchedule == null) {
      vTraversalsSchedule = new Vector();
    }
    return vTraversalsSchedule;
  }




  protected void triggerBranchTraversalsForPhase( EAIMMCtxtIfc theCtxt, int thePhaseNumber) throws EAIException {

    Vector aTraversalsScheduleForPhase = getTraversalsScheduleForPhase( theCtxt, thePhaseNumber);
    if( aTraversalsScheduleForPhase == null) { return;}

    M3ScheduledBranchTraversalIfc[] someScheduledBranchTraversals = asScheduledBranchTraversalArray( aTraversalsScheduleForPhase);
    if( someScheduledBranchTraversals == null) { return;}
    int aNumTraversals = someScheduledBranchTraversals.length;

    for(int anIndex = 0; anIndex < aNumTraversals; anIndex++) {
      M3ScheduledBranchTraversalIfc aTraversal = someScheduledBranchTraversals[ anIndex];
      if( aTraversal != null) {
        aTraversal.triggerTraversalForPhase( theCtxt, thePhaseNumber);
      }
    }
  }



  protected static M3ScheduledBranchTraversalIfc[] asScheduledBranchTraversalArray( Vector theVector) {
    if( theVector == null) { return null;}

    int aSize = theVector.size();

    M3ScheduledBranchTraversalIfc[] aResult = new M3ScheduledBranchTraversalIfc[ aSize];
    boolean aWasError = false;
    try {  theVector.toArray( aResult);} catch( ArrayStoreException anEx) { aWasError = true;}
    if( aWasError) { return null;}

    return aResult;
  }






  public Hashtable getCommon( String theCommonName) {
    if( theCommonName == null) { return null;}

    if( vCommonDicts == null) {
      vCommonDicts = new Hashtable( 3, (float) 0.5);
    }

    Hashtable aDict = null;
    Object aDictObject = vCommonDicts.get( theCommonName);
    if( aDictObject != null) {
      try { aDict = (Hashtable) aDictObject;} catch( ClassCastException anEx) {}
      if( aDict != null) { return aDict;}
    }

    aDict = new Hashtable( 13, (float) 0.5);
    vCommonDicts.put( theCommonName, aDict);
    return aDict;
  }



}





