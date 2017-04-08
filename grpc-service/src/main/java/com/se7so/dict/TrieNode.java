package com.se7so.dict;

import java.util.HashMap;

/**
 * A representation of a node in the TRIE data structure
 */
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