package co.micol.prj;

public class CompareMax { // 전달 받은 두 수에서 큰 값을 리턴한다
	private int n;
	private int m;

	public CompareMax(int n, int m) { // 생성자
		this.n = n;
		this.m = m;
	}

	public int getMax() {
		int max=0; // 두 수가 같을 때는 0을 리턴한다
		if (n > m) {
			max = n;
		} else {
			max = m;
		}

		return max;
	}

}
