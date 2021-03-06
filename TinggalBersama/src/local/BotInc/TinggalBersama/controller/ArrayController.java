package local.BotInc.TinggalBersama.controller;

import java.util.ArrayList;

import local.BotInc.TinggalBersama.model.Juragan;

public class ArrayController {

	static ArrayList<Juragan> listKost = new ArrayList<>();
	static ArrayList<Juragan> listKontrakan = new ArrayList<>();

	public static void initData() {

		Juragan j1 = new Juragan("Desi", "Sejahtera Kost", "Jl. Merdeka no 22 Jakarta Pusat", "0895672414124", 450000);
		Juragan j2 = new Juragan("Mia", "Makmur Kost", "Jl. Karya no 22 Jakarta Pusat", "08956724231312", 650000);
		Juragan j3 = new Juragan("Rossa", "Shanglia Kost", "Jl. Nusa no 22 Jakarta Pusat", "08956724112141", 350000);
		Juragan j4 = new Juragan("Dewi", "Mali Kost", "Jl. Data no 22 Jakarta Pusat", "089567241124141", 400000);
		Juragan j5 = new Juragan("Malia", "Sudan Kost", "Jl. Anggrek no 22 Jakarta Pusat", "08956721241241", 420000);
		Juragan j6 = new Juragan("Imran", "UK Kost", "Jl. Mangkuk no 22 Jakarta Pusat", "0895672414124121", 750000);
		Juragan j7 = new Juragan("Lucy", "France Kost", "Jl. Sendok no 22 Jakarta Pusat", "08956724124141", 1450000);
		Juragan j8 = new Juragan("Marco", "Lounge Kost", "Jl. Buku no 22 Jakarta Pusat", "089567241412311", 420000);
		Juragan j9 = new Juragan("Ayu", "Console Kost", "Jl. Pulpen no 22 Jakarta Pusat", "08956724153223", 455000);
		Juragan j10 = new Juragan("Mamat", "Mouse Kost", "Jl. Petronas no 22 Jakarta Pusat", "08956724123131", 850000);

		listKost.add(j1);
		listKost.add(j2);
		listKost.add(j3);
		listKost.add(j4);
		listKost.add(j5);
		listKost.add(j6);
		listKost.add(j7);
		listKost.add(j8);
		listKost.add(j9);
		listKost.add(j10);

		Juragan k1 = new Juragan("Desi", "Kontrakan Sejahtera ", "Jl. Merdeka no 22 Jakarta Pusat", "0895672414124",
				1450000);
		Juragan k2 = new Juragan("Mia", "Kontrakan Makmur ", "Jl. Karya no 22 Jakarta Pusat", "08956724231312",
				1650000);
		Juragan k3 = new Juragan("Rossa", "Kontrakan Shanglia", "Jl. Nusa no 22 Jakarta Pusat", "08956724112141",
				1350000);
		Juragan k4 = new Juragan("Dewi", "Kontrakan Mali", "Jl. Data no 22 Jakarta Pusat", "089567241124141", 1400000);
		Juragan k5 = new Juragan("Malia", "Kontrakan Sudan", "Jl. Anggrek no 22 Jakarta Pusat", "08956721241241",
				1420000);
		Juragan k6 = new Juragan("Imran", "Kontrakan UK", "Jl. Mangkuk no 22 Jakarta Pusat", "0895672414124121",
				1750000);
		Juragan k7 = new Juragan("Lucy", "Kontrakan France", "Jl. Sendok no 22 Jakarta Pusat", "08956724124141",
				1450000);
		Juragan k8 = new Juragan("Marco", "Kontrakan Lounge", "Jl. Buku no 22 Jakarta Pusat", "089567241412311",
				1420000);
		Juragan k9 = new Juragan("Ayu", "Kontrakan Console", "Jl. Pulpen no 22 Jakarta Pusat", "08956724153223",
				1455000);
		Juragan k10 = new Juragan("Mamat", "Kontrakan Mouse", "Jl. Petronas no 22 Jakarta Pusat", "08956724123131",
				1850000);
		listKontrakan.add(k1);
		listKontrakan.add(k2);
		listKontrakan.add(k3);
		listKontrakan.add(k4);
		listKontrakan.add(k5);
		listKontrakan.add(k6);
		listKontrakan.add(k7);
		listKontrakan.add(k8);
		listKontrakan.add(k9);
		listKontrakan.add(k10);
	}


	
	public static void tampilkanKostan() {
		for (int i = 0; i < listKost.size(); i++) {
			System.out.println("No." + (i + 1));
			System.out.println("Nama Juragan = " + listKost.get(i).getNamaJuragan());
			System.out.println("Nama Kostan = " + listKost.get(i).getNamaKost());
			System.out.println("Alamat Kostan = " + listKost.get(i).getAlamatKost());
			System.out.println("Harga kostan = " + listKost.get(i).getHarga());
			System.out.println("Nomor HP = " + listKost.get(i).getNoHP());
			System.out.println("");
		}
	}

	public static void tampilkanKontrakan() {
		for (int i = 0; i < listKontrakan.size(); i++) {
			System.out.println("No." + (i + 1));
			System.out.println("Nama Juragan = " + listKontrakan.get(i).getNamaJuragan());
			System.out.println("Nama Kostan = " + listKontrakan.get(i).getNamaKost());
			System.out.println("Alamat Kostan = " + listKontrakan.get(i).getAlamatKost());
			System.out.println("Harga kostan = " + listKontrakan.get(i).getHarga());
			System.out.println("Nomor HP = " + listKontrakan.get(i).getNoHP());
			System.out.println("");
		}
	}
}
