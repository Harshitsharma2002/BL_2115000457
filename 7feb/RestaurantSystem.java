
interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing " + specialty + " dishes.");
    }
}

class Waiter extends Person implements Worker {
    int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tablesAssigned + " tables.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Gaurav Patel", 101, "Italian");
        Worker waiter = new Waiter("Rahul Sharma", 202, 5);

        chef.performDuties();
        waiter.performDuties();
    }
}
