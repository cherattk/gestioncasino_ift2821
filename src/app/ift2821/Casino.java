package app.ift2821;

import java.awt.EventQueue;

import app.ift2821.view.MainWindow;

public class Casino {
	
	public static void main(String[] args) {

		Runnable runner = new Runnable() {
			public void run() {
				try {					
					MainWindow.initialize();			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		EventQueue.invokeLater(runner);

	}

}
