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

    public String nampel;
    public String totalharga;

    public String getNampel() {
        return nampel;
    }

    public void setNampel(String nampel) {
        this.nampel = nampel;
    }


    public String getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(String totalharga) {
        this.totalharga = totalharga;
    }




    public Class_2(){
        this.nampel = "";
        this.totalharga = "";

    }

    public void strukpembayaran(){
        System.out.println("======================================");
        System.out.println("Nama Pelanggan  : "+ nampel);
        System.out.println("======================================");
    }
    public void Pembayaran(){
        System.out.println("=====================================");
        System.out.println("Total Harga Yang Harus Dibayar : Rp. "+totalharga);
    }

}

