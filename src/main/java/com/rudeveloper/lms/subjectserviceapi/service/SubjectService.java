package com.rudeveloper.lms.subjectserviceapi.service;

import com.rudeveloper.lms.subjectserviceapi.dto.request.RequestSubjectDto;

import java.util.List;

public interface SubjectService {


    public void createSubject(RequestSubjectDto dto);
    public boolean isListAvailable(List<Long> ids);
}
