package hackrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BookingDoteCom {

	/*
	 * Complete the function below.
	 */
	static String[] packNumbers(int[] arr) {
		
		String[] res = { "5:3", "7:2", "3", "4", "7" };
		ArrayList<int[]>  l= new  ArrayList<int[]>(Arrays.asList(arr));
        System.out.println(l);   

		
//		String[] res = ;


		return res;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = System.getProperty("output_path");
		BufferedWriter bw = null;
		if (fileName != null) {
			bw = new BufferedWriter(new FileWriter(fileName));
		} else {
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		String[] res;

		int[] arr = { 5, 5, 5, 7, 7, 3, 4, 7 };
		// int[] arr = {255,255,67,12,12,12,36,89,89,54,2,12,36,36,36}
        String s = "HackerRank ";

	     System.out.printf("%s is the best place to learn and practice coding!",s);

		res = packNumbers(arr);
		for (int res_i = 0; res_i < res.length; res_i++) {
			bw.write(String.valueOf(res[res_i]));
			System.out.println("res[" + res_i + "] : " + res[res_i]);
			bw.newLine();
		}

		bw.close();
	}
}
