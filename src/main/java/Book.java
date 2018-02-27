public class Book {

    private GenreType genre;

    public Book(GenreType genre) {
        this.genre = genre;
    }


    public String getGenreFromEnum(){
        String genreValue = GenreType.CRIME.getGenre();
        return this.genre.getGenre();
    }
}
