import java.util.Scanner;
import java.lang.String;

class text{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.trim();
		str = str.strip();
		if (str.isEmpty()) {
			System.out.println("EMPTY_STRING");
			return;
		}
		if(str.equals("admin") || str.equalsIgnoreCase("admin")) {
			System.out.println("RESERVED_WORD");
			return;
		}
		String result = str.replace("_", " ");
        String lower = result.toLowerCase();
        if (str.startsWith("temp") && (str.endsWith("user"))) {
            result = result.concat("_FLAGGED");
        }
        System.out.println(result);
	}
}