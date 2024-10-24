import java.util.*;

class MatkulAjar extends MataKuliah{
    private MataKuliah mataKuliah;
    private List<PresensiStaff> presensiStaffList = new ArrayList<PresensiStaff>();
    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }
    public List<PresensiStaff> getPresensiStaffList() {
        return presensiStaffList;
    }
    public MatkulAjar(String kode_matkul, String sks, String nama_matkul, MataKuliah mataKuliah,
            List<PresensiStaff> presensiStaffList) {
        super(kode_matkul, sks, nama_matkul);
        this.mataKuliah = mataKuliah;
        this.presensiStaffList = presensiStaffList;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Presensi Staff: " + presensiStaffList;
    }
}
