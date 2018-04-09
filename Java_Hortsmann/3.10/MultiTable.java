class MultiTable {
    public static void main(String[] args) {
        int[][] tab2 = new int[10][10];

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                 tab2[i][j] = (i+1)*(j+1);   
                 System.out.print(" " + tab2[i][j]);
                 if (j % 9 == 0 && j != 0) {
                     System.out.println();
                 }
                 if(tab2[i][j] < 10) {
                     System.out.print(" ");
                 }                  
             }
         }   
    }
}
