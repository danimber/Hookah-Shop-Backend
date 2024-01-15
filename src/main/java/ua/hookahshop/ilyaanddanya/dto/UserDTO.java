package ua.hookahshop.ilyaanddanya.dto;

import lombok.Data;

@Data
public class UserDTO {

    private String userName;
    private String password;

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
