package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception {

    public static String ERR_EMPLOYEE_NOT_FOUND = "Not found employee";
    public static String ERR_COMPANY_NOT_FOUND = "Not found company";

    public SearchProcessingException (String message) {
            super(message);
        }
}
