package zmr;

public class Test {
	 public static String toString(Student stu) {
		  return " ѧ������: "+stu.name+" ѧ��: "+stu.number+" ѧ���Ա�: "+stu.sex+" ��ѡ�γ�: "+stu.courses;
		 }
		 //��ʾ��ʦ�Ŀγ���Ϣ
		 public static String toChoose(Teacher tea) {
		  return " ��ʦ���: "+tea.number+" ��ʦ����: "+tea.name+" ��ʦ�Ա�: "+tea.sex+" ���̿γ�: "+tea.lessonname+" �Ͽ�ʱ��:"+tea.lessontime+" �Ͽεص�: "+tea.lessonplace;
		 }
		 public static void main(String[] arg) {
		  //ѧ����¼����
		     System.out.println("�����������Լ�ѧ��");
		     //ѧ����Ϣ
		     Student stu = new Student("������","Ů",2019311573);
		     //��ʦ��Ϣ
		     Teacher tea1 = new Teacher(001,"����","��");
		     tea1.setCourse1("java");
		     tea1.setCourse2("7:50");
		     tea1.setCourse3("��300");
		     Teacher tea2 = new Teacher(002,"��κ","Ů");
		     tea2.setCourse1("��ɢ");
		     tea2.setCourse2("13:30");
		     tea2.setCourse3("��300");
		     Teacher tea3 = new Teacher(003,"�ϳ�","Ů");
		     tea3.setCourse1("�ߴ�");
		     tea3.setCourse2("9:40");
		     tea3.setCourse3("��104");
		     System.out.println(toString(stu));
		     stu.setCourse("�ߴ�");
		     System.out.println(toChoose(tea1));
		     System.out.println(toChoose(tea2));
		     System.out.println(toChoose(tea3));
		     System.out.println("�������ʾ��ʼѡ��!");
		     System.out.println(toString(stu));}
		}
