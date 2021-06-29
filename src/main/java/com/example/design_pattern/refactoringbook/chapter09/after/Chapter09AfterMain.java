package com.example.design_pattern.refactoringbook.chapter09.after;

public class Chapter09AfterMain {
    public static void main(String[] args) {
        System.out.println("==============================================");
        Logger logger = new Logger();
        logger.log("information #1");

        logger.start();
        logger.log("information #2");

        logger.start();
        logger.log("information #3");

        logger.stop();
        logger.log("information #4");

        logger.stop();
        logger.log("information #5");
        System.out.println("==============================================");
    }
}
