package cn.wq.kgdxkj.model;

/**
 * @program: SpringBoot_Demo
 * @description: 用户实体类
 * @author: Mr.Wu
 * @create: 2019-02-13 09:38
 **/
public class User {
    private Integer userid;

    private String username;

    private String password;

    private String phone;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}
