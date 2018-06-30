/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universal.dao;

import com.universal.common.CommonToolClass;
import com.universal.dto.Employee;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author root
 */
public class EmployeeDao {

    public static void addRecord(Employee employee) {
        Session session = CommonToolClass.getSession();
        session.save(employee);
        session.beginTransaction().commit();
    }

    public static void deleteRecord(int id) {
        Session session = CommonToolClass.getSession();
        Employee e=(Employee)session.get(Employee.class, id);
    session.delete(e);
    session.beginTransaction().commit();
    }

    public static void updateRecord(int id) {
        Session session = CommonToolClass.getSession();
        Employee e=(Employee)session.get(Employee.class, id);
        e.setName("RAMLAL");
        session.update(e);
        session.beginTransaction().commit();
    }

    public static List<Employee> getRecordsFromDatabase() {
         Session session = CommonToolClass.getSession();
        Query query = session.createQuery("from Employee");
       return query.list();
    }
    
}
