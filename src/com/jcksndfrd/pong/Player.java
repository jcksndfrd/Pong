package com.jcksndfrd.pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {
    
    public Player(int x, int y, ID id) {
        super(x, y, id);
        width = 16;
        height = 128;
    }

    public void tick() {
        if(velY > 0) y += Math.min(velY, Game.HEIGHT - y - height / 2);
        if(velY < 0) y += Math.max(velY, height / 2 - y);
    }

    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x - width / 2, y - height / 2, width, height);
    }
}
