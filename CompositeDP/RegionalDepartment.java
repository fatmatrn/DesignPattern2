package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department{

    List<Department> childDepartments;

    public RegionalDepartment(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream().//Finance objesi ile  Sales objesi
                map(Department::getName). //"Finance" ve "Sales"
                collect(Collectors.joining(", "));//Finance,Sales
    }


    @Override
    List<String> getEmplosees() {
        return childDepartments.stream().
        flatMap(d->d.getEmplosees().stream()).// map methodunun ozellestirilmis halidir,Stream i baska bir stream a cevirmeye yariyor
        collect(Collectors.toList());

    }
}
