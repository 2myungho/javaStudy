package inheritance.oo_workspace;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s001 = new Student("S001","서동주","컴공");
//		Instructor i001 = new Instructor("I001", "이은진", "REact");
//		Employee e001 = new Employee("E001","이상희","교육부");
		
		//객체의 다형성: 부모타입의 객체생성시 자식 생성자로 초기화
		Person [] persons = new Person[33];
		persons[0] = new Student("S001","서동주","컴공");
		persons[1] = new Instructor("I001", "이은진", "React");
		persons[2] = new Employee("E001","이상희","교육부");
		
//		System.out.println(s001.toStudent());
//		System.out.println(i001.toInstructor());
//		System.out.println(e001.toEmployee());
		
//		for(int i=0; i<persons.length; i++) {
//			if(persons[i] instanceof Student) {
//				((Student)persons[i]).toStudent(); -->print
//			}else if(persons[i] instanceof Instructor) {
//				((Instructor)persons[i]).toInstructor();  -->print
//			}else if(persons[i] instanceof Employee) {
//				((Employee)persons[i]).toEmployee();  -->print
//			}
//			//System.out.println(persons[i].toString());
//		}
		for(int i=0; i<3; i++) {
			System.out.println(persons[i].toString());
		}
		
//		for(person in persons) {
//			System.out.println(person.toString());
//		}

	}

}
