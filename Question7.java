import javax. swing.JOptionPane;

public class Question7 {
	public static void main (String [] args){
		String s1,s4;
		s1=JOptionPane.showInputDialog("please enter the radius(in feet) of your well casing ");
		s4=JOptionPane.showInputDialog("please enter the hight(in feet) of your well casing");
		double radius,height,s5,s6,s7;
		radius= Double.parseDouble(s1);
				
		height= Double.parseDouble(s4);
		s5=radius*radius;
		s6=s5*Math.PI;
		s7=s6*7.48;
		JOptionPane.showMessageDialog(null," the casing holds about "+ s7*height);
	}

}