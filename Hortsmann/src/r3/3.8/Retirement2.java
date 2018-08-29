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

        println("Ile pieni�dzy potrzebujesz, aby przej�� na emerytur�? ");
        double goal = in.nextDouble();

        println("Ile pieni�dzy rocznie b�dziesz wp�aca�? ");
        double payment = in.nextDouble();

        println("Stopa procentowa w %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        // Aktualizacja salda konta, kiedy u�ytkownik jest gotowy przej�� na emerytur�
        do { 
            // Dodawanie tegorocznych p�atno�ci i odsetek
            balance += payment; 
            double interest = balance * interestRate / 100; 
            balance += interest;

            year++;

            // Drukowanie aktualnego stanu konta
            print("Po up�ywie %d lat stan twojego konta wyniesie %,.2f%n", year, balance);

            // Zapytanie o gotowo�� przej�cia na emeryture i pobranie danych
            println("Czy chcesz przej�� na emerytur� ? (T/N)");
            input = in.next();
        }
        while(input.equals("N"));
        
        in.close();
    }
}