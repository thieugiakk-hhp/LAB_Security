/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB01.CEASAR;

/**
 *
 * @author Administrator
 */
public class Encryption {
    private static char EncryptChar(char c, int key) {
        if (!Character.isLetter(c))
            return c;
        return (char) (((Character.toUpperCase(c) - 'A') + key) % 26 + 'A');
    }
    
    public static String EncryptText(String text, int key) {
        String res = "";
        for (int i = 0; i < text.length(); i++) {
            res += EncryptChar(text.charAt(i), key);
        }
        return res;
    }
}
