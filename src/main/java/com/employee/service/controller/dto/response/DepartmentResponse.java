package com.employee.service.controller.dto.response;

import java.util.StringJoiner;

public final class DepartmentResponse {

    private String id;
    private String departmentName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DepartmentResponse.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("departmentName='" + departmentName + "'")
                .toString();
    }
}
