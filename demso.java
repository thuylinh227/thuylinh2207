




public class demso {
    public static boolean checkNguyenTo(int n) {
        for(int j = 2; j < n; j++) {
            if(n % j == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int dem = 0;
        for(int i = 1; i < 100; i++) {
            if(checkNguyenTo(i)) {
                System.out.println(i);
                dem++;
            }
        }
        System.out.println(dem);
    
    }
}
