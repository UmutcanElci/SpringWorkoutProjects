package Kodlama.io.Devs.KodlamaOdev.entities.concretes;


public class Languages {
    private Integer id;
    private String languageName;

    public Languages() {
    }

    public Languages(Integer id, String languageName) {
        this.id = id;
        this.languageName = languageName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }


}
