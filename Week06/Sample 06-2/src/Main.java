void main() {
    Scanner keyboard = new Scanner(System.in);


    final double DON = 3.75f; //한 돈의 무게
    final int GOLD = 775000; //금 한 돈의 가격
    float weight;


    System.out.print("당신의 몸무게는?");
    weight = keyboard.nextFloat(); //45.6

    /* int weight1 = (int) weight; //45
    float remainder = weight - weight1; //.6

    int gram = (int) (weight1 * 1000 + remainder * 1000); */

    int gram = (int) (weight * 1000);
    double donogweight = gram / DON;
    double money = donogweight * GOLD;
    long money1 = (long) (money * 10000);
    money1 *= 10000;


    System.out.printf("%.1f Kg = %,d gram\n", weight, gram);
    System.out.printf("%.1f Kg = %,.2f 돈\n", weight, donogweight);
    System.out.printf("%.1f Kg = %,d 원(금 1돈 가격 =%,d원)\n", weight, money1, GOLD);
}