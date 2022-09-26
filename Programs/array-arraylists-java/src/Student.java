import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	
	String name;
	int[] marks;
	
	public Student(String name,int[] marks){
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum =0;
		for(int i=0;i<marks.length;i++){
			sum = sum + marks[i];
		}
		return sum;
	}

	public int getMaximumMark() {
		int max = marks[0];
		for (int i=0;i<marks.length;i++){
			if(max<marks[i]){
				max = marks[i];
			}
		}
		return max;
	}

	public int getMinimumMark() {
		int min = marks[0];
		for (int i=0;i<marks.length;i++){
			if(min>marks[i]){
				min = marks[i];
			}
		}
		return min;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = marks.length;
	
		return new BigDecimal(sum).divide (new BigDecimal(number),2,RoundingMode.UP);
	}

	
	}

