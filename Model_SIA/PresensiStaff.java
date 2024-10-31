package Model_SIA;

import java.time.LocalDate;

public class PresensiStaff extends Presensi{
	private double jam_presensi;

	public PresensiStaff(LocalDate tanggal_presensi, Status_Presensi status, double jam_presensi){
        super(tanggal_presensi, status);
		this.jam_presensi = jam_presensi;
	}

    public double getJamPresensi() {
        return jam_presensi;
    }

    @Override
    public String toString(){
        return super.toString() + ", Jam Presensi: " + jam_presensi;
    }
}	
