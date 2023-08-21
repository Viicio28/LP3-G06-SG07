package trabajo;
import java.util.Scanner;
public class PyLab01 {

	public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do {
            vida++;
            System.out.println("Vida:" + vida + "\tCual es el numero secreto?");
            rp = sc.nextInt();
            if (rp == 1234) {
                fl = true;
            }
        } while(vida < 3 && !fl);
        if (fl == true) {
            System.out.println("LO LOGRASTE!! ");
        }
        else {
            System.out.println("NO LO LOGRASTE :C");
        }
    }
    
}