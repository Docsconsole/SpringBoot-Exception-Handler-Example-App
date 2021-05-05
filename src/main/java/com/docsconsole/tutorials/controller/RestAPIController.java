package com.docsconsole.tutorials.controller;


import com.docsconsole.tutorials.model.Company;
import com.docsconsole.tutorials.model.CompanyDetails;
import com.docsconsole.tutorials.model.request.Employee;
import com.docsconsole.tutorials.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/rest/org")
public class RestAPIController {

    @Autowired
    EmployeeService employeeService;


    @PostMapping(path = "/details")
    public ResponseEntity<CompanyDetails> getOrganizationDetails(@Valid @RequestBody CompanyDetails details) {
        Company company = new Company();
        company.setId(details.getId());
        company.setName(details.getName());
        company.setMobile(details.getMobile());
        company.setLocation(details.getLocation());
        return new ResponseEntity(company, HttpStatus.OK);
    }
    @GetMapping(path = "/employee")
    public ResponseEntity<Employee> getEmployee(@Valid @RequestBody Employee employee) {
        if(employee.getId() != 1001) {
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity(employee, HttpStatus.OK);
    }

    @GetMapping(path = "/employee2")
    public ResponseEntity<Employee> getEmployee1(@Valid @RequestBody Employee employee) {

        if(employee.getId() != 1001) {
             employeeService.getEmployee1(employee);
        }
        return new ResponseEntity(employee, HttpStatus.OK);
    }

}
