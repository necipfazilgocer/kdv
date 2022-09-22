package kdv;
import java.util.Scanner;
public class kdv {

	public static void main(String[] args) {
	float kdvsiz;
	float kdvli;
	float kdv;
	System.out.println ("Ürünün vergisiz fiyatını giriniz.");
	Scanner scanner=new Scanner(System.in);
	kdvsiz=scanner.nextFloat();
	kdv=(kdvsiz*18)/100;
	kdvli=kdvsiz+kdv;
	System.out.println("KDV fiyatı= "+kdv);
	System.out.println("KDVli fiyatı= "+kdvli);
	System.out.println("KDVsiz fiyatı= "+kdvsiz);

	}

}
