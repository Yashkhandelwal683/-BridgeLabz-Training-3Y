interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Preparing meals");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Serving customers");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Gordon", 1);
        Worker waiter = new Waiter("James", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}
