package com.docsconsole.tutorials.service;


import com.docsconsole.tutorials.exception.MyResourceNotFoundException;
import com.docsconsole.tutorials.model.request.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    public Employee getEmployee1(Employee emplooye) throws MyResourceNotFoundException {
        throw new MyResourceNotFoundException();
    }
}
