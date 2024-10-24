public class Dosen_Honorer extends Dosen{
	private double honorerPerSKS;
	
	public Dosen_Honorer(String nama, String alamat, String TTL, String noTelp, String NIK, String departemen, double honorerPerSKS){
		super(nama, alamat, TTL, noTelp, NIK, departemen);
		this.honorerPerSKS = honorerPerSKS;
	}

    public double getHonorerPerSKS() {
        return honorerPerSKS;
    }

	public void setHonorerPerSKS(double honorerPerSKS) {
		this.honorerPerSKS = honorerPerSKS;
	}

	@Override
    public String toString(){
        return super.toString() + "\nHonorer per SKS: " + honorerPerSKS+"\n";
    }
}