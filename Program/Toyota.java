public class Toyota extends Mobil {
    public void tampilkan(){
        double besar_silinder;
        String bahan_bakar;
        String kategori;

        besar_silinder=32.5;
        bahan_bakar="Pertalite";
        kategori="Off Road";
    
        Mobil m = new Mobil();
    
        m.inputdata("AVANZA", "Putih", 4, "Off Road");
        m.tampilkandata();
    
        System.out.println("Silinder :"+besar_silinder);
        System.out.println("Jenis Bahan Bakar :"+bahan_bakar);
        System.out.println("Jenis Kategori :"+kategori);
      
    }
    
}
