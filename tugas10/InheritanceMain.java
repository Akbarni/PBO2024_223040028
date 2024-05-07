package latihan10;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("223040028","Akbar", "Cileunyi");
        System.out.println(mhs.getNrp() + "-" + mhs.getNama() + "-" + mhs.getAlamat());
    }
}