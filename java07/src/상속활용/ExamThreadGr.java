package 상속활용;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class ExamThreadGr extends JFrame{
static ExamThreadGr f;
JLabel boat;
JLabel boat1;
ExamThread race;
ExamThread2 race1;
	public ExamThreadGr() {
		getContentPane().setLayout(null);
		setSize(500, 500);
		boat = new JLabel("New label");
		boat.setIcon(new ImageIcon("D:\\java workspace\\java07\\3.png"));
		boat.setBounds(0, 50, 130, 130);
		getContentPane().add(boat);
		
		boat1 = new JLabel("New label");
		boat1.setIcon(new ImageIcon("D:\\java workspace\\java07\\3.png"));
		boat1.setBounds(0, 180, 130, 130);
		getContentPane().add(boat1);
		race=new ExamThread();
		race1=new ExamThread2();
		setVisible(true);
		race.start();
		race1.start();
	}
	public static void main(String[] args) {
		f=new ExamThreadGr();
	}
	public class ExamThread extends Thread{
		@Override
		public void run() {
			for (int i = 0; i <= 500; i+=50) {
				boat.setBounds(i, 50, 130, 130);
				try {
					Thread.sleep(1000);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
		}
	}
	public class ExamThread2 extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 500; i+=50) {
				boat1.setBounds(i, 180, 130, 130);
				try {
					Thread.sleep(1000);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
	}

	}
}
