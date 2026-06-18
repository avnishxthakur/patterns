class pattern3 {
    public void pattern3(int n){
        for (int i = 0; i < n ; i++){
            for(int j = 1; j<= i ; j++){
                System.out.print(i + " ");//printing the row number 
            }
            System.out.println();
        }
    }  
public static void main (String[] args){
    pattern3 sol = new pattern3();
    int n = 5 ;
    sol.pattern3(n);
        }
    }
