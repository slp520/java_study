import java.util.Scanner;
public class Student_manage {
	public static void main(String[] args){		
		Scanner in=new Scanner(System.in);
		System.out.println("������ѧ����������");
		int renshu=in.nextInt();
		System.out.println("������γ̵���Ŀ��");
		int num=in.nextInt();
		String[] course=new String[num];
		String[] name=new String[renshu];
		int[][] score=new int[renshu][num];
		for(int i=0;i<num;i++){
			System.out.println("�������"+(i+1)+"�ſε�����");
			course[i]=in.next();
		}
		for(int i=0;i<renshu;i++){
			System.out.println("�������"+(i+1)+"λѧ������");
			name[i]=in.next();
			for(int j=0;j<num;j++){
			System.out.println("������"+name[i]+"��"+course[j]+"�ɼ�");
			System.out.println();
			score[i][j]=in.nextInt();
			}		
		}
		System.out.print("ѧ��");
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
