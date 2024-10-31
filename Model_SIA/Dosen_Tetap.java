package Model_SIA;

public class Dosen_Tetap extends Dosen{
	private double gaji;

	public Dosen_Tetap(String nama, String alamat, String TTL, String noTelp, String NIK, String departemen, double gaji){
		super(nama, alamat, TTL, noTelp, NIK, departemen);
		this.gaji = gaji;
	}

    public double getGaji() {
        return gaji;
    }

	public void setGaji(double gaji) {
		this.gaji = gaji;
	}

	@Override
    public String toString(){
        return super.toString() + "\nGaji: " + gaji+"\n";
    }
}