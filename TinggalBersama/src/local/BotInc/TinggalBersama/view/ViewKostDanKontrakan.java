package local.BotInc.TinggalBersama.view;

import java.util.Scanner;

import local.BotInc.TinggalBersama.controller.*;


public class ViewKostDanKontrakan extends BaseView {

	public int pilihanJenisBangunan;
	public static int pilihanHunian;

	public ViewKostDanKontrakan(int pilihanJenisBangunan) {
		this.pilihanJenisBangunan = pilihanJenisBangunan;
		show();
	}


	@Override
	public void show() {
		System.out.println("==== Welcome to TinggalBersama by " + super.brandName + " ====");
		Scanner input = new Scanner(System.in);
		System.out.print("Input your name : ");
		String nameCustomer = input.nextLine();
		System.out.print("Input duration of rent : ");
		int durationRent = getAnInteger();

		System.out.println("Checking Database ....");
		System.out.println("Information Found");
		
		

		// tampilkan database dari enum menurut variabel jenis
		if (pilihanJenisBangunan == 1) {
			ArrayController.tampilkanKostan();
			System.out.println("Pilihan Hunian yang mau diambil :");
			pilihanHunian = getAnInteger();
			KostanController kostanController = new KostanController(nameCustomer,durationRent);
			System.out.println(kostanController.cetakBukti());
			//tampilkan database untuk kosts
			
		} else if (pilihanJenisBangunan == 2) {
			ArrayController.tampilkanKontrakan();
			System.out.println("Pilihan Hunian yang mau diambil :");
			pilihanHunian = getAnInteger();
			KontrakanController kontrakanController = new KontrakanController(nameCustomer,durationRent);
			System.out.println(kontrakanController.cetakBukti());
			//tampilkan database untuk Kontrakan
		}

		System.out.println();
		System.out.print("Repeat [y or n] : ");
		String repeat = input.nextLine();
		if ("y".equalsIgnoreCase(repeat)) {
			System.out.println();
			show();
		} else {
			System.out.println();
			new ViewMain();
		}
	}
}

