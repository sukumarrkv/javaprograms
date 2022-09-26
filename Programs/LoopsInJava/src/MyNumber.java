
public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		for(int i=2;i<number;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		int sum = 0;
		for(int i=1;i<=number;i++){
			sum = sum +i;
		}
		return sum;
	}

	public int sumoOfDivisor() {
		int sumOfDivisor=0;
	     for(int i=2;i<number;i++){
	    	 if(number%i==0){
	    		 sumOfDivisor = sumOfDivisor+i;
	    	 }
	     }
		return sumOfDivisor;
	}

	public void printNumberTraingle() {
		for(int i=1;i<=number;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" " + j);
			}
			System.out.println();
		}
		
	}
  	
}
