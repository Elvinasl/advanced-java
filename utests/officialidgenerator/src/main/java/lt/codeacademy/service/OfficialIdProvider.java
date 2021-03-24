package service;

import model.Person;

public interface OfficialIdProvider {

    String generateOfficialId(Person person);
}
