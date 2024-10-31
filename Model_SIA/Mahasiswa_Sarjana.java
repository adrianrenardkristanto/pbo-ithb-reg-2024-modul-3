package Model_SIA;

import java.util.*;

public class Mahasiswa_Sarjana extends Mahasiswa{
	private List<MatkulAmbil> mataKuliah = new ArrayList<>(Arrays.asList());
	
	public Mahasiswa_Sarjana(String nama, String alamat, String TTL, String noTelp, String NIM, String jurusan, List<MatkulAmbil> mataKuliah) {
		super(nama, alamat, TTL, noTelp, NIM, jurusan);
		this.mataKuliah = mataKuliah;
	}

	public List<MatkulAmbil> getMataKuliah() {
		return mataKuliah;
	}

	@Override
    public String toString(){
        return super.toString() + mataKuliah+"\n";
    }
}