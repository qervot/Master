package ru.games.game_circles_Ball;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private static final int POS_X = 600;
    private static final int POS_Y = 200;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final String TITLE = "Circles";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameWindow();
            }
        });
    }

    private final int INITIAL_BALLS_COUNT = 10;
    private final List<Sprite> sprites = new ArrayList<>();

    private GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(POS_X, POS_Y);
        setSize(WIDTH, HEIGHT);
//        setResizable(false);
        setTitle(TITLE);
        GameCanvas gameCanvas = new GameCanvas(this);
        add(gameCanvas);
        initGame();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sprites.add(new Ball());
            }
        });
        setVisible(true);
    }

    private void initGame(){
        for (int i = 0; i < INITIAL_BALLS_COUNT; i++) {
            sprites.add(new Ball());
        }
    }

    private float time;

    void onDrawFrame(GameCanvas gameCanvas, Graphics g, float deltaTime) {
        float fps = 1f / deltaTime;
        time += deltaTime;
        if(time >= 1f) {
            System.out.println((int) fps);
            time = 0f;
        }
        update(gameCanvas, deltaTime);
        render(gameCanvas, g);
    }

    private void update(GameCanvas gameCanvas, float deltaTime){
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(gameCanvas, deltaTime);
        }
    }

    private void render(GameCanvas gameCanvas, Graphics g){
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(gameCanvas, g);
        }
    }
}
