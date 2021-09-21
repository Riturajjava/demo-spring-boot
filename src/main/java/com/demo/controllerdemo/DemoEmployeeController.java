package com.demo.controllerdemo;


import com.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoEmployeeController {

    // ArrayList <Data_type> object_name=new ArrayList <Data_type>();
    ArrayList<Employee> employeeArrayList=new ArrayList<>();
    // Add , get_all , update , delete

    @RequestMapping("/emp_add")
    public String Employee() {

        Employee employee = new Employee("Rajesh", 29, "IT", 56236);
        employeeArrayList.add(employee);
        return "Employee add successfully....";
    }

    // Get_all Endpoint
    @RequestMapping("/get_all_emp")
    public ArrayList<Employee>getEmployeeArrayList(){

        return employeeArrayList;
    }
    // Update Endpoint
@RequestMapping("/Update")
    public String UpdateEmployee(){

        Employee employee1=employeeArrayList.get(0);
            employee1.setName("Dhavendra");

            return employeeArrayList.get(0).getName()+" Update Record Successful.. ";
        }

        // Delete Endpoint
   @RequestMapping("/del")
    public String DeleteEmployee(){

        employeeArrayList.remove(0);

        return " Employee delete Successfully....";
    }

    }


