/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
package Latihan4_Inheritance;

public class B extends A {
    private int b;

    public void setB(int nilai) {
        b = nilai;
    }

    public int getB() {
        return b;
    }

    // melakukan override terhadap method tampilkanNilai()
    // yang terhadap pada kelas A
    public void tampilkanNilai() {
        super.tampilkanNilai();// memanggil method dalam kelas A
        System.out.println("Nilai b = " + getB());
    }
}
