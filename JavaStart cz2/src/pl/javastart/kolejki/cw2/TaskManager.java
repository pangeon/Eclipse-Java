package pl.javastart.kolejki.cw2;

import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import static pl.javastart.buildsimple.Printer.println;
import static pl.javastart.buildsimple.Printer.printd;
import static pl.javastart.buildsimple.Printer.err;

public class TaskManager {

    private static final int EXIT = 0;
    private static final int ADD = 1;
    private static final int GET = 2;

    Task newTask;
    Queue<Task> taskQueue;

    TaskManager() {
        newTask = new Task(null, null, null);
        taskQueue = new PriorityQueue<>();
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        try(Scanner in = new Scanner(System.in)) {
            int choice;
            do {
                printOptions();
                choice = in.nextInt();
                in.nextLine();

                switch (choice) {
                    case TaskManager.ADD:
                        try {
                            manager.taskQueue.offer(addTask(in));
                        } catch(IllegalArgumentException e) {
                            err("Błąd: Podane dane są niepoprawne.");
                        }
                        break;
                    case TaskManager.GET:
                        manager.getHigherTask(manager.taskQueue.poll());
                        break;
                    case TaskManager.EXIT:
                        println("Wyjście z programu");
                        break;
                }
            } while (choice != TaskManager.EXIT);
        }
    }
    public static Task addTask(Scanner in) throws InputMismatchException {
        printd("Dodaj nowe zadanie:");
        println("Podaj nazwę:");
        String name = in.nextLine();
        println("Dodaj opis :");
        String description = in.nextLine();
        println("Określ priorytet (LOW, MODERATE, HIGH):");
        Task.Priority priority = Task.Priority.valueOf(in.nextLine().toUpperCase());

        return new Task(name, description, priority);
    }
    public void getHigherTask(Task task) {
        printd("Zadanie do wykonania");
        println(task);
    }
    private static void printOptions() {
        printd("Wybierz jedną z opcji.");
        println("EXIT - 0");
        println("ADD - 1");
        println("GET - 2");
    }
}
