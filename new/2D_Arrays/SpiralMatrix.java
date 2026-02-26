import java.util.*;
public class SpiralMatrix {
    public static void arr2d(int matrix[][]){
         int startRow=0;
                int startCol=0;
                int endRow=matrix.length-1;
                int endCol=matrix[0].length-1;
                while(startRow<=endRow && startCol<=endCol){
                    
                //top
                for(int j=startCol;j<=endCol;j++){
                    System.out.print(matrix[startRow][j]+" ");
                }
                
                //right
                for(int i=startRow+1;i<=endRow;i++){
                    System.out.print(matrix[endCol][i]+" ");
                }

                //bottom
                for(int j=endCol-1;j>=startRow;j--){
                    System.out.print(matrix[j][endRow]+" ");
                }

                //Left
            }
        }
    }
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
            int matrix[][]=new int[4][4];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=sc.nextInt();
                }
            arr2d(matrix);
            sc.close();
            /* 
            //approach
            start row=0 then 1 in iteration
            end row=n-1 then 2 in iteration
            start column=0 then 2 in iteration1 
            end column=m-1 then 2 in iteration
            */
        }
    }
}
