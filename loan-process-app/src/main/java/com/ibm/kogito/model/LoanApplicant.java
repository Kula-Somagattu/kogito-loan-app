package com.ibm.kogito.model;

public class LoanApplicant {

    private String id;
    private String name;
    private int age;
    private int creditScore;    
    
    public LoanApplicant() {        
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getCreditScore() {
        return creditScore;
    }
    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
    @Override
    public String toString() {
        return "Applicant [id=" + id + ", name=" + name + ", age=" + age + ", creditScore=" + creditScore + "]";
    }

}
