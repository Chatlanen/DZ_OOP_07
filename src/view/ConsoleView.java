package view;


import java.util.Date;

import service.LoggerInterface;

public class ConsoleView implements LoggerInterface{

    @Override
    public void writeLog(String logMessage) {
        try {
            System.out.println(new Date().toString() + ": " + logMessage);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'writeLog'");
        }
    }
    
}
