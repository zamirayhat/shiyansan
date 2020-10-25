package zmr;

	public class Student extends People {
	 public String courses = "还没有选课,快去开始吧!";
	 public Student(String name,String sex,int number) {
	  super();
	     this.name=name;
	     this.sex=sex;
	     this.number=number;
	 }
	 void setCourse(String keming) {
	  this.courses=keming;
	 }
	 //void leaveCourse() {
	  //this.courses="还没有选课,快去开始吧!";
	 //}
	}


