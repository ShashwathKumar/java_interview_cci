package strings;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] M = new Integer[4][4];
		int N=4;
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				M[i][j] = j+1;
			}
		}
		M = rotateMatrix(M, N);
		
		for(int i=0; i<N; i++){
			for(int j=0; i<N; j++){
				System.out.print(M[i][j]+' ');
			}
			System.out.println();
		}		

	}
	
	public static Integer[][] rotateMatrix(Integer[][] M, int N){
		Integer temp, last, first, offset;
		for(int k=0; k<N/2; k++){
			first = k;
			last  = N-1-k;
			for(int i=first; i<last; i++){
					offset = i-first;
					temp                    = M[i][first];
					M[i][first]  = M[first][last-offset];
					M[first][last-offset]   = M[last-offset][last];
					M[last-offset][last]    = M[last][first+offset];
					M[last][first+offset]   = temp;
				}
			}
		
		return M;
	}

}