
package com.universal.main;

import com.universal.dao.EmployeeDao;
import com.universal.dto.Employee;
import java.util.List;
import java.util.Scanner;

public class UseMe {

    public static void main(String[] args) {
        //insert data
//        System.out.println("please entrer name");
        Scanner sc=new Scanner(System.in);
   //     String name = sc.next();
//          System.out.println("please entrer phone");
//        String phone = sc.next();
//        Employee employee=new Employee();
//        employee.setName(name);
//        employee.setPhone(phone);
//        EmployeeDao.addRecord(employee);
//DELETE RECORD
//        System.out.println("Enter id to delete record");
//        int id = sc.nextInt();
//        EmployeeDao.deleteRecord(id);
//Update Record
//        System.out.println("Please ENter id to update record");
//    int id=sc.nextInt();
//    EmployeeDao.updateRecord(id);
        List<Employee> empList = EmployeeDao.getRecordsFromDatabase();
        for (Employee employee : empList) {
            System.out.println(employee.getId());
            System.out.println(employee.getName());
            System.out.println(employee.getPhone());
        }
    }
   
}
