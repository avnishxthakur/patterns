class pattern4 {
    public void pattern4(int n){
        for (int i = 0 ; i <= n ; i++){
            for(int j = 0 ; j<= n-i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main (String[] args){
    pattern4 sol = new pattern4();
    int n = 5 ;
    sol.pattern4(n);
        }
    }
