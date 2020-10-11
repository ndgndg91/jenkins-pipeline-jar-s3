package com.employee.service.controller;

import com.employee.service.controller.dto.request.CreateEmployeeRequest;
import com.employee.service.controller.dto.request.DeleteEmployeeRequest;
import com.employee.service.controller.dto.response.EmployeeResponse;
import com.employee.service.controller.dto.request.UpdateEmployeeRequest;
import com.employee.service.domain.Employee;
import com.employee.service.exception.EmployeeNotFoundException;
import com.employee.service.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    private final ModelMapper modelMapper;

    public EmployeeController(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{eId}")
    public ResponseEntity<EmployeeResponse> findById(
            @PathVariable String eId
    ){
        Employee employee = employeeRepository.findById(eId)
                .orElseThrow(EmployeeNotFoundException::new);

        EmployeeResponse response = new EmployeeResponse();
        modelMapper.map(employee, response);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<?> findByDId(
            @RequestParam String dId
    ) {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Void> create(
            @RequestBody CreateEmployeeRequest request
    ) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{eId}")
    public ResponseEntity<Void> create(
            @PathVariable String eId,
            @RequestBody UpdateEmployeeRequest request
    ) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{eId}")
    public ResponseEntity<Void> delete(
            @PathVariable String eId,
            @RequestBody DeleteEmployeeRequest request
    ) {
        return ResponseEntity.ok().build();
    }
}
