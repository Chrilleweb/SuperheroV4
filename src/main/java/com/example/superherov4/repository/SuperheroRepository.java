package com.example.superherov4.repository;

import com.example.superherov4.SuperheroV4Application;
import com.example.superherov4.dto.CityHeroDTO;
import com.example.superherov4.dto.GetHeroNameDTO;
import com.example.superherov4.model.Superhero;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheroRepository {

    @Value("${spring.datasource.url}")
    private String db_url;

    @Value("${spring.datasource.username}")
    private String uid;

    @Value("${spring.datasource.password}")
    private String pwd;

    public List<Superhero> getSuperhero() {
        List<Superhero> superheroes = new ArrayList<Superhero>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhelte", "superhelteDB", "1234")) {
            String SQL = "SELECT * FROM superhero;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                String heroName = rs.getString("heroName");
                String realName = rs.getString("realName");
                int creationYear = rs.getInt("creationYear");
                String superpowerName = rs.getString("superpowerName");
                String cityName = rs.getString("cityName");
                superheroes.add(new Superhero(heroName, realName, superpowerName, creationYear, cityName));
            }
            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<CityHeroDTO> getSuperheroNameAndCity() {
        List<CityHeroDTO> cityAndHero = new ArrayList<CityHeroDTO>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhelte", "superhelteDB", "1234")) {
            String SQL = "SELECT heroName, cityName FROM superhero;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                String heroName = rs.getString("heroName");
                String cityName = rs.getString("cityName");
                cityAndHero.add(new CityHeroDTO(heroName, cityName));
            }
            return cityAndHero;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<GetHeroNameDTO> getNameRealCreation() {
        List<GetHeroNameDTO> getHeroNameDTOS = new ArrayList<GetHeroNameDTO>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhelte", "superhelteDB", "1234")) {
            String SQL = "SELECT heroName, realName, creationYear FROM superhero;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                String heroName = rs.getString("heroName");
                String realName = rs.getString("realName");
                int creationYear = rs.getInt("creationYear");
                getHeroNameDTOS.add(new GetHeroNameDTO(heroName, realName, creationYear));
            }
            return getHeroNameDTOS;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public GetHeroNameDTO getsuperheroByName(String superhero) {
        GetHeroNameDTO superhero1 = null;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhelte", "superhelteDB", "1234")) {
            String SQL = "SELECT heroName, realName, creationYear FROM superhero WHERE heroName =?;";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.setString(1, superhero);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String heroName = rs.getString("heroName");
                String realName = rs.getString("realName");
                int creationYear = rs.getInt("creationYear");
                superhero1 = (new GetHeroNameDTO(heroName, realName, creationYear));
            }
            return superhero1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public CityHeroDTO getCityByName(String superhero) {
        CityHeroDTO superhero1 = null;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhelte", "superhelteDB", "1234")) {
            String SQL = "SELECT heroName, cityName FROM superhero WHERE heroName =?;";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.setString(1, superhero);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String heroName = rs.getString("heroName");
                String cityName = rs.getString("cityName");
                superhero1 = (new CityHeroDTO(heroName, cityName));
            }
            return superhero1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}









