// Zahlen aufsummieren, die groesser 0 sind
int[] numbers = { -5, 4, 2, -7, 4 };
int sum = 0;

for (int x : numbers) {
    if (x < 0) {
        System.out.println("Verworfen: " + x);
        continue;
    }
    sum += x;
}
System.out.println("Summe: " + sum);