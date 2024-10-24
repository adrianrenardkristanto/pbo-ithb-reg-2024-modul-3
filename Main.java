import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Dummy data untuk Mahasiswa_Sarjana
        Mahasiswa_Sarjana sarjana = new Mahasiswa_Sarjana(
            "Ahmad Fauzi", 
            "Jalan Merdeka 123", 
            "01-01-2002", 
            "081234567890", 
            "S12345", 
            "Teknik Informatika"
        );
        
        MatkulAmbil matkulAmbilSarjana1 = new MatkulAmbil(
            new MataKuliah("IF101", "3", "Algoritma dan Pemrograman"),
            Arrays.asList(new Presensi(LocalDate.now(), Status_Presensi.HADIR)),
            85.0, 90.0, 88.0
        );
        
        sarjana.getMataKuliah().add(matkulAmbilSarjana1);
        
        // Dummy data untuk Mahasiswa_Magister
        Mahasiswa_Magister magister = new Mahasiswa_Magister(
            "Siti Nurhaliza", 
            "Jalan Sudirman 456", 
            "15-05-1998", 
            "081234567891", 
            "M54321", 
            "Ilmu Komputer", 
            "Sistem Informasi untuk Smart City"
        );
        
        MatkulAmbil matkulAmbilMagister1 = new MatkulAmbil(
            new MataKuliah("SI201", "3", "Big Data Analytics"),
            Arrays.asList(new Presensi(LocalDate.now(), Status_Presensi.HADIR)),
            90.0, 88.0, 92.0
        );
        
        magister.getMataKuliah().add(matkulAmbilMagister1);
        
        // Dummy data untuk Mahasiswa_Doktor
        Mahasiswa_Doktor doktor = new Mahasiswa_Doktor(
            "Budi Santoso", 
            "Jalan Diponegoro 789", 
            "22-10-1995", 
            "081234567892", 
            "D98765", 
            "Ilmu Komputer", 
            "Pengembangan Algoritma Kecerdasan Buatan",
            80.0, 85.0, 87.0
        );
        
        // Dummy data untuk Dosen_Tetap
        Dosen_Tetap dosenTetap = new Dosen_Tetap(
            "Dr. Ir. Rahmat Hidayat", 
            "Jalan Pahlawan 321", 
            "17-08-1975", 
            "081234567893", 
            "D001", 
            "Ilmu Komputer", 
            15000000.0
        );
        
        MatkulAjar matkulAjarTetap1 = new MatkulAjar(
            "IF301", 
            "3", 
            "Kecerdasan Buatan", 
            new MataKuliah("IF301", "3", "Kecerdasan Buatan"),
            Arrays.asList(new PresensiStaff(LocalDate.now(), Status_Presensi.HADIR, 8.0))
        );
        
        dosenTetap.getMataKuliah().add(matkulAjarTetap1);
        
        // Dummy data untuk Dosen_Honorer
        Dosen_Honorer dosenHonorer = new Dosen_Honorer(
            "Dr. Lestari", 
            "Jalan Kemerdekaan 654", 
            "10-06-1980", 
            "081234567894", 
            "D002", 
            "Ilmu Komputer", 
            200000.0
        );
        
        MatkulAjar matkulAjarHonorer1 = new MatkulAjar(
            "IF302", 
            "3", 
            "Jaringan Komputer", 
            new MataKuliah("IF302", "3", "Jaringan Komputer"),
            Arrays.asList(new PresensiStaff(LocalDate.now(), Status_Presensi.HADIR, 7.0))
        );
        
        dosenHonorer.getMataKuliah().add(matkulAjarHonorer1);
        
        // Dummy data untuk Karyawan
        Karyawan karyawan = new Karyawan(
            "Asep Supriyadi", 
            "Jalan Gajah Mada 987", 
            "05-03-1985", 
            "081234567895", 
            "K12345", 
            5000000.0
        );
        
        PresensiStaff presensiKaryawan1 = new PresensiStaff(
            LocalDate.now(), 
            Status_Presensi.HADIR, 
            8.0
        );
        
        karyawan.getStaffs().add(presensiKaryawan1);
        
        // Output dummy data
        System.out.println(sarjana);
        System.out.println(magister);
        System.out.println(doktor);
        System.out.println(dosenTetap);
        System.out.println(dosenHonorer);
        System.out.println(karyawan);
    }
}
