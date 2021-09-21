package com.demo.controllerdemo;


import com.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.demo.repository.EmployeejpaReprositry;


import java.util.List;
import java.util.Optional;


@RestController
public class DatabaseController {
   //Class_name Var_name;
    @Autowired
    EmployeejpaReprositry employeejpaReprositry;// Spring way of creating object


    // End point Get_all
    @RequestMapping(value = "/all",method = RequestMethod.GET)

    public List<Employee> getAllEmployee(){

        return employeejpaReprositry.findAll();
    }
// End point add(save), http (post)

    @RequestMapping(value = "/add",method = RequestMethod.POST)

    public Employee aademployee(@RequestBody Employee employee){

    return employeejpaReprositry.save(employee);
    }
 // End point update, http (post)

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Employee FindEmployee(Employee employee){

        return employeejpaReprositry.save(employee);
    }
   // End point delete
@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
   public void removeEmployee(@RequestParam Long id){

        employeejpaReprositry.deleteById(id);
   }
// End Point Find_id
   @RequestMapping(value = "/findid",method =RequestMethod.GET)
   public Optional<Employee> findEmployee(@RequestParam Long id){

        return employeejpaReprositry.findById(id);
   }

}
