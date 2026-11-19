void main() throws IOException {
    Scanner input = new Scanner(System.in);

    int[] isbn = new int[13];
    int[] weights = { 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3};

    while(true) {
        System.out.print("ISBN 13자리를 하이픈(-) 없이 한 번에 입력하세요 (예: 9788973830008): ");
        long num = input.nextLong();

        if (num < 100000000000L || num > 9999999999999L) {
            System.err.println("잘못된 입력입니다. 13자리 숫자만 입력하세요.");
            System.in.read();
        }
        else{
            // 한 자리씩 분리해 배열에 저장
            for (int i = 12; i >= 0; i--) {
                isbn[i] = (int) (num % 10);
                num = num / 10;
            }
            break;
        }
    }

    // 가중치 곱의 합계 계산
    int weightedSum = 0;
    for (int i = 0; i < 12; i++) {
        weightedSum = weightedSum + (isbn[i] * weights[i]);
    }

    // 체크 기호 계산
    int remainder = weightedSum % 10;
    int checkDigit = 0;
    if (remainder == 0) {
        checkDigit = 0;
    } else {
        checkDigit = 10 - remainder;
    }

    // 유효성 검증
    int inputCheckDigit = isbn[12];
    int validRemainder = (weightedSum + inputCheckDigit) % 10;

    // 출력
    System.out.println("계산된 Check 기호: " + checkDigit);
    System.out.println("입력된 Check 기호: " + inputCheckDigit);


    if (checkDigit == inputCheckDigit && validRemainder == 0) {
        System.out.println("유효성 검증 결과: 유효한 ISBN입니다.");
        System.out.print("완성형 ISBN: ");
        for (int i = 0; i < 13; i++) {
            System.out.print(isbn[i]);
            if (i == 2 || i == 4 || i == 8 || i == 11) {
                System.out.print("-");
            }
        }
        System.out.println();
    } else {
        System.out.println("유효성 검증 결과: 유효하지 않은 ISBN입니다.");
    }
    System.out.println();
}