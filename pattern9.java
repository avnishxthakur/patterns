class pattern9{
    public void pattern9(int n) {
        int value;
        for(int i = 0 ; i<= n-1 ; i++){
            if( i % 2 == 0){
              value = 1 ;
            }
            else {
                 value = 0;
            }
            for(int j= 0; j<= i; j++){
                System.out.print(value + " ");
                value = 1 - value;
            }

            System.out.println(" ");

        }
           
    }
    public static void main(String[] args) {
        pattern9 sol = new pattern9();
        int n = 6;
        sol.pattern9(6);
    }
}