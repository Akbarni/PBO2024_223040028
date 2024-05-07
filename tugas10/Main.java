package latihan10;
public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("123", "AS januar", "Ilmu hukum ");
        System.out.println(dosen.getNip() + " - " + dosen.getNama() + " - " + dosen.getJurusan());
    }
}