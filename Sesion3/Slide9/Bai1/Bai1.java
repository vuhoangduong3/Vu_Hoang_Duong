package Bai1;
import java.util.ArrayList;
class Book{
    private String bookName;
    private ArrayList<Chapter> chapters;
    public Book(String bookName){
        this.bookName = bookName;
        chapters = new ArrayList<Chapter>();
    }
    public void addChapter(Chapter c){
        chapters.add(c);
    }
    public void removeChapter(Chapter c){
        chapters.remove(c);
    }
    public void print(){
        System.out.println("Book name: " + bookName);
        for (Chapter c : chapters){
            c.print();
        }
    }
    public int countChapter(){
        return chapters.size();
    }
    public int countPage(){
        int count = 0;
        for (Chapter c : chapters){
            count += c.countPage();
        }
        return count;
    }
}
class Chapter{
    private String chapterName;
    private ArrayList<Page> pages;
    public Chapter(String chapterName){
        this.chapterName = chapterName;
        pages = new ArrayList<Page>();
    }
    public void addPage(Page p){
        pages.add(p);
    }
    public void removePage(Page p){
        pages.remove(p);
    }
    public void print(){
        System.out.println("Chapter name: " + chapterName);
        for (Page p : pages){
            p.print();
        }
    }
    public int countPage(){
        return pages.size();
    }
}
class Page{
    private int pageNumber;
    private String content;
    public Page(String content){
        this.content = content;
    }
    public void print(){
        System.out.println("Page number: " + pageNumber);
        System.out.println("Content: " + content);

    }
}
