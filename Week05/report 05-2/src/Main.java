//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("당신의 JAVA 점수 입력 : ");
    int score = keyboard.nextInt();

    String grade = "";

    // 60점 미만은 F 학점
    if (score < 60) {
        grade = "F";
    } else {
        // ASCII 코드를 이용하여 알파벳 문학점('A', 'B', 'C', 'D') 결정
        // 90점대: 'A'(65), 80점대: 'B'(66), 70점대: 'C'(67), 60점대: 'D'(68)
        int step = (score == 100) ? 9 : (score / 10);
        char mainGrade = (char) ('A' + (9 - step));

        // 일의 자리가 5 이상이거나 100점이면 +, 그 외는 0
        String subGrade = (score % 10 >= 5 || score == 100) ? "+" : "0";

        grade = "" + mainGrade + subGrade;
    }

    System.out.println("입력 점수 : " + score);
    System.out.println("학점 : " + grade);
}
