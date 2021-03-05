package com.jcksndfrd.pong;

import java.awt.Color;
import java.awt.Graphics;

public class Scoreboard {

    public int player1;
    public int player2;

    public Scoreboard() {
        player1 = 0;
        player2 = 0;
    }

    public void render(Graphics g) {
        g.setColor(Color.WHITE);
    }
}
