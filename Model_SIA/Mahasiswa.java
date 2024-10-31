package Model_SIA;

public class Mahasiswa extends User{
	private String NIM, jurusan;
    private double rata2;
	
    public Mahasiswa(String nama, String alamat, String TTL, String noTelp, String NIM, String jurusan){
        super(nama, alamat, TTL, noTelp);
		this.NIM = NIM;
		this.jurusan = jurusan;
	}
    public String getNIM() {
        return NIM;
    }
    
    public String getJurusan() {
        return jurusan;
    }
    public void setNIM(String nIM) {
        NIM = nIM;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public double getRata2() {
        return rata2;
    }
    public void setRata2(double rata2) {
        this.rata2 = rata2;
    }
    @Override
    public String toString(){
        return super.toString() + "NIM: " + NIM + "\nJurusan: " + jurusan+"\n";
    }
}