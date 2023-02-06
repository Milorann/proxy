package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new ProxyPerson(123, "John");

        person.showPage();

        person.showPage();
    }
}