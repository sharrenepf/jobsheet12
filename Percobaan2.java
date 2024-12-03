import java.util.Scanner;

public class Percobaan2 {
    
    static Scanner sc = new Scanner(System.in);

    static String deret = " ";

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            deret += "1"; 
            return (1);
        } else {
            deret += x + "x"; 
            return (x * hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung : ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        pangkat = sc.nextInt();

        deret = ""; 
        int hasil = hitungPangkat(bilangan, pangkat);

        if (deret.endsWith("x")) {
            deret = deret.substring(0, deret.length() - 1);
        }

        System.out.println(deret + " = " + hasil);
    }

}