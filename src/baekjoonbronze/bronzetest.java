package baekjoonbronze;
import java.math.BigInteger;
import java.util.*;

public class bronzetest {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int p = sc.nextInt();
				int k = sc.nextInt();
				
				for(int i = 2; i<=k; i++) {
					if( p%i != 0) { //���� �������� 0�� �ƴϸ�
						System.out.println(p/i);
						continue;
					} else { //�������� 0�̸�
						int num1 = i;
						int num2 = p/i;
						//System.out.println(num1);
						//System.out.println(num2);
					}
					
				}
				
				//BigInteger n,m;
				//n = sc.nextBigInteger();
				//m = sc.nextBigInteger();
				//System.out.println(n/m);
				//System.out.println(n%m);
				
		
	}
}
