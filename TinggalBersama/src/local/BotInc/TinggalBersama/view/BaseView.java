package local.BotInc.TinggalBersama.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class BaseView {
	
	Scanner input = new Scanner(System.in);

	protected String brandName = "Tinggal Bersama Inc";
	
	abstract void show();
	
	
	public Integer getAnInteger() {
		while (true) {
			try {
				return input.nextInt();
			} catch (InputMismatchException e) {
				input.next();
				System.err.print("Try again: ");
			}
		}
	}
	
}
