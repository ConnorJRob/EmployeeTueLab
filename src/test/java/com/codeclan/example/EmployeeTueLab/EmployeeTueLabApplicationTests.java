package com.codeclan.example.EmployeeTueLab;

import com.codeclan.example.EmployeeTueLab.models.Department;
import com.codeclan.example.EmployeeTueLab.models.Employee;
import com.codeclan.example.EmployeeTueLab.models.Project;
import com.codeclan.example.EmployeeTueLab.repositories.DepartmentRepository;
import com.codeclan.example.EmployeeTueLab.repositories.EmployeeRepository;
import com.codeclan.example.EmployeeTueLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTueLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployees(){
		Department department = new Department("IT");
		departmentRepository.save(department);
		Employee employee = new Employee("Connor", "Robertson", "SLDK12", department);
		Employee employee1 = new Employee("Emil", "Shiva", "SYB15", department);
		employeeRepository.save(employee);
		employeeRepository.save(employee1);
	}

	@Test
	public void createDepartment(){
		Department department = new Department("IT");
		departmentRepository.save(department);
	}

	@Test
	public void createProject(){
		Department department = new Department("IT");
		departmentRepository.save(department);
		Employee employee = new Employee("Connor", "Robertson", "SLDK12", department);
		Employee employee1 = new Employee("Emil", "Shiva", "SYB15", department);
		employeeRepository.save(employee);
		employeeRepository.save(employee1);
		Project project = new Project("Capstone Project", 14);
		project.addEmployee(employee);
		project.addEmployee(employee1);
		projectRepository.save(project);
	}

}
