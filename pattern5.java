class pattern5 {
    public void pattern5(int n){
        for (int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j<= n-i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
public static void main (String[] args){
    pattern5 sol = new pattern5();
    int n = 9;
    sol.pattern5(n);
        }
    }
