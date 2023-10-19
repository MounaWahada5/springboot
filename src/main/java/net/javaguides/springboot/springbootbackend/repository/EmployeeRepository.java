package net.javaguides.springboot.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.springboot.springbootbackend.model.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}

