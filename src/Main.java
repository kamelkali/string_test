import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy ciag znakow");
        String str = scanner.nextLine();


        int strSrodek = str.length() / 2;

        if(str.length() <= 2) {
            System.out.println("Podany ciag znakow jest za krotki");

        }

        else {

            String wynik = str.substring(strSrodek,strSrodek + 2);
            System.out.println("Twoj wynik to: ");
            System.out.println(wynik.concat(str));

        }
    }
}