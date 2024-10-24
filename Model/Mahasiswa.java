public class Mahasiswa extends User{
	private String NIM, jurusan;
	
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

    @Override
    public String toString(){
        return super.toString() + "NIM: " + NIM + "\nJurusan: " + jurusan+"\n";
    }
}