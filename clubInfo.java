import java.io.*;

public class clubInfo {
	public static void main(String[] args) throws IOException, InterruptedException{
		DataInputStream input = new DataInputStream(System.in);
		
		System.out.print("Please type your name: ");
		String name = input.readLine();
		
		Thread.sleep(250);
		System.out.println();
		System.out.println("Thank you for your interest, " + name + "!");
		Thread.sleep(1000);
		System.out.println("Starting in fall 2017, Central will be starting a programming club!");
		
		Thread.sleep(2500);
		System.out.println();
		System.out.println("Club activities will include:");
		Thread.sleep(2500);
		System.out.println("\t\u2022 learning more about programming");
		Thread.sleep(1000);
		System.out.println("\t\u2022 practicing for and competing in contests");
		Thread.sleep(1000);
		System.out.println("\t\u2022 taking on projects");
		Thread.sleep(1000);
		System.out.println("\t\u2022 solving programs");
		Thread.sleep(1000);
		System.out.println("\t\u2022 class help");
		
		Thread.sleep(2500);
		System.out.println();
		System.out.println("Keep a look out for our website coming next school year,");
		Thread.sleep(1000);
		System.out.println("And in the mean time, join our group at dmoj.ca.");
		System.out.println("(After creating an account at dmoj, join the London Central SS Organization)");
		
		Thread.sleep(2500);
		System.out.println();
		System.out.println("We look forward to seeing you next year, " + name + "!");
		
		Thread.sleep(2500);
		System.out.println();
		System.out.println("Sincerely,");
		Thread.sleep(1000);
		System.out.println("Amy, Fay, Angela, and Ashley.");
	}
}