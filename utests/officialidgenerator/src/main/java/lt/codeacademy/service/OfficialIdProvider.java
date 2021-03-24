package lt.codeacademy.service;

import lt.codeacademy.model.Person;

public interface OfficialIdProvider {

    String generateOfficialId(Person person);
}
