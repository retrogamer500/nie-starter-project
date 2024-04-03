package net.loganford.nieStarterProject.entities;

import net.loganford.noideaengine.Game;
import net.loganford.noideaengine.entity.Entity;
import net.loganford.noideaengine.graphics.Renderer;
import net.loganford.noideaengine.state.Scene;

public class TestEntity extends Entity {
    @Override
    public void render(Game game, Scene scene, Renderer renderer) {
        super.render(game, scene, renderer);

        renderer.setColor(1f, 0f, 0f, 1f);
        renderer.drawRectangle(getX(), getY(), 32, 32);
    }
}
