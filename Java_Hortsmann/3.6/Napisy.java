public class Napisy {
    public static void main(String[] args) {
        /* 3.6 */
        System.out.println("Java\u2122"); // kododawnie Windows-1250 nie wy�wietla znak�w Unicode w tym przypadku zamiast "TM" jest "?"

        /* 3.6.1 */
        String robak = "Chrz�szcz";
                    //  012345678
        String fragmentRobaka = robak.substring(3); //z�szcz - wszystkie od 3 znaku z tym znakiem licz�c od zera
        String fragmentRobaka2 = robak.substring(0, 3); // Chr - wszystkie od zerowego do 3 znaku bez tego znaku 

        System.out.println(fragmentRobaka);
        System.out.println(fragmentRobaka2);

        /**
         * String substring(int beginIndex) Returns a string that is a substring of this string.
           String substring(int beginIndex, int endIndex) Returns a string that is a substring of this string.
         */

         /* 3.6.3 */
         System.out.println("3.6.3");
         String innyRobak = robak.substring(0, 3); // Chr
         boolean czyTenSamRobak = (innyRobak == "Chr");
         boolean czyTenNapewnoSamRobak = (innyRobak.equals("Chr"));

         System.out.println("1. Czy te robaki s� r�ne ? " + czyTenSamRobak); // false
         System.out.println("2. Czy te robaki na pewno s� r�ne ? " + czyTenNapewnoSamRobak); // true

        /** 
         * Gdyby maszyna wirtualna zawsze traktowa�a r�wne �a�cuchy jako wsp�dzielone, mo�na by
          by�o je por�wnywa� za pomoc� operatora ==. Wsp�dzielone s� jednak tylko sta�e �a�cuchowe.
          �a�cuchy b�d�ce na przyk�ad wynikiem operacji wykonywanych za pomoc� operatora
          + albo metody substring nie s� wsp�dzielone.
        */

        String naprawdeInnyRobak = "chrz�szcz";

        boolean achTeRobaki = naprawdeInnyRobak.equals(robak);
        System.out.println("3. Czy te robaki s� r�ne(pytam te� o wielko�� liter) ? " + achTeRobaki);
        achTeRobaki = naprawdeInnyRobak.equalsIgnoreCase(robak);
        System.out.println("4. Czy te robaki s� r�ne (nie pytam o wielko�� liter) ? " + achTeRobaki);

        /*3.6.5 */
        System.out.println("3.6.5");
        {
            robak = "";
            boolean czyPusty = robak.length() == 0;
            boolean czyNapewnoPusty = robak.equals("");
            boolean czyNull = (robak == null); // sprawdzenie czy jest null, nie jest, jest pusty
            robak = null;
            boolean czyNapewnoNull = (robak == null);

            try {
                robak.length();
            } catch (NullPointerException e) {
                System.out.println("Nie mo�na wykona� metody na null");
                System.out.println("robak = " + robak);
            }

            System.out.println("5.Czy pusty ? " + czyPusty + " " + czyNapewnoPusty + " null: " + czyNull + " null: " + czyNapewnoNull);

        }
        /*3.6.6 */
        System.out.println("3.6.6");
        robak = "Chrz�szcz";
        System.out.println("robak = " + robak);
        System.out.println("d�ugo�� = " + robak.length());
        System.out.println("Liczba wsp�rz�dnych kodowych znaku:");
        int gruboscRobaka = robak.codePointCount(0, robak.length());
        System.out.println("Grubo�� robaka: " + gruboscRobaka);

        // sprawdzam poszczeg�lne znaki
        char sekcjaRobaka = robak.charAt(0);
        char sekcjaRobaka4 = robak.charAt(4);

        System.out.println(sekcjaRobaka);
        System.out.println(sekcjaRobaka4);

        // sprawdzam wsp�rz�dne kodowe dla znak�w
        int chemiaRobaka = robak.codePointAt(0);
        int chemiaRobaka4 = robak.codePointAt(4);

        System.out.println(chemiaRobaka);
        System.out.println(chemiaRobaka4);

        /**
         * Metod jest du�o s� opisane na stronach 83-84 
        */

        /* 3.6.8 */
        System.out.println("3.6.8");
        System.out.println("robak = " + robak);
        System.out.println("robak2 = " + naprawdeInnyRobak);

        StringBuilder sb = new StringBuilder();
        sb.append("   ");
        sb.append(robak);
        sb.append(naprawdeInnyRobak);

        sb.toString();

        System.out.println(sb);

        System.out.println(sb.toString().trim()); // usuwa bia�e znaki z ko�ca

        System.out.println(sb.toString().trim().toUpperCase());

        /** PIERWSZA DOKUMENTACJA:
         * javadoc -d html Napisy.java
         */
        


    }
}