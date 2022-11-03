public class Honda extends Mobil{
/**
 * 
 */
public void tampilkan(){
    double besar_silinder = 5.5;
    String bahan_bakar = "Pertamax";
    String kategori = "Sport";

    Mobil m = new Mobil();

    m.inputdata("CRV", "Merah", 4, "Mewah");
    m.tampilkandata();

    System.out.println("Silinder :"+besar_silinder);
    System.out.println("Jenis Bahan Bakar :"+bahan_bakar);
    System.out.println("Jenis Kategori :"+kategori);
  
}
}
