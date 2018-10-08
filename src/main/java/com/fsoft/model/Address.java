package com.fsoft.model;

public class Address {
  private String no;
  private String street;
  public String getNo() {
    return no;
  }
  public void setNo(String no) {
    this.no = no;
  }
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }
  public Address(String no, String street) {
    super();
    this.no = no;
    this.street = street;
  }
  
  
}
