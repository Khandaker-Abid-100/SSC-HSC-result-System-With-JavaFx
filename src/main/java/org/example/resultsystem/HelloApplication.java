package org.example.resultsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.resultsystem.controller.SearchController;
import org.example.resultsystem.model.MarksInfoScience;
import org.example.resultsystem.model.StudentInfo;

import java.io.IOException;

public class HelloApplication extends Application {
    public static StudentInfo info;
    public static MarksInfoScience result;
    public static MarksInfoScience Bu;
    public static  Stage stage;
    public static int za;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        //frontPage setRequirement
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("frontPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public static void changeScene(String Fx){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(Fx+".fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static double getFinalGpa(double ban, double eng, double hm, double phy, double chem, double bio, double ict,String optional){
       if (optional.equals("Biology")){
    if (ban>0 && eng>0 && hm>0&& phy>0&& chem>0&& ict>0){
        double b= bio-2;
        return((ban+eng+hm+phy+chem+b+ict)/6);
       }else {
        return 0;
    }}
       else if (optional.equals("Hair Math")){
           if (ban>0 && eng>0 && phy>0&& chem>0&& bio>0&& ict>0){
               double h = hm - 2;
               return((ban+eng+h+phy+chem+bio+ict)/7);
           }else {
               return 0;
           }
       }
        else if (optional.equals("Civic")){
            if (ban>0 && eng>0 && phy>0&& hm>0&& bio>0&& ict>0){
                double c = chem - 2;
                return((ban+eng+hm+phy+c+bio+ict)/7);
            }else {
                return 0;
            }
        }
        else if (optional.equals("Economics")){
           if (ban>0 && eng>0 && hm>0&& phy>0&& chem>0&& ict>0){
               double b= bio-2;
               return((ban+eng+hm+phy+chem+b+ict)/6);
           }else {
               return 0;
           }
        }
        else if (optional.equals("Finance ")){
           if (ban>0 && eng>0 && hm>0&& phy>0&& chem>0&& ict>0){
               double b= bio-2;
               return((ban+eng+hm+phy+chem+b+ict)/6);
           }else {
               return 0;
           }
        }
        else if (optional.equals("Marketing")){
           if (ban>0 && eng>0 && hm>0&& bio>0&& chem>0&& ict>0){
               double b= phy-2;
               return((ban+eng+hm+bio+chem+b+ict)/6);
           }else {
               return 0;
           }
        }else {
            return 50;
       }


    }

    public static  double getPoint(double p){
        if (0<=p && p< 33){
            return 0;
        }
        else if (33<=p && p< 40){
            return 1;
        }
        else if (40<=p && p< 50){
            return 2;
        }
        else if (50<=p && p< 60){
            return 3.5;
        }
        else if (60<=p && p< 70){
            return 3;
        }
        else if (70<=p && p< 80){
            return 4;
        }
        else if (80<=p && p<= 100){
            return 5;
        }else {
            return 30;
        }

    }
    public static  double getPointHsc(double p){
        if (0<=p && p< 66){
            return 0;
        }
        else if (66<=p && p< 80){
            return 1;
        }
        else if (80<=p && p< 100){
            return 2;
        }
        else if (100<=p && p< 120){
            return 3.5;
        }
        else if (120<=p && p< 140){
            return 3;
        }
        else if (140<=p && p< 160){
            return 4;
        }
        else if (160<=p && p<= 200){
            return 5;
        }else {
            return 30;
        }

    }

    public static String getGrade(double grade){
        if (0<=grade && grade< 33){
            return "F";
        }
        else if (33<=grade && grade< 40){
            return "D";
        }
        else if (40<=grade && grade< 50){
            return "C";
        }
        else if (50<=grade && grade< 60){
            return "B";
        }
        else if (60<=grade && grade< 70){
            return "A-";
        }
        else if (70<=grade && grade< 80){
            return "A";
        }
        else if (80<=grade && grade<= 100){
            return "A+";
        }else {
            return "nothing";
        }

    }
    public static String getGradeHsc(double grade){
        if (0<=grade && grade< 66){
            return "F";
        }
        else if (66<=grade && grade< 80){
            return "D";
        }
        else if (80<=grade && grade< 100){
            return "C";
        }
        else if (100<=grade && grade< 120){
            return "B";
        }
        else if (120<=grade && grade< 140){
            return "A-";
        }
        else if (140<=grade && grade< 160){
            return "A";
        }
        else if (160<=grade && grade<= 200){
            return "A+";
        }else {
            return "nothing";
        }

    }
    public static String getGradePoint(double gradePoint){
        if (0<=gradePoint && gradePoint< 1){
            return "F";
        }
        else if (1<=gradePoint && gradePoint< 2){
            return "D";
        }
        else if (2<=gradePoint && gradePoint< 3){
            return "C";
        }
        else if (3<=gradePoint && gradePoint< 3.5){
            return "B";
        }
        else if (3.5<=gradePoint && gradePoint< 4){
            return "A-";
        }
        else if (4<=gradePoint && gradePoint< 5){
            return "A";
        }
        else if (5<=gradePoint){
            return "A+";
        }else {
            return "nothing";
        }

    }
}
