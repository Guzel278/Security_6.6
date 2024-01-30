package model;
import lombok.Data;

import javax.persistence.*;
@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private boolean active;
    private String roles;

    // Геттер для поля id
    public Long getId() {
        return id;
    }

    // Сеттер для поля id
    public void setId(Long id) {
        this.id = id;
    }

    // Геттер для поля username
    public String getUsername() {
        return username;
    }

    // Сеттер для поля username
    public void setUsername(String username) {
        this.username = username;
    }

    // Геттер для поля password
    public String getPassword() {
        return password;
    }

    // Сеттер для поля password
    public void setPassword(String password) {
        this.password = password;
    }
}
