package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoProceesed extends AbstractEvent {

    private Long id;

    public VideoProceesed(Video aggregate){
        super(aggregate);
    }
    public VideoProceesed(){
        super();
    }
}
