public enum GenreType {

    COMEDY("Funny"),
    HORROR("Scary"),
    CRIME("Mystery");

    private final String genre;

    GenreType(String genre){
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }
}
