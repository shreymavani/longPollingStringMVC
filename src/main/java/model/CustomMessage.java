package model;

import java.time.LocalDateTime;
public class CustomMessage {
    private int id;
    private String from,to;

    private LocalDateTime time;

    public void setId(int id){this.id = id;}
    public void setFrom(String from){this.from = from;}
    public void setTo(String to){this.to = to;}
    public void setCreatedAt(LocalDateTime time){this.time = time;}
    public int getId(){return id;}
    String getFrom(){return from;}
    String getTo(){return to;}
    LocalDateTime getCreatedAt(){return time;}

}
