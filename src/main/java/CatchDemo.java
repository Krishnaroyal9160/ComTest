
public class CatchDemo {

	public static void main(String[] args) {
		{
			System.out.println("program starts");
			@SuppressWarnings("unused")
			int num = 40;
			int [] a1 = new int [5];
			a1 [0] = 47;
		    try
		    {
		    	System.out.println("result="+num/0);
		    	System.out.println("Arrayvalue"+a1[0]);
		    }
		    catch(ArithmeticException ae) {
		    	System.out.println("Caught Arithmatic Exception");
		    }
		    catch (ArrayIndexOutOfBoundsException aie) {
				System.out.println("Caught AIO Exception");
				aie.printStackTrace();
			}
				System.out.println("Program ends");
			
		}

	}
}


