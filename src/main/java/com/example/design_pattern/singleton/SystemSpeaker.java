package com.example.design_pattern.singleton;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter @Setter
public class SystemSpeaker {

    static private SystemSpeaker instance;
    private int volume;

    private SystemSpeaker() {
        volume = 5;
    }

    ;


    public static SystemSpeaker getInstance() {
        if (instance == null) {
            instance = new SystemSpeaker();
            System.out.println("New Speaker");
        }
        return instance;
    }
}
