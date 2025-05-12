package com.cs.snakeGame.gameLogic;

import com.cs.snakeGame.common.SnakeDirection;

public interface GameLogic {
    public void moveSnake();
    public void startGame();
    public void changeDirection(SnakeDirection snakeDirection);
    public boolean isGameActive();
}
