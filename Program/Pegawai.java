public class Pegawai {
    private String nama;
    private double gajipokok;
    
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setgajipokok(double gajipokok){
        this.gajipokok = gajipokok;
    }

    public String getnama() {
        return this.nama;        
    }
    public double getgajipokok(){
        return this.gajipokok;
    }

    public void cetakInfo() {

        System.out.println("============================");
        System.out.println("Nama            : " + this.nama);
        System.out.println("Gaji Pokok      : " + this.gajipokok);
    }
}