abstract public class User{
	private String nama, alamat, TTL, noTelp;

	public User(String nama, String alamat, String TTL, String noTelp){
		this.nama = nama;
		this.alamat = alamat;
		this.TTL = TTL;
		this.noTelp = noTelp;
	}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }	

    @Override
    public String toString(){
        return "Nama: " + nama + "\nAlamat: " + alamat + "\nTTL: " + TTL + "\nNo. Telp: " + noTelp + "\n";
    }

}




