package algo;
import java.util.*;

public class uyf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
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
		
		System.out.print("�˻��� ��: "); //Ű���� �Է¹���
		int ky = sc.nextInt();
		
		int idx = binSearch(x, num, ky); //�迭x���� ���� ky�� ��Ҹ� �˻�
		
		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println("�� ���� x[" + idx +"]�� �ֽ��ϴ�.");

	}
	
	//���� �˻� �˰��� ���α׷��� �˻��϶� Ű���� ���� ���� ���� ��Ұ� �ϳ� �̻��� ��� �� ��� �� ���� �� ���� ��Ҹ� ã�� ���� 
	//�̸� �����ض�
	static int binSearchX(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) { //�߰����̶� Ű���� ������
				//todo : ������ �ε����� ���� Ű�� �ִ����� Ȯ��
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
	
	//��Ҽ��� n�� �迭 a���� key�� ��ġ�ϴ� ��� ����� �ε����� �迭 idx�� �� �պ��� ������� �����ϰ�, ��ġ�ϴ� ��Ҽ��� ��ȯ�ϴ� �޼���
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0; //�޼��� �������� �ؾ���!!
		for (int i = 0; i < n; i++) {
			if (a[i] == key)
				idx[count++] = i; 
		}
		return idx.length+1; //or count�� return�ص� �����ϴ�.
	}
	
	static int binSearch(int[] a, int n, int key ) {
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2; //O(log n)
			if (a[pc] == key) ////O(log n)
				return pc;
			else if (a[pc] < key) //�̻��� ���� �� ũ��
				pl = pc + 1; //ū ���� �˻� ������ �����Ұž�
			else
				pr = pc - 1; //������ ���� ���� �˻� ������ �����Ұž�
		} while (pl <= pr);
		
		return -1;
	}
	



}
