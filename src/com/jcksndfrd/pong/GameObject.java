package com.jcksndfrd.pong;

import java.awt.Graphics;

public abstract class GameObject {

    protected int x, y;
    protected int velX, velY;
    protected ID id;

    protected GameObject(int x, int y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

	public abstract void tick();
	public abstract void render(Graphics g);

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setID(ID id) {
        this.id = id;
    }
    public ID getId() {
        return id;
    }
    public void setVelX(int velX) {
        this.velX = velX;
    }
    public void setVelY(int velY) {
        this.velY = velY;
    }
    public int getVelX() {
        return velX;
    }
    public int getVelY() {
        return velY;
    }
}
