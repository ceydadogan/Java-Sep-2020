/*----------------------------------------------------------------------------------------------------------------------	
	Yıldızlı import static bildiriminin genel biçimi:
	import static <paket ismi>[.aly paket isimleri].<tür ismi>.*;
	
	Bu bildirim ile bildirimin yapıldığı java dosyasında bildirime ilişkin tüm static elemanlara doğrudan kullanılabilir
	duruma gelir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import static org.csystem.util.NumberUtil.*;
import static java.lang.Math.*;

class App {	
	public static void main(String [] args) 
	{
		Random r = new Random();
		
		for (int i = 0; i < 10; ++i) {
			int val = r.nextInt(100);
			
			System.out.printf("%d sayısı %s%n", val, isPrime(val) ? "asaldır" : "asal değildir");
			
			System.out.printf("sqrt(%d)=%f%n", val, sqrt(val));
				
		}
			
	}	
}