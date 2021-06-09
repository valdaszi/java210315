package lt.bit.p0609;

import java.time.LocalDate;

public record Salary(Employee employee, Double salary, LocalDate date) {
}
