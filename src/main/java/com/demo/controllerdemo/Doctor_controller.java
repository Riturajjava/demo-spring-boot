package com.demo.controllerdemo;

import com.demo.model.Doctor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class  Doctor_controller {

    // add , get_all , Update , delete
    // ArrayList <Data_Type> Obj_name=new ArrayLi
    ArrayList<Doctor> doctorArrayList=new ArrayList<>();
// Add Endpoint
    @RequestMapping("/add_doc")
    public String add(){

        Doctor doctor=new Doctor("Ramesh",29,"Radiosurgery");
        doctorArrayList.add(doctor);
        return "Doctor Record Successfully...";
    }
    // Get_all
@RequestMapping("/Get")
    public ArrayList<Doctor> getDoctorArrayList(){

        return doctorArrayList;
    }
    // Update Endpoint
    @RequestMapping("/update")
    public String updateDocter(){

         Doctor doctor1=doctorArrayList.get(0);
         doctor1.setName("Vimal");

         return doctorArrayList.get(0).getName()+" Record Update Successfully.. ";
    }
   // Delete Endpoint
    @RequestMapping("/Del")
    public String delete(){

        doctorArrayList.remove(0);

        return "Record delete Successful...";
    }



}
