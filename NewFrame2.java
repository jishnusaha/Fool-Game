import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class NewFrame2 extends JFrame implements ActionListener
{
	Container c;
	JButton back,exit;
	JLabel label1,label2,imglabel;
	ImageIcon image;
	Fool f;
	public NewFrame2(Fool f)
	{
		this.f=f;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,100,600,400);
		setVisible(false);
		setResizable(false);
	
		c=getContentPane();
		c.setLayout(null);

		label1=new JLabel("Great! YOU ARE NOT A FOOL!!");
		label1.setBounds(100,70,600,40);
		label1.setFont(new Font("ALGERIAN",Font.BOLD,30));
		c.add(label1);
		
		
		back=new JButton("back");
		back.setBounds(140,210,80,40);
		back.addActionListener(this);
		c.add(back);
		
		exit=new JButton("exit");
		exit.setBounds(335,210,80,40);
		exit.addActionListener(this);
		c.add(exit);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(back)) 
		{
			this.setVisible(false);
			f.no.setBounds(445,210,80,40);
			f.setVisible(true);
			
		}
		else if(e.getSource().equals(exit)) 
		{
			System.exit(0);
		}
	}
	

}