package com.mimaraslan.service;


import com.mimaraslan.model.Student;
import com.mimaraslan.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class StudentService {

/*
    @Autowired
    StudentRepository studentRepository;
*/

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional (readOnly = true)
    //   READ
    public List<Student> getAllStudents() {
        // veritabanına git öğrencileri al gel.
        return studentRepository.findAll();
    }

    @Transactional (readOnly = true)
    //   READ
    public Student getStudent(Long id) {
        // veritabanına git. Idsi verilen öğrenciyi al gel.
         return studentRepository.findById(id).get();
        //  return studentRepository.getReferenceById(id);
    }


    //   CREATE
    public Student addStudent(Student student) {
        // veritabanına git öğrenciyi ekle.
        // bul
        // ekle
        return studentRepository.save(student);
    }


    //   UPDATE
    public Optional<Student> updateStudent(Student student) {
        // Gelen yeni bilgiyle eski bilgiyi değiştir.

        // FIXME
        // Bul
        // Değiştir
        return Optional.of(studentRepository.save(student));
    }

/*
    //   UPDATE
    public Optional<Student> updateStudent(Long id, Student student) {
        // Gelen yeni bilgiyle eski bilgiyi değiştir.

        // FIXME
        // Bul
        // Değiştir

        student.setId(id);
        return Optional.of(studentRepository.save(student));
    }
*/

    //   DELETE
    public String deleteStudent(Long id) {
        // Gelen id veritabanında var mı yok mu?

        // Bul
        Student studentInfo = studentRepository.findById(id).get();

        if (studentInfo != null) {
            // Sil
            studentRepository.delete(studentInfo);
        } else {
            return "Student not found";
        }

        return  "Student deleted";
    }

}
