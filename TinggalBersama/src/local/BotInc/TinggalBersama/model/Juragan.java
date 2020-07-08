package local.BotInc.TinggalBersama.model;

public class Juragan {
	private String namaJuragan,namaKost,alamatKost,noHp;
	private int harga;
	
	public Juragan() {
		
	}
	
	public Juragan(String namaJuragan,String namaKost,String alamatKost,String noHp,int harga) {
		this.namaJuragan = namaJuragan;
		this.namaKost = namaKost;
		this.alamatKost = alamatKost;
		this.noHp = noHp;
		this.harga = harga;
	}
	
	public void setNamaJuragan(String namaJuragan) {
		this.namaJuragan = namaJuragan;
	}
	
	public void setNamaKost(String namaKost) {
		this.namaKost = namaKost;
	}
	
	public void setAlamatKost(String alamatKost) {
		this.alamatKost = alamatKost;
	}

	public void setNoHP(String noHp) {
		this.noHp = noHp;
	}
	
	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	public String getNamaJuragan() {
		return namaJuragan;
	}
	
	public String getNamaKost() {
		return namaKost;
	}
	
	public String getAlamatKost() {
		return alamatKost;
	}
	
	public String getNoHP() {
		return noHp;
	}
	
	public int getHarga() {
		return harga;
	}

}
