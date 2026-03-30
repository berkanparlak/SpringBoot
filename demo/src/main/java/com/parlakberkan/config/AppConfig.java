package com.parlakberkan.config;

import com.parlakberkan.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","Berkan","Parlak"));
        employeeList.add(new Employee("2","Atakan","Parlak"));
        employeeList.add(new Employee("3","Batuhan","Yilmaz"));
        employeeList.add(new Employee("4","Enes","Keskin"));
        employeeList.add(new Employee("6","Feyyaz","Kara"));
        employeeList.add(new Employee("7","Feyyaz","Türk"));
        employeeList.add(new Employee("8","Feyyaz","Kara"));
        return employeeList;
    }
}
