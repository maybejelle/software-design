package org.example;

public class Button implements UIComponent {
    private final String name;

    public Button(String name) {
        this.name = name;
    }
    @Override
    public void render() {
        System.out.println("Button: " + name);
    }

    @Override
    public void add(UIComponent component) {
        throw new UnsupportedOperationException("Button can't have extra UI components.");
    }

    @Override
    public void remove(UIComponent component) {
        throw new UnsupportedOperationException("Button can't have extra UI components.");
    }
}
