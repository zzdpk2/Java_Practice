package InterfaceAsVars;

public class Entrance {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("Aixi");

//        hero.setSkill(new SkillImpl());
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia~pia~pia~");
//            }
//        };
//        hero.setSkill(skill);
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Pia~pia~pia~");
            }
        });
        hero.attack();
    }

}
