package com.example.demo.newcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Studententity;
import com.example.demo.newservice.NewfileService;


@RestController
public class Newcontroller {

    @Autowired
    Studentservice src;

    @PostMapping("/post")
    public Studententity postdata(@RequestBody Studententity new) {
        return src.savedata(st);
    }

    @GetMapping("/get")
    public List<Studententityy> getdata() {
        return src.retdata();
    }

    @GetMapping("/getid/{id}")
    public Studententity getIdValue(@PathVariable Long id) {
        return src.id(id);
    }
    @PutMapping("/update/{id}")
    public Studententity putdata(@PathVariable Long id,@RequestBody Studententity new){
        return src.retputdata(id,new);
    }
    @DeleteMapping("/delete/{id}")
    public Studententity deletedata(@PathVariable long id){
        return src.retdeldata(id);
    }


}