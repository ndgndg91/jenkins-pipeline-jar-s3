package com.employee.service;

import com.employee.service.domain.Department;
import com.employee.service.domain.Employee;
import com.employee.service.repository.DepartmentRepository;
import com.employee.service.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@SpringBootApplication
public class ServiceApplication {

    private final DepartmentRepository departmentRepository;

    private final EmployeeRepository employeeRepository;

    public ServiceApplication(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

    @PostConstruct
    public void initialData(){
        Department dev = new Department("D01", "개발팀");
        Department sOperation = new Department("D02", "서비스운영팀");
        Department design = new Department("D03", "디자인팀");
        Department marketing = new Department("D04", "마케팅팀");

        departmentRepository.save(dev);
        departmentRepository.save(sOperation);
        departmentRepository.save(design);
        departmentRepository.save(marketing);

        Employee ndg = new Employee("E01", "남동길", LocalDate.of(2019, 4, 22), dev);
        Employee kcs = new Employee("E02", "김철수", LocalDate.of(2018, 3, 12), dev);
        Employee kyh = new Employee("E03", "김영희", LocalDate.of(2018, 8, 11), dev);
        Employee pjs = new Employee("E04", "박준수", LocalDate.of(2016, 11, 30), dev);
        Employee lcs = new Employee("E05", "이찬수", LocalDate.of(2015, 9, 5), dev);
        Employee pch = new Employee("E06", "박창현", LocalDate.of(2020, 3, 4), dev);
        Employee ccm = new Employee("E07", "최창민", LocalDate.of(2018, 12, 12), dev);
        Employee syh = new Employee("E08", "송윤호", LocalDate.of(2020, 9, 27), dev);

        employeeRepository.save(ndg);
        employeeRepository.save(kcs);
        employeeRepository.save(kyh);
        employeeRepository.save(pjs);
        employeeRepository.save(lcs);
        employeeRepository.save(pch);
        employeeRepository.save(ccm);
        employeeRepository.save(syh);

        Employee ljh = new Employee("E09", "이지현", LocalDate.of(2012, 1, 2), sOperation);
        Employee pnr = new Employee("E010", "박나래", LocalDate.of(2016, 5, 5), sOperation);
        Employee cmr = new Employee("E011", "최미리", LocalDate.of(2015, 3, 28), sOperation);
        Employee njs = new Employee("E012", "나지수", LocalDate.of(2018, 12, 12), sOperation);

        employeeRepository.save(ljh);
        employeeRepository.save(pnr);
        employeeRepository.save(cmr);
        employeeRepository.save(njs);
    }
}
