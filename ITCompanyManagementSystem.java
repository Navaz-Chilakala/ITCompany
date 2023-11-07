package company;

import java.util.ArrayList;
import java.util.List;

public class ITCompanyManagementSystem {
    private List<Employee> employees;
    private List<Project> projects;

    public ITCompanyManagementSystem() {
        employees = new ArrayList<>();
        projects = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void addProject(Project proj) {
        projects.add(proj);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Project> getProjects() {
        return projects;
    }

}
