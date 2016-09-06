import java.text.NumberFormat;


public class Circle {

	
    protected double circumference;
    protected double areaCircle;
    protected static int count = 0;
    public double rad;
    public String formattedCirc;
    public String formattedNum;
    public int pi;
    
      
    //Create an instance of Circle 
   // Circle myCircle = new Circle{
   // }

	public Circle(double radius) {        // Parameterized  constructor that is executed when called by CircleApp      
			// Code the Methods
		
		rad = radius;               // set r to the value received in radius
	}
	    //Calculate and return the Circumference
			
		public double getCircumference() {
			double pi=Math.PI;
			circumference = 2*pi*rad;
			return circumference;
		}
		// Get  the Formatted Circumference
		public String getFormattedCircumference(){
			return formatNumber(getCircumference());
	
	}
		
		// Format the Circumference
		private String formatNumber(double x){
			NumberFormat number = NumberFormat.getNumberInstance();  //call a static method 
			number.setMaximumFractionDigits(2);//Set circumference 2 digits beyond decimal place
			String formattedNum = number.format(x);
			return formattedNum;
		}  
		 {
			// TODO Auto-generated method stub
			
		}
		
		public double getArea(double rad) {  // calculate area  of circle
			 double pi=Math.PI;
			 areaCircle = pi* rad*rad;
			 return areaCircle;
		}
		 
		// Get Formatted area  to Return to Caller
		public String getFormattedArea() {
	         return formatNumber(getArea());
	         
		
		}
		
	//	public static int getObjectCount() {
	//		return count;
	//	}
//}	
		
		
	

	/**
	 * @param args
	 */
}
	


