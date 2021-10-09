public class Father implements IReader{
    @Override
    public void narrate(Imaterial imaterial) {
        System.out.println("爸爸开始讲故事");
        System.out.println(imaterial.getContent());
    }
}
