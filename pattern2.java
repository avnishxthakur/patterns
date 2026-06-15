class pattern2 {
    public void pattern2(int n){
        for (int i = 0; i < n ; i++){
            for(int j = 1; j<= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }  
public static void main (String[] args){
    pattern2 sol = new pattern2();
    int n = 5 ;
    sol.pattern2(n);
        }
    }
