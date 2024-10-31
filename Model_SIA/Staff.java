package Model_SIA;

public class Staff extends User{
    private String NIK;

	public Staff(String nama, String alamat, String TTL, String noTelp, String NIK){
		super(nama, alamat, TTL, noTelp);
		this.NIK = NIK;
	}

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String nIK) {
        NIK = nIK;
    }

    @Override
    public String toString(){
        return super.toString() + "NIK: " + NIK ;
    }
}
