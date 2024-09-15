package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Mapa extends JFrame {

	//private JPanel contentPane;
	private Background contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mapa frame = new Mapa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mapa() {
		setTitle("Mapa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 406);
		contentPane = new Background();

		setContentPane(contentPane);
		
		
	}
	
	class Background extends JPanel{
		
		private Image backgroundImage;
		
		public Background() {
			
			backgroundImage = new ImageIcon(Mapa.class.getResource("/imagens/MapaSonic.jpg")).getImage();
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
		}
		
	}
	
}