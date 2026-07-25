package com.example.crudSpringDemo.Service;

import com.example.crudSpringDemo.Entity.Student;
import com.example.crudSpringDemo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService
{
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq)
    {
        studentReq.setDeleted(false);
        Student studentResp = studentRepository.save(studentReq);
        return studentResp;
    }

    public Student getStudent(Long id)
    {
       Optional<Student>  student = studentRepository.findById(id);

       if(student.isPresent())
        {
            return student.get();
        }
       return null;
    }

    public List<Student> getAllStudent()
    {
       List<Student> studentResp = studentRepository.findByDeletedIsFalse();
       return  studentResp;
    }

    public Student updateStudent(long id, Student studentReq) {
        Optional<Student> existingStudent = studentRepository.findByIdAndDeletedIsFalse(id);

        if (existingStudent.isEmpty()) {
            return null;
        }

        Student studentToSave = existingStudent.get();

        studentToSave.setAge(studentReq.getAge());
        studentToSave.setName(studentReq.getName());
        studentToSave.setEmail(studentReq.getEmail());
        studentToSave.setPhone(studentReq.getPhone());
        studentToSave.setRoll_no(studentReq.getRoll_no());

        return studentRepository.save(studentToSave);

    }

    public Boolean deleteStudent(Long id)
    {
        boolean existingStudent = studentRepository.existsById(id);

        if (!existingStudent) {
            return false;
        }

        studentRepository.deleteById(id);
        return true;
    }

    public Boolean  deleteStudentSoftly(Long id)
    {
        Optional<Student> existingStudent = studentRepository.findByIdAndDeletedIsFalse(id);

        if (existingStudent.isEmpty()) {
            return false;
        }

        Student studentToDelete = existingStudent.get();
        studentToDelete.setDeleted(true);
        studentRepository.save(studentToDelete);
        return true;
    }
}
