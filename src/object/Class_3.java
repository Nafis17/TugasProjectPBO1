package object;

public class Class_3 {
    public static void main(String[] args) {

        Class_1 foodCafe = new Class_1();
        foodCafe.menu1 =" Kentang Goreng ";
        foodCafe.menu2 =" Chicken Katsu ";
        foodCafe.menu3 =" Chicken Teriyaki ";
        foodCafe.menu4 =" Ramen Ichiraku ";
        foodCafe.menuFood();

        Class_1 drinkCafe= new Class_1();
        drinkCafe.minuman1 = " Black Coffe ";
        drinkCafe.minuman2 = " Red Velvet Ice ";
        drinkCafe.minuman3 = " Arabica Capucino ";
        drinkCafe.minuman4 = " Gayo Coffe ";
        drinkCafe.menuDrink();

        Class_1 hrgmkn = new Class_1();
        hrgmkn.hmenu1 = " Rp.15.000";
        hrgmkn.hmenu2 = " Rp.25.000";
        hrgmkn.hmenu3 = " Rp.20.000";
        hrgmkn.hmenu4 = " Rp.35.000";
        hrgmkn.hrgFood(" Rp.35.000");

        Class_1 hrgmnm = new Class_1();
        hrgmnm.hminuman1 = "Rp.10.000";
        hrgmnm.hminuman2 = "Rp.15.000";
        hrgmnm.hminuman3 = "Rp.30.000";
        hrgmnm.hminuman4 = "Rp.25.000";
        hrgmnm.hrgDrink(" Rp.15.000");

        Class_1 pesan = new Class_1();
        pesan.namamakanan = "Ramen Ichiraku";
        pesan.namaminuman = " Red Velvet Ice ";
        pesan.jumlahmakanan = " 1";
        pesan.jumlahminuman = " 1 ";
        pesan.hmenu1 = " Rp.35.000";
        pesan.hminuman1 = " Rp. 15.000";
        pesan.tampilkanMenu();

        Class_2 info = new Class_2();
        info.nampel = " Muhammad Nafis";
        info.totalharga = "50.000";
        info.strukpembayaran();
        info.Pembayaran();


    }

}

