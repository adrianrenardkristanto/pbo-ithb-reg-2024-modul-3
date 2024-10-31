package Model_SIA;
import java.util.*;

public class Dosen extends Staff{
	private String departemen;
	private List<MatkulAjar> mataKuliah = new ArrayList<>(Arrays.asList());
    
    public Dosen(String nama, String alamat, String TTL, String noTelp, String NIK, String departemen){
        super(nama, alamat, TTL, noTelp, NIK);
		this.departemen = departemen;		
	}

    public List<MatkulAjar> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(List<MatkulAjar> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public String toString(){
        return super.toString() + "\nDepartemen: " + departemen + "\nMata Kuliah Ajar:\n" + mataKuliah;
    }
}