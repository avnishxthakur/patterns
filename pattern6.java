class pattern6 {
    public void pattern6(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    } 

    public static void main(String[] args) {
        pattern6 sol = new pattern6();
        int n = 5;
        sol.pattern6(n);
    } }