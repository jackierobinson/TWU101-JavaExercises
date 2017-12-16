package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if(name.compareTo(nameOfNewNode) <= 0 ){
            if(right == null)
                right = new Node(nameOfNewNode);
            else
                right.add(nameOfNewNode);
        }else if (name.compareTo(nameOfNewNode) > 0){
            if(left == null)
                left = new Node(nameOfNewNode);
            else
                left.add(nameOfNewNode);
        }
    }

    private void populateNames(List<String> names){
       if(left != null){
           left.populateNames(names);
       }
       names.add(name);
       if (right != null){
           right.populateNames(names);
       }
    }

    public List<String> names() {
        List<String> names = new ArrayList<>();
        populateNames(names);
        return names;
    }
}
