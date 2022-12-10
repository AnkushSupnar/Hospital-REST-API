package com.hospital.data.dao;

import com.hospital.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Optional<Employee> findByEmpId(int empId);

    List<Employee> findByOrderByEmpIdAsc();

    default String getEmplyee(){
        return "Emplyee from DB";
    }
}
