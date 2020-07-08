package local.BotInc.TinggalBersama.view;

import java.util.Scanner;

public class ViewMain extends BaseView {	
	
	public int pilihanJenisBangunan;

	public ViewMain() {
		show();
	}
	@Override
	public void show() {
		System.out.println("\n==== Tingal Bersama App ====");
		System.out.println("\n==== Pilih Hunian yang akan dicari ====");
		System.out.println("1. Kost ");
		System.out.println("2. Kontrakan ");
		System.out.println("3. Exit");

		Scanner input = new Scanner(System.in);
		System.out.print("Select menus [1-3] : ");
		int pil = getAnInteger();
		if (pil == 1) {
			pilihanJenisBangunan = 1;
			new ViewKostDanKontrakan(pilihanJenisBangunan);
		}
		else if (pil == 2) {
			pilihanJenisBangunan = 2;
			new ViewKostDanKontrakan(pilihanJenisBangunan);
		}
		else if(pil == 3) {
			System.exit(0);
		}
		else {
			System.err.println("Inputan salah");
		}
		
		input.close();
		
	}
}

