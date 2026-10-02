package com.example.buymesomething.services;


import com.example.buymesomething.dto.UserDTO;
import com.example.buymesomething.entities.UserProfileEntity;
import com.example.buymesomething.repositories.RelationRepository;
import com.example.buymesomething.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private RelationRepository relationRepository;
    private ModelMapper mapper;

    public UserDTO saveProfile(UserDTO userDTO){
        UserProfileEntity userProfileEntity = userRepository.save(
               mapper.map(userDTO,UserProfileEntity.class)
        );
        //can face issue
        return mapper.map(userProfileEntity,UserDTO.class);
    }

//    public UserDTO  updateProfile(UserDTO userDTO){
//        UserProfileEntity userProfileEntity = userRepository.(
//                mapper.map(userDTO,UserProfileEntity.class)
//        );
//        //can face issue
//        return mapper.map(userProfileEntity,UserDTO.class);
    }



}
