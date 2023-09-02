import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//10989
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int[] arr = new int[10001];

		for (int i = 0; i < n; i++) {
			int b = Integer.parseInt(br.readLine().trim());
			arr[b]++;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 1; i <= 10000; i++) {
			if (arr[i] > 0) {
				for (int j = 0; j < arr[i]; j++) {
					bw.write(i + "\n");
					// bw.newLine();
				}
			}
		}
		bw.flush();
	}
}
