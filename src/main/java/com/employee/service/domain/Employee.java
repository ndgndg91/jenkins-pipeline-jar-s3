package com.employee.service.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "e_id")
    private String id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "start_date")
    private LocalDate startDate;

    @ManyToOne
    @JoinColumn(name = "d_id")
    private Department department;

    public Employee(){}

    public Employee(String id, String fullName, LocalDate startDate, Department department) {
        this.id = id;
        this.fullName = fullName;
        this.startDate = startDate;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Department getDepartment() {
        return department;
    }
}
