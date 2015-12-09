package com.lwk;

import java.io.File;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class OutputService {
    public static void output(String filename, int a, int b) throws Exception {
        PrintWriter out = new PrintWriter(new File(filename));
        out.write(a + ":" + b);
        TimeUnit.SECONDS.sleep(2);
        out.close();

    }
}