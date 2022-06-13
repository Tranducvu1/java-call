package ChatApp;



	import java.awt.Container;
import java.awt.EventQueue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

	public class VideoCallServer extends JFrame{

		JFrame fcus= new JFrame("Call");
		 static JLabel img_server = new JLabel();


public VideoCallServer() {
			// TODO Auto-generated constructor stub
			fcus.setLocation(300,20);

			Container contc = fcus.getContentPane();
			contc.add(img_server);

			fcus.setSize(400,400);
			fcus.setVisible(true);
	}
		
		@SuppressWarnings("resource")
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			// TODO Auto-generated method stub
	
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new VideoCallServer().setVisible(true);
	}
		
	
		});
		 ServerSocket Server = new ServerSocket(2190);
		
		System.out.print("wait......");
		
		Socket s = Server.accept();
		
		System.out.print("Connected hehe");
		
		ObjectInputStream in = new ObjectInputStream(s.getInputStream());
		ImageIcon ic;
		
		while(true) {
			ic = (ImageIcon) in.readObject();		
			img_server.setIcon(ic);
		}
	}
	}
	
		


