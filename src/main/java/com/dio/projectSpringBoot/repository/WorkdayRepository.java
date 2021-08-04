package com.dio.projectSpringBoot.repository;

import com.dio.projectSpringBoot.model.Workday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkdayRepository extends JpaRepository<Workday, Long> {
}