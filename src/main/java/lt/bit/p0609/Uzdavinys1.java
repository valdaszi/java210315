package lt.bit.p0609;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Išrinkite kiek ir kokiam darbuotojui yra išmokėta ir
išveskite mažėjimo tvarka pagal išmokėtą sumą:
vardas/pavarde - išmokėta suma
 */
public class Uzdavinys1 {

    public static void main(String[] args) {
        Employee jonas = new Employee("Jonas", "Jonaitis");
        Employee ona = new Employee("Ona", "Ane");
        Employee petras = new Employee("Petras", "Petraitis");

        List<Salary> salaries = new ArrayList<>();
        salaries.add(new Salary(petras, 600.0, LocalDate.of(2020, 2, 3)));
        salaries.add(new Salary(jonas, 100.0, LocalDate.of(2020, 1, 1)));
        salaries.add(new Salary(ona, 130.0, LocalDate.of(2020, 1, 1)));
        salaries.add(new Salary(ona, 130.0, LocalDate.of(2020, 2, 4)));
        salaries.add(new Salary(ona, 250.0, LocalDate.of(2020, 3, 2)));
        salaries.add(new Salary(jonas, 120.0, LocalDate.of(2020, 2, 5)));


        List<Report> report = new ArrayList<>();
        // Map<Employee, List<Salary>> map =
        salaries.stream()
                .collect(Collectors.groupingBy(s -> s.employee()))
                .forEach(((emp, sal) -> {
                    report.add(new Report(emp, sal.stream().mapToDouble(s -> s.salary()).sum()));
                }));

//        Comparator<Report> doubleComparator = new Comparator<Report>() {
//            @Override
//            public int compare(Report o1, Report o2) {
//                return o1.salary < o2.salary ? 1 : o1.salary == o2.salary ? 0 : -1;
//            }
//        };


        Stream<Report> stream = report.stream();
        System.out.println(stream.count());
        // System.out.println(stream.count());

        report.stream().sorted(Comparator.comparingDouble((Report r) -> r.salary).reversed()).forEach(record ->
                System.out.println(record.employee.firstName() + " " +
                        record.employee.lastName() + " " +
                        record.salary));



        // kitas budas
        //TODO ... :)

    }

    static class Report {
        Employee employee;
        Double salary;

        public Report(Employee employee, Double salary) {
            this.employee = employee;
            this.salary = salary;
        }
    }
}


