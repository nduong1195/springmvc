package com.fsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fsoft.model.Employee;
import com.fsoft.repository.EmployeeRepository;

@RestController
public class MainRESTController {
  @Autowired
  private EmployeeRepository employeeRepository;

  @RequestMapping("/")
  public String welcome() {
    return "Welcome to Rest Template Example";
  }

  @RequestMapping(value = "/employees", method = RequestMethod.GET, produces = {
      MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
  public List<Employee> getEmployees() {
    List<Employee> list = employeeRepository.getAllEmployees();
    return list;
  }

  @RequestMapping(value = "/employee/{empNo}", method = RequestMethod.GET, produces = {
      MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
  public Employee getEmployee(@PathVariable("empNo") String empNo) {
    return employeeRepository.getEmployee(empNo);
  }

  @RequestMapping(value = "/employee", method = RequestMethod.POST, produces = {
      MediaType.APPLICATION_JSON_VALUE,
      MediaType.APPLICATION_XML_VALUE })
  public Employee addEmployee(@RequestBody Employee emp) {
    return employeeRepository.addEmployee(emp);
  }

  @RequestMapping(value = "/employee", method = RequestMethod.PUT, produces = {
      MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
  public Employee updateEmployee(@RequestBody Employee emp) {
    return employeeRepository.updateEmployee(emp);
  }

  @RequestMapping(value = "/employees/{empNo}", method = RequestMethod.DELETE, produces = {
      MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
  public void deleteEmployee(@PathVariable("empNo") String empNo) {
    employeeRepository.deleteEmployee(empNo);
  }
}
