package object;

import object.Class_1;
import object.Class_2;

public class Class_3 {
    public static void main(String[] args) {
        //objek menu Cafe



        Class_1 foodCafe = new Class_1();
        foodCafe.mk1 =" Kentang Goreng ";
        foodCafe.mk2 =" Chicken Katsu ";
        foodCafe.mk3 =" Chicken Teriyaki ";
        foodCafe.mk4 =" Ramen Ichiraku ";
        foodCafe.menuFood();

        Class_1 drinkCafe= new Class_1();
        drinkCafe.mn1 = " Black Coffe ";
        drinkCafe.mn2 = " Red Velvet Ice ";
        drinkCafe.mn3 = " Arabica Capucino ";
        drinkCafe.mn4 = " Gayo Coffe ";
        drinkCafe.menuDrink();

        Class_1 hrgmkn = new Class_1();
        hrgmkn.hm1 = " Rp.15.000";
        hrgmkn.hm2 = " Rp.25.000";
        hrgmkn.hm3 = " Rp.20.000";
        hrgmkn.hm4 = " Rp.35.000";
        hrgmkn.hrgFood();

        Class_1 hrgmnm = new Class_1();
        hrgmnm.hmnm1 = "Rp.10.000";
        hrgmnm.hmnm2 = "Rp.15.000";
        hrgmnm.hmnm3 = "Rp.30.000";
        hrgmnm.hmnm4 = "Rp.25.000";
        hrgmnm.hrgDrink();

        Class_1 pesan = new Class_1();
        pesan.namamakanan = "Ramen Ichiraku";
        pesan.namaminuman = " Red Velvet Ice ";
        pesan.jumlahmakanan = " 1";
        pesan.jumlahminuman = " 1 ";
        pesan.hm1 = " Rp.35.000";
        pesan.hmnm1 = " Rp.15.000";
        pesan.tampilkanMenu();



        Class_2 info = new Class_2();
        info.namapelanggan = " Muhammad Nafis";
        info.totalharga = "50.000";
        info.strukpembayaran();
        info.Pembayaran();


    }

}

