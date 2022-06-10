package com.gabriel.disney.controller;


import com.gabriel.disney.entities.Character;
import com.gabriel.disney.entities.dto.CharacterDTO;
import com.gabriel.disney.services.CharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/characters")
public class CharacterController {

    private final CharacterService service;

    public CharacterController(CharacterService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Character> addCharacter(@RequestBody CharacterDTO characterDTO){
        return new ResponseEntity<>(service.addCharacter(characterDTO), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Character> updateCharacter(@RequestBody CharacterDTO characterDTO){
        Character character = service.updateCharacter(characterDTO);
        return new ResponseEntity<>(character,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCharacter(@PathVariable Long id) {
        service.deleteCharacter(id);
        return new ResponseEntity<>("Message: success", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Character>> getAllCharacters(){
        List<Character> character = service.getAllCharacters();
        return new ResponseEntity<>(character,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Character> getCharacterById(@PathVariable Long id){
        Character character = service.getCharacterById(id);
        return new ResponseEntity<>(character,HttpStatus.OK);
    }

}
