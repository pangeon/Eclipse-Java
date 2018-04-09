class If {
    public static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        /* 3.8.1 */
        print("3.8.1");
        int n = 0;
        int z;
        // zmienna k zdefiniowana na zewn¹trz nie mo¿e wyst¹piæ przed blokiem wewnêtrznym
        {
            int k = 1;
            n = 3; // instrukcja w bloku zewnêtrznym przes³ania instrukcjê w bolku zewnêtrznym
            z = 5;
            print(k); // 1
            print(n); // 3
            
        }
        int k = 2; // instrukcja przes³ania instrukcje wewnêtrzn¹
        print(k); // 2
        print(n); // 3
        print(z); // 5

        /* 3.8.2 */
        print("3.8.2");
        float yourSales = 2450.20f;
        int target = 3000;
        
        String performance;
        int bonus;

        /* przypisanie wartoœci do performance i bonus zale¿y od warunku w ka¿dym przypadku nale¿y przypisaæ im wartoœci 
        jeœli nie chcemy ustalaæ ich domyœlnie */
        if (yourSales >= 2 * target) {
            performance = "Znakomicie";
            bonus = 1000;
        } else if (yourSales >= 1.5 * target) {
            performance = "NieŸle";
            bonus = 500;
        } else if (yourSales >= target) {
            performance = "Œrednio";
            bonus = 100;
        } else {
            performance = "Do dupy";
            bonus = 0;
            print("Jesteœ zwolniony");
        }
        /* komputer nie wie czy warunek jest spe³niony nawet jeœli widaæ to na oko, a tym samym nie mo¿e pope³niæ b³êdu w razie wyst¹pienia else 
        co skutkowa³o by niemo¿noœci¹ wykonania instrukcji print dla performance i bonus */
        print("yourSales = " + yourSales);
        print("target = " + target);
        print("performance = " + performance);
        print("bonus = " + bonus);
        /* 3.8.3 */
        print("3.8.3");
        

    }
}