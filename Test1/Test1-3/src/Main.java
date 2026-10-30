//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("첫 번째 변 a : ");
    int a = keyboard.nextInt();

    System.out.print("두 번째 변 b : ");
    int b = keyboard.nextInt();

    System.out.print("세 번째 변 c : ");
    int c = keyboard.nextInt();

    // 1. 삼각형 성립 조건 검사
    if (a + b > c && a + c > b && b + c > a) {
        System.out.println("삼각형이 성립합니다.");

        // 2. 면적 계산 (헤론의 공식)
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // 3. 직각 삼각형 여부 판단
        boolean isRight = (a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a);

        // 4. 삼각형 종류 판별 및 출력
        String type = "";

        if (a == b && b == c) {
            type = "정 삼각형";
        } else if (isRight) {
            if (a == b || b == c || a == c) {
                type = "이등변 삼각형 (직각 삼각형)";
            } else {
                type = "일반 삼각형 (직각 삼각형)";
            }
        } else if (a == b || b == c || a == c) {
            type = "이등변 삼각형";
        } else {
            type = "일반 삼각형";
        }

        System.out.println("삼각형의 종류 : " + type);
        System.out.printf("삼각형의 면적 : %.2f cm²\n", area);

    } else {
        System.out.println("삼각형 없음");
    }
}