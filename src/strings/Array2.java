package strings;
import java.util.HashSet;

public class Array2 {
	static HashSet<Integer> rowSet;
	static HashSet<Integer> colSet;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] Mat = new Integer[4][4];
		Integer var;
		Integer M=4; Integer N=4;
		int i, j;
		for(i=0; i<M; i++){
			for(j=0; j<N; j++){
				Mat[i][j] = j+1;
			}
		}
		Mat[1][1]=0;
		Mat[1][3]=0;
		Mat[1][2]=0;
		
		Mat = zeroMat(Mat, M, N);
		System.out.println("----------------");
		
		printMat(Mat, M, N);
	}
	
	public static Integer[][] zeroMat(Integer[][] Mat, int M, int N){
		rowSet = new HashSet<Integer>();
		colSet = new HashSet<Integer>();
		
		for(int i=0; i<M; i++){
			for(int j=0; j<N; j++){
				if(Mat[i][j]==0){
					rowSet.add(i);
					colSet.add(j);
				}
			}
		}
		
		for(Integer val: rowSet){ Mat = zeroRow(Mat, val, N); }
		for(Integer val: colSet){ Mat = zeroCol(Mat, val, M); }
		
		return Mat;
	}
	public static Integer[][] zeroRow(Integer[][] Mat, int x, int N){
			for(int q=0; q<N; q++){
				Mat[x][q]=0;
			}
		return Mat;
	}
	
	public static Integer[][] zeroCol(Integer[][] Mat, int y, int M){
			for(int p=0; p<M; p++){
				Mat[p][y]=0;
			}
		return Mat;
	}
	
	public static void printMat(Integer[][] Mat, int M, int N){
		for(int i=0; i<M; i++){
			for(int j=0; j<N; j++){
				System.out.print(Mat[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
