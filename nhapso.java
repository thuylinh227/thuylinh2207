import java.util.Scanner;

public class nhapso {
    void nhap(){
        Scanner sc =new Scanner(System.in);
         System.out.println("nhap vao so tu 1 den 10: ");
         int i=1;
         int n=1;
        do{         
            i =sc.nextInt();
            i++;
            n++;
            if(i!=n){
                System.out.println("Nhap sai!");
                nhap();
            }
        }
        while(i <= 10 && i==n && n<=10);
    } 
    public static void main(String[] args){
        nhapso so = new nhapso();
        so.nhap();
    }
}
