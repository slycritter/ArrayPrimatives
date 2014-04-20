package arrayOfPrimatives;
import javax.swing.JOptionPane;


public class ArrayPrim 
{
	
	public ArrayPrim()
	{
	String message = "You will be asked for 10 number\n" +
						"input -99 to exit program ";	
	int prim[] = new int[10];
	String s = " ";
	String output = " ";
	int num;
	//intake and forward loop
	for(num = 0; num < prim.length; num++ )
	{
		
		 String list = JOptionPane.showInputDialog("Please enter your numbers ");
		 prim[num] = Integer.parseInt(list);
		 output += prim[num];
		 //breaks if -99
		 if(prim[num] == -99) break;
	}
	
	JOptionPane.showMessageDialog(null, output );
	//backwards loop
	for(int p = num-1; p > -1; p-- )
	{
		s += prim[p];
	}
	
	JOptionPane.showMessageDialog(null, s);
	}

}
