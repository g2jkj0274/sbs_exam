
/*
class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람("홍길순", 22, "함경도", "예민함");
		a사람.자기소개();
		int a사람의_왼팔_길이 = a사람.a왼팔.길이;
		System.out.println(a사람의_왼팔_길이 + "cm"); // 출력 : 70cm
		System.out.println(a사람.나이);
		System.out.println(a사람.이름);
		System.out.println(a사람.고향);
		System.out.println(a사람.성격);
		
		int 엄지손가락_길이 = a사람.a왼팔.a손.a엄지손가락.길이;
		System.out.println(엄지손가락_길이 + "cm");
		// 출력 : 7cm
		
		사람 a사람2 = new 사람("임꺽정", 50, "충청도", "호탕함");
		a사람2.자기소개();
		System.out.println(a사람2.나이);
		System.out.println(a사람2.이름);
		System.out.println(a사람2.고향);
		System.out.println(a사람2.성격);
	}
}

class 사람 {
	int 나이;
	String 이름, 고향, 성격;
	팔 a왼팔;
	사람(String 이름, int 나이, String 고향, String 성격) {
		System.out.println("사람이 태어났습니다.");
		this.이름=이름;
		this.나이=나이;
		this.고향=고향;
		this.성격=성격;
		this.a왼팔 = new 팔();
		this.a왼팔.a손 = new 손();
		this.a왼팔.길이 = 70;
		this.a왼팔.a손.a엄지손가락 = new 손가락();
		this.a왼팔.a손.a엄지손가락.길이 = 7;
	}
	void 자기소개() {
		System.out.printf("저는 %d살 %s 출신 %s입니다.\n", 나이, 고향, 이름);
	}
	void 걷다() {
		System.out.println("사람이 걷습니다.");
	}
}
class 팔 {
	int 길이;
	손 a손;
}
class 손 {
	손가락 a엄지손가락;
}
class 손가락 {
	int 길이;
}
*/

/*
// 문제 : 아래와 같이 출력되도록 해보세요.
class Main {
	public static void main(String[] args) {
		new 사람();
		// 출력 : 사람이 태어났습니다.
		new 사람(10);
		// 출력 : 태어나서부터 10살인 사람이 태어났습니다.
		new 사람(20);
		// 출력 : 태어나서부터 20살인 사람이 태어났습니다.
	}
}
class 사람 {
	사람() {
		System.out.println("사람이 태어났습니다.");
	}
	사람(int 나이) {
		System.out.printf("태어나서부터 %d살인 사람이 태어났습니다.\n", 나이);
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		계산기 a계산기 = new 계산기();
		System.out.println(a계산기.더하기(10, 20));
		// 출력 : 30
		System.out.println(a계산기.더하기(10, 20, 30));
		// 출력 : 60
		System.out.println(a계산기.더하기(10.5, 20, 30));
		// 출력 : 60.5
	}
}
class 계산기 {
	int 더하기(int a, int b) {
		return a+b;
	}
	int 더하기(int a, int b, int c) {
		return a+b+c;
	}
	double 더하기(double a, int b, int c) {
		return a+b+c;
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		new 사과();
		new 포도();
		new 사람("홍길동");
		new 사람();
	}
}
class 사과 {
	// 이렇게 생성자를 만들지 않은 클래스는 자바에서 자동으로 생성자를 하나 만들어준다.
	// 참고로 자동으로 만들어 질 때 `매개변수 없는 생성자`가 만들어집니다.
}
class 포도 {
	포도() {
		// 이렇게 생성자를 직접 만들면 자바는 더 이상 자동으로 생성자를 만들어주지 않습니다.
	}
}
class 사람 {
	사람() {
	}
	사람(String 이름) {
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		System.out.println("== 사람객체 생성시작 ==");
		new 사람();
		System.out.println("== 사람객체 생성끝 ==");
		System.out.println("== 청둥오리객체 생성시작 ==");
		new 청둥오리();
		System.out.println("== 청둥오리객체 생성끝 ==");
		//출력
		//== 청둥오리객체 생성시작 ==
		//생물이 생성되었습니다.
		//동물이 생성되었습니다.
		//오리가 생성되었습니다.
		//청둥오리 생성되었습니다.
		//== 청둥오리객체 생성끝 ==
		
	}
}
class 생물 {
	생물() {
		// 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
		System.out.println("생물이 생성되었습니다.");
	}
}
class 동물 extends 생물 {
	동물() {
		// super(); // 부모 클래스의 생성자를 호출합니다. 생략가능합니다.
		// 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
		super();
		System.out.println("동물이 생성되었습니다.");
	}
}
class 사람 extends 동물 {
	사람() {
		super(); // 부모 클래스의 생성자를 호출합니다.
		// 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
		System.out.println("사람이 생성되었습니다.");
	}
}
class 오리 extends 동물{
	오리() {
		System.out.println("오리가 생성되었습니다.");
	}
}
class 청둥오리 extends 오리 {
	청둥오리() {
		super();
		System.out.println("청둥오리 생성되었습니다.");
	}
}
*/

/*
// 문제 : 아래 질문에 답해주세요.
// 1 : 사람 클래스 안에 있는 생성자의 개수는?	
// - 알 수 없다. 모든 클래스의 부모클래스는 Object의 자식클래스이며, 엄밀히 따지면 Object클래스가 몇 개의 생성자를 가졌는지 모르기 때문
// 2 : 사람 클래스의 부모 클래스는?	Object
// 3 : 사람 클래스의 부모 클래스에 생성자가 1개 있다고 가정할 때 사람 클래스 안에 있는 생성자의 총 개수는?		2개
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
class 사람 {
}
*/

/*
// 문제 : 아래가 오류없이 실행되도록 해주세요.
// 조건 : 사람 클래스만 수정할 수 있습니다.
class Main {
	public static void main(String[] args) {
		new 사람();
	}
}
class 동물 {
	동물() {
	}
	동물(String 이름) {
		System.out.println("동물(String 이름) 실행됨!");
		System.out.println("이름 : " + 이름);
	}
	동물(String 이름, int 나이) {
		System.out.println("동물(String 이름, int 나이) 실행됨!");
		System.out.println("이름 : " + 이름);
		System.out.println("나이 : " + 나이);
	}
}
class 사람 extends 동물 {
}
*/

/*
//문제 : 아래와 같이 출력되도록 해주세요. init() 메세드에 의해서 출력되어야 합니다.
//조건 : 사람 클래스의 생성자는 사용할 수 없습니다, 동물 클래스를 수정하여 문제를 풀어주세요.
//힌트 : 모든 생성자는 자신의 일을 하기 전에 super(); 부터 실행합니다.
//힌트 : 모든 생성자는 자신의 일을 하기 전에 부모클래스의 생성자 부터 실행합니다.
class Main {
	public static void main(String[] args) {
		new 사람();
		// 출력 : 사람이 초기화 됩니다.
	}
}
class 동물 {
	// 수정가능지역 시작
	동물() {
		init();
	}
	void init() {
	}
	// 수정가능지역 끝
}
class 사람 extends 동물 {
	void init() {
		System.out.println("사람이 초기화 됩니다.");
	}
}
*/

/*
// 개념 : 같은 객체라도 조종하는 리모콘 타입에 따라 활성화 되는 변수가 다를 수 있다.
class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		a사람.이름 = "홍길동";
		동물 a동물 = a사람;
		a동물.이름 = "홍길순";
		
		System.out.println(a사람.이름);
		System.out.println(a동물.이름);
	}
}
class 동물 {
	String 이름;
}
class 사람 extends 동물 {
	String 이름;
}
*/

/*
// 문제 : 아래와 같이 출력 되도록 전사A, 전사B를 만들어주세요.
// 조건 : this와 super를 활용해주세요.
class Main {
  public static void main(String[] args) {
		전사A a전사A = new 전사A();
		a전사A.이름 = "홍길동";
		System.out.println("== 전사A 공격(); ==");
		a전사A.공격();
		// 출력
		// 홍길동이(가) 공격!
		// 사람이(가) 숨쉬다.
		System.out.println("\n== 전사A 공격2(); ==");
		a전사A.공격2();
		// 홍길동이(가) 공격!
		// 사람이(가) 숨쉬다.
		전사B a전사B = new 전사B();
		a전사B.이름 = "홍길순";
		System.out.println("\n== 전사B 공격(); ==");
		a전사B.공격();
		// 홍길순이(가) 공격!
		// 전사B가 숨쉬다.
		System.out.println("\n== 전사B 공격2(); ==");
		a전사B.공격2();
		// null이(가) 공격!
		// 사람이(가) 숨쉬다.
	}
}
class 사람 {
	String 이름;
	void 숨쉬다() {
		System.out.println("사람이 숨쉬다.");
	}
}
class 전사A extends 사람{ 
	void 공격() {
		System.out.printf("%s이(가) 공격!\n", this.이름);
		this.숨쉬다();
	}
	void 공격2() {
		System.out.printf("%s이(가) 공격!\n", super.이름);
		super.숨쉬다();
	}
}
class 전사B extends 사람 {
	String 이름;
	void 숨쉬다() {
		System.out.println("전사B가 숨쉬다.");
	}
	void 공격() {
		System.out.printf("%s이(가) 공격!\n", this.이름);
		this.숨쉬다();
	}
	void 공격2() {
		System.out.printf("%s이(가) 공격!\n", super.이름);
		super.숨쉬다();
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		final int a;
		a = 10;
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		int avg = 0; 
		for(int i=0; i<arr.length; i++) {
			avg += arr[i];
		}
		System.out.println(avg/arr.length);
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		계절변환기 a = new 계절변환기();
		for (int month = 1; month <= 12; month++) {
			String 계절 = a.get계절(month);
			System.out.println(month + "월은 " + 계절 + " 입니다.");
		}
	}
}
class 계절변환기 {
	String get계절(int month) {
		String 계절 = "";
		switch (month) {
		case 3:
		case 4:
		case 5:
			계절 = "봄";
			break;
		case 6:
		case 7:
		case 8:
			계절 = "여름";
			break;
		case 9:
		case 10:
		case 11:
			계절 = "가을";
			break;
		default:
			계절 = "겨울";
			break;
		}
		return 계절;
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		String str = "axslekjxxlkzjxkljxxXXXssjxxXXxxX";
		int xCount = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='x') {
				xCount++;
			}
		}
		System.out.println("xCount : " + xCount);
	}
}
*/

/*
// static 을 붙이면 클래스에서 객체화 없이 바로 변수나 함수(메서드)를 꺼내서 쓸 수 있다.
// 단 남용하면 안된다.
// 모든 객체에 대해서 해당 속성이 다르지 않을 경우에만 쓰세요.
class Main {
	public static void main(String[] args) {
		System.out.println(수학.PI);
		System.out.println(수학.더하기(10, 20));
	}
}
class 수학 {
	static double PI = 3.141592;
	static int 더하기(int a, int b) {
		return a + b;
	}
}
*/

/*
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
// 문제 - 자동차를 달리게 해주세요(static 사용 금지)(개념 : static)
class Main {
	public static void main(String[] args) {
		자동차 a자동차 = new 자동차();
		a자동차.달리다();
	}
}
class 자동차 {
	void 달리다() {
		System.out.println("자동차가 달립니다.");
	}
}
*/

/*
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
// ps. 파이는 3.141592 라고 가정하겠습니다.
class Main {
	public static void main(String[] args) {
		System.out.println(수학.PI);
		// 출력 : 3.141592
	}
}
class 수학 {
	static double PI = 3.141592;
}
*/

/*
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
// 문제 - 계산기의 더하기가 작동하게 해주세요.(static 사용 금지)(개념 : static)
class Main {
	public static void main(String[] args) {
		System.out.println(new 수학().더하기(10, 20));
		// 출력 : 30
		System.out.println(new 수학().더하기(20, 20, 50));
		// 출력 : 90
	}
}
class 수학 {
	int 더하기(int a, int b) {
		return 더하기(a, b, 0);
	}
	int 더하기(int a, int b, int c) {
		return a+b+c;
	}
}
*/

/*
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
// 문제 - static을 사용하여 코드가 작동하도록 해주세요.(개념 : static)
class Main {
	public static void main(String[] args) {
		// 오직 객체만으로 해결하면 번거롭다.
		System.out.println(수학.PI);
		System.out.println(수학.더하기(10, 20));
		// 출력 : 30
	}
}
class 수학 {
	// static 을 붙이면 해당 변수는 설계도에만 존재하게 됩니다.
	static double PI = 3.141592;
	static int 더하기(int a, int b) {
		return a+b;
	}
}
*/

/*
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
class Main {
	public static void main(String[] args) {
		사람 a사람1 = new 사람();
		a사람1.이름 = "홍길동";
		a사람1.나이 = 22;
		a사람1.자기소개();
		// 출력 : 저는 22살 홍길동 입니다.
		사람 a사람2 = new 사람();
		a사람2.이름 = "홍길순";
		a사람2.나이 = 25;
		a사람2.자기소개();
		// 출력 : 저는 25살 홍길순 입니다.
		a사람1.자기소개();
		// 출력 : 저는 22살 홍길동 입니다.
	}
}
class 사람 {
	int 나이;
	String 이름;
	void 자기소개() {
		System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
	}
}
*/

/*
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
class Main {
	public static void main(String[] args) {
		사람 a사람1 = new 사람();
		a사람1.이름 = "홍길동";
		a사람1.나이 = 22;
		a사람1.자기소개();
		// 출력 : 저는 22살 홍길동 입니다.
		사람 a사람2 = new 사람();
		a사람2.이름 = "홍길순";
		a사람2.나이 = 25;
		a사람2.자기소개();
		// 출력 : 저는 25살 홍길순 입니다.
		a사람1.자기소개();
		// 출력 : 저는 22살 홍길동 입니다.
	}
}
class 사람 {
	int 나이;
	String 이름;
	void 자기소개() {
		System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
	}
}
*/

/*
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
class Main {
	public static void main(String[] args) {
		사람 a사람1 = new 사람();
		a사람1.이름 = "홍길동";
		a사람1.나이 = 22;
		a사람1.자기소개();
		// 출력 : 저는 22살 홍길동 입니다.
		사람 a사람2 = new 사람();
		a사람2.이름 = "홍길순";
		a사람2.나이 = 25;
		a사람2.자기소개();
		// 출력 : 저는 25살 홍길순 입니다.
		a사람1.자기소개();
		// 출력 : 저는 22살 홍길동 입니다.
	}
}
class 사람 {
	int 나이;
	String 이름;
	void 자기소개() {
		// 대리점직원은 본사직원에게 접근할 수 있다.
		// 단 본사직원은 본사 직원끼리만 이야기 할 수 있다.
		System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
	}
}
*/

/*
//문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
class Main {
	public static void main(String[] args) {
		출력("안녕");
		// 출력 : 안녕
	}
	static void 출력(String str) {
		System.out.printf("%s", str);
	}
}
*/

/*
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
class Main {
	public static void main(String[] args) {
		출력("안녕");
		// 출력 : 안녕
		출력(5);
		// 출력 : 5
	}
	static void 출력(String str) {
		System.out.printf("%s\n", str);
	}
	static void 출력(int i) {
		System.out.printf("%s\n", i);
	}
}
*/

/*
// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 다음 코드가 오류없이 진행되도록 해주세요. 오류만 안나면 됩니다.
class Main {
	public static void main(String[] args) {
		저장소.저장(10);
		저장소.저장("안녕");
		저장소.저장(new 사람());
		저장소.저장(new 사과());
		저장소.저장(5.5);
		저장소.저장(false);
		저장소.저장('a');
		
		// 정수 계열
		byte b = 0; // 1바이트
		char c = 1; // 2바이트
		short s = 2; // 2바이트
		int i = 3; // 4바이트
		long l = 4; // 8바이트
		
		// 실수 계열
		// 4.1f => float 형 실수를 의미
		float f = 3.14f; // 4바이트
		// 3.141592 => double 형 실수를 의미
		double d = 3.141592; // 8 바이트
		
		// 논리 계열
		boolean bl = false; // 1/8 바이트, 1비트
		
		저장소.저장(b);
		저장소.저장(s);
		저장소.저장(c);
		저장소.저장(i);
		저장소.저장(l);
		저장소.저장(f);
		저장소.저장(d);
		저장소.저장(bl);
	}
}
class 저장소 {
	static void 저장(int i) {
	}
	static void 저장(String str) {
	}
	static void 저장(사람 사람) {
	}
	static void 저장(사과 사과) {
	}
	static void 저장(double d) {
	}
	static void 저장(boolean b) {
	}
	static void 저장(char c) {
	}
}
class 사람 {
}
class 사과 {
}
*/

/*
//문제 : double 형 변수 d 에 담긴 10.5 를 flaot 형 변수 f에 넣어주세요. 그 반대작업도 진행해주세요.
class Main {
	public static void main(String[] args) {
		// 자바에서의 상수  1 => 00000000 00000000 00000000 00000001
		// 자바에서의 상수 1L => 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001
		
		int i = 1; // int 는 4바이트 즉 돌 32개 짜리
		long l = (long)i; // long 은 8바이트 즉 돌 64개 짜리
		// (int) => 110볼트를 220볼트로 변압하듯이 1을 `long 화` 하여 넣는다.
		
		l = i; // 이 코드는 안전하기 때문에 자동형변환이 발생합니다.
		//i = l; // 이 코드는 안전하지 않기 때문에 자동형변환이 불가능 합니다.
		
		i = (int)l; // 수동형변환 => 위험에 대한 싸인
		
		double d = (double)10.5;
		float f = (float)10.5;
	}
}
*/

/*
// 내용 : 각각의 기본형 타입은 하나의 래퍼클래스를 가지고 있습니다. 래퍼클래스를 통해서 기본형 변수에 대한 자세한 정보를 알 수 있습니다.
// 문제 : 모든 기본형 타입에 대해서 래퍼클래스를 사용하여 최대값 최소값을 출력해보세요.
class Main {
	public static void main(String[] args) {
		byte b;
		System.out.println("byte의 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);
		char c;
		System.out.println("char의 최소값 : " + Character.MIN_VALUE);
		System.out.println("char의 최대값 : " + Character.MAX_VALUE);
		short s;
		System.out.println("int의 최소값 : " + Short.MIN_VALUE);
		System.out.println("int의 최대값 : " + Short.MAX_VALUE);
		int i;
		System.out.println("int의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int의 최대값 : " + Integer.MAX_VALUE);
		long l;
		System.out.println("int의 최소값 : " + Long.MIN_VALUE);
		System.out.println("int의 최대값 : " + Long.MAX_VALUE);
		float f;
		System.out.println("int의 최소값 : " + Float.MIN_VALUE);
		System.out.println("int의 최대값 : " + Float.MAX_VALUE);
		double d;
		System.out.println("int의 최소값 : " + Double.MIN_VALUE);
		System.out.println("int의 최대값 : " + Double.MAX_VALUE);
		boolean bl; // 1 bit
	}
}
*/

/*
// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 기본형 변수의 경우 자동형변환을 이용하여 `저장 메서드`의 개수를 최대한 줄여보세요.
class Main {
	public static void main(String[] args) {
		저장소.저장(10);
		저장소.저장("안녕");
		저장소.저장(new 사람());
		저장소.저장(new 사과());
		저장소.저장(5.5);
		저장소.저장(false);
		저장소.저장('a');
		
		// 정수 계열
		byte b = 0; // 1바이트
		char c = 1; // 2바이트
		short s = 2; // 2바이트
		int i = 3; // 4바이트
		long l = 4; // 8바이트
		
		// 실수 계열
		// 4.1f => float 형 실수를 의미
		float f = 3.14f; // 4바이트
		// 3.141592 => double 형 실수를 의미
		double d = 3.141592; // 8 바이트
		
		// 논리 계열
		boolean bl = false; // 1/8 바이트, 1비트
		
		저장소.저장(b);
		저장소.저장(s);
		저장소.저장(c);
		저장소.저장(i);
		저장소.저장(l);
		저장소.저장(f);
		저장소.저장(d);
		저장소.저장(bl);
	}
}
class 저장소 {
	static void 저장(double v) {
		System.out.println("double 값 : " + v);
	}
	static void 저장(boolean v) {
		System.out.println("boolean 값 : " + v);
	}
	static void 저장(String v) {
		System.out.println("String 값 : " + v);
	}
	static void 저장(사람 v) {
		System.out.println("사람 값 : " + v);
	}
	static void 저장(사과 v) {
		System.out.println("사과 값 : " + v);
	}
}
class 사람 {
}
class 사과 {
}
*/

/*
// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 객체를 매개변수로 받는 `저장` 메서드도 최대한 개수를 줄여보세요.
class Main {
	public static void main(String[] args) {
		저장소.저장(10);
		저장소.저장("안녕");
		저장소.저장(new 사람());
		저장소.저장(new 사과());
		저장소.저장(5.5);
		저장소.저장(false);
		저장소.저장('a');
		
		// 정수 계열
		byte b = 0; // 1바이트
		char c = 1; // 2바이트
		short s = 2; // 2바이트
		int i = 3; // 4바이트
		long l = 4; // 8바이트
		
		// 실수 계열
		// 4.1f => float 형 실수를 의미
		float f = 3.14f; // 4바이트
		// 3.141592 => double 형 실수를 의미
		double d = 3.141592; // 8 바이트
		
		// 논리 계열
		boolean bl = false; // 1/8 바이트, 1비트
		
		저장소.저장(b);
		저장소.저장(s);
		저장소.저장(c);
		저장소.저장(i);
		저장소.저장(l);
		저장소.저장(f);
		저장소.저장(d);
		저장소.저장(bl);
	}
}
class 저장소 {
	static void 저장(double v) {
		System.out.println("double 값 : " + v);
	}
	static void 저장(boolean v) {
		System.out.println("boolean 값 : " + v);
	}
	static void 저장(String v) {
		System.out.println("String 값 : " + v);
	}
	static void 저장(생물 v) {
		System.out.println("사람 값 : " + v);
	}
}
class 사람 extends 생물 {
}
class 사과 extends 생물 {
}
class 생물 {
}
*/

/*
// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 문제 : 객체를 매개변수로 받는 `저장` 메서드를 1개로 줄여보세요.
class Main {
	public static void main(String[] args) {
		저장소.저장(10);
		저장소.저장("안녕");
		저장소.저장(new 사람());
		저장소.저장(new 사과());
		저장소.저장(5.5);
		저장소.저장(false);
		저장소.저장('a');
		
		// 정수 계열
		byte b = 0; // 1바이트
		char c = 1; // 2바이트
		short s = 2; // 2바이트
		int i = 3; // 4바이트
		long l = 4; // 8바이트
		
		// 실수 계열
		// 4.1f => float 형 실수를 의미
		float f = 3.14f; // 4바이트
		// 3.141592 => double 형 실수를 의미
		double d = 3.141592; // 8 바이트
		
		// 논리 계열
		boolean bl = false; // 1/8 바이트, 1비트
		
		저장소.저장(b);
		저장소.저장(s);
		저장소.저장(c);
		저장소.저장(i);
		저장소.저장(l);
		저장소.저장(f);
		저장소.저장(d);
		저장소.저장(bl);
	}
}
class 저장소 {
	static void 저장(Object v) {
		System.out.println("double 값 : " + v);
	}
}
class 사람 extends 동물 {
}
class 동물 extends 생물 {
}
class 식물 extends 생물 {
}
class 사과 extends 식물 {
}
// `extends Object` 는 생략가능하다.
class 생물 extends Object {
}
// 이 세상에 있는 모든 클래스는 Object 클래스의 하위 클래스 이다.
// 다시말하면 Object 클래스는 모든 클래스의 최초조상이다.
*/

/*
// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 문제 : `저장` 메서드를 1개로 줄여보세요.
class Main {
	public static void main(String[] args) {
		저장소.저장(new 사과());
		저장소.저장(new 사람());
		저장소.저장("안녕"); // "안녕" 은 String 클래스의 객체이다.
		저장소.저장(new String("안녕"));
		
		// 정수 계열
		byte b = 0; // 1바이트
		char c = 1; // 2바이트
		short s = 2; // 2바이트
		int i = 3; // 4바이트
		long l = 4; // 8바이트
		
		// 실수 계열
		// 4.1f => float 형 실수를 의미
		float f = 3.14f; // 4바이트
		// 3.141592 => double 형 실수를 의미
		double d = 3.141592; // 8 바이트
		
		// 논리 계열
		boolean bl = false; // 1/8 바이트, 1비트
		
		// int 형 변수 i의 값 `3`을 객체화 하는 방법
		Integer iObj = new Integer(i);
		// iObj 리모콘에 연결된 객체에는 3이라는 값이 있습니다.
		// 객체 안에 3이있다고 생각하시면 됩니다.
		
		저장소.저장(b);
		저장소.저장(s);
		저장소.저장(c);
		저장소.저장(i);
		저장소.저장(l);
		저장소.저장(f);
		저장소.저장(d);
		저장소.저장(bl);
	}
}
class 저장소 {
	static void 저장(Object v) {
		System.out.println("Object 값 : " + v);
	}
}
class 사람 extends 생물 {
}
class 사과 extends 생물 {
}
class 생물 {
}
*/

/*
// 문제 : 아래코드의 오류를 수정해보세요.
class Main {
	public static void main(String[] args) {
		long l = 200L;
		int i = (int) l;
		
		동물 a동물 = new 사람();
		a동물 = new 원숭이();
		
		원숭이 a원숭이 = (원숭이) a동물;
	}
}
class 사람 extends 동물 {
}
class 원숭이 extends 동물 {
}
class 동물 {
}
*/

/*
// 문제 : 저장소를 만들고 i의 값을 저장한 후 다시 받아보세요.
class Main {
	public static void main(String[] args) {
		int i = 10;
		
		// 구현 시작
		저장소 a저장소 = new 저장소();
		Integer iObj = new Integer(i);
		a저장소.저장(iObj);
		
		iObj = (Integer) a저장소.주세요();
		i = iObj.intValue();
		// 구현 끝
		
		System.out.println(i);
		// 출력 : 10
	}
}
class 저장소 {
	Object data;
	void 저장(Object o) {
		data = o;
	}
	Object 주세요() {
		return data;
	}
}
*/

/*
// 문제 : 아래와 같이 출력되도록 `저장소` 클래스를 만들어보세요.
class Main {
	public static void main(String[] args) {
		저장소 a저장소 = new 저장소();
		
		a저장소.저장(10);
		int 결과 = (int)a저장소.주세요();
		
		System.out.println(결과);
		// 출력 : 10
	}
}
class 저장소 {
	Object data;
	void 저장(Object o) {
		data = o;
	}
	Object 주세요() {
		return data;
	}
}
*/

/*
// 문제 : 아래와 같이 출력되도록 `저장소` 클래스를 만들어보세요. 필요하다면 다른 클래스도 만들어보세요. 필요하다면 main 메서드도 수정해주세요.
class Main {
	public static void main(String[] args) {
		저장소 a저장소 = new 저장소();
		
		int i = 10;
		Integer iObj = new Integer(i);
		a저장소.저장(iObj);
		iObj = (Integer)a저장소.주세요();
		i = iObj.intValue();
		
		System.out.println(i);
		// 출력 1
		
		사람 a사람1 = new 사람();
		a저장소.저장(a사람1);
		a사람1 = (사람) a저장소.주세요();
		a사람1.걷다();
		// 사람이 걷습니다.
	}
}
class 저장소 {
	Object data;
	void 저장(Object o) {
		data = o;
	}
	Object 주세요() {
		return data;
	}
}
class 사람 {
	void 걷다() {
		System.out.println("사람이 걷습니다.");
	}
}
*/

/*
// 문제 : 아래의 진행상활대로 코딩해주세요.
class Main {
	public static void main(String[] args) {
		// Integer에 대해서 수동박싱, 수동언박싱, 오토박싱, 오토언박싱이 일어나도록 해주세요.
		int i = 10;
		System.out.println(i + 20);
		Integer iObj = new Integer(10); // 수동박싱
		int k = iObj.intValue(); // 수동언박싱
		System.out.println(k + 20);
		Integer iObj2 = 30; // 오토박싱
		int i3 = iObj2 + 20 - iObj2 - iObj2; // 오토언박싱
		System.out.println(i3);
		
		// Boolean에 대해서 수동박싱, 수동언박싱, 오토박싱, 오토언박싱이 일어나도록 해주세요.
		boolean b = true;
		System.out.println(b);
		Boolean bObj = new Boolean(b); // 수동박싱
		b = bObj.booleanValue(); // 수동언박싱
		System.out.println(b);
		Boolean bObj2 = false; // 오토박싱
		b = bObj2; // 오토언박싱
		System.out.println(b);
		
		// Character에 대해서 수동박싱, 수동언박싱, 오토박싱, 오토언박싱이 일어나도록 해주세요.
		char c = 'A';
		System.out.println(c);
		Character cObj = new Character(c); // 수동박싱
		c = cObj.charValue(); // 수동언박싱
		System.out.println(c);
		Character cObj2 = 'B'; // 오토박싱
		c = cObj2; // 오토언박싱
		System.out.println(c);
	}
}
*/

/*
//문제 : 아래가 실행되도록 해주세요. 필요하다면 Main 클래스를 수정해도 됩니다.
class Main {
	public static void main(String[] args) {
		동물 a동물 = new 사람();
		a동물.말하다();
		Object o = a동물;
		사람 a사람 = (사람)o;
		a사람.말하다();
	}
}
class 동물 {
	void 말하다() {
	}
}
class 사람 extends 동물 {
	void 말하다() {
	}
}
*/

/*
// 문자열에서 숫자문자와 알파벳 소문자가 각각 몇개씩 포함되어 있는지 카운팅 해주세요.
class Main {
	public static void main(String[] args) {
		int lowerAlphaCharCount = 0;
		int numberCharCount = 0;
		
		String str = "The best of best singer. 1 plus 1 is 2. PI is 3.141592";
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(Character.isLowerCase(c)) {
				lowerAlphaCharCount++;
			}
			if(Character.isDigit(c)) {
				numberCharCount++;
			}
		}
		
		System.out.println("lowerAlphaCharCount : " + lowerAlphaCharCount);
		// 출력 : 26
		System.out.println("numberCharCount : " + numberCharCount);
		// 출력 : 10
	}
}
*/

/*
//문제 : 아래와 같이 실행되게 해주세요.
class Main {
	public static void main(String[] args) {
		IntArr intArr1 = new IntArr1();
		System.out.println("배열의 길이 : " + intArr1.length);
		// 출력 => 배열의 길이 : 1
		intArr1.setData(0, 20);
		System.out.println(intArr1.getData(0));
		// 출력 => 20

		IntArr intArr3 = new IntArr3();
		System.out.println("배열의 길이 : " + intArr3.length);
		// 출력 => 배열의 길이 : 3
		intArr3.setData(0, 20);
		intArr3.setData(1, 40);
		intArr3.setData(2, 60);
		System.out.println(intArr3.getData(0));
		// 출력 => 20
		System.out.println(intArr3.getData(1));
		// 출력 => 40
		System.out.println(intArr3.getData(2));
		// 출력 => 60
	}
}
abstract class IntArr {
	int length;

	abstract void setData(int index, int value);

	abstract int getData(int index);
}
class IntArr1 extends IntArr {
	int data0;

	IntArr1() {
		length = 1;
	}
	void setData(int index, int value) {
		this.data0 = value;
	}
	int getData(int index) {
		return data0;
	}
}
class IntArr3 extends IntArr {
	int data0;
	int data1;
	int data2;
	IntArr3() {
		length = 3;
	}
	void setData(int index, int value) {
		if (index == 0) {
			this.data0 = value;
		} 
		else if (index == 1) {
			this.data1 = value;
		}
		else if (index == 2) {
			this.data2 = value;
		}
	}
	int getData(int index) {
		if (index == 0) {
			return this.data0;
		}
		else if (index == 1) {
			return this.data1;
		} 
		else if (index == 2) {
			return this.data2;
		}
		return 0;
	}
}
*/

/*
// 문제 : a와 b와 c를 저장하는 char 배열을 만들어주세요.
class Main {
	public static void main(String[] args) {
		int k = 10;
		int[] iArr = new int[10];
		// int[] => 클래스 이름
		// new int[10] => 객체 생성
		// new int[10] => int 10개 저장될 수 있는 버스(객체)를 만든다.
		
		System.out.println("배열의 길이 : " +  iArr.length);
		
		iArr[0] = 20;
		iArr[1] = 20;
		iArr[2] = 20;
		iArr[3] = 20;
		iArr[4] = 20;
		iArr[5] = 20;
		iArr[6] = 20;
		iArr[7] = 20;
		iArr[8] = 20;
		iArr[9] = 20;
		
		System.out.println("== 배열의 원래 값 ==");
		for ( int i = 0; i < iArr.length; i++ ) {
			System.out.println("iArr[" + i +  "]의 값 : " + iArr[i]);
		}
		System.out.println("== 배열의 바뀐 값 ==");
		for ( int i = 0; i < iArr.length; i++ ) {
			iArr[i] = i + 1;
		}
		for ( int i = 0; i < iArr.length; i++ ) {
			System.out.println("iArr[" + i +  "]의 값 : " + iArr[i]);
		}
		
		// 여기서 구현해주세요.
		char[] cArr = {'a', 'b', 'c'};
	}
}
*/

/*
//문제 : 사람 리모콘 3개 저장할 수 있는 배열을 만들고 사람 리모콘으로 채워주세요.
class Main {
	public static void main(String[] args) {
		사람[] 사람들;
		사람들 = new 사람[3];
		사람들[0] = new 사람(1);
	    사람들[1] = new 사람(2);
	    사람들[2] = new 사람(3);
		for(int i = 0; i < 사람들.length; i++) {
			사람들[i].자기소개();
		}
	}
}
class 사람 {
	int 번호;
	사람(int 번호) {
		this.번호 = 번호;
	}
	void 자기소개() {
		System.out.println("안녕하세요. 저는 " + this.번호 + "번 입니다.");
	}
}
*/

/*
//문제 : 길이가 10인 int 배열을 만들고 거기에 1부터 10까지 채워주세요.
//조건 : 그 후 배열 안의 모든 값들의 합도 출력해주세요.
class Main {
	public static void main(String[] args) {
		int[] iArr = new int[10];
		int sum = 0;
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = i+1;
			sum += iArr[i];
		}
		System.out.println(sum);
	}
}
*/

/*
import java.util.*;
class Main {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println((int)a.get(0)+(int)a.get(1));
	}
}
*/

/*
//ArrayList 개요
//- ArrayList를 사용해서 복수개의 데이터를 담을 때 배열과 달리 미리 데이터의 개수를 정하지 않아도 됩니다.
//- ArrayList는 자연스럽게 크기가 늘어나는 배열이라고 생각해주세요.
//문제 : 배열의 단점을 보완한 ArrayList 라는 클래스를 만들어주세요. 오류만 안나게 해주세요.
class Main {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
	}
}
class ArrayList {
	int size=0;
	int[] arr;
	ArrayList() {
		arr = new int[3];
		size=0;
	}
	void add(int data) {
		arr[size] = data;
		size++;
	}
	int get(int index) {
		return arr[index];
	}
}
*/

/*
//Object 클래스와 toString
class Main {
	public static void main(String[] args) {
		사람 a사람1 = new 사람("홍길동", 22);
		사람 a사람2 = new 사람("홍길순", 23);
		System.out.println(a사람1);
		System.out.println(a사람2);
	}
}
class 사람 extends Object {
	String 이름;
	int 나이;
	사람(String 이름, int 나이) {
		this.이름 = 이름;
		this.나이 = 나이;
	}
	@Override
	public String toString() {
		return "사람[이름=" + 이름 + ",나이=" + 나이 + "]";
	}
}
*/

/*
//Object 클래스와 equals
class Main {
	public static void main(String[] args) {
		사람 a사람1 = new 사람("홍길동", 22);
		사람 a사람2 = new 사람("홍길동", 22);
		if(a사람1 == a사람2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		if(a사람1.equals(a사람2)) {
			System.out.println(true);
		}
	}
}
class 사람 {
	String 이름;
	int 나이;
	사람(String 이름, int 나이) {
		this.이름 = 이름;
		this.나이 = 나이;
	}
	@Override
	public boolean equals(Object o) {
		if ( o instanceof 사람 == false ) {
			return false;
		}
		사람 other = (사람)o;
		if ( !이름.equals(other.이름) ) {
			return false;
		}
		if ( this.나이 != other.나이 ) {
			return false;
		}
		return true;
	}
}
*/

/*
// 개념 : 문장을 만드는 2가지 방법
class Main {
	public static void main(String[] args) {
		String s1 = "카";
		String s2 = new String("카");
		if ( s1 == s2 ) {
			System.out.println("안녕");
		}
		if(s1.equals(s2)) {
			System.out.println(true);
		}
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("*");
		sb.append("*");
		sb.append("*");
		System.out.println(sb);
	}
}
*/

/*
// ArrayList 개요
// - ArrayList를 사용해서 복수개의 데이터를 담을 때 배열과 달리 미리 데이터의 개수를 정하지 않아도 됩니다.
// - ArrayList는 자연스럽게 크기가 늘어나는 배열이라고 생각해주세요.
// 문제 : 배열의 단점을 보완한 ArrayList 라는 클래스를 만들어주세요. 오류만 안나게 해주세요.
class Main {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
	}
}
class ArrayList {
	void add(int data) {
	}
}
*/

/*
//문제 : 배열의 단점을 보완한 ArrayList 라는 클래스를 만들어주세요. 아래와 같이 출력되도록 해주세요.
class Main {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		int value = ar.get(0);
		System.out.println(value);
		// 출력 : 100
		
		value = ar.get(1);
		System.out.println(value);
		// 출력 : 200
		
		value = ar.get(2);
		System.out.println(value);
		// 출력 : 300
	}
}
class ArrayList {
	int size;
	int[] datas;
	ArrayList() {
		datas = new int[3];
	}
	void add(int data) {
		datas[size] = data;
		size++;
	}
	int get(int index) {
		return datas[index];
	}
}
*/

/*
// 문제 : 배열의 단점을 보완한 ArrayList 라는 클래스를 만들어주세요. 아래와 같이 출력되도록 해주세요. add 함수에서 배열의 크기가 자동으로 늘어나도록 해주세요.
class Main {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		int value = ar.get(0);
		System.out.println(value);
		// 출력 : 100
		value = ar.get(1);
		System.out.println(value);
		// 출력 : 200 
		value = ar.get(2);
		System.out.println(value);
		// 출력 : 300
		value = ar.get(3);
		System.out.println(value);
		// 출력 : 400
	}
}
class ArrayList {
	int[] datas;
	int lastIndex = -1;
	ArrayList() {
		datas = new int[3]; // 이 부분은 수정할 수 없습니다.
	}
	void sizeUp() {
		int[] newdatas = new int[datas.length*2];
		for(int i=0; i<datas.length; i++) {
			newdatas[i] = datas[i];
		}
		datas = newdatas;
	}
	boolean isFull() {
		return lastIndex+1 == datas.length;
	}
	void add(int data) {
		lastIndex++;
		if(isFull()) {
			sizeUp();
		}
		datas[lastIndex]=data;
	}
	int get(int index) {
		return datas[index];
	}
}
*/

/*
// 문제 : 아래 코드가 작동하도록 해주세요.
class Main {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		for ( int i = 0; i < 100; i++ ) {
			ar.add((i + 1) * 10);
		}
		
		int ar_size = ar.size(); // ar_size의 값은 100 이어야 합니다.
		
		for ( int i = 0; i < ar_size; i++ ) {
			int value = ar.get(i);
			System.out.println(value);
		}
	}
}
class ArrayList {
	int[] datas;
	int lastIndex = -1;
	ArrayList() {
		datas = new int[3]; // 이 부분은 수정할 수 없습니다.
	}
	int size() {
		return lastIndex+1;
	}
	void add(int data) {
		if ( lastIndex + 1 >= datas.length ) {
			// 확장공사
			// 기존버스 버리고 새 버스로 연결!!
			// datas 이 녀석이 기존 버스를 버리고 새 버스를 가리켜야 합니다.
			
			// 새 버스 생성
			int[] newArr = new int[datas.length * 2];
			
			// 기존 버스(배열)를 버리기 전에 버스에 있던 승객들을 새 버스로 옮긴다.
			for ( int i = 0; i < datas.length; i++ ) {
				newArr[i] = datas[i];
			}
			datas = newArr;
		}
		lastIndex++;
		datas[lastIndex] = data;
	}
	int get(int index) {
		return datas[index];
	}
}
*/

/*
// 문제 : 아래 코드가 작동하도록 해주세요.
class Main {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		ar.remove(2);
		int value = ar.get(2);
		System.out.println(value);
		// 출력 : 400
		
		ar.remove(0);
		value = ar.get(0);
		System.out.println(value);
		// 출력 : 200
		
		ar.add(78);
		value = ar.get(2);
		System.out.println(value);
		// 출력 : 78
	}
}
class ArrayList {
	int[] datas;
	int lastIndex = -1;
	ArrayList() {
		datas = new int[3]; // 이 부분은 수정할 수 없습니다.
	}
	void add(int data) {
		if ( lastIndex + 1 >= datas.length ) {
			// 확장공사
			// 기존버스 버리고 새 버스로 연결!!
			// datas 이 녀석이 기존 버스를 버리고 새 버스를 가리켜야 합니다.
			
			// 새 버스 생성
			int[] newArr = new int[datas.length * 2];
			
			// 기존 버스(배열)를 버리기 전에 버스에 있던 승객들을 새 버스로 옮긴다.
			for ( int i = 0; i < datas.length; i++ ) {
				newArr[i] = datas[i];
			}
			datas = newArr;
		}
		lastIndex++;
		datas[lastIndex] = data;
	}
	int get(int index) {
		return datas[index];
	}
	int size() {
		return lastIndex + 1;
	}
	void remove(int index) {
		for(int i=index; i<lastIndex; i++) {
			datas[i] = datas[i + 1];
		}
		lastIndex--;
	}
}
*/

/*
// 문제 : 아래 코드가 작동하도록 해주세요.[정답]
class Main {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100, 0);
		ar.add(200, 1);
		ar.add(300, 2);
		ar.add(400, 3);
		ar.add(500, 4);
		ar.add(600, 2); // 2번좌석으로 새치기, 기존의 2번좌석 손님부터 끝 손님까지 뒤로 한칸씩 밀린다.
		ar.add(700, 0); // 0번좌석으로 새치기, 기존의 0번좌석 손님부터 끝 손님까지 뒤로 한칸씩 밀린다.
		
		for ( int i = 0; i < ar.size(); i++ ) {
			int value = (int)ar.get(i);
			System.out.println(i + " : " + value);
		}
		// 출력
		// 0 : 700
		// 1 : 100
		// 2 : 200
		// 3 : 600
		// 4 : 300
		// 5 : 400
		// 6 : 500
	}
}
class ArrayList {
	int[] datas;
	int lastIndex = -1;
	ArrayList() {
		datas = new int[3]; // 이 부분은 수정할 수 없습니다.
	}
	void add(int data, int index) {
		extendDatasSizeIfNeed();
		// 구현시작
		// 맨 뒤의 손님을 끝쪽으로 한칸 이동시킨다.
		// 맨 뒤에서 2번째 손님을 끝쪽으로 한칸 이동시킨다.
		// 맨 뒤에서 3번째 손님을 끝쪽으로 한칸 이동시킨다.
		// 맨 뒤에서 index번째 손님을 끝쪽으로 한칸 이동시킨다.
		for ( int i = lastIndex; i >= index; i-- ) {
			datas[i + 1] = datas[i];
		}
		// 구현끝
		datas[index] = data;
		lastIndex++;
	}
	void add(int data) {
		extendDatasSizeIfNeed();
		lastIndex++;
		datas[lastIndex] = data;
	}
	void extendDatasSizeIfNeed() {
		if ( lastIndex + 1 >= datas.length ) {
			// 확장공사
			// 기존버스 버리고 새 버스로 연결!!
			// datas 이 녀석이 기존 버스를 버리고 새 버스를 가리켜야 합니다.
			
			// 새 버스 생성
			int[] newArr = new int[datas.length * 2];
			
			// 기존 버스(배열)를 버리기 전에 버스에 있던 승객들을 새 버스로 옮긴다.
			for ( int i = 0; i < datas.length; i++ ) {
				newArr[i] = datas[i];
			}
			datas = newArr;
		}
	}
	int get(int index) {
		return datas[index];
	}
	int size() {
		return lastIndex + 1;
	}
}
*/

/*
// 문제 : 아래가 실행되도록 해주세요.
// 조건 : ArrayList 객체에서 내부적으로 Object 배열을 사용해서 데이터를 저장해야 합니다.
// 조건 : Object 배열의 초기 길이는 2 입니다.
// 조건 : 상황에 따라 배열의 길이는 자동으로 증가해야 합니다.
// 조건 : 엘리먼트(구성요소)를 하나 삭제하면 해당 요소 뒤의 요소들이 전부 앞으로 한칸씩 움직여야 합니다.
// 조건 : ArrayList의 인스턴스 변수는 2개만 사용할 수 있습니다.
// 조건 : 외부에서 호출하지 않는 속성은 private 키워드를 붙여주세요.
// 조건 : 중복을 최대한 제거해주세요.
// 조건 : 사용하는 변수와 if문, for문의 개수를 가독성을 떨어뜨리지 않는 선에서 최대한 줄여주세요.
class Main {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		System.out.println("al.size() : " + al.size());
		// 출력 => al.size() : 0
		
		al.add(100);
		
		System.out.println("al.get(0) : " + al.get(0));
		// 출력 => al.get(0) : 100
		
		al.add(200);
		al.add(300);
		// 출력 => 배열의 크기가 증가되었습니다. 2 => 4
		
		System.out.println("al.size() : " + al.size());
		// 출력 => al.size() : 3
		
		System.out.println("al.get(1) : " + al.get(1));
		// 출력 => al.get(1) : 200
		
		al.removeAt(1);
		
		System.out.println("al.size() : " + al.size());
		// 출력 => al.size() : 2
		
		System.out.println("al.get(1) : " + al.get(1));
		// 출력 => al.get(1) : 300
		
		al.add(400);
		al.add(500);
		al.add(600);
		// 출력 => 배열의 크기가 증가되었습니다. 4 => 8

		System.out.println("al.get(3) + al.get(4) : " + (al.get(3) + al.get(4)));
		// 출력 => al.get(3) + al.get(4) : 1100
		
		System.out.println("al.get(3).intValue() + al.get(4).intValue() : " + (al.get(3).intValue() + al.get(4).intValue()));
		// 출력 => al.get(3) + al.get(4) : 1100
		
		al.showAllValues();
		// 출력 =>
		
		== 전체 데이터 출력 ==
		0 : 100
		1 : 300
		2 : 400
		3 : 500
		4 : 600
		
		
		al.add(700, 1);
		al.add(750, 1);
		
		al.showAllValues();
		// 출력 =>
		
		== 전체 데이터 출력 ==
		0 : 100
		1 : 750
		2 : 700
		3 : 300
		4 : 400
		5 : 500
		6 : 600
		
	}
}
class ArrayList {
	private Object[] datas;
	private int size;
	ArrayList() {
		datas = new Object[2];
		size = 0;
	}
	Integer get(int index) {
		return (Integer)datas[index];
	}
	void removeAt(int index) {
		for ( int i = index + 1; i < size; i++ ) {
			datas[i - 1] = datas[i];
		}
		size--;
	}
	private void extendToDatasSizeIfNeedToAdd() {
		boolean needToExtend = size >= datas.length;
		if ( needToExtend ) {
			Object[] newDatas = new Object[datas.length * 2];
			for ( int i = 0; i < datas.length; i++ ) {
				newDatas[i] = datas[i];
			}
			System.out.println("배열의 크기가 증가되었습니다. " + datas.length + " => " + newDatas.length);
			datas = newDatas;
		}
	}
	void add(int data) {
		add(data, size);
	}
	void add(int data, int indexToAdd) {
		extendToDatasSizeIfNeedToAdd();
		for ( int i = size; i > indexToAdd; i-- ) {
			datas[i] = datas[i - 1];
		}
		datas[indexToAdd] = data;
		size++;
	}
	int size() {
		return size;
	}
	void showAllValues() {
		System.out.println("== 전체 데이터 출력 ==");
		for ( int i = 0; i < size; i++ ) {
			System.out.print(i + " : ");
			System.out.println(datas[i]);
		}
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(true);
		al.add(new 사람());
		int a = (int)al.get(0);
		boolean b = (boolean)al.get(1);
		사람 c = (사람)al.get(2);
	}
}
class ArrayList {
	private Object[] datas;
	private int lastIndex;
	public ArrayList() {
		datas = new Object[3]; // 이 부분은 수정할 수 없습니다.
		lastIndex = -1;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for ( int i = 0; i <= lastIndex; i++ ) {
			sb.append(i + ",");
		}
		return sb.toString();
	}
	private void sizeUpDatas() {
		// 기존에 연결된 업체 버리고
		// 더욱 더 큰 새 업체를 datas에 연결
		Object[] newDatas = new Object[datas.length * 2];
		// datas => 구 업체를 조종하는 리코몬
		// newDatas = 신 업체를 조종하는 리코몬
		for ( int i = 0; i < datas.length; i++ ) {
			newDatas[i] = datas[i];
		}
		// 업체 새로 계약
		datas = newDatas;
	}
	private void sizeUpDatasIfFull() {
		if ( isFull() ) {
			int oldDatasLength = datas.length;
			sizeUpDatas();
			int newDatasLength = datas.length;
			System.out.println("배열 증가 : " + oldDatasLength + " => " + newDatasLength);
		}
	}
	public void add(Object data) {
		sizeUpDatasIfFull();
		lastIndex++;
		datas[lastIndex] = data;
	}
	public void add(Object data, int index) {
		sizeUpDatasIfFull();
		for ( int i = lastIndex; i >= index; i-- ) {
			datas[i + 1] = datas[i];
		}
		datas[index] = data;
		lastIndex++;
	}
	public Object get(int index) {
		return datas[index];
	}
	private boolean isFull() {
		return lastIndex + 1 == datas.length;
	}
	public int size() {
		return lastIndex + 1;
	}
	public void removeAt(int index) {
		for ( int i = index; i < lastIndex; i++ ) {
			datas[i] = datas[i + 1];
		}
		lastIndex--;
	}
	public void showAllValues() {
		System.out.println("== 전체 데이터 출력 ==");
		for ( int i = 0; i <= lastIndex; i++ ) {
			System.out.println(i + " : " + datas[i]);
		}
	}
}
class 사람 {
}
*/

/*
// 문제 : 제너릭을 사용해서 중복을 제거해주세요.
class Main {
	public static void main(String[] args) {
		저장소<Integer> a저장소1 = new 저장소<Integer>();
		a저장소1.setData(30);
		int a = a저장소1.getData();
		System.out.println(a);
		
		저장소<Double> a저장소2 = new 저장소<Double>();
		a저장소2.setData(5.5);
		double b = a저장소2.getData();
		System.out.println(b);
		
		저장소<사과> a저장소3 = new 저장소<사과>();
		a저장소3.setData(new 사과());
		사과 c = a저장소3.getData();
		System.out.println(c);
	}
}
class 저장소<T> {
	Object data;
	T getData() {
		return (T) data;
	}
	void setData(Object inputData) {
		this.data = inputData;
	}
}
class 사과 {
}
*/

/*
import java.util.*;
class Main {
	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<>();
		ages.add(10); // 영수나이, 키 : 0
		ages.add(15); // 철수나이, 키 : 1
		ages.add(13); // 영희나이, 키 : 2
		
		System.out.println(ages.get(2));
		
		Map<String, Integer> ages2 = new LinkedHashMap<>();
		ages2.put("철수", 15); // 철수나이, 키 : 철수
		ages2.put("영수", 10); // 영수나이, 키 : 영수
		ages2.put("영희", 13); // 영희나이, 키 : 영희
		
		for ( String 이름 : ages2.keySet() ) {
			System.out.println(이름 + " : " + ages2.get(이름));
			
		}
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		HashMap aMap = new HashMap();

		aMap.put(1, "안녕");
		aMap.put("A", false);
		aMap.put("b", false);
		aMap.put("c", false);
		aMap.put("c", true);

		System.out.println(aMap.get("c"));
	}
}
class HashMap {
	private Object[] keys;
	private Object[] values;
	private int size;

	HashMap() {
		int initsize = 3;
		keys = new Object[initsize];
		values = new Object[initsize];
	}

	private void sizeuparriffull() {
		if (isfull()) {
			sizeuparr();
		}
	}

	private boolean isfull() {
		return size == values.length;
	}

	private void sizeuparr() {
		Object[] newkeys = new Object[keys.length * 2];
		Object[] newvalues = new Object[values.length * 2];
		for (int i = 0; i < size; i++) {
			newkeys[i] = keys[i];
			newvalues[i] = values[i];
		}
		keys = newkeys;
		values = newvalues;
	}

	public void put(Object key, Object value) {
		int index = indexofkey(key);
		if (index != -1) {
			values[index] = value;
			return;
		}
		sizeuparriffull();
		keys[size] = key;
		values[size] = value;
		size++;
	}

	private int indexofkey(Object key) {
		for (int i = 0; i < size; i++) {
			if (keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}

	public Object get(Object key) {
		int index = indexofkey(key);
		if (index == -1) {
			return null;
		}
		return values[index];
	}
}
*/

/*
import java.util.*;
class Main {
	public static void main(String[] args) {
		Map<String, Integer> ages = new LinkedHashMap<>();
		ages.put("철수", 10);
		ages.put("영수", 20);
		ages.put("민수", 30);
		
		for(String name : ages.keySet()) {
		}
	}
}
*/

/*
//문제 : 아래가 실행되도록 해주세요.
class Main {
	public static void main(String[] args) {
		사람 a사람 = new 홍길동();
		변호사 a변호사 = (변호사)a사람;
	}
}
class 사람 {
}
class 홍길동 extends 사람 implements 변호사, 의사 {
	public void 말하다() {
	}
}
interface 변호사 {
	public void 말하다();
}
interface 의사 {
	public void 말하다();
}
*/

/*
// 문제 : 아래가 실행되도록 해주세요.
class Main {
	public static void main(String[] args) {
		사람 a사람 = new 홍길동();
		변호사 a변호사 = (변호사)a사람;
		치과의사 a치과의사 = (치과의사)a사람;
		성화봉송자 a성화봉송자 = (성화봉송자)a사람;
	}
}
abstract class 사람 {
}
class 홍길동 extends 사람 implements 변호사, 치과의사, 성화봉송자 {
	public void 충치치료() {
	}
}
interface 변호사 {
}
interface 치과의사 {
	public void 충치치료();
}
interface 성화봉송자 {
}
*/

/*
// 문제 : 아래가 실행되도록 해주세요.
class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		
		변호사 a변호사 = a사람;
		a변호사.변호하다();
		// 출력 : 사람이 변호 합니다.
		
		변호사 a변호사2 = new 오랑우탄();
		a변호사2.변호하다();
		// 출력 : 오랑우탄이 변호 합니다.
		
		의사 a의사 = new 오랑우탄();
		a의사.진찰하다();
		// 출력 : 오랑우탄이 진찰 합니다.
		
		의사 a의사2 = new 사람();
		a의사2.진찰하다();
		// 출력 : 사람이 진찰 합니다.
	}
}
class 사람 implements 변호사, 의사 {
	public void 변호하다() {
		System.out.println("사람이 변호합니다.");
	}
	public void 진찰하다() {
		System.out.println("사람이 진찰합니다.");
		
	}
}
interface 변호사 {
	public void 변호하다();
}
interface 의사 {
	public void 진찰하다();
}
class 오랑우탄 implements 변호사, 의사{
	public void 진찰하다() {
		System.out.println("오랑우탄이 변호합니다.");
	}
	public void 변호하다() {
		System.out.println("오랑우탄이 진찰합니다.");
	}
}
*/

/*
// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 구현 시작 ~ 구현 끝 사이 부분만 수정할 수 있습니다.
// 힌트 : instanceof
class Main {
	public static void main(String[] args) {
		진찰하다(new 사람());
		// 출력 : 사람이 진찰합니다.
		진찰하다(new 원숭이());
		// 출력 : 원숭이가 진찰합니다.
		진찰하다(new 치타());
		// 출력 : 치타가 진찰합니다.
		진찰하다(new 기린());
		// 출력 : 기린이 진찰합니다.
		진찰하다(new 로봇());
		// 출력 : 로봇이 진찰합니다.
		진찰하다(new 삼성());
		// 출력 : 삼성이 진찰합니다.
		진찰하다(new LG());
		// 출력 : 삼성이 진찰합니다.
	}
	public static void 진찰하다(Object obj) {
		if ( obj instanceof 사람 ) {
			사람 a사람 = (사람)obj;
			a사람.진료();
		}
		else if ( obj instanceof 원숭이 ) {
			원숭이 a원숭이 = (원숭이)obj;
			a원숭이.살펴보다();
		}
		else if ( obj instanceof 치타 ) {
			치타 a치타 = (치타)obj;
			a치타.진찰하다();
		}
		else if ( obj instanceof 기린 ) {
			기린 a기린 = (기린)obj;
			a기린.진료();
		}
		else if ( obj instanceof 로봇 ) {
			로봇 a로봇 = (로봇)obj;
			a로봇.오류감지();
		}
		else if ( obj instanceof 삼성 ) {
			삼성 a삼성 = (삼성)obj;
			a삼성.진찰하다();
		}
		else if ( obj instanceof LG ) {
			LG aLG = (LG)obj;
			aLG.진찰하다();
		}
	}
}
class 사람 {
	void 진료() {
		System.out.println("사람이 진찰합니다.");
	}
}
class 원숭이 {
	void 살펴보다() {
		System.out.println("원숭이가 진찰합니다.");
	}
}
class 치타 {
	void 진찰하다() {
		System.out.println("치타가 진찰합니다.");
	}
}
class 기린 {
	void 진료() {
		System.out.println("기린이 진찰합니다.");
	}
}
class 로봇 {
	void 오류감지() {
		System.out.println("로봇이 진찰합니다.");
	}
}
class 삼성 {
	void 진찰하다() {
		System.out.println("삼성이 진찰합니다.");
	}
}
class LG {
	void 진찰하다() {
		System.out.println("LG가 진찰합니다.");
	}
}
*/

/*
// 문제 : 아래가 실행되도록 해주세요.
// 조건 : Main 클래스는 수정 할 수 없습니다.
// 조건 : 각 클래스의 기존 메서드는 삭제/수정 할 수 없습니다.
// 조건 : 그 외의 모든 것은 전부 수정가능합니다.
// 조건 : 소스코드 중복이 있으면 안됩니다.
class Main {
	public static void main(String[] args) {
		진찰하다(new 사람());
		// 출력 : 사람이 진찰합니다.
		진찰하다(new 원숭이());
		// 출력 : 원숭이가 진찰합니다.
		진찰하다(new 치타());
		// 출력 : 치타가 진찰합니다.
		진찰하다(new 기린());
		// 출력 : 기린이 진찰합니다.
		진찰하다(new 로봇());
		// 출력 : 로봇이 진찰합니다.
		진찰하다(new 삼성());
		// 출력 : 삼성이 진찰합니다.
		진찰하다(new LG());
		// 출력 : 삼성이 진찰합니다.
		진찰하다(new 외계인());
	}
	// 여기에 static 추가
	public static void 진찰하다(의사 a의사) {
		a의사.진찰();
	}
}
interface 의사 {
	public void 진찰();
}
class 사람 implements 의사 {
	public void 진찰() {
		진료();
	}
	public void 진료() {
		System.out.println("사람이 진찰합니다.");
	}
}
class 원숭이 implements 의사 {
	public void 진찰() {
		살펴보다();
	}
	public void 살펴보다() {
		System.out.println("원숭이가 진찰합니다.");
	}
}
class 치타 implements 의사 {
	public void 진찰() {
		System.out.println("치타가 진찰합니다.");
	}
}
class 기린 implements 의사 {
	public void 진찰() {
		System.out.println("기린이 진찰합니다.");
	}
}
class 로봇 implements 의사 {
	public void 진찰() {
		오류감지();
	}
	public void 오류감지() {
		System.out.println("로봇이 진찰합니다.");
	}
}
class 삼성 implements 의사 {
	public void 진찰() {
		삼성병원에_진찰하라고_지시();
	}
	public void 삼성병원에_진찰하라고_지시() {
		System.out.println("삼성이 진찰합니다.");
	}
}
class LG implements 의사 {
	public void 진찰() {
		삼성병원에_진찰하라고_지시();
	}
	public void 삼성병원에_진찰하라고_지시() {
		System.out.println("LG가 진찰합니다.");
	}
}
class 외계인 implements 의사 {
	public void 진찰() {
		System.out.println("외계 기술로 진찰합니다.");
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		int rs = 계산기.나누다(10, 0);
		System.out.println(rs);
	}
}
class 계산기 {
	static int 나누다(int a, int b) {
		int rs = 0;
		try {
			rs = a / b;
		}
		catch ( ArithmeticException e ) {
			rs = 0;
		}
		return rs;
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		try { 
			int rs = 계산기.나누다(10, 0);
			System.out.println(rs);
		}
		catch ( ArithmeticException e ) {
			System.out.println("0으로 나눌 수는 없습니다. ㅠㅠ");
		}
		catch ( Exception e ) {
			System.out.println("알수 없는 에러가 발생하였습니다.");
		}
	}
}
class 계산기 {
	static int 나누다(int a, int b) throws ArithmeticException {
		int rs = a / b;
		return rs;
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		int[] datas = new int[10];
		
		//채우기_3개(datas, 5);
		//나누기(datas, 2);
		try {
			채우기_3개_그리고_나누기(datas, 10, 0);
		}
		catch ( ArrayIndexOutOfBoundsException e ) {
			System.out.println("배열의 크기를 3 이상으로 늘려주세요.");
		}
		catch ( ArithmeticException e ) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch ( Exception e ) {
			System.out.println("알 수 없는 이유로 수행되지 않았습니다.");
		}
		
		for ( int i = 0; i < datas.length; i++ ) {
			System.out.println("datas[" + i +  "] : " + datas[i]);
		}
	}
	
	static void 채우기_3개_그리고_나누기(int[] datas, int a, int b) throws ArrayIndexOutOfBoundsException, ArithmeticException {
		for ( int i = 0; i < 3; i++ ) {
			datas[i] = a;
		}
		
		for ( int i = 0; i < datas.length; i++ ) {
			datas[i] = datas[i] / b;
		}
	}
	
	static void 채우기_3개(int[] datas, int value) {
		for ( int i = 0; i < 3; i++ ) {
			datas[i] = value;
		}
	}
	
	static void 나누기(int[] datas, int a) {
		for ( int i = 0; i < datas.length; i++ ) {
			datas[i] = datas[i] / a;
		}
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			채우다(arr);
		}
		catch ( ArrayIndexOutOfBoundsException e ) {
			System.out.println("작업이 정상종료 되지 않았습니다.");
		}
		
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.println("arr[" + i + "] => " + arr[i]);
		}
	}
	
	static void 채우다(int[] arr) throws ArrayIndexOutOfBoundsException {
		for ( int i = 0; i < 11; i++ ) {
			arr[i] = (i + 1) * 100;
		}
	}
}
*/

/*
import java.util.*;
class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("나이>>");
			int age = sc.nextInt();
		} catch (ArithmeticException e) {
			System.out.println("다시 입력");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("다시 입력");
		} catch (Exception e) {
			System.out.println("다시 입력");
		}
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		try {
			배열의_길이_짧음_Exception.수행1(10);
		}
		catch (배열의_길이_짧음_Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
class 배열의_길이_짧음_Exception extends RuntimeException {
	배열의_길이_짧음_Exception(String msg) {
		super(msg);
	}
	static void 수행1(int num) throws 배열의_길이_짧음_Exception {
		if(num==2) {
			throw new 배열의_길이_짧음_Exception("에러내용");
		}
	}
}
*/

/*
class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		a사람.setid(20);
		System.out.println("제 번호는 " + a사람.getid() + " 입니다.");
		// 출력 : 제 번호는 20 입니다.
	}
}
class 사람 {
	// private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
	private int id;
	public void setid(int id) {
		if(id<=0) {
			this.id=1;
		}
		this.id=id;
	}
	public int getid() {
		return this.id;
	}
}
*/

/*
// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		// 구현시작
		a사람.setid(20);
		// 구현끝
		// 출력 : 제 번호는 20 입니다.
		System.out.println("제 번호는 "+a사람.getid()+"입니다.");
	}
}
class 사람 {
	private int id;
	// 힌트 : 여기에 메소드 2개 추가해야 합니다.
	public void setid(int id) {
		if(id<=0) {
			this.id = id;
		}
		this.id=id;
	}
	public int getid() {
		return this.id;
	}
}
*/
















