package homework7.ex1;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 1, 25, 16, 37);
        LocalDateTime dateTime2 = LocalDateTime.of(2024, 1, 25, 13, 37);
        LocalDateTime dateTime3 = LocalDateTime.of(2024, 1, 25, 13, 37);

        Review review1 = new Review(2, "Так себе товар", 100, dateTime1);
        Review review2 = new Review(3, "плохой товар", 100, dateTime2);
        Review review3 = new Review(1, "отличный товар", 200, dateTime3);

        Comparator<Review> comparator = (o1, o2) -> {
            //если количество лайков одинаково, то верни того, у кого дата более новая
            if (o1.getCountLikes() - o2.getCountLikes() == 0) {
                return o1.getDateTime().compareTo(o2.getDateTime());
            }
            //если количество лайков не одинаковое, то верни того, у кого больше лайков
            return o1.getCountLikes() - o2.getCountLikes();
        };

        TreeSet<Review> reviews = new TreeSet<>(comparator.reversed());
        reviews.add(review1);
        reviews.add(review2);
        reviews.add(review3);

        reviews.forEach(System.out::println);
    }
}