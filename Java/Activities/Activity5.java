package daytwo;

abstract class Book {
    String title;
    abstract void setTitle(String s);
        String getTitle() {
        return title;
    }
}

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "Hover Car Racer";
        Book newNovel = new MyBook();
        newNovel.setTitle(title);
        
        System.out.println("The title is: " + newNovel.getTitle());
	}

}