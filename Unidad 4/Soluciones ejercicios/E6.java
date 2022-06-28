import java.util.Scanner;
public class E6 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String line;
        while(true) {
            line = cin.nextLine();
            if(line.equals("0 0"))
                break;
            
	    int blk = line.indexOf(" ");

            int num_c = 0, c = 0, i = blk - 1, j = line.length() - 1;
	    while(i>=0 || j>blk) {
		int n1 = (i >= 0) ? line.charAt(i) - '0' : 0;
		int n2 = (j > blk) ? line.charAt(j) - '0' : 0;
                if((c + n1 + n2) > 9) {
                    ++num_c;
                    c = 1;
                }
                else
                    c = 0;
		--i;
		--j;
		if(c==0 && (i<0 || j==blk))
		    break;
	    }

            System.out.println(num_c);
        }
    }
}
