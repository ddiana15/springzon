package com.antsrl.springzon.service;

import com.antsrl.springzon.entity.Description;
import com.antsrl.springzon.repository.DescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescriptionService {
    @Autowired
    private DescriptionRepository descriptionRepository;
    public List<Description> getAll(){
        return descriptionRepository.findAll();
    }
    public Description getBy(Long id){
        return descriptionRepository.findDescriptionById(id);
    }
    public Description add(Description description){
        return descriptionRepository.save(description);
    }
    public Description update(Description description, Long id){
        if (descriptionRepository.existsById(id)){
            description.setId(id);
            return descriptionRepository.save(description);
        }
        return descriptionRepository.findDescriptionById(id);
    }
    public void delete(Long id){
        Description description = descriptionRepository.findDescriptionById(id);
        descriptionRepository.delete(description);
    }
}
