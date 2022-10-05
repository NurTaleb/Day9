import java.util.ArrayList;
import java.util.Arrays;

public class Class {
    public static void main(String[] args) {

        Animal horse = new Animal();
        Animal snake = new Animal();
        ArrayList<Animal>animals = new ArrayList<>();
        animals.add(horse);
        animals.add(snake);
        System.out.println(animals);

       /*String [] rockets = {"Space", "Engine", "Wheels", "Dragon", "machine", "Booster"};
        System.out.println(rockets);
        System.out.println(Arrays.toString(rockets));

        int lengthOfrockets = rockets.length;
        int indexOfLastrockets = lengthOfrockets -1;


        rockets [0] ="Engine";
        System.out.println(rockets[0]);



        int [] numbers = new int [5];
        numbers [0] = 1;
        numbers [1] = 2;

        System.out.println("Plats 1: " + numbers[0]);
        System.out.println("Plats 2: " + numbers[1]);
        System.out.println("Plats 3: " + numbers[2]);

        numbers [2] = 3;
        System.out.println("Plats 3: " + numbers [2]);




        int [] number = {100, 99, 98, 97 ,96};
        System.out.println(number);
        System.out.println(Arrays.toString(number));

        String Alva = rockets [4];
        System.out.println(Alva);


        String rocket = "NurTaleb";
        System.out.println(rocket);*/

        ArrayList<String> Family;
        Family = new ArrayList<String>();

        ArrayList<String> Familynames = new ArrayList<String>();
        Familynames.add("brother");
        Familynames.add("Mother");
        Familynames.add("Father");
        Familynames.add(3, "family");
        Familynames.add("Grandpa");
        Familynames.add ("Grandma");
        System.out.println(Familynames);

        int father1 =Familynames.indexOf("Mother");
        System.out.println(father1);

        Familynames.set(1, "Father");
        System.out.println("Efter ändring: " + Familynames);




        int size = Familynames.size();
        int indexOfLastElementInFamily = size -1;
        String lastInFamily = Familynames.get(indexOfLastElementInFamily);
        System.out.println(lastInFamily);


        /*System.out.println(size);
        System.out.println(indexOfLastElementInFamily);*/


        /*ArrayList mixes = new ArrayList();
        mixes.add("MAX");
        mixes.add ("38");
        mixes.add (true);
        System.out.println(mixes);*/




        int i = 1;
        Integer y = 1;







    }
}
