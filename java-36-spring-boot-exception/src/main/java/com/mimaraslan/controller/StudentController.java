package com.mimaraslan.controller;

import com.mimaraslan.model.Student;
import com.mimaraslan.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


// http://localhost:9090/api/v1
@RestController
@RequestMapping ("/api/v1")
public class StudentController {

    // Inversion of Control (IoC) - Kontrolü Spirng'e verdi.
    // Dependency Injection (DI)  - Bağımlıkların enjeksiyonu.

    /*
    @Autowired
    StudentService studentService;
    */

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    // http://localhost:9090/api/v1/hello1
   @GetMapping("/hello1")
   public String hi1(){
     return  "Hello Spring Boot 1";
   }


    // http://localhost:9090/api/v1/hello2
    @GetMapping("/hello2")
    public String hi2(){
        return  "Hello Spring Boot 2";
    }


    //   JAVA - RESTful  - SQL
    //  READ  - GET  - SELECT     // Servise git.  git öğrencileri al gel.

    // http://localhost:9090/api/v1/student/all
    @GetMapping("/student/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


    //   JAVA - RESTful  - SQL
    //   READ  - GET    - SELECT WHERE      // Servise git. Idsi verilen öğrenciyi al gel.

    // http://localhost:9090/api/v1/student/1
    @GetMapping("/student/{id}")
    public Student getStudent( @PathVariable (name = "id") Long id) {
        return studentService.getStudent(id);
    }



    //   JAVA - RESTful  - SQL
    //   CREATE   - POST - INSERT      // Servise git öğrenciyi ekle.

    // http://localhost:9090/api/v1/student
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    //   JAVA - RESTful  - SQL
    //   UPDATE - PUT - UPDATE        // Servise git. Gelen yeni bilgiyle eski bilgiyi değiştir.


    // http://localhost:9090/api/v1/student
    @PutMapping("/student")
    public Optional<Student> updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

/*
    // http://localhost:9090/api/v1/student/1
    @PutMapping("/student/{id}")
    public Optional<Student> updateStudent(@PathVariable (name = "id") Long id,
                                           @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }
*/


    //   JAVA  - RESTful  - SQL
   //   DELETE - DELETE - DELETE       // Servise git. Gelen id veritabanında var mı yok mu?
    // http://localhost:9090/api/v1/student/1
    @DeleteMapping("/student/{id}")
    public String deleteStudent( @PathVariable (name = "id")   Long id) {

        return studentService.deleteStudent(id);
    }

}
