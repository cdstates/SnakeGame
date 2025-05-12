package com.cs.snakeGame.GameObjects.snake;

public class StandardSnake extends Snake {

    @Override
    protected void headCollisions() {
        this.isAlive=false;
    }
}
