package com.ij.pa;

import java.util.HashMap;
import java.util.stream.Collector;

/**
 * Created by Ivan on 8/12/2017.
 */
public class TrieNode {
    char c;
    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    boolean isLeaf;

    public TrieNode() {};

    public TrieNode(char c){
        this.c = c;
    }
}
