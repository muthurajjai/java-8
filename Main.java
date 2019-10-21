package collector;
import java.util.*;
import java.util.stream.Collectors;



	
		class student{
			public int getId() {
				return id;
			}
			public String getName() {
				return name;
			}
			public int getAge() {
				return age;
			}
			public void setId(int id) {
				this.id = id;
			}
			public void setName(String name) {
				this.name = name;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public student(int id, String name, int age) {
				super();
				this.id = id;
				this.name = name;
				this.age = age;
			}
			int id;
			String name;
			int age;
			@Override
			public String toString() {
				return "student [id=" + id + ", name=" + name + ", age=" + age + "]";
			}
			
			
		}
		
		
		public class Main {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
        List<student> s1=new ArrayList<student>();
		Scanner x=new Scanner(System.in);
		
        student obj[]=new student[3];
	System.out.println("Enter the values");

for(int i=0;i<3;i++)
		{
System.out.println("Student Id");
			int id=x.nextInt();
System.out.println("Student name");
			String name=x.next();
System.out.println("Age");
			int age=x.nextInt();
			obj[i]=new student(id,name,age); ///doubt	
			s1.add(obj[i]);
		}

Set<Integer> totalage =   s1.stream() .map(xp->xp.age).collect(Collectors.toSet());   // collecting as list  

System.out.println("total age:"+totalage);

Set<Integer> above15=s1.stream() .filter(p ->p.age> 15)   .map(pm ->pm.age).collect(Collectors.toSet());
System.out.println("age above 15:"+above15);

	}
		}


