/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB01.RAILFENCE;

/**
 *
 * @author Administrator
 */
public class Encryption {
    public static String Encrypt(String text, int key) {
        String res = "";
        int charInRow = text.length() / key;
        int row = 0;
        while (row < key) {
            System.out.println(row);
            int i = row;
            while (i <= charInRow * (row + 1)) {
                res += text.charAt(i);
                System.out.println(res);
                i += key;
            }
            row++;
        }
        return res;
    }
}
