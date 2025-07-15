package org.example;

import java.util.ArrayList;
import java.util.List;

public class Panel implements UIComponent{
    private final String name;
    private final List<UIComponent> components = new ArrayList<UIComponent>();
    @Override
    public void render() {
        System.out.println("Panel: " + name);
        for(UIComponent component : components){
            component.render();
        }
    }

    public Panel(String name){
        this.name = name;
    }

    @Override
    public void add(UIComponent component) {
        components.add(component);
    }

    @Override
    public void remove(UIComponent component) {
        components.remove(component);
    }
}
