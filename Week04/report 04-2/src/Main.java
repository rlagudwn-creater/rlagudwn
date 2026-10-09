//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int 직육면체의가로길이;
    int 직육면체의세로길이;
    int 직육면체의높이;
    double 직육면체의부피;


    System.out.print("직육면체의 가로 길이는(정수형)?");
    직육면체의가로길이 = keyboard.nextInt();
    System.out.print("직육면체의 세로 길이는(정수형)?");
    직육면체의세로길이 = keyboard.nextInt();
    System.out.print("직육면체의 높이는(정수형)?");
    직육면체의높이 = keyboard.nextInt();

    직육면체의부피 = 직육면체의가로길이 * 직육면체의세로길이 * 직육면체의높이;

    System.out.printf("직육면체의 가로 길이 : %,dcm\n", 직육면체의가로길이);
    System.out.printf("직육면체의 세로 길이 : %,dcm\n", 직육면체의세로길이);
    System.out.printf("직육면체의 높이 : %,dcm\n", 직육면체의높이);
    System.out.printf("직육면체의 부피는 : %.2fcm3", 직육면체의부피);
}
