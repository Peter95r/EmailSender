package com.example.email;

public class EmailUnit {

    private String to = "email"; // trzeba podać email
    private String subject = "Test";
    private String text = "This is a test email.";


    public String getSubject() {
      return this.subject;
    }
    public String getText() {
      return this.text;
    }
    public String getTo() {
      return this.to;
    }

}
