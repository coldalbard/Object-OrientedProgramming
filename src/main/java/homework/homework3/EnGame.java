package main.java.homework.homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i",
                "j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        return result;
    }
}
