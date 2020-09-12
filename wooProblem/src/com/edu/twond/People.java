package com.edu.twond;
class People implements Comparable<People> {
    String name;
    int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(People people) {
        if (this.score < people.getScore()) {
            return -1;
        } else if (this.score > people.getScore()) {
            return 1;
        }

        return 0;
    }
}
