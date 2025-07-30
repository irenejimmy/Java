package irene;


class Student{
	int rollno;
	String name;
	int m1,m2,m3;
	float avg;
	Student(int rollno,String name,int m1,int m2,int m3){
		this.rollno = rollno;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public float calculateAverage() {
	return (m1+m2+m3)/3;
}
	public void displayDetails() {
		System.out.println("Roll Number" +rollno);
		System.out.println("Name" +name);
		System.out.println("Mark1" +m1);
		System.out.println("Mark2" +m2);
		System.out.println("Mark3" +m3);
		System.out.println("Average" +calculateAverage());
	}
}
	public class Basics11 {
		public static void main(String[] args) {
			Student Student1=new Student(41,"Irene", 40, 20, 30);
			Student Student2=new Student(20,"Amala", 30, 25, 40);
			Student1.displayDetails();
			Student2.displayDetails();
			
		}
	}


