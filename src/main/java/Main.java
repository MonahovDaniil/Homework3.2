public class Main {
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();
        stringArray.add("Это первая строка!");
        stringArray.add("Это вторая стока - самая длинная из всех!");
        stringArray.add("Это 3 строка!");

        System.out.println("Максимальная строка по длине: " + stringArray.getMaxLengthString());
        System.out.println("Средняя длина строк: " + stringArray.getAverageLength());
    }
}
