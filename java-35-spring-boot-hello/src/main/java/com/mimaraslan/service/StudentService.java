package com.mimaraslan.service;


import com.mimaraslan.model.Student;
import com.mimaraslan.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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


    //   READ
    public Student getStudent(Long id) {
        // veritabanına git. Idsi verilen öğrenciyi al gel.
      //  return  studentRepository.findById(id).get();
        return studentRepository.getReferenceById(id);
    }

    public List<Student> getAllStudents() {
        // veritabanına git öğrencileri al gel.
        return studentRepository.findAll();
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

    //   DELETE
    public String deleteStudent(Long id) {
        // Gelen id veritabanında var mı yok mu?

        // Bul
        Student studentInfo = studentRepository.getReferenceById(id);

        if (studentInfo != null) {

            // Sil
            studentRepository.delete(studentInfo);
        } else {
            return "Student not found";
        }

        return  "Student deleted";
    }

}
