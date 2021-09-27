package co.micol.prj.member;

import java.util.Scanner;

public class ForTest {
	Scanner sc = new Scanner(System.in);

	private int n;
	private int m;

	private void testPrint() {
		System.out.print("첫번째 수:");
		int n = sc.nextInt();
		System.out.print("두번째 수:");
		int m = sc.nextInt();
		int sum =0;
		for(int i=n; i<=m;i++) {
			sum+=i;
		}
		System.out.printf("%d에서 %d의 합:%d ",n,m, sum);
	}

	public void run() {
		testPrint();
	}

}
