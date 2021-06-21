package object;

public class Class_2 extends Class_1{


    @Override
    public void setNamamakanan(String namamakanan) {
        super.setNamamakanan(namamakanan);
    }

    @Override
    public void setNamaminuman(String namaminuman) {
        super.setNamaminuman(namaminuman);
    }

    public String namapelanggan;

    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public String getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(String totalharga) {
        this.totalharga = totalharga;
    }


    public String totalharga;

    public Class_2(){
        this.namapelanggan="";
        this.totalharga="";
        System.out.println("Terimakasih");

    }

    public void strukpembayaran(){
        System.out.println("======================================");
        System.out.println("Nama Pelanggan  : "+namapelanggan);
        System.out.println("======================================");
    }
    public void Pembayaran(){
        System.out.println("=====================================");
        System.out.println("Total Harga Yang Harus Dibayar : Rp. "+totalharga);
    }

}

