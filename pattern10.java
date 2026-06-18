class pattern10 {
    public void pattern10(int n) {
         int spaces = 2*(n-1);
        for (int i = 1 ; i <= n ; i++){ //outer loops 
            for(int j = 1 ; j <= i ; j++ ){// printing no one the left side 
                System.out.print(j);
                 }
               for (int j = 1 ;j <= spaces ;j++)
                { System.out.print (" ");
                 }
                for (int j = i ; j>=1 ; j--){ // right side
                System.out.print(j);
                }
                         System.out.println(" ");
                spaces -= 2;// decrease spaces by 2 after each row 
         }
     }
    

    public static void main(String[] args) {
        pattern10 sol = new pattern10();
        int n = 5;
        sol.pattern10(n);
    } 
}
