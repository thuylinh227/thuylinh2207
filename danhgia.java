import java.util.Scanner;

public class danhgia {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("nhap vao trai nghiem cua ban (1-5):");
        int sao = sc.nextInt();
        switch(sao){
            case 1:
            System.out.println("Te");
            break;
            case 2:
            System.out.println("Rat khong hai long");
            break;
            case 3:
            System.out.println("khong hai long");
            break;
            case 4:
            System.out.println("Hai long");
            break;
            case 5:
            System.out.println("Rat hai long");
            break;
        }
    }
}
