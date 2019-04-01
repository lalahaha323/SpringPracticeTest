package sia.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Knight.xml");
        Knight knight = context.getBean(BraveKnight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
