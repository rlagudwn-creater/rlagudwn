//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int width; //가로 길이
    int height; //세로 길이
    char type; //직, 정 사각형
    int area; //면적
    boolean flag;


    System.out.print("사각형의 가로 길이 입력 (예5) : ");
    width = keyboard.nextInt();
    System.out.print("사각형의 세로 길이 입력 (예5) : ");
    height = keyboard.nextInt();

    flag = (width > 0 && height > 0) ? true : false;

    type = (width == height) ? '정' : '직';
    area =width * height;



    String result = flag == true ? String.format("****%c 사각형 넓이 ****\n\t 가로길이 : %,d Cm\n\t 세로길이 : %,d Cm\n" +
            "\t넓이 : %,d \u33a0\n", type, width, height, area) : "Data 오류입니다";


    System.out.println(result);
}