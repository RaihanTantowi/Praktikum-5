public class Programmer extends Pegawai{
    double bonus;
    
    public Programmer(String nama, double gajipokok, double bonus){
        super(nama, gajipokok);
        this.bonus=bonus;

    }

    public void cetakInfo(){
        System.out.println("Programmer");
        super.cetakInfo();
        System.out.println("Bonus        :  "+ this.bonus);
    }
}