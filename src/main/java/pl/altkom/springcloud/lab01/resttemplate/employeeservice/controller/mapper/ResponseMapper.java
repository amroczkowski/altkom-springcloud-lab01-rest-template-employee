package pl.altkom.springcloud.lab01.resttemplate.employeeservice.controller.mapper;

import java.util.List;
import java.util.stream.Collectors;

import pl.altkom.springcloud.lab01.resttemplate.employeeservice.controller.model.Employee;

public class ResponseMapper {
    public static List<Employee> map(
            final List<pl.altkom.springcloud.lab01.resttemplate.employeeservice.repository.model.Employee> employees) {
        return employees.stream()
                .map(ResponseMapper::map)
                .collect(Collectors.toList());
    }

    public static Employee map(final pl.altkom.springcloud.lab01.resttemplate.employeeservice.repository.model.Employee employee) {
        return Employee.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .city(employee.getCity())
                .projectId(employee.getProjectId())
                .build();
    }
}
