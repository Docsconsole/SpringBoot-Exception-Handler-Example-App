package com.docsconsole.tutorials.controller;

import com.docsconsole.tutorials.exception.EmployeeNotFoundException;
import com.docsconsole.tutorials.model.Company;
import com.docsconsole.tutorials.model.request.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

@Controller
@RequestMapping(path = "/api/org")
public class EmployeeController {

    @GetMapping(path = "/employee")
    public ResponseEntity<Employee> getEmployee(@Valid @RequestBody Employee employee) throws Exception {
        if(employee.getId() != 1001) {
            throw new EmployeeNotFoundException(employee.getId());
        }
        return new ResponseEntity(employee, HttpStatus.OK);
    }
    @ExceptionHandler
    @ResponseBody
    public String handleException (EmployeeNotFoundException e) {
        return "Exception :" + e.toString();
    }
}
