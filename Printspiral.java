package com.gokul.matrix;

public class Printspiral {

	public static void main(String[] args) {
		
		int a[][];
		int[][] b;
		int[] c[];
		int [][]d;
		
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Array length is "+arr.length);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");
			}
	System.out.println();	}
		spiral(arr);

	}
	
	public static void spiral(int [][]a){
		int dir=0;
		
		int T=0;
		int B=a.length-1;
		int L=0;
		int R=a.length-1;
		int i;
		while(T<=B && L<=R){
			if(dir==0){
				for(i=L;i<=R;i++){
					System.out.print(a[T][i]+",");
				}
				dir=1;T++;
			}
			else if(dir==1){
				for(i=T;i<=B;i++){
					System.out.print(a[i][R]+",");
				}
				dir=2;R--;
			}
			else if(dir==2){
				for(i=R;i>=L;i--){
					System.out.print(a[B][i]+",");
				}
				dir=3;B--;
			}
			else if(dir==3){
				for(i=B;i>=T;i--){
					System.out.print(a[i][L]+",");
				}
				L++;
				dir=(dir+1)%4;
			}
			
			
			
		}
		
		
	}

}
