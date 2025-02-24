import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class ExpensiveComputation {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int compute(int value) {
        if (cache.containsKey(value)) {
            return cache.get(value);
        }
        int result = value * value;
        cache.put(value, result);
        return result;
    }
}

public class CacheResultExample {
    public static void main(String[] args) throws Exception {
        ExpensiveComputation obj = new ExpensiveComputation();
        System.out.println("First Call: " + obj.compute(5));
        System.out.println("Second Call (Cached): " + obj.compute(5));
    }
}