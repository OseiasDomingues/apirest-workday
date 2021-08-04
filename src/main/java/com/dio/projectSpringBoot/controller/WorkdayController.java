package com.dio.projectSpringBoot.controller;

import com.dio.projectSpringBoot.service.WorkdayService;
import com.dio.projectSpringBoot.model.Workday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/work")
public class WorkdayController {

    @Autowired
    WorkdayService workdayService;

    @PostMapping
    public Workday createWorkday(@RequestBody Workday workday){
        return workdayService.saveWork(workday);
    }

    @GetMapping
    public List<Workday> getWorkdayList(){ return workdayService.findAll(); }

    @GetMapping("/{idWork}")
    public ResponseEntity<Workday> getWorkdayById(@PathVariable("idWork") Long idWork) throws Exception {
        return ResponseEntity.ok(workdayService.getById(idWork).orElseThrow(() -> new NoSuchElementException("not found")));
    }

    @PutMapping
    public Workday updateWork(@RequestBody Workday workday){ return workdayService.updateWork(workday); }

    @DeleteMapping
    public ResponseEntity deleteById(@PathVariable("idWork") Long idWork) throws Exception{
        try {
            workdayService.deleteWork(idWork);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Workday>) ResponseEntity.ok();
    }



}
