import java.util.*;

public class problem_1
{
    public static void main(String[] args)
    {
  	Scanner in = new Scanner(System.in);          
	System.out.println("the first resistance?");
	double first=in.nextDouble();
	System.out.println("the second resistance?");
	double second=in.nextDouble();

	Resistance r1= new Resistance(first);
	Resistance r2= new Resistance(second);
	
	double series=r1.get_value()+r2.get_value();
	double parallel=(r2.get_value()*r2.get_value())/(r2.get_value()+r2.get_value());
	System.out.println("The total resistance in series: "+series);
	System.out.println("The total resistance in parallel:"+parallel);

    }	
}

