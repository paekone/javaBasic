package a_variable;

//주석: 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용한다.)
//한줄 주석: Ctrl + shift + c
/*범위 주석 : Ctrl + shift +/(해제: \) 
*/

//클래스(class) : 데이터와 처리내용의 집합 
//사용하고 싶은 클래스, 데이터, 처리내용 등이 있는 경우 선언을 통해 의사표현을 해야한다.
//선언 : 사용하고자 하는 것의 종류와 이름을 컴퓨터에게 알려주는 것.
public class ABC {
	//{} : 블럭(내용의 범위)
	//변수 : 데이터
	
	int variable;
	//메서드(method) : 기능(처리)
	//main 메서드 : 프로그램의 시작과 끝
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//블럭이 시작되면 Tab(탭) 1칸으로 계층을 표현(계층을 쉽게 구분하기 위해)
		//코드는 기본적으로 위에서 아래로 왼쪽에서 오른쪽으로 실행된다.
		//실행할 문장을 메서드 안에 넣는다.
		System.out.println("Hello"); //괄호안에 있는 내용을 콘솔창에 출력하는 메소드
		System.out.print("Hello");
	}
}
