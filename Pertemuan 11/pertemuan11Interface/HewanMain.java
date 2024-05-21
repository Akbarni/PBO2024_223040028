package pertemuan11Interface;

public class HewanMain {
    public static void main(String[] args) {
        Hewan singa = new Singa();
        Hewan gajah = new Gajah();
        Hewan burung = new Burung();
        
        singa.makan();
        singa.bersuara();
        
        gajah.makan();
        gajah.bersuara();
        
        burung.makan();
        burung.bersuara();
    }
}
