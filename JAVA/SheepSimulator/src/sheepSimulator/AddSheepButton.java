package sheepSimulator;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

public class AddSheepButton extends Button {
	public AddSheepButton() {

		this.buttonImage = new ImageIcon(MainClass.class.getResource("../res/image/quit.png"));
		this.buttonEnteredImage = new ImageIcon(MainClass.class.getResource("../res/image/quit_entered.png"));

		this.setIcon(this.buttonImage);
		this.setBounds(375, 470, 535, 120);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				buttonEntered = new Music("ButtonEntered.mp3");
				buttonEntered.start();
				setIcon(buttonEnteredImage);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setIcon(buttonImage);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				buttonPressed = new Music("ButtonPressed.mp3");
				buttonPressed.start();
				//양 추가 인터페이스 구현
			}
		});
	}
}
