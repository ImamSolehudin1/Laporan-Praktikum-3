public class Manager extends Pegawai {
    private double tunjangan;
     
    public void settunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }
    public double gettunjangan() {
        return this.tunjangan;
        
    }
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan       : " + this.tunjangan);
        System.out.println("============================");
    }
    }
    