/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
package Latihan1_Inheritance;

public class Pertama {
    private int a = 10;

    protected void terprotek() {
        System.out.println("Method ini hanya untuk anaknya");
    }

    public void info() {
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada = " + this.getClass().getName());
    }
}
