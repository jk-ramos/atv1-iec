package br.com.fatec.atv1.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class NomeControllerTest {
    private final NomeController NomeController = new NomeController();

    @Test
    void getMyName(){
        String name = NomeController.retornaNome();
        assertEquals ("Jaquelaine Ramos", name);
    }
}