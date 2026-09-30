import java.util.Arrays;
import java.util.Random;

public class Benchmark {
    public static void main(String[] args){
        int[] sizes = {64, 128, 256, 512, 1024, 2048, 4096};
        Random random = new Random();
        for(int i =0; i< sizes.length; i++){
            int size = sizes[i];
            int[][] matrix = new int[size][size];

            for(int row = 0; row< size; row++){
                for(int col = 0; col< size; col++){
                    matrix[row][col]= random.nextInt(100);
                }
            }
            for(int j=0; j<5; j++){
                MatrixSum.sumByRows(matrix);
                MatrixSum.sumByColumn(matrix);

            }
            long[] rowsTimes = new long[11];
            long checksum = 0;
            for(int j=0; j<11; j++){
                long start = System.nanoTime();
                checksum += MatrixSum.sumByRows(matrix);
                long end = System.nanoTime();
                rowsTimes[j]=end-start;

            }
            long[] columnsTimes=new long[11];
            for(int j=0; j<11; j++){
                long startCol= System.nanoTime();
                checksum += MatrixSum.sumByColumn(matrix);
                long endCol=System.nanoTime();
                columnsTimes[j]=endCol-startCol;
            }
            Arrays.sort(rowsTimes);
            Arrays.sort(columnsTimes);

            long rowsMedian = rowsTimes[5];
            long columnsMedian = columnsTimes[5];
            double ratio=(double) columnsMedian/rowsMedian;

            System.out.println(size+ ": " + rowsMedian + " " + columnsMedian + " " + ratio);
            System.out.println("Checksum: " + checksum);



        }

    }
}
