package app.controllers;

import app.models.Dress;
import app.services.DressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DressController {

    @Autowired
    private DressService dressService;

    @GetMapping("/dresses")
    public List<Dress> home(Model model) {
        List<Dress> findAll = dressService.findAll();
        model.addAttribute("findAll", findAll);

        return findAll;
    }

    @DeleteMapping("/dresses/$id")
    public void delete(int id){
        //TODO: delete
    }


}
