public class EnumExample {
    enum Color {
        RED("red"), GREEN("green"), BLUE("blue");

        private String color;

        Color(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }
    }
    public static void main(String[] args) {
        Color c1 = Color.RED;

        System.out.println("Red enum name : "  + c1.name());
        System.out.println("Red enum value : " + c1.getColor());

        for(Color c : Color.values()) {
            System.out.println("Enum value : " + c.getColor());
            System.out.println("Enum name : " + c.name());
        }
    }
}