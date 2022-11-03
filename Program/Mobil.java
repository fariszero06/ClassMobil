// Nama     : Faris Syahluthfi
// NIM      : 312010034
// Kelas    : TI.20.A1

public class Mobil {
    private String merek;
    private String warna;
    private int  jumlah_pintu;
    private String jenis;

    //Ini adalah Get dan Overloading
    public String getMerek(){
        return merek;
    }
    //Ini adalah Set dan Overloading
    public void setMerek(String merek){
        this.merek=merek;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna=warna;
    }

    public int getJumlah_pintu(){
        return jumlah_pintu;
    }

    public void setJumlah_pintu(int jumlah_pintu){
        this.jumlah_pintu=jumlah_pintu;
    }

    public String getJenis(){
        return jenis;
    }

    public void setJenis(String jenis){
        this.jenis=jenis;
    }

    public void tampilkandata(){
        System.out.println(".()");
        System.out.println("Merek Mobil :"+getMerek());
        System.out.println("Warna Mobil :"+getWarna());
        System.out.println("Jumlah Pintu :"+getJumlah_pintu());
        System.out.println("Jenis Mobil :"+getJenis());
    }

    public void inputdata(String merek, String warna, int jumlah_pintu, String jenis){
        setMerek(merek);
        setWarna(warna);
        setJumlah_pintu(jumlah_pintu);
        setJenis(jenis);
    }


}
