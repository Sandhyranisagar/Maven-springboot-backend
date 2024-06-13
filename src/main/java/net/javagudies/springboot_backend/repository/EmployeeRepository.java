package net.javagudies.springboot_backend.repository;


import net.javagudies.springboot_backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}