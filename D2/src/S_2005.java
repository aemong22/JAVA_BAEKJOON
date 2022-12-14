import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S_2005 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(in.readLine());
		
		for(int tc = 1; tc<=t ; tc++) {
			int n = Integer.parseInt(in.readLine());
			int[][] tri = new int[n][n];
			
			sb.append("#"+tc+"\n");
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j <= i; j++) {
					if(j == 0 || j == i) tri[i][j] = 1;
					else tri[i][j] = tri[i-1][j-1]+tri[i-1][j];
					sb.append(tri[i][j]+" ");
				}
				sb.append("\n");
			}
			
		}
		System.out.println(sb);
		
	}

}
