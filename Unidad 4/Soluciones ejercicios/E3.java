/** 
 * R441 - Contar hasta el final
 * */

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        final String EOF = "0";

        Scanner cin = new Scanner(System.in);
        
        while(true) {
            String input = cin.nextLine().trim();
            if(input.equals(EOF)) 
                break;
            
            String snum = "";
            int c = 1;
            
            for(int d, suma, i=input.length()-1; i>=0; i--) {
                char ch = input.charAt(i);
                if(ch == '.')
                    snum = '.' + snum;
                else {
                    d = input.charAt(i) - '0';
                    if(c == 1) {
                        suma = d + c;
                        d = suma % 10;
                        c = suma / 10;
                    }
                    snum = d + snum;
                }
            }
            
            if(c == 1) 
                snum = (((snum.length() + 1) % 4 == 0) ? "1." : "1") + snum;

            System.out.println(snum);
        }
    }
}
