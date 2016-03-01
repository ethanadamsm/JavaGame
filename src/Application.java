import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame {

	public Application(){
		initUI();
	}
	
	private void initUI(){
		add(new Board());
		
		setSize(800, 400);
		
		setTitle("Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		Map maps = new Map("map.txt");
	}
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				Application ex = new Application();
				ex.setVisible(true);
			}
		});
		
	}
	
}
