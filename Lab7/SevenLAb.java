import java.util.ArrayList;

public class SevenLAb
{

    public static void main(String[] args)
    {
        ArrayList<String>states = new ArrayList<String>();
        states.add("Меркурий");
        states.add("Венера");
        states.add("Земля");
        states.add("Марс");
        states.add("Юпитер");
        states.add("Сатурн");
        states.add("Уран");
        states.add("Уран");

        states.add(7, "Нептун");

        System.out.println(states.get(1));
        states.set(8, "Плутон");

        System.out.printf("В списке %d элементов \n", states.size());
        for (String state: states)
        {
            System.out.println(state);
        }

        if (states.contains("Марс"))
        {
            System.out.println("Список содержит планету Марс");
        }
        if (states.contains("Эгида"))
        {
            System.out.println("Список содержит планету Эгида");
        }
        else
        {
            System.out.println("Список не содержит планету Эгида =(((((");
        }

        states.remove("Земля");
        states.remove(0);

        Object[] countries = states.toArray();
        for (Object country : countries){
            System.out.println(country);
        }
    }
}
