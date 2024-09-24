package lab4;
import java.lang.*;

public class MultiplicationTable {
    private int rows;
    private int columns;
    private int[][] table;
    private int width;
    private String line = "-------";
    private int bredd;

    public MultiplicationTable() {
        this(10, 10);
    }

    public MultiplicationTable(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.table = new int[rows + 1][columns + 1];
        generateTable();
    }

    private void generateTable() {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                table[i][j] = i * j;
            }
        }
    }

    private void calculateWidth() {
        width = rows * columns;
        bredd = String.valueOf(width).length() + 2;
    }

    public void print() {
        calculateWidth();
        System.out.printf(("%" + bredd + "s"), "   * |");
        for (int i = 0; i <= columns; i++) {
            System.out.printf("%" + bredd + "d", i);
        }
        System.out.println();
        System.out.printf(("%" + bredd + "s"), line.repeat(columns));
        System.out.println();
        for (int i = 0; i <= rows; i++) {
            System.out.printf("%" + (bredd - 1) + "d |", i);
            for (int j = 0; j <= columns; j++) {
                System.out.printf("%" + bredd + "d", table[i][j]);
            }
            System.out.println();
        }
    }
}



