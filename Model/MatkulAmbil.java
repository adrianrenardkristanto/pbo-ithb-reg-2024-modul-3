import java.util.*;

public class MatkulAmbil {
    private MataKuliah mataKuliah;
    private List<Presensi> listPresensi = new ArrayList<Presensi>();
    private double n1, n2, n3;
    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }
    public List<Presensi> getListPresensi() {
        return listPresensi;
    }
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getN3() {
        return n3;
    }
    public void setN3(double n3) {
        this.n3 = n3;
    }
    public MatkulAmbil(MataKuliah mataKuliah, List<Presensi> listPresensi, double n1, double n2, double n3) {
        this.mataKuliah = mataKuliah;
        this.listPresensi = listPresensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    @Override
    public String toString(){
        return mataKuliah + "Presensi: " + listPresensi + 
               "\nNilai: [" + n1 + ", " + n2 + ", " + n3 + "]";
    }
}
