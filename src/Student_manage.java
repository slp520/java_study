import java.util.Scanner;
public class Student_manage {
	public static void main(String[] args){		
		Scanner in=new Scanner(System.in);
		System.out.println("请输入学生的人数：");
		int renshu=in.nextInt();
		System.out.println("请输入课程的数目：");
		int num=in.nextInt();
		String[] course=new String[num];
		String[] name=new String[renshu];
		int[][] score=new int[renshu][num];
		for(int i=0;i<num;i++){
			System.out.println("请输入第"+(i+1)+"门课的名字");
			course[i]=in.next();
		}
		for(int i=0;i<renshu;i++){
			System.out.println("请输入第"+(i+1)+"位学生姓名");
			name[i]=in.next();
			for(int j=0;j<num;j++){
			System.out.println("请输入"+name[i]+"的"+course[j]+"成绩");
			System.out.println();
			score[i][j]=in.nextInt();
			}		
		}
		System.out.print("学生");
		for(int i=0;i<num;i++){
			System.out.print("\t"+course[i]);			
		}
		System.out.println();
		for(int i=0;i<renshu;i++){
			System.out.print(name[i]);
			for(int j=0;j<num;j++){
				System.out.print("\t"+score[i][j]);
				
			}
			System.out.println();			
		}
	}
}
