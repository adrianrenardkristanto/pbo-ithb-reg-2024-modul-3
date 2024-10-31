package Controller_SIA;
import java.util.List;
import Model_SIA.*;

public class SIA_Functions {

    private List<User> users;

    public SIA_Functions(List<User> users){
        this.users = users;
    }

    public String printUserData(String nama){
        for (User user : users) {
            if (user instanceof Mahasiswa_Sarjana && ((Mahasiswa_Sarjana) user).getNama().equalsIgnoreCase(nama)) {
                return "Status: Mahasiswa Sarjana";
            } else if (user instanceof Mahasiswa_Magister && ((Mahasiswa_Magister) user).getNama().equalsIgnoreCase(nama)) {
                return "Status: Mahasiswa Magister";
            } else if (user instanceof Mahasiswa_Doktor && ((Mahasiswa_Doktor) user).getNama().equalsIgnoreCase(nama)) {
                return "Status: Mahasiswa Doktor";
            } else if (user instanceof Dosen_Tetap && ((Dosen_Tetap) user).getNama().equalsIgnoreCase(nama)) {
                return "Status: Dosen Tetap";
            } else if (user instanceof Dosen_Honorer && ((Dosen_Honorer) user).getNama().equalsIgnoreCase(nama)) {
                return "Status: Dosen Honorer";
            } else if (user instanceof Karyawan && ((Karyawan) user).getNama().equalsIgnoreCase(nama)) {
                return "Status: Karyawan";
            }
        }
        return "Nama Anda tidak ditemukan baik sebagai mahasiswa ataupun staff";
    }

    public double NilaiAkhir(String NIM, String KodeMK, List<Mahasiswa_Sarjana> sarjanas, List<Mahasiswa_Magister> magisters, List<Mahasiswa_Doktor> doktors, List<MatkulAmbil> matkulAmbil){
        for (Mahasiswa_Sarjana sarjana: sarjanas) {
            if (sarjana.getNIM().equalsIgnoreCase(NIM)) {
                for (MatkulAmbil matkul_ambil : sarjana.getMataKuliah()) {
                    if (matkul_ambil.getMataKuliah().getKode_matkul().equalsIgnoreCase(KodeMK)) {
                        return (matkul_ambil.getN1()+matkul_ambil.getN2()+matkul_ambil.getN3())/3;
                    }
                }
            }
        }
        for (Mahasiswa_Magister magister : magisters) {
            if (magister.getNIM().equalsIgnoreCase(NIM)) {
                for (MatkulAmbil matkul_ambil : magister.getMataKuliah()) {
                    if (matkul_ambil.getMataKuliah().getKode_matkul().equalsIgnoreCase(KodeMK)) {
                        return (matkul_ambil.getN1()+matkul_ambil.getN2()+matkul_ambil.getN3())/3;
                    }
                }
            }
        }
        for (Mahasiswa_Doktor doktor : doktors) {
            if (doktor.getNIM().equalsIgnoreCase(NIM)) {
               return (doktor.getN1() + doktor.getN2() + doktor.getN3())/3;
            }
        }
        return -1;
    }
    public double rata2NilaiAkhir(String KodeMK, List<Mahasiswa_Sarjana> sarjanas, List<Mahasiswa_Magister> magisters, List<MatkulAmbil> matkulAmbil){
        double avr = 0, n = 0;
        for (Mahasiswa_Sarjana sarjana: sarjanas) {
            for (MatkulAmbil matkul_ambil : sarjana.getMataKuliah()) {
                if (matkul_ambil.getMataKuliah().getKode_matkul().equalsIgnoreCase(KodeMK)) {
                    avr += (matkul_ambil.getN1()+matkul_ambil.getN2()+matkul_ambil.getN3())/3;
                    n++;
                    break;
                }
                
            }
           
        }
        for (Mahasiswa_Magister magister : magisters) {
            for (MatkulAmbil matkul_ambil : magister.getMataKuliah()) {
                if (matkul_ambil.getMataKuliah().getKode_matkul().equalsIgnoreCase(KodeMK)) {
                    avr += (matkul_ambil.getN1()+matkul_ambil.getN2()+matkul_ambil.getN3())/3;
                    n++;
                    break;
                }
            }
        }
        return avr/n;
    }
    
    public String lulusAtauTidak(String KodeMK, List<Mahasiswa_Sarjana> sarjanas, List<Mahasiswa_Magister> magisters, List<MatkulAmbil> matkulAmbil){
        double gagal = 0, semua = 0, avr = 0;
        String nama_matkul = "";
        for (Mahasiswa_Sarjana sarjana: sarjanas) {
            for (MatkulAmbil matkul_ambil: sarjana.getMataKuliah()) {
                if (matkul_ambil.getMataKuliah().getKode_matkul().equalsIgnoreCase(KodeMK)) {
                    nama_matkul = matkul_ambil.getMataKuliah().getNama_matkul();
                    semua++;
                    avr = (matkul_ambil.getN1()+matkul_ambil.getN2()+matkul_ambil.getN3())/3;
                    if (avr < 56) {
                        gagal++;
                    }
                    break;
                }
            }
           
        }
        for (Mahasiswa_Magister magister : magisters) {
            for (MatkulAmbil matkul_ambil : magister.getMataKuliah()) {
                if (matkul_ambil.getMataKuliah().getKode_matkul().equalsIgnoreCase(KodeMK)) {
                    semua++;
                    avr = (matkul_ambil.getN1()+matkul_ambil.getN2()+matkul_ambil.getN3())/3;
                    if (avr < 56) {
                        gagal++;
                    }
                    break;
                }
            }
        }
        return gagal + " dari " + semua + " mahasiswa tidak lulus matakuliah" + nama_matkul; 
    }

    public void listMatkul_Presensi(String NIM, List<Mahasiswa_Sarjana> sarjanas, List<Mahasiswa_Magister> magisters,  List<MatkulAmbil> matkulAmbil, Presensi presensis){
        int kehadiran = 0;
        boolean lanjut = true;
        while (lanjut) {
            for (Mahasiswa_Sarjana sarjana: sarjanas) {
                if (sarjana.getNIM().equalsIgnoreCase(NIM)) {
                    System.out.println("List Mata Kuliah Yang Diambil: ");
                    for (MatkulAmbil matkul_ambil : sarjana.getMataKuliah()) {
                        System.out.println("- " + matkul_ambil.getMataKuliah().getNama_matkul());
                    }
                    for (MatkulAmbil matkul_ambil : sarjana.getMataKuliah()) {
                        for (Presensi presensi : matkul_ambil.getListPresensi()) {
                            if (presensi.getStatus() == presensis.getStatus().HADIR) {
                                kehadiran++;
                            }
                        }
                    }
                    lanjut = false;
                    break;
                }
            }
            for (Mahasiswa_Magister magister : magisters) {
                if (magister.getNIM().equalsIgnoreCase(NIM)) {
                    System.out.println("List Mata Kuliah Yang Diambil: ");
                    for (MatkulAmbil matkul_ambil : magister.getMataKuliah()) {
                        System.out.println("- " + matkul_ambil.getMataKuliah().getNama_matkul());
                    }
                    for (MatkulAmbil matkul_ambil : magister.getMataKuliah()) {
                        for (Presensi presensi : matkul_ambil.getListPresensi()) {
                            if (presensi.getStatus() == presensis.getStatus().HADIR) {
                                kehadiran++;
                            }
                        }
                    }
                    lanjut = false;
                    break;
                }
            }
        }
        System.out.println("\nTotal Presensi: " + kehadiran);
    }

    public double jamDosen(String NIK, List<Dosen> dosens, List<Dosen_Tetap> dosen_Tetaps, List<Dosen_Honorer> dosen_Honorers, List<MatkulAjar> matkulAjar, List<PresensiStaff> presensiStaffs, Status_Presensi presensis){
        double jam_ngajar = 0;
        boolean lanjut = true;
        while (lanjut) {
            for (Dosen_Tetap dosen_tetap : dosen_Tetaps) {
                if (dosen_tetap.getNIK().equalsIgnoreCase(NIK)) {
                    for (MatkulAjar matkul_ajar : dosen_tetap.getMataKuliah()) {
                        for (PresensiStaff presensi : matkul_ajar.getPresensiStaffList()) {
                            if (presensi.getStatus() == presensis.HADIR) {
                               jam_ngajar += presensi.getJamPresensi();
                            }     
                        }
                    }
                    lanjut = false;
                    break;
                }
            }
            for (Dosen_Honorer dosen_honorer : dosen_Honorers) {
                if (dosen_honorer.getNIK().equalsIgnoreCase(NIK)) {
                    for (MatkulAjar matkul_ajar : dosen_honorer.getMataKuliah()) {
                        for (PresensiStaff presensi : matkul_ajar.getPresensiStaffList()) {
                            if (presensi.getStatus() == presensis.HADIR) {
                               jam_ngajar += presensi.getJamPresensi();
                            }     
                        }
                    }
                    lanjut = false;
                    break;
                }
            }
        }
        return jam_ngajar;
    }

    public double printGajiStaff(String nama,List<Dosen_Tetap> dosen_Tetaps, List<Dosen_Honorer> dosen_Honorers, List<MatkulAjar> matkulAjar, List<PresensiStaff> presensiStaffs, List<Karyawan> karyawans, Status_Presensi presensis){
        double kehadiran = 0, gaji = 0;
        boolean lanjut = true;
        while (lanjut) {
            for (Dosen_Tetap dosen_tetap : dosen_Tetaps) {
                if (dosen_tetap.getNama().equalsIgnoreCase(nama)) {
                    for (MatkulAjar matkul_ajar : dosen_tetap.getMataKuliah()) {
                        for (PresensiStaff presensi : matkul_ajar.getPresensiStaffList()) {
                            if (presensi.getStatus() == presensis.HADIR) {
                               kehadiran++;
                            }     
                        }
                    }
                    gaji = dosen_tetap.getGaji() + (kehadiran * 25000);
                    lanjut = false;
                    break;
                }
            }
            for (Dosen_Honorer dosen_honorer : dosen_Honorers) {
                if (dosen_honorer.getNama().equalsIgnoreCase(nama)) {
                    for (MatkulAjar matkul_ajar : dosen_honorer.getMataKuliah()) {
                        for (PresensiStaff presensi : matkul_ajar.getPresensiStaffList()) {
                            if (presensi.getStatus() == presensis.HADIR) {
                               kehadiran++;
                            }     
                        }
                    }
                    gaji = kehadiran * dosen_honorer.getHonorerPerSKS();
                    lanjut = false;
                    break;
                }
            }
            for (Karyawan karyawan: karyawans) {
                if (karyawan.getNama().equalsIgnoreCase(nama)) {
                    for (PresensiStaff presensi : karyawan.getpresensiKaryawan()) {
                        if (presensi.getStatus() == presensis.HADIR) {
                           kehadiran++;
                        }     
                    }
                    gaji = (kehadiran / 22) * karyawan.getGaji();
                    lanjut = false;
                    break;
                }
            }
        }
        return gaji;
    }
}
