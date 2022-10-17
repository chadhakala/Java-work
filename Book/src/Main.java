
public class Main {


    public class ANewEarth extends Main {

        private int pageCount;
        private String author;
        private String genre;

        public ANewEarth(int PageCount, String genre, String author) {
            this.pageCount = int pageCount;
            this.genre =  genre;
            this.author = author;



        //the first thing you have to do in a subclass constructor, is call
        // the superclass constructor (👉ﾟヮﾟ)👉
        super(pageCount, author, genre);
}



    public static void main(String[] args) {
        Book book1 = new Book(336, "Eckhart Tolle","Psychology Spirituality");

        System.out.println("One of my most favorite books i ever read is a new Earth - Awakening To Your Life's Purpose" );
        System.out.println("The book is " + book1.getPageCount() + " pages");
        System.out.println("It is in the genre " + book1.getGenre());
        System.out.println("And the author of the books name is " + book1.getAuthor());
        System.out.println("These are some of my favorite quotes from the book. I am using inheritance to save work\n" +
                        "So you can bet I googled and copy pasted these quotes; Prof Charnesky would otherwise say I might be \n" +
        "\"feeling bad right\" now if I had to do all that extra typing.");


        System.out.println("What a liberation to realize that the “voice in my head” is not who I am. Who am I then? \n" +
                "The one who sees that.");

        System.out.println("To recognize one's own insanity is, of course, the arising of sanity, the beginning of  \n" +
                "healing and transcendence.");
    }


