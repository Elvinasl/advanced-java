package lt.codeacademy.service;

import lt.codeacademy.model.Person;
import lt.codeacademy.model.enums.Gender;
import lt.codeacademy.util.Counter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

public class LithuanianOfficialIdProvider implements OfficialIdProvider {

    private final String[] gender = {"3", "4"};

    @Override
    public String generateOfficialId(Person person) {
        LocalDate date = person.getBirthDate();
        String datePart = String.format("%1$02d%2$02d%3$02d", date.getYear() % 100, date.getMonthValue(), date.getDayOfMonth());
        String personalCodePart = gender[person.getGender() == Gender.MALE ? 0 : 1] + datePart;
        String personalCode = personalCodePart + Counter.getNumber();
        personalCode = addControlValue(personalCode);
        Counter.increaseByOne();

        return personalCode;
    }

    private String addControlValue(String code) {
        int[] codeArr = Arrays.stream(code.split("")).mapToInt(Integer::parseInt).toArray();

        int controlValue = Stream.iterate(0, i -> ++i)
                .limit(10)
                .reduce(0, (total, idx) -> total += codeArr[idx] * (idx == 9 ? 1 : idx + 1));

        if (controlValue % 11 == 10) {
            controlValue = Stream.iterate(0, i -> ++i)
                    .limit(10)
                    .reduce(0, (total, idx) -> total += codeArr[idx] * (idx < 7 ? idx + 3 : idx - 6));
            if (controlValue % 11 == 10) {
                return code + "0";
            }
        }

        return code + (controlValue % 11);
    }
}
