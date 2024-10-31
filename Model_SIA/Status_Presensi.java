package Model_SIA;

public enum Status_Presensi{
	HADIR(1), ALPHA(0);

	private final int status;

	Status_Presensi(int status){
		this.status = status;
	}

	public int getStatus(){
        return status;
    }
}
