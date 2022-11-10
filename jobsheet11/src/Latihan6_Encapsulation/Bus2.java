/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
package Latihan6_Encapsulation;

public class Bus2 {
    private int penummpang;
    private int maxPenumpang;

    // konstruktor
    public Bus2(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penummpang = 0;
    }

    public void addPenumpang(int penummpang) {
        int temp;
        temp = this.penummpang + penummpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penummpang = temp;
        }
    }

    public void cetak() {
        System.out.println("Penumpang bus sekarang : " + penummpang);
        System.out.println("Penumpang maks seharusnya : " + maxPenumpang);
    }
}
