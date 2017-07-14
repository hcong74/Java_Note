import javax.swing.*;
import java.awt.*;
import java.awt.enent.*;

public class ControlCircle extends JFrame {
    private JButton jbtEnlarge = new JButton("Enlarge");
    private JButton jbtShrink = new JButton("Shrink");
    private CirclePanel canvas = new CirclePanel();

    public ControlCircle() {
	JPanel panel = new JPanel();
	panel.add(jbtEnlarge);
	panel.add(jbtShrink);

	this.add(canvas, BorderLayout.CENTER);
	this.add(panel, BorderLayout.SOUTH);

        jbtEnlarge.addActionListener(new EnlargeListener());
    }

    public static void main(String[] args) {
	JFrame frame = new ControlCircle();
	frame.setTitle("ControlCircle");
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(200, 200);
	frame.setVisible(true);
    }

    Class EnlargeListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	    canvas.enlarge();
	}
    }
    class CirclePanel extends JPanel {
        private int radius = 5;

	public void enlarge() {
	    radius++;
	    repaint();
	}

        protected void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    g.drawOval(getWidth() / 2 - radius, getHeigth() / 2 - radius, 
		2 * radius, 2 * radius);
        }
    }
}
