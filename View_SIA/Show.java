package View_SIA;
import java.time.LocalDate;
import java.util.*;

import javax.swing.JOptionPane;

import Model_SIA.*;
import Controller_SIA.*;

public class Show {

    private SIA_Functions functions;

    public Show(SIA_Functions functions) {
        this.functions = functions;
    }

    public void displayMenu() {
        String[] options = {
            "Print User Data",
            "Calculate Nilai Akhir",
            "Calculate Rata-Rata Nilai Akhir",
            "Check Lulus atau Tidak",
            "List Mata Kuliah Presensi",
            "Calculate Jam Dosen",
            "Calculate Gaji Staff",
            "Exit"
        };

        while (true) {
            int choice = JOptionPane.showOptionDialog(null,
                    "Select an option:",
                    "SIA Menu",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (choice == -1 || choice == options.length - 1) {
                break; // Exit the menu
            }

            handleMenuChoice(choice);
        }
    }

    private void handleMenuChoice(int choice) {
        switch (choice) {
            case 0: // Print User Data
                String nama = JOptionPane.showInputDialog("Enter Name:");
                List<User> users = getUserList(); // Assume this method returns a list of users
                String result = functions.printUserData( nama);
                JOptionPane.showMessageDialog(null, result);
                break;

            case 1: // Calculate Nilai Akhir
                String NIM1 = JOptionPane.showInputDialog("Enter NIM:");
                String KodeMK1 = JOptionPane.showInputDialog("Enter Course Code:");
                double nilaiAkhir = functions.NilaiAkhir(NIM1, KodeMK1, getSarjanaList(), getMagisterList(), getDoktorList(), getMatkulAmbilList());
                JOptionPane.showMessageDialog(null, "Nilai Akhir: " + (nilaiAkhir == -1 ? "Course not found" : nilaiAkhir));
                break;

            case 2: // Calculate Rata-Rata Nilai Akhir
                String KodeMK2 = JOptionPane.showInputDialog("Enter Course Code:");
                double rataRata = functions.rata2NilaiAkhir(KodeMK2, getSarjanaList(), getMagisterList(), getMatkulAmbilList());
                JOptionPane.showMessageDialog(null, "Rata-Rata Nilai Akhir: " + rataRata);
                break;

            case 3: // Check Lulus atau Tidak
                String KodeMK3 = JOptionPane.showInputDialog("Enter Course Code:");
                String lulusResult = functions.lulusAtauTidak(KodeMK3, getSarjanaList(), getMagisterList(), getMatkulAmbilList());
                JOptionPane.showMessageDialog(null, lulusResult);
                break;

            case 4: // List Mata Kuliah Presensi
                String NIM2 = JOptionPane.showInputDialog("Enter NIM:");
                functions.listMatkul_Presensi(NIM2, getSarjanaList(), getMagisterList(), getMatkulAmbilList(), getPresensiInstance());
                break;

            case 5: // Calculate Jam Dosen
                String NIK = JOptionPane.showInputDialog("Enter NIK:");
                double jamDosen = functions.jamDosen(NIK, getDosenList(), getDosenTetapList(), getDosenHonorerList(), getMatkulAjarList(), getPresensiStaffList(), getPresensiStatus());
                JOptionPane.showMessageDialog(null, "Total Jam Dosen: " + jamDosen);
                break;

            case 6: // Calculate Gaji Staff
                String staffName = JOptionPane.showInputDialog("Enter Staff Name:");
                double gajiStaff = functions.printGajiStaff(staffName, getDosenTetapList(), getDosenHonorerList(), getMatkulAjarList(), getPresensiStaffList(), getKaryawanList(), getPresensiStatus());
                JOptionPane.showMessageDialog(null, "Total Gaji: " + gajiStaff);
                break;
        }
    }

    // Placeholder methods for getting lists of users and other entities
    private List<User> getUserList() {
        // Implement this to return a list of users
        return null;
    }

    private List<Mahasiswa_Sarjana> getSarjanaList() {
        // Implement this to return a list of Sarjana students
        return null;
    }

    private List<Mahasiswa_Magister> getMagisterList() {
        // Implement this to return a list of Magister students
        return null;
    }

    private List<Mahasiswa_Doktor> getDoktorList() {
        // Implement this to return a list of Doktor students
        return null;
    }

    private List<MatkulAmbil> getMatkulAmbilList() {
        // Implement this to return a list of MatkulAmbil instances
        return null;
    }

    private Presensi getPresensiInstance() {
        // Implement this to return an instance of Presensi
        return null;
    }

    private List<Dosen> getDosenList() {
        // Implement this to return a list of Dosen
        return null;
    }

    private List<Dosen_Tetap> getDosenTetapList() {
        // Implement this to return a list of Dosen Tetap
        return null;
    }

    private List<Dosen_Honorer> getDosenHonorerList() {
        // Implement this to return a list of Dosen Honorer
        return null;
    }

    private List<MatkulAjar> getMatkulAjarList() {
        // Implement this to return a list of MatkulAjar
        return null;
    }

    private List<PresensiStaff> getPresensiStaffList() {
        // Implement this to return a list of PresensiStaff
        return null;
    }

    private List<Karyawan> getKaryawanList() {
        // Implement this to return a list of Karyawan
        return null;
    }

    private Status_Presensi getPresensiStatus() {
        // Implement this to return an instance of Status_Presensi
        return null;
    }
}
