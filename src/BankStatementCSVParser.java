import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankStatementCSVParser {
    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private BankTransaction parseFromCSV(final String line) {
        final String[] columns = line.split(",");
        final LocalDate date = LocalDate.parse(columns[0],
                DATE_PATTERN);
        final double amount = Double.parseDouble(columns[1]);


    }
