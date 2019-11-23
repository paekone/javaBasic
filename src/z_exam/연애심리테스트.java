package z_exam;

import java.util.Scanner;

public class 연애심리테스트 {
	static Scanner s = new Scanner(System.in);
	static String answer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("연애심리 테스트입니다.");
		System.out.println("아래문항에 답해주세요");
		func1();
	}
	static void func1(){
		System.out.println("나는 금사빠다");
		System.out.println("Y/N");
		answer = s.nextLine();
		if(answer.equals("Y")){
			func2();
		} 
		else if(answer.equals("N"));
		{
			func4();
		}
	}
	static void func2(){
		System.out.println("연애할 때 끌려다니는 타입니다.");
		System.out.println("Y/N");
		answer = s.nextLine();
		if(answer.equals("Y")){
			func5();
		}
		else if(answer.equals("N")){
			func3();
		}
	}
	static void func3(){
		System.out.println("데이트 코스는 미리 짜는게 편하다.");
		System.out.println("Y/N");
		answer = s.nextLine();
		if(answer.equals("Y")){
			func6();
		}
		else if(answer.equals("N")){
			func5();
		}
	}
	static void func4(){
		System.out.println("감정기복이 크지 않다.");
		System.out.println("Y/N");
		answer = s.nextLine();
		if(answer.equals("Y")){
			func7();
		} 
		else if(answer.equals("N"));
		{
			func5();
		}
	}
	static void func5(){
		System.out.println("감정 표현에 솔직한 편이다.");
		System.out.println("Y/N");
		answer = s.nextLine();
		if(answer.equals("Y")){
			func8();
		} 
		else if(answer.equals("N")){
			func6();
		}
	}
	static void func6(){
		System.out.println("활동적인 데이트가 좋다.");
		System.out.println("Y/N");
		answer = s.nextLine();
		if(answer.equals("Y")){
			func8();
		}
		else if(answer.equals("N")){
			func9();
		}
	}
	static void func7(){
		System.out.println("연락이 없어도 믿고 기다리는 편이다.");
		System.out.println("Y/N");
		answer = s.nextLine();
		if(answer.equals("Y")){
			System.out.println("Type A");
		} 
		else if(answer.equals("N")){
			func8();
		}
	}
	static void func8(){
		System.out.println("이성친구는 존재할 수 없다.");
		System.out.println("Y/N");
		answer = s.nextLine();
		if(answer.equals("Y")){
			func9();
		}
		else if(answer.equals("N")){
			System.out.println("Type B");
		}
	}
	static void func9(){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
		System.out.println("Y/N");
		answer = s.nextLine();
		if(answer.equals("Y")){
			System.out.println("Type D");
		}
		else if(answer.equals("N")){
			System.out.println("Type C");
		}
	}
}
