import java.util.Scanner;

class Retirement {
    public static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        // Wczytanie danych
        Scanner in = new Scanner(System.in);

        print("Ile pieniêdzy potrzebujesz, aby przejœæ na emeryturê? ");
        double goal = in.nextDouble();

        print("Ile pieniêdzy rocznie bêdziesz wp³acaæ? ");
        double payment = in.nextDouble();

        print("Stopa procentowa w %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        // Aktualizacja salda konta (balance) jeœli cel (goal) nie zosta³ osi¹gniêty
        while (balance < goal) { // kiedy saldo osi¹gnie cel koniec pêtli 
            // Dodanie tegorocznych p³atnoœci (payment) i odsetek (intereset), rate - znaczy stopa
            balance += payment; // saldo = saldo + wp³ata
            double interest = balance * interestRate / 100; // odsetki = saldo * procent / 100
            balance += interest; // saldo = saldo + odsetki 
            years++; // lata rosn¹ póki cel nie zostanie osi¹gniêty
            print("Obliczenia pêtli: saldo = " + balance + " | wp³ata = " + payment + " | odesetki = " + 
            interest + " | procent = " + interestRate + " | lata = " + years);
        }
        print("Mo¿esz przejœæ na emeryturê za " + years + " lat.");

    }
}