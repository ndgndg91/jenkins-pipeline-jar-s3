package com.employee.service.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "d_id")
    private String id;

    @Column(name = "d_name")
    private String departmentName;

    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;

    public Department(){}

    public Department(String id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public String getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }
}
