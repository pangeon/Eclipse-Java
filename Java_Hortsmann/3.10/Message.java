class Message {
    public static void main(String[] args) {
        if (args[0].equals("-h")) {
            System.out.print("Zajebi�cie ziomek,");
        } else if (args[0].equals("-g")) {
            System.out.print("Uczysz si� Javy,");
        } else {
            System.out.print("To dobry j�zyk.");
        }
        // Wydruk pozosta�ych argument�w z wiersza polece�
        for(int i = 1; i < args.length; i++) {
            System.out.print(" " + args[i]);
        }
        System.out.print("!");
    }
}