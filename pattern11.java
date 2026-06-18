class pattern11 {
    
    public void pattern11(int n) {
            int num = 1 ;
     for ( int i = 1 ; i <= n ; i++){ // outer loop total no of rows 

     for (int j = 1 ;j<= i ;j++){
        System.out.print(num + " ");
        num = num + 1;
     }
     System.out.println(" ");
     
     }
     }
    

    public static void main(String[] args) {
        pattern11 sol = new pattern11();
        int n = 5;
        sol.pattern11(n);
    } 
}
