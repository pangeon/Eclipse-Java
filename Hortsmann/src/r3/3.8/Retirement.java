import java.util.Scanner;

class Retirement {
    public static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        // Wczytanie danych
        Scanner in = new Scanner(System.in);

        print("Ile pieni�dzy potrzebujesz, aby przej�� na emerytur�? ");
        double goal = in.nextDouble();

        print("Ile pieni�dzy rocznie b�dziesz wp�aca�? ");
        double payment = in.nextDouble();

        print("Stopa procentowa w %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        // Aktualizacja salda konta (balance) je�li cel (goal) nie zosta� osi�gni�ty
        while (balance < goal) { // kiedy saldo osi�gnie cel koniec p�tli 
            // Dodanie tegorocznych p�atno�ci (payment) i odsetek (intereset), rate - znaczy stopa
            balance += payment; // saldo = saldo + wp�ata
            double interest = balance * interestRate / 100; // odsetki = saldo * procent / 100
            balance += interest; // saldo = saldo + odsetki 
            years++; // lata rosn� p�ki cel nie zostanie osi�gni�ty
            print("Obliczenia p�tli: saldo = " + balance + " | wp�ata = " + payment + " | odesetki = " + 
            interest + " | procent = " + interestRate + " | lata = " + years);
        }
        print("Mo�esz przej�� na emerytur� za " + years + " lat.");

    }
}