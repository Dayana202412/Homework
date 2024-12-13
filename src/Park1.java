public class Park1 {
    private String name;
    public Park1(String name){
        this.name = name;
    }
    public class Attraction{
        private String attractionName;
        private String time;
        private double cost;
        public Attraction(String attractionName, String time, double cost) {
            this.attractionName = attractionName;
            this.time = time;
            this.cost = cost;
        }
        public void info() {
            System.out.println("Аттракцион: " + attractionName );
            System.out.println("Время: " + time);
            System.out.println("Стоимость: " + cost);
        }
    }
    public static void main(String[] args) {
        Park1 park = new Park1 ("Park");
        Attraction attraction1 = park.new Attraction("Аттракцион 1", "9:00 - 15-00", 5.50);
        attraction1.info();

    }
}
