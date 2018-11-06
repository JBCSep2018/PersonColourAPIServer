package me.afua.anotherrestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    PersonRepository people;

    @Autowired
    ColourRepository colours;

    @Override
    public void run(String... args) throws Exception {
        Person p = new Person();
        p.setFullName("Kwame Mensah");
        p.setAddress("123 Mango Street");
        people.save(p);

        Colour c = new Colour();
        c.setColourName("blue");
        colours.save(c);

        p.getFavouriteColours().add(c);
        people.save(p);
    }
}
