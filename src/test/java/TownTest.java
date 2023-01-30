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
        Office office = new Office("Empire State",500, LocalDate.of(1930,03,17));
        town.addBuilding(office);
        assertThat(town.countBuilding()).isEqualTo(1);
    }

    @Test
    void canRemoveBuildings(){
        Office office = new Office("Empire State",500, LocalDate.of(1930,03,17));
        town.addBuilding(office);
        town.RemoveBuilding(office);
        assertThat(town.countBuilding()).isEqualTo(0);
    }

    @Test
    void canAddDifferentBuildings(){
        Office office = new Office("Empire State",500, LocalDate.of(1930,3,17));
        StudentFlat studentFlat = new StudentFlat("Student State",100, LocalDate.of(2000,5,12,3324));
        Bungalow bungalow = new Bungalow("Elderly State",20, LocalDate.of(1970,7,21));

        town.addBuilding(office);
        town.addBuilding(studentFlat);
        town.addBuilding(bungalow);

        assertThat(town.countBuilding()).isEqualTo(3);
    }




}
