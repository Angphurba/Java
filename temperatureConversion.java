/*
Temperature Conversion
author @Angphurba
*/

public class temperatureConversion
{
   public static void main( String [] args )
   {
      int temp = 32;
			
      int fahrenheit = temp;
	  int celsius; 
      System.out.println( " Temperature Conversion: ");
      System.out.println ( "");
      System.out.println ( " The temperature is 32 degree fahrenheit." );
	  System.out.println ( "");
     
      System.out.println ("Coverting from fahrenheit to celsius.");
      celsius = (5*(fahrenheit-32)/9);
      System.out.println("= "+ fahrenheit +" degree fahrenheit is "+ celsius +" degree celsius.");
	  
	  System.out.println ( "");
      System.out.println ("Coverting from celsius to fahrenheit.");		
      fahrenheit = (9*(celsius/5)+32);
      System.out.println ("= "+ celsius +" degree celsius is "+ fahrenheit +" degree fahrenheit.");
	  System.exit( 0 );	
   }
}
