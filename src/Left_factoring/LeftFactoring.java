/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Left_factoring;

import java.util.ArrayList;

/**
 *
 * @author Tazbeea Tazakka
 */
public class LeftFactoring {
    public void factor(String first,String common,ArrayList<String> tokens){
        // Left Factring
        String next=new String();
        ArrayList<String> suffix=new ArrayList<String>();
        ArrayList<String> prefix=new ArrayList<String>();
        
        int tokensize;
        for(tokensize=0;tokensize<tokens.size();tokensize++){
            next=tokens.get(tokensize);
            if(next.equals(common)){
                suffix.add("ε");
                prefix.add(common);

            }
            
            else if(next.startsWith(common)){
                prefix.add(common);
                char[] charArray = next.toCharArray();
                String x = new String(charArray,common.length(),next.length()-common.length());
                suffix.add(x);

            }
            else{
                prefix.add(next);

            }
        }
        
//        for(int i=0;i<prefix.size();i++)
//            System.out.println("prefix= "+prefix.get(i));
//        
        int i;
        String firstoutput=first+"="+common+first+"`|";
        for(i=0;i<prefix.size();i++){
            if(i==prefix.size()-1)
                break;
            if(prefix.get(i)!=common){
                firstoutput+=prefix.get(i);
                firstoutput+="|";
            }
        }
        firstoutput+=prefix.get(i);
        System.out.println(firstoutput);
        
        String secondoutput=first+"`=";
        i=0;
        for(i=0;i<suffix.size()-1;i++){
            secondoutput+=suffix.get(i);
            secondoutput+="|";
        }
        secondoutput+=suffix.get(i);
        System.out.println(secondoutput);
        System.out.println("\n");
        
    }
}
