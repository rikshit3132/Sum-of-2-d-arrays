import java.util.Scanner;
class Multi2_D{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		int arr3[][]=new int[3][3];
		System.out.println("Enter element of array1\n");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter element of array2\n");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array1 is:\n");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array2 is:\n");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("Summed Array is:\n");
         for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}

	}
}