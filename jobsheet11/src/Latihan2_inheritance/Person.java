/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
package Latihan2_inheritance;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // metode
    public void info() {
        System.out.println("Nama : " + this.name);
        System.out.println("Usia : " + this.age);
    }
}
