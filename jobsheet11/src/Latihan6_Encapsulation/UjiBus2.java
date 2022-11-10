/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
package Latihan6_Encapsulation;

public class UjiBus2 {
    public static void main(String[] args) {
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();
        busBesar.addPenumpang(15);
        busBesar.cetak();
        busBesar.addPenumpang(5);
        busBesar.cetak();
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
}
