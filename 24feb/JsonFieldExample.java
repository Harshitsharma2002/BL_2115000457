import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class User {
    @JsonField(name = "user_name")
    private String username = "JohnDoe";
}

public class JsonFieldExample {
    public static void main(String[] args) throws Exception {
        User user = new User();
        Field field = user.getClass().getDeclaredField("username");
        if (field.isAnnotationPresent(JsonField.class)) {
            JsonField jsonField = field.getAnnotation(JsonField.class);
            System.out.println(jsonField.name() + ": " + field.get(user));
        }
    }
}