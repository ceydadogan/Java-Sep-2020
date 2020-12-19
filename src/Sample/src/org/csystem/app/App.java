/*----------------------------------------------------------------------------------------------------------------------
    ArrayUtil sınıfının display metotları
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.ArrayUtil;

class App {
    public static void main(String [] args)
    {
        int [] a = {1, 2, 3, 4, 5, 6};

        ArrayUtil.display('\t', '\n', a);
        System.out.println("Merhaba");
    }
}
