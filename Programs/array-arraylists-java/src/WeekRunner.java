
public class WeekRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wedenesday", "Thursday", "Friday", "Saturday"};
		
			String longestString = "";
			for (int i=0;i<daysOfWeek.length;i++){
				if(daysOfWeek[i].length()>longestString.length()){
					longestString = daysOfWeek[i];
					
				}
			}
			System.out.println(longestString);
			
			for(int i=daysOfWeek.length-1;i>=0;i--){
				System.out.println(daysOfWeek[i]);
			}

		}

	}


