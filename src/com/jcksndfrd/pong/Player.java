package com.jcksndfrd.pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {
    
    public Player(int x, int y, ID id) {
        super(x, y, id);
    }

    public void tick() {
        y += velY;
    }

    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 16, 64);
    }
}
