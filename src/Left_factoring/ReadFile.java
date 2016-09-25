/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Left_factoring;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Tazbeea Tazakka
 */
public class ReadFile {
    public void read(){
        String line=new String();
        try {
              //  BufferedReader br = new BufferedReader(new FileReader("/home/ratul/NetBeansProjects/WordCountOushneek/src/wordcountoushneek/word.txt"));
                BufferedReader br = new BufferedReader(new FileReader("task4.txt"));

                
                while((line=br.readLine())!=null){
                    GetCommon lines=new GetCommon();
                    lines.common(line);
                }
                
            
            }
        catch(IOException Ex){
            System.out.println("Exception");
        }
    }

}
