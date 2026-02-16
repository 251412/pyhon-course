import java.util.Scanner;
public class Spiralmatrix{
    public static void main(String[]args){
        int [][]myArr=new int[3][3];
        Scanner sc= new Scanner(System.in);
        int c=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                myArr[i][j]=c++;
            }
        }
        int startRow=0;
        int stratCol=0;
        int endRow=myArr.length-1;
        int endCol=myArr[0].length-1;
        while(stratCol<endCol&&startRow<endRow){

            for(int top=stratCol;top<=endCol;top++){
                System.out.print(myArr[startRow][top]+" ");
            }

            for(int right=startRow+1;right<=endRow;right++){
            System.out.print(myArr[right][endCol]+" ");
            }

            for(int bottom=endCol-1;bottom>stratCol;bottom--){
                System.out.print(myArr[endRow][bottom]+" ");
                }

                for(int left=endRow-1;left>=startRow+1;left--){
                    System.out.print(myArr[left][stratCol]+" ");
                    }
stratCol++;
startRow++;
endCol--;
endRow--;


        }
        }
}