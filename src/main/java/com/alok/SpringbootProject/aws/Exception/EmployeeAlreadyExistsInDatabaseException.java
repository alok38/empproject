package com.alok.SpringbootProject.aws.Exception;



public class EmployeeAlreadyExistsInDatabaseException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EmployeeAlreadyExistsInDatabaseException() {
    	System.out.println("The id already exists in the database");
    }
    public EmployeeAlreadyExistsInDatabaseException(String s) {
    	super(s);
    }
	
	
}
