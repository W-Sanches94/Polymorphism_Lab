import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TownTest {

    Town town;
    Office office;

    @BeforeEach
    void setUp(){
        town = new Town();
    }

    @Test
    void canAddBuildings(){
        Office office = new Office("Empire State",500, LocalDate.of(1930,03,17), "NYC");
        town.addBuilding(office);
        assertThat(town.countBuilding()).isEqualTo(1);
    }

    @Test
    void canRemoveBuildings(){
        Office office = new Office("Empire State",500, LocalDate.of(1930,03,17), "NYC");
        town.addBuilding(office);
        town.RemoveBuilding(office);
        assertThat(town.countBuilding()).isEqualTo(0);
    }

    @Test
    void canAddDifferentBuildings(){
        Office office = new Office("Empire State",500, LocalDate.of(1930,3,17), "NYC");
        StudentFlat studentFlat = new StudentFlat("Student State",100, LocalDate.of(2000,5,12),3874);
        Bungalow bungalow = new Bungalow("Elderly State",20, LocalDate.of(1970,7,21),true);

        town.addBuilding(office);
        town.addBuilding(studentFlat);
        town.addBuilding(bungalow);

        assertThat(town.countBuilding()).isEqualTo(3);
    }

    @Test
    void officeCanStateFunctionOverload(){
        Office office = new Office("Empire State",500, LocalDate.of(1930,03,17), "NYC");
        String expected = "Empire State building was founded in 1930-03-17 and has 500 rooms.";
        assertThat(office.stateFunction()).isEqualTo(expected);
    }

    @Test
    void officeStateFunctionAdditionalInfo(){
        Office office = new Office("Empire State",500, LocalDate.of(1930,03,17), "NYC");
        String expected = "Empire State building was founded in 1930-03-17 and has 500 rooms. It is owned by NYC.";
        assertThat(office.stateFunction("")).isEqualTo(expected);

    }


    @Test
    void studentFlatCanStateFunctionOverload(){
        StudentFlat studentFlat = new StudentFlat("Student State",100, LocalDate.of(2000,5,12),3874);
        String expected = "Student State building was founded in 2000-05-12 and has 100 rooms.";
        assertThat(studentFlat.stateFunction()).isEqualTo(expected);
    }

    @Test
    void studentFlatStateFunctionAdditionalInfo(){
        StudentFlat studentFlat = new StudentFlat("Student State",100, LocalDate.of(2000,5,12),3874);
        String expected = "Student State building was founded in 2000-05-12 and has 100 rooms. It has survived 3874 parties.";
        assertThat(studentFlat.stateFunction("")).isEqualTo(expected);

    }




}
