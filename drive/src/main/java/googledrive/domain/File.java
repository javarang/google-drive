package googledrive.domain;

import googledrive.DriveApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="File_table")
@Data

public class File  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private String type;


    public static FileRepository repository(){
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(FileRepository.class);
        return fileRepository;
    }






}
