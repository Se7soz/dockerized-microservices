package com.se7so.dict;

import java.util.ArrayList;
import java.util.List;

public class PasswordTrie {

    List<String> all = new ArrayList<>();

    public void add(String password) {
        all.add(password);
    }

    public int size() {
        return all.size();
    }
}
