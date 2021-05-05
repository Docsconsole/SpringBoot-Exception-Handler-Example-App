package com.docsconsole.tutorials.exception;


public class EmployeeNotFoundException extends Exception {

    private static final long serialVersionUID = -3332292346834265371L;

    public EmployeeNotFoundException(int id){
        super("Employee does not existed with id: "+id);
    }
}
