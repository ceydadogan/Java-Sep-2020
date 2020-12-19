/*----------------------------------------------------------------------------------------------------------------------
	ArrayUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util;

public class ArrayUtil {
    public static void display(char sep, char end, int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d%c", a[i], sep);

        System.out.print(end);
    }

    public static void display(int [] a)
    {
        display(' ', '\n', a);
    }
}
