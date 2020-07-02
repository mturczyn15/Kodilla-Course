package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public void processSearching(String text, String text2)
            throws SearchProcessingException {

        boolean wasError = false;
        try {
            LOGGER.info("Searching company with fragment in name: " + text);
            List<Company> companies = companyDao.retrieveCompaniesWithFragmentOfName(text);
            if (companies.size() == 0) {
                LOGGER.error(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
                wasError = true;
                throw new SearchProcessingException(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
            } else {
                for (Company company : companies) {
                    System.out.println(company.getName());
                }
            }

            LOGGER.info("Searching employee with fragment in lastname: " + text2);
            List<Employee> employees = employeeDao.retrieveEmployeesWithFragmentOfLastname(text2);
            if (employees.size() == 0) {
                LOGGER.error(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
                throw new SearchProcessingException(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
            } else {
                for (Employee employee : employees) {
                    System.out.println(employee.getFirstname() + employee.getLastname());
                }
            }
        } finally {
            if(wasError) {
                LOGGER.info("Searching finished");
            }
        }
    }

}
