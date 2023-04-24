package com.learnning;

public class Book {
    private String name;
    private int number;
    private String kind;
    public Book(String name,int number,String kind) {
        this.name = name;
        this.number=number;
        this.kind=kind;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
     public String getKind(){
        return kind;
     }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
