package choi;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, j, min, gong;
		i = scanner.nextInt();
		j = scanner.nextInt();
		min = (i < j) ? i : j;
		gong = 0;
		for (int k = 1; k <= min; k++) {
			if (i % k == 0 && j % k == 0)
				gong = k;
		}
		System.out.println("�ִ����� : " + gong);
		System.out.println("�ּҰ���� : " + i * j / gong);

	}

}
