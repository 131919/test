package com.goshen.maven.domin;

/**
 * Created by Lenovo on 2019/11/6.
 *
 * @Author: LDH
 * @date:2019/11/6 18:45
 */
public class Person {

    private String uid;
    private String username;
    private String password;
    private String email;
    private  int leven;
    private String code;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLeven() {
        return leven;
    }

    public void setLeven(int leven) {
        this.leven = leven;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Person{" +
                "uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", leven=" + leven +
                ", code='" + code + '\'' +
                '}';
    }
}
