package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );		
		System.out.print("Ten SV: ");
		String ten = sc.nextLine(); 
		System.out.print("Ma SV: ");		
		int id = sc.nextInt();
		System.out.print("So CMND: ");
		int cmnd = sc.nextInt();
		System.out.print("Ten lop: ");
		String lop = sc.next();
		System.out.print("Ten truong: ");
		String truong = sc.next();
		System.out.print("Diem trung binh: ");
		Float dtb = sc.nextFloat();	
	}

}
