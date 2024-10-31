package Model_SIA;
import java.util.*;

public class Mahasiswa_Magister extends Mahasiswa{
    private List<MatkulAmbil> mataKuliah = new ArrayList<>(Arrays.asList());
    private String judul_tesis;
    
    public Mahasiswa_Magister(String nama, String alamat, String TTL, String noTelp, String NIM, String jurusan,
            List<MatkulAmbil> mataKuliah, String judul_tesis) {
        super(nama, alamat, TTL, noTelp, NIM, jurusan);
        this.mataKuliah = mataKuliah;
        this.judul_tesis = judul_tesis;
    }

    public List<MatkulAmbil> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(List<MatkulAmbil> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getJudul_tesis() {
        return judul_tesis;
    }

    public void setJudul_tesis(String judul_tesis) {
        this.judul_tesis = judul_tesis;
    }

    @Override
    public String toString(){
        return super.toString() + "Judul Tesis: " + judul_tesis + "\n"+ mataKuliah+"\n";
    }
}
