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
    
    Ball(int x, int y) {
        this();
        this.x = x;
        this.y = y;

        // Speed from -250 to -150 or from 150 to 250
        vx = (float)((Math.random() - 0.5) * 200f);
        vx += Math.signum(vx) * 150;
        vy = (float)((Math.random() - 0.5) * 200f);
        vy += Math.signum(vy) * 150;
    }

    @Override
    void update(GameCanvas gameCanvas, float deltaTime) {
        x += vx * deltaTime;// x = x0 + v * t
        y += vy * deltaTime;
        if(getLeft() < gameCanvas.getLeft()){
            setLeft(gameCanvas.getLeft());
            vx = -vx;
        }
        if(getRight() > gameCanvas.getRight()){
            setRight(gameCanvas.getRight());
            vx = -vx;
        }
        if(getTop() < gameCanvas.getTop()){
            setTop(gameCanvas.getTop());
            vy = -vy;
        }
        if(getBottom() > gameCanvas.getBottom()){
            setBottom(gameCanvas.getBottom());
            vy = -vy;
        }
    }

    @Override
    void render(GameCanvas gameCanvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int)getLeft(), (int)getTop(), (int)getWidth(), (int)getHeight());
    }
}
