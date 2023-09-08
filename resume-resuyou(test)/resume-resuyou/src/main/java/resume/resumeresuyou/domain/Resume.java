package resume.resumeresuyou.domain;

public class Resume {

    private Long id;
    private String newresume;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResume() {
        return newresume;
    }

    public void setResume(String newresume) {
        this.newresume = newresume;
    }
}
