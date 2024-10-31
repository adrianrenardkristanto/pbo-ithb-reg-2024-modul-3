package Model_SIA;

import java.time.LocalDate;

public class Presensi {
	private LocalDate tanggal_presensi = LocalDate.now(); 
	private Status_Presensi status; 

	
	public Presensi(LocalDate tanggal_presensi, Status_Presensi status){
		this.status = status;
		this.tanggal_presensi = tanggal_presensi;
	}
	
	public LocalDate getTanggalPresensi() {
		return tanggal_presensi;
	}
	public Status_Presensi getStatus() {
		return status;
	}
	public void setTanggal_presensi(LocalDate tanggal_presensi) {
		this.tanggal_presensi = tanggal_presensi;
	}
	
	public void setStatus(Status_Presensi status) {
		this.status = status;
	}

	@Override
    public String toString(){
        return "Tanggal: " + tanggal_presensi + ", Status: " + status;
    }
}