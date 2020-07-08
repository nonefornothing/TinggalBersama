package local.BotInc.TinggalBersama.controller;

import local.BotInc.TinggalBersama.model.Juragan;
import local.BotInc.TinggalBersama.service.*;
import local.BotInc.TinggalBersama.view.ViewKostDanKontrakan;

public class KostanController extends BaseController implements Hitung,BuktiTransaksi{

	private String namaKost;
	private int jangkaWaktu;
	
	public KostanController(String namaKost,int jangkaWaktu) {
		this.namaKost = namaKost;
		this.jangkaWaktu = jangkaWaktu;
	}
	
	@Override
	Juragan getJuragan() {
		Juragan juragan = new Juragan();
		juragan.setNamaJuragan(ArrayController.listKost.get((ViewKostDanKontrakan.pilihanHunian)-1).getNamaJuragan());
		juragan.setNamaKost(ArrayController.listKost.get((ViewKostDanKontrakan.pilihanHunian)-1).getNamaKost());
		juragan.setAlamatKost(ArrayController.listKost.get((ViewKostDanKontrakan.pilihanHunian)-1).getAlamatKost());
		juragan.setNoHP(ArrayController.listKost.get((ViewKostDanKontrakan.pilihanHunian)-1).getNoHP());
		juragan.setHarga(ArrayController.listKost.get((ViewKostDanKontrakan.pilihanHunian)-1).getHarga());
		return juragan;
	}

	@Override
	Integer totalAmount() {
		return menghitung();
	}

	@Override
	String says() {
		return "\n=== Thanks ===";
	}
	@Override
	public int menghitung(){
		Juragan juragan = getJuragan();
		return jangkaWaktu*juragan.getHarga();
	}
	@Override
	public String cetakBukti() {
		Juragan juragan = getJuragan();
		StringBuilder sb = new StringBuilder();
		sb.append("\n=== Details ===");
		sb.append("\nNama Juragan : " + juragan.getNamaJuragan());
		sb.append("\nNama kostan : " + juragan.getNamaKost());
		sb.append("\nAlamat : " +juragan.getAlamatKost());
		sb.append("\nNo.HP : "+juragan.getNoHP());
		sb.append("\nHarga per bulan : Rp. "+juragan.getHarga());
		sb.append("\nTotal : Rp."+totalAmount());
		sb.append("\nNama penghuni : "+ namaKost);
		sb.append("\nLama hunian : "+jangkaWaktu + " bulan");
		//sb.append("\nIndex : "+ ((ViewKostDanKontrakan.pilihanHunian)-1));
		sb.append(says());
		ArrayController.listKost.remove((ViewKostDanKontrakan.pilihanHunian)-1);
		return sb.toString();
	} 

}
