import java.awt.*;
import java.awt.event.*;

class Select3 extends Frame implements KeyListener, WindowListener
{
	TextField t1,t2;
	
	public Select3()
	{
		this.setLayout(null);
		Font f = new Font("Serif",Font.BOLD,22);
		this.setBackground(new Color(50,155,255));
		
		Label l2 = new Label("Type here");
		l2.setFont(new Font("Serif", Font.ITALIC|Font.BOLD,22));
		l2.setForeground(Color.white);
		l2.setBounds(50,60,500,30);
		
		Label l = new Label("The Above TextField is Not Editable");
		l.setFont(f);
		l.setForeground(Color.black);
		l.setBounds(120,250,500,30);
		
		t1 = new TextField( 40);
		t1.setBounds(50,100,500,30);
		
		
		t2 = new TextField(40);
		t2.setBounds(50,180,500,30);
		
		t1.setFont(f);
		t2.setFont(f);
		t2.setEditable(false);
		
		
		add(t1);
		add(t2);
		add(l);
		add(l2);
		
		t1.addKeyListener(this);
		addWindowListener(this);
	}
	public void keyReleased(KeyEvent ae)
	{
		Object o = ae.getSource();
		
			t2.setText(t1.getText());
			
		
	}
	public void keyTyped(KeyEvent ae)
	{}
	public void keyPressed(KeyEvent ae)
	{}
	
	/*------------------------WINDOW CLOSING EVENT HERE----------------------*/
	
	public void windowClosing(WindowEvent w)
	{
		dispose();
	}
	public void windowActivated(WindowEvent w)
	{}
	public void windowClosed(WindowEvent w)
	{
		dispose();
	}

	public void windowDeactivated(WindowEvent w)
	{}
	public void windowDeiconified(WindowEvent w)
	{}
	public void windowIconified(WindowEvent w)
	{}
	public void windowOpened(WindowEvent w)
	{}
	public static void main(String vin[])
	{
		Select3 s = new Select3();
		s.setVisible(true);
		s.setTitle("Just Type");
		s.setSize(600,400);
		
	}
}
