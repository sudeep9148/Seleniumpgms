package scripts;

public class ConversionStringtoInteger
 
{
public static void main(String[] args) throws InterruptedException
		{
		String price="₹33,499";
		String convert = price.replaceAll("₹","");
		System.out.println(convert);
		String converted = convert.replaceAll(",","");
		System.out.println(converted);
		int actual_price=Integer.parseInt(converted);
		System.out.println(actual_price);
		}
}