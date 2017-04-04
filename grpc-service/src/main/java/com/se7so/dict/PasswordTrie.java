package com.se7so.dict;

import com.google.common.base.Strings;
import sun.text.normalizer.Trie;

import java.util.*;

public class PasswordTrie {

    private TrieNode root;
    private int numOfPasswords = 0;

    public PasswordTrie() {
        root = new TrieNode();
    }

    public void insert(String password) {
        numOfPasswords++;

        HashMap<Character, TrieNode> children = root.children;

        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            TrieNode t;

            if(children.containsKey(c)) {
                t = children.get(c);
            }
            else {
                t = new TrieNode(c);
                children.put(c, t);
            }

            children = t.children;

            if(i == password.length()-1) {
                t.isLeaf = true;
            }
        }
    }

    public List<String> findPrefixes(String prefix) {
        if(root == null || Strings.isNullOrEmpty(prefix)) {
            return Collections.emptyList();
        }

        Map<Character, TrieNode> children = root.children;

        TrieNode t = null;
        for(int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);

            if(children.containsKey(c)) {
                t = children.get(c);
                children = t.children;
            } else{
                return Collections.emptyList();
            }
        }

        List<String> matches = getAllMatches(prefix, t);

        return matches;
    }

    private List<String> getAllMatches(String prefix, TrieNode t) {
        Stack<TrieNode> st = new Stack<>();
        Stack<String> str = new Stack<>();
        st.add(t);
        str.add(prefix);

        List<String> res = new ArrayList<>();

        while(!st.empty()) {
            TrieNode curNode = st.pop();
            String curStr = str.pop();

            if(curNode.isLeaf) {
                res.add(curStr+curNode.c);
            }

            curNode.children.values().forEach(c -> {
                st.push(c);
                str.push(curStr+curNode.c);
            });
        }

        return res;
    }

    public int size() {
        return numOfPasswords;
    }
}
