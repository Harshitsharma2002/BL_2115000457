import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class SecureAction {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed.");
    }
}

public class RoleAllowedExample {
    public static void main(String[] args) throws Exception {
        SecureAction action = new SecureAction();
        Method method = action.getClass().getMethod("adminTask");
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed role = method.getAnnotation(RoleAllowed.class);
            if ("ADMIN".equals(role.value())) {
                method.invoke(action);
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}