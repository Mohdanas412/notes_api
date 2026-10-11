package notes_api.entity;

public class Note {
    private Long id;
    private String title;
    private String content;
    private boolean pinned;

    public Note() {

    }

    public Note(Long id,String title,String content,boolean pinned) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.pinned = pinned;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }
    
}