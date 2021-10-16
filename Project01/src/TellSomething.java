public  class TellSomething { // 某人读某物
    IReader reader;
    Person person;
    public void Tell(Person person,IReader reader)
    {
        person.narrate(reader);
    }
}
