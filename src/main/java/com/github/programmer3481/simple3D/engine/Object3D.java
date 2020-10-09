package com.github.programmer3481.simple3D.engine;

import org.joml.Vector3f;

public class Object3D {
    private Shader shader;
    private Mesh mesh;
    private Texture texture;
    private Vector3f position, rotation, scale;

    public Object3D(Shader shader, Mesh mesh, Texture texture, Vector3f position, Vector3f rotation, Vector3f scale) {
        this.shader = shader;
        this.mesh = mesh;
        this.texture = texture;
        this.position = position;
        this.rotation = rotation;
        this.scale = scale;
    }

    public Shader getShader() {
        return shader;
    }

    public Mesh getMesh() {
        return mesh;
    }

    public Texture getTexture() {
        return texture;
    }

    public Vector3f getPosition() {
        return position;
    }

    public Vector3f getRotation() {
        return rotation;
    }

    public Vector3f getScale() {
        return scale;
    }
}
