error id: file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/learning/javalearning/new/2D_Arrays/SpiralMatrix.java:java/lang/System#
file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/learning/javalearning/new/2D_Arrays/SpiralMatrix.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 693
uri: file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/learning/javalearning/new/2D_Arrays/SpiralMatrix.java
text:
```scala
import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
            int matrix[][]=new int[4][4];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=sc.nextInt();
                }
                int startRow=0;
                int startCol=0;
                int endRow=matrix.length-1;
                int endCol=matrix[0].length-1;
                while(startRow<=endRow && startCol<=endCol){
                    
                //top
                for(int j=startCol;j<endCol;j++){
                    @@System.out.print(matrix[startRow][j]+" ");
                }
                
                //bottom
                for(int i=startRow+1;i<=endRow;i++){
                    
                }
                }
            }
            /* 
            //approach
            start row=0 then 1 in iteration
            end row=n-1 then 2 in iteration
            start column=0 then 2 in iteration1 
            end column=m-1 then 2 in iteration
            */
           
            sc.close();
        }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#