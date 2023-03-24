import graphic_interface.Window;
import objects.processor;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Window mainWindow = new Window();
        processor p1 = new processor(1);
        Graphics g = mainWindow.getGraphics();
        p1.drawOnWindow(g,100,100,300);
    }
}