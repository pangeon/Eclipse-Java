public class Welcome {
    public static void main(String[] args) {
        String[] greetings = new String[3];
        greetings[0] = "Witaj Kamil";
        greetings[1] = "Zaczynasz właśnie od nowa";
        greetings[2] = "kurs Javy";

        for (String g : greetings) {
            System.out.println(g);
        }
    }
}