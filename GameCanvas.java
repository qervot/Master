package ru.geekbrains.games.game_circles;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    private static final int SLEEPING_TIME =17;
    private GameWindow gameWindow;
    private long lastTime;

    GameCanvas(GameWindow gameWindow) {
        gameWindow = gameWindow;
        lastTime = System.nanoTime();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


    long currentTime = System.nanoTime();
    float deltaTime = (currentTime - lastTime) * 1e-9f;
    lastTime = currentTime;
//        try {
//            Thread.sleep(SLEEPING_TIME);
 //       }catch (InterruptedException e){
//          e.printStackTrace();
//        g.fillOval(0,0,100,100);
        gameWindow.onDrawFrame(this,g,deltaTime);
            try {
                Thread.sleep(SLEEPING_TIME);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        repaint();

    }

}

