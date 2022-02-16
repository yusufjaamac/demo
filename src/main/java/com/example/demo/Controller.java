package com.example.demo;
import java.util.concurrent.atomic.AtomicLong;
import com.example.demo.AddressBook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//yj
@RestController
public class Controller {


    private final AtomicLong counter = new AtomicLong();

    public AddressBook addressBook(){
        AddressBook mybook = new AddressBook(counter.incrementAndGet());
        return mybook;
    }

    @GetMapping("/greeting")
    public  String addMyBuddy(@RequestParam(value = "name", defaultValue = "noName") String name,@RequestParam(value = "number")String number) {
        return("");
    }
}
