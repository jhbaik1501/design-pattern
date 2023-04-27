package factory;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println(classname + " 클래스가 발견되지 않았습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);

    public Page createNaverPage() {
        Link link = createLink("Naver", "https://www.naver.com/");
        Page page = createPage("Naver", "Naver");
        page.add(link);
        return page;
    }
}
