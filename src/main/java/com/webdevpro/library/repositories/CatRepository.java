package com.webdevpro.library.repositories;

import com.webdevpro.library.models.Cat;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CatRepository {

    private static long catId;
    private Map<Long, Cat> cats = new HashMap<>();

    @PostConstruct
    //this method will be called every time the application is started
    public void addSomeCatsToGetStarted() {
        for(int i = 1; i < 6; i++) {
            Cat cat = new Cat();
            cat.setName("Tigrette " + i);
            this.save(cat);
        }
    }

    //CREATE
    public void save(Cat newCat) {
        newCat.setId(++catId); //make sure that every cat automatically gets a new Id
        this.cats.put(newCat.getId(), newCat); //store this cat under the key of its Id
    }

    //READ
    public Collection<Cat> findAll() {
        return this.cats.values();
    }

    //READ ONE CAT
    public Cat findById(long id) {
        Cat found = this.cats.get(id);
        return found;
    }

    //UPDATE
    public Cat update(long id, Cat update) {
        Cat victim = this.findById(id);
        victim.setName(update.getName());
        victim.setAge(update.getAge());
        victim.setColor(update.getColor());
        victim.setPurring(update.isPurring());
        return victim;
    }

    //DELETE
    public void deleteById(long id) {
        this.cats.remove(id);
    }



}
