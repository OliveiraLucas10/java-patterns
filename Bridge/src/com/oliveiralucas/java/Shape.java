package com.oliveiralucas.java;

abstract class Shape {

    private Renderer renderer;
    public String name;

    public Shape(Renderer renderer) {
	this.renderer = renderer;
    }

    @Override
    public String toString() {
	return String.format("Drawing %s as %s", name, renderer.whatToRenderAs());
    }
}
