import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class Fool extends JFrame implements MouseListener,ActionListener
{
	Container c;
	JButton yes,no;
	JLabel label1,label2,imglabel;
	ImageIcon image;
	Random r;
	NewFrame2 n2=new NewFrame2(this);;
	NewFrame1 n1=new NewFrame1(this);
	public Fool()
	{
		addComponent();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,800,600);
		setVisible(true);
		setResizable(false);
		
	}
	public void addComponent()
	{
		r=new Random();
		
		c=getContentPane();
		c.setLayout(null);

		label1=new JLabel("WELLCOME TO THE WORLD OF FOOLS");
		label1.setBounds(100,30,600,40);
		label1.setFont(new Font("ALGERIAN",Font.BOLD,30));
		c.add(label1);
		
		label2=new JLabel("ARE YOU A FOOL?");
		label2.setBounds(250,100,300,40);
		label2.setFont(new Font("ALGERIAN",Font.BOLD,30));
		c.add(label2);
		
		yes=new JButton("YES");
		yes.setBounds(250,210,80,40);
		yes.addMouseListener(this);
		yes.addActionListener(this);
		c.add(yes);
		
		no=new JButton("NO");
		no.setBounds(445,210,80,40);
		no.addMouseListener(this);
		no.addActionListener(this);
		c.add(no);
		
		
	}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource().equals(no))
		{
			no.setBounds(r.nextInt(690),r.nextInt(390)+160,80,40);
		}
	}
	public void mouseExited(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(yes)) 
		{
			this.setVisible(false);
			n1.setVisible(true);
			//NewFrame1 n1=new NewFrame1(this);
		}
		if(e.getSource().equals(no)) 
		{
			this.setVisible(false);
			n2.setVisible(true);
			//NewFrame2 n2=new NewFrame2(this);
		}
	}
	public static void main(String args[])
	{
		Fool fool=new Fool();
		
	}
	

}