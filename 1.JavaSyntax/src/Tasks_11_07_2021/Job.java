package Tasks_11_07_2021;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Job {
    private LocalDateTime start;// дата и время начала
    private LocalDateTime end;// дата и время окончания плановые
    private String name;// наименование
    private LocalDateTime doneDate;// фактическая дата окончания

    public Job(LocalDateTime start, LocalDateTime end, String name) {
        this.start = start;
        this.end = end;
        this.name = name;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(LocalDateTime doneDate) {
        this.doneDate = doneDate;
    }
}
