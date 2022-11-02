public class Beraksi {
    public static void main(String[] args){
// Membuat object
        Manager udin = new Manager();
        Programer budi = new Programer();
/* memanggil atribut dan memberi nilai */
        udin.setnama("Udin");
        udin.setgajipokok(5000000);
        udin.settunjangan(2000000);
        udin.cetakInfo();

        budi.setnama("Budi");
        budi.setgajipokok(4000000);
        budi.setbonus(3000000);
        budi.cetakInfo();
    }
}