/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Left_factoring;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Tazbeea Tazakka
 */
public class GetCommon {
    public void common(String line){
        System.out.println("Input : "+line);
        System.out.println("LEFT FACTORING : ");
        StringTokenizer tokenizer=new StringTokenizer(line,"=|");
        
        
        String first=tokenizer.nextToken();
        String common="";
        
        ArrayList<String> tokens=new ArrayList<String>();
        
        
        tokens.clear();
        while(tokenizer.hasMoreTokens()){
            tokens.add(tokenizer.nextToken());
        }
        int max=0;
        
        for(int i=0;i<tokens.size()-1;i++){
            for(int j=i+1;j<tokens.size();j++){
                
                int max2=LongestCommon(tokens.get(i),tokens.get(j));
                
                if(max2>max){
                 
                    max=max2;
                    common=tokens.get(i).substring(0, max);
                }
                //System.out.println("common ="+common);
            }
        }
        
        LeftFactoring fact=new LeftFactoring();
        fact.factor(first,common, tokens);
        
        
    }
    
    public int LongestCommon(String str1, String str2){
        if (str1==null || str2==null)
		return 0;
        int len=0;
        int loopcount;
        if(str1.length()<str2.length())
            loopcount=str1.length();
        else
            loopcount=str2.length();
        for(int i=0;i<loopcount;i++){
            if(str1.charAt(i)==str2.charAt(i))
                len++;
            else 
                return len;
        }
        
        return len;
    }
    
   
}
