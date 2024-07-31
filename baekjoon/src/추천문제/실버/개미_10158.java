package 추천문제.실버;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 개미_10158 {
		public static void main(String[] args) throws IOException  {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			
			String[] line1 = br.readLine().split(" ");
			String[] line2 = br.readLine().split(" ");
			
			int w = Integer.parseInt(line1[0]);
			int h = Integer.parseInt(line1[1]);
			int p = Integer.parseInt(line2[0]);
			int q = Integer.parseInt(line2[1]);
			int t = Integer.parseInt(br.readLine());
			
			int realW = t%(2*w);
			int realH = t%(2*h);
			if(realW+p>w) {
				p=2*w-(realW+p);
			}else {
				p+=realW;
			}
			
			if(realH+q>h) {
				q=2*h-(realH+q);
			}else {
				q+=realH;
			}
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write(p+" "+q);
			bw.flush();
			bw.close();
		}

}
