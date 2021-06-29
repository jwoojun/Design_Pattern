package com.example.design_pattern.refactoringbook.chapter09.example.after;

public class Player {
    private enum Media {
        VIDEO {
            @Override
            public void play() {

            }

            @Override
            public void loop() {

            }

            @Override
            public void stop() {

            }
        },
        MUSIC {
            @Override
            public void play() {

            }

            @Override
            public void loop() {

            }

            @Override
            public void stop() {

            }
        },
        NULL {
            @Override
            public void play() {

            }

            @Override
            public void loop() {

            }

            @Override
            public void stop() {

            }
        };

        public abstract void play();

        public abstract void loop();

        public abstract void stop();
    }


    private Media mediaState;

    public void setMedia(Media state) {
        this.mediaState = state;
    }

    public void start(){
        mediaState.play();
        setMedia(Media.MUSIC);
    }

}
