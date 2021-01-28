package codeup_1535_210128;

import java.util.Scanner;

public class Main {

	public static int f() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0, coor=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
				coor=i+1;
			}
		}
		return coor;
	}
	public static void main(String[] args) {
		System.out.print(f());
	}
}