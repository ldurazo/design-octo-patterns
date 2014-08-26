package com.patterns.DAOPattern;

import java.util.ArrayList;
import java.util.List;

public class DeveloperDaoImpl implements DeveloperDao{
    //We use a list as if it was a db.
    List<Developer> developers;

    public DeveloperDaoImpl() {
        developers = new ArrayList<Developer>();
        Developer developer1 = new Developer("Java", 0 , "Foo Johnson");
        Developer developer2 = new Developer("C#", 1 , "Bar Martinez");
        developers.add(developer1);
        developers.add(developer2);
    }

    @Override
    public List<Developer> getAllDevelopers() {
        return developers;
    }

    @Override
    public Developer getDeveloper(int id) {
        return developers.get(id);
    }

    @Override
    public void updateDeveloper(Developer developer) {
        developers.get(developer.getId()).setName(developer.getName());
    }

    @Override
    public void deleteDeveloper(Developer developer) {
        developers.remove(developer.getId());
    }
}
