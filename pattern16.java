class pattern16 {
    public void pattern16(int n) {
        for (int i = 0 ; i<n ;i++){
            for(char ch = (char)('E' - i); ch <='E'; ch++){
                System.out.print(ch);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern16 sol = new pattern16();
        int n = 5;
        sol.pattern16(n);
    } 
}
