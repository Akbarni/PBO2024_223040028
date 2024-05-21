package pertemuan11Abstrak;

public class Staff extends Karyawan {
    private double tunjangan;
    
    public Staff(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    
    public double getTunjangan() {
        return tunjangan;
    }
    
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    public double hitungGaji() {
        return getGajiPokok() + tunjangan;
    }
}

