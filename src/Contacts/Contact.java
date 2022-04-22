package Contacts;

public class Contact {
    // fields
    private String name;

    private Long phoneNum;

    // constructor
    public Contact(String name, Long phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;

    }

//    public list showContacts(contactRoster){
//
//    }
}
