//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("매입원가 입력 : ");
    int cost = keyboard.nextInt(); // 1015000 입력

    double profitRate = 0.3; // 이익률 30%
    double taxRate = 0.1;   // 세율 10%

    // 1. 정가(매출액) 계산
    double price = cost * (1 + profitRate);

    // 2. 매출 세액 및 매입 세액 계산
    double salesTax = price * taxRate;
    double purchaseTax = cost * taxRate;

    // 3. 최종 납부 세액 계산
    double taxToPay = salesTax - purchaseTax;

    System.out.println("정가(매출액) : " + (int)price + "원");
    System.out.println("매출 세액 : " + (int)salesTax + "원");
    System.out.println("매입 세액 : " + (int)purchaseTax + "원");
    System.out.println("관할 세무서에 낼 세금액(납부세액) : " + (int)taxToPay + "원");
}
