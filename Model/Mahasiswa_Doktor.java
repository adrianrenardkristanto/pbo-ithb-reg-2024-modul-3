public class Mahasiswa_Doktor extends Mahasiswa{
    private String judulPenelitianDisertasi;
    private double n1, n2, n3;
    
	public Mahasiswa_Doktor(String nama, String alamat, String TTL, String noTelp, String NIM, String jurusan, String judulPenelitianDisertasi,  double n1, double n2, double n3){
        super(nama, alamat, TTL, noTelp, NIM, jurusan);
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getN3() {
        return n3;
    }

    @Override
    public String toString(){
        return super.toString() + "Judul Penelitian Disertasi: " + judulPenelitianDisertasi +
               "\nNilai: [" + n1 + ", " + n2 + ", " + n3 + "]\n";
    }
}