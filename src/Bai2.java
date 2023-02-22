import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.print("Gia tri VND: " + quydoi);
    }
}
