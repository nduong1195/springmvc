package com.fsoft.model;

import java.util.List;

public class Employee {
  private String empNo;
  private String empName;
  private String position;
  private List<Address> listAddress;

  public Employee(String empNo, String empName, String position,
      List<Address> listAddress) {
    super();
    this.empNo = empNo;
    this.empName = empName;
    this.position = position;
    this.listAddress = listAddress;
  }

  public Employee() {
    super();
    // TODO Auto-generated constructor stub
  }

  public String getEmpNo() {
    return empNo;
  }

  public void setEmpNo(String empNo) {
    this.empNo = empNo;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public List<Address> getListAddress() {
    return listAddress;
  }

  public void setListAddress(List<Address> listAddress) {
    this.listAddress = listAddress;
  }

}
