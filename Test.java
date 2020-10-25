package zmr;

public class Test {
	 public static String toString(Student stu) {
		  return " 学生姓名: "+stu.name+" 学号: "+stu.number+" 学生性别: "+stu.sex+" 已选课程: "+stu.courses;
		 }
		 //提示教师的课程信息
		 public static String toChoose(Teacher tea) {
		  return " 老师编号: "+tea.number+" 老师姓名: "+tea.name+" 老师性别: "+tea.sex+" 所教课程: "+tea.lessonname+" 上课时间:"+tea.lessontime+" 上课地点: "+tea.lessonplace;
		 }
		 public static void main(String[] arg) {
		  //学生登录界面
		     System.out.println("请输入姓名以及学号");
		     //学生信息
		     Student stu = new Student("再米热","女",2019311573);
		     //老师信息
		     Teacher tea1 = new Teacher(001,"老张","男");
		     tea1.setCourse1("java");
		     tea1.setCourse2("7:50");
		     tea1.setCourse3("教300");
		     Teacher tea2 = new Teacher(002,"老魏","女");
		     tea2.setCourse1("离散");
		     tea2.setCourse2("13:30");
		     tea2.setCourse3("教300");
		     Teacher tea3 = new Teacher(003,"老陈","女");
		     tea3.setCourse1("线代");
		     tea3.setCourse2("9:40");
		     tea3.setCourse3("教104");
		     System.out.println(toString(stu));
		     stu.setCourse("线代");
		     System.out.println(toChoose(tea1));
		     System.out.println(toChoose(tea2));
		     System.out.println(toChoose(tea3));
		     System.out.println("请根据提示开始选课!");
		     System.out.println(toString(stu));}
		}
