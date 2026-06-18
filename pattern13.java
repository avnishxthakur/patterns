class pattern13 {
    
    public void pattern13(int n) {
        int reduction =  n - 1 ;
           for(int i = 0; i<=n ;i++){
            for(int j = 0 ; j<= reduction  ; j++){
                System.out.print((char)('A' + j)+ " ");
            }
            System.out.println(" ");
            reduction -= 1;
           }
     
     }
    

    public static void main(String[] args) {
        pattern13 sol = new pattern13();
        int n = 5;
        sol.pattern13(n);
    } 
}
//avi