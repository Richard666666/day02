//1TBS-one True Bracing Style-Dennis Ritche
//Allman-FreeBSD
import java.lang.String;//lang是java的核心文件夹，java虚拟机自动加载
import java.lang.System;
import javax.swing.JFrame;

class Student//类的命名首字母大写
{
	//学生的属性；定义变量，自变量是什么类型（申请内存）
	String id;
	String name;
	String gender;

	//学生的行为,写成方法；

	void eat(String place,String food)//写上void表示没有因变量
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
class Teacher//类的命名首字母大写
{
	//学生的属性；定义变量，自变量是什么类型（申请内存）
	String id;
	String name;
	String gender;
	int age;
	//学生的行为,写成方法；

	void eat(String place,String food)//写上void表示没有因变量
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
public class Game1//类的名字要保持完全一致，public是可以拿给别人用
{
	public static void	main(String[] args)
	{
		System.out.println("Hello,world!");
		System.out.println("welcome the world!");

		Student stu=new Student();//造出了学生对象
		stu.name="Mr Wang";
		stu.eat("CSC","dinner");
		stu.study("Tsinghua University","MBA");
		stu.playGame("home","LOL");

		Teacher tea=new Teacher();//造出了老师对象
		tea.name="Miss Zhang";
		tea.eat("CSC","dinner");
		tea.study("Tsinghua University","MBA");
		tea.playGame("home","LOL");

		JFrame f=new JFrame();
		f.setTitle("大球吃小球");
		f.setSize(800,600);//先写
		f.setLocationRelativeTo(null);//后写
		f.setVisible(true);

	}
}