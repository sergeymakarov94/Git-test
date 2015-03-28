package ru.element.collections;

import java.util.ArrayList;
import java.util.Random;

public class MainClass {
	public static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
	public static Random r = new Random();

	/* 2 public static Mobile[] mobiles = new Mobile[3]; 2 */

	/*
	 * 1 public static String[][] mobiles = { { "Sergei", "89602029195" }, {
	 * "Azik", "896020264123" }, { "Yura", "89602020012" }, }; 1
	 */

	public static void main(String[] args) {

		for (int i = 0; i < 300; i++) {
			mobiles.add(new Mobile(r.nextInt(99999999), "IPhone"));
		}
		for (Mobile m : mobiles) {
			System.out.println(m.getNumber() + " " + m.getName());
		}
		/*
		 * 2 mobiles[0] = new Mobile(89602029, "Sergei"); mobiles[1] = new
		 * Mobile(89602026, "Azik"); mobiles[2] = new Mobile(89602020, "Yura");
		 * 
		 * for (Mobile m: mobiles) { System.out.println(m.getNumber()
		 * +" "+m.getName()); } 2
		 */
		/*
		 * 1 for(int row=0; row<mobiles.length;row++) { for(int
		 * coll=0;coll<mobiles[row].length;coll++) {
		 * System.out.println(mobiles[row][coll]+ " "); try { Thread.sleep(500);
		 * } catch (InterruptedException e) { } } }System.out.println(""); 1
		 */
	}
}
