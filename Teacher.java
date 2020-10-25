package zmr;

public class Teacher extends People{
 public String lessonname;
 public String lessontime;
 public String lessonplace;
 Teacher(int number,String name,String sex) {
  super();
  this.number=number;
     this.name=name;
     this.sex=sex;
 }
 void setCourse1(String lessonname) {
  this.lessonname=lessonname;
 }
 void setCourse2(String lessontime) {
  this.lessontime=lessontime;
 }
 void setCourse3(String lessonplace) {
  this.lessonplace=lessonplace;
 }
}