package pl.javastart.mapy;

import java.util.InputMismatchException;
import java.util.Scanner;

import static pl.javastart.buildsimple.Printer.println;
import static pl.javastart.buildsimple.Printer.printd;


public class CompanyApp {

    private static final int EXIT = 0;
    private static final int ADD = 1;
    private static final int FIND = 2;

    private Company company;

    private CompanyApp() {
        company = new Company();
    }

    public static void main(String[] args) {
        printd("Witaj w systemie obsługi pracowników.");
        CompanyApp companyApp = new CompanyApp();

        try(Scanner in = new Scanner(System.in)) {
            int option;
            do {
                companyApp.printOptions();
                option = in.nextInt();
                in.nextLine();

                switch(option) {
                    case CompanyApp.ADD:
                        try {
                            companyApp.addWorker(in);
                        } catch (InputMismatchException e) {
                            println("Nieporawny wprowadzonych format danych.");
                        }

                        break;
                    case CompanyApp.FIND:
                        try {
                            companyApp.printWorker(in);
                        } catch (NullPointerException e) {
                            println("Nie znaleziono takiego pracownika.");
                        }
                        break;
                    case CompanyApp.EXIT:
                        break;
                }
            } while(option != CompanyApp.EXIT);
        }
    }

    private void printOptions() {
        println("Wybierz opcje:");
        println("0 - EXIT");
        println("1 - ADD WORKER");
        println("2 - FIND WORKER");
    }
    private void addWorker(Scanner in) throws InputMismatchException {
        println("Dodawanie pracownika." +
                "\n Wpisz dane pracownika:");

        println("Imię:");
        String name = in.nextLine();

        println("Nazwisko:");
        String surname = in.nextLine();

        println("Wypłata:");
        double salary = in.nextDouble();

        in.nextLine();

        Employee worker = new Employee(name, surname, salary);
        try {
            company.addWorker(worker);
            println(worker.toString());
        } catch(Exception e) {
            println("Nie udało się dodać nowego pracownika.");
        }

    }
    private void printWorker(Scanner in) throws NullPointerException {
        println("Wyszukiwanie pracownika." +
                "\n Wpisz dane pracownika:");

        println("Imię:");
        String name = in.nextLine();

        println("Nazwisko:");
        String surname = in.nextLine();

        Employee worker = company.getWorker(name, surname);
        println(worker.toString());
    }
}
