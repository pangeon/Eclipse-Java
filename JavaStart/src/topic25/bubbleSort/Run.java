package topic25.bubbleSort;

import java.util.Arrays;

/*
 * 

Napisz program, którego zadaniem jest posortowanie rosnąco liczb w tablicy za pomocą algorytmu 
sortowania bąbelkowego. Opis jego działania jest przejrzyście wytłumaczony na Wikipedii, 
dlatego nie będziemy duplikować czyjejś pracy 
i zachęcamy do lektury - http://pl.wikipedia.org/wiki/Sortowanie_b%C4%85belkowe

Do posortowania tablicy wykorzystaj klasę anonimową, która będzie implementowała zdefiniowany 
przez Ciebie interfejs Sortable z metodą sort() przyjmującą jako parametr tablicę liczb.

Tablica może być zdefiniowana na sztywno w kodzie programu.

 */

public class Run {
	public static void main(String[] args) {
		Sortable s = new Sortable() {
			
			@Override
			public int[] sort(int[] tab) {	
				int n = 0;
				for (int i = 0; i < tab.length; i++) {
					for (int j = 0; j < tab.length - 1; j++) {
						if(tab[j] > tab[j + 1]) {
							int temp = 0;
							temp = tab[j + 1];
							tab[j + 1] = tab[j];
							tab[j] = temp;	
							n++;
							System.out.println(n + " krok sortowania: " + Arrays.toString(tab));
						}	
					}
				}
				System.out.println("wynik sortowania: " + Arrays.toString(tab));
				return tab;
			}
		};
		s.sort(new int[] {10, 2, 6, 78, 0, 3, -7});
		s.sort(new int[] {});
	}
}
