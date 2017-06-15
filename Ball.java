package ru.games.game_circles_Ball;

import java.awt.*;

class Ball extends Sprite {

    private float vx = 150f + (float)(Math.random() * 200f);
    private float vy = 150f + (float)(Math.random() * 200f);
    private Color color =
            new Color((int)(Math.random() * 256f), (int)(Math.random() * 256f), (int)(Math.random() * 256f));

    Ball() {
        halfHeight = 20f + (float)(Math.random() * 50f);
        halfWidth = halfHeight;
    }

    @Override
    void update(GameCanvas gameCanvas, float deltaTime) {
        x += vx * deltaTime;// x = x0 + v * t
        y += vy * deltaTime;
        
        boolean mirrored = false;
        
        if(getLeft() < gameCanvas.getLeft()){
            setLeft(gameCanvas.getLeft());
            vx = -vx;
            mirrored = true;
        }
        if(getRight() > gameCanvas.getRight()){
            setRight(gameCanvas.getRight());
            vx = -vx;
            mirrored = true;
        }
        if(getTop() < gameCanvas.getTop()){
            setTop(gameCanvas.getTop());
            vy = -vy;
            mirrored = true;
        }
        if(getBottom() > gameCanvas.getBottom()){
            setBottom(gameCanvas.getBottom());
            vy = -vy;
            mirrored = true;
        }

        if (mirrored) {
            color = new Color((int)(Math.random() * 256f), (int)(Math.random() * 256f), (int)(Math.random() * 256f));
        }
    }

    @Override
    void render(GameCanvas gameCanvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int)getLeft(), (int)getTop(), (int)getWidth(), (int)getHeight());
    }
}
