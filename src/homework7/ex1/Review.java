package homework7.ex1;

import java.time.LocalDateTime;

public class Review {
    private int id;
    private String text;
    private int countLikes;
    private LocalDateTime dateTime;

    public Review(int id, String text, int countLikes, LocalDateTime dateTime) {
        this.id = id;
        this.text = text;
        this.countLikes = countLikes;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", countLikes=" + countLikes +
                ", dateTime=" + dateTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getCountLikes() {
        return countLikes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}