import java.util.Random;
import java.util.Scanner;
public class Run {
	void run() {
		Random rd =new Random();
		Sort sort =new Sort();
		Scanner s = new Scanner(System.in);
		boolean T = true;
		int no ;
		int ran[] = new int[20];
		while(T) {
			System.out.println("----------------------------");
			System.out.println("선택하세요");
			System.out.println("1.합병정렬 2.힙 정렬 3.퀵 정렬 4.랜덤배열 생성 9.종료");
			System.out.println("----------------------------");
			no = s.nextInt();
			switch(no) {
			case 1:
				System.out.println("합병정렬");
				sort.mergeSort(ran);
				sort.print(ran);
				break;
			case 2:
				System.out.println("힙정렬");
				sort.heapSort(ran);
				sort.print(ran);
				break;
			case 3:
				System.out.println("퀵 정렬");
				sort.quickSort(ran);
				sort.print(ran);
				break;
			case 4:
				for(int i=0;i<20;i++) {
					ran[i] =(int)(Math.random()*100+1);
					System.out.print(ran[i]+" ");
				}
				
				System.out.println();
				break;

			case 9:
				T = false;
				break;
			} 
			}
		}
	}
			
