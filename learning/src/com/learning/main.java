package com.learning;

import java.awt.print.Book;

public class main {

    public class Book {
        private String name;
        private int number;
        private String kind;

        public Book(String name, int number, String kind) {
            this.name = name;
            this.number = number;
            this.kind = kind;
        }

        public String getName() {
            return name;
        }

        public int getNumber() {
            return number;
        }

        public String getKind() {
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

    public void main(String[] args) {
        Book book1 = new Book("programing", 0001, "first");
        Book book2 = new Book("test", 0002, "second");
        System.out.println(book1.getName());
        System.out.println(book1.getNumber());
        System.out.println(book1.getKind());
    }
}
