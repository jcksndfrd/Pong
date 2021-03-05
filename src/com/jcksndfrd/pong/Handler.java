package com.jcksndfrd.pong;

import java.util.LinkedList;
import java.awt.Graphics;

public class Handler {

    LinkedList<GameObject> objects = new LinkedList<>();

	public void tick() {
        for(int i = 0; i < objects.size(); i++) {
            GameObject tempObject = objects.get(i);

            if(tempObject.id == ID.BALL){
                for(int j = 0; j < objects.size(); j++) {
                    GameObject otherObject = objects.get(j);
                    if(otherObject.id == ID.PLAYER1 || otherObject.id == ID.PLAYER2) {
                        if(tempObject.x - tempObject.width / 2 < otherObject.x + otherObject.width / 2 && tempObject.x + tempObject.width / 2 > otherObject.x - otherObject.width / 2) {
                            if(tempObject.y - tempObject.height / 2 < otherObject.y + otherObject.height / 2 && tempObject.y + tempObject.height / 2 > otherObject.y - otherObject.height / 2) {
                                tempObject.velX *= -1;
                                tempObject.velY = 14 * (tempObject.y - otherObject.y) / otherObject.height;
                            }
                        }
                    }
                }
            }

            tempObject.tick();
        }
	}

	public void render(Graphics g) {
        for(int i = 0; i < objects.size(); i++) {
            GameObject tempObject = objects.get(i);
            tempObject.render(g);
        }
	}

    public void addObject(GameObject object) {
        objects.add(object);
    }

    public void removeObject(GameObject object) {
        objects.remove(object);
    }
}
