package kodlamaioWithNLayeredApp.business;

import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAccess.CourseDao;
import kodlamaioWithNLayeredApp.dataAccess.HibernateCourseDao;
import kodlamaioWithNLayeredApp.dataAccess.JdbcCourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

import java.util.List;
import java.util.ArrayList;
public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    List<String> categoryList = new ArrayList<String>();
    List<String> courseList = new ArrayList<String>();

    public void add(Course course) throws Exception {
        //iş kuralları
        if(course.getCoursePrice()<0){
            throw new Exception("Kurs fiyatı 0 dan küçük olamaz.");
        }
        if(categoryList.contains(course.getCategoryName()) || courseList.contains(course.getCourseName())){
            throw new Exception("Kategori ve Kurs Adı tekrarlanamaz.");
        }
        categoryList.add(course.getCategoryName());
        courseList.add(course.getCourseName());
        courseDao.add(course);

        for(Logger logger: loggers){//[db,file,mail]
            logger.log(course.getCourseName());
        }

    }
}
