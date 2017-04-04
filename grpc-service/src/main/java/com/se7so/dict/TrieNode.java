package com.se7so.dict;

import java.util.HashMap;

class TrieNode {
    char c;
    HashMap<Character, TrieNode> children = new HashMap<>();
    boolean isLeaf;
 
    public TrieNode() {
    }
 
    public TrieNode(char c){
        this.c = c;
    }
}