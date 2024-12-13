// Muenzwurf-Programm
var random = new Random();
long amount = Stream
    .generate(() -> random.nextBoolean())
    .limit(1000)
    .filter(x -> x)
    .count();
System.out.println(amount);