package com.luv2code.springboot.employees.controller;

import com.luv2code.springboot.employees.entity.Employee;
import com.luv2code.springboot.employees.request.EmployeeRequest;
import com.luv2code.springboot.employees.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Employee Controller", description = "Employee Controller for employee manipulation APIs")
@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

//    private EmployeeDAO theEmployeeDAO; //The quick and dirty way
    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Operation(summary = "Retrieve all employees", description = "Find all employees' data")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Employee> getEmployees(){
        return employeeService.findAll();
    }

    @Operation(summary = "Retrieve employee by id", description = "Pass employee id to find existing employee")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{employeeId}")
    public Employee getEmployee(@PathVariable @Min(value = 1) long employeeId){
        return employeeService.findById(employeeId);
    }

    @Operation(summary = "Create a new employee",description = "Create a new employee")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public Employee addEmployee(@Valid @RequestBody EmployeeRequest employeeRequest){
        return employeeService.save(employeeRequest);
    }

    @Operation(summary = "Update specific employee by id", description = "Update employee and send it back to user")
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{employeeId}")
    public Employee updateEmployee(@PathVariable @Min(value = 1) long employeeId, @Valid @RequestBody EmployeeRequest employeeRequest){
        return employeeService.update(employeeId, employeeRequest);
    }

    @Operation(summary = "Delete employee by id", description = "Removing employee from database")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{employeeId}")
    public void deleteEmployee(@PathVariable @Min(value = 1) long employeeId){
        employeeService.deleteById(employeeId);
    }
}
