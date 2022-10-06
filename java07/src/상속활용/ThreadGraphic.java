package 상속활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThreadGraphic extends JFrame {
JLabel count,img,day;

CountThread count2;
TimeThread2 time;
ImgThread imga;
static ThreadGraphic TG;
	public ThreadGraphic() {
		getContentPane().setBackground(Color.GREEN);;
		count = new JLabel("카운터");
		img = new JLabel("이미지");
		day = new JLabel("시각");
		Font font = new Font("궁서",Font.BOLD,30);
		count.setFont(font);
		day.setFont(font);
		setSize(800, 300);
		add(count,BorderLayout.WEST);
		add(img,BorderLayout.EAST);
		add(day,BorderLayout.SOUTH);
		setVisible(true);
		imga = new ImgThread();
		time = new TimeThread2();
		count2 = new CountThread();
		count2.start();
		time.start();
		imga.start();
	}

	public static void main(String[] args) {
		TG = new ThreadGraphic();

	}

	public class CountThread extends Thread {

		@Override
		public void run() {
			for (int i = 20; i >= 0; i--) {
//				System.out.println("카운터>> " + i);
				count.setText("카운트>> "+i);
				try {
					Thread.sleep(1000);

				} catch (Exception e) {
					// TODO: handle exception
				}
				if (i == 0) {
					JOptionPane.showMessageDialog(TG, "끝");
					imga.stop();
					time.stop();
				}
			}

		}
	}

	public class TimeThread2 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i <= 20; i++) {
				Date date = new Date();
//				System.out.println("시각>> " + date);
				day.setText(date+"");
				try {

					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

	public class ImgThread extends Thread {

		@Override
		public void run() {
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < list.length; i++) {
				//System.out.println(list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				img.setIcon(icon);
				img.setText("");
				try {

					Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
}
