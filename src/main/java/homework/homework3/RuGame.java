package main.java.homework.homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RuGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>(Arrays.asList("а", "б", "в", "г", "д", "е",
                "ж", "з", "и", "й", "к", "л", "м", "н","с", "т", "у", "ф", "х", "ц", "ч",
                "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"));
        return result;
    }
}
