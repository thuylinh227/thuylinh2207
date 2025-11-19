import java.util.Scanner;

public class Tinhtiendien {
    public static void main(String[] args) {
             System.out.println("nhap vao so dien(kwh): ");
        Scanner sc = new Scanner(System.in);
        int sodien = sc.nextInt();
        if (sodien>0 && sodien <= 50){
            System.out.println("tien dien la 1.900d mot so dien");
        }
        else if(sodien>51 && sodien <100){
            System.out.println("tien dien la 2.100d mot so dien");
        }
        else{
            System.out.println("tien dien la 2.500d mot so dien");
        }
    }
}
