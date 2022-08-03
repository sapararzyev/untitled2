public class Main {
    public static void main(String[] args) {
        System.out.println(sapar(11,48));
        System.out.println(sapar(43,60));
        System.out.println(sapar(90,78));
        System.out.println(sapar(45,46));
        System.out.println(sapar(86,95));
    }

    public static String sapar(int age, double temrature) {
        if (age >= 20 && age <= 45 && temrature >= -20 && temrature <= 30) {
            return "можно идти гулять";
        } else if (age < 20 && temrature >= 28) {
            return "можно идти гулять";
        } else if (age > 45 && temrature >= -10 && temrature <= 25) {
            return "можно идти гулять";
        }
         else
        return "оставайтесь дома";
    }

}
