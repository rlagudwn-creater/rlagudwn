void main() throws IOException {
    Scanner input = new Scanner(System.in);

    double[] score = new double[7];
    double sum = 0;
    double max, min, avg;

    System.out.println("홍길동 선수의 점수를 입력하세요.");

    for (int i = 0; i < score.length; i++) {
        while (true) {
            System.out.print((i + 1) + "번째 채점관 점수: ");
            score[i] = input.nextDouble();

            if (score[i] >= 60.0 && score[i] <= 100.0) {
                break;
            } else {
                System.err.println("점수는 60.0~100.0 사이로 입력하세요.");
                System.in.read();
            }
        }

        sum += score[i];
    }

    max = score[0];
    min = score[0];

    for (int i = 1; i < score.length; i++) {
        if (score[i] > max) {
            max = score[i];
        }

        if (score[i] < min) {
            min = score[i];
        }
    }

    avg = (sum - max - min) / 5;

    System.out.println("최고 점수: " + max);
    System.out.println("최저 점수: " + min);
    System.out.printf("홍길동 선수의 최종 점수: %.2f점%n", avg);
}