package cs221.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GridMonitor {

    double[] tempGrid;
    double data = 0.0;

    public GridMonitor(String filename) throws FileNotFoundException {
        File currentFile = new File(filename);
        buildGrid(currentFile);
    }

    public double[] buildGrid(File currentFile) throws FileNotFoundException {
        Scanner fileCursor = new Scanner(currentFile);

        for (int i = 0; fileCursor.hasNextDouble(); i++) {
            data = fileCursor.nextDouble();
            tempGrid[i] = data;
        }

        fileCursor.close();
        return tempGrid;
    }
}