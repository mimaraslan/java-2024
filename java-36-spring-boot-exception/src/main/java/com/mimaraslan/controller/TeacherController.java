package com.mimaraslan.controller;

import com.mimaraslan.exception.ResourceNotFoundException_404;
import com.mimaraslan.model.Teacher;
import com.mimaraslan.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


// http://localhost:9090/api/v1
@RestController
@RequestMapping ("/api/v1")
public class TeacherController {

    // Inversion of Control (IoC) - Kontrolü Spirng'e verdi.
    // Dependency Injection (DI)  - Bağımlıkların enjeksiyonu.

    /*
    @Autowired
    TeacherService teacherService;
    */

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }


    //   JAVA - RESTful  - SQL
    //  READ  - GET  - SELECT     // Servise git.  git öğrencileri al gel.

    // http://localhost:9090/api/v1/teacher/all
    @GetMapping("/teacher/all")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }


    //   JAVA - RESTful  - SQL
    //   READ  - GET    - SELECT WHERE      // Servise git. Idsi verilen öğrenciyi al gel.

    // http://localhost:9090/api/v1/teacher/1
    @GetMapping("/teacher/{id}")
    public Teacher getTeacher( @PathVariable (name = "id") String id) throws ResourceNotFoundException_404 {
        return teacherService.getTeacher(id);
    }



    //   JAVA - RESTful  - SQL
    //   CREATE   - POST - INSERT      // Servise git öğrenciyi ekle.

    // http://localhost:9090/api/v1/teacher
    @PostMapping("/teacher")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }

    //   JAVA - RESTful  - SQL
    //   UPDATE - PUT - UPDATE        // Servise git. Gelen yeni bilgiyle eski bilgiyi değiştir.


    // http://localhost:9090/api/v1/teacher
    @PutMapping("/teacher")
    public Optional<Teacher> updateTeacher(@RequestBody Teacher teacher) throws ResourceNotFoundException_404{
        return teacherService.updateTeacher(teacher);
    }

/*
    // http://localhost:9090/api/v1/teacher/1
    @PutMapping("/teacher/{id}")
    public Optional<Teacher> updateTeacher(@PathVariable (name = "id") String id,
                                           @RequestBody Teacher teacher) throws ResourceNotFoundException_404{
        return teacherService.updateTeacher(id, teacher);
    }
*/


    //   JAVA  - RESTful  - SQL
   //   DELETE - DELETE - DELETE       // Servise git. Gelen id veritabanında var mı yok mu?
    // http://localhost:9090/api/v1/teacher/1
    @DeleteMapping("/teacher/{id}")
    public String deleteTeacher( @PathVariable (name = "id")   String id)  throws ResourceNotFoundException_404 {

        return teacherService.deleteTeacher(id);
    }

}
