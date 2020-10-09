package com.github.programmer3481.simple3D.engine;

import org.joml.Vector2f;
import org.joml.Vector3f;

public class Vertex {
    private Vector3f position;
    private Vector3f color;
    private Vector2f texCoord;

    public Vertex(Vector3f position, Vector3f color, Vector2f texCoord) {
        this.position = position;
        this.color = color;
        this.texCoord = texCoord;
    }

    public Vertex(Vector3f position, Vector2f texCoord) {
        this.position = position;
        this.color = new Vector3f(1.0f, 1.0f, 1.0f);
        this.texCoord = texCoord;
    }

    public Vector3f getPosition() {
        return position;
    }

    public void setPosition(Vector3f position) {
        this.position = position;
    }

    public Vector3f getColor() {
        return color;
    }

    public void setColor(Vector3f color) {
        this.color = color;
    }

    public Vector2f getTexCoord() {
        return texCoord;
    }

    public void setTexCoord(Vector2f texCoord) {
        this.texCoord = texCoord;
    }
}
