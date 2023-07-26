package tr.edu.medipol.ilerijavafinal.ilerijavafinal.service;


import tr.edu.medipol.ilerijavafinal.ilerijavafinal.data.MisafirDTO;
import tr.edu.medipol.ilerijavafinal.ilerijavafinal.entity.Misafir;

import java.util.List;

public interface MisafirService {
    Misafir ekle(MisafirDTO misafirDTO);
    List<Misafir> listele();
    Misafir getir(Long id);
    String sil(Long id);
    Misafir guncelle(Long id,MisafirDTO misafirDTO);


}
