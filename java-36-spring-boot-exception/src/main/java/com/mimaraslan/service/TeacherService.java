package com.mimaraslan.service;


import com.mimaraslan.model.Teacher;
import com.mimaraslan.repository.TeacherRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class TeacherService {

/*
    @Autowired
    TeacherRepository teacherRepository;
*/

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Transactional (readOnly = true)
    //   READ
    public List<Teacher> getAllTeachers() {
        // veritabanına git öğretmenler al gel.
        return teacherRepository.findAll();
    }

    @Transactional (readOnly = true)
    //   READ
    public Teacher getTeacher(String id) {
        // veritabanına git. Idsi verilen öğrenciyi al gel.
         return teacherRepository.findById(id).get();
        //  return teacherRepository.getReferenceById(id);
    }


    //   CREATE
    public Teacher addTeacher(Teacher teacher) {
        // veritabanına git öğretmeni ekle.
        // bul
        // ekle
        return teacherRepository.save(teacher);
    }


    //   UPDATE
    public Optional<Teacher> updateTeacher(Teacher teacher) {
        // Gelen yeni bilgiyle eski bilgiyi değiştir.

        // FIXME
        // Bul
        // Değiştir
        return Optional.of(teacherRepository.save(teacher));
    }

/*
    //   UPDATE
    public Optional<Teacher> updateTeacher(String id, Teacher teacher) {
        // Gelen yeni bilgiyle eski bilgiyi değiştir.

        // FIXME
        // Bul
        // Değiştir

        teacher.setId(id);
        return Optional.of(teacherRepository.save(teacher));
    }
*/

    //   DELETE
    public String deleteTeacher(String id) {
        // Gelen id veritabanında var mı yok mu?

        // Bul
        Teacher teacherInfo = teacherRepository.findById(id).get();

        if (teacherInfo != null) {
            // Sil
            teacherRepository.delete(teacherInfo);
        } else {
            return "Teacher not found";
        }

        return  "Teacher deleted";
    }

}
