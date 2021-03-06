package controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import model.Missile;
import model.Shooter;

public class MouseController extends MouseAdapter {
    
    public int x;
    public int y;

    @Override
    public void mousePressed(MouseEvent me) {
        
        int px = me.getX();
        int py = me.getY();

        Shooter shooter = (Shooter) Main.gameData.friendFigures.get(0);

        Missile m = new Missile(
                shooter.getXofMissileShoot(),
                shooter.getYofMissileShoot(),
                px, py, // target location where the missile explodes
                Color.RED);

        Main.gameData.friendFigures.add(m);

    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

}
