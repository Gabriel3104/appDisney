package com.gabriel.disney.services;

import com.gabriel.disney.entities.Character;
import com.gabriel.disney.entities.dto.CharacterDTO;
import com.gabriel.disney.repository.CharacterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    private final CharacterRepository repository;
    private final ModelMapper modelMapper;

    public CharacterService(CharacterRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public Character addCharacter(CharacterDTO characterDTO) {
        Character character = modelMapper.map(characterDTO, Character.class);
        return repository.save(character);
    }

    public Character updateCharacter(CharacterDTO characterDTO) {

        Optional<Character> optionalCharacter = repository.findById(characterDTO.getId());
        if (optionalCharacter.isPresent()) {
            Character character = optionalCharacter.get();
            character.setName(characterDTO.getName());
            character.setAge(characterDTO.getAge());
            character.setWeight(characterDTO.getWeight());
            character.setHistory(characterDTO.getHistory());
            character.setAssociatedMovie(characterDTO.getAssociatedMovie());

            return repository.save(character);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontro el personaje con id " + characterDTO.getId());
        }

    }

    public void deleteCharacter(Long id) {
        Optional<Character> optionalCharacter = repository.findById(id);
        if (optionalCharacter.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontro el personaje con id " + id);
        }

    }

    public List<Character> getAllCharacters() {
        return repository.findAll();
    }

    public Character getCharacterById(Long id) {
        Optional<Character> optionalCharacter = repository.findById(id);
        Character character;
        if (optionalCharacter.isPresent()) {
            character = optionalCharacter.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontro el personaje con el id " + id);
        }
        return character;

    }
}
