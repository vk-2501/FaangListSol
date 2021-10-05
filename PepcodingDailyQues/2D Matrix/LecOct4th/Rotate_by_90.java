ROTATE BY 90 Deg


class Solution {
    public void rotate(int[][] matrix) {
         //Transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        
        
        //Reverse
        
        for(int i=0;i<matrix.length;i++){
            int left=0;
            int right=matrix[i].length-1;
            while(left<=right){
                int t=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=t;
                left++;
                right--;
            }
            
        }
        
        
    }
}