package com.Sample.LibraryManagementSystem.Controller;


import com.Sample.LibraryManagementSystem.Entity.Publisher;
import com.Sample.LibraryManagementSystem.Service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class PublisherController {

    @Autowired
    public PublisherService publisherService;


    @PostMapping(value = "savePublisher")
    public Publisher savePublisher(@RequestBody Publisher publisher){
        System.out.println("Publisher Saved!!");
        publisherService.savePublisher(publisher);
        return publisher;
    }

    @PutMapping(value = "updatePublisher")
    public Publisher updatePublisher(@RequestBody Publisher publisher){
        System.out.println("Publisher Saved!!");
        return publisherService.updatePublisher(publisher);

    }

    @GetMapping(value = "getAllPublisher")
    public List<Publisher> findAllPublisher(){
        return  publisherService.findAllPublishers();
    }

    @DeleteMapping("deletePublisher")
    public String deletePublisher(@RequestParam int id){
        publisherService.deletePublisher(id);
        return "Publisher Deleted!!";
    }
}
