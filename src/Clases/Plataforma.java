package Clases;

import java.awt.Graphics;
import java.util.Random;
import java.awt.Rectangle;

public class Plataforma {
    Random a = new Random();
    

    static int y1 = 600, y2 = 500, y3 = 400, y4 = 300, y5 = 200, y6 = 100, y7 = 0,puntos =0;

    int x1 = a.nextInt(300),
            x2 = a.nextInt(300),
            x3 = a.nextInt(300),
            x4 = a.nextInt(300),
            x5 = a.nextInt(300),
            x6 = a.nextInt(300),
            x7 = a.nextInt(300);

    Persona per = new Persona();

    public void paint(Graphics g) {
        g.fillRect(x1, y1, 50, 10);
        g.fillRect(x2, y2, 50, 10);
        g.fillRect(x3, y3, 50, 10);
        g.fillRect(x4, y4, 50, 10);
        g.fillRect(x5, y5, 50, 10);
        g.fillRect(x6, y6, 50, 10);
        g.fillRect(x7, y7, 50, 10);
        if (y1 == 800) {
            x1 = a.nextInt(300);
            y1 = 0;
            puntos++;
        }
        if (y2 == 800) {
            x2 = a.nextInt(300);
            y2 = 0;
            puntos++;
        }
        if (y3 == 800) {
            x3 = a.nextInt(300);
            y3 = 0;
        }
        if (y4 == 800) {
            x4 = a.nextInt(300);
            y4 = 0;
            puntos++;
        }
        if (y5 == 800) {
            x5 = a.nextInt(300);
            y5 = 0;
            puntos++;
        }
        if (y6 == 800) {
            x6 = a.nextInt(300);
            y6 = 0;
            puntos++;
        }
        if (y7 == 800) {
            x7 = a.nextInt(300);
            y7 = 0;
            puntos++;
        }
    }

    public Rectangle r1() {
        return new Rectangle(x1, y1, 50, 10);
    }

    public Rectangle r2() {
        return new Rectangle(x2, y2, 50, 10);
    }

    public Rectangle r3() {
        return new Rectangle(x3, y3, 50, 10);
    }

    public Rectangle r4() {
        return new Rectangle(x4, y4, 50, 10);
    }

    public Rectangle r5() {
        return new Rectangle(x5, y5, 50, 10);
    }

    public Rectangle r6() {
        return new Rectangle(x6, y6, 50, 10);
    }

    public Rectangle r7() {
        return new Rectangle(x7, y7, 50, 10);
    }

}