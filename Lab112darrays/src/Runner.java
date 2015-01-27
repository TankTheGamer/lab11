
public class Runner {
	public static void main(String[] args) {
//hey
	}	
	
	public static int max(int[][] nums){
		int toReturn = 0;
		for(int x =0; x < nums.length; x++){
			for(int y =0; y < nums[x].length; y++){
				if(toReturn < nums[x][y]){
					toReturn = nums[x][y];
				}
				
			}
		}
		return toReturn;
		
	}
	
	public static int rowSum(int[][] nums, int x){
		int rowSum = 0;
		for(int i = 0; i < nums[x].length; i++){
			rowSum += nums[x][i];
		}
		return rowSum;
		
	}
	public static int columnSum(int[][] nums, int x){
		int colSum = 0;
		
		for(int i =0; i < nums.length; i++){
			if(nums[i].length - 1 >= x){
				colSum += nums[i][x];
			}
		}
		return colSum;
		
	}
	public static int[] allRowSums(int[][] nums){
		return null;
		
	}
	public static boolean isRowMagic(int[][] nums){
		int firstTotal = 0;
		int compareTotal = 0;
		boolean firstTime = true;
		for(int x =0; x < nums.length; x++){
			for(int y =0; y < nums[x].length; y++){
				if(firstTime){
					firstTotal += nums[x][y];
				}else{
					compareTotal += nums[x][y];
				}
			}
			if(firstTotal != compareTotal){
				return false;
			}
			compareTotal = 0;
			firstTime = false;
		}
		return true;
		
	}
	public static boolean isColumnMagic(int[][] nums){
		return false;
		
	}
	public static boolean isSquare(int[][] nums){
		return false;
		
	}
	public static boolean isMagic(int[][] nums){
		return false;
		
	}
	public static boolean isLatin(int[][] nums){
		return false;
		
	}
	public static boolean inSequence(int[][] nums){
		return false;
		
	}
}
