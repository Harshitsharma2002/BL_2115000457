import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Performance {
    @LogExecutionTime
    public void processTask() {
        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++);
        long end = System.nanoTime();
        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}

public class LogExecutionTimeExample {
    public static void main(String[] args) throws Exception {
        Performance perf = new Performance();
        Method method = perf.getClass().getMethod("processTask");
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            method.invoke(perf);
        }
    }
}