package inheritance.oo_workspace;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s001 = new Student("S001","������","�İ�");
//		Instructor i001 = new Instructor("I001", "������", "REact");
//		Employee e001 = new Employee("E001","�̻���","������");
		
		//��ü�� ������: �θ�Ÿ���� ��ü������ �ڽ� �����ڷ� �ʱ�ȭ
		Person [] persons = new Person[33];
		persons[0] = new Student("S001","������","�İ�");
		persons[1] = new Instructor("I001", "������", "React");
		persons[2] = new Employee("E001","�̻���","������");
		
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
