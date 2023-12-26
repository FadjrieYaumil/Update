import java.util.Random;
import java.util.Scanner;

public class CaptchaManager {
    private Scanner scanner;

    public CaptchaManager() {
        this.scanner = new Scanner(System.in);
    }

    public boolean verifyCaptcha() {
        int attempts = 5;

        do {
            int captchaCode = generateCaptcha();
            System.out.println("Kode Captcha : " + captchaCode);
            System.out.print("Entry Captcha : ");
            int userCaptcha = scanner.nextInt();

            if (userCaptcha == captchaCode) {
                return true;
            } else {
                attempts--;
                System.out.println("Captcha salah. Sisa percobaan: " + attempts);
            }
        } while (attempts > 0);

        System.out.println("Maaf percobaan captcha habis. Silakan coba lagi nanti.");
        return false;
    }

    private int generateCaptcha() {
        Random random = new Random();
        return random.nextInt(9000) + 1000; 
    }
}
