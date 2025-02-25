package com.example.PatronesKube.controller.dto;


import com.example.PatronesKube.bd.orm.CriticaORM;

import java.time.LocalDateTime;
import java.util.List;

public record JuegoDTO(Long id, String nombre, LocalDateTime fechaLanzamiento, String desarrollador, List<CriticaORM> criticas, String destinatario) {
}
