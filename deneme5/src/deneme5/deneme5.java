package deneme5;

import java.util.Iterator;
import java.util.Scanner;

public class deneme5 {

	public static void main(String[] args) {
	// M�KEMMEL SAYI �ARPANLARI TOPLAMI KEND�NE E��T OLAN SAYIDIR.
	// 6 ----------> 1,2,3
	// 28 ---------> 1,2,4,7,14
	Scanner scanner = new Scanner(System.in);
	System.out.println("L�tfen bir say� giriniz:");
	int a = scanner.nextInt();
	int toplam = 0;
	
	for (int i = 1; i <a; i++) {
		if (a % i == 0) {
			toplam = toplam + i;
		}
	}
	if (toplam == a) {
		System.out.println("Bu bir m�kemmel say�d�r.");
	}
	else {
		System.out.println("Bu m�kemmel say� de�ildir.");
	}

	}

}
