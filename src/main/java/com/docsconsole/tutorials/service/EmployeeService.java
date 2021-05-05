package com.docsconsole.tutorials.service;

import com.docsconsole.tutorials.exception.MyResourceNotFoundException;
import com.docsconsole.tutorials.model.request.Employee;

public interface EmployeeService {

    Employee getEmployee1(Employee employee) throws MyResourceNotFoundException;

}
