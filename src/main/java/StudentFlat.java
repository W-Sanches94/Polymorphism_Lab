import java.time.LocalDate;

public class StudentFlat extends Building {

    private long numberOfPartiesHosted;

    public StudentFlat(String name, int numberOfRooms, LocalDate dateOfConstruction, boolean centralHeating) {
        super(name, numberOfRooms, dateOfConstruction);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }
}