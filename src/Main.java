public class Main {
    public static void main(String[] args) {
        String name = "Примерчик примерович";
        int nameLength = name.length() / 2;
        System.out.println("Первая часть: " + name.substring(0,nameLength));
        System.out.println("Вторая часть: " + name.substring(nameLength));
    }
}