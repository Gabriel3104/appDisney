package com.gabriel.disney.services;

import com.gabriel.disney.entities.Character;
import com.gabriel.disney.entities.dto.CharacterDTO;
import com.gabriel.disney.repository.CharacterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    private final CharacterRepository repository;
    private final ModelMapper modelMapper;

    public CharacterService(CharacterRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public Character addCharacter(CharacterDTO characterDTO){
        Character character= modelMapper.map(characterDTO,Character.class);
        return repository.save(character);
    }
}
