package pertemuan11Abstrak;

public class Manager extends Karyawan {
    private double bonus;
    
    public Manager(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }
    
    public double getBonus() {
        return bonus;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double hitungGaji() {
        return getGajiPokok() + bonus;
    }
}
