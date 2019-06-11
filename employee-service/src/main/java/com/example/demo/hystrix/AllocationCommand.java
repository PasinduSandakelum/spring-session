package com.example.demo.hystrix;

import com.example.demo.modal.Allocation;
import com.example.demo.modal.Employee;
import com.example.demo.modal.EmployeeAllocation;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class AllocationCommand extends HystrixCommand<EmployeeAllocation> {

    Employee employee;
    HttpHeaders httpHeaders;

    @Autowired
    RestTemplate restTemplate;

    public AllocationCommand(Employee employee, HttpHeaders httpHeaders, RestTemplate restTemplate) {
        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.employee = employee;
        this.httpHeaders = httpHeaders;
        this.restTemplate = restTemplate;
    }

    @Override
    protected EmployeeAllocation run() throws Exception {
        ResponseEntity<EmployeeAllocation> responseEntity;
        HttpEntity<String> entity = new HttpEntity<>("", httpHeaders);
        responseEntity = restTemplate.exchange("http://allocation-service/emscloud/allocation/employee/"
                .concat(employee.getId().toString()), HttpMethod.GET, entity, EmployeeAllocation.class);

        return responseEntity.getBody();
    }

    @Override
    protected EmployeeAllocation getFallback() {
        EmployeeAllocation employeeAllocation = new EmployeeAllocation();
        employeeAllocation.setEmployeeAllocations(Arrays.asList(new Allocation()));
        return employeeAllocation;
    }
}
