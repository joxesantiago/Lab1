package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Request {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int request = sc.nextInt();
			
			if(request==1) {
				a.add(sc.nextInt());
				System.out.println(a);
			}
			else if(request==2) {
				int removeInteger = sc.nextInt();
				for (int j = 0; j < a.size(); j++) {
					if(a.get(j)==removeInteger) {
						a.remove(j);
						j=j-1;
					}
				}
				
				System.out.println(a);
			}
			else if(request==3) {
				System.out.println(a.size());
			}
		}
		
		sc.close();
	}

}
