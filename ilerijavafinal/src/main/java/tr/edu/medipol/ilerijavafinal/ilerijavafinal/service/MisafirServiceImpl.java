package tr.edu.medipol.ilerijavafinal.ilerijavafinal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.edu.medipol.ilerijavafinal.ilerijavafinal.data.MisafirDTO;
import tr.edu.medipol.ilerijavafinal.ilerijavafinal.entity.Misafir;
import tr.edu.medipol.ilerijavafinal.ilerijavafinal.repo.MisafirRepository;

import java.util.List;

@Service
public class MisafirServiceImpl implements MisafirService {
    @Autowired
    MisafirRepository misafirRepository;
    @Override
    public Misafir ekle(MisafirDTO misafirDTO) {
        Misafir misafir = new Misafir();
        misafir.setMisafirAd(misafirDTO.getMisafirAd());
        misafir.setYas(misafirDTO.getYas());
        misafir.setKilo(misafirDTO.getKilo());
        misafir.setGelisTarihi(misafirDTO.getGelisTarihi());
        misafir.setNotlar(misafirDTO.getNotlar());
        misafirRepository.save(misafir);
        return misafir;
    }

    @Override
    public List<Misafir> listele() {
        return misafirRepository.findAll();
    }

    @Override
    public Misafir getir(Long id) {
            return misafirRepository.findById(id).get();
    }

    @Override
    public String sil(Long id) {

        if(misafirRepository.existsById(id))
        {
            misafirRepository.deleteById(id);
            return id+" nolu kayıt silindi.";
        }
        else {
            return id + " nolu kayıt bulunamadı.";
        }

    }

    @Override
    public Misafir guncelle(Long id, MisafirDTO misafirDTO) {
        Misafir misafir = getir(id);
        misafir.setMisafirAd(misafirDTO.getMisafirAd());
        misafir.setYas(misafirDTO.getYas());
        misafir.setKilo(misafirDTO.getKilo());
        misafir.setGelisTarihi(misafirDTO.getGelisTarihi());
        misafir.setNotlar(misafirDTO.getNotlar());
        misafirRepository.save(misafir);
        return misafir;
    }
}
