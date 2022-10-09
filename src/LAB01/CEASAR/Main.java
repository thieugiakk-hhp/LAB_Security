package LAB01.CEASAR;

public class Main {
    public static void main(String[] args) {
        //replace plain text
        String plainText = "CEASAR PLAIN TEXT";

        System.out.println("Plain Text: " + plainText + "\n");

        for (int key = 1; key <= 26; key++) {
            System.out.print("Key: " + key + "- Cipher Text: " + Encryption.EncryptText(plainText, key) + "\n");
        }

    }
}
