package com.demo.controllerdemo;

import com.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class EmpwithRequestbody {


    // ArrayList <Data_type> object_name=new ArrayList <Data_type>();
    ArrayList<Employee> employeeArrayList = new ArrayList<>();
    // Add , get_all , update , delete


    @RequestMapping( "/Emp_add")
    public String Employee( @RequestBody Employee employee ) {


        employeeArrayList.add(employee);
        return "Employee add successfully....";
    }

    // Get_all Endpoint
    @RequestMapping(value = "/get_all_emp_N",method = RequestMethod.GET)
    public ArrayList<Employee>getEmployeeArrayList(){

        return employeeArrayList;
    }
    // Update Endpoint
    @RequestMapping(value = "/Update_N",method = RequestMethod.PUT)
    public String UpdateEmployee(){

        Employee employee1=employeeArrayList.get(0);
        employee1.setName("Dhavendra");

        return employeeArrayList.get(0).getName()+" Update Record Successful.. ";
    }

    // Delete Endpoint
    @RequestMapping(value = "/del_N",method = RequestMethod.DELETE)
    public String DeleteEmployee(){

        employeeArrayList.remove(0);

        return " Employee delete Successfully....";
    }

}



