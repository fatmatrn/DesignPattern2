package StructuralDP.CompositeDP;

import java.util.Arrays;
import java.util.List;

public class Finance extends Department{
    @Override
    String getName() {
        return "Finance";
    }

    @Override
    List<String> getEmplosees() {
        return Arrays.asList("F1","F2","F3");
    }
}
