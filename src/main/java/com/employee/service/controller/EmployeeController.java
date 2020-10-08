package com.employee.service.controller;

import com.employee.service.controller.dto.request.CreateEmployeeRequest;
import com.employee.service.controller.dto.request.DeleteEmployeeRequest;
import com.employee.service.controller.dto.response.EmployeeResponse;
import com.employee.service.controller.dto.request.UpdateEmployeeRequest;
import com.employee.service.domain.Employee;
import com.employee.service.exception.EmployeeNotFoundException;
import com.employee.service.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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
    public Mono<EmployeeResponse> findById(
            @PathVariable String eId
    ){
        Employee employee = employeeRepository.findById(eId)
                .orElseThrow(EmployeeNotFoundException::new);

        EmployeeResponse response = new EmployeeResponse();
        modelMapper.map(employee, response);
        return Mono.just(response);
    }

    @GetMapping
    public Flux<?> findByDId(
            @RequestParam String dId
    ) {
        return Flux.empty();
    }

    @PostMapping
    public Mono<Void> create(
            @RequestBody CreateEmployeeRequest request
    ) {
        return Mono.empty();
    }

    @PutMapping("/{eId}")
    public Mono<Void> create(
            @PathVariable String eId,
            @RequestBody UpdateEmployeeRequest request
    ) {
        return Mono.empty();
    }

    @DeleteMapping("/{eId}")
    public Mono<Void> delete(
            @PathVariable String eId,
            @RequestBody DeleteEmployeeRequest request
    ) {
        return Mono.empty();
    }
}
