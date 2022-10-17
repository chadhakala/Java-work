public class Book {
        private int pageCount;
        private String author;
        private String genre;

        public Book(int pageCount, String author, String genre) {
            this.pageCount = pageCount;
            this.author = author;
            this.genre = genre;
        }

        public int getPageCount() {
            return pageCount;
        }
        public String getAuthor() {
            return author;
        }
        public String getGenre() {
            return genre;
        }
}
