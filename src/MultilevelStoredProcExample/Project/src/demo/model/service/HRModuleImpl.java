/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package demo.model.service;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class HRModuleImpl extends ApplicationModuleImpl {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public HRModuleImpl() {
  }

  /**
   * 
   *  Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("demo.model.service", "HRModuleLocal");
  }

  /**
   * 
   *  Container's getter for DeptView1
   */
  public ViewObjectImpl getDeptView1() {
    return (ViewObjectImpl)findViewObject("DeptView1");
  }

  /**
   * 
   *  Container's getter for EmpView1
   */
  public ViewObjectImpl getEmpView1() {
    return (ViewObjectImpl)findViewObject("EmpView1");
  }

  /**
   * 
   *  Container's getter for EmpView2
   */
  public ViewObjectImpl getEmpView2() {
    return (ViewObjectImpl)findViewObject("EmpView2");
  }

  /**
   * 
   *  Container's getter for WorksInDeptLink1
   */
  public ViewLinkImpl getWorksInDeptLink1() {
    return (ViewLinkImpl)findViewLink("WorksInDeptLink1");
  }

    /**Sample exportable method.
     */
    public void sampleHRModuleImplExportable() {
    }

    /**Sample exportable method.
     */
    public void sampleHRModuleImplExportable2(String testParam1) {
    }
}
