package googledrive.domain;

import googledrive.IndexerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Index_table")
@Data

public class Index  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;


    public static IndexRepository repository(){
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(IndexRepository.class);
        return indexRepository;
    }






}
