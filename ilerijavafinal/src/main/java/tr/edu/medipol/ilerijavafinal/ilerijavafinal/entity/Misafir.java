package tr.edu.medipol.ilerijavafinal.ilerijavafinal.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date; // sadece tarihi tutar


@Entity
@Data
public class Misafir {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String misafirAd;
    private Integer yas;
    private Double kilo;
    private Date gelisTarihi;
    private String notlar;

}
