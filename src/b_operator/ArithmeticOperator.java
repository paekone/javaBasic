package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * << 산술 연산자>>
		 * - + : 더하기
		 * - - : 빼기
		 * - * : 곱하기
		 * - / : 나누기
		 * - % : 나머지
		 * - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 * 
		 */
		int a = 10+20-10*5/10%2;
		System.out.println(a);
		a = (int)(10 + 20.3);
		//피 연산자의 타입이 서로 다를 경우 표현범위가 큰 쪽으로 형변환 후 연산이 수행된다.
		//따라서 연산의 결과도 표현범위가 큰쪽의 타입이된다.
		byte b  = 10;
		short c = 20;
		short d = (short)(c - b);
		//int보다 작은 정수 타입은 int로 형변환 후 연산이된다.
		long e1 = 100000 * 100000L; //피연산자 중 하나는 long이어야 결과로 long을 얻을 수 있다.
		System.out.println(e1);
		float f1= 10 / 4;
		System.out.println(f1); //2.0
		float f2 = 10 / 4f;
		System.out.println(f2);
		int f3 = 10 % 4; //10을 4로 나눈 나머지
		System.out.println(f3);
		//int g1 = 10 / 0; //런타임 에러 발생
		float g2 = 10.0f / 0;
		System.out.println(g2);
		float g3 = 0 / 0f;
		System.out.println(g3); //NaN : Not a number
		
		char h1 = 'A';
		char h2 = (char)(h1 + 1);
		System.out.println(h2);
		
		int h3 = 'D' - 'A'; //68 - 65
		System.out.println(h3);
		
		int h4 = '5' - '0'; //53 - 48
		System.out.println(h4);
		
		//산술 연산자와 대입연산자를 합해 연산식을 줄여서 표현할 수 있다.
		int i = 0;
		i= i+1;
		i += 1;
		i += 2; //복합연산자
		//더하는 값이 1인 경우에는 더 줄일 수 있다.
		++i; //전위형 : 변수가 참조되기 전 수행
		i++; //후위형 : 변수가 참조된 후 수행
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		i= i-1;
		i-= 1;
		--i;
		i--;
		i=i*2;
		i*=2;
		i= i/3;
		i/=3;
		
		i = i%4;
		i %= 4;
		//반올림해서 출력해주세요.
		double round = 50.6;
		round =(int)(round+0.5);
		System.out.println(round);
		
		round = 3.14;
		round = (int)((3.14+0.05)*10);
		System.out.println(round/10);
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.	
		//1. 123456+654321
		//2. 1번의 결과값*123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		long num = 123456+654321;
		System.out.println(num);
		num *= 123456;
		System.out.println(num);
		num /= 123456;
		System.out.println(num);
		num -= 654321;
		System.out.println(num);
		num %= 123456;
		System.out.println(num);
		
		int num2 =123456+654321;
		System.out.println(num2);
		num2 = (int)((long)num2*(long)123456);
		System.out.println(num2);
		num2 = num2/123456;
		System.out.println(num2);
		num2 = num2/123456;
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		//(평균은 소수점 두째자리에서 반올림)
		int n1=9, n2=4, n3=7;
		int result;
		result = n1+n2+n3;
		System.out.println(result);
		System.out.println(((int)(result/3d*10+0.5))/10.0);
		
		
	}

}
