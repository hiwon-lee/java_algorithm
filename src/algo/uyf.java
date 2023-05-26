package algo;
import java.util.*;

public class uyf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];	
		
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i-1]);
			
		}
		
		System.out.print("검색할 값: "); //키값을 입력받음
		int ky = sc.nextInt();
		
		int idx = binSearch(x, num, ky); //배열x에서 값이 ky인 요소를 검색
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println("그 값은 x[" + idx +"]에 있습니다.");

	}
	
	//이진 검색 알고리즘 프로그램은 검색하라 키값과 같은 값을 갖는 요소가 하나 이상일 경우 그 요소 중 에서 맨 앞의 요소를 찾지 못함 
	//이를 개선해라
	static int binSearchX(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) { //중간값이랑 키값이 같으면
				//todo : 이전의 인덱스에 같은 키가 있는지를 확인
				int i = pc;
				while (a[i] == key) {
					i--;
				}
				return i;
			}
				
			else if (a[pc] < key) {
				pl = pc + 1;
			}
			else {
				pr = pc - 1;
			}
				
			
					
		} while (pl <= pr);
	}
	
	//요소수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고, 일치하는 요소수를 반환하는 메서드
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0; //메서드 전역으로 해야지!!
		for (int i = 0; i < n; i++) {
			if (a[i] == key)
				idx[count++] = i; 
		}
		return idx.length+1; //or count를 return해도 무방하다.
	}
	
	static int binSearch(int[] a, int n, int key ) {
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2; //O(log n)
			if (a[pc] == key) ////O(log n)
				return pc;
			else if (a[pc] < key) //겁색할 값이 더 크면
				pl = pc + 1; //큰 쪽을 검색 범위로 한정할거야
			else
				pr = pc - 1; //작으면 작은 쪽을 검색 범위로 한정할거야
		} while (pl <= pr);
		
		return -1;
	}
	



}
