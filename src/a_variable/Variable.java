package a_variable;

public class Variable {
	
	public static void main(String[] args) {
		/*
		 * 
		 * <<변수>>
		 * - 하나의 데이터를 저장할 수 있는 메모리상의 공간 
		 * 
		 * <<사용 가능한 기본형 데이터의 종류>>
		 * -정수 : byte, short, int, long
		 * -실수 : float, double
		 * -문자 : char		 
		 * -논리 : boolean
		 * 
		 * byte는 8개의 bit로 이루어져 있다.
		 * -데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지,
		 *  그것의 이름이 무엇인지 알려줘야 한다.
		 *  
		 * -명명규칙은 자바의 정석 25~26쪽 참조
		 * */
		
		//변수 선언 방법: 데이터 타입+변수 이름
		byte abc;
		char moonja;
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		
		boolean bool;
		char character;
		byte bitbyte;
		short soshort;
		int indian;
		long longtimesago;
		float floating;
		double thripple;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
		//System.out.println(bitbyte);
		//변수에 값을 저장하지 않으면 변수의 값을 참조 할 수 없다.
		//=(대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		bitbyte = 127; //타입에 맞는 값을 저장해야 한다.
	    soshort = 30000;
	    indian = 20;
	    longtimesago = 900L; //long 접미사 : L
	    floating = 3.14f; //float 접미사 : f
	    thripple = 3.14; //double 접미사 : d(생략가능)
	    character = '가';
	    bool = true;
	    System.out.println(indian);
	    //Ctrl + F11 : 프로그램 실행
	    //F11 : 디버그 모드 실행
	    indian = 30;
	    System.out.println(indian);
	    indian = 30+40;
	    System.out.println(indian);
	    indian = soshort;
	    
	    //위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
	    bool=false;
	    character='B';
	    bitbyte = 126;
	    longtimesago = 399L;
	    floating = 3.12f;
	    thripple = 3.12;
	    soshort = 5342;
	    indian=35;
	    
	    System.out.println(bool);
	    System.out.println(character);
	    System.out.println(bitbyte);
	    System.out.println(longtimesago);
	    System.out.println(floating);
	    System.out.println(thripple);
	    System.out.println(soshort);
	    System.out.println(indian);
	    
	    //String : 여러개의 문자를 편리하게 사용하기 위한 클래스
	    //문자열 : ""(큰따옴표)로 감싸진 글자

	    String _string = new String("abcd");
	    System.out.println(_string);
	    _string = "1234";
	    System.out.println(_string);
	    
	    /*
	     * 
	     * <<리터럴의 종류>>
	     * 숫자 : 0, 10, -5, 3.14
	     * 문자 : '가', 'a', '0', ' ';
	     * 문자열 : "가나다", "abc", "123", " ", ""
	     * 그외 : true, false, null(값이 없다)
	     * 
	     * << 참조형 타입 >>
	     * - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
	     * - ex) String, ABC, Variable
	     * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
	     * -변수의 크기는 4byte 이다.
	     */
	    
	    //기본값 : 전역변수에 아무것도 저장하지 않았을때 저장되어 있는 값
	    bitbyte=0;
	    soshort = 0;
	    indian = 0;
	    longtimesago = 0L;
	    floating = 0.0f;
	    thripple = 0.0;
	    bool = false;
	    _string = null;
	    //경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
	    bitbyte = 127;
	    indian = 128;
	    bitbyte = (byte)indian; // 형변환 : 데이터 타입을 변환하는 것
	    System.out.println(bitbyte); //128->-128(오버플로우)
	    bitbyte= -128;
	    indian = -129;
	    bitbyte =(byte)indian;
	    System.out.println(bitbyte);
	    //표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
	    //더블 타입에서 인트 타입으로 형 변환해서 출력하기
	    thripple = 3.14;
	    indian = (int)thripple;
	    System.out.println(indian); //int는 소수점을 표현할 수 없으므로 소수점이 손실된다.
	    //표현범위가 작은 타입에서 큰타읍으로 형변환 할 경우 데이터가 손실될 염려가 없다. 그러므로 형변환을 생략할 수 있다.
	    indian = bitbyte;
	    longtimesago = indian;
	    thripple = indian;
	    /*
	     * <<상수>>
	     * - 값을 한번 저장하면 변경할 수 없는 저장공간
	     * -final int MAX_NUMBER;
	     * -리터럴에 의미를 부여하기 위해 사용한다.
	     * 
	     */
	    final int MAX_NUMBER;
	    MAX_NUMBER = 10;
	  //  MAX_NUMBER = 100; //컴파일 에러가 발생
	}
	
}

