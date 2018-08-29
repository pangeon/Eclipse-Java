import java.util.Date;

public class Printf {

    public static void dData(){
        System.out.println("Obiekt Date: " + new Date());
        System.out.printf("%1$s %2$te %2$tB %2$tY", "Data formatowana: ", new Date());
        System.out.println();
    }
    // u�amka nie przedstawimy w postaci innego systemu dla tych znak�w konwersji
    // dla typu double s� inne
    public static void dKonwerter(int n) {  
        System.out.println("Konwersja liczby systemy: dziesi�tny, �semkowy, szesnastkowy");
        System.out.printf("%1$d %1$o %1$x", n);
        System.out.println();                
    }
    public static void pf(String s, Object o) {
        System.out.print("Funkcja printf: ");
        System.out.printf(s, o);
        System.out.println();
    }
    public static void pf(String s, Object o, Object t) {
        System.out.print("Funkcja printf: ");
        System.out.printf(s, o, t);
        System.out.println();
    }
    public static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        dData();
        double d = 10000.0 / 3.0;
        double r = 45.0d;
        String name = "Kamil";
        int age = 33;
        print(d);
        pf("%8.2f", d);
        pf("Witaj, %s. W przysz�ym roku b�dziesz mie� %d lata.", name, age);
        pf("Aktualna godzina: %tT", new Date()); // do %t dodaje dowolny znak konwersji | tabela 3.7 strona 94
        dKonwerter(560284);

    }
}