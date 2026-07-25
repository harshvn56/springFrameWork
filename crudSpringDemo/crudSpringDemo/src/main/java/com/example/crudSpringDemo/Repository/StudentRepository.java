package com.example.crudSpringDemo.Repository;

import com.example.crudSpringDemo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
@Component
public interface StudentRepository extends JpaRepository<Student, Long>
{
   List<Student> findByDeletedIsFalse();
   Optional<Student> findByIdAndDeletedIsFalse(Long id);
}
