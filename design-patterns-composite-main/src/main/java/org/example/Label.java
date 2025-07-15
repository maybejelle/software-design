package org.example;

public class Label implements UIComponent {
    private final String labelName;

    public Label(String labelName) {
        this.labelName = labelName;
    }

    @Override
    public void render() {
        System.out.println("label: " + labelName);
    }

    @Override
    public void add(UIComponent component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(UIComponent component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
