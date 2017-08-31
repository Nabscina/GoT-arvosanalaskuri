package main;

import java.util.ArrayList;

public class Ratings {

    private ArrayList<Integer> ratings;

    public Ratings() {

        ratings = new ArrayList<>();
    }

    public void addRating(int r) {

        ratings.add(r);
    }
    
    public ArrayList<Integer> getRatings() {
        
        return ratings;
    }

    public double average() {

        if (!ratings.isEmpty()) {
            int sum = 0;
            for (Integer i : ratings) {
                sum += i;
            }
            return 1.0 * sum / ratings.size();
        }
        return -1;
    }

}
