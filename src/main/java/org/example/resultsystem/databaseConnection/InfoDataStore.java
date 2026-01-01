package org.example.resultsystem.databaseConnection;

import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.controller.AdminController;
import org.example.resultsystem.model.MarksInfoScience;
import org.example.resultsystem.model.StudentInfo;
import org.example.resultsystem.model.Versity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InfoDataStore {
    // createStudent Controller
    public boolean insertexamyear(StudentInfo studentInfo){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "INSERT INTO boardyear2 VALUE ('"+studentInfo.getYear()+"','"
                    +studentInfo.getBoard()+"');" ;
            statement.execute(q);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;

    }
    // createStudent Controller +++ searchController
    public List<StudentInfo> year(){
        List<StudentInfo> s = new ArrayList();
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "SELECT * FROM boardyear2 ;";
            ResultSet resultSet = statement.executeQuery(q);
            while (resultSet.next()) {
                String year = resultSet.getString("year");
                String board = resultSet.getString("board");
                 s.add(new StudentInfo(year,board));

            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return s;
    }
    public boolean insertInfo(StudentInfo studentInfo){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "INSERT INTO user4 VALUE ('"+studentInfo.getName()+"','"
                    +studentInfo.getFatherName()+"','"+studentInfo.getMotherName()+"','"
                    +studentInfo.getGroup()+"','"+studentInfo.getRoll()+"','"
                    +studentInfo.getReg()+"','"+studentInfo.getYear()+"','"
                    +studentInfo.getBoard()+"','"+studentInfo.getExam()+"');" ;
                statement.execute(q);
                return true;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    //SSSC
    public boolean insertSubject(MarksInfoScience marksInfoScience){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "INSERT INTO user15 VALUE ('"+marksInfoScience.getSubject()+"','"
                    + HelloApplication.info.getRoll()+"','"+
                    HelloApplication.info.getReg()+"',"+
                    marksInfoScience.getMarks()+",'"+marksInfoScience.getGrade()+"');" ;
                    statement.execute(q);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    //SSSC update
    public boolean update(MarksInfoScience marksInfoScience){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "update user15 set subject('"+marksInfoScience.getSubject()+
                    "',marks = "+
                    marksInfoScience.getMarks()+",grade = '"+marksInfoScience.getGrade()+"'where roll='"
                    + AdminController.select.getRoll() +"');";
            statement.execute(q);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertScienceMarks(MarksInfoScience marksInfoScience){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            if(HelloApplication.info.getRoll()!=null){
            String q = "INSERT INTO user11 VALUE ("+marksInfoScience.getBan()+","+marksInfoScience.getEng()+","
                    +marksInfoScience.getHm()+","+marksInfoScience.getPhy()+","
                    +marksInfoScience.getChem()+","+marksInfoScience.getBio()+","
                    +marksInfoScience.getIct()+",'"+ HelloApplication.info.getRoll()+"','"+
                    HelloApplication.info.getReg()+"','"+marksInfoScience.getBanM()+
                    "','"+marksInfoScience.getEngM()+"','"+marksInfoScience.getHmM()+
                    "','"+marksInfoScience.getPhyM()+"','"+marksInfoScience.getChemM()+
                    "','"+marksInfoScience.getBioM()+"','"+marksInfoScience.getIctM()+"',"
                    +marksInfoScience.getFinalGpa()+",'"+marksInfoScience.getFinalGrade()+"');" ;
            statement.execute(q);
            return true;}else {
                String q = "INSERT INTO user11 VALUE ("+marksInfoScience.getBan()+","+marksInfoScience.getEng()+","
                        +marksInfoScience.getHm()+","+marksInfoScience.getPhy()+","
                        +marksInfoScience.getChem()+","+marksInfoScience.getBio()+","
                        +marksInfoScience.getIct()+",'"+ AdminController.select.getRoll()+"','"+
                        AdminController.select.getReg()+"','"+marksInfoScience.getBanM()+
                        "','"+marksInfoScience.getEngM()+"','"+marksInfoScience.getHmM()+
                        "','"+marksInfoScience.getPhyM()+"','"+marksInfoScience.getChemM()+
                        "','"+marksInfoScience.getBioM()+"','"+marksInfoScience.getIctM()+"',"
                        +marksInfoScience.getFinalGpa()+",'"+marksInfoScience.getFinalGrade()+"');" ;
                statement.execute(q);

            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean insertScienceMarkshsc(MarksInfoScience marksInfoScience){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "INSERT INTO user17 VALUE ("+marksInfoScience.getBan()+","+marksInfoScience.getEng()+","
                    +marksInfoScience.getHm()+","+marksInfoScience.getPhy()+","
                    +marksInfoScience.getChem()+","+marksInfoScience.getBio()+","+marksInfoScience.getIct()+",'"+marksInfoScience.getBan2()+","+marksInfoScience.getEng2()+","
                    +marksInfoScience.getHm2()+","+marksInfoScience.getPhy2()+","
                    +marksInfoScience.getChem2()+","+marksInfoScience.getBio2()+","
                    + HelloApplication.info.getRoll()+"','"+
                    HelloApplication.info.getReg()+"','"+marksInfoScience.getBanM()+
                    "','"+marksInfoScience.getEngM()+"','"+marksInfoScience.getHmM()+
                    "','"+marksInfoScience.getPhyM()+"','"+marksInfoScience.getChemM()+
                    "','"+marksInfoScience.getBioM()+"','"+marksInfoScience.getIctM()+"','"+marksInfoScience.getBan2M()+
                    "','"+marksInfoScience.getEng2M()+"','"+marksInfoScience.getHm2M()+
                    "','"+marksInfoScience.getPhy2M()+"','"+marksInfoScience.getChem2M()+
                    "','"+marksInfoScience.getBio2M()+"','"+marksInfoScience.getFinalGrade()+
                    "',"+marksInfoScience.getFinalGpa()+");" ;
            statement.execute(q);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }


    public StudentInfo result(String board,String year){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "SELECT * FROM user4 WHERE board = '"+board+"' and year= '"+year+"';";
            ResultSet resultSet = statement.executeQuery(q);
            while (resultSet.next()) {
                String boardType = resultSet.getString("board");
                String yearType = resultSet.getString("year");
                return new StudentInfo(yearType,boardType);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
      return null;
    }
    public String sub(){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "SELECT * FROM user13 ;";
            ResultSet resultSet = statement.executeQuery(q);
            while (resultSet.next()) {
                String subject = resultSet.getString("subject");
               return subject;

            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public MarksInfoScience resultGet(String roll,String reg){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "SELECT * FROM user11 WHERE roll = '"+roll+"' and reg= '"+reg+"';";
            ResultSet resultSet = statement.executeQuery(q);
            while (resultSet.next()) {
                double banT = resultSet.getDouble("bangla");
                double engT = resultSet.getDouble("eng");
                double phyT = resultSet.getDouble("phy");
                double chemT = resultSet.getDouble("chem");
                double hmT = resultSet.getDouble("hm");
                double gpa = resultSet.getDouble("finalGpa");
                String grade = resultSet.getString("finalGrade");

                return new MarksInfoScience(grade,gpa,banT,engT,hmT,phyT,chemT);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public StudentInfo getInfo(String roll,String reg){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "SELECT * FROM user4 WHERE roll = '"+roll+"' and reg= '"+reg+"';";
            ResultSet resultSet = statement.executeQuery(q);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String fname = resultSet.getString("father");
                String mname = resultSet.getString("mother");
                String rollN = resultSet.getString("roll");
                String regN = resultSet.getString("reg");
                String group = resultSet.getString("gr");
                String board = resultSet.getString("board");
                String year = resultSet.getString("year");
                return new StudentInfo(name,fname,mname,group,rollN,board,year,reg);

            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }


    //AdminController
    //******change database
    public List<StudentInfo> getlist(){
        List<StudentInfo> studentInfosList = new ArrayList<>();
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "SELECT * FROM user4 ;";
            ResultSet resultSet = statement.executeQuery(q);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String rollN = resultSet.getString("roll");
                String regN = resultSet.getString("reg");
                String group = resultSet.getString("gr");
                String examN = resultSet.getString("exam");
                StudentInfo studentInfo = new StudentInfo(name,group,rollN,regN,examN);
                studentInfosList.add(studentInfo);

            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return studentInfosList;
    }
    // SSSC
    public List<MarksInfoScience> getNumberlist(String roll,String reg){
        List<MarksInfoScience> subjectList = new ArrayList<>();
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "SELECT * FROM user15 where roll = '"+roll+"'and reg ='"+reg+"';";
            ResultSet resultSet = statement.executeQuery(q);
            while (resultSet.next()) {
                String subject = resultSet.getString("subject");
                String grade = resultSet.getString("grade");
                double marks = resultSet.getDouble("marks");
               MarksInfoScience marksInfoScience = new MarksInfoScience(subject,marks,grade);
               subjectList.add(marksInfoScience);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return subjectList;
    }
    //admincontroller delete
    public boolean deleteuser4(String roll){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "delete from user4 where roll = '"+roll+"';" ;
            statement.execute(q);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteuser11(String roll){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "delete from user11 where roll = '"+roll+"';" ;
            statement.execute(q);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteuser15(String roll){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "delete from user15 where roll = '"+roll+"';" ;
            statement.execute(q);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertseu(Versity v){
        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "Insert Into seu value ('"+v.getYear()+"',"+v.getTotalgpa()+");" ;
            statement.execute(q);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    //VPRIUC
    public Versity getreqlist(String roll){

        try{
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();
            String q = "SELECT * FROM seu where year='"+roll+"';";
            ResultSet resultSet = statement.executeQuery(q);
            while (resultSet.next()) {
                String year = resultSet.getString("year");
                double gpa = resultSet.getDouble("totalgpa");
                String regN = resultSet.getString("reg");
                String group = resultSet.getString("gr");
                String examN = resultSet.getString("exam");
                Versity p = new Versity(year,gpa);
                return p;

            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}
//create table user16(ban double,eng double,hm double,phy double
// ,chem double,bio double,ict double,ban2 double,eng2 double,hm2 double,phy2 double
// ,chem2 double,bio2 double,roll varchar(20),reg varchar(20),banM varchar(20)
// ,engM varchar(20),hmM varchar(20),phyM varchar(20),chemM varchar(20),bioM varchar(20),ictM varchar(20),ban2M varchar(20),eng2M varchar(20),hm2M varchar(20),phy2M varchar(20),chem2M varchar(20),bio2M varchar(20),fgra varchar(20),fgpa double);
// public MarksInfoScience resultGetGrAndGpa(String grade,double gpa){
//        try{
//            Connection connection = ConnectionSingleton.getConnection();
//            Statement statement = connection.createStatement();
//            String q = "SELECT * FROM user11 WHERE finalGpa = '"+gpa+"' and finalGrade= '"+grade+"';";
//            ResultSet resultSet = statement.executeQuery(q);
//            while (resultSet.next()) {
//                double finalGpa = resultSet.getDouble("finalGpa");
//                double finalGrade = resultSet.getDouble("finalGrade");
//
//                return new MarksInfoScience(finalGrade,finalGpa);
//            }
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        return null;
//    }