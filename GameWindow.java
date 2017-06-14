package ru.geekbrains.games.game_circles;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private static final int POS_X = 600;
    private static final int POS_Y = 200;
    private static final int WIDTH = 800;
    private static final int HEIGHT =600;
    private static final String TITLE = "CIRCLES";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameWindow();
            }
        });

    }

    private GameWindow(){


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(POS_X, POS_Y);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle(TITLE);
        GameCanvas gameCanvas = new GameCanvas(this);
        add(gameCanvas);
        setVisible(true);

    }

    @Override
    public void setTransferHandler(TransferHandler newHandler) {
        super.setTransferHandler(newHandler);
    }
    private float time;

    void onDrawFrame(GameCanvas gameCanvas, Graphics g, float deltaTime){
//        float fps = 1f/deltaTime;
//        time += deltaTime;
//        if (time>=1f) {
//        System.out.println(int ) fps);
//        time = 0f;
//        }
        g.fillOval(0,0,100,100);
//        try {
//            Thread.sleep(SLEEPING_TIME);
//        }catch (InterruptedException e){
//            e.printStackTrace();
        }



    }

//
