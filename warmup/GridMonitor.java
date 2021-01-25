package cs221.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GridMonitor implements GridMonitorInterface {

    double[][] tempGrid;
    double data = 0.0;
    File currentFile;

    @SuppressWarnings("unused")
    public GridMonitor(String filename) throws FileNotFoundException {
        File currentFile = new File(filename);
    }

    public double[][] getBaseGrid() throws FileNotFoundException {
        Scanner fileCursor = new Scanner(currentFile);
        for (int i = 0; fileCursor.hasNextLine(); i++) {
            for (int j = 0; fileCursor.hasNextDouble(); j++) {
                data = fileCursor.nextDouble();
                tempGrid[i][j] = data;
            }
        }

        fileCursor.close();
        return tempGrid;
    }

    public double[][] getSurroundingSumGrid() throws FileNotFoundException {
        Scanner fileCursor = new Scanner(currentFile);
        for (int i = 0; fileCursor.hasNextLine(); i++) {
            for (int j = 0; fileCursor.hasNextDouble(); j++) {
                data = fileCursor.nextDouble();
                tempGrid[i][j] = data;
            }
        }

        fileCursor.close();
        return tempGrid;
    }

    public double[][] getSurroundingAvgGrid() throws FileNotFoundException {
        Scanner fileCursor = new Scanner(currentFile);
        for (int i = 0; fileCursor.hasNextLine(); i++) {
            for (int j = 0; fileCursor.hasNextDouble(); j++) {
                data = fileCursor.nextDouble();
                tempGrid[i][j] = data;
            }
        }

        fileCursor.close();
        return tempGrid;
    }

    public double[][] getDeltaGrid() throws FileNotFoundException {
        Scanner fileCursor = new Scanner(currentFile);
        for (int i = 0; fileCursor.hasNextLine(); i++) {
            for (int j = 0; fileCursor.hasNextDouble(); j++) {
                data = fileCursor.nextDouble();
                tempGrid[i][j] = data;
            }
        }

        fileCursor.close();
        return tempGrid;
    }

    public boolean[][] getDangerGrid() throws FileNotFoundException {
        return null;
    }
}