import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
        
public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		// GCD (Greatest Common Divisor)
		
		int gcd = gcd(a,b);
		
		// LCM (Least Common Multiple)
		
		int lcm = (a*b) / gcd;
	
		System.out.println(gcd + "\n" + lcm);
		
	}
	
	public static int gcd(int a, int b) {
		
		if (b == 0) return a;
		return gcd (b, a%b);
	
	}
	
}