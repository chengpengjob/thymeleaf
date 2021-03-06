package com.cp.thymeleaf;

/**
 * @author ChengPeng
 * @create 2020-03-31 9:30
 */
public class User {
    private Long id;
    private String name;
    private String address;

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ",name='" + name + '\'' +
                ",address='" + address + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
