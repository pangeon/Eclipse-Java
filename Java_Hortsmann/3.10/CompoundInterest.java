class CompoundInterest {
    public static void main(String[] args) {
        /**
         * Przy wywo³aniu programu podaje trzy parametry
         * steruje metod¹ main()
         */
        final double START_RATE = Double.parseDouble(args[0]); // startowy procent
        final int NUM_RATES = Integer.parseInt(args[1]); // iloœæ przedzia³ów procentowych
        final int NUM_YEARS = Integer.parseInt(args[2]); // iloœæ wierszy ze wzrostem salda
        
        
        // Ustawienie stóp oprocentowania na wartoœci w przedziale 10-15%
        double[] interestRate = new double[NUM_RATES]; // 6
        for (int j = 0; j < interestRate.length; j++) { // j < 6
            interestRate[j] = (START_RATE + j) / 100.0; // 0,1,2,3,4,5 = 10+0/100 | 0.1, 10+1/100 | 0.11 , 10+2/100 | 0.12... 0.13, 0.14, 0.15 
        }
        // Stworzenie "miejsca" na tabelkê s.125
        double[][] balances = new double[NUM_YEARS][NUM_RATES]; // [10][6]
        
        // Ustawienie sald pocz¹tkowych
        // 10 tablic po 6 elementów
        for (int j = 0; j < balances[0].length; j++) { // j < 6
            balances[0][j] = 10000; // pierwszy wiersz tabeli 10000, 10000, 10000... 
        }
        // Odliczanie odsetek dla przysz³ych lat
        for (int i = 1; i < balances.length; i++) { // 1 < i < 10
            for(int j = 0; j < balances[i].length; j++) { // j < 6
                // Pobranie sald z minionej miesi¹ca
                double oldBalance = balances[i - 1][j]; // [0][0], [0][1], [0][2], [0][3], [0][4], [0][5]
                // pierwszy wiersz tabeli 10000, 10000, 10000...
                
                // Obliczanie odsetek
                double interest = oldBalance * interestRate[j];
                // 10000*0.10, 10000*0.11, 10000*0.12, 10000*0.13, 10000*0.14, 10000*0.15,

                // Obliczenie tegorocznego salda
                balances[i][j] = oldBalance + interest; // [1][0] = 10000+1000 = 11000
            }
        }
        // Wydruk wiersza stóp oprocentowania
        for(int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }
        System.out.println();
        // Wydruk tabeli sald
        for (double row[] : balances) {
            // Wydruk wiersza tabeli
            for (double b: row) {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        } 
    }
}