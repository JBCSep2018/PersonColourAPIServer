package me.afua.anotherrestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    ColourRepository colours;

    @Autowired
    PersonRepository people;

    @RequestMapping("/colours/list")
    public Iterable<Colour> getAllColours(){
        return colours.findAll();
    }

    @RequestMapping("/people/list")
    public Iterable<Person> getAllPeople()
    {
        return people.findAll();
    }

    @CrossOrigin
    @RequestMapping("/addperson")
    public String addPerson(@RequestBody Person person)
    {
        people.save(person);
        return "A person has been added";
    }

    @CrossOrigin
    @RequestMapping("/addcolour")
    public String addPerson(@RequestBody Colour colour)
    {
        colours.save(colour);
        return "A colour has been added";
    }

}
