package deneme5;

import java.util.Iterator;
import java.util.Scanner;

public class deneme5 {

	public static void main(String[] args) {
	// MÜKEMMEL SAYI ÇARPANLARI TOPLAMI KENDÝNE EÞÝT OLAN SAYIDIR.
	// 6 ----------> 1,2,3
	// 28 ---------> 1,2,4,7,14
	Scanner scanner = new Scanner(System.in);
	System.out.println("Lütfen bir sayý giriniz:");
	int a = scanner.nextInt();
	int toplam = 0;
	
	for (int i = 1; i <a; i++) {
		if (a % i == 0) {
			toplam = toplam + i;
		}
	}
	if (toplam == a) {
		System.out.println("Bu bir mükemmel sayýdýr.");
	}
	else {
		System.out.println("Bu mükemmel sayý deðildir.");
	}

	}

}
