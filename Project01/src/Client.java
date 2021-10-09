public class Client{
    public static void main(String[] args){
        Person person = new Person();
        person.tell_story(new Mother(),new Book());
        person.tell_story(new Father(), new Newspaper());
        person.tell_story(new Mother(),new Newspaper());
        person.tell_story(new Father(), new Book());
    }
}
