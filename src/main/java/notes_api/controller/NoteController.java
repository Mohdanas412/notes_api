package notes_api.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import notes_api.entity.Note;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final Map<Long, Note> notes = new HashMap<>();
    private Long nextId = 1L;

    @GetMapping
    public List<Note> getAllNotes() {
        return new ArrayList<>(notes.values());
    }
}