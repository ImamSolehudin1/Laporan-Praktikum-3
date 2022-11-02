
public class Programer extends Pegawai {
    private double bonus;

    public void setbonus(double bonus){
        this.bonus = bonus;
    }
    public double getbonus() {
        return this.bonus;
        
    }
     
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus           : " + this.bonus);
        System.out.println("============================");
    }
    }
    