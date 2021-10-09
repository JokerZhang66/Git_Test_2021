public class Person {
    IReader reader;
    Imaterial imaterial;
    public void tell_story(IReader reader,Imaterial imaterial)
    {
        reader.narrate(imaterial);
    }
}
