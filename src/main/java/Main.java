import com.simultechnology.ShiftCipher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input plain word");
        String targetWord = scanner.next();
        String encryptedWord = ShiftCipher.encrypt(targetWord);
        System.out.println(encryptedWord);
        System.out.println("please input encrypted word");
        String targetWord2 = scanner.next();
        String decryptedWord = ShiftCipher.decrypt(targetWord2);
        System.out.println(decryptedWord);
    }
}
