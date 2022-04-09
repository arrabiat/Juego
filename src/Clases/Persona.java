package Clases;

import java.awt.Graphics;
import javax.swing.ImageIcon;

import java.awt.Rectangle;

public class Persona {
  static String posicion = "suelo";
  static int x = 150, y = 600, alto = 450;

  public void paint(Graphics g) {
    ImageIcon img = new ImageIcon(getClass().getResource("../Imagenes/" + posicion + ".png"));
    g.drawImage(img.getImage(), x, y, 50, 100, null);
    g.drawRect(x + 10, y + 90, 20, 10);
    if (x > 300) {
      x = 5;
    }
    if (x < 0) {
      x = 290;
    }
  }

  public void keyPressed(java.awt.event.KeyEvent e) {
    if (e.getKeyCode() == 37) {
      x -= 15;
    }
    if (e.getKeyCode() == 39) {
      x += 15;
    }

  }

  public void saltar() {
    posicion = "salto";
    y--;

  }

  public Rectangle caer() {
    posicion = "caer";
    y++;
    return new Rectangle(x + 10, y + 90, 20, 10);
  }

  public void suelo() {
    posicion = "suelo";

    // System.out.println(yless);
    try {
      Thread.sleep(20);
    } catch (Exception e) {
      // TODO: handle exception
    }
    if (y > 0) {
      alto = y - 120;
    }
    System.out.println("" + alto);
  }

}