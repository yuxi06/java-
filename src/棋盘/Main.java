package 棋盘;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		int x=input.nextInt();
		int y=input.nextInt();
	        int[][] pos = new int[m][n];/* 位置 */
	        int count = 0;
	        int r = 0, c = 0;/* r:行下标 c:列下标 pos[r][c]对应以上位置 */
	        /* 赋值方向，先向右c++，再向下r++，再向左c--，再向上r-- */
	        final int up = 1;
	        final int down = -1;
	        final int left = 2;
	        final int right = -2;
	        int dir = right;/* 开始方向 */
	        int cir = 1;/* 第几圈赋值 */
	        while (count < m * n) {
	            count++;
	            pos[r][c] = count;/* 赋值 */
	            switch (dir) {
	            case right:
	                if (c < n - cir) {/* 当前行右方还有没赋值的 */
	                    c++;
	                } else {
	                    dir = down;
	                    r++;
	                }
	                break;
	            case down:
	                if (r < m - cir) {/* 当前列下方还有没赋值的 */
	                    r++;
	                } else {
	                    dir = left;
	                    c--;
	                }
	                break;
	            case left:
	                if (c > cir - 1) {/* 当前行左边还有没赋值的 */
	                    c--;
	                } else {
	                    dir = up;
	                    r--;
	                }
	                break;
	            case up:
	                if (r > cir) {/* 当前列上边边还有没赋值的 */
	                    r--;
	                } else {
	                    cir++;/* 赋值了一圈 */
	                    dir = right;
	                    c++;
	                }
	                break;
	            }
	        }
	        System.out.println(pos[x-1][y-1]);
	}

}
