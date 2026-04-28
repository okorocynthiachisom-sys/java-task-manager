import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Java Task Manager ---");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                addTask();
            } else if (choice == 2) {
                viewTasks();
            } else if (choice == 3) {
                running = false;
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void addTask() {
        System.out.print("Enter your task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks added yet.");
        } else {
            System.out.println("\nYour Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}