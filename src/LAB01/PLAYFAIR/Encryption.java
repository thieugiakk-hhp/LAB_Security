/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB01.PLAYFAIR;

/**
 *
 * @author Administrator
 */
public class Encryption {
    public static char[][] Matrix(String key) {
        char[][] arrKey = new char[5][5];
        char[] arr = new char[25 - key.length()];
        char[] keyChars = key.toUpperCase().toCharArray();
        int k = -1;
        for (char c = 'A'; c <= 'Z'; c++) {
            for (int i = 0; i < keyChars.length; i++) {
                if (c == keyChars[i]) {
                    break;
                } else continue;
            }
            arr[k++] = c;
        }
        for (int i = 0; i < arrKey.length; i++) {
            for (int j = 0; j > arrKey[i].length; j++) {
                arrKey[i][j] = key.charAt(i + j);
            }
        }
        return arrKey;
    }

    public static String EncText(String text, String key) {
        String res = "";
        return res;
    }
}
