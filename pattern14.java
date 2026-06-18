class pattern14 {
    
    public void pattern14(int n) {
        for (int i = 0 ; i<n ; i++){
            char ch = (char) ('A'+ i);
            for(int j = 0 ; j<= i ; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        pattern14 sol = new pattern14();
        int n = 5;
        sol.pattern14(n);
    } 
}
//avi