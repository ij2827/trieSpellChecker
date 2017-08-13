package com.ij.pa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;


/**
 * Created by Ivan on 8/12/2017.
 */
public class DictLookup {
    private Trie trieDict = new Trie();

    // Formats string
    private static String wordFormat(String word){
        if(word.contains("/")){
            return word.substring(0, word.indexOf("/"));
        }
        return word;
    }

    // Returns wether or not string is in dict
    public boolean isWord(String s){
        return trieDict.search(s);
    }

    public DictLookup(){

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ivan\\IdeaProjects\\javaObjects\\src\\com\\ij\\pa\\dict.dic"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while(line != null){
                trieDict.insert(wordFormat(line));
//                sb.append(wordFormat(line));
//                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {

    }
}
