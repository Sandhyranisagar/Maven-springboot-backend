package net.javagudies.springboot_backend.controller;

import jakarta.persistence.Id;
import net.javagudies.springboot_backend.exception.ResourceNotFoundException;
import net.javagudies.springboot_backend.model.Employee;
import net.javagudies.springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();

    }


}