class Message {
    public static void main(String[] args) {
        if (args[0].equals("-h")) {
            System.out.print("Zajebiœcie ziomek,");
        } else if (args[0].equals("-g")) {
            System.out.print("Uczysz siê Javy,");
        } else {
            System.out.print("To dobry jêzyk.");
        }
        // Wydruk pozosta³ych argumentów z wiersza poleceñ
        for(int i = 1; i < args.length; i++) {
            System.out.print(" " + args[i]);
        }
        System.out.print("!");
    }
}