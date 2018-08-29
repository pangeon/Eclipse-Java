class If {
    public static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        /* 3.8.1 */
        print("3.8.1");
        int n = 0;
        int z;
        // zmienna k zdefiniowana na zewn�trz nie mo�e wyst�pi� przed blokiem wewn�trznym
        {
            int k = 1;
            n = 3; // instrukcja w bloku zewn�trznym przes�ania instrukcj� w bolku zewn�trznym
            z = 5;
            print(k); // 1
            print(n); // 3
            
        }
        int k = 2; // instrukcja przes�ania instrukcje wewn�trzn�
        print(k); // 2
        print(n); // 3
        print(z); // 5

        /* 3.8.2 */
        print("3.8.2");
        float yourSales = 2450.20f;
        int target = 3000;
        
        String performance;
        int bonus;

        /* przypisanie warto�ci do performance i bonus zale�y od warunku w ka�dym przypadku nale�y przypisa� im warto�ci 
        je�li nie chcemy ustala� ich domy�lnie */
        if (yourSales >= 2 * target) {
            performance = "Znakomicie";
            bonus = 1000;
        } else if (yourSales >= 1.5 * target) {
            performance = "Nie�le";
            bonus = 500;
        } else if (yourSales >= target) {
            performance = "�rednio";
            bonus = 100;
        } else {
            performance = "Do dupy";
            bonus = 0;
            print("Jeste� zwolniony");
        }
        /* komputer nie wie czy warunek jest spe�niony nawet je�li wida� to na oko, a tym samym nie mo�e pope�ni� b��du w razie wyst�pienia else 
        co skutkowa�o by niemo�no�ci� wykonania instrukcji print dla performance i bonus */
        print("yourSales = " + yourSales);
        print("target = " + target);
        print("performance = " + performance);
        print("bonus = " + bonus);
        /* 3.8.3 */
        print("3.8.3");
        

    }
}