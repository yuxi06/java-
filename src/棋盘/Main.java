package ����;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		int x=input.nextInt();
		int y=input.nextInt();
	        int[][] pos = new int[m][n];/* λ�� */
	        int count = 0;
	        int r = 0, c = 0;/* r:���±� c:���±� pos[r][c]��Ӧ����λ�� */
	        /* ��ֵ����������c++��������r++��������c--��������r-- */
	        final int up = 1;
	        final int down = -1;
	        final int left = 2;
	        final int right = -2;
	        int dir = right;/* ��ʼ���� */
	        int cir = 1;/* �ڼ�Ȧ��ֵ */
	        while (count < m * n) {
	            count++;
	            pos[r][c] = count;/* ��ֵ */
	            switch (dir) {
	            case right:
	                if (c < n - cir) {/* ��ǰ���ҷ�����û��ֵ�� */
	                    c++;
	                } else {
	                    dir = down;
	                    r++;
	                }
	                break;
	            case down:
	                if (r < m - cir) {/* ��ǰ���·�����û��ֵ�� */
	                    r++;
	                } else {
	                    dir = left;
	                    c--;
	                }
	                break;
	            case left:
	                if (c > cir - 1) {/* ��ǰ����߻���û��ֵ�� */
	                    c--;
	                } else {
	                    dir = up;
	                    r--;
	                }
	                break;
	            case up:
	                if (r > cir) {/* ��ǰ���ϱ߱߻���û��ֵ�� */
	                    r--;
	                } else {
	                    cir++;/* ��ֵ��һȦ */
	                    dir = right;
	                    c++;
	                }
	                break;
	            }
	        }
	        System.out.println(pos[x-1][y-1]);
	}

}
