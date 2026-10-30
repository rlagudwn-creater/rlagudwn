//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("시간 입력 : ");
    double time = keyboard.nextDouble();

    // 입력된 시간(시간 단위)을 총 초(second) 단위로 변환
    long totalSeconds = (long)(time * 3600);

    // 일, 시간, 분, 초 단위 계산
    int day = (int)(totalSeconds / (24 * 3600));
    int hour = (int)((totalSeconds % (24 * 3600)) / 3600);
    int minute = (int)((totalSeconds % 3600) / 60);
    int second = (int)(totalSeconds % 60);

    System.out.println(time + " 시간은 " + day + " 일 " + hour + " 시간 " + minute + " 분 " + second + " 초 입니다");
}