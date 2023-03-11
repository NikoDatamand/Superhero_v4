package kea.project.superhero_v4.Repositories;

import kea.project.superhero_v4.Models.Superhero;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Repository_DB implements IRepositoryInterface {

    @Value("${spring.datasource.url}")
    private String db_url;

    @Value("${spring.datasource.username}")
    private String uid;

    @Value("${spring.datasource.password}")
    private String pwd;

    @Override
    public List<Superhero> getAllCreationYear(){

        List<Superhero> superheroes = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(db_url, uid, pwd);
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM SUPERHEROES");
            ResultSet results = pstmt.executeQuery();
            if (results.next()){
                System.out.println("ble");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public List<Superhero> getSpecificCreationYear(String heroname){
        return null;
    }

    @Override
    public List<Superhero> getAllSuperpowersAmount() {
        return null;
    }

    @Override
    public List<Superhero> getSpecificSuperpowersAmount(String heroname){
        return null;
    }

    @Override
    public List<Superhero> getAllSuperpowers(){
        return null;
    }

    @Override
    public List<Superhero> getSpecificSuperpowers(String heroname){
        return null;
    }

    @Override
    public List<Superhero> getAllCity(){
        return null;
    }

    @Override
    public List<Superhero> getSpecificCity(String heroname){
        return null;
    }

    /*
    public String getMySQL(){
        try(Connection con = DriverManager.getConnection()) {
            String SQL = "SELECT * FROM SUPERHEROES WHERE HERO_ID = ?";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.setInt(1,1);
            ResultSet result = pstmt.executeQuery();
            if (result.next());{
                System.out.println(result.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "";
    } */
}
