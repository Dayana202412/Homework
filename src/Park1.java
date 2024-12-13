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


    }

