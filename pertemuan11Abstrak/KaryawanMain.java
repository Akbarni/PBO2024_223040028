package pertemuan11Abstrak;

public class KaryawanMain {
    public static void main(String[] args) {
        Staff staff1 = new Staff("Akbar Nur Iman", 3000, 500);
        Manager manager1 = new Manager("Fikri nugraha", 5000, 1000);
        
        System.out.println("Gaji " + staff1.getNama() + ": $" + staff1.hitungGaji());
        System.out.println("Gaji " + manager1.getNama() + ": $" + manager1.hitungGaji());
    }
}