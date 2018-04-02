package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTest {

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void retrieveCompaniesWithFragmentTest() throws SearchExceptions {

        //Given

        Company izabela = new Company("Izabela");
        Company jurand = new Company("Jurand");

        //When
        companyDao.save(izabela);
        companyDao.save(jurand);
        int companyIdIza = izabela.getId();
        int companyIdJurand = jurand.getId();
        List<Company> list = companyFacade.retrieveCompaniesWithFragment("bel");

        //Then
        Assert.assertEquals(1, list.size());

        //Clean-up
        try {
            companyDao.delete(companyIdIza);
            companyDao.delete(companyIdJurand);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void retrieveEmployeesWithFragmentTest() throws SearchExceptions {

        //Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Maria", "Konopnicka");

        //When
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        int employeeIdEmployee1 = employee1.getId();
        int employeeIdEmployee2 = employee2.getId();
        List<Employee> list = companyFacade.retrieveEmployeesWithFragment("owa");

        //Then
        Assert.assertEquals(1, list.size());

        //Clean-up
        try {
            employeeDao.delete(employeeIdEmployee1);
            employeeDao.delete(employeeIdEmployee2);
        } catch (Exception e) {
            //do nothing
        }
    }
}