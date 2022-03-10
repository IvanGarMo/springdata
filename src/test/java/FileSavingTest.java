
import com.aprendiendospring.jpa.course.CourseApplication;
import com.aprendiendospring.jpa.course.Image;
import com.aprendiendospring.jpa.course.ImageRepository;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IvanGarMo
 */
@SpringBootTest(classes=CourseApplication.class)
@Slf4j
public class FileSavingTest {
    @Autowired
    ImageRepository fileRepo;
    
//    @Test
//    public void testSaving() {
//        Image image = new Image();
//        image.setId(1L);
//        image.setName("Header-Hero.jpg");
//        
//        File file = new File("C:\\Users\\Han-S\\Desktop\\Header-Hero.jpg");
//        byte[] fileContents = new byte[(int)file.length()];
//        try {
//            FileInputStream fis = new FileInputStream(file);
//            fis.read(fileContents);
//            image.setFile(fileContents);    
//        } catch(IOException ex) {
//            log.info("Exception: "+ex.toString());
//            return;
//        }
//        fileRepo.save(image);
//    }
    
    @Test
    public void testReading() {
        Image image = fileRepo.findById(1L).get();
        File file = new File("C:\\Users\\Han-S\\Desktop\\ImageTest\\"+image.getName());
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(image.getFile());
        } catch(Exception ex) {
            log.info("Exception: "+ex.toString());
        }
    }
}
