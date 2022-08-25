package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataUserProvider {
    static List<String> listname = Arrays.asList("Bill","Mark","Tom");
    static List<String> listage = Arrays.asList("18","19","20");
    // Вставляет рандомные имена;
    public static String getRandomName (){
        return listname.get(new Random().nextInt(listname.size()));
    }
    // Вставляет рандомный возраст;
    public static String getRandomAge (){
        return listage.get(new Random().nextInt(listage.size()));

    }

}
