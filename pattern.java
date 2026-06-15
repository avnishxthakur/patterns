class pattern {
    public void pattern1(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0 ; j<= n ;j++){
            System.out.print('*');
        }
        System.out.println();

    }
}
public static void main (String[] args){
    pattern sol = new pattern();
    int n = 2 ;
    sol.pattern1(n);
        }
    }