package com.example.design_pattern.singleton;

public class SingletonMain {
    public static void main(String args[]) {
        SystemSpeaker speakerA = SystemSpeaker.getInstance();
        SystemSpeaker speakerB = SystemSpeaker.getInstance();

        speakerA.setVolume(20);
        speakerB.setVolume(20);
        System.out.println("==========Before==========");

        System.out.println(speakerA.getVolume());
        System.out.println(speakerB.getVolume());


        speakerA.setVolume(30);
        System.out.println("==========After==========");

        System.out.println(speakerA.getVolume());
        System.out.println(speakerB.getVolume());

        System.out.println(speakerA.hashCode() + ", " + speakerB.hashCode());

    }

}
