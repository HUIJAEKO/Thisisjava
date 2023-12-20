package ch05참조타입;

import java.util.Scanner;

public class CountAver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run=true;
		int student=0;
		int[] score=null;
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");
		
			int num = scanner.nextInt();
		
			if(num==1) {
				
				System.out.print("학생수>");
				student=scanner.nextInt();
				score=new int[student];	
				
			}

			if(num==2) {
				
				for(int i=0; i<score.length; i++) {
					System.out.print("점수["+i+"]>");
					score[i]=scanner.nextInt();
				}
				
			}
			if(num==3) {
				
				for(int j=0; j<score.length; j++) {
					System.out.println("점수["+j+"]>"+score[j]);				
				}	
				
			}
			if(num==4) {
				
				int max=score[0];
				int totalscore=0;
				for(int k=0; k<score.length; k++) {
					totalscore+=score[k];
					if(score[k]>max) {
						score[k]=max;
					}
				}
				System.out.println("최고점수:"+max);
				System.out.println("평균점수:"+(double)totalscore/student);
				
			}
			if(num==5) {
				
				System.out.println("프로그램 종료");
				run=false;
				
			}
		}
	}
}
