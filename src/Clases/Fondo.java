package Clases;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;

public class Fondo extends JLabel {

  Persona per = new Persona();
  Plataforma plat = new Plataforma();
  static boolean salto = true, gameover = false;

  public Fondo() {

    addKeyListener(new KeyListener() {

      @Override
      public void keyTyped(KeyEvent e) {

      }

      @Override
      public void keyPressed(KeyEvent e) {
        per.keyPressed(e);
      }

      @Override
      public void keyReleased(KeyEvent e) {

      }
    });
    setFocusable(true);
  }

  public void paint(Graphics g) {
    super.paint(g);
    g.setColor(Color.CYAN);
    g.fillRect(0, 0, 350, 700);
    g.setColor(Color.black);
    Font f1 = new Font("Arial", 30, 30);
    g.setFont(f1);
    g.drawString("" + plat.puntos, 10, 40);
    g.setColor(Color.black);
    plat.paint(g);
    per.paint(g);
    if (per.y != per.alto && salto == true) {
      per.saltar();
      plat.y1++;
      plat.y2++;
      plat.y3++;
      plat.y4++;
      plat.y5++;
      plat.y6++;
      plat.y7++;
    } else {
      salto = false;
      if (salto == false) {
        per.caer();

        if (colision()) {
          per.suelo();
          salto = true;
        }
        if (!colision() && per.y > 700) {
          System.out.println("perdiste");
          gameover = true;
          per.y = 600;
          per.x = 150;
          per.alto = 450;
          plat.puntos = 0;
          salto = true;
        }

      }
    }
  }

  public boolean colision() {
    if (per.caer().intersects(plat.r1()) || per.caer().intersects(plat.r2()) || per.caer().intersects(plat.r4())
        || per.caer().intersects(plat.r3())
        || per.caer().intersects(plat.r5()) || per.caer().intersects(plat.r6()) || per.caer().intersects(plat.r7())) {
      return true;
    } else
      return false;
  }

  public static void main(String[] args) {
    JFrame vent = new JFrame();
    Fondo obj = new Fondo();
    vent.add(obj);
    vent.setSize(350, 730);
    vent.setVisible(true);
    vent.setLocationRelativeTo(null);
    // vent.set
    vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    for (;;) {
      try {
        Thread.sleep(9);
        obj.repaint();
      } catch (Exception e) {
      }
      if (gameover) {
        // break;
      }
    }
  }
}
