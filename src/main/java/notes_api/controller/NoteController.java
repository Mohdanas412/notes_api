package notes_api.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        note.setId(nextId);          // the server decides the id
        nextId++;                    // prepare the next one
        notes.put(note.getId(), note);   // store it, key = id
        return note;                 // Jackson turns it into JSON
    }
        @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return notes.get(id);   // null if the id doesn't exist
    }
}