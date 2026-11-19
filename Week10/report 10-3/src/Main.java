void main() throws IOException {
    Scanner input = new Scanner(System.in);

    int[] rrn = new int[13];
    int[] weight = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};

    // 13자리 숫자 입력
    while(true) {
        System.out.print("주민등록번호 13자리를 하이픈(-) 없이 한 번에 입력하세요: ");
        long num = input.nextLong();

        if (num < 100000000000L || num > 9999999999999L) {
            System.err.println("잘못된 입력입니다. 13자리 숫자만 입력하세요.");
            System.in.read();
        }
        else{
            //한 자리씩 분리해 배열에 저장
            for (int i = 12; i >= 0; i--) {
                rrn[i] = (int) (num % 10);
                num = num / 10;
            }
            break;
        }
    }
    int sum = 0;

    // 합계 계산
    for (int i = 0; i < 12; i++) {
        sum = sum + (rrn[i] * weight[i]);
    }

    // 검증코드 계산
    int remainder = sum % 11;
    int check = 11 - remainder;

    if (check >= 10) {
        check = check - 10;
    }


    int last = rrn[12];

    System.out.println("\n--- [계산 결과] ---");
    System.out.println("계산된 검증코드: " + check);

    //검증
    if (check == last) {
        System.out.println("올바른 주민등록번호입니다.");
    } else {
        System.out.println("잘못된 주민등록번호입니다.");
    }
}