package com.Sample.LibraryManagementSystem.Service;

import com.Sample.LibraryManagementSystem.Entity.Publisher;
import com.Sample.LibraryManagementSystem.Repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    @Autowired
    public PublisherRepository publisherRepository;
    public Publisher savePublisher(Publisher customer) {
        return publisherRepository.save(customer);
    }

    public Publisher updatePublisher(Publisher customer) {
        return publisherRepository.save(customer);
    }

    public List<Publisher> findAllPublishers() {
        return (List<Publisher>) publisherRepository.findAll();
    }

    public void deletePublisher(int id) {
        publisherRepository.deleteById(id);
    }
}

