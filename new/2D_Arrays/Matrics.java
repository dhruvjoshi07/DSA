import java.util.*;
public class Matrics {

    //search an cell in matrix
    // public static boolean search(int matrix[][],int key){

    // }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int matrix[][]=new int[3][3];
            int n=matrix.length, m =matrix[0].length;

            //Declare rows and columns
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
            
            //Output
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            sc.close();
        }
    }
}
