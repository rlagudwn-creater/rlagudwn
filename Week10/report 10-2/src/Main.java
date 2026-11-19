void main() throws IOException {
    Scanner input = new Scanner(System.in);

    String[] name = new String[10];
    double[] weight = new double[10];

    double sum = 0;
    double avg;
    int count = 0;

    // 이름과 몸무게 입력
    for (int i = 0; i < 10; i++) {
        System.out.print((i + 1) + "번째 학생 이름: ");
        name[i] = input.next();

        while (true) {
            System.out.print(name[i] + " 학생 몸무게: ");
            weight[i] = input.nextDouble();

            if (weight[i] >= 30.0 && weight[i] <= 120.0) {
                break;
            } else {
                System.err.println("몸무게는 30.0~120.0Kg 사이로 입력하세요.");
                System.in.read();
            }
        }

        sum += weight[i];
    }

    // 평균 몸무게 계산
    avg = sum / 10;

    // 평균 이상인 학생 수 계산
    for (int i = 0; i < 10; i++) {
        if (weight[i] >= avg) {
            count++;
        }
    }

    // 몸무게 기준 내림차순 정렬
    for (int i = 0; i < weight.length; i++) {
        for (int j = 0; j < weight.length - 1; j++) {
            if (weight[j] < weight[j + 1]) {

                double temp = weight[j];
                weight[j] = weight[j + 1];
                weight[j + 1] = temp;

                String tempName = name[j];
                name[j] = name[j + 1];
                name[j + 1] = tempName;
            }
        }
    }

    // 결과 출력
    System.out.printf("%n평균 몸무게: %.1f Kg%n", avg);
    System.out.printf("평균 이상자의 비율: %.1f%%%n", count * 10.0);

    System.out.println("\n[몸무게 상위 2명]");
    for (int i = 0; i < 2; i++) {
        System.out.printf("%s : %.1f Kg%n", name[i], weight[i]);
    }

    System.out.println("\n[몸무게 하위 2명]");
    for (int i = 8; i < 10; i++) {
        System.out.printf("%s : %.1f Kg%n", name[i], weight[i]);
    }
}