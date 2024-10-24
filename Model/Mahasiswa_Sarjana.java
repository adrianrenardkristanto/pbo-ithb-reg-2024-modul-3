import java.util.*;

public class Mahasiswa_Sarjana extends Mahasiswa{
	private final List<MatkulAmbil> mataKuliah = new ArrayList<>(Arrays.asList());
	
	public Mahasiswa_Sarjana(String nama, String alamat, String TTL, String noTelp, String NIM, String jurusan){
		super(nama, alamat, TTL, noTelp, NIM, jurusan);
	}

	public List<MatkulAmbil> getMataKuliah() {
		return mataKuliah;
	}

	@Override
    public String toString(){
        return super.toString() + mataKuliah+"\n";
    }
}