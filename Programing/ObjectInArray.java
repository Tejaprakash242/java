package Programing;

class Student{
	int rollno ;
	String name;
	int marks;
}


public class ObjectInArray 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		int i;
		s1.rollno = 1;
		//s1.name = "Teja";
		s1.marks = 99;
		
		Student s2 = new Student();
		s2.rollno = 1;
		//s2.name = "Prakash";
		s2.marks = 90;
		 
		Student s3 = new Student();
		s3.rollno = 1;
		//s3.name = "Reddy";
		s3.marks = 94;
		
		
		
		
		Student students[] = new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for (i=0;i<students.length;i++)
		{
			System.out.println(students[i].rollno + " : " + students[i].marks);
		}
		/*for (Student stud : students)
		{
			System.out.println(stud.name + " : " + stud.marks);
		}
		*/
		
		
		

	}

}
