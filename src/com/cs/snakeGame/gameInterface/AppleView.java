package com.cs.snakeGame.gameInterface;

import com.cs.snakeGame.GameObjects.GameData;
import com.cs.snakeGame.common.Point;

import java.awt.*;

public class AppleView implements GameObjectsView{
    @Override
    public void display(GameData gameData,Graphics graphics) {
        Point point = gameData.getApplePosition();
        graphics.setColor(Color.RED);
        graphics.fillOval(point.getX() * 20, point.getY() * 20, 20, 20);
    }
}
