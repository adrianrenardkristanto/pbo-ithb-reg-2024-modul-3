package Model_SIA;

public class MataKuliah_Pilihan extends MataKuliah{
	private int jumlah_Min_Mahasiswa;
	
	public MataKuliah_Pilihan(String kode_matkul, String sks, String nama_matkul, int jumlah_Min_Mahasiswa){
		super(kode_matkul, sks, nama_matkul);
		this.jumlah_Min_Mahasiswa = jumlah_Min_Mahasiswa;
	}

    public int getJumlah_Min_Mahasiswa() {
        return jumlah_Min_Mahasiswa;
    }

    public void setJumlah_Min_Mahasiswa(int jumlah_Min_Mahasiswa) {
        this.jumlah_Min_Mahasiswa = jumlah_Min_Mahasiswa;
    } 
    @Override
    public String toString(){
        return super.toString() + ", Jumlah Minimum Mahasiswa: " + jumlah_Min_Mahasiswa+"\n";
    }
}