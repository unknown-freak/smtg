/**
 * <p>Javadocs comments at class level
 * <p>================================
 * <p>This is a class called student to capture student 
 * details and display the same
 * In the future the result of the student will
 * be integrated with this class
 * 
 * @author Jolvin Dias
 * @version 1.0.0
 * @since 2022-03-23
 */
public class student {
	
	String name;
	int age;
	/**
	 *  <p>This is a parameterised constructor to
	 *  <p>initialise the attributes
	 * @param name  This is the name of the student
	 * @param age  This is the age of the student
	 */
	public student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	/**
	 * <p>This is a copy constructor
	 * @param s object to be copied from
	 */
	public student(student s)
	{
		name=s.name;
		age=s.age;
	}
	/**
	 * <p>This is setter method to set age
	 * @param age This is the age of the student
	 */
	public void setAge(int age)
	{
		this.age=age;
	}
	/**
	 * <p>This is getter method is to return the age of the student
	 * @return returns age
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * <p>This is setter method to set name
	 * @param name This is the name of the student
	 */
	public void setName(String name)
	{
		this.name=name;
	}
	/**
	 * <p>This is getter method is to return the name of the student
	 * @return returns name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 *  This is a method to display student details
	 *  This a link to {@link #getName()}
	 *  This a link to {@link #getAge()}
	 */
	public void Display()
	{
		System.out.println("Name of the student is " +getName());
		System.out.println("Age of the student is " +getAge());
	}
	/**
	 * This is the main program which is the entry point
	 * <p>for execution of this program
	 * @param args final output
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student("jolvin dias",23);
		s1.Display();
		
		student s2=new student("josh reb",20);
		s2.Display();
	}
}
