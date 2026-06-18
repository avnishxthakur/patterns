class pattern7 {
    public void pattern7(int n) {
        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - (2 *i + 1 ); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    } 

    public static void main(String[] args) {
        pattern7 sol = new pattern7();
        int n = 5;
        sol.pattern7(n);
    } }
