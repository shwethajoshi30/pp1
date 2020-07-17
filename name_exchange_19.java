package mindtree;
import java.util.Scanner;
public class name_exchange_19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String firstName=a.substring(0,a.indexOf(" "));
        String lastName=a.substring(a.indexOf(" "));
		String firstName1=b.substring(0,b.indexOf(" "));
        String lastName1=b.substring(b.indexOf(" "));
        String swapName=firstName+" "+lastName1;
        String swapName2=firstName1+" "+lastName;
        System.out.println("After Swap");
        System.out.println(swapName);
        System.out.println(swapName2);
	}
}