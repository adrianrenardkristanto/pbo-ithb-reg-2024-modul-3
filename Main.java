import java.time.LocalDate;
import java.util.*;

import javax.swing.text.View;
import View_SIA.*;
import Model_SIA.*;
import Controller_SIA.*;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        SIA_Functions functSIA = new SIA_Functions(users);

        Show view = new Show(functSIA);
        view.displayMenu();
    }
    
    public static void makeDummy(List<User> users){
        List<Presensi> presensiList = new ArrayList<>();
        presensiList.add(new Presensi(LocalDate.of(2024, 10, 1), Status_Presensi.HADIR));
        presensiList.add(new Presensi(LocalDate.of(2024, 10, 2), Status_Presensi.ALPHA));
        presensiList.add(new Presensi(LocalDate.of(2024, 10, 3), Status_Presensi.HADIR));
        presensiList.add(new Presensi(LocalDate.of(2024, 10, 4), Status_Presensi.HADIR));
        presensiList.add(new Presensi(LocalDate.of(2024, 10, 5), Status_Presensi.HADIR));

        List<PresensiStaff> presensiStaffList = new ArrayList<>();
        presensiStaffList.add(new PresensiStaff(LocalDate.of(2024, 10, 1), Status_Presensi.HADIR, 8.5));
        presensiStaffList.add(new PresensiStaff(LocalDate.of(2024, 10, 2), Status_Presensi.ALPHA, 0));
        presensiStaffList.add(new PresensiStaff(LocalDate.of(2024, 10, 3), Status_Presensi.HADIR, 4.0));
        presensiStaffList.add(new PresensiStaff(LocalDate.of(2024, 10, 4), Status_Presensi.HADIR, 7.5));
        presensiStaffList.add(new PresensiStaff(LocalDate.of(2024, 10, 5), Status_Presensi.ALPHA, 0));

        MataKuliah matkul1 = new MataKuliah("MK001", "3", "Pemrograman Dasar");
        MataKuliah matkul2 = new MataKuliah("MK002", "4", "Struktur Data");
        MataKuliah matkul3 = new MataKuliah("MK003", "3", "Basis Data");
        MataKuliah matkul4 = new MataKuliah("MK004", "2", "Jaringan Komputer");
        MataKuliah matkul5 = new MataKuliah("MK005", "3", "Sistem Operasi");

        List<MatkulAmbil> matkulAmbilList = new ArrayList<>();
        matkulAmbilList.add(new MatkulAmbil(matkul1, presensiList,80.0, 85.0, 90.0));
        matkulAmbilList.add(new MatkulAmbil(matkul2, presensiList, 75, 80, 85));
        matkulAmbilList.add(new MatkulAmbil(matkul3, presensiList, 90, 92, 95));
        matkulAmbilList.add(new MatkulAmbil(matkul4, presensiList, 85, 87, 90));
        matkulAmbilList.add(new MatkulAmbil(matkul5, presensiList, 78, 80, 82));
        
        List<MatkulAjar> matkulAjarList = new ArrayList<>();
        matkulAjarList.add(new MatkulAjar("MK001", "3", "Pemrograman Dasar", matkul1, presensiStaffList ));
        matkulAjarList.add(new MatkulAjar("MK002", "4", "Struktur Data", matkul2, presensiStaffList));
        matkulAjarList.add(new MatkulAjar("MK003", "3", "Basis Data", matkul3, presensiStaffList));
        matkulAjarList.add(new MatkulAjar("MK004", "2", "Jaringan Komputer", matkul4, presensiStaffList));
        matkulAjarList.add(new MatkulAjar("MK005", "3", "Sistem Operasi", matkul5, presensiStaffList));

        Mahasiswa_Sarjana srj = new Mahasiswa_Sarjana("Budi Santoso", "Jl. Mawar No.1", "01-01-2001", "081234567891", "S11001","Teknik Elektro", matkulAmbilList);

        Mahasiswa_Magister mgr = new Mahasiswa_Magister("Siti Aisyah", "Jl. Tulip No.2", "02-02-1992", "081234567882", "M21002", "Sistem Informasi", matkulAmbilList, "Pengembangan E-Commerce");

        Mahasiswa_Doktor dkt = new Mahasiswa_Doktor("Andi Wijaya", "Jl. Jati No.6", "03-03-1980", "081234567861", "D31001", "Teknik Mesin", "Rekayasa Energi Terbarukan", 90.0, 85.0, 88.0);

        Dosen_Tetap dttp = new Dosen_Tetap("Surya Dharma", "Jl. Merak No.1", "05-05-1970", "081234567821", "DS2001", "Teknik Elektro", 8000000.0);

        Dosen_Honorer dh = new Dosen_Honorer("Joko Santoso", "Jl. Bougenville No.4", "06-06-1983", "081234567814", "DH3004", "Teknik Mesin", 240000.0);

        Karyawan kry = new Karyawan("Agung Saputra", "Jl. Jeruk No.3", "07-07-1977", "081234567803", "KR4003", 5500000);

        users.add(srj);
        users.add(mgr);
        users.add(dkt);
        users.add(dttp);
        users.add(dh);
        users.add(kry);
        
    }
}
