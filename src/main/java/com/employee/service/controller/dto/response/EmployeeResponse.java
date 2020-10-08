package com.employee.service.controller.dto.response;

import java.time.LocalDate;
import java.util.StringJoiner;

public final class EmployeeResponse {

    private String id;
    private String fullName;
    private LocalDate startDate;

    private DepartmentResponse department;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public DepartmentResponse getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentResponse department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", EmployeeResponse.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("fullName='" + fullName + "'")
                .add("startDate=" + startDate)
                .add("department=" + department)
                .toString();
    }
}
