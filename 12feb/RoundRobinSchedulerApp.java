class Process {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head = null;
    private Process tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            head.next = head;
            tail = head;
        } else {
            tail.next = newProcess;
            newProcess.next = head;
            tail = newProcess;
        }
    }

    public void removeProcess(int processId) {
        if (head == null) return;

        Process temp = head, prev = null;
        while (temp.processId != processId) {
            if (temp.next == head) return;
            prev = temp;
            temp = temp.next;
        }

        if (temp == head && temp.next == head) {
            head = null;
            tail = null;
        } else if (temp == head) {
            head = head.next;
            tail.next = head;
        } else if (temp == tail) {
            prev.next = head;
            tail = prev;
        } else {
            prev.next = temp.next;
        }
    }

    public void simulateScheduling() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        int totalTime = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int processCount = 0;

        Process current = head;
        while (head != null) {
            System.out.println("\nExecuting Process ID: " + current.processId);
            if (current.remainingTime > timeQuantum) {
                totalTime += timeQuantum;
                current.remainingTime -= timeQuantum;
            } else {
                totalTime += current.remainingTime;
                totalTurnaroundTime += totalTime;
                totalWaitingTime += totalTime - current.burstTime;
                processCount++;
                int completedProcessId = current.processId;
                current = current.next;
                removeProcess(completedProcessId);
                if (current == head) break;
                continue;
            }
            current = current.next;
        }

        System.out.println("\nAverage Waiting Time: " + (double) totalWaitingTime / processCount);
        System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / processCount);
    }

    public void displayQueue() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Process temp = head;
        System.out.println("\nCurrent Process Queue:");
        do {
            System.out.println("Process ID: " + temp.processId + " | Burst Time: " + temp.remainingTime + " | Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}

public class RoundRobinSchedulerApp {
    public static void main(String[] args) {
        int timeQuantum = 3;
        RoundRobinScheduler scheduler = new RoundRobinScheduler(timeQuantum);

        
        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);
        scheduler.addProcess(4, 6, 2);

       
        System.out.println("\n=== Initial Process Queue ===");
        scheduler.displayQueue();

      
        System.out.println("\n=== Simulating Round Robin Scheduling ===");
        scheduler.simulateScheduling();

        
        System.out.println("\n=== Final Process Queue ===");
        scheduler.displayQueue();
    }
}