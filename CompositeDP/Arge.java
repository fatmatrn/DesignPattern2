package StructuralDP.CompositeDP;

import java.util.Arrays;
import java.util.List;

public class Arge extends Department{
    @Override
    String getName() {
        return "Arge";
    }

    @Override
    List<String> getEmplosees() {
        return Arrays.asList("A1","A2","A3");
    }
}
