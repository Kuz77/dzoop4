package org.example;

public class Teacher extends User{
    private String objectToTeach;
    private int experience;

    public Teacher(String name, String objectToTeach, int experience) {
        super(name);
        this.objectToTeach = objectToTeach;
        this.experience = experience;
    }

    public String getObjectToTeach() {

        return objectToTeach;
    }

    public void setObjectToTeach(String objectToTeach) {

        this.objectToTeach = objectToTeach;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "objectToTeach='" + objectToTeach + '\'' +
                '}';
    }



    public Teacher(String name) {
        super(name);
    }





    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getExp(){
        if(this instanceof Teacher){
            return getScore();
        }else {return 0;}
    }

}
