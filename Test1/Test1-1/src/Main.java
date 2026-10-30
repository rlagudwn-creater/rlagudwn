//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("나이 입력: ");
    int age = keyboard.nextInt();

    // 조건 연산자(? :)를 사용한 요금 계산
    int fee = (age >= 18) ? 4000 : (age >= 13) ? 3000 : (age >= 7) ? 1000 : 0;

    System.out.println("입장료 : " + fee + "원");
}
