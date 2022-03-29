package com.example.task04;

/**
 * обработчик, выводящий сообщения в консоль
 */
public class ConsoleHandler implements MessageHandler {
    @Override
    public void log(String message){
        System.out.println(message);
    }
}
