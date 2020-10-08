package com.employee.service.repository;

import com.employee.service.domain.Department;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DepartmentRepository extends PagingAndSortingRepository<Department, String> {
}
