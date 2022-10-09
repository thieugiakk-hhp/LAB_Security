package LAB01.VIGENERE;

public class Main {
    public static void main(String[] args) {
        //replace plain text
        String plainText = "CEASAR PLAIN TEXT";
        System.out.println("Plain Text: " + plainText + "\n");

        String key = "";
        int count = (int) Math.round(Math.random() * 25 + 1);
        for (int i = 0; i < count; i++) {
            int number = (int) Math.round(Math.random() * 25 + 1) + 65;
            key += (char) number;
        }

        System.out.println("Key: " + key);

        String cipherText = Encryption.EncText(plainText, key);
        System.out.println("Cipher Text: " + cipherText);
    }
}
