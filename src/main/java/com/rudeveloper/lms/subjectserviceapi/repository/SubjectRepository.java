package com.rudeveloper.lms.subjectserviceapi.repository;

import com.rudeveloper.lms.subjectserviceapi.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject,Long> {

List<Subject> findByIdIn(List<Long> ids);
}
