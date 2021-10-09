class Mother implements IReader{
    @Override
    public void narrate(Imaterial imaterial) {
        System.out.println("妈妈开始讲故事");
        System.out.println(imaterial.getContent());
    }
}
