import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMatrix {
    @Test
    void sumByNiceRows(){
        int[][] matrix ={
                {1,2},
                {3,4}
        };
        long result = MatrixSum.sumByRows(matrix);
        assertEquals(10,result);
    }
    @Test
    void sumByNiceColumns(){
        int[][] matrix ={
                {1,2},
                {3,4}
        };
        long result = MatrixSum.sumByColumn(matrix);
        assertEquals(10,result);
    }
    @Test
    void sumElementRow(){
        int[][] matrix ={{5}};
        long result = MatrixSum.sumByRows(matrix);
        assertEquals(5,result);
    }
    @Test
    void sumElementColumn(){
        int[][] matrix ={{7}};
        long result = MatrixSum.sumByColumn(matrix);
        assertEquals(7,result);
    }
    @Test
    void sumEmptyRows(){
        int[][] matrix ={};
        long result = MatrixSum.sumByRows(matrix);
        assertEquals(0,result);
    }
    @Test
    void sumEmptyColumns() {
        int[][] matrix = {};
        long result = MatrixSum.sumByColumn(matrix);
        assertEquals(0,result);
    }
    @Test
    void sumSimilarElementsRows(){
        int[][] matrix ={
                {2,2,2},
                {2,2,2},
                {2,2,2}
        };
        long result = MatrixSum.sumByRows(matrix);
        assertEquals(18,result);
    }
    @Test
    void sumSimilarElementsColumn(){
        int[][] matrix ={
                {3,3,3},
                {3,3,3},
                {3,3,3}
        };
        long result = MatrixSum.sumByColumn(matrix);
        assertEquals(27,result);
    }
    @Test
    void sumNegativeRows(){
        int[][] matrix={
                {-1,-2},
                {-3,-4}
        };
        long result = MatrixSum.sumByRows(matrix);
        assertEquals(-10,result);
    }
    @Test
    void sumNegativeColumns(){
        int[][] matrix ={
                {-1,-2},
                {-3,-4}
        };
        long result = MatrixSum.sumByColumn(matrix);
        assertEquals(-10,result);
    }
    @Test
    void sumRightRowsColumns(){
        int[][] matrix ={
                {1,9,3},
                {8,2,7},
                {4,6,5}
        };
        long rows = MatrixSum.sumByRows(matrix);
        long columns = MatrixSum.sumByColumn(matrix);
        assertEquals(rows,columns);
    }
}
