//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    double weight;
    double moon;

    System.out.print("당신의 몸무게(kg)는? ");
    weight = keyboard.nextDouble();

    moon = weight * 0.165;

    System.out.printf("지구에서의 몸무게 : %.1f kg\n", weight);
    System.out.printf("달에서의 몸무게 : %.1f kg\n", moon);
}
