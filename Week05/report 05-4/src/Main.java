//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("구매 금액 입력 : ");
    int price = keyboard.nextInt();

    System.out.print("멤버십 회원인가요? (true/false) : ");
    boolean isMember = keyboard.nextBoolean();

    // 1. 구매 금액이 음수인 경우 오류 메시지 출력
    if (price < 0) {
        System.out.println("오류 : 구매 금액은 음수일 수 없습니다.");
    }
    // 2. 무료배송 조건 검사 (5만원 이상 또는 멤버십 회원이며 3만원 이상)
    else if (price >= 50000 || (isMember && price >= 30000)) {
        System.out.println("무료배송 적용 대상입니다.");
    }
    // 3. 조건 미충족 시
    else {
        System.out.println("무료배송 대상이 아닙니다. (배송비 부과)");
    }
}
