package company;

import java.util.HashSet;
import java.util.Set;

public class Developer extends Employee {
    private String specialty;
    private Set<String> skills;

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public Set<String> getSkills() {
        return skills;
    }
    public boolean hasSkill(String skill) {
        return skills.contains(skill);
    }


    public Developer(String name, String email, String department, String specialty) {
        super(name, email, department);
        this.specialty = specialty;
        this.skills = new HashSet<>();
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding in " + specialty + ".");
    }
}
