public enum GenreType {

    THRILLER("Exciting"),
    HORROR("Scary"),
    ROMANCE("Romantic"),
    CRIME("Mysterious"),
    FANTASY("Imaginative");

    private final String description;

    GenreType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    }
