//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("초 입력 : ");
    int totalSeconds = keyboard.nextInt(); // 54321 입력

    // 가장 큰 단위(시간)부터 나누어 계산
    int hour = totalSeconds / 3600;      // 몇 시간인지 계산
    int remainder = totalSeconds % 3600; // 시간을 빼고 남은 초

    int minute = remainder / 60;         // 남은 초로 몇 분인지 계산
    int second = remainder % 60;         // 최종 남은 초

    System.out.println(totalSeconds + " 초 = " + hour + " 시간 " + minute + " 분 " + second + " 초");
}