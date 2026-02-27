//package com.luv2code.springboot.employees.dao;
//
//import com.luv2code.springboot.employees.entity.Employee;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class  EmployeeDAOImpl implements EmployeeDAO{
//
//
//    private EntityManager theEntityManager;
//
//    @Autowired
//    public EmployeeDAOImpl(EntityManager theEntityManager) {
//        this.theEntityManager = theEntityManager;
//    }
//
//    @Override
//    public List<Employee> findAll() {
//        TypedQuery<Employee> query = theEntityManager.createQuery("from Employee", Employee.class);
//        return query.getResultList(); //query execution
//    }
//
//    @Override
//    public Employee findById(long id) {
//        return theEntityManager.find(Employee.class, id);
//    }
//
//    @Override
//    public Employee save(Employee employee) {
//        Employee dbEmployee = theEntityManager.merge(employee);
//        return dbEmployee;
//    }
//
//    @Override
//    public void deleteById(long id) {
//        Employee employee = theEntityManager.find(Employee.class, id);
//        theEntityManager.remove(employee);
//    }
//}
