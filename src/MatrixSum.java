public class MatrixSum {
    public static long sumByRows(int[][] matrix){
        long sum = 0;
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
    public static long sumByColumn(int[][] matrix){
        long sum=0;
        for(int j=0;j< matrix.length; j++){
            for(int i=0; i< matrix.length; i++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
}
