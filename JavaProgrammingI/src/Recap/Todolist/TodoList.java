package Recap.Todolist;

import java.util.ArrayList;
import java.util.Scanner;

/*
Create and modify todolist objects.
- add tasks
- remove tasks
- view all tasks
- select from both functionalities through controller method
 */

public class TodoList {
    private String type;
    private ArrayList<String> tasks;

    Scanner scanner = new Scanner(System.in);

    public TodoList(String type) {
        this.type = type;
        this.tasks = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "TodoList{" +
                "type='" + type + '\'' +
                ", tasks=" + tasks +
                '}';
    }

    public void addTask() {
        System.out.println("Write the task to add to the todolist: ");
        this.tasks.add(scanner.nextLine());
        System.out.println("Task added.");
    }

    public void removeTask() {
        for (String s : tasks) {
            System.out.println(s);
        }
        System.out.println("Type the name of the task in full that you would like to remove: ");
        String taskToRemove  = scanner.nextLine();

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.contains(taskToRemove)) {
                tasks.remove(taskToRemove);
                System.out.println("Task removed.");
            } else {
                System.out.println("Double check your input.");
            }
        }
    }

    public void todoListControllerMethod() {
        System.out.println("Type ADD to add a task");
        System.out.println("Type REMOVE to remove a task");
        System.out.println("Type VIEW to view all current tasks");

        String selection = scanner.nextLine();

        switch (selection) {
            case "ADD" -> addTask();
            case "REMOVE" -> removeTask();
            case "VIEW" -> viewTasks();
            default -> System.out.println("Invalid input: ADD or REMOVE");
        }
    }

    public void viewTasks() {
        for (String s : this.tasks) {
            System.out.println(s);
        }
    }
}
