/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB01.VIGENERE;

/**
 *
 * @author Administrator
 */
public class Encryption {
    public static int[] Keys(String key) {
        int[] arr = new int[key.length()];
        for (int i = 0; i < key.length(); i++) {
            arr[i] = Character.toUpperCase(key.charAt(i)) - 'A';
            System.out.println((char) arr[i]);
        }
        return arr;
    }
    
    public static String EncText(String text, String key) {
        String res = "";
        int[] textArr = Keys(text);
        int[] keyArr = Keys(key);
        for (int i = 0; i < textArr.length; i++) {
            int j = i;
            if (i >= keyArr.length) {
                j = i % keyArr.length;
            }
            res += (char) ((textArr[i] + keyArr[j]) % 26 + 'A');
        }
        return res;
    }
}
