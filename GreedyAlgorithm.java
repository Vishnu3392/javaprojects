package demo1;

class Transport {
    String name;
    int time;
    int cost;

    public Transport(String name, int time, int cost) {
        this.name = name;
        this.time = time;
        this.cost = cost;
    }
}

public class GreedyAlgorithm {

    public static void main(String[] args) {
        Transport[] options = {
            new Transport("Flight", 88, 780),
            new Transport("Train", 15, 100),
            new Transport("Bus", 30, 500)
        };

        Transport best = options[0];
        for (int i = 1; i < options.length; i++) {
            if (options[i].time < best.time) {
                best = options[i];
            }
        }

        System.out.println("Best option to reach Goa:");
        System.out.println(best.name + " (Time: " + best.time + " hrs, Cost: " + best.cost + ")");
    }
}

