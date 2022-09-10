package com.harun.chessgame;

import com.harun.chessgame.objects.GameManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ChessGameApplication {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        GameManager gameManager = context.getBean("gameManager",GameManager.class);
        gameManager.run();
    }
}
