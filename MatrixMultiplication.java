import java.util.Scanner; 
class Matrix 
{ 
 int m, n, p, q, sum = 0, i,j,k; 
 Scanner in = new Scanner(System.in); 
 int First[][] = new int[10][10]; 
 int Second[][] = new int[10][10]; 
 int Result[][] = new int[10][10]; 
 
 void input() 
 { 
 System.out.println("Enter the number of rows and columns of First matrix"); 
 m = in.nextInt(); 
 n = in.nextInt(); 
 System.out.println("Enter elements of First matrix"); 
 for (i = 0; i < m; i++) 
 { 
 for (j = 0; j < n; j++) 
 First[i][j] = in.nextInt(); 
 } 
 System.out.println("Enter the number of rows and columns of Second matrix"); 
 p = in.nextInt(); 
 q = in.nextInt(); 
 if (n != p) 
 { 
 System.out.println("The matrices can't be multiplied with each other."); 
 System.exit(0); 
 } 
 else 
 { 
 System.out.println("Enter the number of rows and columns of Second matrix"); 
 for (i = 0; i <p; i++) 
 { 
 for (j = 0; j <q; j++) 
 Second[i][j] = in.nextInt(); 
 } 
 } 
 } 
 void multiply() 
 { 
 for (i = 0; i <m; i++) 
 { 
 for (j = 0; j<n; j++) 
 { 
 
 for(k=0;k<p;k++) 
 Result[i][j]=Result[i][j]+First[i][k]*Second[k][j]; 
 } 
 Result[i][j]=0; 
 
 } 
 
 } 
 
 void display() 
 { 
 for (i = 0; i <p; i++) 
 { 
 for (j = 0; j <q; j++) 
 System.out.print(Result[i][j]+" "); 
 System.out.println(); 
 } 
 
 } 

} 
public class MatrixMultiplication 
{ 
 
 public static void main(String args[]) 
 { 
 Matrix MM=new Matrix(); 
 MM.input(); 
 MM.multiply(); 
 MM.display(); 
 
 } 
} 
