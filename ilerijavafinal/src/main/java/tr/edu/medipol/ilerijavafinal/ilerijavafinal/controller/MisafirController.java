package tr.edu.medipol.ilerijavafinal.ilerijavafinal.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.ilerijavafinal.ilerijavafinal.data.MisafirDTO;
import tr.edu.medipol.ilerijavafinal.ilerijavafinal.entity.Misafir;
import tr.edu.medipol.ilerijavafinal.ilerijavafinal.service.MisafirServiceImpl;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;


@RestController
public class MisafirController {

    Logger logger = LoggerFactory.getLogger(MisafirController.class);
    @Autowired
    MisafirServiceImpl misafirServiceImpl;


    @PostMapping("/ekle")
    private void ekle(@RequestBody MisafirDTO misafirDTO){
        logger.info("Ekleme servisi çağrıldı !");
        // kilo format
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#.0", symbols);
        String formattedKilo = decimalFormat.format(misafirDTO.getKilo());
        formattedKilo = formattedKilo.replace(",", ".");
        misafirDTO.setKilo(Double.parseDouble(formattedKilo));

        misafirServiceImpl.ekle(misafirDTO);
    }

    @GetMapping("/getir/{id}")
    private Misafir getir(@PathVariable Long id){
        logger.info("Getir servisi çağrıldı !");
        return misafirServiceImpl.getir(id);
    }

    @DeleteMapping("/sil/{id}")
    private String sil(@PathVariable Long id)
    {
        logger.info("Sil servisi çağrıldı !");

        return misafirServiceImpl.sil(id);
    }

    @PutMapping("/guncelle/{id}")
    private Misafir guncelle(@PathVariable Long id,@RequestBody MisafirDTO misafirDTO)
    {
        logger.info("Güncelleme servisi çağrıldı !");
        // kilo format
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#.0", symbols);
        String formattedKilo = decimalFormat.format(misafirDTO.getKilo());
        formattedKilo = formattedKilo.replace(",", ".");
        misafirDTO.setKilo(Double.parseDouble(formattedKilo));

        return misafirServiceImpl.guncelle(id,misafirDTO);
    }

    @GetMapping("/listele")
    private List<Misafir> listele(){
        logger.info("Listele servisi çağrıldı !");
        return misafirServiceImpl.listele();
    }
}
