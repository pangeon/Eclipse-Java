package topic31.coparable;

import java.util.Arrays;

public class NumSorter  {
	private int[] tab = new int[19];
	
	public int[] fill() {
		for (int num = 0; num < tab.length; num++) {
			tab[num] = (int) (Math.random()*10);
		}
		return tab;
	}
	public void setSize(int size) {
		this.tab = new int[size];
	}
	public int getIndex(int i) {
		return tab[i];
	}
	
	public int[] getTab() {
		return tab;
	}
	public void setTab(int[] tab) {
		this.tab = tab;
	}
	public void print() {
		System.out.println(Arrays.toString(tab));
	}
	public static void print(int tab[]) {
		System.out.println(Arrays.toString(tab));
	}
	public static void sort(int tab[]) {
		int temp;
		int zmiana = 1;
		while(zmiana > 0) {
			zmiana = 0;
			for (int i = 0; i < tab.length-1; i++) { // 13, 5, 8
				if(tab[i] > tab[i + 1]) {
					temp = tab[i+1];
					tab[i+1] = tab[i];
					tab[i] = temp;
					zmiana++;
					
				}	
			}
		}
		//for(int i=0; i<tab.length; i++){
		//	System.out.print(tab[i]+" ");
		//}
	}
	
	
}

