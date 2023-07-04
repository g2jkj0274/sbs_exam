// 문제 : 레퍼런스변수에 값 할당과정 설명

// 과정설명
// 변수선언 - 객체생성 - 값 할당

/*class Main {

	public static void main(String[] args) {
		// 설명 : 자료형 int x 선언
		int x;

		// 설명 : x에 20 대입
		x = 20;

		// 설명 : 자동차라는 이름의 함수로 a자동차 변수 선언
		자동차 a자동차;

		// 설명 : a자동차를 객체로 만듦
		a자동차 = new 자동차();

		// 설명 : 자동차 함수 내의 펑션을 실행
		a자동차.달리다();

		// 모든 객체들은 서로를 평생 볼 수 없다.
		// 모든 객체들은 서로를 원격조종한다.
	}
}

// 자동차 설계도!, 절대 자동차가 아니다.!!!
class 자동차 {
	// 이 메서드(함수)의 2가지 용도
	// - 실제 기능
	// - 리모콘 버튼
	void 달리다() {
		System.out.println("자동차가 달립니다.");
	}
}
*/

//문제 : 사람을 말하게 해주세요.

//class Main {
//	public static void main(String[] args) {
//		사람 aaa = new 사람();
//	}
//}
//
//class 사람 {
//// 사람은 `말하다` 라는 기능을 가지고 있습니다.
//	void 말하다() {
//		System.out.println("사람이 말합니다.");
//	}
//}

// 문제 : 아래 코드가 실행되도록 해주세요.

//class Main {
//	public static void main(String[] args) {
//		거북이 a거북이 = new 거북이();
//
//		a거북이.걷다();
//		// 출력 => 걷다
//		a거북이.수영하다();
//		// 출력 => 수영하다
//	}
//}
//class 거북이 {
//	void 걷다() {
//		System.out.println("걷다");
//	}
//	void 수영하다() {
//		System.out.println("수영하다");
//	}
//	
//}

// Main 클래스 안의 내용을 올바르게 수정해주세요.

//class Main {
//  public static void main(String[] args) {
//    자동차 car = new 자동차();
//    
//    car.달립니다();
//  }
//}
//
//class 자동차 {
//  void 달립니다() {
//    System.out.println("자동차가 달립니다.");
//  }
//}

//문제 : 아래 코드가 실행되도록 해주세요.

//class Main {
//	public static void main(String[] args) {
//		new 자동차().달립니다();
//	}
//}
//
//class 자동차 {
//	void 달립니다() {
//		System.out.println("자동차가 달립니다.");
//	}
//}

// 문제 : 클래스 5개 이상 만들고 각각을 객체화 하여 메서드를 호출해주세요.

//class Main {
//	public static void main(String[] args) {
//		a a = new a();
//		b b = new b();
//		c c = new c();
//		d d = new d();
//		e e = new e();
//		a.a1();
//		b.b1();
//		c.c1();
//		d.d1();
//		e.e1();
//	}
//}
//class a {
//	void a1() {
//		System.out.println("a");
//	}
//}
//class b {
//	void b1() {
//		System.out.println("b");
//	}
//}
//class c {
//	void c1() {
//		System.out.println("c");
//	}
//}
//class d {
//	void d1() {
//		System.out.println("d");
//	}
//}
//class e {
//	void e1() {
//		System.out.println("e");
//	}
//}

//문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.

//class Main {
//	public static void main(String[] args) {
//		달리다();
//	}
//	static void 달리다() {
//		System.out.println("run");
//	}
//}

//class Main {
//	public static void main(String[] args) {
//		print(3);
//	}
//	static void print(int dan) {
//		for(int i=1; i<=9;i++) {
//			System.out.printf("%d * %d = %d\n",dan, i, dan*i);
//		}
//	}
//}

//class Main {
//	public static void main(String[] args) {
//		int rs = cal.sum(20, 30);
//	}
//}
//class cal {
//	static int sum(int a, int b) {
//		System.out.println(a + b);
//		return a+b;
//	}
//}

// 문제 : 구구단을 만들어주세요
// 출력양식
/*
== 2단 ==
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
...
== 9단 ==
9 * 1 = 9
...
9 * 9 = 81
*/

//class Main {
//	public static void main(String[] args) {
//		new 구구단출력기().작동();
//		
//	}
//}
//
//class 구구단출력기 {
//	// 구현시작
//	void 작동() {
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//		}
//	}
//	// 구현끝
//}

//class Main {
//  public static void main(String[] args) {
//    계산기.더한결과를_화면에_출력(10, 20);
//    // 출력 => 결과 : 30
//
//    계산기.더한결과를_화면에_출력(50, 20);
//    // 출력 => 결과 : 70
//
//    계산기.뺀결과를_화면에_출력(50, 20);
//    // 출력 => 결과 : 30
//
//    계산기.뺀결과를_화면에_출력(5, 2);
//    // 출력 => 결과 : 3
//
//    계산기.곱한결과를_화면에_출력(5, 2);
//    // 출력 => 결과 : 10
//  }
//}
//
//class 계산기 {
//	static void 더한결과를_화면에_출력(int a, int b) {
//		System.out.println(a+b);
//	}
//	static void 뺀결과를_화면에_출력(int a, int b) {
//		System.out.println(a-b);
//	}
//	static void 곱한결과를_화면에_출력(int a, int b) {
//		System.out.println(a*b);
//	}
//}

//class Main {
//	public static void main(String[] args) {
//		int 결과;
//
//		결과 = 계산기.합(10, 20);
//		System.out.println("결과 : " + 결과);
//		// 출력 => 결과 : 30
//
//		결과 = 계산기.합(30, 20);
//		System.out.println("결과 : " + 결과);
//		// 출력 => 결과 : 50
//
//		결과 = 계산기.합(30, 70);
//		System.out.println("결과 : " + 결과);
//		// 출력 => 결과 : 100
//
//		결과 = 계산기.차(30, 70);
//		System.out.println("결과 : " + 결과);
//		// 출력 => 결과 : -40
//
//		결과 = 계산기.곱(3, 7);
//		System.out.println("결과 : " + 결과);
//		// 출력 => 결과 : 21
//	}
//}
//
//class 계산기 {
//	static int 합(int a, int b) {
//		return a+b;
//	}
//
//	static int 차(int a, int b) {
//		return a-b;
//	}
//
//	static int 곱(int a, int b) {
//		return a*b;
//	}
//}

// 문제 : 아래와 같이 출력 되도록 해주세요.

//class Main {
//	public static void main(String[] args) {
//		// 예시 시작
//		int c = 20 + Math.더하기(10, 20);
//		System.out.println(c);
//		// 예시 끝
//
//		int 결과1 = Math.oneToSum(3);
//		System.out.println("결과1 : " + 결과1);
//		// 출력 : 결과1 : 6
//
//		int 결과2 = Math.oneToSum(10);
//		System.out.println("결과2 : " + 결과2);
//		// 출력 : 결과2 : 55
//	}
//}
//
//class Math {
//	// static => 본사직원
//	// static은 현재 클래스에 지금당장 존재한다.
//	static int 더하기(int a, int b) {
//		// 메인 메서드의 int c와 아래 int c는 전혀 관계가 없다.
//		int c = a + b;
//
//		// return 값의 타입과 함수명의 앞부분이 같아야 한다.
//		// return => 변신
//		return c;
//	}
//
//	public static int oneToSum(int a) {
//		int sum = 0;
//		for(int i=1; i<=a; i++) {
//			sum += i;
//		}
//		return sum;
//	}
//}

// 문제 : 아래와 같이 출력 되도록 해주세요.

//class Main {
//	public static void main(String[] args) {
//		int 결과1 = Math.nToMSum(2, 3);
//		System.out.println("결과1 : " + 결과1);
//		// 출력 : 결과1 : 5
//
//		int 결과2 = Math.nToMSum(5, 10);
//		System.out.println("결과2 : " + 결과2);
//		// 출력 : 결과2 : 45
//	}
//}
//
//class Math {
//	public static int nToMSum(int a, int b) {
//		int sum = 0;
//		for (int i = a; i <= b; i++) {
//			sum += i;
//		}
//		return sum;
//	}
//}

// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `숨쉬다` 기능을 중복하지 말아주세요.
/*
 * class Main { public static void main(String[] args) { 사람 a사람 = new 사람();
 * a사람.숨쉬다(); } }
 * 
 * class 사람 extends 동물 { void 숨쉬다() { // 메서드 오버로딩 : 자식 클래스가 메서드를 재정의 하는 것 // 메서드
 * 오버로딩시 기존 메서드가 사라지는것이 아니며 덮어씌운 것이다 // ex) 사람 클래스의 메서드 총 갯수 : 3개)
 * System.out.println("사람 숨쉬다."); } // 메서드 오버라이딩 : 한 클래스 내에서 같은 이름의 메서드를 매개변수를
 * 다르게 하여 정의 // 기본적으로 하나의 클래스 안에 같은 이름의 메서드는 존재할 수 없다. void 숨쉬다(int a) {
 * 
 * } } class 동물 { void 숨쉬다() { System.out.println("동물 숨쉬다."); } void 걷다() {
 * System.out.println("동물 걷다."); } }
 */

/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
- D1 완료 : 클래스와 메서드를 만들어서 처리
- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
- D2 완료 : 클래스와 메서드를 만들어서 처리
- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
- D3 완료 : 상속을 사용해서 처리
- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
*/

/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
- D1 완료 : 클래스와 메서드를 만들어서 처리
- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
- D2 완료 : 클래스와 메서드를 만들어서 처리
- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
- D3 완료 : 상속을 사용해서 처리
- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
- D4 완료 : 클래스와 메서드를 만들어서 처리
- D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
- D5 완료 : 메서드 오버라이드를 사용해서 처리
- D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
- D6 완료 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
- D7 요구 : 고무오리계열에서 날다 메서드의 중복을 제거해주세요.
- D7 완료 : 상속으로 해결
- D8 요구 : 자바에서 다중상속은 불가능 합니다. 상속에는 한계가 있습니다. 복잡한 상속을 사용하지 않고 고무오리계열의 중복을 제거해주세요.
  - 복잡한 상속을 사용하지 않는다는 것의 의미 : 모든 오리 계열 클래스들은 부모클래스가 오리 클래서 여야 한다.
*/
/*
 * class Main { public static void main(String[] args) { 청둥오리 a청둥오리 = new
 * 청둥오리(); a청둥오리.날다(); // 출력 : 오리가 날개로 날아갑니다.
 * 
 * 흰오리 a흰오리 = new 흰오리(); a흰오리.날다(); // 출력 : 오리가 날개로 날아갑니다.
 * 
 * 고무오리 a고무오리 = new 고무오리(); a고무오리.날다(); // 출력 : 저는 날 수 없어요. ㅜㅠ
 * 
 * 고무2오리 a고무2오리 = new 고무2오리(); a고무2오리.날다(); // 출력 : 저는 날 수 없어요. ㅜㅠ } }
 * 
 * class 오리 { void 날다() { System.out.println("오리가 날개로 날아갑니다."); } }
 * 
 * // 오리 => 부모 클래스 // 흰오리 => 자식 클래스 // 흰오리 extends 오리 => 흰오리가 오리의 능력을 물려 받는다. //
 * "`흰오리`는 `오리`이다." 라고 자바에게 알려준다. // `A 는 B 이다.` 테스트에 통과하는 것만 상속이 가능하다. // 클래스와
 * 객체는 명사이다. // 메서드는 동사이다. class 흰오리 extends 오리 {
 * 
 * }
 * 
 * class 청둥오리 extends 오리 {
 * 
 * }
 * 
 * class 고무오리 extends 오리 { // 메서드 재정의 라고 합니다. // 메서드 오버라이드 라고도 합니다. // 메서드 재정의
 * => 부모가 물려준 능력을 다시 구현한다. void 날다() { System.out.println("저는 날 수 없어요. ㅜㅠ"); } }
 * 
 * class 고무2오리 extends 오리 { void 날다() { System.out.println("저는 날 수 없어요. ㅜㅠ"); }
 * }
 */

// 문제 : 고무오리, 고무2오리, 흰오리, 청둥오리 객체를 만들고 날게 해주세요. 단 고무오리 계열은 날 수 없습니다.
// 조건 : 메서드는 중복될 수 없습니다.
/*
 * class Main { public static void main(String[] args) {
 * 
 * 청둥오리 a청둥오리 = new 청둥오리(); a청둥오리.날다(); // 출력 : 오리가 날개로 날아갑니다.
 * 
 * 흰오리 a흰오리 = new 흰오리(); a흰오리.날다(); // 출력 : 오리가 날개로 날아갑니다.
 * 
 * 고무오리 a고무오리 = new 고무오리(); a고무오리.날다(); // 출력 : 저는 날 수 없어요. ㅜㅠ
 * 
 * 고무2오리 a고무2오리 = new 고무2오리(); a고무2오리.날다(); // 출력 : 저는 날 수 없어요. ㅜㅠ } } } }
 * 
 * class 오리 { void 날다() { System.out.println("오리가 날개로 날아갑니다."); } } class 청둥오리
 * extends 오리 { } class 흰오리 extends 오리 { } class 고무오리 extends 오리 { void 날다() {
 * System.out.println("저는 날 수 없어요. ㅜㅠ"); } } class 고무2오리 extends 오리 { void 날다()
 * { System.out.println("저는 날 수 없어요. ㅜㅠ"); }
 * 
 * }
 */

// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : 소스코드 중복이 없어야 합니다.
// 조건 : 복잡한 상속을 써도 됩니다.
/*
 * class Main { public static void main(String[] args) {
 * System.out.println("== 청둥오리 =="); 청둥오리 a청둥오리 = new 청둥오리(); a청둥오리.날다(); // 오리가
 * 날개로 날아갑니다. a청둥오리.수영하다(); // 오리가 물갈퀴로 수영합니다.
 * 
 * System.out.println("== 흰오리 =="); 흰오리 a흰오리 = new 흰오리(); a흰오리.날다(); // 오리가 날개로
 * 날아갑니다. a흰오리.수영하다(); // 오리가 물갈퀴로 수영합니다.
 * 
 * System.out.println("== 고무오리 =="); 고무오리 a고무오리 = new 고무오리(); a고무오리.날다(); // 저는
 * 못 날아요 ㅠㅠ a고무오리.수영하다(); // 오리가 물에 둥둥 떠다닙니다.
 * 
 * System.out.println("== 고무2오리 =="); 고무2오리 a고무2오리 = new 고무2오리(); a고무2오리.날다();
 * // 저는 못 날아요 ㅠㅠ a고무2오리.수영하다(); // 오리가 물에 둥둥 떠다닙니다.
 * 
 * System.out.println("== 로봇오리 =="); 로봇오리 a로봇오리 = new 로봇오리(); a로봇오리.날다(); // 오리가
 * 날개로 날아갑니다. a로봇오리.수영하다(); // 오리가 물에 둥둥 떠다닙니다. } } class 오리 { void 날다() {
 * System.out.println("오리가 날개로 날아갑니다."); }
 * 
 * void 수영하다() { System.out.println("오리가 물갈퀴로 수영합니다."); } } class 흰오리 extends 오리
 * { } class 청둥오리 extends 오리 { } class 고무오리 extends 오리 { void 날다() {
 * System.out.println("저는 못 날아요. ㅜㅠ"); }
 * 
 * void 수영하다() { System.out.println("오리가 물에 둥둥 떠다닙니다."); } } class 고무2오리 extends
 * 고무오리 { } class 로봇오리 extends 오리 { void 수영하다() {
 * System.out.println("오리가 물에 둥둥 떠다닙니다."); } }
 */

// 문제 : 아래가 실행되도록 해주세요.
/*class Main {
	public static void main(String[] args) {
		무기 a무기 = new 칼();
		a무기 = new 활();
	}
}

class 무기 {
}
class 칼 extends 무기 {
}
class 활 extends 무기 {
}*/

/*
 * class Main { public static void main(String[] args) { 무기 a무기 = new 칼();
 * a무기.공격(); // 출력 : 칼로 공격합니다. } } class 무기 { void 공격() { } } class 칼 extends 무기
 * { void 공격() { System.out.println("칼로 공격합니다."); } } class 활 extends 무기 { void
 * 공격() { System.out.println("활로 공격합니다."); } }
 */

// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.
/*
 * class Main { public static void main(String[] args) { 전사 a전사 = new 전사();
 * 
 * a전사.공격("브라이언", "칼"); // 브라이언이(가) 칼(으)로 공격합니다.
 * 
 * a전사.공격("필립", "창"); // 필립이(가) 창(으)로 공격합니다.
 * 
 * a전사.공격("마크", "지팡이"); // 마크(가) 지팡이(으)로 공격합니다. } } class 전사 { void 공격(String
 * npc, String weapon) { System.out.printf("%s이(가) %s(으)로 공격합니다.\n", npc,
 * weapon); } }
 */

// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.
/*
 * class Main { public static void main(String[] args) { 전사 a전사 = new 전사();
 * 
 * a전사.공격("브라이언", "칼"); // 브라이언이(가) 칼(으)로 공격합니다. a전사.재공격(); // 브라이언이(가) 칼(으)로
 * 공격합니다. a전사.공격("필립", "창"); // 필립이(가) 창(으)로 공격합니다. a전사.공격("마크", "지팡이"); //
 * 마크(가) 지팡이(으)로 공격합니다. a전사.재공격(); // 마크(가) 지팡이(으)로 공격합니다. a전사.재공격(); // 마크(가)
 * 지팡이(으)로 공격합니다. } } class 전사 { String REnpc; String REweapon; void 공격(String
 * npc, String weapon) { // 변수명이 같을경우 this를 반드시 붙여야 함 REnpc = npc; REweapon =
 * weapon; 재공격(); } void 재공격() { String npc = REnpc; String weapon = REweapon;
 * System.out.printf("%s이(가) %s(으)로 공격합니다.\n", npc, weapon); } }
 */

// 상황 : DVD방에 3개의 서로다른 tv가 있다. 영업을 하다보니 각 tv의 특별한 기능은 거의 사용될 일이 없고 기본적인 켜기/끄기 만 사용된다. 현재 리모콘이 3개나 있는습니다.
// 문제 : 알바를 편하게 하기 위해서 표준Tv 리모콘을 구현해주세요.

/*
 * class Main { public static void main(String[] args) {
 * System.out.println("== 표준Tv 리모콘 들여오기 전 ==");
 * 
 * 샤오미Tv a샤오미Tv = new 샤오미Tv(); 삼성Tv a삼성Tv = new 삼성Tv(); LGTv aLGTv = new LGTv();
 * 
 * a샤오미Tv.켜기(); // 출력 => 샤오미Tv 켜집니다. a샤오미Tv.끄기(); // 출력 => 샤오미Tv 꺼집니다.
 * a샤오미Tv.vr켜기(); // 출력 => 샤오미Tv vr켜기!
 * 
 * a삼성Tv.켜기(); // 출력 => 삼성Tv 켜집니다. a삼성Tv.끄기(); // 출력 => 삼성Tv 꺼집니다. a삼성Tv.ar켜기();
 * // 출력 => 삼성Tv ar켜기!
 * 
 * aLGTv.켜기(); // 출력 => LGTv 켜집니다. aLGTv.끄기(); // 출력 => LGTv 꺼집니다.
 * aLGTv.게임모드전환(); // 출력 => LGTv 게임모드전환!
 * 
 * System.out.println("== 표준Tv 리모콘 들여온 후 ==");
 * 
 * // 표준Tv 리모콘을 만든다. 표준Tv a표준Tv;
 * 
 * // a표준Tv 변수에 샤오미Tv 객체를 연결한다. a표준Tv = a샤오미Tv; a표준Tv.켜기(); // 출력 : 샤오기TV 켜집니다.
 * a표준Tv.끄기(); // 출력 : 샤오기TV 꺼집니다.
 * 
 * // a표준Tv 변수에 삼성Tv 객체를 연결한다. a표준Tv = a삼성Tv; a표준Tv.켜기(); // 출력 : 삼성TV 켜집니다.
 * a표준Tv.끄기(); // 출력 : 삼성TV 꺼집니다.
 * 
 * // a표준Tv 변수에 LGTv 객체를 연결한다. a표준Tv = aLGTv; a표준Tv.켜기(); // 출력 : LGTV 켜집니다.
 * a표준Tv.끄기(); // 출력 : LGTV 꺼집니다.
 * 
 * // LGTV만의 고유 기능을 표준Tv 리모콘을 이용해서 호출하기 => 불가능 // (LGTv) => a표준Tv 변수에 있던 표준Tv
 * 리모콘이 LGTv리모콘화 해서 `aLGTv2` 변수에 들어간다. LGTv aLGTv2 = (LGTv) a표준Tv;
 * aLGTv2.게임모드전환(); } } class 표준Tv { void 켜기() { } void 끄기() { } }
 * 
 * class 샤오미Tv extends 표준Tv { void 켜기() { System.out.println("샤오미Tv 켜집니다."); }
 * void 끄기() { System.out.println("샤오미Tv 꺼집니다."); } void vr켜기() {
 * System.out.println("샤오미Tv vr켜기!"); } }
 * 
 * class 삼성Tv extends 표준Tv { void 켜기() { System.out.println("삼성Tv 켜집니다."); }
 * void 끄기() { System.out.println("삼성Tv 꺼집니다."); } void ar켜기() {
 * System.out.println("삼성Tv ar켜기!"); } }
 * 
 * class LGTv extends 표준Tv { void 켜기() { System.out.println("LGTv 켜집니다."); }
 * void 끄기() { System.out.println("LGTv 꺼집니다."); } void 게임모드전환() {
 * System.out.println("LGTv 게임모드전환!"); } }
 */

// 문제 : 자동차 리모콘이 페라리 객체를 가리키게 한 후 해당 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로 가리키게(참조하게) 하는 코드를 작성해주세요.

/*
 * class Main { public static void main(String[] args) { // 수정가능지역 시작 자동차 a자동차 =
 * new 페라리(); 페라리 a페라리 = (페라리) a자동차; // 수정가능지역 끝 } }
 * 
 * } } class 자동차 { void 달리다() { } void 서다() { } } class 페라리 extends 자동차 { void
 * 뚜껑이_열리다() { } }
 */

// 문제 : `a무기.공격();` 가 실행되는 세부과정을 자세히 쓰세요.

/*
 * class Main { public static void main(String[] args) { 무기 a무기 = new 칼();
 * a무기.공격(); } } class 무기 { void 공격() { } } class 칼 extends 무기 { void 공격() { } }
 */

/*
 * class Main { public static void main(String[] args) {
 * System.out.println("=전사1="); 전사 a칼전사1 = new 전사(); a칼전사1.공격();
 * 
 * System.out.println("=전사2="); 전사 a칼전사2 = new 전사(); a칼전사2.이름 = "이춘삼";
 * a칼전사2.공격(); } } class 전사 { String 이름; 무기 a무기; 전사() { this.이름 = "김덕배";
 * this.a무기 = new 칼(); } void 공격() { a무기.작동(이름); } } class 무기 { void 작동(String
 * 공격자명) { System.out.printf("%s이(가) 칼로 공격.\n", 공격자명); } } class 칼 extends 무기 {
 * 
 * }
 */

// 문제 : 아래가 실행되도록 해주세요.

/*class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		a사람.a왼팔 = new 팔();
		
		System.out.println(a사람.a왼팔.길이);
	}
}

class 사람 {
	// 클래스안에 변수를 정의 할 수 있다.
	int 나이;
	팔 a왼팔;
}
class 팔 {
	int 길이;
}
*/

//문제 : 아래가 실행되도록 해주세요. 매개변수 금지

/*class Main {
	public static void main(String[] args) {
		전사 a전사 = new 전사();

		String 이름 = "칸";
		a전사.이름 = 이름;
		a전사.나이 = 20;
		a전사.자기소개();

		a전사.나이++;
		a전사.자기소개();

		a전사.나이 = 30;
		a전사.이름 = "카니";
		a전사.자기소개();
		
		a전사.a무기 = new 활();
		a전사.공격();
		// 출력 : 카니가 활로 공격합니다.
		a전사.a무기 = new 칼();
		a전사.공격();
		// 출력 : 카니가 칼로 공격합니다.
	}
}
class 전사 {
	String 이름;
	int 나이;
	무기 a무기;
	void 자기소개() {
		System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
	}
	void 공격() {	
		a무기.공격자명 = 이름;
		a무기.작동();
	}
}
class 무기 {
	String 공격자명;
	void 작동() {	}
}
class 칼 extends 무기 {
	void 작동() {
		System.out.printf("%s가 칼로 공격합니다.\n", 공격자명);
	}
}
class 활 extends 무기 {
	void 작동() {
		System.out.printf("%s가 활로 공격합니다.\n", 공격자명);
	}
}*/

/*class Main {
	public static void main(String[] args) { 사람 a김철수 = new 사람();
  a김철수.이름 = "김철수"; a김철수.전화번호 = "010-1234-1234"; a김철수.a좋아하는_음식점 = new 영화반점();
  a김철수.선호하는_음식의_매운정도 = "매운"; a김철수.선호하는_음식 = "짬뽕";
  
  사람 a김영희 = new 사람(); a김영희.이름 = "김영희"; a김영희.전화번호 = "010-4321-4321";
  a김영희.a좋아하는_음식점 = new 북경반점(); a김영희.선호하는_음식의_매운정도 = "안매운"; a김영희.선호하는_음식 = "짬뽕";
  
  a김철수.배달_음식_주문하다(); // 영화반점에서 김철수(010-1234-1234)에게 매운 짬뽕(을)를 배달합니다.
  
  a김영희.배달_음식_주문하다(); // 북경반점에서 김영희(010-4321-4321)에게 안매운 짬뽕(을)를 배달합니다.
  
  a김영희.a좋아하는_음식점 = a김철수.a좋아하는_음식점; a김영희.선호하는_음식의_매운정도 = "아주 매운"; a김영희.선호하는_음식 =
  "짜장";
  
  a김영희.배달_음식_주문하다(); // 영화반점에서 김영희(010-4321-4321)에게 아주 매운 짜장(을)를 배달합니다. } }
  class 사람 { String 이름; String 전화번호; 음식점 a좋아하는_음식점; String 선호하는_음식의_매운정도;
  String 선호하는_음식; void 배달_음식_주문하다() { a좋아하는_음식점.작동(이름, 전화번호, 선호하는_음식의_매운정도,
  선호하는_음식); } } class 음식점 { String a좋아하는_음식점; void 작동(String 이름, String 전화번호,
  String 선호하는_음식의_매운정도, String 선호하는_음식) { } } class 영화반점 extends 음식점 { void
  작동(String 이름, String 전화번호, String 선호하는_음식의_매운정도, String 선호하는_음식) {
  System.out.printf("영화반점에서 %s(%s)에게 %s %s(을)를 배달합니다.\n", 이름, 전화번호,
  선호하는_음식의_매운정도, 선호하는_음식); } } class 북경반점 extends 음식점 { void 작동(String 이름,
  String 전화번호, String 선호하는_음식의_매운정도, String 선호하는_음식) {
  System.out.printf("북경반점에서 %s(%s)에게 %s %s(을)를 배달합니다.\n", 이름, 전화번호,
  선호하는_음식의_매운정도, 선호하는_음식); } }
 */

/*
 * class Main { public static void main(String[] args) { 칼 a무기1 = new 칼(); 활
 * a무기2 = new 활(); 총 a무기3 = new 총();
 * 
 * 무기[] 무기들 = new 무기[] {a무기1, a무기2, a무기3};
 * 
 * for(int i=0; i<무기들.length; i++) { 무기 a무기 = 무기들[i]; a무기.작동(); } } } interface
 * 무기 { void 작동(); } interface 장난감무기{ void 작동2(); } class 칼 implements 무기, 장난감무기
 * { public void 작동() { System.out.println("칼 작동"); } public void 작동2() {
 * System.out.println("장난감"); } } class 활 implements 무기 { public void 작동() {
 * System.out.println("활 작동"); } } class 총 implements 무기 { public void 작동() {
 * System.out.println("총 작동"); } }
 */

/*
 * class Main { public static void main(String[] args) { int n1 = 10; int n2 =
 * 20; int n3 = 30;
 * 
 * // 배열 생성 int[] all = new int[] {n1, n2, n3};
 * 
 * System.out.println("== 일반 반복 =="); for ( int i = 0; i < all.length; i++ ) {
 * System.out.println(all[i]); }
 * 
 * System.out.println("== 향상된 반복 =="); for ( int n : all ) {
 * System.out.println(n); } } }
 */

/*
 * class Main { public static void main(String[] args) { 사람 a김철수 = new 김철수(); 사람
 * a김영희 = new 김영희();
 * 
 * a김철수.배달_음식_주문하다(); // 영화반점에서 김철수(010-1234-1234)에게 매운 짬뽕(을)를 배달합니다.
 * 
 * a김영희.배달_음식_주문하다(); // 북경반점에서 김영희(010-4321-4321)에게 안매운 짬뽕(을)를 배달합니다.
 * 
 * a김영희.a좋아하는_음식점 = a김철수.a좋아하는_음식점; a김영희.선호하는_음식의_매운정도 = "아주 매운"; a김영희.선호하는_음식 =
 * "짜장";
 * 
 * a김영희.배달_음식_주문하다(); // 영화반점에서 김영희(010-4321-4321)에게 아주 매운 짜장(을)를 배달합니다. } }
 * class 사람 { String 이름, 번호, 선호하는_음식의_매운정도, 선호하는_음식; 음식점 a좋아하는_음식점; void
 * 배달_음식_주문하다() { a좋아하는_음식점.작동(이름, 번호, 선호하는_음식의_매운정도, 선호하는_음식); } } class 김철수
 * extends 사람{ 김철수(){ this.이름 = "김철수"; this.번호 = "010-1234-1234"; a좋아하는_음식점 =
 * new 영화반점(); this.선호하는_음식의_매운정도 = "매운"; this.선호하는_음식 = "짬뽕"; } } class 김영희
 * extends 사람{ 김영희(){ this.이름 = "김영희"; this.번호 = "010-4321-4321"; a좋아하는_음식점 =
 * new 북경반점(); this.선호하는_음식의_매운정도 = "매운"; this.선호하는_음식 = "짬뽕"; } } interface 음식점
 * { void 작동(String 이름, String 번호, String 선호하는_음식의_매운정도, String 선호하는_음식); }
 * class 영화반점 implements 음식점 { public void 작동(String 이름, String 번호, String
 * 선호하는_음식의_매운정도, String 선호하는_음식) {
 * System.out.printf("영화반점에서 %s(%s)에게 %s %s(을)를 배달합니다.\n", 이름, 번호,
 * 선호하는_음식의_매운정도, 선호하는_음식); } } class 북경반점 implements 음식점 { public void
 * 작동(String 이름, String 번호, String 선호하는_음식의_매운정도, String 선호하는_음식) {
 * System.out.printf("북경반점에서 %s(%s)에게 %s %s(을)를 배달합니다.\n", 이름, 번호,
 * 선호하는_음식의_매운정도, 선호하는_음식); } }
 */

/*class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		a사람.달리기_속력 = 20;
		a사람.달리다();
		// 사람이 20km/h로 달립니다.
		a사람.달리다();
		// 사람이 20km/h로 달립니다.

		a사람.달리기_속력 = 50;
		a사람.달리다();
		// 사람이 50km/h로 달립니다.
	}
}
class 사람 {
	int 달리기_속력;
	void 달리다() {
		System.out.printf("사람이 %dkm/h로 달립니다.\n", this.달리기_속력);
	}
}*/

/*
 * class Main { public static void main(String[] args) { int i = 로봇.get정수();
 * boolean b = 로봇.get논리(); 사람 a사람 = 로봇.get사람(); 사람 a사람2 = 로봇.get사람2(); 사람 a사람3 =
 * 로봇.get사람3(); 사람 a사람4 = 로봇.get사람4(); 사람 a사람5 = 로봇.get사람5(123, false);
 * 로봇.get사람6(123, false); } }
 * 
 * class 사람 { int 나이; boolean 결혼여부; } class 로봇 { static int get정수() { int i = 0;
 * return i; } static boolean get논리() { boolean b = false; return b; } static 사람
 * get사람() { return null; } static 사람 get사람2() { return new 사람(); } static 사람
 * get사람3() { 사람 a사람 = new 사람(); return a사람; } static 사람 get사람4() { 사람 a사람 =
 * null; return a사람; } static 사람 get사람5(int i, boolean b) { 사람 a사람 = new 사람();
 * a사람.나이 = 1; a사람.결혼여부 = false; return a사람; } static 사람 get사람6(int i, boolean
 * b) { return null; } }
 */

// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

/*
 * class Main { public static void main(String[] args) { 사람인력관리소 a사람인력관리소 = new
 * 사람인력관리소();
 * 
 * a사람인력관리소.add사람("홍길순", 33); // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
 * a사람인력관리소.add사람("홍길동", 20); // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
 * a사람인력관리소.add사람("임꺽정", 30); // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
 * a사람인력관리소.add사람("임꺽순", 50); // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
 * 
 * 사람 a사람1 = a사람인력관리소.get사람(1); a사람1.자기소개(); // 저는 1번, 홍길순, 33살 입니다.
 * 
 * 사람 a사람2 = a사람인력관리소.get사람(2); a사람2.자기소개(); // 저는 2번, 홍길동, 20살 입니다.
 * 
 * 사람 a사람3 = a사람인력관리소.get사람(3); a사람3.자기소개(); // 저는 3번, 임꺽정, 30살 입니다.
 * 
 * 사람 a사람4 = a사람인력관리소.get사람(4); a사람4.자기소개(); } } class 사람인력관리소 { 사람[] 사람들; int
 * last_num; 사람인력관리소() { last_num = 0; 사람들 = new 사람[100]; } void add사람(String
 * name, int age) { int num = last_num+1; 사람 a사람 = new 사람(); a사람.name = name;
 * a사람.age = age; a사람.num = num;
 * 
 * 사람들[num-1] = a사람;
 * 
 * System.out.printf("%d번-%s-%d살\n", num, name, age);
 * 
 * last_num = num; } 사람 get사람(int num) { return 사람들[num-1]; } } class 사람 { int
 * num, age; String name; 사람 a다음사람; void 자기소개() {
 * System.out.printf("저는 %d번, %s, %d살 입니다.\n", num, name, age); } }
 */

// 힌트 : if ( a무기 == null ) { ... }

/*
 * class Main { public static void main(String[] args) { 전사 a전사 = new 전사();
 * 
 * a전사.a무기1 = new 칼(); a전사.공격(); // 출력 => 전사가 칼로 공격합니다.
 * 
 * a전사.a무기1 = new 활(); a전사.공격(); // 출력 => 전사가 활로 공격합니다.
 * 
 * a전사.a무기2 = new 칼(); a전사.공격(); // 출력 => 전사가 활로 공격합니다. // 출력 => 전사가 칼로 공격합니다. }
 * }
 * 
 * class 전사 { 무기 a무기1, a무기2; void 공격() { if (a무기1 != null) {
 * System.out.print("전사가 "); a무기1.작동(); } if (a무기2 != null) {
 * System.out.print("전사가 "); a무기2.작동(); } } } class 무기 { void 작동() { } } class 칼
 * extends 무기 { void 작동() { System.out.println("칼로 공격 합니다."); } } class 활
 * extends 무기 { void 작동() { System.out.println("활로 공격 합니다."); } }
 */

/*
 * class Main { public static void main(String[] args) { 전사 a전사1 = new 전사();
 * 
 * a전사1.a왼손무기 = new 칼(); a전사1.공격(); // 출력 => 전사가 왼손으로 칼(을)를 사용합니다.
 * 
 * 전사 a전사2 = new 전사(); a전사2.a왼손무기 = new 창(); a전사2.a오른손무기 = new 도끼(); a전사2.공격();
 * // 출력 => 전사가 왼손으로 창(을)를 사용합니다. // 출력 => 전사가 오른손으로 도끼(을)를 사용합니다. } } class 전사
 * { 무기 a왼손무기, a오른손무기; void 공격() { if (a왼손무기 != null) { a왼손무기.작동("전사", "왼손"); }
 * if (a오른손무기 != null) { a오른손무기.작동("전사", "오른손"); } } } class 무기 { void 작동(String
 * 전사, String 손) { } } class 칼 extends 무기 { void 작동(String 전사, String 손) {
 * System.out.printf("%s가 %s의 칼으로 공격 합니다.\n", 전사, 손); } } class 창 extends 무기 {
 * void 작동(String 전사, String 손) { System.out.printf("%s가 %s의 창으로 공격 합니다.\n", 전사,
 * 손); } } class 도끼 extends 무기 { void 작동(String 전사, String 손) {
 * System.out.printf("%s가 %s의 도끼로 공격 합니다.\n", 전사, 손); } }
 */

// 문제 : 아래와 같이 출력 되도록 해주세요.
/*
 * class Main { public static void main(String[] args) { 캐릭터 a플레이어_캐릭터;
 * 
 * a플레이어_캐릭터 = new 전사(); a플레이어_캐릭터.공격(); // 출력 : 전사가 대검으로 공격합니다.
 * 
 * a플레이어_캐릭터 = new 마법사(); a플레이어_캐릭터.공격(); // 출력 : 마법사가 파이어볼로 공격합니다. } } class
 * 캐릭터 { void 공격() { } } class 전사 extends 캐릭터 { void 공격() {
 * System.out.println("전사 대검 공격"); } } class 마법사 extends 캐릭터 { void 공격() {
 * System.out.println("마법사 불 공격"); } }
 */

// 문제 : 아래와 같이 출력되게 해주세요.
/*
 * class Main { public static void main(String[] args) { 전사 a전사0 = new 전사();
 * a전사0.나이 = 20; a전사0.이름 = "칸"; a전사0.성격 = "차가움"; a전사0.a무기 = new 활();
 * 
 * 전사 a전사1 = new 전사(); 전사 a전사2 = new 전사(); 전사 a전사3 = new 전사(); 전사 a전사4 = new
 * 전사(); 전사 a전사5 = new 전사();
 * 
 * System.out.println(a전사0.이름); // 출력 : 칸 System.out.println(a전사1.이름); // 출력 :
 * No Name System.out.println(a전사2.이름); // 출력 : No Name
 * System.out.println(a전사3.이름); // 출력 : No Name System.out.println(a전사4.이름); //
 * 출력 : No Name System.out.println(a전사5.이름); // 출력 : No Name } }
 * 
 * class 전사 { int 나이; String 이름; String 성격; 무기 a무기;
 * 
 * // `전사()` 는 생성자 메서드 이다. // 클래스 명과 같은 이름의 메서드를 생성자 메서드 라고 한다. // 생성자 메서드는 자동으로
 * 호출됩니다. // 생성자 메서드는 new 할때(객체 생성할 때) 자동으로 호출됩니다. // 생성자 메서드는 다른 모든 메서드 보다 가장
 * 먼저 딱 1번 실행됩니다. // 생성자 메서드는 리턴타입이 없습니다. // 당연하지만 생성자 메서드는 리턴값도 없습니다. 전사() { //
 * 수정가능지역 시작 this.나이 = 20; this.이름 = "No Name"; this.성격 = "온순함"; this.a무기 = new
 * 칼(); // 수정가능지역 끝 } }
 * 
 * abstract class 무기 { }
 * 
 * class 칼 extends 무기 { }
 * 
 * class 활 extends 무기 { }
 */

// 출력 : 아래와 같이 출력되게 해주세요.
/*
 * class Main { public static void main(String[] args) { 사람 a사람 = new 사람();
 * a사람.나이 = 10; a사람.a왼팔 = new 팔();
 * 
 * System.out.println(a사람.a왼팔.길이 + "cm"); // 출력 : 100cm } } class 사람 { int 나이; 팔
 * a왼팔; } class 팔 { int 길이; 팔() { 길이 = 100; } }
 */

// 출력 : 아래와 같이 출력되게 해주세요.
/*
 * class Main { public static void main(String[] args) { new 사람().걷다();
 * 
 * System.out.println(new 사람().a왼팔.길이 + "cm"); // 출력 : 100cm } }
 * 
 * class 사람 { 팔 a왼팔; 사람() { a왼팔 = new 팔(); } void 걷다() {
 * System.out.println("사람 걷는다."); } } class 팔 { int 길이; 팔() { 길이 = 100; } }
 */

// 문제 : 사람의 걷다 메서드에 this. 를 적절한 곳에 추가해주세요.
/*
 * class Main { // 함수, 메서드 // 단순히 프로그램의 시작점! public static void main(String[]
 * args) { // 지역변수 => 하루살이 변수 int k = 10; // main 함수 안에서만 산다.
 * 
 * 사람 a사람 = new 사람(); a사람.나이 = 20;
 * 
 * int dan = 8; // main 함수 안에서만 산다. for (int i = 1; i < 9; i++) { // i => for
 * block 안에서만 산다. System.out.println(dan + " * " + i + " = " + dan * i); }
 * 
 * System.out.println(a사람.나이); a사람.걷다(); } } class 사람 { // 인스턴스 변수 int 나이; void
 * 걷다() { int 나이 = 22; System.out.println(this.나이 + "살인 홍길동씨가 걷습니다.");
 * System.out.println(나이 + "살인 홍길동씨가 걷습니다."); } }
 */

// 문제 : 아래와 같이 출력 되도록 해주세요.
// 조건 : 생성자를 단 1개만 사용해주세요.
/*
 * class Main { public static void main(String[] args) { int 엄지손가락_길이 = new
 * 사람().a왼팔.a손.a엄지손가락.길이; System.out.println(엄지손가락_길이 + "cm"); // 출력 : 5cm } }
 * class 사람 { 팔 a왼팔; 사람() { a왼팔 = new 팔(); a왼팔.a손 = new 손(); a왼팔.a손.a엄지손가락 = new
 * 손가락(); a왼팔.a손.a엄지손가락.길이 = 5; } } class 팔 { 손 a손; } class 손 { 손가락 a엄지손가락; }
 * class 손가락 { int 길이; }
 */

// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : 클래스는 전사 클래스 1개만 만들어주세요.
// 조건 : if문을 사용해주세요.
/*class Main {
	public static void main(String[] args) {
		전사 a전사 = new 전사();

		a전사.공격();
		// 칼(으)로 공격합니다.

		a전사.창_모드로_변경();
		a전사.공격();
		// 창(으)로 공격합니다.

		a전사.지팡이_모드로_변경();
		a전사.공격();
		// 지팡이(으)로 공격합니다.
	}
}
class 전사 {
	int 무기;
	전사() {
		무기 = 0;
	}
	void 공격() {
		if(무기==0) {
			System.out.println("칼로 공격합니다.");
		}
		if(무기==1) {
			System.out.println("창로 공격합니다.");
		}
		if(무기==2) {
			System.out.println("지팡이로 공격합니다.");
		}
	}
	void 창_모드로_변경() {
		무기=1;
	}
	void 지팡이_모드로_변경() {
		무기=2;
	}
}*/

// 문제 : 아래 코드가 실행되도록 해주세요.
/*class Main {
	public static void main(String[] args) {
		병사 a병사 = new 병사();
		a병사.이름 = "홍길동";

		a병사.자기소개();
		// 안녕하세요. 저는 홍길동 이병 입니다.
		a병사.공격();
		// 홍길동 이병이 공격합니다.(공격력 : 7)

		a병사.진급();
		a병사.자기소개();
		// 안녕하세요. 저는 홍길동 일병 입니다.
		a병사.공격();
		// 홍길동 일병이 공격합니다.(공격력 : 9)

		a병사.진급();
		a병사.자기소개();
		// 안녕하세요. 저는 홍길동 상병 입니다.
		a병사.공격();
		// 홍길동 상병이 공격합니다.(공격력 : 11)
	}
}
class 병사 {
	String 이름;
	int 계급번호;
	병사() {
		계급번호 = 1;
	}
	int get공격력() {
		int 공격력 = 0;
		if (계급번호 == 1) {
			공격력 = 7;
		} else if (계급번호 == 2) {
			공격력 = 9;
		} else if (계급번호 == 3) {
			공격력 = 11;
		}
		return 공격력;
	}
	String get계급() {
		String 계급 = "";
		if (계급번호 == 1) {
			계급 = "이병";
		} else if (계급번호 == 2) {
			계급 = "일병";
		} else if (계급번호 == 3) {
			계급 = "상병";
		}
		return 계급;
	}
	void 자기소개() {
		System.out.println("안녕하세요. 저는 " + this.이름 + " " + this.get계급() + " 입니다.");
	}
	void 공격() {
		System.out.println(this.이름 + " 이병이 공격합니다.(공격력 : " + this.get공격력() + ")");
	}
	void 진급() {
		계급번호++;
	}
}*/

// 문제 : 아래 코드가 올바르게 실행되도록 해주세요. 
/*class Main {
	public static void main(String[] args) {
		int 결과 = 계산기.get_n부터_m까지의_수_중에서_3의배수의_합(30, 400);
		System.out.println(결과); // 출력 => ??? 
	}
}
class 계산기 {
	static int get_n부터_m까지의_수_중에서_3의배수의_합(int a, int b) {
		int 결과 = 0;
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				결과 += i;
			}
		}
		return 결과;
	}
}*/

// 문제 : 아래가 실행되도록 해주세요.
/*class Main {
	public static void main(String[] args) {
		전사 a전사 = new 홍길동();
		a전사.a무기 = new 활();

		a전사.공격();
		// 출력 => 홍길동이(가) 활(으)로 공격합니다.

		a전사 = new 홍길순();

		a전사.공격();
		// 출력 => 홍길순이(가) 칼(으)로 공격합니다.

		a전사.a무기 = new 창();
		a전사.공격();
		// 출력 => 홍길순이(가) 창(으)로 공격합니다.
	}
}
class 전사 {
	String 이름;
	무기 a무기;
	void 공격() {
		a무기.작동(이름);
	}
}
class 홍길동 extends 전사 {
	홍길동() {
		이름 = "홍길동";
	}
}
class 홍길순 extends 전사 {
	홍길순() {
		a무기 = new 칼();
		이름 = "홍길순";
	}
}
abstract class 무기 {
	String 무기명;
	void 작동(String 사용자명) {
		System.out.printf("%s이(가) %s(으)로 공격합니다.\n", 사용자명, 무기명);
	}
}
class 칼 extends 무기 {
	칼() {
		무기명 = "칼";
	}
}
class 활 extends 무기 {
	활() {
		무기명 = "활";
	}
}
class 창 extends 무기 {
	창() {
		무기명 = "창";
	}
}
*/

// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : 조건문을 사용하지 않고 처리해주세요.
// 조건 : `a무기` 인스턴스 변수를 이용해서 풀어주세요.
// 조건 : 칼, 창, 지팡이 클래스를 만들어주세요.
// 문제 : 온라인 게임을 구현해주세요.
// 조건 : 전사객체를 만들고 순서대로 칼, 창, 지팡이로 공격하게 해주세요.
// 단 : 전사는 무기라는 것이 존재한다는 것은 알지만 칼, 창, 지팡이에 대해선 몰라야 합니다.
/*
class Main {
	public static void main(String[] args) {
		// 구현 시작
		전사 a전사 = new 전사();

		a전사.a무기 = new 칼();
		a전사.공격();
		a전사.a무기 = new 창();
		a전사.공격();
		a전사.a무기 = new 지팡이();
		a전사.공격();
		a전사.a무기 = new 전설의_지팡이();
		a전사.공격();
		// 구현 끝
	    // 출력
	    //칼(으)로 공격합니다.
	    //데미지 : 78
	    //창(으)로 공격합니다.
	    //데미지 : 80
	    //지팡이(으)로 공격합니다.
	    //데미지 : 12
	    //전설의_지팡이(으)로 공격합니다.
	    //데미지 : 120
	}
}
// 구현 시작 
class 전사 {
	무기 a무기;
	void 공격() {
		a무기.작동();
	}
}
abstract class 무기 {
	int 데미지;
	String 무기명;
	void 작동() {
		System.out.printf("%s(으)로 공격합니다.\n", 무기명);
		System.out.printf("데미지 : %d\n", 데미지);
	}
}
class 칼 extends 무기 {
	칼() {
		무기명 = "칼";
		데미지 = 78;
	}
}
class 창 extends 무기 {
	창() {
		무기명 = "창";
		데미지 = 80;
	}
}
class 지팡이 extends 무기 {
	지팡이() {
		무기명 = "지팡이";
		데미지 = 12;
	}
}
class 전설의_지팡이 extends 무기 {
	전설의_지팡이() {
		무기명 = "지팡이";
		데미지 = 120;
	}
}
// 구현 끝 
*/

// 문제 : 구성(전사는 무기로 구성된다.)을 사용하여 중복을 제거해주세요.
// Main 클래스는 수정불가능
/*
class Main {
	public static void main(String[] args) {
		전사타입A a전사타입A = new 전사타입A();
		a전사타입A.공격();

		전사타입B a전사타입B = new 전사타입B();
		a전사타입B.공격();

		전사타입C a전사타입C = new 전사타입C();
		a전사타입C.공격();

		전사타입D a전사타입D = new 전사타입D();
		a전사타입D.공격();
	}
}
abstract class 전사 {
	무기 a무기;
	void 공격() {
		a무기.작동();
	}
}
class 무기 {
	String 무기명;
	void 작동() {
		System.out.printf("%s로 공격\n", 무기명);
	}
}
class 칼 extends 무기 {
	칼() {
		무기명 = "칼";
	}
}
class 활 extends 무기 {
	활() {
		무기명 = "활";
	}
}
class 전사타입A extends 전사 {
	전사타입A() {
		a무기 = new 칼();
	}
}
class 전사타입B extends 전사 {
	전사타입B() {
		a무기 = new 칼();
	}
}
class 전사타입C extends 전사 {
	전사타입C() {
		a무기 = new 활();
	}
}
class 전사타입D extends 전사 {
	전사타입D() {
		a무기 = new 활();
	}
}
*/

// 주의 : 어려운 문제 입니다.
// 문제 : `사용자 + " : ` 부분에 대한 중복을 제거해주세요.
// 주의 : 어려운 문제 입니다.
// 문제 : `사용자 + " : ` 부분에 대한 중복을 제거해주세요.

/*class Main {
	public static void main(String[] args) {
		청둥오리 a청둥오리 = new 청둥오리();
		a청둥오리.날다();
		// 출력 : 오리가 날개로 날아갑니다.
		흰오리 a흰오리 = new 흰오리();
		a흰오리.날다();
		// 출력 : 오리가 날개로 날아갑니다.
		고무오리 a고무오리 = new 고무오리();
		a고무오리.날다();
		// 출력 : 저는 날 수 없어요. ㅜㅠ
		고무2오리 a고무2오리 = new 고무2오리();
		a고무2오리.날다();
		// 출력 : 저는 날 수 없어요. ㅜㅠ
	}
}
abstract class 오리 {
	String 종류;
	비행아이템 a비행아이템;
	void 날다() {
		a비행아이템.작동(종류);
	}
}
abstract class 비행아이템 {
	abstract String get메세지();
	String 메세지;
	void 작동(String 사용자) {
		System.out.println(사용자 +  " : " + get메세지());
	}
}
class 날개로나는비행아이템 extends 비행아이템 {
	String get메세지() {
		return "날개로 날다.";
	}
}
class 못나는비행아이템 extends 비행아이템 {
	String get메세지() {
		return "저는 날 수 없어요. ㅜㅠ";
	}
}
// 오리 => 부모 클래스
// 흰오리 => 자식 클래스
// 흰오리 extends 오리 => 흰오리가 오리의 능력을 물려 받는다.
// "`흰오리`는 `오리`이다." 라고 자바에게 알려준다.
// `A 는 B 이다.` 테스트에 통과하는 것만 상속이 가능하다.
// 클래스와 객체는 명사이다.
// 메서드는 동사이다.
class 흰오리 extends 오리 {
	흰오리() {
		종류 = "흰오리";
		a비행아이템 = new 날개로나는비행아이템();
	}
}
class 청둥오리 extends 오리 {
	청둥오리() {
		종류 = "청둥오리";
		a비행아이템 = new 날개로나는비행아이템();
	}
}
class 고무오리 extends 오리 {
	고무오리() {
		종류 = "고무오리";
		a비행아이템 = new 못나는비행아이템();
	}
}
class 고무2오리 extends 오리 {
	고무2오리() {
		종류 = "고무2오리";
		a비행아이템 = new 못나는비행아이템();
	}
}
*/
/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
- D1 완료 : 클래스와 메서드를 만들어서 처리
- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
- D2 완료 : 클래스와 메서드를 만들어서 처리
- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
- D3 완료 : 상속을 사용해서 처리
- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
- D4 완료 : 클래스와 메서드를 만들어서 처리
- D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
- D5 완료 : 메서드 오버라이드를 사용해서 처리
- D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
- D6 완료 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
- D7 요구 : 고무오리계열에서 날다 메서드의 중복을 제거해주세요.
- D7 완료 : 상속으로 해결
- D8 요구 : 상속에는 한계가 있습니다. 상속을 사용하지 않고 고무오리계열의 중복을 제거해주세요.
- D8 요구 : 자바에서 다중상속은 불가능 합니다. 상속에는 한계가 있습니다. 상속을 사용하지 않고 고무오리계열의 중복을 제거해주세요.
- D8 완료 : 상속이 아닌 구성을 써서 해결
- D9 요구 : 현질기능을 추가한다. 로켓비행아이템을 추가하세요.
*/
/*
class Main {
	public static void main(String[] args) {
		청둥오리 a청둥오리 = new 청둥오리();
		a청둥오리.날다();
		// 출력 : 오리가 날개로 날아갑니다.
		흰오리 a흰오리 = new 흰오리();
		a흰오리.날다();
		// 출력 : 오리가 날개로 날아갑니다.
		고무오리 a고무오리 = new 고무오리();
		a고무오리.날다();
		// 출력 : 저는 날 수 없어요. ㅜㅠ
		고무2오리 a고무2오리 = new 고무2오리();
		a고무2오리.날다();
		// 출력 : 저는 날 수 없어요. ㅜㅠ
		a고무2오리.a비행아이템 = new 로켓비행아이템();
		a고무2오리.날다();
		// 출력 : 로켓파워로 날아갑니다.
	}
}
abstract class 오리 {
	비행아이템 a비행아이템;
	오리() {
		a비행아이템 = new 날개비행아이템();
	}
	void 날다() {
		a비행아이템.작동();
	}
}
class 흰오리 extends 오리 {
}
class 청둥오리 extends 오리 {
}
class 고무오리 extends 오리 {
	고무오리() {
		a비행아이템 = new 못나는비행아이템();
	}
}
class 고무2오리 extends 오리 {
	고무2오리() {
		a비행아이템 = new 못나는비행아이템();
	}
}
abstract class 비행아이템 {
	abstract void 작동();
}
class 날개비행아이템 extends 비행아이템 {
	void 작동() {
		System.out.println("날개로 날아갑니다.");
	}
}
class 못나는비행아이템 extends 비행아이템 {
	void 작동() {
		System.out.println("저는 못 날아요 ㅠㅠ");
	}
}
class 로켓비행아이템 extends 비행아이템 {
	void 작동() {
		System.out.println("날개로 날아갑니다.");
	}
}
*/

/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/
/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
- D1 완료 : 클래스와 메서드를 만들어서 처리
- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
- D2 완료 : 클래스와 메서드를 만들어서 처리
- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
- D3 완료 : 상속을 사용해서 처리
- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
- D4 완료 : 클래스와 메서드를 만들어서 처리
- D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
- D5 완료 : 메서드 오버라이드를 사용해서 처리
- D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
- D6 완료 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
- D7 요구 : 고무오리계열에서 날다 메서드의 중복을 제거해주세요.
- D7 완료 : 상속으로 해결
- D8 요구 : 자바에서 다중상속은 불가능 합니다. 상속에는 한계가 있습니다. 상속을 사용하지 않고 고무오리계열의 중복을 제거해주세요.
*/
/*
class Main {
	public static void main(String[] args) {
		청둥오리 a청둥오리 = new 청둥오리();
		a청둥오리.날다();
		// 출력 : 오리가 날개로 날아갑니다.
		흰오리 a흰오리 = new 흰오리();
		a흰오리.날다();
		// 출력 : 오리가 날개로 날아갑니다.
		고무오리 a고무오리 = new 고무오리();
		a고무오리.날다();
		// 출력 : 저는 날 수 없어요. ㅜㅠ
		고무2오리 a고무2오리 = new 고무2오리();
		a고무2오리.날다();
		// 출력 : 저는 날 수 없어요. ㅜㅠ
	}
}
class 오리 {
	void 날다() {
		System.out.println("오리가 날개로 날아갑니다.");
	}
}
// 오리 => 부모 클래스
// 흰오리 => 자식 클래스
// 흰오리 extends 오리 => 흰오리가 오리의 능력을 물려 받는다.
// "`흰오리`는 `오리`이다." 라고 자바에게 알려준다.
// `A 는 B 이다.` 테스트에 통과하는 것만 상속이 가능하다.
// 클래스와 객체는 명사이다.
// 메서드는 동사이다.
class 흰오리 extends 오리 {
}
class 청둥오리 extends 오리 {
}
class 고무오리 extends 오리 {
	// 메서드 재정의 라고 합니다.
	// 메서드 오버라이드 라고도 합니다.
	// 메서드 재정의 => 부모가 물려준 능력을 다시 구현한다.
	void 날다() {
		System.out.println("저는 날 수 없어요. ㅜㅠ");
	}
}
class 고무2오리 extends 오리 {
	void 날다() {
		System.out.println("저는 날 수 없어요. ㅜㅠ");
	}
}
*/
/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/
/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
- D1 완료 : 클래스와 메서드를 만들어서 처리
- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
- D2 완료 : 클래스와 메서드를 만들어서 처리
- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
- D3 완료 : 상속을 사용해서 처리
- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
- D4 완료 : 클래스와 메서드를 만들어서 처리
- D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
- D5 완료 : 메서드 오버라이드를 사용해서 처리
- D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
- D6 완료 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
- D7 요구 : 고무오리계열에서 날다 메서드의 중복을 제거해주세요.
- D7 완료 : 상속으로 해결
- D8 요구 : 상속에는 한계가 있습니다. 상속을 사용하지 않고 고무오리계열의 중복을 제거해주세요.
- D8 요구 : 자바에서 다중상속은 불가능 합니다. 상속에는 한계가 있습니다. 상속을 사용하지 않고 고무오리계열의 중복을 제거해주세요.
- D8 완료 : 상속이 아닌 구성을 써서 해결
- D9 요구 : 현질기능을 추가한다. 로켓비행아이템을 추가하세요.
*/
/*
class Main {
	public static void main(String[] args) {
		청둥오리 a청둥오리 = new 청둥오리();
		a청둥오리.날다();
		// 출력 : 오리가 날개로 날아갑니다.
		흰오리 a흰오리 = new 흰오리();
		a흰오리.날다();
		// 출력 : 오리가 날개로 날아갑니다.
		고무오리 a고무오리 = new 고무오리();
		a고무오리.날다();
		// 출력 : 저는 날 수 없어요. ㅜㅠ
		고무2오리 a고무2오리 = new 고무2오리();
		a고무2오리.날다();
		// 출력 : 저는 날 수 없어요. ㅜㅠ
		a고무2오리.a비행아이템 = new 로켓비행아이템();
		a고무2오리.날다();
		// 출력 : 로켓파워로 날아갑니다.
		a고무2오리.a비행아이템 = new 초능력비행아이템();
		a고무2오리.날다();
		// 출력 : 초능력으로 날아갑니다.
	}
}
abstract class 오리 {
	비행아이템 a비행아이템;
	오리() {
		a비행아이템 = new 날개비행아이템();
	}
	void 날다() {
		a비행아이템.작동();
	}
}
class 흰오리 extends 오리 {
}
class 청둥오리 extends 오리 {
}
class 고무오리 extends 오리 {
	고무오리() {
		a비행아이템 = new 못나는비행아이템();
	}
}
class 고무2오리 extends 오리 {
	고무2오리() {
		a비행아이템 = new 못나는비행아이템();
	}
}
abstract class 비행아이템 {
	abstract void 작동();
}
class 날개비행아이템 extends 비행아이템 {
	void 작동() {
		System.out.println("날개로 날아갑니다.");
	}
}
class 못나는비행아이템 extends 비행아이템 {
	void 작동() {
		System.out.println("저는 못 날아요 ㅠㅠ");
	}
}
class 로켓비행아이템 extends 비행아이템 {
	void 작동() {
		System.out.println("로켓파워로 날아갑니다.");
	}
}
class 초능력비행아이템 extends 비행아이템 {
	void 작동() {
		System.out.println("초능력으로 날아갑니다.");
	}
}
*/











