/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;

/**
 *
 * @author 24DD018LA
 */
public class Captcha {
    public static String createCaptchavalue(){
    Random rand = new Random();
    int lenght = 7 +(Math.abs(rand.nextInt()) % 3);
    StringBuilder strBuff = new StringBuilder(); 
    
    for(int i=0; i<lenght; i++){
    int baseCharNum = Math.abs(rand.nextInt()) % 62;
    int charNum = 0;
    
    if(baseCharNum<26)
        charNum = 65 + baseCharNum;
    else if(baseCharNum < 52)
        charNum = 97 + baseCharNum - 26;
    else
        charNum = 48 + baseCharNum - 52;
                
        strBuff.append((char)charNum);
    }
    return strBuff.toString();
    }
}
