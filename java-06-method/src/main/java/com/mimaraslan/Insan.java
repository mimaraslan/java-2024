package com.mimaraslan;

public class Insan {

    public static void main(String[] args) {



        String firstName = "Alp Arda";
        String lastName = "Aras";
        Integer age = 24;
        Float height = 1.80f;
        Double salary = 120_000.0;
        Boolean maritalStatus = true;
        Character gender = 'M';
        String eyesColor = "Blue";

        infoPrint(firstName, lastName, age, height, salary, maritalStatus, gender, eyesColor);



         firstName = "Abdullah";
         lastName = "Gülbaz";
         age = 26;
         height = 1.70f;
         salary = 110_000.0;
         maritalStatus = true;
         gender = 'M';
         eyesColor = "Black";

        infoPrint(firstName, lastName, age, height, salary, maritalStatus, gender, eyesColor);




        firstName = "Celalettin";
        lastName = "Aksoy";
        age = 37;
        height = 1.90f;
        salary = 130_000.0;
        maritalStatus = Boolean.FALSE; // false
        gender = 'M';
        eyesColor = "Green";

        infoPrint(firstName, lastName, age, height, salary, maritalStatus, gender, eyesColor);



        firstName = "Betül";
        lastName = "Sarıkaya";
        age = 18;
        height = 1.70f;
        salary = 135_000.0;
        maritalStatus = Boolean.FALSE; // false
        gender = 'F';
        eyesColor = "Green";

        infoPrint(firstName, lastName, age, height, salary, maritalStatus, gender, eyesColor);





        infoPrint("Cemre", "Gök", 20, 1.80F, 100_000.0, false, 'F', "Green");

        infoPrint("Hasan Basri", "Ertekin", 28, 1.70F, 200_000.0, false, 'M', "Black");



    }



    private static void infoPrint(String firstName,
                                  String lastName,
                                  Integer age,
                                  Float height,
                                  Double salary,
                                  Boolean maritalStatus,
                                  Character gender,
                                  String eyesColor) {

        System.out.println("FirstName LastName: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        System.out.println("EyesColor: " + eyesColor);
        System.out.println("Salary: " +  salary);
        System.out.println("MaritalStatus: " + maritalStatus);

        cizgiCek();

    }



    private static void cizgiCek() {
        System.out.println("------------------------------");
    }


}
