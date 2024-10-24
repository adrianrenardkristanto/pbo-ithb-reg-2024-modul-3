import java.util.*;

public class Karyawan extends Staff{
	private double gaji;
	private List<PresensiStaff> staffs = new ArrayList<>(Arrays.asList());

	public Karyawan(String nama, String alamat, String TTL, String noTelp, String NIK, double gaji){
		super(nama, alamat, TTL, noTelp, NIK);
		this.gaji = gaji;
	}

    public List<PresensiStaff> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<PresensiStaff> staffs) {
		this.staffs = staffs;
	}

	public double getGaji() {
        return gaji;
    }

	@Override
    public String toString(){
        return super.toString() + "\nGaji: " + gaji + "\nPresensi Staff: " + staffs;
    }
}