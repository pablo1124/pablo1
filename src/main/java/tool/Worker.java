package tool;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    public static void main(String[] args) {
        Tool mlotek = new Tool("młotek");

        mlotek.useTool();

        List<Tool> narzedzia = new ArrayList<>();
        narzedzia.add(mlotek);
        narzedzia.add(new Tool("wiertara"));
        narzedzia.add(new Tool("srubokret"));
        narzedzia.add(new Tool("klucz"));
        narzedzia.add(new Tool("sruba"));

        for(Tool t: narzedzia){
            t.useTool();
        }
    }
}
