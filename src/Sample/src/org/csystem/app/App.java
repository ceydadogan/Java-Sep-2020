/*----------------------------------------------------------------------------------------------------------------------
    [] operatörüne pozitfi ya da negatif bakımdan sınırlar ([0, length)) dışında bir index numarası verildiğinde
    exception oluşur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        int [] a;

        a = new int[n];

        for (int i = 0; i < a.length; ++i)
            a[i] = i + 1;

        //...

        System.out.println(a[10]);
    }
}
