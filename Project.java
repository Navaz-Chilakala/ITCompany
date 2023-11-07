package company;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private Manager projectManager;
    private List<Developer> developers;
    private List<Task> tasks;

    public Project(String name, Manager projectManager) {
        this.name = name;
        this.projectManager = projectManager;
        this.developers = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addDeveloper(Developer dev) {
        if (!developers.contains(dev)) {
            developers.add(dev);
        }
    }

    public void addTask(Task task) {
        if (!tasks.contains(task)) {
            tasks.add(task);
        }
    }

    public void assignTaskToDeveloper(Task task, Developer developer) {
        if (tasks.contains(task) && developers.contains(developer)) {
            task.setAssignee(developer);
        }
    }

    public String getName() {
        return name;
    }
    public void assignTasksAutomatically() {
        for (Task task : tasks) {
            for (Developer dev : developers) {
                if (dev.getSkills().contains(task.getRequiredSkill())) {
                    task.setAssignee(dev);
                    Logger.log("Task " + task.getId() + " assigned to " + dev.getName());
                    break;
                }
            }
        }
    }


    public Manager getProjectManager() {
        return projectManager;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void markTaskAsComplete(String taskId) {
        tasks.stream()
            .filter(task -> taskId.equals(task.getId()))
            .findFirst()
            .ifPresent(Task::completeTask);
    }

    public void listAllTasks() {
        tasks.forEach(System.out::println);
    }
}
