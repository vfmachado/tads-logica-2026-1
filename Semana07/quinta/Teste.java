package quinta;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Teste extends JPanel {
    /*
        0, 0            400, 0  
             -----------
            |           |
            |           |
             -----------
         0, 400         400, 400
    */
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);

        // int coordX = 20;
        // while (coordX < 400) {
        //     g.drawRect(coordX, 20, 30, 30);
        //     coordX = coordX+50;
        // }

        // g.drawLine(0, 20, 400 , 20);
        // g.drawString("0, 20", 0, 20);

        // int x1 = 0;
        // g.drawLine(x1, 200, 400, 200);
        // g.drawLine(200, 200,  200, 400);
        // g.drawLine(200, 300,  400, 300);
        // // linhas horizontais com 20 de espaçamento

        // g.setColor(Color.BLUE);
        // g.fillOval(50, 50, 20, 20);

        // padrao escadinha
        int x = 0;
        int y = 0;
        while (x < 400) {
            g.drawLine(x, y, x+20, y);
            g.drawLine(x+20, y, x+20, y+20);
            x = x+20;
            y = y+20;
        }
        
    }

    public static void main(String[] args) {
        JFrame janela = new JFrame("JANELA");
        janela.setSize(400, 430);
        janela.add(new Teste());
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
