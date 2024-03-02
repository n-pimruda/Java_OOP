package week8;
import java.util.ArrayList;

public class HealthTest {
    public static void main(String[] args) {
        ArrayList<Health> list = new ArrayList<Health>();
        list.add(new Health("Emily", 65, 170, 28, 'w'));
        list.add(new Health("Daniel", 78, 180, 35, 'M'));
        list.add(new Health("Sophia", 70, 168, 25, 'W'));

        for (Health person : list) {
            System.out.println("Name: " + person.getName() +
                               ", Weight: " + person.getWeight() +
                               ", Height: " + person.getHeight() +
                               ", Age: " + person.getAge() +
                               ", Gender: " + person.getGender());
            
            if (person.isFat()) {
                System.out.println("Fat");
            } else {
                System.out.println("Not Fat");
            }
            System.out.println("BMR value recommended per day: " + person.calculateBMR());
        }
    }
}
