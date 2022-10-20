
 public class PictureBook extends Book {

     private int numberOfPictures;
     private String forKids;

     public PictureBook(int pageCount, String author, String genre, int numberOfPictures, String forKids) {
         super(pageCount, author, genre);
     }
     //the first thing you have to do in a subclass constructor, is call
     // the superclass constructor (👉ﾟヮﾟ)👉

     public int getNumberOfPictures() {
         return numberOfPictures;
     }

     public int numberOfPictures() {
         if (numberOfPictures >= 2) {
             System.out.println("this is not a childrens book");
         } else {
             numberOfPictures();
         }
         public String getForKids () {
             return forKids;
         }
         public void setForKids(String forKids);{
            forKids = forKids;
         }
     }
 }