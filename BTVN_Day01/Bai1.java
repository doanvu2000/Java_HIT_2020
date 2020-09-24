
public class Bai1 {
	public static void main(String[] args) {
		int m = 6, n = 11;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == m) {// Hàng đầu, hàng cuối
					System.out.print("* ");
				} else {
					if (j == 1 || j == n) { // Các hàng ở giữa
						System.out.print("* "); // Vị trí đầu và cuối hàng 
					}else {
						System.out.print("  ");//Giữa hàng
					}
				}
			}
			System.out.println();
		}
	}
}
