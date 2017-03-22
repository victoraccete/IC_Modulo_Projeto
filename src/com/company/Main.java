package com.company;

public class Main {

    public static void main(String[] args) {
        Project proj = new Project();
        Project temp = proj.criarNova();
        if(temp == null) System.out.println("PASSOU!");
    }
}
