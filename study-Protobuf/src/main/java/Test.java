public class Test {
    public static void main(String[] args){
        PersonMsg.Person.Builder builder = PersonMsg.Person.newBuilder();
        builder.addFriends("li cai zhen");
        builder.addFriends("li ye feng");
        builder.setEmail("5201314");
        builder.setId(1);
        builder.setName("ouhuihao");

        PersonMsg.Person person = builder.build();

        System.out.println(person.getEmail());
        System.out.println(person.getName());
        System.out.println(person.getFriendsCount());
        System.out.println(person.getFriendsList());

    }
}
