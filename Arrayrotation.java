package javaPractice;
import java.util.*;

public class ArrayRotation {
	public static void rotation(int[] array, int n, int d){
		for(int i = 0; i < d; i++){
			rotationByOne(array, n);
		}
	}
	
	public static void rotationByOne(int[] array, int n){
		int temp = array[0];
		for(int i = 0; i < n-1; i++){
			array[i] = array[i+1];
		}
		array[n-1] = temp;
	}

	public static void main(String[] args) {
		Scanner k= new Scanner(System.in);
		System.out.println("enter n");
		int n;
		int d;
		n = k.nextInt();
		System.out.println("enter n");
		d = k.nextInt();
		int array[] = new int[n];
		System.out.println("enter array elements");
		for(int i = 0; i < n; i++){
			array[i] = sk.nextInt();
		}
		rotation(array, n, d);
		for(int i = 0; i < n; i++){
			System.out.println(array[i]);
		}
	}

}