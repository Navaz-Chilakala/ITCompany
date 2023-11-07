package company;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Employee> teamMembers;

    public Manager(String name, String email, String department) {
        super(name, email, department);
        teamMembers = new ArrayList<>();
    }

    public void addTeamMember(Employee emp) {
        teamMembers.add(emp);
    }

    public List<Employee> getTeamMembers() {
        return teamMembers;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing the team.");
    }
}
