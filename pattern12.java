class pattern12 {
    
    public void pattern12(int n) {
           
     for ( int i = 0 ; i <= n ; i++){ // outer loop total no of rows 

     for (int j = 0 ;j<= i ;j++){
        System.out.print((char)( 'A'+ j)+ " ");
        
     }
     System.out.println(" ");
     
     }
     }
    

    public static void main(String[] args) {
        pattern12 sol = new pattern12();
        int n = 5;
        sol.pattern12(n);
    } 
}
