public class Manager extends Pegawai {
    double tunjangan;

    public Manager(String nama, double gajipokok, double tunjangan){
        super(nama, gajipokok);
        this.tunjangan = tunjangan;
    }

    public void cetakInfo(){
        System.out.println("=========================");
        System.out.println("Manager");
        super.cetakInfo();
        System.out.println("Tunjangan    : " + this.tunjangan);
        System.out.println("=========================");
    }
}