package com.example.crudSpringDemo.Controller;

import com.example.crudSpringDemo.Entity.Student;
import com.example.crudSpringDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }


   @PostMapping("/create")
  public ResponseEntity<Student> createStudent(@RequestBody  Student studentReq)
   {

       Student studentResp = studentService.createStudent(studentReq);
       return ResponseEntity.status(HttpStatus.CREATED).body(studentResp);

     }

     @GetMapping("/get")
    public ResponseEntity<Student> getStudent(@RequestParam Long id)
     {
         System.out.println("HARSHA ");
      Student student= studentService.getStudent(id);

      if(student == null)
      {
          return ResponseEntity.notFound().build();
      }

      return ResponseEntity.ok(student);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>>  getAllStudent()
    {
      List<Student> students =  studentService.getAllStudent();

      if(students.isEmpty())
      {
          return ResponseEntity.notFound().build();
      }
      return ResponseEntity.ok(students);
    }

    @PatchMapping("/update")
    public ResponseEntity<Student>  updateStudent(@RequestParam Long id ,@RequestBody  Student studentReq)
    {
        Student  student   =  studentService.updateStudent(id, studentReq);

        if(student == null)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);
    }


    @DeleteMapping("/delete")
    public ResponseEntity<String>  deleteStudent(@RequestParam Long id)
    {
        Boolean  isDeleted   =  studentService.deleteStudent(id);

        if(!isDeleted)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Student Deleted");
    }

    @PatchMapping("/delete-softly")
    public ResponseEntity<String>  deleteStudentSoftly(@RequestParam Long id)
    {
        Boolean  isDeleted   =  studentService.deleteStudentSoftly(id);

        if(!isDeleted)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Student Deleted");
    }


}
