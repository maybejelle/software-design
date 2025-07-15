package org.example;

public class Main {
    public static void main(String[] args) {
        UIComponent panel1 = new Panel("panel1");
        UIComponent panel2 = new Panel("panel2");
        UIComponent button = new Button("button");
        UIComponent label = new Label("label");

        panel1.add(label);
        panel1.add(button);
        panel1.render();
        panel2.add(panel1);
        panel2.render();
    }
}