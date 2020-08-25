package duke;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represents a task that takes place on a date.
 */
public class Event extends Task {

    private LocalDate date;

    public Event(String name, String dateTime) {
        super(name);
        this.date = LocalDate.parse(dateTime);
    }

    @Override
    public String toString() {
        return "[E]" + super.getStatusIcon() + " " + super.getTaskName() + " (at: " +
                date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + ")";
    }
}
