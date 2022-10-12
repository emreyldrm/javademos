import kodlamaioWithNLayeredApp.business.CourseManager;
import kodlamaioWithNLayeredApp.core.logging.DatabaseLogger;
import kodlamaioWithNLayeredApp.core.logging.FileLogger;
import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.core.logging.MailLogger;
import kodlamaioWithNLayeredApp.dataAccess.HibernateCourseDao;
import kodlamaioWithNLayeredApp.dataAccess.JdbcCourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course(1,"Java Yazılım Geliştirme Kampı",
                23.90,"Back-End","Engin Demiroğ");
        Course course2 = new Course(2,"C# Yazılım Geliştirme Kampı",
                25,"Front-End","Engin Demiroğ");
       /* Course course3 = new Course(3,"Javascript Yazılım Geliştirme Kampı",
                29.90,"Front-End","Engin Demiroğ");*/     //burada aynı kategori hatası veriyor.
        /*Course course4 = new Course(4,"Java Yazılım Geliştirme Kampı",
                0,"Ders Notları","Emre Yıldırım");*/     // burada aynı kurs hatası veriyor.
        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course1);
        courseManager.add(course2);
        //courseManager.add(course3);
        //courseManager.add(course4);


    }
}