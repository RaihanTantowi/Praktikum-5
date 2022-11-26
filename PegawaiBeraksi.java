public class PegawaiBeraksi {
    public static void main(String[] args){
        // Membuat objek dan beri nilai
        Pegawai Beni = new Pegawai("Beni", 4500000);
        Manager Amar = new Manager ("Amar", 6000000, 8000000);
        Programmer Bambang = new Programmer ("Bambang", 3700000, 9000000);

        // Memanggil atribut
        Beni.cetakInfo();
        Amar.cetakInfo();
        Bambang.cetakInfo();
    }
}