package object;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class_1 {

    public String nama;
    public String npm;
    public String kelas;
    public String namamakanan;
    public String mk1, mk2, mk3, mk4;
    public String mn1, mn2, mn3, mn4;
    public String namaminuman;
    public String jumlahmakanan;
    public String jumlahminuman;
    public String jenismakanan;
    public String jenisminuman;
    public String hm1, hm2, hm3, hm4;
    public String hmnm1, hmnm2, hmnm3, hmnm4;


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNamamakanan() {
        return namamakanan;
    }

    public void setNamamakanan(String namamakanan) {
        this.namamakanan = namamakanan;
    }

    public String getMk1() {
        return mk1;
    }

    public void setMk1(String mk1) {
        this.mk1 = mk1;
    }

    public String getMk2() {
        return mk2;
    }

    public void setMk2(String mk2) {
        this.mk2 = mk2;
    }

    public String getMk3() {
        return mk3;
    }

    public void setMk3(String mk3) {
        this.mk3 = mk3;
    }

    public String getMk4() {
        return mk4;
    }

    public void setMk4(String mk4) {
        this.mk4 = mk4;
    }

    public String getMn1() {
        return mn1;
    }

    public void setMn1(String mn1) {
        this.mn1 = mn1;
    }

    public String getMn2() {
        return mn2;
    }

    public void setMn2(String mn2) {
        this.mn2 = mn2;
    }

    public String getMn3() {
        return mn3;
    }

    public void setMn3(String mn3) {
        this.mn3 = mn3;
    }

    public String getMn4() {
        return mn4;
    }

    public void setMn4(String mn4) {
        this.mn4 = mn4;
    }

    public String getNamaminuman() {
        return namaminuman;
    }

    public void setNamaminuman(String namaminuman) {
        this.namaminuman = namaminuman;
    }

    public String getJumlahmakanan() {
        return jumlahmakanan;
    }

    public void setJumlahmakanan(String jumlahmakanan) {
        this.jumlahmakanan = jumlahmakanan;
    }

    public String getJumlahminuman() {
        return jumlahminuman;
    }

    public void setJumlahminuman(String jumlahminuman) {
        this.jumlahminuman = jumlahminuman;
    }

    public String getJenismakanan() {
        return jenismakanan;
    }

    public void setJenismakanan(String jenismakanan) {
        this.jenismakanan = jenismakanan;
    }

    public String getJenisminuman() {
        return jenisminuman;
    }

    public void setJenisminuman(String jenisminuman) {
        this.jenisminuman = jenisminuman;
    }

    public String getHm1() {
        return hm1;
    }

    public void setHm1(String hm1) {
        this.hm1 = hm1;
    }

    public String getHm2() {
        return hm2;
    }

    public void setHm2(String hm2) {
        this.hm2 = hm2;
    }

    public String getHm3() {
        return hm3;
    }

    public void setHm3(String hm3) {
        this.hm3 = hm3;
    }

    public String getHm4() {
        return hm4;
    }

    public void setHm4(String hm4) {
        this.hm4 = hm4;
    }

    public String getHmnm1() {
        return hmnm1;
    }

    public void setHmnm1(String hmnm1) {
        this.hmnm1 = hmnm1;
    }

    public String getHmnm2() {
        return hmnm2;
    }

    public void setHmnm2(String hmnm2) {
        this.hmnm2 = hmnm2;
    }

    public String getHmnm3() {
        return hmnm3;
    }

    public void setHmnm3(String hmnm3) {
        this.hmnm3 = hmnm3;
    }

    public String getHmnm4() {
        return hmnm4;
    }

    public void setHmnm4(String hmnm4) {
        this.hmnm4 = hmnm4;
    }


    public void menuFood() {
        System.out.println("================================");
        System.out.println(" Food ");
        System.out.println("================================");
        System.out.println("1." + mk1);
        System.out.println("2." + mk2);
        System.out.println("3." + mk3);
        System.out.println("4." + mk4);


    }

    public void menuDrink() {
        System.out.println("================================");
        System.out.println(" Drink ");
        System.out.println("================================");
        System.out.println("1:" + mn1);
        System.out.println("2." + mn2);
        System.out.println("3." + mn3);
        System.out.println("4." + mn4);

    }

    public void hrgFood() {
        System.out.println("================================");
        System.out.println(" Harga Food ");
        System.out.println("================================");
        System.out.println("1. " + hm1);
        System.out.println("2." + hm2);
        System.out.println("3. " + hm3);
        System.out.println("4. " + hm4);
    }

    public void hrgDrink() {
        System.out.println("================================");
        System.out.println(" Harga Drink  ");
        System.out.println("================================");
        System.out.println("1." + hmnm1);
        System.out.println("2. " + hmnm2);
        System.out.println("3. " + hmnm3);
        System.out.println("4. " + hmnm4);
    }

    public void tampilkanMenu() {
        System.out.println("================================");
        System.out.println(" Pesanan Anda ");
        System.out.println("================================");
        System.out.println("Nama Makanan : " + namamakanan);
        System.out.println("Nama Minuman : " + namaminuman);
        System.out.println("Jumlah Makanan : " + jumlahmakanan);
        System.out.println("Jenis Minuman  : " + jenisminuman);
        System.out.println("Harga Makanan  : " + hm1);
        System.out.println("Harga Minuman  : " + hmnm1);
    }


}

