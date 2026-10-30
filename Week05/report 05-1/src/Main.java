//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("첫 번째 정수 입력 : ");
    int num1 = keyboard.nextInt();

    System.out.print("두 번째 정수 입력 : ");
    int num2 = keyboard.nextInt();

    System.out.print("세 번째 정수 입력 : ");
    int num3 = keyboard.nextInt();

    // 1. 모두 0인 경우
    if (num1 == 0 && num2 == 0 && num3 == 0) {
        System.out.println("모두 0");
    }
    // 2. 모두 양수인 경우
    else if (num1 > 0 && num2 > 0 && num3 > 0) {
        System.out.println("모두 양수");
    }
    // 3. 하나라도 음수인 경우 (|| 연산자 사용)
    else if (num1 < 0 || num2 < 0 || num3 < 0) {
        System.out.println("음수 포함");
    }
    // 4. 그 외의 경우 (0과 양수가 섞여 있는 경우 등)
    else {
        // ! 연산자를 활용한 예시 조건 처리
        if (!(num1 < 0 || num2 < 0 || num3 < 0)) {
            System.out.println("0과 양수 혼합");
        }
    }
}