package object;

public class Class_1 {

    public String nama;
    public String npm;
    public String kelas;
    public String namamakanan;
    public String menu1, menu2, menu3, menu4;
    public String minuman1, minuman2, minuman3, minuman4;
    public String namaminuman;
    public String hmenu1, hmenu2, hmenu3, hmenu4;
    public String hminuman1, hminuman2, hminuman3, hminuman4;
    public String jumlahmakanan;
    public String jumlahminuman;

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

    public String getMenu1() {
        return menu1;
    }

    public void setMenu1(String menu1) {
        this.menu1 = menu1;
    }

    public String getMenu2() {
        return menu2;
    }

    public void setMenu2(String menu2) {
        this.menu2 = menu2;
    }

    public String getMenu3() {
        return menu3;
    }

    public void setMenu3(String menu3) {
        this.menu3 = menu3;
    }

    public String getMenu4() {
        return menu4;
    }

    public void setMenu4(String menu4) {
        this.menu4 = menu4;
    }

    public String getMinuman1() {
        return minuman1;
    }

    public void setMinuman1(String minuman1) {
        this.minuman1 = minuman1;
    }

    public String getMinuman2() {
        return minuman2;
    }

    public void setMinuman2(String minuman2) {
        this.minuman2 = minuman2;
    }

    public String getMinuman3() {
        return minuman3;
    }

    public void setMinuman3(String minuman3) {
        this.minuman3 = minuman3;
    }

    public String getMinuman4() {
        return minuman4;
    }

    public void setMinuman4(String minuman4) {
        this.minuman4 = minuman4;
    }

    public String getNamaminuman() {
        return namaminuman;
    }

    public void setNamaminuman(String namaminuman) {
        this.namaminuman = namaminuman;
    }

    public String getHmenu1() {
        return hmenu1;
    }

    public void setHmenu1(String hmenu1) {
        this.hmenu1 = hmenu1;
    }

    public String getHmenu2() {
        return hmenu2;
    }

    public void setHmenu2(String hmenu2) {
        this.hmenu2 = hmenu2;
    }

    public String getHmenu3() {
        return hmenu3;
    }

    public void setHmenu3(String hmenu3) {
        this.hmenu3 = hmenu3;
    }

    public String getHmenu4() {
        return hmenu4;
    }

    public void setHmenu4(String hmenu4) {
        this.hmenu4 = hmenu4;
    }

    public String getHminuman1() {
        return hminuman1;
    }

    public void setHminuman1(String hminuman1) {
        this.hminuman1 = hminuman1;
    }

    public String getHminuman2() {
        return hminuman2;
    }

    public void setHminuman2(String hminuman2) {
        this.hminuman2 = hminuman2;
    }

    public String getHminuman3() {
        return hminuman3;
    }

    public void setHminuman3(String hminuman3) {
        this.hminuman3 = hminuman3;
    }

    public String getHminuman4() {
        return hminuman4;
    }

    public void setHminuman4(String hminuman4) {
        this.hminuman4 = hminuman4;
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




    public void menuFood() {
        System.out.println("================================");
        System.out.println(" Food ");
        System.out.println("================================");
        System.out.println("1." + menu1);
        System.out.println("2." + menu2);
        System.out.println("3." + menu3);
        System.out.println("4." + menu4);


    }

    public void menuDrink() {
        System.out.println("================================");
        System.out.println(" Drink ");
        System.out.println("================================");
        System.out.println("1:" + minuman1);
        System.out.println("2." + minuman2);
        System.out.println("3." + minuman3);
        System.out.println("4." + minuman4);

    }

    public void hrgFood(String s) {
        System.out.println("================================");
        System.out.println(" Harga Food ");
        System.out.println("================================");
        System.out.println("1. " + hmenu1);
        System.out.println("2." + hmenu2);
        System.out.println("3. " + hmenu3);
        System.out.println("4. " + hmenu4);
    }

    public void hrgDrink(String s) {
        System.out.println("================================");
        System.out.println(" Harga Drink  ");
        System.out.println("================================");
        System.out.println("1." + hminuman1);
        System.out.println("2. " + hminuman2);
        System.out.println("3. " + hminuman3);
        System.out.println("4. " + hminuman4);
    }

    public void tampilkanMenu() {
        System.out.println("================================");
        System.out.println(" Pesanan Anda ");
        System.out.println("================================");
        System.out.println("Nama Makanan : " + namamakanan);
        System.out.println("Nama Minuman : " + namaminuman);
        System.out.println("Jumlah Makanan : " + jumlahmakanan);
        System.out.println("Harga Makanan  : " + hmenu1);
        System.out.println("Harga Minuman  : " + hminuman1);
    }


}

