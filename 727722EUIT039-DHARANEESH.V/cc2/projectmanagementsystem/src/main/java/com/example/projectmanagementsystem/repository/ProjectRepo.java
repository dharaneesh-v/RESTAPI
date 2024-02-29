package com.example.projectmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectmanagementsystem.model.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Long>{
    
}
