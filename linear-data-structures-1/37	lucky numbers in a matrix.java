class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> row_minimums = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            row_minimums.add(Arrays.stream(matrix[i]).min().getAsInt());
        }

        List<Integer> col_maximums = new ArrayList<>();
        for(int j=0; j<matrix[0].length; j++){
            int col_max = matrix[0][j];
            for(int i=0; i<matrix.length; i++){
                if(matrix[i][j]>col_max){col_max=matrix[i][j];}
            }
            col_maximums.add(col_max);
        }
        
        List<Integer> result = new ArrayList<>();
        row_minimums.retainAll(col_maximums);
        return row_minimums;
    }
}

