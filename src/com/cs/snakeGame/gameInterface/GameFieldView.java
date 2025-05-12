package com.cs.snakeGame.gameInterface;

import com.cs.snakeGame.GameObjects.GameData;
import com.cs.snakeGame.common.GameConstants;

import java.awt.*;

public class GameFieldView implements GameObjectsView{
    @Override
    public void display(GameData gameData, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, GameConstants.PADDING, GameConstants.fieldWidth * GameConstants.CELL_SIZE, GameConstants.fieldHeight * GameConstants.CELL_SIZE);
    }
}
