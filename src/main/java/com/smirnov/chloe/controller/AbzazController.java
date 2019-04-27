package com.smirnov.chloe.controller;

import com.smirnov.chloe.entity.Abzaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.smirnov.chloe.repository.AbzazRepository;

@Controller
@RequestMapping("/abzaz")

public class AbzazController {
    @Autowired
    private AbzazRepository abzazRepository;

    @GetMapping("/add")
    public @ResponseBody String addNewAbzaz (@RequestParam String text) {

        Abzaz n = new Abzaz();
        n.setText(text);
        abzazRepository.save(n);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Abzaz> getAllAbzaz() {
        return abzazRepository.findAll();
    }

    @GetMapping("delete/{abzazId}")
    public @ResponseBody String deleteAbzaz (@PathVariable Integer abzazId){
        if(abzazRepository.existsById(abzazId)){
            abzazRepository.deleteById(abzazId);
            return("Abzaz had been deleted.");
        } else {
            return("This abzaz doesn't exist.");
        }

    }

    @GetMapping("delete/all")
    public @ResponseBody String deleteAllAbzaz (){
        abzazRepository.deleteAll();
        return ("All abzazs had been successfully deleted.");
    }
}
