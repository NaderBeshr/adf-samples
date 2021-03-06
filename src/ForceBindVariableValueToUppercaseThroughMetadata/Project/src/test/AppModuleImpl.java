/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl {
  /**This is the default constructor (do not remove)
   */
  public AppModuleImpl() {
  }

  /**Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("test", /* package name */
      "AppModuleLocal" /* Configuration Name */);
  }

  /**Container's getter for Departments
   */
  public CustomViewObjectImpl getDepartments() {
    return (CustomViewObjectImpl)findViewObject("Departments");
  }

  /**Container's getter for Employees
   */
  public CustomViewObjectImpl getEmployees() {
    return (CustomViewObjectImpl)findViewObject("Employees");
  }

  /**Container's getter for WorksInDeptLink1
   */
  public ViewLinkImpl getWorksInDeptLink1() {
    return (ViewLinkImpl)findViewLink("WorksInDeptLink1");
  }
}
