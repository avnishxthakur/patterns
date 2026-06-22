class pattern15 {
    
    public void pattern15(int n) {

        for(int i= 0 ; i < n ; i++){

            for (int j = 0 ; j< n - i -1; j++){ //left side space
                 System.out.print(" ");
            }

            //print char
                char ch = 'A';
                int breakpoint = (2 *i + 1) /2 ;

            for (int j = 0 ; j< 2*i + 1; j++) {
                 System.out.print(ch);

                if(j<= breakpoint){
                   ch++;
                }
                else{
                    ch--;
                }
            }
            //print space
            for(int j = 0 ; j < n-i-1; j++){  // right side space
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern15 sol = new pattern15();
        int n = 5;
        sol.pattern15(n);
    } 
}
