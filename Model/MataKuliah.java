class MataKuliah{
	private String kode_matkul, sks, nama_matkul;
	
	public MataKuliah(String kode_matkul, String sks, String nama_matkul){
		this.kode_matkul = kode_matkul;
		this.sks = sks;
		this.nama_matkul = nama_matkul;
	}

    public String getKode_matkul() {
        return kode_matkul;
    }

    public String getSks() {
        return sks;
    }

    public String getNama_matkul() {
        return nama_matkul;
    } 

    @Override
    public String toString(){
        return "Kode Matkul: " + kode_matkul + ", SKS: " + sks + ", Nama Matkul: " + nama_matkul+"\n";
    }
}