/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author XiaoxuShen
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     * Implement a method to perform basic string compression using the counts of repeated character. 
     * If the "compressed" string would not become smaller than the original string, your method should return the original string.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //solution: when you get compressed string, compared the length of original string, 
        //if original string's length is smaller, return original string.
        System.out.println(compress("abbbbbbb"));
    }
    public static String compress(String compress){
        char[] compressed = new char[compress.length()];
        int count = 1;
        int index = 0;
        int indexcompressedArray = 0;
        String compressedstring = "";
        
        for(int ii = 0; ii < compress.length(); ii++){
            if(index + 1 >= compress.length()){
                return compress;
            }
            compressed[index] = compress.charAt(ii);
            
            while(ii + 1 < compress.length() && compress.charAt(ii + 1) == compress.charAt(ii)){
                count++;
                ii++;
            }
            compressed[index + 1] = (char)(count + 48);
            index += 2;
        }
        
        while(compressed[indexcompressedArray] != '\u0000'){
            compressedstring += compressed[indexcompressedArray];
            indexcompressedArray++;
        }        
        return compressedstring;
    }
}
