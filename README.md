## 实验三<br/>
### 学生选课模拟系统<br/>
#### 实验目的<br/>
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；<br/>
掌握面向对象的类设计方法（属性，方法）；<br/>
掌握类的继承用法，通过构造方法实例化对象；<br/>
学会使用super（），用作实例化子类；<br/>
掌握使用对象根类的toString（）方法，应用在相关对象的信息输出中。<br/>
#### 业务要求<br/>
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。<br/>
对象示例：	人员（编号、姓名、性别）<br/>
教师（编号、姓名、性别、所授课程、）<br/>
			学生（编号、姓名、性别、所选课程、）
			课程（编号、课程名称、上课地点、时间、授课教师、）<br/>
#### 实验要求<br/>
1.编写上述实体类以及测试主类。<br/>
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息；模拟学生退课操作，再打印课程信息。<br/>
3.编写实验报告。<br/>
 package zmr;<br/>

	public class Student extends People {<br/>
	 public String courses = "还没有选课,快去开始吧!";<br/>
	 public Student(String name,String sex,int number) {<br/>
	  super();<br/>
	     this.name=name;<br/>
	     this.sex=sex;<br/>
	     this.number=number;<br/>
	 }<br/>
	 void setCourse(String keming) {<br/>
	  this.courses=keming;<br/>
	 }<br/>
	 //void leaveCourse() {<br/>
	  //this.courses="还没有选课,快去开始吧!";<br/>
	 //}<br/>
	}<br/>
  package zmr;<br/>

public class Teacher extends People{<br/>
 public String lessonname;<br/>
 public String lessontime;<br/>
 public String lessonplace;<br/>
 Teacher(int number,String name,String sex) {<br/>
  super();<br/>
  this.number=number;<br/>
     this.name=name;<br/>
     this.sex=sex;<br/>
 }<br/>
 void setCourse1(String lessonname) {<br/>
  this.lessonname=lessonname;<br/>
 }<br/>
 void setCourse2(String lessontime) {<br/>
  this.lessontime=lessontime;<br/>
 }<br/>
 void setCourse3(String lessonplace) {<br/>
  this.lessonplace=lessonplace;<br/>
 }<br/>
}<br/>
package zmr;<br/>

public class People {<br/>
 int number;<br/>
 String name,sex;<br/>
 public void setNumber(int number) {<br/>
  this.number=number;<br/>
 }<br/>
 public void setName(String name) {<br/>
  this.name=name;<br/>
 }<br/>
 public void setSex(String sex) {<br/>
  this.sex=sex;<br/>
 }<br/>

}<br/>
package zmr;<br/>

public class basic {<br/>
	String name;<br/>
	int number;<br/>
	String sex;<br/>
	basic(String name,int number,String sex){<br/>
		this.name=name;<br/>
		this.number=number;<br/>
		this.sex=sex;<br/>
	}<br/>

}<br/>
package zmr;<br/>

public class Test {<br/>
	 public static String toString(Student stu) {<br/>
		  return " 学生姓名: "+stu.name+" 学号: "+stu.number+" 学生性别: "+stu.sex+" 已选课程: "+stu.courses;<br/>
		 }<br/>
		 //提示教师的课程信息<br/>
		 public static String toChoose(Teacher tea) {<br/>
		  return " 老师编号: "+tea.number+" 老师姓名: "+tea.name+" 老师性别: "+tea.sex+" 所教课程: "+tea.lessonname+" 上课时间:"+tea.lessontime+" 上课地点: "+tea.lessonplace;<br/>
		 }<br/>
		 public static void main(String[] arg) {<br/>
		  //学生登录界面<br/>
		     System.out.println("请输入姓名以及学号");<br/>
		     //学生信息<br/>
		     Student stu = new Student("再米热","女",2019311573);<br/>
		     //老师信息<br/>
		     Teacher tea1 = new Teacher(001,"老张","男");<br/>
		     tea1.setCourse1("java");<br/>
		     tea1.setCourse2("7:50");<br/>
		     tea1.setCourse3("教300");<br/>
		     Teacher tea2 = new Teacher(002,"老魏","女");<br/>
		     tea2.setCourse1("离散");<br/>
		     tea2.setCourse2("13:30");<br/>
		     tea2.setCourse3("教300");<br/>
		     Teacher tea3 = new Teacher(003,"老陈","女");<br/>
		     tea3.setCourse1("线代");<br/>
		     tea3.setCourse2("9:40");<br/>
		     tea3.setCourse3("教104");<br/>
		     System.out.println(toString(stu));<br/>
		     stu.setCourse("线代");<br/>
		     System.out.println(toChoose(tea1));<br/>
		     System.out.println(toChoose(tea2));<br/>
		     System.out.println(toChoose(tea3));<br/>
		     System.out.println("请根据提示开始选课!");<br/>
		     System.out.println(toString(stu));}<br/>
		}<br/>




