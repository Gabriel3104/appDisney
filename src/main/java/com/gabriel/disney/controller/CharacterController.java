package com.gabriel.disney.controller;


import com.gabriel.disney.entities.Character;
import com.gabriel.disney.entities.dto.CharacterDTO;
import com.gabriel.disney.services.CharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CharacterController {

    private final CharacterService service;

    public CharacterController(CharacterService service) {
        this.service = service;
    }

    @PostMapping("/characters")
    public ResponseEntity<Character> addCharacter(@RequestBody CharacterDTO characterDTO){
        return new ResponseEntity<>(service.addCharacter(characterDTO), HttpStatus.CREATED);
    }
}
