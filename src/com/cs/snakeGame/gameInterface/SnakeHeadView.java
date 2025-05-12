package com.cs.snakeGame.gameInterface;

import com.cs.snakeGame.GameObjects.GameData;
import com.cs.snakeGame.common.GameConstants;
import com.cs.snakeGame.common.Point;

import java.awt.*;

public class SnakeHeadView implements GameObjectsView {
    @Override
    public void display(GameData gameData,Graphics graphics) {
        Point snakeHead = gameData.getSnakeHead();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(snakeHead.getX() * GameConstants.CELL_SIZE, snakeHead.getY() * GameConstants.CELL_SIZE + GameConstants.PADDING, GameConstants.CELL_SIZE, GameConstants.CELL_SIZE);
    }
}