package com.example.demo.Service;

import com.example.demo.Model.GoldenCow;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<GoldenCow> cows;

    public GoldenCow findCow(String username){
        for (GoldenCow cow: cows) {
            if(cow.getName().equals(username)){
                return cow;
            }
        }
        return null;
    }

    @PostConstruct //Java Spring vil kalde denne metode EFTER objektet er blevet instantieret
    private void initDataForTest(){
        cows = new ArrayList<>();
        GoldenCow goldenCow1 = new GoldenCow("Ulan", 1, 2);
        GoldenCow goldenCow2 = new GoldenCow("Boris", 2, 27);
        GoldenCow goldenCow3 = new GoldenCow("Anna", 3, 32);
        GoldenCow goldenCow4 = new GoldenCow("Thomas", 4, 25);
        cows.add(goldenCow1);
        cows.add(goldenCow2);
        cows.add(goldenCow3);
        cows.add(goldenCow4);

    }
}
