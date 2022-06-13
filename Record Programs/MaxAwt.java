import java.awt.*;
import java.awt.event.*;
public class MaxAwt extends Frame {
	TextField t1;
	TextField t2;
	TextField t3;
	TextField t4;
	Label l1,l2,l3,l4;
	Button b1,b2;
	MaxAwt(){
		setTitle("MAXIMUM");
		t1=new TextField();
		l1=new Label(" Enter 1st No ");
		l1.setBounds(100,45,145,20);
		t1.setBounds(100,75,145,20);
		
		
		t2=new TextField();
		l2=new Label(" Enter 2nd No ");
		l2.setBounds(100,110,145,20);
		t2.setBounds(100,145,145,20);
		
		
		t3=new TextField();
		l3=new Label(" Enter 3rd No ");
		l3.setBounds(100,170,145,20);
		t3.setBounds(100,200,145,20);
		
		
		t4=new TextField();
		l4=new Label(" ");
		l4.setBounds(100,240,145,20);
		t4.setBounds(100,250,135,20);
		
		
		b1=new Button("FIND");
		b1.setBounds(105,278,70,40);
		
		b2=new Button("EXIT");
		b2.setBounds(195,278,70,40);
		
		add(b1);
		add(b2);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		
		setSize(100,100);
		setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=Integer.parseInt(t3.getText());
				if(a>b && a>c) {
					l4.setText("MAXIMUM = "+String.valueOf(a));
				}
				else if(b>c) {
					l4.setText("MAXIMUM = "+String.valueOf(b));
				}
				else {
					l4.setText("MAXIMUM = "+String.valueOf(c));
				}
				
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);;
			}
		});
	}
	
		public static void main(String args[]) {
			new MaxAwt();
		}
}
