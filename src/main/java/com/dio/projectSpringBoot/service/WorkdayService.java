package com.dio.projectSpringBoot.service;

import com.dio.projectSpringBoot.model.Workday;
import com.dio.projectSpringBoot.repository.WorkdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class WorkdayService {

    WorkdayRepository workdayRepository;

    @Autowired
    public WorkdayService(WorkdayRepository workdayRepository) {
        this.workdayRepository = workdayRepository;
    }

    public Workday saveWork(Workday workday){
        return workdayRepository.save(workday);
    }

    public List<Workday> findAll() {
        return  workdayRepository.findAll();
    }

    public Optional<Workday> getById(Long idWork) {
        return workdayRepository.findById(idWork);
    }

    public Workday updateWork(Workday workday){
        return workdayRepository.save(workday);
    }

    public void deleteWork(Long idWork) {
        workdayRepository.deleteById(idWork);
    }
}
