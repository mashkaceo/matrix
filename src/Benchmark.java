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

                long start = System.nanoTime();
                MatrixSum.sumByRows(matrix);
                long end = System.nanoTime();
                System.out.println(end-start);

                long columnStart = System.nanoTime();
                MatrixSum.sumByColumn(matrix);
                long columnEnd = System.nanoTime();
                System.out.println(columnEnd-columnStart);



            }
        }

    }
}
