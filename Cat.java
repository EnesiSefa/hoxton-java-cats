public class Cat {
    public String name;
    public Integer age;
    public boolean likesCuddles;

    public Cat(String name, Integer age, boolean likesCuddles) {
        this.name = name;
        this.age = age;
        this.likesCuddles = likesCuddles;

    }

    void showBookInfo() {
        if (likesCuddles) {
            System.out.printf("This is %s, who is %s year(s) old. %s  loves cuddles!", this.name,
                    this.age,this.name);
        } else {
            System.out.printf("This is %s, who is %s year(s) old. %s doesnt like cuddles!", this.name,
                    this.age,this.name );
        }

    }
}
