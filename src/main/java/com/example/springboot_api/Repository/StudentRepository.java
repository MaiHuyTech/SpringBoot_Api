package com.example.springboot_api.Repository;

import com.example.springboot_api.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author MPHuy on 17/09/2021
 */
public interface StudentRepository extends JpaRepository<Student,Long>     {

}
