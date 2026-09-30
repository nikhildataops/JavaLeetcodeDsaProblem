class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int [][] mat=new int [n][m];
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
            mat[col][row]=matrix[row][col];
            }
        }
        return mat;
        
    }
}