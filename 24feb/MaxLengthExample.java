import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        if (username.length() > 10) {
            throw new IllegalArgumentException("Username exceeds max length");
        }
        this.username = username;
    }
}

public class MaxLengthExample {
    public static void main(String[] args) {
        new User("ValidUser");
    }
}