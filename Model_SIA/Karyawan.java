package Model_SIA;
import java.util.*;

public class Karyawan extends Staff{
	private double gaji;
	private List<PresensiStaff> presensiKaryawan = new ArrayList<>(Arrays.asList());

	public Karyawan(String nama, String alamat, String TTL, String noTelp, String NIK, double gaji){
		super(nama, alamat, TTL, noTelp, NIK);
		this.gaji = gaji;
	}

    public List<PresensiStaff> getpresensiKaryawan() {
		return presensiKaryawan;
	}

	public void setpresensiKaryawan(List<PresensiStaff> presensiKaryawan) {
		this.presensiKaryawan = presensiKaryawan;
	}

	public double getGaji() {
        return gaji;
    }

	@Override
    public String toString(){
        return super.toString() + "\nGaji: " + gaji + "\nPresensi Staff: " + presensiKaryawan;
    }
}