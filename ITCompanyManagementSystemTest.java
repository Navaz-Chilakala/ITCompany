package company;

import java.util.List;

public class ITCompanyManagementSystemTest {

    public static void main(String[] args) {
        ITCompanyManagementSystem system = new ITCompanyManagementSystem();
        Manager sudhakar = new Manager("Sudhakar Narasimhan", "sudhakar@ayarainc.com", "Software");
        Developer navaz = new Developer("Navaz Chilakala", "Navaz.Chilakala@ayarainc.com", "Software", "Java");
        Developer hyma = new Developer("Hyma", "Hyma@ayarainc.com", "Software", "Angular");

        system.addEmployee(sudhakar);
        system.addEmployee(navaz);
        system.addEmployee(hyma);
        navaz.addSkill("Java");
        navaz.addSkill("Spring");
        hyma.addSkill("Angular");
        hyma.addSkill("TypeScript");

        System.out.println("Employees added to the system.");


        Project ayaraProject = new Project("AYARA", sudhakar);
        
        System.out.println(ayaraProject.getName()+"Project created.");

        ayaraProject.addDeveloper(navaz);
        ayaraProject.addDeveloper(hyma);
        System.out.println("Developers assigned to the project.");

        system.addProject(ayaraProject);
        System.out.println("Project added to the system.");

        List<Employee> employees = system.getEmployees();
        System.out.println("List of all employees:");
        for (Employee emp : employees) {
            System.out.println(" - " + emp.getName() + ", " + emp.getDepartment());
            emp.work();
        }

        List<Project> projects = system.getProjects();
        System.out.println("List of all projects:");
        
        for (Project proj : projects) {
            System.out.println("Project: " + proj.getName());
            System.out.println("Project Manager: " + proj.getProjectManager().getName());
            System.out.println("Developers in this project:");
            for (Developer dev : proj.getDevelopers()) {
                System.out.println(" - " + dev.getName() + " (" + dev.getSpecialty() + ")");
                dev.work();
            }
        }
        Task task1 = new Task("T1", "Implement login feature", TaskPriority.HIGH, "Java");
        Task task2 = new Task("T2", "Design database schema", TaskPriority.MEDIUM, "SQL");

        ayaraProject.addTask(task1);
        ayaraProject.addTask(task2);
        System.out.println("Tasks created and added to the project.");
     // Assign tasks based on skills
        if(navaz.hasSkill(task1.getRequiredSkill())) {
            ayaraProject.assignTaskToDeveloper(task1, navaz);
            System.out.println("Task 1 assigned to Navaz.");
        } else {
            System.out.println("Navaz does not have the skill required for Task 1.");
        }

        if(hyma.hasSkill(task2.getRequiredSkill())) {
            ayaraProject.assignTaskToDeveloper(task2, hyma);
            System.out.println("Task 2 assigned to Hyma.");
        } else {
            System.out.println("Hyma does not have the skill required for Task 2.");
        }


        ayaraProject.listAllTasks();

        ayaraProject.markTaskAsComplete("T1");
        System.out.println("Task T1 completed.");

        ayaraProject.listAllTasks();
    }
}
