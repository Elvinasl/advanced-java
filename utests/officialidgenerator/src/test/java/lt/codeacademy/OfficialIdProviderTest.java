package lt.codeacademy;

import lt.codeacademy.model.Person;
import lt.codeacademy.model.enums.Gender;
import lt.codeacademy.service.LithuanianOfficialIdProvider;
import lt.codeacademy.service.OfficialIdProvider;
import lt.codeacademy.util.Counter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OfficialIdProviderTest {

    @BeforeEach
    void init() {
        Counter.setDefaultCounterNumberValue();
    }

    @Test
    void generateOfficialId_returnValidPersonalCode() {
        //given
        OfficialIdProvider provider = new LithuanianOfficialIdProvider();
        Person malePerson = new Person("Petras", LocalDate.of(1987, Month.MAY, 11), Gender.MALE);
        Person femalePerson = new Person("Gerda", LocalDate.of(1987, Month.MAY, 11), Gender.FEMALE);

        //when
        String malePersonalCode = provider.generateOfficialId(malePerson);
        String femalePersonalCode = provider.generateOfficialId(femalePerson);

        //then
        assertEquals("38705110001", malePersonalCode);
        assertEquals("48705110013", femalePersonalCode);
    }

    @Test
    void generateOfficialId_differentMalePersons_returnValidPersonalCode() {
        //given
        OfficialIdProvider provider = new LithuanianOfficialIdProvider();
        List<Person> persons = Stream.iterate(0, i -> i + 1)
                .limit(7)
                .map(index -> new Person("Petras" + index, LocalDate.of(1933, Month.SEPTEMBER, 24), Gender.MALE))
                .collect(Collectors.toList());

        //when
        String[] personalCodes = persons.stream()
                .map(provider::generateOfficialId).toArray(String[]::new);

        //then
        assertEquals("33309240004", personalCodes[0]);
        assertEquals("33309240015", personalCodes[1]);
        assertEquals("33309240026", personalCodes[2]);
        assertEquals("33309240037", personalCodes[3]);
        assertEquals("33309240048", personalCodes[4]);
        assertEquals("33309240059", personalCodes[5]);
        assertEquals("33309240064", personalCodes[6]);
    }

    @Test
    //FIXME: this test failed, need to fix implementation
    void generateOfficialId_differentPersonBornDatesByOrder_returnValidPersonalCode() {
        //given
        OfficialIdProvider provider = new LithuanianOfficialIdProvider();
        List<Person> persons = Stream.iterate(0, i -> i + 1)
                .limit(2)
                .map(index -> new Person("Petras" + index, LocalDate.of(1933, Month.SEPTEMBER, 24 + index), Gender.MALE))
                .collect(Collectors.toList());

        //when
        String[] personalCodes = persons.stream()
                .map(provider::generateOfficialId).toArray(String[]::new);

        //then
        assertEquals("33309240004", personalCodes[0]);
        assertEquals("33309250000", personalCodes[1]);
    }

}
