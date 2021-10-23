import com.simultechnology.ShiftCipher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input");
        String targetWord = scanner.next();
        String encryptedWord = ShiftCipher.encrypt(targetWord);
        System.out.println(encryptedWord);
    }
}
