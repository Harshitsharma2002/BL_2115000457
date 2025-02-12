import java.util.Scanner;

class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private Task head = null;
    private Task tail = null;
    private Task currentTask = null;  
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            tail.next = head;  
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;  
        }
        if (currentTask == null) currentTask = head; 
    }


    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            tail.next = head;  
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head; 
        }
        if (currentTask == null) currentTask = head;
    }

    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position <= 0 || head == null) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;
        for (int i = 0; temp.next != head && i < position - 1; i++) {
            temp = temp.next;
        }
        newTask.next = temp.next;
        temp.next = newTask;
        if (temp == tail) tail = newTask; 
        tail.next = head;  
    }


    public void removeByTaskId(int taskId) {
        if (head == null) return;
        
        Task temp = head, prev = null;
        
       
        if (head.taskId == taskId) {
            if (head == tail) {
                head = tail = null; 
            } else {
                head = head.next;
                tail.next = head;  
            }
            return;
        }

        do {
            prev = temp;
            temp = temp.next;
            if (temp.taskId == taskId) {
                prev.next = temp.next;
                if (temp == tail) tail = prev;  
                tail.next = head;
                return;
            }
        } while (temp != head);
        
        System.out.println("Task not found!");
    }

   
    public void viewNextTask() {
        if (currentTask == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Current Task ID: " + currentTask.taskId + ", Name: " + currentTask.taskName +
                ", Priority: " + currentTask.priority + ", Due Date: " + currentTask.dueDate);
        currentTask = currentTask.next;  
    }

    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

   
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName +
                        ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No tasks found with priority " + priority);
    }
}

public class TaskManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        
        scheduler.addAtBeginning(1, "TaskA", 2, "2025-02-12");
        scheduler.addAtEnd(2, "TaskB", 3, "2025-02-15");
        scheduler.addAtPosition(1, 3, "TaskC", 1, "2025-02-10");

        System.out.println("\n=== Display All Tasks ===");
        scheduler.displayAllTasks();

        System.out.println("\n=== View Next Task ===");
        scheduler.viewNextTask();

        System.out.println("\n=== View Next Task Again ===");
        scheduler.viewNextTask();

        System.out.println("\n=== Search Task by Priority (2) ===");
        scheduler.searchByPriority(2);

        System.out.println("\n=== Remove Task with ID 2 ===");
        scheduler.removeByTaskId(2);
        scheduler.displayAllTasks();

        sc.close();
    }
}