import java.util.Scanner;

class Retirement2 {
    public static void print(String s, Object o, Object l) {
        System.out.printf(s, o, l);
    }
    public static void println(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // Wczytanie danych
        Scanner in = new Scanner(System.in);

        println("Ile pieniêdzy potrzebujesz, aby przejœæ na emeryturê? ");
        double goal = in.nextDouble();

        println("Ile pieniêdzy rocznie bêdziesz wp³acaæ? ");
        double payment = in.nextDouble();

        println("Stopa procentowa w %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        // Aktualizacja salda konta, kiedy u¿ytkownik jest gotowy przejœæ na emeryturê
        do { 
            // Dodawanie tegorocznych p³atnoœci i odsetek
            balance += payment; 
            double interest = balance * interestRate / 100; 
            balance += interest;

            year++;

            // Drukowanie aktualnego stanu konta
            print("Po up³ywie %d lat stan twojego konta wyniesie %,.2f%n", year, balance);

            // Zapytanie o gotowoœæ przejœcia na emeryture i pobranie danych
            println("Czy chcesz przejœæ na emeryturê ? (T/N)");
            input = in.next();
        }
        while(input.equals("N"));
        
        in.close();
    }
}