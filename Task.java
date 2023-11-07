package company;


public class Task {
    private String id;
    private String description;
    private Developer assignee;
    private boolean isCompleted;
    private TaskPriority priority;
    private String requiredSkill;
    public Task(String id, String description, TaskPriority priority, String requiredSkill) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.requiredSkill = requiredSkill;
        this.isCompleted = false;
    }
    public String getRequiredSkill() {
        return requiredSkill;
    }
    public void setRequiredSkill(String requiredSkill) {
        this.requiredSkill = requiredSkill;
    }
    public void setAssignee(Developer assignee) {
        this.assignee = assignee;
    }

    public Developer getAssignee() {
        return assignee;
    }

    public void completeTask() {
        this.isCompleted = true;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
               "id='" + id + '\'' +
               ", description='" + description + '\'' +
               ", assignee=" + (assignee != null ? assignee.getName() : "none") +
               ", isCompleted=" + isCompleted +
               ", priority=" + priority +
               '}';
    }
}
