package cs221.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GridMonitor implements GridMonitorInterface {

    double[][] tempGrid;
    double data = 0.0;
    File currentFile;
    double[][] surroundingSumGrid;
    double[][] surroundingAvgGrid;
    double sum = 0;

    @SuppressWarnings("unused")
    public GridMonitor(String filename) throws FileNotFoundException {
        File currentFile = new File(filename);
    }

    public double[][] getBaseGrid() throws FileNotFoundException {
        Scanner fileCursor0 = new Scanner(currentFile);
        for (int i = 0; fileCursor0.hasNextLine(); i++) {
            for (int j = 0; fileCursor0.hasNextDouble(); j++) {
                data = fileCursor0.nextDouble();
                tempGrid[i][j] = data;
            }
        }

        fileCursor0.close();
        return tempGrid;
    }

    public double[][] getSurroundingSumGrid() throws FileNotFoundException {
        Scanner fileCursor1 = new Scanner(currentFile);

        for (int i = 0; fileCursor1.hasNextLine(); i++) {
            for (int j = 0; fileCursor1.hasNextDouble(); j++) {
                try {
                    sum += tempGrid[i++][j];
                } catch (ArrayIndexOutOfBoundsException e) {
                    sum += tempGrid[i][j];
                }
                try {
                    sum += tempGrid[i][j++];
                } catch (ArrayIndexOutOfBoundsException e) {
                    sum += tempGrid[i][j];
                }
                try {
                    sum += tempGrid[i--][j];
                } catch (ArrayIndexOutOfBoundsException e) {
                    sum += tempGrid[i][j];
                }
                try {
                    sum += tempGrid[i][j--];
                } catch (ArrayIndexOutOfBoundsException e) {
                    sum += tempGrid[i][j];
                }
                surroundingSumGrid[i][j] = sum;
            }
        }

        fileCursor1.close();
        return surroundingSumGrid;
    }

    public double[][] getSurroundingAvgGrid() throws FileNotFoundException {
        Scanner fileCursor2 = new Scanner(currentFile);

        for (int i = 0; fileCursor2.hasNextLine(); i++) {
            for (int j = 0; fileCursor2.hasNextDouble(); j++) {
                try {
                    sum += tempGrid[i++][j];
                } catch (ArrayIndexOutOfBoundsException e) {
                    sum += tempGrid[i][j];
                }
                try {
                    sum += tempGrid[i][j++];
                } catch (ArrayIndexOutOfBoundsException e) {
                    sum += tempGrid[i][j];
                }
                try {
                    sum += tempGrid[i--][j];
                } catch (ArrayIndexOutOfBoundsException e) {
                    sum += tempGrid[i][j];
                }
                try {
                    sum += tempGrid[i][j--];
                } catch (ArrayIndexOutOfBoundsException e) {
                    sum += tempGrid[i][j];
                }
                surroundingAvgGrid[i][j] = sum / 4;
            }
        }

        fileCursor2.close();
        return surroundingAvgGrid;
    }

    public double[][] getDeltaGrid() throws FileNotFoundException {
        Scanner fileCursor3 = new Scanner(currentFile);
        for (int i = 0; fileCursor3.hasNextLine(); i++) {
            for (int j = 0; fileCursor3.hasNextDouble(); j++) {
                data = fileCursor3.nextDouble();
                tempGrid[i][j] = data;
            }
        }

        fileCursor3.close();
        return tempGrid;
    }

    public boolean[][] getDangerGrid() throws FileNotFoundException {
        return null;
    }
}