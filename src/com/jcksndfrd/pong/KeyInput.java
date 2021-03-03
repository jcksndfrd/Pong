package com.jcksndfrd.pong;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for(int i = 0; i < handler.objects.size(); i++) {
            GameObject tempObject = handler.objects.get(i);

            if(tempObject.id == ID.PLAYER1) {
                if(key == KeyEvent.VK_W) tempObject.setMovingUp(true);
                if(key == KeyEvent.VK_S) tempObject.setMovingDown(true);
            } else if(tempObject.id == ID.PLAYER2) {
                if(key == KeyEvent.VK_UP) tempObject.setMovingUp(true);
                if(key == KeyEvent.VK_DOWN) tempObject.setMovingDown(true);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        for(int i = 0; i < handler.objects.size(); i++) {
            GameObject tempObject = handler.objects.get(i);

            if(tempObject.id == ID.PLAYER1) {
                if(key == KeyEvent.VK_W) tempObject.setMovingUp(false);
                if(key == KeyEvent.VK_S) tempObject.setMovingDown(false);
            } else if(tempObject.id == ID.PLAYER2) {
                if(key == KeyEvent.VK_UP) tempObject.setMovingUp(false);
                if(key == KeyEvent.VK_DOWN) tempObject.setMovingDown(false);
            }
        }
    }
}