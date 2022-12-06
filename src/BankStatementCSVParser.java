import java.time.format.DateTimeFormatter;

public class BankStatementCSVParser {
    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private BankTransaction parseFromCSV(final String line) {
        final String[] columns = line.split(",");

}
