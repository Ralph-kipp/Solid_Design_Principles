package Solid_Design_Principles;

public class SRPExample {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.createUser("Alice");
    }
}

class UserManager {
    public void createUser(String name) {
        System.out.println("Creating user: " + name);
        Logger.log("User " + name + " created.");
    }
}

class Logger {
    public static void log(String message) {
        System.out.println("[LOG] " + message);
    }
}