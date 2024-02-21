package com.example.projectmanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long projectId;
    String projectName,projectRequirement,projectDescription,projectStart,projectDeadline,projectStatus;
    public Long getProjectId() {
        return projectId;
    }
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectRequirement() {
        return projectRequirement;
    }
    public void setProjectRequirement(String projectRequirement) {
        this.projectRequirement = projectRequirement;
    }
    public String getProjectDescription() {
        return projectDescription;
    }
    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
    public String getProjectStart() {
        return projectStart;
    }
    public void setProjectStart(String projectStart) {
        this.projectStart = projectStart;
    }
    public String getProjectDeadline() {
        return projectDeadline;
    }
    public void setProjectDeadline(String projectDeadline) {
        this.projectDeadline = projectDeadline;
    }
    public String getProjectStatus() {
        return projectStatus;
    }
    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }
    

}
