package tr.edu.medipol.ilerijavafinal.ilerijavafinal.data;

import lombok.Data;
import java.sql.Date;


@Data
public class MisafirDTO {
    private String misafirAd;
    private Integer yas;
    private Double kilo;
    private Date gelisTarihi;
    private String notlar;
}
