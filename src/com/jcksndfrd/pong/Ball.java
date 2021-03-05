package com.jcksndfrd.pong;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GameObject {
    
    public Ball(int x, int y, ID id) {
        super(x, y, id);
        width = 32;
        height = 32;

        velX = 7;
        velY = 7;
    }

    public void tick(){
        if(x < 0 + width / 2 || x > Game.WIDTH - width / 2) reset();
        if(y < 0 + height / 2 || y > Game.HEIGHT - height / 2) velY *= -1;

        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x - width / 2, y - height / 2, width, height);
    }

    private void reset() {
        x = Game.WIDTH / 2;
        y = Game.HEIGHT / 2;
        velX *= -1;
    }
}
