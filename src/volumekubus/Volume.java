
package volumekubus;

import java.util.Scanner;

public class Volume {
    Scanner in = new Scanner(System.in);
    int sisi;
    int hasil;
    
    int sisii(){
        System.out.print("masukkan panjang sisi = ");
        sisi = in.nextInt();
        return sisi;
    }
    int hasill(){
        hasil = sisi*sisi*sisi;
        System.out.println("Volume kubus = "+hasil);
        return hasil;
    }
}
