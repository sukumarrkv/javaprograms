
public class WhilePlayerNumber {

	private int limit;

	public WhilePlayerNumber(int limit) {
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
		int i=1;
		while(i*i<limit){
			System.out.print(i*i + " ");
			i++;
		}
		System.out.println();
	}

	public void printCubesUptoLimit() {
		int i=1;
		while(i*i*i<limit){
			System.out.print(i*i*i + " ");
			i++;
		}
		System.out.println();
	}
	

}
