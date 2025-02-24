import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "John")
    void completeTask() {
        System.out.println("Task completed");
    }
}

public class CustomAnnotation {
    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        TaskInfo info = taskManager.getClass().getMethod("completeTask").getAnnotation(TaskInfo.class);
        System.out.println("Priority: " + info.priority() + ", Assigned To: " + info.assignedTo());
    }
}