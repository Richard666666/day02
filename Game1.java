//1TBS-one True Bracing Style-Dennis Ritche
//Allman-FreeBSD
import java.lang.String;//lang��java�ĺ����ļ��У�java������Զ�����
import java.lang.System;
import javax.swing.JFrame;

class Student//�����������ĸ��д
{
	//ѧ�������ԣ�����������Ա�����ʲô���ͣ������ڴ棩
	String id;
	String name;
	String gender;

	//ѧ������Ϊ,д�ɷ�����

	void eat(String place,String food)//д��void��ʾû�������
	{
		System.out.println(name+"eat"+food+"in"+place);
	}
	
	void playGame(String place,String gameName)
	{
		System.out.println(name+ "play"+gameName+"in"+place);
	}

	void study(String place,String course)
	{
		System.out.println(name+"attend to"+course+"at"+place);
	}
}
/*****************************************************/
class Teacher//�����������ĸ��д
{
	//ѧ�������ԣ�����������Ա�����ʲô���ͣ������ڴ棩
	String id;
	String name;
	String gender;
	int age;
	//ѧ������Ϊ,д�ɷ�����

	void eat(String place,String food)//д��void��ʾû�������
	{
		System.out.println(name+"eat"+food+"in"+place);
	}
	
	void playGame(String place,String gameName)
	{
		System.out.println(name+"play"+gameName+"in"+place);
	}

	void study(String place,String course)
	{
		System.out.println(name+"attend to"+course+"at"+place);
	}
}

/*****************************************************/
public class Game1//�������Ҫ������ȫһ�£�public�ǿ����ø�������
{
	public static void	main(String[] args)
	{
		System.out.println("Hello,world!");
		System.out.println("welcome the world!");

		Student stu=new Student();//�����ѧ������
		stu.name="Mr Wang";
		stu.eat("CSC","dinner");
		stu.study("Tsinghua University","MBA");
		stu.playGame("home","LOL");

		Teacher tea=new Teacher();//�������ʦ����
		tea.name="Miss Zhang";
		tea.eat("CSC","dinner");
		tea.study("Tsinghua University","MBA");
		tea.playGame("home","LOL");

		JFrame f=new JFrame();
		f.setTitle("�����С��");
		f.setSize(800,600);//��д
		f.setLocationRelativeTo(null);//��д
		f.setVisible(true);

	}
}