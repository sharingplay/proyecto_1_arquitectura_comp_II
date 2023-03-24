package objects;

import graphic_interface.Window;

import javax.swing.*;
import java.awt.*;

public class processor {
    private String name;
    private int number;
    private String currentInstruction;    //indicates the current instruction that the processor is executing

    public processor(int number) {
        this.number = number;
        this.name = "Processor " + String.valueOf(this.number);
        this.currentInstruction = "None";
    }

    public String getCurrentInstruction() {
        return currentInstruction;
    }

    public void setCurrentInstruction(String currentInstruction) {
        this.currentInstruction = currentInstruction;
    }

    public void drawOnWindow(Graphics g, int x, int y, int size) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, size, size);
        g.setColor(Color.RED);
        g.drawString(name, x + size/2, y + size/2);
    }
}
