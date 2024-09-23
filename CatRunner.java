public class CatRunner {
    public static void main(String[] args) {
    Cat cat1 = new Cat("Whiskers", 3, 5.3);
    cat1.introduce();
    cat1.printCatInfo();

    Cat cat2 = new Cat("Wimple", 11, 7.7);
    cat2.printCatInfo();
    cat2.introduce();
}
}