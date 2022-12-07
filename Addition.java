import java.awt.*;
import java.awt.event.*;

class Addition extends Frame implements ActionListener, WindowListener
{
	TextField t1,t2,t3;
	public Addition()
	{
		this.setLayout(null);
		this.setBackground(new Color(58,58,58));
		
		Font f1 = new Font("Serif",Font.BOLD,20);

		 t1 = new TextField(30);
		 t1.setBounds(70,80,400,30);
		 
		 t2 = new TextField(30);
		 t2.setBounds(70,140,400,30);
		 
		 t3 = new TextField(30);
		 t3.setBounds(70,260,400,30);
		 
		Label l3 = new Label("This above TextField cannot be Edited");
		Button b1 = new Button("ADD");
		b1.setBounds(250,200,60,30);
		b1.setBackground(new Color(255,0,0));
		
		add(t1);  add(t2); add(b1); add(t3); add(l3);
		t1.setFont(f1); t2.setFont(f1); b1.setFont(f1); t3.setFont(f1); l3.setForeground(Color.red);
		
		t3.setEditable(false);

		b1.addActionListener(this);
		addWindowListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		int c = a + b;
		t3.setText(""+c);
	}
	public static void main(String vin[])
	{
		Addition a = new Addition();
		a.setVisible(true);
		a.setSize(550,400);
		a.setTitle("Addition");
	}
	public void windowClosing(WindowEvent w)
	{
		dispose();
	}
	public void windowActivated(WindowEvent w)
	{}
	public void windowClosed(WindowEvent w)
	{
		/* dispose(); */
	}

	public void windowDeactivated(WindowEvent w)
	{
		/* dispose(); */
	}
	public void windowDeiconified(WindowEvent w)
	{
		/* dispose(); */
	}
	public void windowIconified(WindowEvent w)
	{}
	public void windowOpened(WindowEvent w)
	{}
}