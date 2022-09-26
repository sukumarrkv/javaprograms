import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentsRunner {

	public static void main(String[] args) {
//		List<Student> students = List.of(new Student(1,"Adam"),new Student(100,"Eve"), 
//				new Student(25,"Rose"));
		Student student1 = new Student(1);
		Student student2 = new Student(1);
		
		System.out.println(student1.equals(student2));
		
//		List<Student> students = new ArrayList<>();
//		students.add(student1);
//		students.add(student2);
//		System.out.println(students.size());
		
		Set<Student> set = new HashSet<>();
		set.add(student1);
		set.add(student2);
		System.out.println(set.size());
		
//		Map<Student, String> map = new HashMap<>();
//		map.put(student1, "s1");
//		map.put(student2, "s2");
//		System.out.println(map.size());
		

	}

}
