package com.rudeveloper.lms.subjectserviceapi.service.impl;

import com.rudeveloper.lms.subjectserviceapi.dto.request.RequestSubjectDto;
import com.rudeveloper.lms.subjectserviceapi.entities.Subject;
import com.rudeveloper.lms.subjectserviceapi.repository.SubjectRepository;
import com.rudeveloper.lms.subjectserviceapi.service.SubjectService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    @Override
    public void createSubject(RequestSubjectDto dto) {

        Subject subject= Subject.builder()
                .name(dto.getName())
                .status(dto.isStatus())
                .build();

        subjectRepository.save(subject);
    }

    public boolean isListAvailable(List<Long> ids){
        subjectRepository.findByIdIn(ids).forEach(e->
            System.out.println(e.getName()));

        for (Subject subject:subjectRepository.findByIdIn(ids)){
            if(!subject.isStatus()){
                return false;
            }
        }

        return true;
    }
}
