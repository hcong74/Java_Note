import javax.swing.*;

public class TestButtonIcons extends JFrame {
    public static void main(String[] args) {
	JFrame frame = new TestButtonIcons();
	frame.setTitle("ButtonIcons");
	frame.setSize(200, 100);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }

    public TestButtonIcons() {
	ImageIcon usIcon = new ImageIcon("image/us.jpg");
	ImageIcon caIcon = new ImageIcon("image/ca.jpg");
	ImageIcon ukIcon = new ImageIcon("image/uk.jpg");

	JButton jbt = new JButton("Click it", usIcon);
	jbt.setPressedIcon(caIcon);
	jbt.setRolloverIcon(ukIcon);

	add(jbt);
    }
}
