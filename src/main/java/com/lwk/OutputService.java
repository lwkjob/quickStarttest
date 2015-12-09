package com.lwk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class OutputService {
    static  Logger logger= LoggerFactory.getLogger(OutputService.class);

    public static void output(String filename, int a, int b) throws Exception {
        PrintWriter out = new PrintWriter(new File(filename));
        out.write(a + ":" + b);
        TimeUnit.SECONDS.sleep(2);
        out.close();

    }

    public static void main(String[] args) {
        logger.info("sfsaf");
    }
}