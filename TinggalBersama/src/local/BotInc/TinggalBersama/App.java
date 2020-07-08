package local.BotInc.TinggalBersama;

import local.BotInc.TinggalBersama.controller.ArrayController;
import local.BotInc.TinggalBersama.view.ViewMain;

public class App {
	public static void main(String[] args) {
		ArrayController.initData();
		new ViewMain();
	}
}
