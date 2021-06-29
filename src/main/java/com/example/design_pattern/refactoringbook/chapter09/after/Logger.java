package com.example.design_pattern.refactoringbook.chapter09.after;

public class Logger {

    private enum State {
        STOPPED {
            @Override
            public void start() {
                System.out.println("Start Logging");
            }

            @Override
            public void stop() {
                System.out.println("Stop Logging");
            }

            @Override
            public void log(String info) {
                System.out.println("Ignoring: " + info);
            }
        },

        LOGGING {
            @Override
            public void start() {
                System.out.println("");
            }

            @Override
            public void stop() {
                System.out.println("** STOP LOGGING **");
            }

            @Override
            public void log(String info) {
                System.out.println("Logging: " + info);
            }
        };


        public abstract void start();

        public abstract void stop();

        public abstract void log(String info);
    }

    private State loggerState;

    public Logger() {
        setState(State.STOPPED);
    }

    public void setState(State state) {
        loggerState = state;
    }

    public void start() {
        loggerState.start();
        setState(State.LOGGING);
    }

    public void stop() {
        loggerState.stop();
        setState(State.STOPPED);
    }

    public void log(String info) {
        loggerState.log(info);
    }

}
