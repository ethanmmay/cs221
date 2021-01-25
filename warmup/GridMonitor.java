package cs221.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GridMonitor {

    double[][] tempGrid;
    double data = 0.0;

    public GridMonitor(String filename) throws FileNotFoundException {
        File currentFile = new File(filename);
        buildGrid(currentFile);
    }

    public double[][] buildGrid(File currentFile) throws FileNotFoundException {
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

    public double[][] getSurroundingSumGrid() {
        return null;
    }

    public double[][] getSurroundingAvgGrid() {
        return null;
    }

    public double[][] getDeltaGrid() {
        return null;
    }

    public boolean[][] getDangerGrid() {
        return null;
    }

    public double[][] getBaseGrid() {
        return null;
    }
}