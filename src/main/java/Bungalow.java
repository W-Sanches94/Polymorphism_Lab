import java.time.LocalDate;

public class Bungalow extends Building{

    private boolean centralHeating;

    public Bungalow (String name, int numberOfRooms, LocalDate dateOfConstruction, boolean centralHeating){
        super (name, numberOfRooms, dateOfConstruction);
        this.centralHeating = centralHeating;
    }

//GETTERS & SETTERS

    public void setCentralHeating(boolean centralHeating) {
        this.centralHeating = centralHeating;
    }

//    public String stateFunction(){
//       if (centralHeating == true){
//           return "active";
//       } else {
//           return "un-active";
//        }
//
//        public String stateFunction(){
//        the heating is " + centralHeating + ".";
//        }
//    }

}
